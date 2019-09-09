/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;
import java.sql.Date;
import Adressen.Adres;
import Adressen.OntvangstAdres;
import Algemeen.BereikbaarheidOpDag;
import Algemeen.Omschrijving;
import Algemeen.Openingstijd;
import Bedrijven.BankRekeningNummer;
import Bedrijven.Bedrijf;
import Bedrijven.Fabrikant;
import Bedrijven.FunctieVanPersoon;
import Bedrijven.PrivateLabel;
import Bedrijven.Verlof;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Bestellingen.Bestelbon;
import Bestellingen.Kassabestelling;
import Bestellingen.Klant;
import Bestellingen.KlantVerdeelGroep;
import Bestellingen.Ontvangstbon;
import Bestellingen.OrderPicking;
import Bestellingen.UitgaandeBestelling;
import Bestellingen.Verzendbon;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Boekhouding.BTWPercentage;
import Boekhouding.Bank;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.BoekhoudRekening;
import Boekhouding.Dagboek;
import Boekhouding.OnrechtstreekseKost;
import Boekhouding.VasteKost;
import Boekhouding.Winstmarge;
import Gebruikers.Gebruiker;
import Gebruikers.Werknemer;
import Import.Import;
import Leveringen.Leverancier;
import Leveringen.LeveranciersGroep;
import Leveringen.LeveringsDag;
import Leveringen.Werkplek;
import Materialen.BarcodePrefix;
import Materialen.Etiket;
import Materialen.IPAdres;
import Materialen.Kneder;
import Materialen.Materieelgroep;
import Materialen.Onderhoud;
import Materialen.Printer;
import Materialen.Scanner;
import Materialen.Verpakking;
import Materialen.Weegschaal;
import Materialen.Werkstation;
import Old.Boekhouding.Bankinstelling;
import Old.Boekhouding.OrderpickingDetail;
import Old.Boekhouding.OrderpickingHoofding;
import Old.Boekhouding.VerzendbonDetail;
import Old.Boekhouding.VerzendbonHoofding;
import Old.Etiket.EtiketTekst;
import Old.Levering.LeveringsbonDetail;
import Old.Levering.LeveringsbonHoofding;
import Old.Materieel;
import Old.Parameters.MicrobiologischeParameter;
import Producten.AankoopProduct;
import Producten.AfgewerktProduct;
import Producten.Allergeen;
import Producten.AllergeenGroep;
import Producten.Aroma;
import Producten.BasisProduct;
import Producten.BronVoedingswaarde;
import Producten.DistributieWijze;
import Producten.FysischeEigenschap;
import Producten.Ingrediënt;
import Producten.IngrediëntGroep;
import Producten.Optie;
import Producten.OptieGroep;
import Producten.Origine;
import Producten.ProductCategorie;
import Producten.ProductGroep;
import Producten.ProductSubGroep;
import Producten.Productiegroep;
import Producten.ReceptProduct;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Job;
import Producten.Recepten.Receptgroep;
import Producten.Variant;
import Producten.VariantGroep;
import Producten.VerkoopProduct;
import Producten.VerkoopProductGroep;
import Producten.VerkoopsBarcode;
import Producten.Verkoopsverdeelgroep;
import Producten.Verkoopsverpakking;
import Producten.VoorbereidProduct;
import Producten.VoorstellingOpProductielijst;
import Tracering.LotnummerAanbrenger;
import Tracering.LotnummerDrager;
import Tracering.LotnummerType;
import TussenTabellen.AankoopProductLeverancier;
import TussenTabellen.KlantAdres;
import TussenTabellen.VestigingAankoopProduct;
import Utils.Util;
import Voorraden.BewaarTemperatuur;
import Voorraden.Bewaarconditie;
import Voorraden.VoorraadPlaats;
import Voorraden.VoorraadProduct;
import Voorraden.Voorraadcorrectie;
import enums.AllergeenType;
import enums.BereikbaarOpDag;
import enums.BtwCode;
import enums.DayOfWeek;
import enums.Eenheid;
import enums.EtiketPrintMogelijkheid;
import enums.EtiketType;
import enums.FunctieVanIngrediënt;
import enums.InhoudLeveringsbonnen;
import enums.Land;
import enums.LeveringsFrequenties;
import enums.MuntEenheid;
import enums.Printertype;
import enums.ScannerType;
import enums.Solvabiliteit;
import enums.SoortFysischeEigenschap;
import enums.Taal;
import enums.VerpakkingsEenheid;
import enums.Webshop_API;
import enums.WeegschaalModel;
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

    private static int returnEenheidindex(String eenheid) {
        if (eenheid.toLowerCase().equals("cm")) {
            return Eenheid.Centimeter.ordinal();
        }
        return Util.Int(eenheid);
    }

    private static FunctieVanIngrediënt convertFunctieIngredient(int id) {
        switch (id) {
            case -9000:
                return FunctieVanIngrediënt.Vitamine;
            case -8000:
                return FunctieVanIngrediënt.Kruid;
            case -7000:
                return FunctieVanIngrediënt.Specerij;
            case -6200:
                return FunctieVanIngrediënt.Rookaroma;
            case -6100:
                return FunctieVanIngrediënt.NatuurlijkAroma;
            case -5100:
                return FunctieVanIngrediënt.Aroma;
            case -5050:
                return FunctieVanIngrediënt.GedeeltelijkGehardPlantaardigVet;
            case -5000:
                return FunctieVanIngrediënt.PlantaardigVet;
            case -4100:
                return FunctieVanIngrediënt.GeheelGehardePlantaardigeOlie;
            case -4050:
                return FunctieVanIngrediënt.GedeeltelijkGehardePlantaardigeOlie;
            case -4000:
                return FunctieVanIngrediënt.PlantaardigeOlie;
            case -3000:
                return FunctieVanIngrediënt.ZwavelEnSulfieten;
            case -2000:
                return FunctieVanIngrediënt.Additief;
            case -1000:
                return FunctieVanIngrediënt.Cacaobestanddelen;
            case -999:
                return FunctieVanIngrediënt.Ingrediënt;
            case -29:
                return FunctieVanIngrediënt.Zoutvervanger;
            case -28:
                return FunctieVanIngrediënt.Klaringsmiddel;
            case -27:
                return FunctieVanIngrediënt.Sequestreermiddel;
            case -26:
                return FunctieVanIngrediënt.Kleurbehoud;
            case -25:
                return FunctieVanIngrediënt.Stabilisator;
            case -24:
                return FunctieVanIngrediënt.Complexvormer;
            case -23:
                return FunctieVanIngrediënt.Drijfgas;
            case -22:
                return FunctieVanIngrediënt.Bevochtigingsmiddel;
            case -21:
                return FunctieVanIngrediënt.Geleermiddelen;
            case -20:
                return FunctieVanIngrediënt.Verstevigingsmiddelen;
            case -19:
                return FunctieVanIngrediënt.Smeltzout;
            case -18:
                return FunctieVanIngrediënt.Vulstof;
            case -17:
                return FunctieVanIngrediënt.AntiKlonterMiddelen;
            case -16:
                return FunctieVanIngrediënt.Glansmiddelen;
            case -15:
                return FunctieVanIngrediënt.Zoetstoffen;
            case -14:
                return FunctieVanIngrediënt.Voedingszuren;
            case -13:
                return FunctieVanIngrediënt.Rijsmiddelen;
            case -12:
                return FunctieVanIngrediënt.Zuurteregelaars;
            case -11:
                return FunctieVanIngrediënt.Meelverbeteraars;
            case -10:
                return FunctieVanIngrediënt.GemodificeerdZetmeel;
            case -9:
                return FunctieVanIngrediënt.AntiSchuimmiddelen;
            case -8:
                return FunctieVanIngrediënt.Conserveermiddelen;
            case -7:
                return FunctieVanIngrediënt.Smaakversterkers;
            case -6:
                return FunctieVanIngrediënt.Additieven;
            case -5:
                return FunctieVanIngrediënt.Emulgatoren;
            case -4:
                return FunctieVanIngrediënt.AntiOxidanten;
            case -3:
                return FunctieVanIngrediënt.Conserveermiddelen;
            case -2:
                return FunctieVanIngrediënt.Kleurstoffen;
            case -1:
                return FunctieVanIngrediënt.Onbekend;
            default:
                return FunctieVanIngrediënt.Onbekend;
        }
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

            Adres adres = new Adres(-1, old.getStraat(), old.getHuisnummer(), "", old.getPostcode(), old.getWoonplaats(), Land.België);
            Bedrijven.Bedrijf bedrijf = new Bedrijven.Bedrijf(old.getId_bedrijf(), old.getNaam(), old.getTelefoonnummer(), old.getEmailadres(), adres);
            Bank bank = oldBankinstellingToNewBank().stream().filter(e -> e.getBankId() == old.getId_bank()).findFirst().orElse(new Bank());
            bank.setId(old.getId_bank());

            BankRekeningNummer bankRekeningNummer = new BankRekeningNummer(-1, old.getIban(), bank);
            newVestigingen.add(new Vestiging(-1, bedrijf, new Omschrijving(-1, old.getNaam(), old.getNaam(), old.getNaam()), adres, old.getTelefoonnummer(), old.getEmailadres(), bankRekeningNummer, old.getOndernemingsnummer(), old.getVestigingsnummer()));
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
            newOntvangstAdressen.add(new OntvangstAdres(bean.getId_leveradres(), new Adres(-1, bean.getStraat(), bean.getHuisnummer(), "", bean.getPostcode(), bean.getWoonplaats(), Land.België), bean.getRoepnaam(), bean.getTelefoonnummer()));
        }

        return newOntvangstAdressen;
    }

    public static List<Producten.ReceptProduct> oldReceptproductToNewReceptproduct() {
        List<Producten.ReceptProduct> newReceptproducten = new ArrayList();
        List<Old.Recept.Receptproduct> receptProducten = Import.getReceptproducten().stream().map(old -> (Old.Recept.Receptproduct) old).collect(Collectors.toList());

        for (Old.Recept.Receptproduct bean : receptProducten) {
            newReceptproducten.add(new ReceptProduct(bean.getId_receptproduct(), new Omschrijving(-1, bean.getOmschrijvingn(), bean.getOmschrijvingf(), bean.getOmschrijvinge()), convertRecepteenheid(bean.getId_recepteenheid()),
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

            newBestelvoorstellen.add(new Bestellingen.BestelVoorstel(-1, newBedrijf.Vestigingen.get(0), adres, receptProduct));
        }
        return newBestelvoorstellen;
    }

    public static List<Bestellingen.Bestelbon> oldBestelbonHoofdingToNewBestelbon() {
        List<Bestellingen.Bestelbon> newBestelbonnen = new ArrayList();

        List<Old.Bestelling.BestelbonHoofding> bestelbonnenhoofding = Import.getBestelbonnenhoofding().stream().map(old -> (Old.Bestelling.BestelbonHoofding) old).collect(Collectors.toList());

        for (Old.Bestelling.BestelbonHoofding hoofding : bestelbonnenhoofding) {
            Bedrijven.Vestiging vestiging = oldBedrijfToNewBedrijf().stream().filter(e -> e.getBedrijfId() == hoofding.getId_bedrijf()).findFirst().get().Vestigingen.get(0);
            Adressen.OntvangstAdres ontvangstAdres = oldLeveringsAdresToOntvangstAdres().stream().filter(e -> e.getId() == hoofding.getId_leveradres()).findFirst().get();
            Leverancier leverancier = oldLeverantierToNewLeverancier().stream().filter(t->t.getId()==hoofding.getId_leverancier()).findFirst().orElse(new Leverancier());
            newBestelbonnen.add(new Bestellingen.Bestelbon(hoofding.getId_bestelbon(), vestiging, ontvangstAdres,leverancier));
        }

        return newBestelbonnen;
    }

    public static List<Leveringen.Leverancier> oldLeverantierToNewLeverancier() {
        List<Old.Leverancier> leveranciers = Import.getLeveranciers().stream().map(old -> (Old.Leverancier) old).collect(Collectors.toList());
        List<Old.Aanspreektitel> aansprekingen = Import.getAansprekingen().stream().map(old -> (Old.Aanspreektitel) old).collect(Collectors.toList());
        List<Leveringen.Leverancier> newLeveranciers = new ArrayList();

        for (Old.Leverancier l : leveranciers) {
            String aanspreking = aansprekingen.stream().filter(a -> a.getId_aanspreektitel() == l.getId_aanspreking()).findFirst().get().getOmschrijvingn();
            //GENERATE ID voor ADRES
            Adressen.Adres adres = new Adres(-1, l.getStraat(), l.getHuisnummer(), "", l.getPostcode(), l.getWoonplaats(), Land.values()[l.getId_land() - 1]);
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
            //GEEN LINKEN, bestaat niet!
            //LIST VERLOVEN
            verloven.add(new Verlof(-1, l.getBegindatum_verlofperiode1(), l.getEinddatum_verlofperiode1()));
            verloven.add(new Verlof(-1, l.getBegindatum_verlofperiode2(), l.getEinddatum_verlofperiode2()));
            verloven.add(new Verlof(-1, l.getBegindatum_verlofperiode3(), l.getEinddatum_verlofperiode3()));
            //GEEN OPENINGUREN, ALLEEN DAGEN.
            if (!l.getGesloten1()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Monday, "", "", "", ""));
            }
            if (!l.getGesloten2()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Tuesday, "", "", "", ""));
            }
            if (!l.getGesloten3()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Wednesday, "", "", "", ""));
            }
            if (!l.getGesloten4()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Thursday, "", "", "", ""));
            }
            if (!l.getGesloten5()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Friday, "", "", "", ""));
            }
            if (!l.getGesloten6()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Saturday, "", "", "", ""));
            }
            if (!l.getGesloten7()) {
                openingstijden.add(new Openingstijd(-1, DayOfWeek.Sunday, "", "", "", ""));
            }
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Monday, l.getLevering1()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Tuesday, l.getLevering2()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Wednesday, l.getLevering3()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Thursday, l.getLevering4()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Friday, l.getLevering5()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Saturday, l.getLevering6()));
            leveringsdagen.add(new LeveringsDag(-1, DayOfWeek.Sunday, l.getLevering7()));
            
            verloven.forEach(e->e.setLeverancierId(l.getId_leverancier()));
            openingstijden.forEach(e->e.setLeverancierId(l.getId_leverancier()));
            leveringsdagen.forEach(e->e.setLeverancierId(l.getId_leverancier()));
            
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
            newLeveranciersGroepen.add(new LeveranciersGroep(groep.getId_leveranciersgroep(), new Omschrijving(-1, groep.getOmschrijvingn(), groep.getOmschrijvingf(), "")));
        });

        return newLeveranciersGroepen;
    }

    public static List<Boekhouding.BetalingsVoorwaarde> oldBetalingsVoorwaardeToNewBetalingsVoorwaarde() {
        List<Old.Boekhouding.Betalingsvoorwaarde> betalingsvoorwaardes = Import.getBetalingsvoorwaardes().stream().map(old -> (Old.Boekhouding.Betalingsvoorwaarde) old).collect(Collectors.toList());
        List<Boekhouding.BetalingsVoorwaarde> newBetalingsVoorwaardes = new ArrayList();

        betalingsvoorwaardes.forEach(v -> {
            newBetalingsVoorwaardes.add(new BetalingsVoorwaarde(new Omschrijving(-1, v.getOmschrijvingn(), v.getOmschrijvingf(), ""), v.getId_betalingsvoorwaarde(), v.getCodeboekhouding(), "/", v.getAantaldagen(), Boolean.valueOf(v.getCodeberekenenvervaldatum())));
        });

        return newBetalingsVoorwaardes;

    }

    public static List<Boekhouding.Dagboek> oldDagboekToNewDagboek() {
        List<Old.Dagboek> dagboeken = Import.getDagboeken().stream().map(e -> (Old.Dagboek) e).collect(Collectors.toList());
        List<Boekhouding.Dagboek> newDagboeken = new ArrayList();

        dagboeken.forEach(dagboek -> {
            newDagboeken.add(new Dagboek(dagboek.getId_dagboek(), new Omschrijving(-1, dagboek.getOmschrijvingn(), dagboek.getOmschrijvingf(), ""), dagboek.getCodeboekhouding(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), new AlgemeneRekening(), false));
        });

        return newDagboeken;

    }

    public static List<Boekhouding.AlgemeneRekening> oldBoekhoudrekeningToAlgemeneRekening() {
        List<Old.Boekhoudrekening> boekhoudrekeningen = Import.getBoekhoudrekeningen().stream().map(e -> (Old.Boekhoudrekening) e).collect(Collectors.toList());
        List<Boekhouding.AlgemeneRekening> newAlgemeneRekeningen = new ArrayList();

        boekhoudrekeningen.forEach(b -> {
            AlgemeneRekening rek = new AlgemeneRekening(new Omschrijving(-1, b.getOmschrijvingn(), b.getOmschrijvingf(), "/"), b.getId_boekhoudrekening(), b.getBoekhoudrekening(), b.getHoeveelheid_verplicht(), b.getIs_aankoop(), b.getIs_korting(), b.getIs_diverse(), b.getIs_btw());
            newAlgemeneRekeningen.add(rek);
        });

        return Export.deleteDuplicates(newAlgemeneRekeningen);
    }

    public static List<Producten.AankoopProduct> oldAankoopproductToNewAankoopproduct() {
        List<Old.Aankoopproducten.Aankoopproduct> aankoopproducten = Import.getAankoopproducten().stream().map(e -> (Old.Aankoopproducten.Aankoopproduct) e).collect(Collectors.toList());
        List<Producten.AankoopProduct> newAankoopproducten = new ArrayList();

        for (Old.Aankoopproducten.Aankoopproduct a : aankoopproducten) {
            Omschrijving omschrijving = new Omschrijving(-1, a.getOmschrijvingn(), a.getOmschrijvingf(), "");
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
        }

        //BIGDATA
        int j = 0;
        for (Old.Old e : Import.getAankoopproductenleveranciers()) {
            Old.Aankoopproducten.AankoopproductLeverancier al = (Old.Aankoopproducten.AankoopproductLeverancier) e;
            AankoopProduct aankoopProduct = newAankoopproducten.stream().filter(t -> t.getId() == al.getId_aankoopproduct()).findFirst().orElse(null);
            Leverancier leverancier = oldLeverantierToNewLeverancier().stream().filter(t -> t.getId() == al.getId_leverancier()).findFirst().orElse(null);
            if (aankoopProduct != null && leverancier != null) {
                TussenTabellen.AankoopProductLeverancier tussen = new AankoopProductLeverancier(-1, aankoopProduct, leverancier);
                aankoopProduct.getAankoopProductLeveranciers().add(tussen);
                leverancier.getLeverancierAankoopProducten().add(tussen);
            }

        }

        return newAankoopproducten;
    }

    public static List<Producten.ProductGroep> oldProductgroepToNewProductGroep() {
        List<Producten.ProductGroep> newProductgroepen = new ArrayList();
        List<Old.Product.Productgroep> productgroepen = Import.getProductgroepen().stream().map(e -> (Old.Product.Productgroep) e).collect(Collectors.toList());

        productgroepen.forEach(p -> {
            Omschrijving omschrijving = new Omschrijving(-1, p.getOmschrijvingn(), p.getOmschrijvingf(), "");
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
            Omschrijving omschrijving = new Omschrijving(-1, p.getOmschrijvingn(), p.getOmschrijvingf(), "");
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
            Omschrijving omschrijving = new Omschrijving(-1, b.getOmschrijvingn(), b.getOmschrijvingf(), "");
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
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            newEtiketten.add(new Etiket(e.getId_etiket(), e.getNaam(),
                    omschrijving, type, printer));
        }

        return newEtiketten;
    }

    public static List<Materialen.Printer> oldPrinterToNewPrinter() {
        List<Materialen.Printer> newPrinters = new ArrayList();
        List<Old.Printer> printers = Import.getPrinters().stream().map(p -> (Old.Printer) p).collect(Collectors.toList());

        printers.forEach(p -> {
            Omschrijving locatie = new Omschrijving(-1, p.getLocatien(), p.getLocatief(), "");
            Omschrijving omschrijving = new Omschrijving(-1, p.getNaam(), "", "");
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
            Omschrijving omschrijving = new Omschrijving(-1, vp.getOmschrijvingn(), vp.getOmschrijvingf(), "");
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
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
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
                    e.getRelatieve_marge(), e.getAbsolute_marge(), e.getVaste_kost_per_eenheid(), e.getEenheidsgewicht(), Eenheid.NietGespecifieerd,
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
            Materialen.BarcodePrefix newPrefix = new BarcodePrefix(e.getId_barcodeprefix(), e.getId_barcodeprefix(), omschrijving, e.getPositie_van_tot_artikelcode(), e.getPositie_van_tot_verkoopprijs(), Integer.valueOf(e.getInvoeggetal().length() > 0 ? e.getInvoeggetal() : "0"), false);
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

    public static List<Boekhouding.Winstmarge> oldWinstmargesToNewWinstmarge() {
        List<Boekhouding.Winstmarge> newWinstmarges = new ArrayList();
        List<Old.Percentage.PercentageWinstmarge> winstmarges = Import.getPercentagewinstmarges().stream().map(e -> (Old.Percentage.PercentageWinstmarge) e).collect(Collectors.toList());

        winstmarges.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Boekhouding.Winstmarge winstmarge = new Winstmarge(e.getId_winstmarge(), e.getPercentage(), omschrijving);
            newWinstmarges.add(winstmarge);
        });

        return newWinstmarges;
    }

    public static List<Producten.DistributieWijze> oldDistributieWijzeToNewDistribibutieWijze() {
        List<Producten.DistributieWijze> newDistributieWijzes = new ArrayList();
        List<Old.Distributiewijze> distri = Import.getDistributiewijzes().stream().map(e -> (Old.Distributiewijze) e).collect(Collectors.toList());

        distri.forEach(e -> {
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
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Productiegroep productiegroep = oldProductiegroepToNewProductiegroep().stream().filter(a -> a.getId() == e.getId_produktiegroep()).findFirst().orElse(new Productiegroep());
            productiegroep.setId(e.getId_produktiegroep());
            Receptgroep receptgroep = null;
            VoorraadProduct voorraadProduct = new VoorraadProduct(-1, new Omschrijving(), e.getVoorraad(), e.getVoorraad_maandag(), e.getVoorraad_dinsdag(), e.getVoorraad_woensdag(), e.getVoorraad_donderdag(), e.getVoorraad_vrijdag(), e.getVoorraad_zaterdag(), e.getVoorraad_zondag());
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(a -> a.getId() == e.getId_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadPlaats.setId(e.getId_voorraadplaats());
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(a -> a.getId() == e.getId_etiket()).findFirst().orElse(new Etiket());
            etiket.setId(e.getId_etiket());
            Bewaarconditie bewaarconditie = oldBewaarconditieToNewBewaarconditie().stream().filter(a -> a.getId() == e.getId_bewaarconditie()).findFirst().orElse(new Bewaarconditie());
            bewaarconditie.setId(e.getId_bewaarconditie());
            BewaarTemperatuur bewaarTemperatuur = oldBewaarTemperatuurToNewBewaarTemperatuur().stream().filter(a -> a.getId() == e.getId_bewaartemperatuur()).findFirst().orElse(new BewaarTemperatuur());
            bewaarTemperatuur.setId(e.getId_bewaartemperatuur());
            VoorstellingOpProductielijst voorstelling = new VoorstellingOpProductielijst(-1, e.getLijn_na_produktielijst(), e.getArcering_op_produktielijst());
            Job job = new Job();
            job.setId(e.getId_job());
            VasteKost vasteKost = oldVastekostToNewVastekost().stream().filter(a -> a.getId() == e.getId_vaste_kost()).findFirst().orElse(new VasteKost());
            vasteKost.setId(e.getId_vaste_kost());
            OnrechtstreekseKost onrechtstreekseKost = oldOnrechtstreekseKostToNewOnrechtstreekseKost().stream().filter(a -> a.getId() == e.getId_onrechtstreekse_produktiekost()).findFirst().orElse(new OnrechtstreekseKost());
            onrechtstreekseKost.setId(e.getId_onrechtstreekse_produktiekost());
            Omschrijving bereidingswijze = new Omschrijving();

            VerkoopProductGroep verkoopproductgroep = oldVerkoopProductGroepToNewVerkoopProductGroep().stream().filter(t -> t.getId() == e.getId_verkoopproductgroep()).findFirst().orElse(new VerkoopProductGroep());
            verkoopproductgroep.setId(e.getId_verkoopproductgroep());
            BarcodePrefix prefix = oldBarcodePrefixenToNewBarcodePrefixen().stream().filter(t -> t.getId() == e.getId_barcodeprefix()).findFirst().orElse(new BarcodePrefix());
            prefix.setId(e.getId_barcodeprefix());
            PrivateLabel label = oldKlantPrivateLabelToNewPrivateLabel().stream().filter(t -> t.getId() == e.getId_private_label()).findFirst().orElse(new PrivateLabel());
            label.setId(e.getId_private_label());
            VerkoopsBarcode verpakkingsBarcode = new VerkoopsBarcode(-1, Util.BigDecimal(e.getGtin_verpakking()), e.getAfdrukken_etiket_verpakking());
            VerkoopsBarcode colliBarcode = new VerkoopsBarcode(-1, Util.BigDecimal(e.getGtin_colli()), e.getAfdrukken_etiket_colli());
            VerkoopsBarcode palletBarcode = new VerkoopsBarcode(-1, Util.BigDecimal(e.getGtin_palet()), e.getAfdrukken_etiket_palet());
            Verkoopsverpakking vermeldingLeveringsbon = oldVerkoopsverpakkingToNewVerkoopsverpakking().stream().filter(t -> t.getId() == e.getId_verkoopsverpakking()).findFirst().orElse(new Verkoopsverpakking());
            vermeldingLeveringsbon.setId(e.getId_verkoopsverpakking());
            FysischeEigenschap gewicht = new FysischeEigenschap(-1, SoortFysischeEigenschap.Gewicht, e.getFysische_eigenschappen_gewicht_doel(), Eenheid.values()[returnEenheidindex(e.getFysische_eigenschappen_gewicht_eenheid())], e.getFysische_eigenschappen_gewicht_variatie());
            FysischeEigenschap hoogte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Hoogte, e.getFysische_eigenschappen_hoogte_doel(), Eenheid.values()[returnEenheidindex(e.getFysische_eigenschappen_hoogte_eenheid())], e.getFysische_eigenschappen_hoogte_variatie());
            FysischeEigenschap lengte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Lengte, e.getFysische_eigenschappen_lengte_doel(), Eenheid.values()[returnEenheidindex(e.getFysische_eigenschappen_lengte_eenheid())], e.getFysische_eigenschappen_lengte_variatie());
            FysischeEigenschap breedte = new FysischeEigenschap(-1, SoortFysischeEigenschap.Breedte, e.getFysische_eigenschappen_breedte_doel(), Eenheid.values()[returnEenheidindex(e.getFysische_eigenschappen_breedte_eenheid())], e.getFysische_eigenschappen_breedte_variatie());
            FysischeEigenschap diameter = new FysischeEigenschap(-1, SoortFysischeEigenschap.Diameter, e.getFysische_eigenschappen_diameter_doel(), Eenheid.values()[returnEenheidindex(e.getFysische_eigenschappen_diameter_eenheid())], e.getFysische_eigenschappen_diameter_variatie());
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
            LotnummerAanbrenger lotnummerAanbrenger = oldLotnummerAanbrengerToNewLotnummerAanbrenger().stream().filter(t -> t.getId() == e.getId_lotnummer_aanbrenger()).findFirst().orElse(new LotnummerAanbrenger());
            lotnummerAanbrenger.setId(e.getId_lotnummer_aanbrenger());
            Omschrijving productBeschrijving = new Omschrijving(-1, e.getProductbeschrijvingn(), e.getProductbeschrijvingf(), "");
            Omschrijving gebruiksAanwijzing = new Omschrijving(-1, e.getGebruiksaanwijzingn(), e.getGebruiksaanwijzingf(), "");
            Winstmarge marge = oldWinstmargesToNewWinstmarge().stream().filter(t -> t.getId() == e.getId_winstmarge()).findFirst().orElse(new Winstmarge());
            marge.setId(e.getId_winstmarge());
            DistributieWijze distributieWijze = oldDistributieWijzeToNewDistribibutieWijze().stream().filter(t -> t.getId() == e.getId_distributiewijze()).findFirst().orElse(new DistributieWijze());
            distributieWijze.setId(e.getId_distributiewijze());
            Omschrijving ingredienten = new Omschrijving(-1, e.getIngredientenn(), e.getIngredientenf(), e.getIngredientene());

            Producten.VerkoopProduct verkoopProduct = new VerkoopProduct(e.getId_verkoopproduct(), "", omschrijving,
                    productiegroep, receptgroep, convertRecepteenheid(e.getId_recepteenheid()), e.getMoet_gewogen_worden(), e.getMaximaal_meetgewicht(), e.getRelatieve_marge(), e.getAbsolute_marge(), e.getVaste_kost_per_eenheid(),
                    e.getEenheidsgewicht(), Eenheid.NietGespecifieerd, e.getGoedgekeurdeingave01(), e.getDagproduktie(),
                    voorraadProduct, voorraadPlaats, e.getOmschrijving_voorraadplaats(), e.getVoorraad_minimum(), e.getVoorraad_maximum(),
                    e.getEtiket(), etiket, e.getEenheden_etiket(), etiket, bewaarconditie, bewaarTemperatuur, e.getMinimum_aantal_dagen_houdbaar(), bereidingswijze, e.getBestandsnaam_foto(), null, voorstelling, e.getRecept_wijzigbaar(),
                    job, vermeldingLeveringsbon, vasteKost, onrechtstreekseKost, e.getBlokkeren(), e.getOnline_beschikbaar(), e.getOnline_laatst_aangemaakt(), "", verkoopproductgroep,
                    prefix, label, convertVerpakkingsEenheid(e.getId_verpakkingseenheid()), convertVerpakkingsEenheid(e.getId_verpakkingseenheid2()),
                    e.getAantal_stuks_verpakking(), verpakkingsBarcode, e.getAantal_verpakkingen_colli(), colliBarcode, e.getAantal_collis_pallet(), palletBarcode, vermeldingLeveringsbon,
                    gewicht, hoogte, lengte, breedte, diameter, kleurOmschrijving, afwerkingOmschrijving, percentage, e.getHuidige_verkoopprijs1(), Eenheid.values()[e.getId_verkoopeenheid()], variantGroep, optieGroep, micro, lotnummerType,
                    lotnummerDrager, lotnummerAanbrenger, productBeschrijving, gebruiksAanwijzing, marge, distributieWijze, ingredienten);

            newVerkoopProducten.add(verkoopProduct);
        });

        return newVerkoopProducten;
    }

    public static List<Producten.VoorbereidProduct> oldVoorbereidProductToNewVoorbereidProduct() {
        List<Producten.VoorbereidProduct> newVoorbereidProducten = new ArrayList();
        List<Old.Voorbereideproducten.Voorbereidproduct> voorbereideProducten = Import.getVoorbereideproducten().stream().map(e -> (Old.Voorbereideproducten.Voorbereidproduct) e).collect(Collectors.toList());

        voorbereideProducten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Productiegroep productiegroep = oldProductiegroepToNewProductiegroep().stream().filter(t -> t.getId() == e.getId_produktiegroep()).findFirst().orElse(new Productiegroep());
            productiegroep.setId(e.getId_produktiegroep());
            Receptgroep receptGroep = oldReceptengroepToNewReceptenGroep().stream().filter(t -> t.getId() == e.getId_receptgroep()).findFirst().orElse(new Receptgroep());
            receptGroep.setId(e.getId_receptgroep());
            VoorraadProduct voorraadProduct = new VoorraadProduct(-1, new Omschrijving(), e.getVoorraad(), e.getVoorraad_maandag(), e.getVoorraad_dinsdag(), e.getVoorraad_woensdag(), e.getVoorraad_donderdag(), e.getVoorraad_vrijdag(), e.getVoorraad_zaterdag(), e.getVoorraad_zondag());
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(t -> t.getId() == e.getId_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadPlaats.setId(e.getId_voorraadplaats());
            Etiket vooraadEtiket = oldEtiketToNewEtiket().stream().filter(t -> t.getId() == e.getId_etiket()).findFirst().orElse(new Etiket());
            vooraadEtiket.setId(e.getId_etiket());
            Bewaarconditie bewaarconditie = oldBewaarconditieToNewBewaarconditie().stream().filter(t -> t.getId() == e.getId_bewaarconditie()).findFirst().orElse(new Bewaarconditie());
            bewaarconditie.setId(e.getId_bewaarconditie());
            BewaarTemperatuur bewaarTemperatuur = oldBewaarTemperatuurToNewBewaarTemperatuur().stream().filter(t -> t.getId() == e.getId_bewaartemperatuur()).findFirst().orElse(new BewaarTemperatuur());
            bewaarTemperatuur.setId(e.getId_bewaartemperatuur());
            Omschrijving bereidingswijze = new Omschrijving(-1, e.getBereidingswijze(), e.getBereidingswijze(), e.getBereidingswijze());
            VoorstellingOpProductielijst voorstelling = new VoorstellingOpProductielijst(-1, e.getLijn_na_produktielijst(), e.getArcering_op_produktielijst());
            Job job = new Job();
            job.setId(e.getId_job());
            Verkoopsverpakking verkoopsverpakking = oldVerkoopsverpakkingToNewVerkoopsverpakking().stream().filter(t -> t.getId() == e.getId_verkoopsverpakking()).findFirst().orElse(new Verkoopsverpakking());
            verkoopsverpakking.setId(e.getId_verkoopsverpakking());
            VasteKost vasteKost = oldVastekostToNewVastekost().stream().filter(t -> t.getId() == e.getId_vaste_kost()).findFirst().orElse(new VasteKost());
            vasteKost.setId(e.getId_vaste_kost());
            OnrechtstreekseKost onrechtStreeksekost = oldOnrechtstreekseKostToNewOnrechtstreekseKost().stream().filter(t -> t.getId() == e.getId_onrechtstreekse_produktiekost()).findFirst().orElse(new OnrechtstreekseKost());
            onrechtStreeksekost.setId(e.getId_onrechtstreekse_produktiekost());

            Producten.VoorbereidProduct voorbereid = new VoorbereidProduct(e.getId_voorbereid_product(), e.getAantal_personen(), "", omschrijving, productiegroep,
                    receptGroep, convertRecepteenheid(e.getId_recepteenheid()), e.getMoet_gewogen_worden(), e.getMaximaal_meetgewicht(), e.getRelatieve_marge(), e.getAbsolute_marge(),
                    e.getVaste_kost_per_eenheid(), e.getEenheidsgewicht(), Eenheid.Stuk, true, e.getDagproduktie(),
                    voorraadProduct, voorraadPlaats, e.getOmschrijving_voorraadplaats(), e.getVoorraad_minimum(), e.getVoorraad_maximum(), e.getEtiket(), vooraadEtiket,
                    e.getEenheden_etiket(), vooraadEtiket, bewaarconditie, bewaarTemperatuur, e.getMinimum_aantal_dagen_houdbaar(), bereidingswijze, e.getBestandsnaam_foto(), null, voorstelling,
                    e.getRecept_wijzigbaar(), job, verkoopsverpakking, vasteKost, onrechtStreeksekost, e.getBlokkeren());

            newVoorbereidProducten.add(voorbereid);
        });
        return newVoorbereidProducten;
    }

    public static List<Bestellingen.UitgaandeBestelling> oldBestelbonDetailsToNewUitgaandeBestelling() {
        List<Bestellingen.UitgaandeBestelling> newUitgaandeBestelling = new ArrayList();
        List<Old.Bestelling.BestelbonDetail> bestelbonnendetails = Import.getBestelbonnendetail().stream().map(old -> (Old.Bestelling.BestelbonDetail) old).collect(Collectors.toList());

        //BIGDATA, CHANGED OBJECT TO ID ONLY
        for (Old.Bestelling.BestelbonDetail detail : bestelbonnendetails) {
                int AankoopProductId = detail.getId_aankoopproduct();
                UitgaandeBestelling bestelling = new UitgaandeBestelling(-1, detail.getUpdated(), detail.getUpdated(), detail.getOpmerking(), detail.getAfgewerkt(), detail.getVolgnummer(), detail.getHoeveelheid(), convertVerpakkingsEenheid(detail.getEenheid()), detail.getEenheidsprijs(), detail.getAantal_eenheden_verpakking(), detail.getAantal_verpakkingen_colli(), detail.getEenheidsgewicht(), detail.getTotaal(), detail.getGeleverde_hoeveelheid(), AankoopProductId, false, true);
                bestelling.setAankoopProductId(detail.getId_aankoopproduct());
                newUitgaandeBestelling.add(bestelling);

        }

      

        return newUitgaandeBestelling;

    }

    public static List<Gebruikers.Gebruiker> oldGebruikersToNewGebruikers() {
        List<Gebruikers.Gebruiker> newGebruikers = new ArrayList();
        List<Old.Gebruiker> gebruikers = Import.getGebruikers().stream().map(old -> (Old.Gebruiker) old).collect(Collectors.toList());

        gebruikers.forEach(e -> {
            Gebruikers.Gebruiker gebruiker = new Gebruiker(e.getId_gebruiker(), e.getNaam(), e.getEmailadres(), e.getEmailadres());
            newGebruikers.add(gebruiker);
        });

        return newGebruikers;
    }

    public static List<FunctieVanPersoon> oldPersoneelsKostenToFunctieVanPersonen() {
        List<FunctieVanPersoon> newFunctieVanPersonen = new ArrayList();
        List<Old.Boekhouding.Personeelskost> personeelskosten = Import.getPersoneelskosten().stream().map(old -> (Old.Boekhouding.Personeelskost) old).collect(Collectors.toList());

        personeelskosten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            FunctieVanPersoon functie = new FunctieVanPersoon(e.getId_uitvoerend_persoon(), omschrijving, e.getBedrag_per_uur());
            newFunctieVanPersonen.add(functie);
        });

        return newFunctieVanPersonen;

    }

    public static List<Gebruikers.Werknemer> oldWerknemersToNewWerknemer() {
        List<Gebruikers.Werknemer> newWerknemers = new ArrayList();
        List<Old.Werknemer> werknemers = Import.getWerknemers().stream().map(old -> (Old.Werknemer) old).collect(Collectors.toList());

        werknemers.forEach(e -> {
            Gebruikers.Werknemer werknemer = new Werknemer(e.getId_werknemer(), e.getNaam(), e.getNaam(), "/","/",new Date(1970,1,1),new Date(1970,1,1),0);
            newWerknemers.add(werknemer);
        });
        return newWerknemers;
    }

    public static List<Materialen.Weegschaal> oldWeegschaallToNewWeegschaal() {
        List<Materialen.Weegschaal> newWeegschalen = new ArrayList();
        List<Old.Weegschaal.Weegschaal> weegschalen = Import.getWeegschalen().stream().map(old -> (Old.Weegschaal.Weegschaal) old).collect(Collectors.toList());

        weegschalen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            IPAdres ipadres = new IPAdres(-1, e.getNetwerkadres());
            Materialen.Weegschaal weegschaal = new Weegschaal(e.getId_weegschaal(), omschrijving, WeegschaalModel.values()[e.getId_weegschaalmodel()], e.getTcp_weegschaal(), ipadres, e.getNetwerkpoort(), e.getMaximaal_meetgewicht());
            newWeegschalen.add(weegschaal);
        });
        return newWeegschalen;
    }

    public static List<Materialen.Kneder> oldKnederToNewKneder() {
        List<Materialen.Kneder> newKneders = new ArrayList();
        List<Old.Kneder> kneders = Import.getKneders().stream().map(old -> (Old.Kneder) old).collect(Collectors.toList());

        kneders.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Materialen.Kneder kneder = new Kneder(e.getId_kneder(), e.getInhoud(), omschrijving);
            newKneders.add(kneder);
        });

        return newKneders;
    }

    public static List<Leveringen.Werkplek> oldWerkplekkenToNewWerkplekken() {
        List<Leveringen.Werkplek> newWerkplekken = new ArrayList();
        List<Old.Werkplek> werkplekken = Import.getWerkplek().stream().map(old -> (Old.Werkplek) old).collect(Collectors.toList());

        werkplekken.forEach(e -> {
            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t->t.getBedrijfId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Leveringen.Werkplek werkplek = new Werkplek(e.getId_werkplek(), omschrijving, e.getBlokkeren(), bedrijf.Vestigingen.get(0));
            newWerkplekken.add(werkplek);
        });

        return newWerkplekken;

    }

    public static List<Producten.AllergeenGroep> oldAllergeenGroepenToNewAllergenenGroep() {
        List<Producten.AllergeenGroep> newAllergeenGroepen = new ArrayList();
        List<Old.Allergeen.Allergeengroep> allergenenGroepen = Import.getAllergeengroepen().stream().map(old -> (Old.Allergeen.Allergeengroep) old).collect(Collectors.toList());

        allergenenGroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.AllergeenGroep allergeengroep = new AllergeenGroep(e.getId_allergeengroep(), omschrijving);
            newAllergeenGroepen.add(allergeengroep);
        });

        return newAllergeenGroepen;
    }

    public static List<Producten.Allergeen> oldAllergenenToNewAllergenen() {
        List<Producten.Allergeen> newAllergenen = new ArrayList();
        List<Old.Allergeen.Allergeen> allergenen = Import.getAllergenen().stream().map(old -> (Old.Allergeen.Allergeen) old).collect(Collectors.toList());

        allergenen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Omschrijving etiketOmschrijving = new Omschrijving(-1, e.getOmschrijvingn_etiketten(), e.getOmschrijvingf_etiketten(), "");
            AllergeenGroep allergeengroep = oldAllergeenGroepenToNewAllergenenGroep().stream().filter(t -> t.getAllergeenGroepId() == e.getId_allergeengroep()).findFirst().orElse(new AllergeenGroep());
            allergeengroep.setId(e.getId_allergeengroep());

            Producten.Allergeen allergeen = new Allergeen(e.getId_allergeen(), etiketOmschrijving, omschrijving, AllergeenType.values()[e.getType()], allergeengroep);
            newAllergenen.add(allergeen);
        });

        return newAllergenen;
    }

    public static List<Producten.BronVoedingswaarde> oldBronvoedingswaardeToNewBronvoedingswaarde() {
        List<Producten.BronVoedingswaarde> newBronvoedingswaardes = new ArrayList();
        List<Old.BronVoedingswaarde> bronvoedingswaardes = Import.getBronvoedingswaarden().stream().map(old -> (Old.BronVoedingswaarde) old).collect(Collectors.toList());

        bronvoedingswaardes.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.BronVoedingswaarde waarde = new BronVoedingswaarde(e.getId_voedingswaarden_bron(), omschrijving, e.getBerekenen(), false);
            newBronvoedingswaardes.add(waarde);
        });

        return newBronvoedingswaardes;
    }

    public static List<Materialen.Scanner> oldWerkstationToNewScanner() {
        List<Scanner> newScanners = new ArrayList();
        List<Old.Werkstation> oldScanners = Import.getWerkstations().stream().map(old -> (Old.Werkstation) old).collect(Collectors.toList());

        oldScanners.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getNaam(), e.getNaam(), e.getNaam());
            Scanner scanner = new Scanner(-1, ScannerType.NietGespecifieerd, omschrijving, e.isBatch_scanner(), e.getScanner_gebruikt_op_werkstation());

            newScanners.add(scanner);
        });
        return newScanners;
    }

    public static List<Producten.IngrediëntGroep> oldIngredientGroepToNewIngredientGroep() {
        List<Producten.IngrediëntGroep> newIngredientenGroepen = new ArrayList();
        List<Old.Ingredient.Ingredientgroep> ingredientenGroepen = Import.getIngredientgroepen().stream().map(old -> (Old.Ingredient.Ingredientgroep) old).collect(Collectors.toList());

        ingredientenGroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.IngrediëntGroep groep = new IngrediëntGroep(e.getId_ingredientgroep(), omschrijving, e.getId_online());

            newIngredientenGroepen.add(groep);
        });

        return newIngredientenGroepen;
    }

    public static List<Producten.Origine> oldOrigineToNewOrigine() {
        List<Producten.Origine> newOrigines = new ArrayList();
        List<Old.Origine> origines = Import.getOrigines().stream().map(old -> (Old.Origine) old).collect(Collectors.toList());

        origines.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.IngrediëntGroep groep = oldIngredientGroepToNewIngredientGroep().stream().filter(t -> t.getId() == e.getId_ingredientgroep()).findFirst().orElse(new IngrediëntGroep());
            groep.setId(e.getId_ingredientgroep());
            Producten.Origine origine = new Origine(e.getId_origine(), omschrijving, false, groep);
            newOrigines.add(origine);
        });

        return newOrigines;
    }

    public static List<Producten.Ingrediënt> oldIngredientenToNewIngredienten() {
        List<Producten.Ingrediënt> newIngredients = new ArrayList();
        List<Old.Ingredient.Ingrediënt> ingredienten = Import.getIngredienten().stream().map(old -> (Old.Ingredient.Ingrediënt) old).collect(Collectors.toList());

        ingredienten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.IngrediëntGroep ingrGroep = oldIngredientGroepToNewIngredientGroep().stream().filter(t -> t.getId() == e.getId_ingredientgroep()).findFirst().orElse(new IngrediëntGroep());
            ingrGroep.setId(e.getId_ingredientgroep());
            Producten.Aroma aroma = new Aroma();
            Producten.Origine origine = oldOrigineToNewOrigine().stream().filter(t -> t.getId() == e.getId_origine()).findFirst().orElse(new Origine());
            origine.setId(e.getId_origine());
            Producten.SoortPlantaardig soort = new Producten.SoortPlantaardig();

            Producten.Ingrediënt ingredient = new Ingrediënt(e.getId_ingredient(),
                    omschrijving, ingrGroep, e.getVermelden_enummer(), e.getTechnologische_functie(), e.getEnum(), convertFunctieIngredient(e.getId_functie()),
                    aroma, origine, soort, "");
            newIngredients.add(ingredient);
        });

        return newIngredients;
    }

    public static List<Producten.Optie> oldOptieDetailsToNewOpties() {
        List<Producten.Optie> newOpties = new ArrayList();
        List<Old.OptieDetail> opties = Import.getOptiesdetail().stream().map(old -> (Old.OptieDetail) old).collect(Collectors.toList());
        opties.forEach(e -> {
            Producten.OptieGroep groep = oldOptieHoofdingToNewOptiegroep().stream().filter(t -> t.getId() == e.getId_option_header()).findFirst().orElse(new OptieGroep());
            groep.setId(e.getId_option_header());
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.Optie optie = new Optie(e.getId_option_detail(), groep, omschrijving, e.getBlokkeren());
            newOpties.add(optie);
        });

        return newOpties;
    }

    public static List<Producten.Variant> oldVariantDetailToNewVariant() {
        List<Producten.Variant> newVarianten = new ArrayList();
        List<Old.VariantDetail> varianten = Import.getVariantendetail().stream().map(old -> (Old.VariantDetail) old).collect(Collectors.toList());

        varianten.forEach(e -> {

            VariantGroep groep = oldVariantHoofdingToNewVariantGroep().stream().filter(t -> t.getId() == e.getId_variant_header()).findFirst().orElse(new VariantGroep());
            groep.setId(e.getId_variant_header());
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Producten.Variant variant = new Variant(e.getId_variant_detail(), groep, omschrijving, e.getBlokkeren());
            newVarianten.add(variant);
        });

        return newVarianten;
    }

    public static List<Voorraden.Voorraadcorrectie> oldVoorraadcorrectieToNewVoorraadCorrectie() {
        List<Voorraden.Voorraadcorrectie> newVoorraadcorrecties = new ArrayList();
        List<Old.Voorraad.Voorraadcorrectie> voorraadcorrecties = Import.getVoorraadcorrecties().stream().map(old -> (Old.Voorraad.Voorraadcorrectie) old).collect(Collectors.toList());
//        List<Old.Boekhouding.VoorraadcorrectieAankoopproduct> voorraadcorrectiesAankoopproducten = Import.getVoorraadcorrectiesaankoopproducten().stream().map(old -> (Old.Boekhouding.VoorraadcorrectieAankoopproduct) old).collect(Collectors.toList());
//        List<Old.Boekhouding.VoorraadcorrectieEigenFabrikaat> voorraadcorrectiesEigenFabrikaten = Import.getVoorraadcorrectieseigenfabrikaten().stream().map(old -> (Old.Boekhouding.VoorraadcorrectieEigenFabrikaat) old).collect(Collectors.toList());

        voorraadcorrecties.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
            Voorraden.Voorraadcorrectie correctie = new Voorraadcorrectie(e.getId_voorraadcorrectie(), omschrijving);
            newVoorraadcorrecties.add(correctie);
        });
//        voorraadcorrectiesAankoopproducten.forEach(e -> {
//            Omschrijving omschrijving = new Omschrijving(-1, e.getOpmerking(), e.e.getOpmerking(), "");
//            Voorraden.Voorraadcorrectie correctie = new Voorraadcorrectie(e.getId_voorraadcorrectie(), omschrijving);
//            newVoorraadcorrecties.add(correctie);
//        });
//        voorraadcorrectiesEigenFabrikaten.forEach(e -> {
//            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), "");
//            Voorraden.Voorraadcorrectie correctie = new Voorraadcorrectie(e.getId_voorraadcorrectie(), omschrijving);
//            newVoorraadcorrecties.add(correctie);
//        });

        return newVoorraadcorrecties;
    }

    public static List<Producten.BasisProduct> oldHalffabrikaatToNewBasisProduct() {
        List<Producten.BasisProduct> newBasisProducten = new ArrayList();
        List<Old.Halffabrikaat> halffabrikaten = Import.getHalffabrikaten().stream().map(old -> (Old.Halffabrikaat) old).collect(Collectors.toList());

        halffabrikaten.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Productiegroep productiegroep = oldProductiegroepToNewProductiegroep().stream().filter(t -> t.getId() == e.getId_produktiegroep()).findFirst().orElse(new Productiegroep());
            productiegroep.setId(e.getId_produktiegroep());
            Receptgroep receptgroep = oldReceptengroepToNewReceptenGroep().stream().filter(t -> t.getId() == e.getId_receptgroep()).findFirst().orElse(new Receptgroep());
            receptgroep.setId(e.getId_receptgroep());
            VoorraadProduct voorraadProduct = new VoorraadProduct(-1, new Omschrijving(), e.getVoorraad(), e.getVoorraad_maandag(), e.getVoorraad_dinsdag(), e.getVoorraad_woensdag(), e.getVoorraad_donderdag(), e.getVoorraad_vrijdag(), e.getVoorraad_zaterdag(), e.getVoorraad_zondag());
            VoorraadPlaats voorraadPlaats = oldVoorraadPlaatsToNewVoorraadPlaats().stream().filter(t -> t.getId() == e.getId_voorraadplaats()).findFirst().orElse(new VoorraadPlaats());
            voorraadPlaats.setId(e.getId_voorraadplaats());
            Etiket etiket = oldEtiketToNewEtiket().stream().filter(t -> t.getId() == e.getId_etiket()).findFirst().orElse(new Etiket());
            etiket.setId(e.getId_etiket());
            Bewaarconditie bewaarconditie = oldBewaarconditieToNewBewaarconditie().stream().filter(t -> t.getId() == e.getId_bewaarconditie()).findFirst().orElse(new Bewaarconditie());
            bewaarconditie.setId(e.getId_bewaarconditie());
            BewaarTemperatuur bewaarTemperatuur = oldBewaarTemperatuurToNewBewaarTemperatuur().stream().filter(t -> t.getId() == e.getId_bewaartemperatuur()).findFirst().orElse(new BewaarTemperatuur());
            bewaarTemperatuur.setId(e.getId_bewaartemperatuur());
            Omschrijving bereidingswijze = new Omschrijving(-1, e.getBereidingswijze(), e.getBereidingswijze(), e.getBereidingswijze());
            VoorstellingOpProductielijst voorstelling = new VoorstellingOpProductielijst(-1, e.getLijn_na_produktielijst(), e.getArcering_op_produktielijst());
            Job job = new Job();
            job.setId(e.getId_job());
            Verkoopsverpakking verpakking = oldVerkoopsverpakkingToNewVerkoopsverpakking().stream().filter(t -> t.getId() == e.getId_verkoopsverpakking()).findFirst().orElse(new Verkoopsverpakking());
            verpakking.setId(e.getId_verkoopsverpakking());
            VasteKost vastekost = oldVastekostToNewVastekost().stream().filter(t -> t.getId() == e.getId_vaste_kost()).findFirst().orElse(new VasteKost());
            vastekost.setId(e.getId_vaste_kost());
            OnrechtstreekseKost onrecht = oldOnrechtstreekseKostToNewOnrechtstreekseKost().stream().filter(t -> t.getId() == e.getId_onrechtstreekse_produktiekost()).findFirst().orElse(new OnrechtstreekseKost());
            onrecht.setId(e.getId_onrechtstreekse_produktiekost());

            Producten.BasisProduct product = new BasisProduct(e.getId_halffabrikaat(), "", omschrijving, productiegroep,
                    receptgroep, convertRecepteenheid(e.getId_recepteenheid()), e.getMoet_gewogen_worden(), e.getMaximaal_meetgewicht(), e.getRelatieve_marge(), e.getAbsolute_marge(), e.getVaste_kost_per_eenheid(), 0.0, Eenheid.NietGespecifieerd,
                    true, e.getDagproduktie(), voorraadProduct, voorraadPlaats, e.getOmschrijving_voorraadplaats(), e.getVoorraad_minimum(), e.getVoorraad_maximum(),
                    e.getEtiket(), etiket, e.getEenheden_etiket(), etiket, bewaarconditie, bewaarTemperatuur, e.getMinimum_aantal_dagen_houdbaar(), bereidingswijze,
                    e.getBestandsnaam_foto(), null, voorstelling, e.getRecept_wijzigbaar(), job, verpakking, vastekost, onrecht, e.getBlokkeren());

            newBasisProducten.add(product);
        });

        return newBasisProducten;
    }

    public static List<Bestellingen.Kassabestelling> oldKassaBestellingHoofdingToNewKassaBestelling() {
        List<Bestellingen.Kassabestelling> newKassabestelling = new ArrayList();
        List<Old.Boekhouding.KassabestellingHoofding> hoofding = Import.getKassabestellinghoofding().stream().map(old -> (Old.Boekhouding.KassabestellingHoofding) old).collect(Collectors.toList());

        hoofding.forEach(e -> {
            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            Klant klant = new Klant();
            klant.setId(e.getId_klant());
            Adres adres = new Adres(-1, e.getStraat(), e.getHuisnummer(), e.getBusnummer(), e.getPostcode(), e.getStraat(), Land.België);
            Gebruiker gebruiker = oldGebruikersToNewGebruikers().stream().filter(t -> t.getUserName() == e.getGebruiker()).findFirst().orElse(new Gebruiker());
            gebruiker.setUserName(e.getGebruiker());
            Bestellingen.Kassabestelling kassa = new Kassabestelling(e.getId_kassabestelling(), bedrijf, klant, e.getId_bestelling_kassa(), e.getUur(), e.getLevering(), e.getNaam(), adres, e.getTelefoon(),
                    e.getEmail(), e.getMemo(), e.getWinkelbestelling(), gebruiker, e.getObv_vaste_bestelling(), e.getProkas_ref_klant(), e.getPercentage_vaste_bestelling());

            newKassabestelling.add(kassa);
        });

        return newKassabestelling;
    }

    public static List<Bestellingen.KassabestellingRecord> oldKassaBestellingDetailToNewKassaBestellingRecord() {
        List<Bestellingen.KassabestellingRecord> newKassabestellingRecords = new ArrayList();
        List<Old.Boekhouding.KassabestellingDetail> details = Import.getKassabestellingdetail().stream().map(old -> (Old.Boekhouding.KassabestellingDetail) old).collect(Collectors.toList());
        //BIGDATA
        int i = 0;
        for (Old.Boekhouding.KassabestellingDetail e : details) {
            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            int VerkoopProductId = e.getId_verkoopproduct();
//            Producten.VerkoopProduct verkoopProduct = oldVerkoopProductenToNewVerkoopProducten().stream().filter(t -> t.getId() == e.getId_verkoopproduct()).findFirst().orElse(new VerkoopProduct());
//            verkoopProduct.setId(e.getId_verkoopproduct());
            Variant variant = oldVariantDetailToNewVariant().stream().filter(t -> t.getId() == e.getId_variant_detail()).findFirst().orElse(new Variant());
            variant.setId(e.getId_variant_detail());
            VariantGroep variantGroep = oldVariantHoofdingToNewVariantGroep().stream().filter(t -> t.getId() == e.getId_variant_header()).findFirst().orElse(new VariantGroep());
            variantGroep.setId(e.getId_variant_header());
            Optie optie = oldOptieDetailsToNewOpties().stream().filter(t -> t.getId() == e.getId_option_detail()).findFirst().orElse(new Optie());
            optie.setId(e.getId_option_detail());
            OptieGroep optieGroep = oldOptieHoofdingToNewOptiegroep().stream().filter(t -> t.getId() == e.getId_option_header()).findFirst().orElse(new OptieGroep());
            optieGroep.setId(e.getId_option_header());
            Bestellingen.Kassabestelling kassaBestelling = oldKassaBestellingHoofdingToNewKassaBestelling().stream().filter(t -> t.getId() == e.getId_kassabestelling()).findFirst().orElse(new Kassabestelling());
            kassaBestelling.setId(e.getId_kassabestelling());

            Bestellingen.KassabestellingRecord record = new Bestellingen.KassabestellingRecord(-1, bedrijf, e.getVolgnummer(), e.getHoeveelheid(),
                    VerkoopProductId, e.getAantal_personen(), variant, variantGroep, optie, optieGroep, e.getOpmerking(), e.getVerdeelticket_afgedrukt(), kassaBestelling);

            newKassabestellingRecords.add(record);
            //if (i == 20) {
                return newKassabestellingRecords;
            //}
            //i++;
        }

        return newKassabestellingRecords;
    }

    public static List<Bestellingen.KlantVerdeelGroep> oldKlantverdeelgroepToNewKlantverdeelgroep() {
        List<Bestellingen.KlantVerdeelGroep> newKlantverdeelgroepen = new ArrayList();
        List<Old.KlantVerdeelgroep> klantverdeelgroepen = Import.getKlantverdeelgroep().stream().map(old -> (Old.KlantVerdeelgroep) old).collect(Collectors.toList());

        klantverdeelgroepen.forEach(e -> {
            Omschrijving omschrijving = new Omschrijving(-1, e.getOmschrijvingn(), e.getOmschrijvingf(), e.getOmschrijvinge());
            Bestellingen.KlantVerdeelGroep groep = new KlantVerdeelGroep(e.getId_klantverdeelgroep(), omschrijving);
            newKlantverdeelgroepen.add(groep);
        });

        return newKlantverdeelgroepen;
    }

    public static List<Bestellingen.Verzendbon> oldVerzendbonToNewVerzendbon() {
        List<Bestellingen.Verzendbon> newVerzendbonnen = new ArrayList();
        List<Old.Boekhouding.VerzendbonDetail> verzendbonnen = Import.getVerzendbondetail().stream().map(old -> (Old.Boekhouding.VerzendbonDetail) old).collect(Collectors.toList());
        //BIGDATA
        int i = 0;
        for (Old.Boekhouding.VerzendbonDetail e : verzendbonnen) {
            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            Bestelbon bon = oldBestelbonHoofdingToNewBestelbon().stream().filter(t -> t.getId() == e.getId_verzendbon()).findFirst().orElse(new Bestelbon());
            bon.setId(e.getId_bestelbon_klant());
            int VerkoopProductId = e.getId_verkoopproduct();
//            VerkoopProduct verkoopProduct = oldVerkoopProductenToNewVerkoopProducten().stream().filter(t -> t.getId() == e.getId_verkoopproduct()).findFirst().orElse(new VerkoopProduct());
//            verkoopProduct.setId(e.getId_verkoopproduct());
            Werknemer werknemer = oldWerknemersToNewWerknemer().stream().filter(t -> t.getId() == e.getId_werknemer()).findFirst().orElse(new Werknemer());
            werknemer.setId(e.getId_werknemer());
            VariantGroep vargroep = oldVariantHoofdingToNewVariantGroep().stream().filter(t -> t.getId() == e.getId_variant_header()).findFirst().orElse(new VariantGroep());
            vargroep.setId(e.getId_variant_header());
            Variant variant = oldVariantDetailToNewVariant().stream().filter(t -> t.getId() == e.getId_variant_detail()).findFirst().orElse(new Variant());
            variant.setId(e.getId_variant_detail());
            OptieGroep optieGroep = oldOptieHoofdingToNewOptiegroep().stream().filter(t -> t.getId() == e.getId_option_header()).findFirst().orElse(new OptieGroep());
            optieGroep.setId(e.getId_option_header());
            Optie optie = oldOptieDetailsToNewOpties().stream().filter(t -> t.getId() == e.getId_option_detail()).findFirst().orElse(new Optie());
            optie.setId(e.getId_option_detail());

            Bestellingen.Verzendbon verzendbon = new Verzendbon(bedrijf, -1, e.getId_verzendbon(), e.getVolgnummer(), bon,
                    VerkoopProductId, e.getHoeveelheid(), Util.BigDecimal(e.getLotnummer_verzendbon()), werknemer,
                    e.getVerkoopprijs(), e.getBasisprijs(), Eenheid.values()[e.getEenheid()], e.getAantal_personen(), vargroep, variant, e.getBedrag_variant(), e.getBedrag_variant_per_eenheid(), optieGroep, optie,
                    e.getBedrag_option(), e.getBedrag_option_per_eenheid(), e.getKortingsbedrag(), e.getKorting_manueel_aangepast(), e.getMag_korting_berekend_worden(), e.getLeveringskost(), e.getLeveringskosten_berekenen(), e.getTotaal_bedrag(), e.getTekst());

            newVerzendbonnen.add(verzendbon);
//            if (i == 20) {
                return newVerzendbonnen;
//            }
//            i++;
        }

        return newVerzendbonnen;
    }

    public static List<Materialen.Werkstation> oldWerkstationToNewWerkstation() {
        List<Materialen.Werkstation> newWerkstations = new ArrayList();
        List<Old.Werkstation> werkstations = Import.getWerkstations().stream().map(old -> (Old.Werkstation) old).collect(Collectors.toList());
        werkstations.forEach(e -> {
            Gebruiker gebruiker = oldGebruikersToNewGebruikers().stream().filter(t -> t.getId() == e.getId_gebruiker()).findFirst().orElse(new Gebruiker());
            gebruiker.setId(e.getId_gebruiker());
            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            Printer etikettenPrinter = oldPrinterToNewPrinter().stream().filter(t -> t.getId() == e.getDefault_etiketten_verpakking_id_printer()).findFirst().orElse(new Printer());
            etikettenPrinter.setId(e.getDefault_etiketten_verpakking_id_printer());
            etikettenPrinter.setPrinterType(Printertype.Etiketten);
            Printer printerPrijskaartjes = oldPrinterToNewPrinter().stream().filter(t -> t.getId() == e.getDefault_prijskaartjes_id_printer()).findFirst().orElse(new Printer());
            printerPrijskaartjes.setId(e.getDefault_prijskaartjes_id_printer());
            printerPrijskaartjes.setPrinterType(Printertype.Kaartjes);

            List<Weegschaal> weegschalen = oldWeegschaallToNewWeegschaal().stream().filter(t -> (t.getId() == e.getId_weegschaal1()) || (t.getId() == e.getId_weegschaal2()) || (t.getId() == e.getId_weegschaal3()) || (t.getId() == e.getId_weegschaal4())).collect(Collectors.toList());

            Materialen.Werkstation werkstation = new Werkstation(Util.Int(e.getId_werkstation()),
                    gebruiker, bedrijf, e.getFolder_in(), e.getFolder_out(), e.getFolder_reports(), e.getFolder_temp(),
                    e.getFolder_images(), e.isIngelogd(), e.getLaatstingelogd(), e.getLaatstuitgelogd(), e.isToetsenbord(), etikettenPrinter,
                    e.getDefault_etiketten_verpakking_etikettenbestand(), e.getFolder_labels(), e.getDefault_etiketten_verpakking_etikettenformaat(), e.getBestand_lotnummers(), e.getFolder_backoffice(),
                    e.getFolder_bestelbonnen(), e.getFolder_export_boekhouding(), e.getFolder_afbeeldingen_aankoopproducten(), e.getFolder_afbeeldingen_eigen_fabrikaten(),
                    e.getFolder_technische_fiches(), e.getFolder_materieel(), e.getFolder_ccp(), e.isBatch_scanner(), e.getNaam(), e.getScanner_gebruikt_op_werkstation(), e.isDefault_moet_gewogen_worden(), e.getDefault_maximaal_meetgewicht(),
                    e.getDefault_relatieve_marge(), e.getDefault_absolute_marge(), e.getFolder_technische_fiches_online(), e.getFolder_bedrijfsdocumenten(), e.getFolder_verzendbonnen(), printerPrijskaartjes, weegschalen);

            newWerkstations.add(werkstation);
        });

        return newWerkstations;
    }

    public static List<Bestellingen.Ontvangstbon> oldLeveringsbonToNewOntvangstbon() {
        List<Bestellingen.Ontvangstbon> newOntvangstbonnen = new ArrayList();
        List<LeveringsbonDetail> details = Import.getLeveringsbonnendetail().stream().map(old -> (LeveringsbonDetail) old).collect(Collectors.toList());
        Import.getLeveringsbonnendetailb().forEach(e -> details.add((LeveringsbonDetail) e));
        List<LeveringsbonHoofding> hoofding = Import.getLeveringsbonnenhoofding().stream().map(old -> (LeveringsbonHoofding) old).collect(Collectors.toList());
        Import.getLeveringsbonnenhoofdingb().forEach(e -> hoofding.add((LeveringsbonHoofding) e));
        //BIGDATA
        int i = 0;
        
        
        for (LeveringsbonDetail e : details) {
            LeveringsbonHoofding hoofd = hoofding.stream().filter(t -> t.getId_leveringsbon() == e.getId_leveringsbon()).findFirst().get();

            Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
            bedrijf.setId(e.getId_bedrijf());
            int AankoopProductId = e.getId_aankoopproduct();
//            AankoopProduct aankoopProduct = oldAankoopproductToNewAankoopproduct().stream().filter(t -> t.getId() == e.getId_aankoopproduct()).findFirst().orElse(new AankoopProduct());
//            aankoopProduct.setId(e.getId_aankoopproduct());
            Gebruiker gebruiker = oldGebruikersToNewGebruikers().stream().filter(t -> t.getId() == e.getId_gebruik()).findFirst().orElse(new Gebruiker());
            gebruiker.setId(e.getId_gebruik());
            Leverancier leverancier = oldLeverantierToNewLeverancier().stream().filter(t -> t.getId() == hoofd.getId_leverancier()).findFirst().orElse(new Leverancier());
            leverancier.setId(hoofd.getId_leverancier());
            Werkstation werkstation = oldWerkstationToNewWerkstation().stream().filter(t -> t.getId() == Util.Int(hoofd.getId_werkstation())).findFirst().orElse(new Werkstation());
            werkstation.setId(Util.Int(hoofd.getId_werkstation()));

            Ontvangstbon onvangstbon = new Ontvangstbon(bedrijf, -1, e.getId_leveringsbon(),
                    e.getVolgnummer(), AankoopProductId, e.getHoeveelheid(), e.getEenheidsprijs(), e.getDatum_houdbaarheid(), Util.BigDecimal(e.getLotnummer()),
                    Eenheid.values()[e.getId_aankoopeenheid()], convertVerpakkingsEenheid(e.getId_verpakkingseenheid()), Eenheid.values()[e.getId_basiseenheid()], MuntEenheid.values()[e.getId_prijseenheid()],
                    e.getAantal_eenheden_verpakking(), e.getAantal_verpakkingen_colli(), e.getAantal_colli_palet(), e.getTotaal(), e.getAantal_etiketten(), e.getLeveringstemperatuur(), e.getEenheidsgewicht(),
                    e.getIs_gefactureerd(), e.getLotnummer_extern(), e.getNetto_gewicht(), Eenheid.values()[e.getGekozen_aankoopeenheid()], gebruiker, e.getDatum_gebruik(),
                    e.getHoeveelheid_reden(), e.getHoeveelheid_vuilbak(), e.getHoeveelheid_geweigerd(), e.getHoeveelheid_terug(), e.getHoeveelheid_in_gebruik(), e.getTonen(), e.getGescand(),
                    leverancier, hoofd.getDatum_leveringsbon(), hoofd.getReferentie(), werkstation, hoofd.getFactuurdatum(), hoofd.getFactuurnummer());

            newOntvangstbonnen.add(onvangstbon);
//            if (i == 20) {
                return newOntvangstbonnen;
//            }
//            i++;

        }

        return newOntvangstbonnen;
    }

    public static List<Klant> oldKlantToNewKlant() {
        List<Klant> newKlanten = new ArrayList();
        List<Old.Klant.Klant> klanten = Import.getKlanten().stream().map(old -> (Old.Klant.Klant) old).collect(Collectors.toList());
        Boekhouding.BoekhoudRekening boekhoudrekening = new BoekhoudRekening();

        klanten.forEach(e -> {
            KlantVerdeelGroep verdeelgroep = oldKlantverdeelgroepToNewKlantverdeelgroep().stream().filter(t -> t.getId() == e.getId_klantverdeelgroep()).findFirst().orElse(new KlantVerdeelGroep());
            verdeelgroep.setId(e.getId_klantverdeelgroep());
            Klant klant = new Klant(e.getId_klant(), e.getNaam(), e.getZoeknaam(), e.getBlokkeren(), e.getOndernemingsnummer(), e.getEmail_verzendbon(), e.getBegin_vakantieperiode(), e.getEinde_vakantieperiode(), e.getNaam_kolom_rasterlijst_klant(), verdeelgroep);
            Adres adres = new Adres(-1, e.getStraat(), e.getHuisnummer(), "", e.getPostcode(), e.getWoonplaats(), Land.België);
            KlantAdres ka = new KlantAdres(klant, adres);
            klant.setKlantAdressen(List.of(ka));
            newKlanten.add(klant);
        });

        return newKlanten;
    }

    public static List<BereikbaarheidOpDag> oldKlantBestellingStandaardToNewBereikbaarheidOpDag() {
        List<BereikbaarheidOpDag> newBereikbaarheden = new ArrayList();
        List<Old.Klant.KlantBestellingStandaard> standaarden = Import.getKlantenbestellingstandaarden().stream().map(old -> (Old.Klant.KlantBestellingStandaard) old).collect(Collectors.toList());
        standaarden.forEach(e -> {
            BereikbaarheidOpDag dag = new BereikbaarheidOpDag(-1, e.getBestelling_standaard_uur(), e.getBestelling_standaard_levering(), e.getBestelling_verzendbon_afdrukken(),
                    e.getBestelling_bestelbon_afdrukken(), e.getBestelling_mail_bestelbon(), e.getBestelling_opmerking(), e.getBestelling_mail_verzendbon(), BereikbaarOpDag.values()[e.getDag_van_de_week()], e.getBestelling());
            newBereikbaarheden.add(dag);
            Klant klant = oldKlantToNewKlant().stream().filter(t -> t.getId() == e.getId_klant()).findFirst().orElse(null);
            if (klant != null) {
                klant.getBereikbaarOpDagen().add(dag);
            }
        });
        return newBereikbaarheden;

    }

    public static List<OrderPicking> oldOrderpickingToNewOrderpicking() {
        List<OrderPicking> newOrderpicking = new ArrayList();
        List<OrderpickingDetail> orderpickingdetails = Import.getOrderpickingdetail().stream().map(old -> (OrderpickingDetail) old).collect(Collectors.toList());
        List<OrderpickingHoofding> orderpickinghoofding = Import.getOrderpickinghoofding().stream().map(old -> (OrderpickingHoofding) old).collect(Collectors.toList());

        //BIGDATA
        int i=0;
        System.out.println(orderpickingdetails.size());
        for (OrderpickingDetail e : orderpickingdetails) {
                OrderpickingHoofding hoofd = orderpickinghoofding.stream().filter(t -> t.getId_orderpicking() == e.getId_orderpicking()).findFirst().orElse(null);
                if (hoofd != null) {
                    int VerkoopProductId = e.getId_verkoopproduct();
//                    VerkoopProduct verkoopProduct = oldVerkoopProductenToNewVerkoopProducten().stream().filter(t -> t.getId() == e.getId_verkoopproduct()).findFirst().orElse(new VerkoopProduct());
//                    verkoopProduct.setId(e.getId_verkoopproduct());
                    VariantGroep varGroep = oldVariantHoofdingToNewVariantGroep().stream().filter(t -> t.getId() == e.getId_variant_header()).findFirst().orElse(new VariantGroep());
                    varGroep.setId(e.getId_variant_header());
                    Variant variant = oldVariantDetailToNewVariant().stream().filter(t -> t.getId() == e.getId_variant_detail()).findFirst().orElse(new Variant());
                    variant.setId(e.getId_variant_detail());
                    OptieGroep opGroep = oldOptieHoofdingToNewOptiegroep().stream().filter(t -> t.getId() == e.getId_option_header()).findFirst().orElse(new OptieGroep());
                    opGroep.setId(e.getId_option_header());
                    Optie optie = oldOptieDetailsToNewOpties().stream().filter(t -> t.getId() == e.getId_option_detail()).findFirst().orElse(new Optie());
                    optie.setId(e.getId_option_detail());
                    Bedrijf bedrijf = oldBedrijfToNewBedrijf().stream().filter(t -> t.getId() == e.getId_bedrijf()).findFirst().orElse(new Bedrijf());
                    bedrijf.setId(e.getId_bedrijf());
                    Klant klant = oldKlantToNewKlant().stream().filter(t -> t.getId() == hoofd.getId_klant()).findFirst().orElse(new Klant());
                    klant.setId(hoofd.getId_klant());
                    Gebruiker gebruiker = oldGebruikersToNewGebruikers().stream().filter(t -> t.getUserName() == hoofd.getGebruiker_probak()).findFirst().orElse(new Gebruiker());
                    gebruiker.setUserName(hoofd.getGebruiker_probak());
                    int KasseBestellingId = hoofd.getId_kassabestelling();
//                    Kassabestelling bestelling = oldKassaBestellingHoofdingToNewKassaBestelling().stream().filter(t -> t.getId() == hoofd.getId_kassabestelling()).findFirst().orElse(new Kassabestelling());
//                    bestelling.setId(hoofd.getId_kassabestelling());

                    OrderPicking order = new OrderPicking(-1, e.getId_orderpicking(), Util.BigDecimal(e.getLotnummer()), e.getHoeveelheid(), e.getVolgnummer(), e.getVolgnummer_verkoopproduct(), VerkoopProductId,
                            e.getVerkoopprijs(), e.getBasisprijs(), e.getAantal_personen(), varGroep, variant, opGroep, optie, e.getKorting_manueel_aangepast(), e.getMag_korting_berekend_worden(),
                            e.getTotaal_bedrag(), e.getTekst(), e.getVerwerkte_hoeveelheid(), e.getHoeveelheid_winkelbestelling(), bedrijf, klant,
                            hoofd.getDatum_orderpicking(), hoofd.getDatum_leveringsbon(), hoofd.getDatum_te_leveren(), hoofd.getReferentie_klant(), hoofd.getDatum_besteld(),
                            hoofd.getUur(), hoofd.getBetaald(), hoofd.getKortingspercentage(), hoofd.getBedrag_betaald(), hoofd.getBedrag_bestelling(), hoofd.getBedrag_korting(), hoofd.getReden_korting(),
                            hoofd.getLevering(), hoofd.getExpress(), hoofd.getFactuur_gewenst(), hoofd.getReferentie(), hoofd.getOpmerking(), gebruiker, KasseBestellingId);

                    newOrderpicking.add(order);
                }
                if(i%100==0)
                    System.out.printf("exported %d orders%n",i);
                i++;

        }
        return newOrderpicking;
    }
}
