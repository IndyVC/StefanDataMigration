/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import Adressen.Adres;
import Adressen.OntvangstAdres;
import Algemeen.Omschrijving;
import Algemeen.Openingstijd;
import Bedrijven.BankRekeningNummer;
import Bedrijven.Fabrikant;
import Bedrijven.PrivateLabel;
import Bedrijven.Verlof;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Bestellingen.UitgaandeBestelling;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Boekhouding.BTWPercentage;
import Boekhouding.Bank;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.Dagboek;
import Boekhouding.OnrechtstreekseKost;
import Boekhouding.VasteKost;
import Boekhouding.Winstmarge;
import Import.Import;
import Leveringen.Leverancier;
import Leveringen.LeveranciersGroep;
import Leveringen.LeveringsDag;
import Materialen.BarcodePrefix;
import Materialen.Etiket;
import Materialen.Materieelgroep;
import Materialen.Onderhoud;
import Materialen.Printer;
import Materialen.Verpakking;
import Old.Boekhouding.Bankinstelling;
import Old.Etiket.EtiketTekst;
import Old.Materieel;
import Old.Parameters.MicrobiologischeParameter;
import Producten.AankoopProduct;
import Producten.AfgewerktProduct;
import Producten.DistributieWijze;
import Producten.FysischeEigenschap;
import Producten.OptieGroep;
import Producten.ProductCategorie;
import Producten.ProductGroep;
import Producten.ProductSubGroep;
import Producten.Productiegroep;
import Producten.ReceptProduct;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Job;
import Producten.Recepten.Receptgroep;
import Producten.VariantGroep;
import Producten.VerkoopProduct;
import Producten.VerkoopProductGroep;
import Producten.VerkoopsBarcode;
import Producten.Verkoopsverdeelgroep;
import Producten.Verkoopsverpakking;
import Producten.VoorstellingOpProductielijst;
import Tracering.LotnummerAanbrenger;
import Tracering.LotnummerDrager;
import Tracering.LotnummerType;
import TussenTabellen.VestigingAankoopProduct;
import Utils.Util;
import Voorraden.BewaarTemperatuur;
import Voorraden.Bewaarconditie;
import Voorraden.VoorraadPlaats;
import enums.BtwCode;
import enums.DayOfWeek;
import enums.Eenheid;
import enums.EtiketPrintMogelijkheid;
import enums.EtiketType;
import enums.Land;
import enums.LeveringsFrequenties;
import enums.MuntEenheid;
import enums.Printertype;
import enums.SoortFysischeEigenschap;
import enums.Taal;
import enums.VerpakkingsEenheid;
import enums.Webshop_API;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author stefa
 */
public class Mapper {

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

    private static VerpakkingsEenheid convertVerpakkingsEenheid(int eenheid) {
        switch (eenheid) {
            case 0:
                return VerpakkingsEenheid.Eenheid;
            case 1:
                return VerpakkingsEenheid.Colli;
            case 2:
                return VerpakkingsEenheid.Verpakking;
            default:
                return VerpakkingsEenheid.Verpakking;
        }
    }

    private static BigDecimal getBigDecimal(String gtin) {
        BigDecimal big;
        if (gtin != null && !gtin.equals("")) {
            big = new BigDecimal(gtin);
        } else {
            big = new BigDecimal(0);
        }
        return big;
    }

    //give old objects, get new objects.
    public static List<Boekhouding.Bank> oldBankinstellingToNewBank() {
        List<Boekhouding.Bank> newBanken = new ArrayList();
        List<Old.Boekhouding.Bankinstelling> bankInstellingen = Import.getBankinstellingen().stream().map(b -> (Old.Boekhouding.Bankinstelling) b).collect(Collectors.toList());

        bankInstellingen.forEach(b -> {
            newBanken.add(new Bank(b.getId_bank(), b.getNaam(), b.getBankcode()));
        });
        return newBanken;
    }

    public static List<Bedrijven.Bedrijf> oldBedrijfToNewBedrijf() {
        List<Vestiging> newVestigingen;
        List<Bedrijven.Bedrijf> newBedrijven = new ArrayList();

        List<Old.Bedrijf.Bedrijf> oldBedrijven = Import.getBedrijven().stream().map(old -> (Old.Bedrijf.Bedrijf) old).collect(Collectors.toList());

        for (Old.Bedrijf.Bedrijf old : oldBedrijven) {
            newVestigingen = new ArrayList();

            Adres adres = new Adres(0, old.getStraat(), old.getHuisnummer(), "", old.getPostcode(), old.getWoonplaats(), Land.België);
            Bedrijven.Bedrijf bedrijf = new Bedrijven.Bedrijf(old.getId_bedrijf(), old.getNaam(), old.getTelefoonnummer(), old.getEmailadres(), adres, null);
            Bank bank = oldBankinstellingToNewBank().stream().filter(e -> e.getBankId() == old.getId_bank()).findFirst().orElse(new Bank());
            bank.setId(old.getId_bank());

            BankRekeningNummer bankRekeningNummer = new BankRekeningNummer(0, old.getIban(), bank);
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

    public static List<Leveringen.Leverancier> oldLeverantierToNewLeverancier() {
        List<Old.Leverancier> leveranciers = Import.getLeveranciers().stream().map(old -> (Old.Leverancier) old).collect(Collectors.toList());
        List<Old.Aanspreektitel> aansprekingen = Import.getAansprekingen().stream().map(old -> (Old.Aanspreektitel) old).collect(Collectors.toList());
        List<Leveringen.Leverancier> newLeveranciers = new ArrayList();

        for (Old.Leverancier l : leveranciers) {
            String aanspreking = aansprekingen.stream().filter(a -> a.getId_aanspreektitel() == l.getId_aanspreking()).findFirst().get().getOmschrijvingn();
            //GENERATE ID voor ADRES
            Adressen.Adres adres = new Adres(0, l.getStraat(), l.getHuisnummer(), "", l.getPostcode(), l.getWoonplaats(), Land.values()[l.getId_land() - 1]);
            Leveringen.LeveranciersGroep leveranciersgroep = oldLeveranciersgroepToNewLeveranciersgroep().stream().filter(groep -> groep.getId() == l.getId_leveranciersgroep()).findFirst().get();
            BetalingsVoorwaarde betalingsVoorwaarde = oldBetalingsVoorwaardeToNewBetalingsVoorwaarde().stream().filter(voorwaarde -> voorwaarde.getBetalingsVoorwaardeId() == l.getId_betalingsvoorwaarde()).findFirst().get();
            Boekhouding.Dagboek dagboek = oldDagboekToNewDagboek().stream().filter(boek -> boek.getId() == l.getId_dagboek()).findFirst().get();
            Boekhouding.AlgemeneRekening algemeneRekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(e -> e.getAlgemeneRekeningId() == l.getId_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());

            Leveringen.Leverancier newLeverancier
                    = new Leverancier(l.getId_leverancier(), aanspreking, l.getNaam(), adres, Taal.values()[l.getId_taalcode()], leveranciersgroep, l.getBlokkeren(),
                            l.getNaam_contactpersoon(), l.getTelefoonnummer(), l.getGsmnummer(), l.getFaxnummer(), l.getEmailadres(), l.getUrl(), l.getVertegenwoordiger_naam(), l.getVertegenwoordiger_telefoonnummer(),
                            l.getVertegenwoordiger_gsmnummer(), l.getVertegenwoordiger_faxnummer(), l.getVertegenwoordiger_emailadres(), l.getVertegenwoordiger_afspraak_datum(), l.getInfo(), l.getId_klant(), l.getBestellingen_telefoonnummer(),
                            l.getBestellingen_faxnummer(), l.getBestellingen_emailadres(), l.getUrl(), Webshop_API.values()[l.getId_webshop_api() - 1], l.getTekst_bestelbon(),
                            l.getBegindatum_verlofperiode1(), l.getEinddatum_verlofperiode1(), LeveringsFrequenties.values()[l.getId_leveringsfrequentie() - 1],
                            MuntEenheid.values()[l.getId_munt() - 1], betalingsVoorwaarde, l.getPercentage_handelskorting(), l.getPercentage_financiele_korting(), l.getBedrag_kredietlimiet(),
                            l.getAankoopprijzen_inclusief_btw(), l.getNul_prijzen_bij_levering(), betalingsVoorwaarde.getBetalingsVoorwaardeCode(),
                            dagboek, algemeneRekening, BtwCode.values()[l.getId_btwcode()], l.getOndernemingsnummer(), l.getRechtspersonenregister(), l.getBanknummer(), l.getInfo());

            List<Bedrijven.Verlof> verloven = new ArrayList();
            List<Openingstijd> openingstijden = new ArrayList();
            List<LeveringsDag> leveringsdagen = new ArrayList();
            //GEEN LINKEN
            //LIST VERLOVEN
            verloven.add(new Verlof(0, l.getBegindatum_verlofperiode1(), l.getEinddatum_verlofperiode1()));
            verloven.add(new Verlof(0, l.getBegindatum_verlofperiode2(), l.getEinddatum_verlofperiode2()));
            verloven.add(new Verlof(0, l.getBegindatum_verlofperiode3(), l.getEinddatum_verlofperiode3()));
            //GEEN OPENINGUREN, ALLEEN DAGEN.
            if (!l.getGesloten1()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Monday, "", "", "", ""));
            }
            if (!l.getGesloten2()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Tuesday, "", "", "", ""));
            }
            if (!l.getGesloten3()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Wednesday, "", "", "", ""));
            }
            if (!l.getGesloten4()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Thursday, "", "", "", ""));
            }
            if (!l.getGesloten5()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Friday, "", "", "", ""));
            }
            if (!l.getGesloten6()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Saturday, "", "", "", ""));
            }
            if (!l.getGesloten7()) {
                openingstijden.add(new Openingstijd(0, DayOfWeek.Sunday, "", "", "", ""));
            }
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Monday, l.getLevering1()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Tuesday, l.getLevering2()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Wednesday, l.getLevering3()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Thursday, l.getLevering4()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Friday, l.getLevering5()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Saturday, l.getLevering6()));
            leveringsdagen.add(new LeveringsDag(0, DayOfWeek.Sunday, l.getLevering7()));

            newLeverancier.setVerloven(verloven);
            newLeverancier.setOpeningstijden(openingstijden);
            newLeverancier.setLeveringsDagen(leveringsdagen);

            newLeveranciers.add(newLeverancier);
        }

        return newLeveranciers;
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
        List<Old.Dagboek> dagboeken = Import.getDagboeken().stream().map(e -> (Old.Dagboek) e).collect(Collectors.toList());
        List<Boekhouding.Dagboek> newDagboeken = new ArrayList();

        dagboeken.forEach(dagboek -> {
            newDagboeken.add(new Dagboek(dagboek.getId_dagboek(), new Omschrijving(0, dagboek.getOmschrijvingn(), dagboek.getOmschrijvingf(), ""), dagboek.getCodeboekhouding(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), false));
        });

        return newDagboeken;

    }

    public static List<Boekhouding.AlgemeneRekening> oldBoekhoudrekeningToAlgemeneRekening() {
        List<Old.Boekhoudrekening> boekhoudrekeningen = Import.getBoekhoudrekeningen().stream().map(e -> (Old.Boekhoudrekening) e).collect(Collectors.toList());
        List<Boekhouding.AlgemeneRekening> newAlgemeneRekeningen = new ArrayList();

        boekhoudrekeningen.forEach(b -> {
            AlgemeneRekening rek = new AlgemeneRekening(new Omschrijving(0, b.getOmschrijvingn(), b.getOmschrijvingf(), "/"), b.getId_boekhoudrekening(), b.getBoekhoudrekening(), b.getHoeveelheid_verplicht(), b.getIs_aankoop(), b.getIs_korting(), b.getIs_diverse(), b.getIs_btw());
            newAlgemeneRekeningen.add(rek);
        });

        return Export.deleteDuplicates(newAlgemeneRekeningen);
    }

    public static List<Producten.AankoopProduct> oldAankoopproductToNewAankoopproduct() {
        List<Old.Aankoopproducten.Aankoopproduct> aankoopproducten = Import.getAankoopproducten().stream().map(e -> (Old.Aankoopproducten.Aankoopproduct) e).collect(Collectors.toList());
        List<Producten.AankoopProduct> newAankoopproducten = new ArrayList();

        aankoopproducten.forEach(a -> {
            Omschrijving omschrijving = new Omschrijving(0, a.getOmschrijvingn(), a.getOmschrijvingf(), "");
            ProductCategorie productCategorie = oldProductcategorieToNewProductcategorie().stream().filter(pc -> pc.getId() == a.getId_productcategorie()).findFirst().orElse(new ProductCategorie());
            productCategorie.setId(a.getId_productcategorie());
            ProductGroep productGroep = oldProductgroepToNewProductGroep().stream().filter(pg -> pg.getId() == a.getId_productgroep()).findFirst().orElse(new ProductGroep());
            productGroep.setId(a.getId_productgroep());
            ProductSubGroep productSubgroep = oldProductSubGroepToNewProductSubGroep().stream().filter(ps -> ps.getId() == a.getId_productsubgroep()).findFirst().orElse(new ProductSubGroep());
            productSubgroep.setId(a.getId_productsubgroep());
            BestelGroep bestelgroep = oldBestelgroepToNewBestelgroep().stream().filter(bg -> bg.getId() == a.getId_bestelgroep()).findFirst().orElse(new BestelGroep());
            bestelgroep.setId(a.getId_bestelgroep());
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(v -> v.getId() == a.getId_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadPlaats.setId(a.getId_voorraadplaats());
            AlgemeneRekening algemeneRekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(e -> e.getId() == a.getId_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            algemeneRekening.setId(a.getId_algemene_rekening());
            AnalytischeRekening analytischeRekening = new AnalytischeRekening();
            analytischeRekening.setId(a.getId_analytische_rekening());
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(et -> et.getId() == a.getId_etiket()).findFirst().orElse(new Etiket());
            etiket.setId(a.getId_etiket());
            Bedrijven.Fabrikant fabrikant = oldFabrikantToNewFabrikant().stream().filter(fab -> fab.getId() == a.getId_fabrikant()).findFirst().orElse(new Fabrikant());
            fabrikant.setId(a.getId_fabrikant());
            ReceptProduct receptProduct = oldReceptproductToNewReceptproduct().stream().filter(rp -> rp.getId() == a.getId_receptproduct()).findFirst().orElse(new ReceptProduct());
            receptProduct.setId(a.getId_receptproduct());
            BigDecimal gtin = a.getGtin();

            Producten.AankoopProduct newAankoopproduct = new AankoopProduct(a.getId_aankoopproduct(),
                    omschrijving, productCategorie, productGroep, productSubgroep, bestelgroep,
                    VerpakkingsEenheid.values()[0], Eenheid.values()[a.getId_aankoopeenheid()],
                    Eenheid.values()[a.getId_voorraadeenheid()], Eenheid.values()[a.getId_etiketteneenheid()],
                    a.getAantal_eenheden_verpakking(), a.getAantal_verpakkingen_colli(), a.getNettogewicht_verpakkingseenheid(),
                    a.getBrutogewicht_verpakkingseenheid(), a.getMinimum_bestelhoeveelheid(), a.getVeelvoud_bestelling(),
                    a.getMinimum_leveringstermijn(), a.getMinimum_aantal_dagen_houdbaar(), a.getVoorraad(),
                    a.getVoorraad_minimum(), a.getVoorraad_maximum(), voorraadPlaats, BtwCode.values()[a.getId_btwcode()],
                    algemeneRekening, analytischeRekening, a.getDoorverkoop(),
                    a.getBlokkeren(), a.getInfo(), a.getEenheidsgewicht(), Eenheid.values()[a.getId_basiseenheid()],
                    MuntEenheid.values()[a.getId_prijseenheid()], a.getEtiket_intern(), etiket, gtin, new Materialen.EtiketTekst(),
                    fabrikant, a.getVerliespercentage(), a.getBestandsnaam_foto(), a.getColli_barcode(),
                    a.getOnmiddellijk_in_gebruik(), a.getBeperkte_houdbaarheid_na_openen(), a.getAantal_dagen_houdbaar_na_openen(),
                    Eenheid.values()[a.getId_basiseenheid()], a.getAantal_loten_in_gebruik(),
                    receptProduct);

            newAankoopproducten.add(newAankoopproduct);
            Bedrijven.Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(e -> e.getId() == a.getId_bedrijf()).findFirst().orElse(new Bedrijven.Bedrijf());
            bedrijf.setId(a.getId_bedrijf());
            List<Vestiging> vestigingen = bedrijf.getVestigingen();
            vestigingen.forEach(v -> {
                TussenTabellen.VestigingAankoopProduct tussen = new VestigingAankoopProduct(v, newAankoopproduct);
                newAankoopproduct.getAankoopProductvestigingen().add(tussen);
                v.getVestigingAankoopProduct().add(tussen);
            });

        });

        return newAankoopproducten;
    }

    public static List<Producten.ProductGroep> oldProductgroepToNewProductGroep() {
        List<Producten.ProductGroep> newProductgroepen = new ArrayList();
        List<Old.Product.Productgroep> productgroepen = Import.getProductgroepen().stream().map(e -> (Old.Product.Productgroep) e).collect(Collectors.toList());

        productgroepen.forEach(p -> {
            Omschrijving omschrijving = new Omschrijving(0, p.getOmschrijvingn(), p.getOmschrijvingf(), "");
            AlgemeneRekening rekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(r -> r.getId() == p.getId_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            rekening.setId(p.getId_algemene_rekening());
            newProductgroepen.add(new ProductGroep(p.getId_productgroep(), omschrijving, rekening, null));
        });

        return newProductgroepen;
    }

    public static List<Producten.ProductSubGroep> oldProductSubGroepToNewProductSubGroep() {
        List<Producten.ProductSubGroep> newProductSubgroepen = new ArrayList();
        List<Old.Product.Productsubgroep> productsubgroepen = Import.getProductsubgroepen().stream().map(e -> (Old.Product.Productsubgroep) e).collect(Collectors.toList());

        productsubgroepen.forEach(p -> {
            Omschrijving omschrijving = new Omschrijving(0, p.getOmschrijvingn(), p.getOmschrijvingf(), "");
            AlgemeneRekening rek = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(r -> r.getId() == p.getId_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            rek.setId(p.getId_algemene_rekening());
            newProductSubgroepen.add(new ProductSubGroep(p.getId_productsubgroep(), omschrijving, rek, null));
        });

        return newProductSubgroepen;
    }

    public static List<Bestellingen.BestelGroep> oldBestelgroepToNewBestelgroep() {
        List<Bestellingen.BestelGroep> newBestelgroepen = new ArrayList();
        List<Old.Bestelling.Bestelgroep> bestelgroepen = Import.getBestelgroepen().stream().map(e -> (Old.Bestelling.Bestelgroep) e).collect(Collectors.toList());

        bestelgroepen.forEach(b -> {
            Omschrijving omschrijving = new Omschrijving(0, b.getOmschrijvingn(), b.getOmschrijvingf(), "");
            newBestelgroepen.add(new BestelGroep(b.getId_bestelgroep(), omschrijving, false));
        });

        return newBestelgroepen;
    }

    public static List<Etiket> oldEtiketToNewEtiket() {
        List<Etiket> newEtiketten = new ArrayList();
        List<Old.Etiket.Etiket> etiketten = Import.getEtiketten().stream().map(e -> (Old.Etiket.Etiket) e).collect(Collectors.toList());
        List<Old.Etiket.EtiketPrinter> etiketprinters = Import.getEtikettenprinters().stream().map(e -> (Old.Etiket.EtiketPrinter) e).collect(Collectors.toList());

        for (Old.Etiket.Etiket e : etiketten) {
            List<EtiketType> types = new ArrayList();
            if (e.getAankoop()) {
                types.add(EtiketType.Aankoop);
            }
            if (e.getVoorraad()) {
                types.add(EtiketType.Voorraad);
            }
            if (e.getVerbruik()) {
                types.add(EtiketType.Verbruik);
            }
            if (e.getPrijskaartje()) {
                types.add(EtiketType.Prijskaartje);
            }

            Printer printer = null;
            for (Old.Etiket.EtiketPrinter ep : etiketprinters) {
                if (ep.getId_etiket() == e.getId_etiket()) {
                    printer = oldPrinterToNewPrinter().stream().filter(p -> p.getId() == ep.getId_printer()).findFirst().get();
                }
            }
            EtiketType type = null;
            if (types.size() > 0 && types != null) {
                type = types.get(0);
            }
            Omschrijving omschrijving = new Omschrijving(0, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            newEtiketten.add(new Etiket(e.getId_etiket(), e.getNaam(),
                    omschrijving, type, printer));
        }

        return newEtiketten;
    }

    public static List<Materialen.Printer> oldPrinterToNewPrinter() {
        List<Materialen.Printer> newPrinters = new ArrayList();
        List<Old.Printer> printers = Import.getPrinters().stream().map(p -> (Old.Printer) p).collect(Collectors.toList());

        printers.forEach(p -> {
            Omschrijving locatie = new Omschrijving(0, p.getLocatien(), p.getLocatief(), "");
            Omschrijving omschrijving = new Omschrijving(0, p.getNaam(), "", "");
            newPrinters.add(new Printer(p.getId_printer(),
                    locatie,
                    omschrijving,
                    Printertype.values()[p.getType()], p.getStandaard_inkomende_bestelbon(), p.getStandaard_verzendbon()));
        });
        return newPrinters;
    }

    public static List<VoorraadPlaats> oldVoorraadPlaatsToNewVoorraadPlaats() {
        List<VoorraadPlaats> newVoorraadPlaatsen = new ArrayList();
        List<Old.Voorraad.Voorraadplaats> voorraadPlaatsen = Import.getVoorraadplaatsen().stream().map(e -> (Old.Voorraad.Voorraadplaats) e).collect(Collectors.toList());

        voorraadPlaatsen.forEach(vp -> {
            Omschrijving omschrijving = new Omschrijving(0, vp.getOmschrijvingn(), vp.getOmschrijvingf(), "");
            newVoorraadPlaatsen.add(new VoorraadPlaats(vp.getId_voorraadplaats(),
                    omschrijving, 0.0));
        });

        return newVoorraadPlaatsen;
    }

    public static List<Producten.ProductCategorie> oldProductcategorieToNewProductcategorie() {
        List<Old.Product.Productcategorie> productcategorie = Import.getProductcategorieen().stream().map(e -> (Old.Product.Productcategorie) e).collect(Collectors.toList());
        List<Producten.ProductCategorie> newProductcategorieen = new ArrayList();
        List<Producten.ProductSubGroep> newProductSubgroepen = oldProductSubGroepToNewProductSubGroep();
        List<Producten.ProductGroep> newProductgroepen = oldProductgroepToNewProductGroep();
        List<Old.Product.Productsubgroep> productsubgroepen = Import.getProductsubgroepen().stream().map(e -> (Old.Product.Productsubgroep) e).collect(Collectors.toList());

        int i = 0;
        for (Old.Product.Productsubgroep subgroep : productsubgroepen) {
            newProductSubgroepen.get(i).setProductGroep(newProductgroepen.stream().filter(e -> e.getProductGroepId() == subgroep.getId_productgroep()).findFirst().get());
            i++;
        }

        newProductgroepen.forEach(groep -> {
            groep.setProductSubGroepen(newProductSubgroepen.stream().filter(subgroep -> subgroep.getProductGroep().getId() == groep.getProductGroepId()).collect(Collectors.toList()));
        });

        for (Old.Product.Productcategorie e : productcategorie) {
            Omschrijving omschrijving = new Omschrijving(0, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            ProductGroep productGroep = newProductgroepen.stream().filter(groep -> groep.getId() == e.getDefault_aankoopproduct_productgroep()).findFirst().orElse(new ProductGroep());
            productGroep.setId(e.getDefault_aankoopproduct_productgroep());
            ProductSubGroep productSubGroep = newProductSubgroepen.stream().filter(subgroep -> subgroep.getId() == e.getDefault_aankoopproduct_productsubgroep()).findFirst().orElse(new ProductSubGroep());
            productSubGroep.setId(e.getDefault_aankoopproduct_productsubgroep());
            Bedrijven.Fabrikant fabrikant = oldFabrikantToNewFabrikant().stream().filter(f -> f.getFabrikantId() == e.getDefault_aankoopproduct_fabrikant()).findFirst().orElse(new Fabrikant());
            fabrikant.setId(e.getDefault_aankoopproduct_fabrikant());
            Bestellingen.BestelGroep bestelgroep = oldBestelgroepToNewBestelgroep().stream().filter(b -> b.getBestelGroepId() == e.getDefault_aankoopproduct_bestelgroep()).findFirst().orElse(new BestelGroep());
            bestelgroep.setId(e.getDefault_aankoopproduct_bestelgroep());
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(et -> et.getId() == e.getDefault_aankoopproduct_etiket()).findFirst().orElse(new Etiket());
            etiket.setId(e.getDefault_aankoopproduct_etiket());
            Voorraden.VoorraadPlaats voorraadplaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(vp -> vp.getId() == e.getDefault_aankoopproduct_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadplaats.setId(e.getDefault_aankoopproduct_voorraadplaats());
            AlgemeneRekening algemeneRekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(rek -> rek.getAlgemeneRekeningId() == e.getDefault_aankoopproduct_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            algemeneRekening.setId(e.getDefault_aankoopproduct_algemene_rekening());
            AnalytischeRekening analytischeRekening = new AnalytischeRekening();
            analytischeRekening.setId(e.getDefault_aankoopproduct_analytische_rekening());
            Verpakking standaardVerpakking = new Verpakking(e.getDefault_aankoopproduct_verpakkingseenheid());
            Verpakking colliVerpakking = new Verpakking(e.getDefault_aankoopproduct_collieenheid());

            newProductcategorieen.add(new ProductCategorie(e.getId_productcategorie(), omschrijving, productGroep, productSubGroep,
                    fabrikant, bestelgroep, standaardVerpakking, colliVerpakking, Eenheid.values()[e.getDefault_aankoopproduct_basiseenheid()],
                    convertVerpakkingsEenheid(e.getDefault_aankoopproduct_aankoopeenheid()), etiket,
                    convertVerpakkingsEenheid(e.getDefault_aankoopproduct_basiseenheid()), convertVerpakkingsEenheid(e.getDefault_aankoopproduct_voorraadeenheid()), voorraadplaats,
                    BtwCode.values()[e.getDefault_aankoopproduct_btwcode()], convertVerpakkingsEenheid(e.getDefault_aankoopproduct_prijseenheid()),
                    algemeneRekening, analytischeRekening, e.getDefault_aankoopproduct_doorverkoop(), e.getDefault_aankoopproduct_voorraad(),
                    e.getDefault_aankoopproduct_afdrukken_etiketten_intern(), e.getDefault_aankoopproduct_afdrukken_etiket_verbruik(), convertVerpakkingsEenheid(e.getDefault_aankoopproduct_id_etiket_verbruik()),
                    e.getDefault_aankoopproduct_beperkt_houdbaar_na_openen(), e.getDefault_aankoopproduct_afdrukken_etiketten_verkoopproducten(),
                    EtiketPrintMogelijkheid.geen, e.getDefault_aankoopproduct_afdrukken_ingredienten(), e.getDefault_receptproduct_hulpstof(),
                    e.getDefault_receptproduct_halffabrikaten(), e.getDefault_receptproduct_voorbereide_producten(), e.getDefault_receptproduct_afgewerkte_producten(), e.getDefault_receptproduct_verkoopproducten()));
        }

        return newProductcategorieen;
    }

    public static List<Producten.Recepten.BasisRecept> oldReceptenToBasisRecepten() {
        List<Producten.Recepten.BasisRecept> newRecepten = new ArrayList();
        List<Old.Recept.Recept> recepten = Import.getRecepten().stream().map(e -> (Old.Recept.Recept) e).collect(Collectors.toList());

        //generate ID
        for (Old.Recept.Recept e : recepten) {
            ReceptProduct receptProduct = oldReceptproductToNewReceptproduct().stream().filter(r -> r.getId() == e.getId_header()).findFirst().orElse(null);
            Omschrijving omschrijving = new Omschrijving();
            omschrijving.setId(-1);
            BasisRecept basisRecept = new BasisRecept(-1, omschrijving, e.getHoeveelheid(), e.getPercentage(), e.getVolgnummer(), e.getHulpstof(), e.getTelbasis(), e.getAantal_personen());
            if (receptProduct != null) {
                TussenTabellen.ReceptProductBasisRecept tussen = new TussenTabellen.ReceptProductBasisRecept(receptProduct, basisRecept);
                basisRecept.getBasisReceptReceptProducten().add(tussen);
                receptProduct.getReceptProductBasisRecepten().add(tussen);
            }
            newRecepten.add(basisRecept);

        }

        return newRecepten;
    }

    public static List<Materialen.Materieelgroep> oldMaterieelgroepToNewMaterieelGroep() {
        List<Old.MaterieelGroep> materieelGroep = Import.getMaterieelgroep().stream().map(e -> (Old.MaterieelGroep) e).collect(Collectors.toList());
        List<Materialen.Materieelgroep> newMaterieelGroep = new ArrayList();

        materieelGroep.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Materialen.Materieelgroep matGroep = new Materieelgroep(e.getId_materieelgroep(), omschrijving, false);
            newMaterieelGroep.add(matGroep);
        });

        return newMaterieelGroep;
    }

    public static List<Materialen.Materieel> oldMaterieelToNewMaterieel() {
        List<Materialen.Materieel> newMaterieel = new ArrayList();
        List<Old.Materieel> materieel = Import.getMaterieel().stream().map(e -> (Old.Materieel) e).collect(Collectors.toList());

        materieel.forEach(e -> {
            Materialen.Materieelgroep matGroep = oldMaterieelgroepToNewMaterieelGroep().stream().filter(g -> g.getId() == e.getId_materieelgroep()).findFirst().orElse(new Materieelgroep());
            matGroep.setId(e.getId_materieelgroep());
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Leverancier leverancier = oldLeverantierToNewLeverancier().stream().filter(l -> l.getId() == e.getId_leverancier()).findFirst().orElse(new Leverancier());
            leverancier.setId(e.getId_leverancier());
            Materialen.Onderhoud onderhoud = new Onderhoud();
            onderhoud.setId(-1);

            Materialen.Materieel mat = new Materialen.Materieel(e.getId_materieel(), matGroep, e.getTechnische_keuring(), e.getDatum_laatste_keuring(), e.getDatum_volgende_keuring(), omschrijving, leverancier, e.getGebruiksaanwijzing(), e.getVeiligheidsfiche(), e.getLink_technische_keuring(), e.getLink_onderhoudschema(), e.getLink_ingebruikstelling(), e.getLink_foto(), e.getBlokkeren(), e.getGebruiksaanwijzing(), e.getVeiligheidsfiche(), onderhoud);
            newMaterieel.add(mat);
        });

        return newMaterieel;
    }

    public static List<Producten.Productiegroep> oldProductiegroepToNewProductiegroep() {
        List<Producten.Productiegroep> newProductieGroepen = new ArrayList();
        List<Old.Product.Productiegroep> productiegroepen = Import.getProductiegroepen().stream().map(e -> (Old.Product.Productiegroep) e).collect(Collectors.toList());

        productiegroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            AlgemeneRekening algemeneRek = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(r -> r.getId() == e.getId_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            algemeneRek.setId(e.getId_algemene_rekening());

            Producten.Productiegroep productieGroep = new Productiegroep(e.getId_produktiegroep(), omschrijving, algemeneRek, e.getAfdrukkenreceptenlijst(), e.getOpmerking_meenemen());
            newProductieGroepen.add(productieGroep);
        });

        return newProductieGroepen;
    }

    public static List<Producten.Recepten.Receptgroep> oldReceptengroepToNewReceptenGroep() {
        List<Producten.Recepten.Receptgroep> newReceptengroepen = new ArrayList();
        List<Old.Recept.Receptgroep> receptengroepen = Import.getReceptgroepen().stream().map(e -> (Old.Recept.Receptgroep) e).collect(Collectors.toList());

        receptengroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.Recepten.Receptgroep receptGroep = new Receptgroep(e.getId_receptgroep(), omschrijving);
            newReceptengroepen.add(receptGroep);
        });

        return newReceptengroepen;
    }

    public static List<Voorraden.Bewaarconditie> oldBewaarconditieToNewBewaarconditie() {
        List<Voorraden.Bewaarconditie> newBewaarcondities = new ArrayList();
        List<Old.Bewaarconditie> bewaarcondities = Import.getBewaarcondities().stream().map(e -> (Old.Bewaarconditie) e).collect(Collectors.toList());

        bewaarcondities.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Voorraden.Bewaarconditie bewaarconditie = new Bewaarconditie(e.getId_bewaarconditie(), omschrijving, false);
            newBewaarcondities.add(bewaarconditie);
        });

        return newBewaarcondities;
    }

    public static List<Voorraden.BewaarTemperatuur> oldBewaarTemperatuurToNewBewaarTemperatuur() {
        List<Voorraden.BewaarTemperatuur> newBewaartemperaturen = new ArrayList();
        List<Old.Bewaartemperatuur> bewaartemperaturen = Import.getBewaartemperaturen().stream().map(e -> (Old.Bewaartemperatuur) e).collect(Collectors.toList());

        bewaartemperaturen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Voorraden.BewaarTemperatuur bewaarTemperatuur = new BewaarTemperatuur(e.getId_bewaartemperatuur(), omschrijving, e.getBewaartemperatuur_minimum(), e.getBewaartemperatuur_maximum(), false);
            newBewaartemperaturen.add(bewaarTemperatuur);
        });
        return newBewaartemperaturen;
    }

    public static List<Producten.Verkoopsverdeelgroep> oldVerdeelgroepToNewVerdeelgroep() {
        List<Producten.Verkoopsverdeelgroep> newVerkoopsverdeelgroepen = new ArrayList();
        List<Old.Verdeelgroep> verdeelgroepen = Import.getVerdeelgroepen().stream().map(e -> (Old.Verdeelgroep) e).collect(Collectors.toList());

        verdeelgroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Producten.Verkoopsverdeelgroep verdeelGroep = new Verkoopsverdeelgroep(e.getId_verdeelgroep(), omschrijving, false);
            newVerkoopsverdeelgroepen.add(verdeelGroep);
        });
        return newVerkoopsverdeelgroepen;
    }

    public static List<Producten.Verkoopsverpakking> oldVerkoopsverpakkingToNewVerkoopsverpakking() {
        List<Producten.Verkoopsverpakking> newVerkoopsverpakking = new ArrayList();
        List<Old.Verkoopsverpakking> verkoopsverpakkingen = Import.getVerkoopsverpakkingen().stream().map(e -> (Old.Verkoopsverpakking) e).collect(Collectors.toList());

        verkoopsverpakkingen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Producten.Verkoopsverdeelgroep verdeelgroep = oldVerdeelgroepToNewVerdeelgroep().stream().filter(t -> t.getId() == e.getId_verdeelgroep()).findFirst().orElse(new Verkoopsverdeelgroep());
            verdeelgroep.setId(e.getId_verdeelgroep());
            Producten.Verkoopsverpakking verpakking = new Verkoopsverpakking(e.getId_verkoopsverpakking(), omschrijving, verdeelgroep, e.getHoeveelheid_verpakking(), e.getHoeveelheid_grootverpakking(), e.getVerdelen_grootverpakking(), e.getCombineren_meerdere_producten(), false);
            newVerkoopsverpakking.add(verpakking);
        });

        return newVerkoopsverpakking;
    }

    public static List<Boekhouding.VasteKost> oldVastekostToNewVastekost() {
        List<Boekhouding.VasteKost> newVastekosten = new ArrayList();
        List<Old.Percentage.PercentageVasteKost> vastekosten = Import.getPercentagevastekosten().stream().map(e -> (Old.Percentage.PercentageVasteKost) e).collect(Collectors.toList());

        vastekosten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Boekhouding.VasteKost vasteKost = new VasteKost(e.getId_vaste_kost(), omschrijving, e.getPercentage_atelierkosten(), e.getPercentage_verkoopkosten(), e.getPercentage_beheerskosten(), e.getPercentage_andere(), false);
            newVastekosten.add(vasteKost);
        });
        return newVastekosten;
    }

    public static List<Boekhouding.OnrechtstreekseKost> oldOnrechtstreekseKostToNewOnrechtstreekseKost() {
        List<Boekhouding.OnrechtstreekseKost> newOnrechtstreekseKosten = new ArrayList();
        List<Old.Percentage.PercentageOnrechtstreekseProductiekost> onrechtstreeksekosten = Import.getPercentageonrechtstreekseproductiekosten().stream().map(e -> (Old.Percentage.PercentageOnrechtstreekseProductiekost) e).collect(Collectors.toList());

        onrechtstreeksekosten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Boekhouding.OnrechtstreekseKost onrechtstreekseKost = new OnrechtstreekseKost(e.getId_onrechtstreekse_produktiekost(), omschrijving, e.getPercentage(), false);
            newOnrechtstreekseKosten.add(onrechtstreekseKost);
        });
        return newOnrechtstreekseKosten;
    }

    public static List<Producten.AfgewerktProduct> oldAfgewerktProductToNewAfgewerktProduct() {
        List<Producten.AfgewerktProduct> newAfgewerktProducten = new ArrayList();
        List<Old.Afgewerkteproducten.Afgewerktproduct> afgewerkteproducten = Import.getAfgewerkteproducten().stream().map(e -> (Old.Afgewerkteproducten.Afgewerktproduct) e).collect(Collectors.toList());

        afgewerkteproducten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Producten.Productiegroep productieGroep = oldProductiegroepToNewProductiegroep().stream().filter(g -> g.getId() == e.getId_produktiegroep()).findFirst().orElse(new Producten.Productiegroep());
            productieGroep.setId(e.getId_produktiegroep());
            Producten.Recepten.Receptgroep receptGroep = oldReceptengroepToNewReceptenGroep().stream().filter(r -> r.getReceptgroepId() == e.getId_receptgroep()).findFirst().orElse(new Producten.Recepten.Receptgroep());
            receptGroep.setId(e.getId_receptgroep());
            Voorraden.VoorraadProduct voorraadProduct = new Voorraden.VoorraadProduct(-1, new Omschrijving(), e.getVoorraad(), e.getVoorraad_maandag(), e.getVoorraad_dinsdag(), e.getVoorraad_woensdag(), e.getVoorraad_donderdag(), e.getVoorraad_vrijdag(), e.getVoorraad_zaterdag(), e.getVoorraad_zondag());
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(v -> v.getId() == e.getId_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadPlaats.setId(e.getId_voorraadplaats());
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(t -> t.getId() == e.getId_etiket()).findFirst().orElse(new Etiket());
            etiket.setId(e.getId_etiket());
            Bewaarconditie bewaarconditie = oldBewaarconditieToNewBewaarconditie().stream().filter(t -> t.getId() == e.getId_bewaarconditie()).findFirst().orElse(new Bewaarconditie());
            bewaarconditie.setId(e.getId_bewaarconditie());
            Voorraden.BewaarTemperatuur bewaarTemperatuur = oldBewaarTemperatuurToNewBewaarTemperatuur().stream().filter(t -> t.getId() == e.getId_bewaartemperatuur()).findFirst().orElse(new BewaarTemperatuur());
            bewaarTemperatuur.setId(e.getId_bewaartemperatuur());
            Omschrijving bereidingswijze = new Omschrijving(-1, e.getBereidingswijze(), e.getBereidingswijze(), e.getBereidingswijze());
            VoorstellingOpProductielijst voorstelling = new VoorstellingOpProductielijst(-1, e.getLijn_na_produktielijst(), e.getArcering_op_produktielijst());
            Job job = new Job();
            job.setId(e.getId_job());
            Producten.Verkoopsverpakking verpakking = oldVerkoopsverpakkingToNewVerkoopsverpakking().stream().filter(t -> t.getId() == e.getId_verkoopsverpakking()).findFirst().orElse(new Verkoopsverpakking());
            verpakking.setId(e.getId_verkoopsverpakking());
            VasteKost vasteKost = oldVastekostToNewVastekost().stream().filter(t -> t.getId() == e.getId_vaste_kost()).findFirst().orElse(new VasteKost());
            vasteKost.setId(e.getId_vaste_kost());
            OnrechtstreekseKost onrechtstreekseKost = oldOnrechtstreekseKostToNewOnrechtstreekseKost().stream().filter(t -> t.getId() == e.getId_onrechtstreekse_produktiekost()).findFirst().orElse(new OnrechtstreekseKost());
            onrechtstreekseKost.setId(e.getId_onrechtstreekse_produktiekost());

            Producten.AfgewerktProduct afgewerktProduct = new AfgewerktProduct(e.getId_afgewerkt_product(), "", omschrijving, productieGroep,
                    receptGroep, convertRecepteenheid(e.getId_recepteenheid()), e.getMoet_gewogen_worden(), e.getMaximaal_meetgewicht(),
                    e.getRelatieve_marge(), e.getAbsolute_marge(), e.getVaste_kost_per_eenheid(), e.getEenheidsgewicht(), Eenheid.Gram,
                    true, e.getDagproduktie(), voorraadProduct, voorraadPlaats, e.getOmschrijving_voorraadplaats(), e.getVoorraad_minimum(), e.getVoorraad_maximum(), e.getEtiket(),
                    etiket, e.getEenheden_etiket(), etiket, bewaarconditie, bewaarTemperatuur, e.getMinimum_aantal_dagen_houdbaar(), bereidingswijze, e.getBestandsnaam_foto(), voorstelling, e.getRecept_wijzigbaar(), job,
                    verpakking, vasteKost, onrechtstreekseKost, e.getBlokkeren(), e.getProduktie_hoeveelheid());

            newAfgewerktProducten.add(afgewerktProduct);

        });
        return newAfgewerktProducten;
    }

    public static List<Producten.VerkoopProductGroep> oldVerkoopProductGroepToNewVerkoopProductGroep() {
        List<Producten.VerkoopProductGroep> newVerkoopProductgroepen = new ArrayList();
        List<Old.Verkoopproducten.Verkoopproductgroep> verkoopproductgroepen = Import.getVerkoopproductgroepen().stream().map(e -> (Old.Verkoopproducten.Verkoopproductgroep) e).collect(Collectors.toList());

        verkoopproductgroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Productiegroep groep = oldProductiegroepToNewProductiegroep().stream().filter(t -> t.getId() == e.getDefault_produktiegroep()).findFirst().orElse(new Productiegroep());
            groep.setId(e.getDefault_produktiegroep());
            Producten.VerkoopProductGroep verkoopProductGroep = new VerkoopProductGroep(e.getId_verkoopproductgroep(), omschrijving, e.getFolder_afbeeldingen(), groep, e.getOnline1());
            newVerkoopProductgroepen.add(verkoopProductGroep);
        });
        return newVerkoopProductgroepen;
    }

    public static List<Materialen.BarcodePrefix> oldBarcodePrefixenToNewBarcodePrefixen() {
        List<Materialen.BarcodePrefix> newBarcodePrefixen = new ArrayList();
        List<Old.Etiket.BarcodePrefix> barcodeprefixen = Import.getBarcodesprefixen().stream().map(e -> (Old.Etiket.BarcodePrefix) e).collect(Collectors.toList());

        barcodeprefixen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Materialen.BarcodePrefix newPrefix = new BarcodePrefix(e.getId_barcodeprefix(), e.getId_barcodeprefix(), omschrijving, e.getPositie_van_tot_artikelcode(), e.getPositie_van_tot_verkoopprijs(), Integer.valueOf(e.getInvoeggetal().length()>0? e.getInvoeggetal() : "0"), false);
            newBarcodePrefixen.add(newPrefix);
        });
        return newBarcodePrefixen;
    }

    public static List<Bedrijven.PrivateLabel> oldKlantPrivateLabelToNewPrivateLabel() {
        List<Bedrijven.PrivateLabel> newPrivateLabels = new ArrayList();
        List<Old.Klant.KlantPrivateLabel> privatelabels = Import.getKlantenlabel().stream().map(e -> (Old.Klant.KlantPrivateLabel) e).collect(Collectors.toList());
        List<Old.Aanspreektitel> aansprekingen = Import.getAansprekingen().stream().map(old -> (Old.Aanspreektitel) old).collect(Collectors.toList());

        privatelabels.forEach(e -> {
            String aanspreking = aansprekingen.stream().filter(t -> t.getId_aanspreektitel() == e.getId_aanspreking()).map(t -> t.getOmschrijvingn()).findFirst().get();
            Adres adres = new Adres(-1, e.getStraat(), e.getHuisnummer(), "", e.getPostcode(), e.getWoonplaats(), Land.België);
            Bedrijven.PrivateLabel newLabel = new PrivateLabel(e.getId_private_label(), aanspreking, e.getNaam(), adres, Taal.Nederlands, e.getUrl(), e.getBestandsnaam_private_logo(), e.getTelefoonnummer());
            newPrivateLabels.add(newLabel);
        });

        return newPrivateLabels;
    }

    public static List<Boekhouding.BTWPercentage> oldBtwcodeToNewBTWPercentage() {
        List<Boekhouding.BTWPercentage> newBtwPercentages = new ArrayList();
        List<Old.Boekhouding.Btwcode> btwpercentages = Import.getBtwcodes().stream().map(e -> (Old.Boekhouding.Btwcode) e).collect(Collectors.toList());

        btwpercentages.forEach(e -> {
            AlgemeneRekening aftrekbaar = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(t -> t.getId() == e.getId_algemene_rekening_aftrekbaar()).findFirst().orElse(new AlgemeneRekening());
            aftrekbaar.setId(e.getId_algemene_rekening_aftrekbaar());
            AlgemeneRekening verschuldigd = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(t -> t.getId() == e.getId_algemene_rekening_verschuldigd()).findFirst().orElse(new AlgemeneRekening());
            verschuldigd.setId(e.getId_algemene_rekening_verschuldigd());

            Boekhouding.BTWPercentage btwPercentage = new BTWPercentage(e.getId_btwcode(), e.getCodeboekhouding(), e.getPercentage(), aftrekbaar, verschuldigd, false);
            newBtwPercentages.add(btwPercentage);
        });

        return newBtwPercentages;
    }

    public static List<Producten.VariantGroep> oldVariantHoofdingToNewVariantGroep() {
        List<Producten.VariantGroep> newVariantgroepen = new ArrayList();
        List<Old.VariantHoofding> varianten = Import.getVariantenhoofding().stream().map(e -> (Old.VariantHoofding) e).collect(Collectors.toList());

        varianten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.VariantGroep groep = new VariantGroep(e.getId_variant_header(), omschrijving, e.getBlokkeren());
            newVariantgroepen.add(groep);
        });

        return newVariantgroepen;
    }

    public static List<Producten.OptieGroep> oldOptieHoofdingToNewOptiegroep() {
        List<OptieGroep> newOptiegroepen = new ArrayList();
        List<Old.OptieHoofding> optiehoofding = Import.getOptieshoofding().stream().map(e -> (Old.OptieHoofding) e).collect(Collectors.toList());

        optiehoofding.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            OptieGroep optieGroep = new OptieGroep(e.getId_option_header(), omschrijving, e.getBlokkeren());
            newOptiegroepen.add(optieGroep);
        });

        return newOptiegroepen;
    }

    public static List<Producten.MicrobiologischeParameter> oldMicrobiologischeToNewMicrobiologische() {
        List<Producten.MicrobiologischeParameter> newMicrobioparameters = new ArrayList();
        List<Old.Parameters.MicrobiologischeParameter> micros = Import.getMicrobiologischeparameters().stream().map(e -> (Old.Parameters.MicrobiologischeParameter) e).collect(Collectors.toList());

        micros.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            String technisch = e.getOmschrijving1() + "," + e.getOmschrijving2() + "," + e.getOmschrijving3() + "," + e.getOmschrijving4() + "," + e.getOmschrijving5() + "," + e.getOmschrijving6() + "," + e.getOmschrijving7() + "," + e.getOmschrijving8() + "," + e.getOmschrijving9();
            Omschrijving tekstTechnischeFiche = new Omschrijving(-1, technisch, "", "");
            Producten.MicrobiologischeParameter parameter = new Producten.MicrobiologischeParameter(e.getId_microbiologische_parameter(), omschrijving, tekstTechnischeFiche);

            newMicrobioparameters.add(parameter);
        });

        return newMicrobioparameters;
    }

    public static List<Tracering.LotnummerType> oldLotnummerTypeToNewLotnummerType() {
        List<Tracering.LotnummerType> newLotnummerTypes = new ArrayList();
        List<Old.Lotnummer.LotnummerType> lotnummertypes = Import.getLotnummertypes().stream().map(e -> (Old.Lotnummer.LotnummerType) e).collect(Collectors.toList());

        lotnummertypes.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Tracering.LotnummerType lotnummerType = new LotnummerType(e.getId_lotnummer_type(), omschrijving, false);
            newLotnummerTypes.add(lotnummerType);
        });
        return newLotnummerTypes;
    }

    public static List<Tracering.LotnummerDrager> oldLotnummerDragerToNewLotnummerDrager() {
        List<Tracering.LotnummerDrager> newLotnummerdragers = new ArrayList();
        List<Old.Lotnummer.LotnummerDrager> lotnummerdragers = Import.getLotnummerdragers().stream().map(e -> (Old.Lotnummer.LotnummerDrager) e).collect(Collectors.toList());

        lotnummerdragers.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Tracering.LotnummerDrager drager = new LotnummerDrager(e.getId_lotnummer_drager(), omschrijving, false);
            newLotnummerdragers.add(drager);
        });
        return newLotnummerdragers;
    }

    public static List<Tracering.LotnummerAanbrenger> oldLotnummerAanbrengerToNewLotnummerAanbrenger() {
        List<Tracering.LotnummerAanbrenger> newLotnummerAanbrengers = new ArrayList();
        List<Old.Lotnummer.LotnummerAanbrenger> lotnummeraanbrengers = Import.getLotnummeraanbrengers().stream().map(e -> (Old.Lotnummer.LotnummerAanbrenger) e).collect(Collectors.toList());

        lotnummeraanbrengers.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Tracering.LotnummerAanbrenger aanbrenger = new LotnummerAanbrenger(e.getId_lotnummer_aanbrenger(), omschrijving, false);
            newLotnummerAanbrengers.add(aanbrenger);
        });
        return newLotnummerAanbrengers;
    }
    
    public static List<Boekhouding.Winstmarge> oldWinstmargesToNewWinstmarge(){
        List<Boekhouding.Winstmarge> newWinstmarges = new ArrayList();
        List<Old.Percentage.PercentageWinstmarge> winstmarges = Import.getPercentagewinstmarges().stream().map(e -> (Old.Percentage.PercentageWinstmarge) e).collect(Collectors.toList());
        
        winstmarges.forEach(e->{
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Boekhouding.Winstmarge winstmarge = new Winstmarge(e.getId_winstmarge(), e.getPercentage(), omschrijving);
            newWinstmarges.add(winstmarge);
        });
        
        return newWinstmarges;
    }
    
    public static List<Producten.DistributieWijze> oldDistributieWijzeToNewDistribibutieWijze(){
         List<Producten.DistributieWijze> newDistributieWijzes = new ArrayList();
        List<Old.Distributiewijze> distri = Import.getDistributiewijzes().stream().map(e -> (Old.Distributiewijze) e).collect(Collectors.toList());
        
        distri.forEach(e->{
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.DistributieWijze distributieWijze = new DistributieWijze(e.getId_distributiewijze(), omschrijving);
            newDistributieWijzes.add(distributieWijze);
        });
        
        return newDistributieWijzes;
        
    }

    public static List<Producten.VerkoopProduct> oldVerkoopProductenToNewVerkoopProducten() {
        List<Producten.VerkoopProduct> newVerkoopProducten = new ArrayList();
        List<Old.Verkoopproducten.Verkoopproduct> verkoopproducten = Import.getVerkoopproducten().stream().map(e -> (Old.Verkoopproducten.Verkoopproduct) e).collect(Collectors.toList());

        verkoopproducten.forEach(e -> {
            VerkoopProductGroep verkoopproductgroep = oldVerkoopProductGroepToNewVerkoopProductGroep().stream().filter(t -> t.getId() == e.getId_verkoopproductgroep()).findFirst().orElse(new VerkoopProductGroep());
            verkoopproductgroep.setId(e.getId_verkoopproductgroep());
            BarcodePrefix prefix = oldBarcodePrefixenToNewBarcodePrefixen().stream().filter(t -> t.getId() == e.getId_barcodeprefix()).findFirst().orElse(new BarcodePrefix());
            prefix.setId(e.getId_barcodeprefix());
            PrivateLabel label = oldKlantPrivateLabelToNewPrivateLabel().stream().filter(t -> t.getId() == e.getId_private_label()).findFirst().orElse(new PrivateLabel());
            label.setId(e.getId_private_label());
            VerkoopsBarcode verpakkingBarcode = new VerkoopsBarcode(0, Util.BigDecimal(e.getGtin_verpakking()), e.getAfdrukken_etiket_verpakking());
            VerkoopsBarcode colliBarcode = new VerkoopsBarcode(0, Util.BigDecimal(e.getGtin_colli()), e.getAfdrukken_etiket_colli());
            VerkoopsBarcode palletBarcode = new VerkoopsBarcode(0, Util.BigDecimal(e.getGtin_palet()), e.getAfdrukken_etiket_palet());
            Verkoopsverpakking vermeldingLeveringsbon = oldVerkoopsverpakkingToNewVerkoopsverpakking().stream().filter(t -> t.getId() == e.getId_verkoopsverpakking()).findFirst().orElse(new Verkoopsverpakking());
            vermeldingLeveringsbon.setId(e.getId_verkoopsverpakking());
            FysischeEigenschap gewicht = new FysischeEigenschap(-1, SoortFysischeEigenschap.Gewicht, e.getFysische_eigenschappen_gewicht_doel(), Eenheid.values()[Integer.valueOf(e.getFysische_eigenschappen_gewicht_eenheid())], e.getFysische_eigenschappen_gewicht_variatie(), null);
            FysischeEigenschap hoogte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Hoogte, e.getFysische_eigenschappen_hoogte_doel(), Eenheid.values()[Integer.valueOf(e.getFysische_eigenschappen_hoogte_eenheid())], e.getFysische_eigenschappen_hoogte_variatie(), null);
            FysischeEigenschap lengte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Lengte, e.getFysische_eigenschappen_lengte_doel(), Eenheid.values()[Integer.valueOf(e.getFysische_eigenschappen_lengte_eenheid())], e.getFysische_eigenschappen_lengte_variatie(), null);
            FysischeEigenschap breedte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Breedte, e.getFysische_eigenschappen_breedte_doel(), Eenheid.values()[Integer.valueOf(e.getFysische_eigenschappen_breedte_eenheid())], e.getFysische_eigenschappen_breedte_variatie(), null);
            FysischeEigenschap diameter = new FysischeEigenschap(-1, SoortFysischeEigenschap.Diameter, e.getFysische_eigenschappen_diameter_doel(), Eenheid.values()[Integer.valueOf(e.getFysische_eigenschappen_diameter_eenheid())], e.getFysische_eigenschappen_diameter_variatie(), null);
            Omschrijving kleurOmschrijving = new Omschrijving(-1, e.getFysische_eigenschappen_kleurn(), e.getFysische_eigenschappen_kleurf(), "");
            Omschrijving afwerkingOmschrijving = new Omschrijving(-1, e.getFysische_eigenschappen_afwerkingn(), e.getFysische_eigenschappen_afwerkingf(), "");
            BTWPercentage percentage = oldBtwcodeToNewBTWPercentage().stream().filter(t -> t.getId() == e.getId_btwcode()).findFirst().get();
            VariantGroep variantGroep = oldVariantHoofdingToNewVariantGroep().stream().filter(t -> t.getId() == e.getId_variant_header()).findFirst().orElse(new VariantGroep());
            variantGroep.setId(e.getId_variant_header());
            OptieGroep optieGroep = oldOptieHoofdingToNewOptiegroep().stream().filter(t -> t.getId() == e.getId_option_header()).findFirst().orElse(new OptieGroep());
            optieGroep.setId(e.getId_option_header());
            Producten.MicrobiologischeParameter micro = oldMicrobiologischeToNewMicrobiologische().stream().filter(t -> t.getId() == e.getId_microbiologische_parameter()).findFirst().orElse(new Producten.MicrobiologischeParameter());
            micro.setId(e.getId_microbiologische_parameter());
            LotnummerType lotnummerType = oldLotnummerTypeToNewLotnummerType().stream().filter(t -> t.getId() == e.getId_lotnummer_type()).findFirst().orElse(new LotnummerType());
            lotnummerType.setId(e.getId_lotnummer_type());
            LotnummerDrager lotnummerDrager = oldLotnummerDragerToNewLotnummerDrager().stream().filter(t -> t.getId() == e.getId_lotnummer_drager()).findFirst().orElse(new LotnummerDrager());
            lotnummerDrager.setId(e.getId_lotnummer_drager());
            LotnummerAanbrenger lotnummerAanbrenger = oldLotnummerAanbrengerToNewLotnummerAanbrenger().stream().filter(t->t.getId()==e.getId_lotnummer_aanbrenger()).findFirst().orElse(new LotnummerAanbrenger());
            lotnummerAanbrenger.setId(e.getId_lotnummer_aanbrenger());
            Omschrijving productBeschrijving =  new Omschrijving(-1, e.getProductbeschrijvingn(), e.getProductbeschrijvingf(), "");
            Omschrijving gebruiksAanwijzing = new Omschrijving(-1, e.getGebruiksaanwijzingn(), e.getGebruiksaanwijzingf(), "");
            Winstmarge marge = oldWinstmargesToNewWinstmarge().stream().filter(t->t.getId()==e.getId_winstmarge()).findFirst().orElse(new Winstmarge());
            marge.setId(e.getId_winstmarge());
            DistributieWijze distributieWijze = oldDistributieWijzeToNewDistribibutieWijze().stream().filter(t->t.getId()==e.getId_distributiewijze()).findFirst().orElse(new DistributieWijze());
            distributieWijze.setId(e.getId_distributiewijze());
            Omschrijving ingredienten = new Omschrijving(-1, e.getIngredientenn(), e.getIngredientenf(), e.getIngredientene());
            
            Producten.VerkoopProduct verkoopProduct = new VerkoopProduct(e.getId_verkoopproduct(), e.getOnline_beschikbaar(), e.getOnline_laatst_aangemaakt(),
                    "Geen code opgegeven", verkoopproductgroep, prefix, label, convertVerpakkingsEenheid(e.getId_verpakkingseenheid()), convertVerpakkingsEenheid(e.getId_verpakkingseenheid2()), e.getAantal_stuks_verpakking(),
                    verpakkingBarcode, e.getAantal_verpakkingen_colli(), colliBarcode, e.getAantal_collis_pallet(), palletBarcode,
                    vermeldingLeveringsbon, gewicht, hoogte, lengte, breedte, diameter, kleurOmschrijving, afwerkingOmschrijving, percentage, e.getHuidige_verkoopprijs1(), Eenheid.values()[e.getId_verkoopeenheid()],
                    variantGroep, optieGroep, micro, lotnummerType, lotnummerDrager, lotnummerAanbrenger, productBeschrijving, gebruiksAanwijzing, marge, distributieWijze, ingredienten);
            
            newVerkoopProducten.add(verkoopProduct);
        });
        
        return newVerkoopProducten;
    }
}
