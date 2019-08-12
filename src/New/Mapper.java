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
import Bedrijven.Verlof;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Bestellingen.UitgaandeBestelling;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.Dagboek;
import Import.Import;
import Leveringen.Leverancier;
import Leveringen.LeveranciersGroep;
import Leveringen.LeveringsDag;
import Materialen.Etiket;
import Materialen.Printer;
import Materialen.Verpakking;
import Old.Boekhouding.Bankinstelling;
import Old.Etiket.EtiketTekst;
import Producten.AankoopProduct;
import Producten.ProductCategorie;
import Producten.ProductGroep;
import Producten.ProductSubGroep;
import Producten.ReceptProduct;
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
            ProductCategorie productCategorie = oldProductcategorieToNewProductcategorie().stream().filter(pc->pc.getId()==a.getId_productcategorie()).findFirst().get();
            ProductGroep productGroep = oldProductgroepToNewProductGroep().stream().filter(pg->pg.getId()==a.getId_productgroep()).findFirst().get();
            ProductSubGroep productSubgroep = oldProductSubGroepToNewProductSubGroep().stream().filter(ps->ps.getId()==a.getId_productsubgroep()).findFirst().get();
            BestelGroep bestelgroep = oldBestelgroepToNewBestelgroep().stream().filter(bg->bg.getId()==a.getId_bestelgroep()).findFirst().get();
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(v->v.getId()==a.getId_voorraadplaats()).findFirst().get();
            AlgemeneRekening algemeneRekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(e->e.getId()==a.getId_algemene_rekening()).findFirst().get();
            AnalytischeRekening analytischeRekening = new AnalytischeRekening();
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(et->et.getId()==a.getId_etiket()).findFirst().get();
            Bedrijven.Fabrikant fabrikant = oldFabrikantToNewFabrikant().stream().filter(fab->fab.getId()==a.getId_fabrikant()).findFirst().get();
            ReceptProduct receptProduct = oldReceptproductToNewReceptproduct().stream().filter(rp->rp.getId()==a.getId_receptproduct()).findFirst().get();
            
            Producten.AankoopProduct newAankoopproduct = new AankoopProduct(a.getId_aankoopproduct(), 
                    omschrijving, productCategorie, productGroep, productSubgroep, bestelgroep, 
                    VerpakkingsEenheid.values()[0], Eenheid.values()[a.getId_aankoopeenheid()], 
                    Eenheid.values()[a.getId_voorraadeenheid()], Eenheid.values()[a.getId_etiketteneenheid()],
                    a.getAantal_eenheden_verpakking(), a.getAantal_verpakkingen_colli(), a.getNettogewicht_verpakkingseenheid(),
                    a.getBrutogewicht_verpakkingseenheid(), a.getMinimum_bestelhoeveelheid(),a.getVeelvoud_bestelling(), 
                    a.getMinimum_leveringstermijn(), a.getMinimum_aantal_dagen_houdbaar(), a.getVoorraad(), 
                    a.getVoorraad_minimum(), a.getVoorraad_maximum(), voorraadPlaats, BtwCode.values()[a.getId_btwcode()],
                    algemeneRekening, analytischeRekening, a.getDoorverkoop(), 
                    a.getBlokkeren(), a.getInfo(), a.getEenheidsgewicht(), Eenheid.values()[a.getId_basiseenheid()],
                    MuntEenheid.values()[a.getId_prijseenheid()], a.getEtiket_intern(), etiket, Long.valueOf(a.getGtin()), new Materialen.EtiketTekst(), 
                    fabrikant, a.getVerliespercentage(), a.getBestandsnaam_foto(), a.getColli_barcode(),
                    a.getOnmiddellijk_in_gebruik(), a.getBeperkte_houdbaarheid_na_openen(), a.getAantal_dagen_houdbaar_na_openen(), 
                    Eenheid.values()[a.getId_basiseenheid()],a.getAantal_loten_in_gebruik(), 
                    receptProduct);
            
            newAankoopproducten.add(newAankoopproduct);
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

        for(Old.Etiket.Etiket e:etiketten){
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
            if(types.size()>0 && types!=null){
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

    public static List<VoorraadPlaats> oldVoorraadPlaatsToNewVoorraadPlaats(){
        List<VoorraadPlaats> newVoorraadPlaatsen = new ArrayList();
        List<Old.Voorraad.Voorraadplaats> voorraadPlaatsen = Import.getVoorraadplaatsen().stream().map(e -> (Old.Voorraad.Voorraadplaats) e).collect(Collectors.toList());
        
        voorraadPlaatsen.forEach(vp->{
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
            groep.setProductSubGroepen(newProductSubgroepen.stream().filter(subgroep -> subgroep.getProductGroep().getProductGroepId() == groep.getProductGroepId()).collect(Collectors.toList()));
        });

        for(Old.Product.Productcategorie e:productcategorie){
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
            Voorraden.VoorraadPlaats voorraadplaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(vp->vp.getId()==e.getDefault_aankoopproduct_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadplaats.setId(e.getDefault_aankoopproduct_voorraadplaats());
            AlgemeneRekening algemeneRekening = oldBoekhoudrekeningToAlgemeneRekening().stream().filter(rek->rek.getAlgemeneRekeningId()==e.getDefault_aankoopproduct_algemene_rekening()).findFirst().orElse(new AlgemeneRekening());
            algemeneRekening.setId(e.getDefault_aankoopproduct_algemene_rekening());
            AnalytischeRekening analytischeRekening = new AnalytischeRekening();
            analytischeRekening.setId(e.getDefault_aankoopproduct_analytische_rekening());
            Verpakking standaardVerpakking  = new Verpakking(e.getDefault_aankoopproduct_verpakkingseenheid());
            Verpakking colliVerpakking = new Verpakking(e.getDefault_aankoopproduct_collieenheid());
            
            newProductcategorieen.add(new ProductCategorie(e.getId_productcategorie(), omschrijving, productGroep, productSubGroep,
                    fabrikant, bestelgroep, standaardVerpakking, colliVerpakking, Eenheid.values()[e.getDefault_aankoopproduct_basiseenheid()],
                    convertVerpakkingsEenheid(e.getDefault_aankoopproduct_aankoopeenheid()), etiket,
                   convertVerpakkingsEenheid(e.getDefault_aankoopproduct_basiseenheid()),convertVerpakkingsEenheid(e.getDefault_aankoopproduct_voorraadeenheid()), voorraadplaats,
                    BtwCode.values()[e.getDefault_aankoopproduct_btwcode()],convertVerpakkingsEenheid(e.getDefault_aankoopproduct_prijseenheid()), 
                    algemeneRekening, analytischeRekening, e.getDefault_aankoopproduct_doorverkoop(), e.getDefault_aankoopproduct_voorraad(), 
                    e.getDefault_aankoopproduct_afdrukken_etiketten_intern(), e.getDefault_aankoopproduct_afdrukken_etiket_verbruik(),convertVerpakkingsEenheid(e.getDefault_aankoopproduct_id_etiket_verbruik()),
                    e.getDefault_aankoopproduct_beperkt_houdbaar_na_openen(), e.getDefault_aankoopproduct_afdrukken_etiketten_verkoopproducten(),
                    EtiketPrintMogelijkheid.geen, e.getDefault_aankoopproduct_afdrukken_ingredienten(), e.getDefault_receptproduct_hulpstof(),
                    e.getDefault_receptproduct_halffabrikaten(), e.getDefault_receptproduct_voorbereide_producten(), e.getDefault_receptproduct_afgewerkte_producten(), e.getDefault_receptproduct_verkoopproducten()));
        }
        
        return newProductcategorieen;
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
    
    private static VerpakkingsEenheid convertVerpakkingsEenheid(int eenheid){
        switch(eenheid){
            case 0: return VerpakkingsEenheid.Eenheid;
            case 1: return VerpakkingsEenheid.Colli;
            case 2: return VerpakkingsEenheid.Verpakking;
            default: return VerpakkingsEenheid.Eenheid;
        }
    }
}
