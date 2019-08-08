/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import Adressen.Adres;
import Adressen.OntvangstAdres;
import Algemeen.Omschrijving;
import Bedrijven.BankRekeningNummer;
import Bedrijven.Vestiging;
import Bestellingen.Klant;
import Bestellingen.UitgaandeBestelling;
import Boekhouding.AlgemeneRekening;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.BoekhoudRekening;
import Boekhouding.Dagboek;
import Import.Import;
import Leveringen.Leverancier;
import Leveringen.LeveranciersGroep;
import Old.Boekhouding.Bankinstelling;
import Producten.ReceptProduct;
import enums.BtwCode;
import enums.Eenheid;
import enums.InhoudLeveringsbonnen;
import enums.Land;
import enums.LeveringsFrequenties;
import enums.MuntEenheid;
import enums.Solvabiliteit;
import enums.Taal;
import enums.VerpakkingsEenheid;
import enums.Webshop_API;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author stefa
 */
public class Mapper {

    //give old objects, get new objects.
    public static List<Bedrijven.Bedrijf> oldBedrijfToNewBedrijf() {
        List<Vestiging> newVestigingen;
        List<Bedrijven.Bedrijf> newBedrijven = new ArrayList();

        List<Old.Bedrijf.Bedrijf> oldBedrijven = Import.getBedrijven().stream().map(old -> (Old.Bedrijf.Bedrijf) old).collect(Collectors.toList());

        for (Old.Bedrijf.Bedrijf old : oldBedrijven) {
            newVestigingen = new ArrayList();

            Adres adres = new Adres(0, old.getStraat(), old.getHuisnummer(), "", old.getPostcode(), old.getWoonplaats(), Land.België);
            Bedrijven.Bedrijf bedrijf = new Bedrijven.Bedrijf(old.getId_bedrijf(), old.getNaam(), old.getTelefoonnummer(), old.getEmailadres(), adres, null);
            String bankcode = "";
            for (Old.Old bean : Import.getBankinstellingen()) {
                Bankinstelling instelling = (Bankinstelling) bean;
                if (instelling.getId_bank() == old.getId_bank()) {
                    bankcode = instelling.getBankcode();
                }
            }

            BankRekeningNummer bankRekeningNummer = new BankRekeningNummer(0, old.getIban(), bankcode);
            newVestigingen.add(new Vestiging(0, bedrijf, new Omschrijving(0, old.getNaam(), old.getNaam(), old.getNaam()), adres, old.getTelefoonnummer(), old.getEmailadres(), bankRekeningNummer, old.getOndernemingsnummer(), old.getVestigingsnummer()));
            bedrijf.setVestigingen(newVestigingen);
            newBedrijven.add(bedrijf);
        }

        return newBedrijven;
    }

    public static List<Bedrijven.Fabrikant> oldFabrikantToNewFabrikant() {
        List<Bedrijven.Fabrikant> newFabrikanten = new ArrayList();
        List<Old.Fabrikant> fabrikanten = Import.getFabrikanten().stream().map(old -> (Old.Fabrikant) old).collect(Collectors.toList());

        for (Old.Fabrikant bean : fabrikanten) {
            newFabrikanten.add(new Bedrijven.Fabrikant(bean.getId_fabrikant(), bean.getNaam()));
        }

        return newFabrikanten;
    }

    public static List<Adressen.OntvangstAdres> oldLeveringsAdresToOntvangstAdres() {
        List<OntvangstAdres> newOntvangstAdressen = new ArrayList();
        List<Old.Levering.Leveringsadres> leveringsadressen = Import.getLeveringsadressen().stream().map(old -> (Old.Levering.Leveringsadres) old).collect(Collectors.toList());

        for (Old.Levering.Leveringsadres bean : leveringsadressen) {
            newOntvangstAdressen.add(new OntvangstAdres(bean.getId_leveradres(), new Adres(0, bean.getStraat(), bean.getHuisnummer(), "", bean.getPostcode(), bean.getWoonplaats(), Land.België), bean.getRoepnaam(), bean.getTelefoonnummer()));
        }

        return newOntvangstAdressen;
    }

    public static List<Producten.ReceptProduct> oldReceptproductToNewReceptproduct() {
        List<Producten.ReceptProduct> newReceptproducten = new ArrayList();
        List<Old.Recept.Receptproduct> receptProducten = Import.getReceptproducten().stream().map(old -> (Old.Recept.Receptproduct) old).collect(Collectors.toList());

        for (Old.Recept.Receptproduct bean : receptProducten) {
            newReceptproducten.add(new ReceptProduct(bean.getId_receptproduct(), new Omschrijving(0, bean.getOmschrijvingn(), bean.getOmschrijvingf(), bean.getOmschrijvinge()), convertRecepteenheid(bean.getId_recepteenheid()),
                    false, bean.getVoorbereide_producten(), bean.getAfgewerkte_producten(), bean.getVerkoopproducten(), bean.getHulpstof(), bean.getMoet_gewogen_worden(), bean.getMaximaal_meetgewicht(), bean.getRelatieve_marge(), bean.getAbsolute_marge(), bean.getBlokkeren()));
        }
        return newReceptproducten;
    }

    public static List<Bestellingen.BestelVoorstel> oldBestelVoorstelToNewBestelVoorstel() {
        List<Bestellingen.BestelVoorstel> newBestelvoorstellen = new ArrayList();
        List<Old.Bestelling.Bestelvoorstel> bestellingen = Import.getBestelvoorstellen().stream().map(old -> (Old.Bestelling.Bestelvoorstel) old).collect(Collectors.toList());
        List<Producten.ReceptProduct> newReceptproducten = oldReceptproductToNewReceptproduct();

        for (Old.Bestelling.Bestelvoorstel bean : bestellingen) {
            Bedrijven.Bedrijf newBedrijf = oldBedrijfToNewBedrijf().stream().filter(bedrijf -> bedrijf.BedrijfId == bean.getId_bedrijf()).findFirst().get();

            Producten.ReceptProduct receptProduct = newReceptproducten.stream().filter(recep -> {
                return recep.getId() == bean.getId_receptproduct();
            }).findFirst().orElse(new ReceptProduct());

            Adressen.OntvangstAdres adres = oldLeveringsAdresToOntvangstAdres().stream().filter(adr -> {
                return adr.getId() == bean.getId_leveradres();
            }).findFirst().get();

            newBestelvoorstellen.add(new Bestellingen.BestelVoorstel(0, newBedrijf.Vestigingen.get(0), adres, receptProduct));
        }
        return newBestelvoorstellen;
    }

    public static List<Bestellingen.Bestelbon> oldBestelbonHoofdingToNewBestelbon() {
        List<Bestellingen.Bestelbon> newBestelbonnen = new ArrayList();

        List<Old.Bestelling.BestelbonHoofding> bestelbonnenhoofding = Import.getBestelbonnenhoofding().stream().map(old -> (Old.Bestelling.BestelbonHoofding) old).collect(Collectors.toList());

        for (Old.Bestelling.BestelbonHoofding hoofding : bestelbonnenhoofding) {
            Bedrijven.Vestiging vestiging = oldBedrijfToNewBedrijf().stream().filter(e -> e.getBedrijfId() == hoofding.getId_bedrijf()).findFirst().get().Vestigingen.get(0);
            Adressen.OntvangstAdres ontvangstAdres = oldLeveringsAdresToOntvangstAdres().stream().filter(e -> e.getId() == hoofding.getId_leveradres()).findFirst().get();
            newBestelbonnen.add(new Bestellingen.Bestelbon(hoofding.getId_bestelbon(), vestiging, ontvangstAdres));
        }

        return newBestelbonnen;
    }

    public static List<Bestellingen.UitgaandeBestelling> oldBestelbonDetailsToNewUitgaandeBestelling() {
        List<Bestellingen.UitgaandeBestelling> newUitgaandeBestelling = new ArrayList();
        List<Old.Bestelling.BestelbonDetail> bestelbonnendetails = Import.getBestelbonnendetail().stream().map(old -> (Old.Bestelling.BestelbonDetail) old).collect(Collectors.toList());

        for (Old.Bestelling.BestelbonDetail detail : bestelbonnendetails) {
            ReceptProduct receptProduct = oldReceptproductToNewReceptproduct().stream().filter(r -> r.getId() == detail.getId_receptproduct()).findFirst().orElse(new ReceptProduct());
            newUitgaandeBestelling.add(new UitgaandeBestelling(0, detail.getUpdated(), detail.getUpdated(), detail.getOpmerking(), detail.getAfgewerkt(), detail.getVolgnummer(), detail.getHoeveelheid(), convertVerpakkingsEenheid(detail.getEenheid()), detail.getEenheidsprijs(), detail.getAantal_eenheden_verpakking(), detail.getAantal_verpakkingen_colli(), detail.getEenheidsgewicht(), detail.getTotaal(), detail.getGeleverde_hoeveelheid(), receptProduct));
        }

        //Bestelbon zijn List opvullen.
        oldBestelbonHoofdingToNewBestelbon().forEach(bon -> {
            List<UitgaandeBestelling> bestellingen = new ArrayList();

            for (int i = 0; i < newUitgaandeBestelling.size(); i++) {
                if (bestelbonnendetails.get(i).getId_bestelbon() == bon.getId()) {
                    bestellingen.add(newUitgaandeBestelling.get(i));
                }
            }
            bon.setUitgaandeBestellingen(bestellingen);
        });

        return newUitgaandeBestelling;

    }

    public static List<Old.Leverancier> oldLeverantierToNewLeverancier() {
        List<Old.Leverancier> leveranciers = Import.getLeveranciers().stream().map(old -> (Old.Leverancier) old).collect(Collectors.toList());
        List<Old.Aanspreektitel> aansprekingen = Import.getAansprekingen().stream().map(old -> (Old.Aanspreektitel) old).collect(Collectors.toList());
        List<Leveringen.Leverancier> newLeveranciers = new ArrayList();

        for (Old.Leverancier l : leveranciers) {
            String aanspreking = aansprekingen.stream().filter(a -> a.getId_aanspreektitel() == l.getId_aanspreking()).findFirst().get().getOmschrijvingn();
            //GENERATE ID voor ADRES
            Adressen.Adres adres = new Adres(0, l.getStraat(), l.getHuisnummer(), "", l.getPostcode(), l.getWoonplaats(), Land.values()[l.getId_land() - 1]);
            Leveringen.LeveranciersGroep leveranciersgroep = oldLeveranciersgroepToNewLeveranciersgroep().stream().filter(groep -> groep.getId() == l.getId_leveranciersgroep()).findFirst().get();
            BetalingsVoorwaarde betalingsVoorwaarde = oldBetalingsVoorwaardeToNewBetalingsVoorwaarde().stream().filter(voorwaarde -> voorwaarde.getBetalingsVoorwaardeId() == l.getId_betalingsvoorwaarde()).findFirst().get();
            Boekhouding.Dagboek dagboek = oldDagboekToNewDagboek().stream().filter(boek->boek.getId() == l.getId_dagboek()).findFirst().get();
            Boekhouding.AlgemeneRekening algemeneRekening = new AlgemeneRekening(Omschrijving, 0, aanspreking, true, true, true, true, true)
            
            Leveringen.Leverancier newLeverancier
                    = new Leverancier(l.getId_leverancier(), aanspreking, l.getNaam(), adres, Taal.values()[l.getId_taalcode()], leveranciersgroep, l.getBlokkeren(),
                            l.getNaam_contactpersoon(), l.getTelefoonnummer(), l.getGsmnummer(), l.getFaxnummer(), l.getEmailadres(), l.getUrl(), l.getVertegenwoordiger_naam(), l.getVertegenwoordiger_telefoonnummer(),
                            l.getVertegenwoordiger_gsmnummer(), l.getVertegenwoordiger_faxnummer(), l.getVertegenwoordiger_emailadres(), l.getVertegenwoordiger_afspraak_datum(), l.getInfo(), l.getId_klant(), l.getBestellingen_telefoonnummer(),
                            l.getBestellingen_faxnummer(), l.getBestellingen_emailadres(), l.getUrl(), Webshop_API.values()[l.getId_webshop_api() - 1], l.getTekst_bestelbon(),
                            l.getBegindatum_verlofperiode1(), l.getEinddatum_verlofperiode1(), LeveringsFrequenties.values()[l.getId_leveringsfrequentie() - 1],
                            MuntEenheid.values()[l.getId_munt() - 1], betalingsVoorwaarde, l.getPercentage_handelskorting(), l.getPercentage_financiele_korting(), l.getBedrag_kredietlimiet(), l.getAankoopprijzen_inclusief_btw(), l.getNul_prijzen_bij_levering(), betalingsVoorwaarde.getBetalingsVoorwaardeCode(),
                             dagboek, AlgemeneRekening, BtwCode.Export,
                            OndernemingsNummer, RechtspersonenRegister, BankNummer, AlgemeneInfo, Linken, Verloven, leverancierOpeningstijden, Leveranciers, LeverancierLeveringsDagen, LeveringsDagen);
        }
    }

    public static List<Leveringen.LeveranciersGroep> oldLeveranciersgroepToNewLeveranciersgroep() {
        List<Old.Leveranciersgroep> leveranciersgroepen = Import.getLeveranciersgroepen().stream().map(old -> (Old.Leveranciersgroep) old).collect(Collectors.toList());
        List<Leveringen.LeveranciersGroep> newLeveranciersGroepen = new ArrayList();

        leveranciersgroepen.forEach(groep -> {
            newLeveranciersGroepen.add(new LeveranciersGroep(groep.getId_leveranciersgroep(), new Omschrijving(0, groep.getOmschrijvingn(), groep.getOmschrijvingf(), "")));
        });

        return newLeveranciersGroepen;
    }

    public static List<Boekhouding.BetalingsVoorwaarde> oldBetalingsVoorwaardeToNewBetalingsVoorwaarde() {
        List<Old.Boekhouding.Betalingsvoorwaarde> betalingsvoorwaardes = Import.getBetalingsvoorwaardes().stream().map(old -> (Old.Boekhouding.Betalingsvoorwaarde) old).collect(Collectors.toList());
        List<Boekhouding.BetalingsVoorwaarde> newBetalingsVoorwaardes = new ArrayList();

        betalingsvoorwaardes.forEach(v -> {
            newBetalingsVoorwaardes.add(new BetalingsVoorwaarde(new Omschrijving(0, v.getOmschrijvingn(), v.getOmschrijvingf(), ""), v.getId_betalingsvoorwaarde(), v.getCodeboekhouding(), "/", v.getAantaldagen(), Boolean.valueOf(v.getCodeberekenenvervaldatum())));
        });

        return newBetalingsVoorwaardes;

    }

    public static List<Boekhouding.Dagboek> oldDagboekToNewDagboek() {
        List<Old.Dagboek> dagboeken = Import.getDagboeken().stream().map(boek -> (Old.Dagboek) boek).collect(Collectors.toList());
        List<Boekhouding.Dagboek> newDagboeken = new ArrayList();

        dagboeken.forEach(dagboek -> {
            newDagboeken.add(new Dagboek(dagboek.getId_dagboek(), new Omschrijving(0, dagboek.getOmschrijvingn(), dagboek.getOmschrijvingf(), ""), dagboek.getCodeboekhouding(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), false));
        });

        return newDagboeken;

    }

    private static Eenheid convertRecepteenheid(int id) {
        switch (id) {
            case -30:
                return Eenheid.Meter;
            case -21:
                return Eenheid.Milliliter;
            case -20:
                return Eenheid.Liter;
            case -11:
                return Eenheid.Gram;
            case -10:
                return Eenheid.Kilogram;
            case -3:
                return Eenheid.Stuk;
            case -2:
                return Eenheid.PerPersoon;
            case -1:
                return Eenheid.Minuten;
            default:
                return Eenheid.Kolijoule;
        }
    }

    private static VerpakkingsEenheid convertVerpakkingsEenheid(String eenheid) {
        switch (eenheid) {
            case "KG":
                return VerpakkingsEenheid.Eenheid;
            default:
                return VerpakkingsEenheid.Verpakking;
        }
    }
}
