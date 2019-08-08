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
import Bestellingen.UitgaandeBestelling;
import Import.Import;
import Old.Boekhouding.Bankinstelling;
import Producten.ReceptProduct;
import enums.Eenheid;
import enums.Land;
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

    public static List<Bestellingen.Bestelbon> oldBestelbonToNewBestelbon() {
        List<Bestellingen.Bestelbon> newBestelbonnen = new ArrayList();
        List<Bestellingen.UitgaandeBestelling> newUitgaandeBestelling = new ArrayList();

        List<Old.Bestelling.BestelbonHoofding> bestelbonnenhoofding = Import.getBestelbonnenhoofding().stream().map(old -> (Old.Bestelling.BestelbonHoofding) old).collect(Collectors.toList());
        List<Old.Bestelling.BestelbonDetail> bestelbonnendetails = Import.getBestelbonnenhoofding().stream().map(old -> (Old.Bestelling.BestelbonDetail) old).collect(Collectors.toList());

        for (Old.Bestelling.BestelbonHoofding hoofding : bestelbonnenhoofding) {

            Bedrijven.Vestiging vestiging = oldBedrijfToNewBedrijf().stream().filter(e -> e.getBedrijfId() == hoofding.getId_bedrijf()).findFirst().get().Vestigingen.get(0);
            Adressen.OntvangstAdres ontvangstAdres = oldLeveringsAdresToOntvangstAdres().stream().filter(e -> e.getId() == hoofding.getId_leveradres()).findFirst().get();

            for (Old.Bestelling.BestelbonDetail detail : bestelbonnendetails) {
                newUitgaandeBestelling.add(new UitgaandeBestelling(0, detail.getInserted(), null, detail.getOpmerking(), detail.getAfgewerkt(), detail.getVolgnummer(), detail.getHoeveelheid(), detail.getEenheid(), detail.getEenheidsprijs(), detail.getAantal_eenheden_verpakking(), detail.getAantal_verpakkingen_colli(), detail.getEenheidsgewicht(), detail.getTotaal(), detail.getGeleverde_hoeveelheid()));
            }

            newBestelbonnen.add(new Bestellingen.Bestelbon(hoofding.getId_bestelbon(), vestiging, ontvangstAdres, ReceptProduct))
        }
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
    
    private static Eenheid convertEenheid(String eenheid){
        
    }
}
