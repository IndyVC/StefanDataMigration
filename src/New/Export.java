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
import Bedrijven.Bedrijf;
import Bedrijven.Eigenaar;
import Bedrijven.Fabrikant;
import Bedrijven.FunctieVanPersoon;
import Bedrijven.PrivateLabel;
import Bedrijven.Verlof;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Bestellingen.BestelVoorstel;
import Bestellingen.Bestelbon;
import Bestellingen.Kassabestelling;
import Bestellingen.KassabestellingRecord;
import Bestellingen.Klant;
import Bestellingen.KlantVerdeelGroep;
import Bestellingen.Ontvangstbon;
import Bestellingen.UitgaandeBestelling;
import Bestellingen.Verzendbon;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Boekhouding.BTWPercentage;
import Boekhouding.Bank;
import Boekhouding.BetalingsVoorwaarde;
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
import Materialen.Materieel;
import Materialen.Materieelgroep;
import Materialen.Onderhoud;
import Materialen.Printer;
import Materialen.Scanner;
import Materialen.Verpakking;
import Materialen.Weegschaal;
import Materialen.Werkstation;
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
import Producten.MicrobiologischeParameter;
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
import Producten.SoortPlantaardig;
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
import TussenTabellen.AankoopProductVerkoopProduct;
import TussenTabellen.KlantAdres;
import TussenTabellen.ReceptProductBasisRecept;
import TussenTabellen.VestigingAankoopProduct;
import Utils.DB;
import Voorraden.BewaarTemperatuur;
import Voorraden.Bewaarconditie;
import Voorraden.VoorraadPlaats;
import Voorraden.VoorraadProduct;
import Voorraden.Voorraadcorrectie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Indy Van Canegem
 *
 * UITLEG: Alles wordt opgehaald door Import klasse. Alles wordt gemuteerd door
 * de Mapper klasse. Alles wordt weggeschreven door de Export klasse.
 *
 * UITLEG EXPORT KLASSE: Verwijder commentaar NOOIT! Je moet weten of het de
 * eerste keer is dat een bepaalde klasse wordt weggeschreven, zodat de boolean
 * deleteAllPrevious op true staat. Daarna mag dit NIET meer.
 *
 * MISSING CLASSES: TAAK? Welke table van vroeger? ONDERHOUD? Welke tabel van
 * vroeger? MATERIEEL heeft geen enkele link om zijn lijsten op te vullen?
 */
public class Export {

    public static List<Bedrijf> newBedrijven;
    public static List<Fabrikant> newFabrikanten;
    public static List<OntvangstAdres> newOntvangstAdressen;
    public static List<BestelVoorstel> newBestelvoorstellen;
    private static List<ReceptProduct> newReceptProducten;
    private static List<UitgaandeBestelling> newUitgaandBestellingen;
    private static List<Bestelbon> newBestelbonnen;
    private static List<LeveranciersGroep> newLeveranciersGroepen;
    private static List<BetalingsVoorwaarde> newBetalingsVoorwaardes;
    private static List<Dagboek> newDagboeken;
    private static List<AlgemeneRekening> newAlgemeneRekeningen;
    private static List<Leverancier> newLeveranciers;
    private static List<BestelGroep> newBestelgroepen;
    private static List<Printer> newPrinters;
    private static List<VoorraadPlaats> newVoorraadPlaatsen;
    private static List<ProductSubGroep> newProductSubGroepen;
    private static List<ProductGroep> newProductgroepen;
    private static List<ProductCategorie> newProductcategorieën;
    private static List<Etiket> newEtiketten;
    private static List<AankoopProduct> newAankoopproducten;
    private static List<Verpakking> newVerpakkingen;
    private static List<AnalytischeRekening> newAnalytischeRekeningen;
    private static List<Bank> newBanken;
    private static List<BasisRecept> newBasisRecepten;
    private static List<Materieelgroep> newMaterieelGroepen;
    private static List<Materieel> newMaterieel;
    private static List<Productiegroep> newProductiegroepen;
    private static List<Receptgroep> newReceptengroepen;
    private static List<Bewaarconditie> newBewaarcondities;
    private static List<BewaarTemperatuur> newBewaarTemperaturen;
    private static List<Verkoopsverdeelgroep> newVerdeelgroepen;
    private static List<Verkoopsverpakking> newVerkoopsverpakking;
    private static List<VasteKost> newVasteKosten;
    private static List<OnrechtstreekseKost> newOnrechtstreekseKosten;
    private static List<AfgewerktProduct> newAfgewerkteProducten;
    private static List<VerkoopProductGroep> newVerkoopProductgroep;
    private static List<BarcodePrefix> newBarcodePrefixen;
    private static List<PrivateLabel> newPrivateLabels;
    private static List<BTWPercentage> newBtwpercentages;
    private static List<VariantGroep> newVariantgroepen;
    private static List<OptieGroep> newOptiegroepen;
    private static List<MicrobiologischeParameter> newMicrobiologischeParameters;
    private static List<LotnummerType> newLotnummertypes;
    private static List<LotnummerDrager> newLotnummerDragers;
    private static List<LotnummerAanbrenger> newLotnummerAanbrengers;
    private static List<Winstmarge> newWinstmarges;
    private static List<DistributieWijze> newDistributiewijzes;
    private static List<VerkoopProduct> newVerkoopProducten;
    private static List<VoorbereidProduct> newVoorbereideProducten;
    private static List<Job> newJobs;
    private static List<Gebruiker> newGebruikers;
    private static List<FunctieVanPersoon> newFunctieVanPersonen;
    private static List<Werknemer> newWerknemers;
    private static List<Weegschaal> newWeegschalen;
    private static List<Kneder> newKneders;
    private static List<Werkplek> newWerkplekken;
    private static List<AllergeenGroep> newAllergeenGroepen;
    private static List<Allergeen> newAllergenen;
    private static List<BronVoedingswaarde> newBronvoedingswaardes;
    private static List<Scanner> newScanners;
    private static List<IngrediëntGroep> newIngredientGroepen;
    private static List<Origine> newOrigines;
    private static List<Ingrediënt> newIngredienten;
    private static List<Optie> newOpties;
    private static List<Variant> newVarianten;
    private static List<Voorraadcorrectie> newVoorraadcorrecties;
    private static List<BasisProduct> newBasisproducten;
    private static List<Kassabestelling> newKassabestellingen;
    private static List<KassabestellingRecord> newKassabestellingRecords;
    private static List<KlantVerdeelGroep> newKlantverdeelgroep;
    private static List<Verzendbon> newVerzendbonnen;
    private static List<Werkstation> newWerkstations;
    private static List<Ontvangstbon> newOntvangstbonnen;
    private static List<Klant> newKlanten;

    public static void export() {
        Import.readOld();

        System.out.println("EXPORT BANK");
        exportBanken(); //done
        System.out.println("EXPORT BEDRIJF");
        exportBedrijf(); //done
        System.out.println("EXPORT ONTVANGSTADRESSEN");
        exportOntvangstAdressen(); //done
        System.out.println("EXPORT RECEPTPRODUCTEN (LISTS NOG NIET OPGEVULD)");
        exportReceptProducten(); //  [ReceptProductTaken; ReceptProductMaterielen; BESTAAT NIET]
        System.out.println("EXPORT BESTELVOORSTELLEN");
        exportBestelvoorstellen(); //done
        System.out.println("EXPORT LEVERANCIERSGROEPEN");
        exportLeveranciersGroepen(); //done
        System.out.println("EXPORT BETALINGSVOORWAARDES");
        exportBetalingsVoorwaardes(); //done
        System.out.println("EXPORT DAGBOEKEN");
        exportDagboeken(); //done
        System.out.println("EXPORT LEVERANCIERS");
        exportLeveranciers(); //done
        System.out.println("EXPORT FABRIKANTEN START");
        exportFabrikanten(); //done
        System.out.println("EXPORT ALGEMENE REKENINGEN");
        exportAlgemeneRekeningen(); //done
        System.out.println("EXPORT BESTELGROEPEN");
        exportBestelgroepen(); //done
        System.out.println("EXPORT PRINTERS");
        exportPrinters(); //done
        System.out.println("EXPORT ETIKETTEN");
        exportEtiketten(); //done
        System.out.println("EXPORT VOORRAADPLAATSEN");
        exportVoorraadPlaatsen(); //done
        System.out.println("EXPORT PRODUCTSUBGROEPEN");
        exportProductSubgroepen(); //done
        System.out.println("EXPORT PRODUCTGROEPEN");
        exportProductgroepen(); //done
        System.out.println("EXPORT PRODUCTCATEGORIEEN");
        exportProductcategorieën(); //done
        System.out.println("EXPORT AANKOOPPRODUCTEN");
        exportAankoopproducten(); //done
        System.out.println("EXPORT UITGAANDEBESTELLINGEN");
        exportBestelbonnenUitgaandeBestellingen();
        System.out.println("EXPORT BASISRECEPTEN");
        exportBasisRecepten();  //BASIS RECEPT NOG OPVULLEN: BasisReceptBasisProducten; BasisReceptAfgewerkteProducten; BasisReceptverkoopProducten; BasisReceptVoorbereidProducten;  [Jobs; BESTAAT NIET] 
        System.out.println("EXPORT MATERIEELGROEPEN");
        exportMaterieelGroepen(); //done
        System.out.println("EXPORT MATERIEEL");
        exportMaterieel(); // [MaterieelBasisProducten; MaterieelAfgewerktProducten; MaterieelVerkoopProducten; MaterieelVoorbereidProducten; MaterieelReceptProducten; BESTAAT NIET]
        //MATERIEEL IS MET NIKS GELINKT?
        // ===> tot nu toe heeft deze geen relaties...
        System.out.println("EXPORT PRODUCTIEGROEPEN");
        exportProductiegroepen(); //done
        System.out.println("EXPORT RECEPTENGROEPEN");
        exportReceptengroepen(); //done
        System.out.println("EXPORT BEWAARCONDITIES");
        exportBewaarcondities(); //done
        System.out.println("EXPORT BEWAARTEMPERATUREN");
        exportBewaarTemperaturen();//done
        System.out.println("EXPORT VERKOOPSVERDEELGROEPEN");
        exportVerdeelgroepen();//done
        System.out.println("EXPORT VERKOOPSVERPAKKING");
        exportVerkoopsverpakking();//done
        System.out.println("EXPORT VASTE KOSTEN");
        exportVastekosten();//done
        System.out.println("EXPORT ONRECHTSTREEKSE KOSTEN");
        exportOnrechtstreekseKosten();//done
        System.out.println("EXPORT AFGEWERKTE PRODUCTEN");
        exportAfgewerkteProducten();// AfgewerktProductBasisRecepten; [AfgewerktProductTaken; AfgewerktProductMaterieel; BESTAAT NIET]
        System.out.println("EXPORT VERKOOP PRODUCTGROEPEN");
        exportVerkoopProductgroepen(); //done
        System.out.println("EXPORT BARCODEPREFIXEN");
        exportBarcodeprefixen(); //done
        System.out.println("EXPORT PRIVATE LABELS");
        exportPrivatelabels(); //done
        System.out.println("EXPORT BTW PERCENTAGES");
        exportBtwpercentages(); //done
        System.out.println("EXPORT VARIANTGROEPEN");
        exportVariantGroepen(); //done
        System.out.println("EXPORT OPTIEGROEPEN");
        exportOptiegroepen(); //done
        System.out.println("EXPORT MICROBIOLOGISCHE PARAMETER");
        exportMicrobiologischeParameters(); //done
        System.out.println("EXPORT LOTNUMMER TYPES");
        exportLotnummertypes(); //done
        System.out.println("EXPORT LOTNUMMER DRAGER");
        exportLotnummerDrager(); //done
        System.out.println("EXPORT LOTNUMMER AANBRENGERS");
        exportLotnummerAanbrengers(); //done
        System.out.println("EXPORT WINSTMARGES");
        exportWinstmarges(); //done
        System.out.println("EXPORT DISTRIBUTIEWIJZES");
        exportDistributiewijzes(); //done
        System.out.println("EXPORT VERKOOPPRODUCT");
        exportVerkoopProducten(); //VERKOOPPRODUCT NOG OPVULLEN: VerkoopProductBasisRecepten;
        System.out.println("EXPORT VOORBEREIDEPRODUCTEN");
        exportVoorbereideProducten(); //VOORBEREIDPRODUCT NOG OPVULLEN: VoorbereidProductBasisRecepten; [VoorbereidProductTaken; VoorbereidProductMaterielen; BESTAAT NIET]
        System.out.println("EXPORT GEBRUIKERS");
        //exportGebruikers();                           //ASPNETURSER tabel!!!???
        System.out.println("EXPORT FUNCTIEVANPERSONEN");
        exportFunctieVanPersonen(); //done
        System.out.println("EXPORT WERKNEMERS");
        exportWerknemers(); //done
        System.out.println("EXPORT WEEGSCHALEN");
        exportWeegschalen(); //done
        System.out.println("EXPORT KNEDERS");
        exportKneders(); //done
        System.out.println("EXPORT WERKPLEKKEN");
        exportWerkplekken(); //done
        System.out.println("EXPORT ALLERGEENGROEPEN");
        exportAllergeengroepen(); //done
        System.out.println("EXPORT ALLERGENEN");
        exportAllergenen(); //done
        System.out.println("EXPORT BRONVOEDINGSWAARDES");
        exportBronvoedingswaardes(); //done
        System.out.println("EXPORT SCANNERS");
        exportScanners(); //done
        System.out.println("EXPORT INGREDIENTGROEPEN");
        exportIngredientGroepen(); //done
        System.out.println("EXPORT ORIGINES");
        exportOrigines(); //done
        System.out.println("EXPORT INGREDIENTEN");
        expotIngredienten(); //done
        System.out.println("EXPORT OPTIES");
        exportOpties(); //done
        System.out.println("EXPORT VARIANTEN");
        exportVarianten(); //done
        System.out.println("EXPORT VOORRAADCORRECTIES");
        exportVoorraadcorrecties(); //done
        System.out.println("EXPORT BASISPRODUCTEN");
        exportBasisproducten();//OPVULLEN: BasisProductVestigingen; BasisProductBasisRecepten; [BasisProductTaken; BasisProductMaterielen; BESTAAT NIET]
        System.out.println("EXPORT KASSABESTELLING");
        exportKassabestellingen(); //GEBRUIKERS EN KLANTEN WERKEN HIER NOG NIET!!! Lijst van KassabestellingenRecords zijn ook nog niet opgevuld
        System.out.println("EXPORT KASSABESTELLING RECORDS");
        exportKassabestellingRecords(); //done
        System.out.println("EXPORT KLANTVERDEELGROEPEN");
        exportKlantverdeelgroep(); //done
        System.out.println("EXPORT VERZENDBONNEN");
        exportVerzendbonnen(); //done
        System.out.println("EXPORT WERKSTATIONS");
        exportWerkstations(); //done
        System.out.println("EXPORT ONTVANGSTBONNEN");
        exportOntvangstbonnen(); //done
        System.out.println("EXPORT KLANTEN");
        exportKlanten(); //Op te vullen= Alle lijsten behalve KlantAdres, maar de andere bestaan allemaal niet?

    }

    public static <T> List<T> removeDuplicates(List<T> newList, List<T> exists) {
        List<Integer> oldIds = new ArrayList();
        List<T> distinct = new ArrayList();
        if (exists.size() > 0 && exists != null) {
            exists.forEach(e -> {
                if (e != null) {
                    oldIds.add(Integer.valueOf(((New) e).getId()));
                }
            });

            newList.forEach(e -> {
                New obj = (New) e;
                if (!oldIds.contains(obj.getId())) {
                    distinct.add(e);
                }
                oldIds.add(obj.getId());
            });

            for (T obj : distinct) {
                exists.add(obj);
            }
        } else {
            newList.forEach(e -> {
                New obj = (New) e;
                if (!oldIds.contains(obj.getId())) {
                    distinct.add(e);
                }
                oldIds.add(obj.getId());
            });

        }
        return distinct;
    }

    public static <T> List<T> deleteDuplicates(List<T> list) {
        List<Integer> oldIds = new ArrayList();
        List<T> distinct = new ArrayList();

        list.forEach(e -> {
            New obj = (New) e;
            if (!oldIds.contains(obj.getId())) {
                distinct.add(e);
            }
            oldIds.add(obj.getId());
        });

        return distinct;
    }

    //EERSTE KEER BANKEN
    public static void exportBanken() {
        newBanken = Mapper.oldBankinstellingToNewBank();
        DB.insert(newBanken, "Banken", Bank.class, true, false);
    }

    //EERSTE KEER BEDRIJVEN, ADRESSEN, VESTIGINGEN, EIGENAARS, BANKREKENINGNUMMERS
    public static void exportBedrijf() {
        newBedrijven = Mapper.oldBedrijfToNewBedrijf();
        DB.insert(newBedrijven, "Bedrijven", Bedrijf.class, true, false);

        List<Adres> bedrijfAdressen = new ArrayList();
        List<Vestiging> vestigingen = new ArrayList();
        List<Eigenaar> eigenaars = new ArrayList();
        List<BankRekeningNummer> bankRekeningNummers = new ArrayList();

        newBedrijven.forEach(bedrijf -> {
            bedrijfAdressen.add(bedrijf.getAdres());
            bedrijf.getVestigingen().forEach(vestiging -> {
                vestigingen.add(vestiging);
                bankRekeningNummers.add(vestiging.getBankRekeningNummer());

            });
            eigenaars.add(new Eigenaar(0, bedrijf.getNaam(), newBedrijven));
        });

        DB.insert(bedrijfAdressen, "Adressen", Adres.class, true, false);
        DB.insert(vestigingen, "Vestiging", Vestiging.class, true, false);
        DB.insert(eigenaars, "Eigenaar", Eigenaar.class, true, true); //EIGENAAR bestond nog niet, dus generate ID.
        DB.insert(bankRekeningNummers, "BankRekeningNummers", BankRekeningNummer.class, true, true);
        eigenaars.forEach(eigenaar -> {
            eigenaar.Bedrijven.forEach(bedrijf -> {
                String query = String.format("UPDATE %s set EigenaarId = %d where BedrijfId = %d;", "Bedrijven", eigenaar.getId(), bedrijf.getId());
                DB.executeCustomQuery(query);
            });
        });
    }

    //EERSTE KEER FABRIKANTEN
    public static void exportFabrikanten() {
        newFabrikanten = Mapper.oldFabrikantToNewFabrikant();
        DB.insert(newFabrikanten, "Fabrikanten", Fabrikant.class, true, false);
    }

    //EERSTE KEER ONTVANGSTADRESSEN
    public static void exportOntvangstAdressen() {
        newOntvangstAdressen = Mapper.oldLeveringsAdresToOntvangstAdres();
        List<Adres> adressen = new ArrayList();

        newOntvangstAdressen.forEach(ontvangstAdres -> {
            adressen.add(ontvangstAdres.Adres);
        });

        DB.insert(adressen, "Adressen", Adres.class, false, true);
        DB.insert(newOntvangstAdressen, "OntvangstAdressen", OntvangstAdres.class, true, false);
    }

    //EERSTE KEER BESTELVOORSTELLEN
    public static void exportBestelvoorstellen() {
        newBestelvoorstellen = Mapper.oldBestelVoorstelToNewBestelVoorstel();
        DB.insert(newBestelvoorstellen, "BestelVoorstellen", BestelVoorstel.class, true, true);
    }

    //EERSTE KEER OMSCRHIJVING = RECEPTPRODUCTEN
    public static void exportReceptProducten() {
        newReceptProducten = Mapper.oldReceptproductToNewReceptproduct();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newReceptProducten.forEach(e -> {
            omschrijvingen.add(e.Omschrijving);
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, true, true);
        DB.insert(newReceptProducten, "ReceptProducten", ReceptProduct.class, true, false);
    }

    //EERSTE KEER LEVERANCIERSGROEPEN
    public static void exportLeveranciersGroepen() {
        newLeveranciersGroepen = Mapper.oldLeveranciersgroepToNewLeveranciersgroep();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newLeveranciersGroepen.forEach(groep -> {
            omschrijvingen.add(groep.Omschrijving);
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newLeveranciersGroepen, "LeveranciersGroepen", LeveranciersGroep.class, true, false);

    }

    //EERSTE KEER BETALINGSVOOWAARDES
    public static void exportBetalingsVoorwaardes() {
        newBetalingsVoorwaardes = Mapper.oldBetalingsVoorwaardeToNewBetalingsVoorwaarde();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newBetalingsVoorwaardes.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBetalingsVoorwaardes, "BetalingsVoorwaarden", BetalingsVoorwaarde.class, true, false);
    }

    //EERSTE KEER DAGBOEKEN
    public static void exportDagboeken() {
        newDagboeken = Mapper.oldDagboekToNewDagboek();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newDagboeken.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newDagboeken, "Dagboeken", Dagboek.class, true, false);
    }

    //EERSTE KEER ALGEMENE REKENINGEN
    public static void exportAlgemeneRekeningen() {
        newAlgemeneRekeningen = Mapper.oldBoekhoudrekeningToAlgemeneRekening();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newAlgemeneRekeningen.forEach(r -> {
            omschrijvingen.add(r.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newAlgemeneRekeningen, "AlgemeneRekeningen", AlgemeneRekening.class, true, false);
    }

    //EERSTE KEER LEVERANCIERS, VERLOF, OPENINGSTIJD, LEVERINGSDAG
    public static void exportLeveranciers() {
        newLeveranciers = Mapper.oldLeverantierToNewLeverancier();
        List<Verlof> verloven = new ArrayList();
        List<Openingstijd> openingstijden = new ArrayList();
        List<LeveringsDag> leveringsdagen = new ArrayList();
        List<Adres> adressen = new ArrayList();

        newLeveranciers.forEach(leverancier -> {
            leverancier.getVerloven().forEach(v -> verloven.add(v));
            leverancier.getOpeningstijden().forEach(v -> openingstijden.add(v));
            leverancier.getLeveringsDagen().forEach(v -> leveringsdagen.add(v));
            adressen.add(leverancier.getAdres());
        });

        DB.insert(deleteDuplicates(adressen), "Adressen", Adres.class, false, true);
        DB.insert(verloven, "Verlof", Verlof.class, true, true);
        DB.insert(openingstijden, "Openingstijd", Openingstijd.class, true, true);
        DB.insert(leveringsdagen, "LeveringsDag", LeveringsDag.class, true, true);
        DB.insert(newLeveranciers, "Leverancier", Leverancier.class, true, false);

        System.out.println("LONG OPERATION!");

        //SKIPBIG
        /*
        newLeveranciers.forEach(leverancier -> {
            leverancier.getVerloven().forEach(verlof -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where VerlofId = %d;", "Verlof", leverancier.getId(), verlof.getId());
                DB.executeCustomQuery(query);
            });
            leverancier.getOpeningstijden().forEach(openingstijd -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where OpeningsTijdId = %d;", "Openingstijd", leverancier.getId(), openingstijd.getId());
                DB.executeCustomQuery(query);
            });
            leverancier.getLeveringsDagen().forEach(leveringsdag -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where LeveringsDagId = %d;", "LeveringsDag", leverancier.getId(), leveringsdag.getId());
                DB.executeCustomQuery(query);
            });
        });*/
        System.out.println("DONE OPERATION!");

    }

    //EERSTE KEER BESTELGROEPEN
    public static void exportBestelgroepen() {
        newBestelgroepen = Mapper.oldBestelgroepToNewBestelgroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newBestelgroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBestelgroepen, "BestelGroepen", BestelGroep.class, true, false);
    }

    //EERSTE KEER PRINTERS
    public static void exportPrinters() {
        newPrinters = Mapper.oldPrinterToNewPrinter();
        List<Omschrijving> omschrijvingen = new ArrayList<>();
        List<Omschrijving> locaties = new ArrayList<>();
        newPrinters.forEach(p -> {
            omschrijvingen.add(p.getOmschrijving());
            locaties.add(p.getLocatieOmschrijvingOmschrijving());
        });
        DB.insert(locaties, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newPrinters, "Printers", Printer.class, true, false);
    }

    //EERSTE KEER VOORRAADPLAATSEN
    public static void exportVoorraadPlaatsen() {
        newVoorraadPlaatsen = Mapper.oldVoorraadPlaatsToNewVoorraadPlaats();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newVoorraadPlaatsen.forEach(v -> {
            omschrijvingen.add(v.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newVoorraadPlaatsen, "VoorraadPlaatsen", VoorraadPlaats.class, true, false);
    }

    //EERSTE KEER PRODUCTSUBGROEP
    public static void exportProductSubgroepen() {
        newProductSubGroepen = Mapper.oldProductSubGroepToNewProductSubGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();

        newProductSubGroepen.forEach(subgroep -> {
            omschrijvingen.add(subgroep.getOmschrijving());
            algemeneRekeningen.add(subgroep.getAlgemeneRekening());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newProductSubGroepen, "ProductSubGroep", ProductSubGroep.class, true, false);
    }

    //EERSTE KEER PRODUCTGROEPEN EN ASSOCIATIE TUSSEN PRODUCTGROEP EN PRODUCTSUBGROEP OPVULLEN
    public static void exportProductgroepen() {
        newProductgroepen = Mapper.oldProductgroepToNewProductGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();
        List<Old.Product.Productsubgroep> productsubgroepen = Import.getProductsubgroepen().stream().map(e -> (Old.Product.Productsubgroep) e).collect(Collectors.toList());

        for (Old.Product.Productsubgroep subgroep : productsubgroepen) {
            List<ProductSubGroep> subGroepen = newProductSubGroepen.stream().filter(e -> e.getId() == subgroep.getId_productsubgroep()).collect(Collectors.toList());
            ProductGroep productGroep = newProductgroepen.stream().filter(e -> e.getId() == subgroep.getId_productgroep()).findFirst().orElse(null);
            if (productGroep != null) {
                productGroep.setProductSubGroepen(subGroepen);
                subGroepen.forEach(t -> {
                    t.setProductGroep(productGroep);
                    String query = String.format("UPDATE ProductSubGroep SET ProductGroepId = %d WHERE ProductSubGroepId = %d", t.getProductGroep().getId(), t.getProductSubGroepId());
                    DB.executeCustomQuery(query);
                });
            }
            omschrijvingen.add(productGroep.getOmschrijving());
            algemeneRekeningen.add(productGroep.getAlgemeneRekening());
        }

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newProductgroepen, "ProductGroep", ProductGroep.class, true, false);
    }

    //EERSTE KEER ETIKETTEN
    public static void exportEtiketten() {
        newEtiketten = Mapper.oldEtiketToNewEtiket();
        List<Printer> printers = new ArrayList();

        newEtiketten.forEach(e -> {
            printers.add(e.getPrinter());
        });

        DB.insert(removeDuplicates(printers, newPrinters), "Printers", Printer.class, false, false);
        DB.insert(newEtiketten, "Etiketten", Etiket.class, true, false);
    }

    //EERSTE KEER PRODUCTCATEGORIEEN EN VERPAKKINGEN EN ANALYTISCHE REKENINGEN
    public static void exportProductcategorieën() {
        newProductcategorieën = Mapper.oldProductcategorieToNewProductcategorie();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();
        List<ProductGroep> productGroepen = new ArrayList();
        List<ProductSubGroep> productSubgroepen = new ArrayList();
        List<Verpakking> standaardVerpakkingen = new ArrayList();
        List<Verpakking> colliVerpakkingen = new ArrayList();
        List<Fabrikant> fabrikanten = new ArrayList();
        List<BestelGroep> bestelGroepen = new ArrayList();
        List<Etiket> etiketten = new ArrayList();
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList();
        List<AnalytischeRekening> analytischeRekeningen = new ArrayList();

        newProductcategorieën.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            algemeneRekeningen.add(e.getStandaardAlgemeneRekeningAlgemeneRekening());
            productSubgroepen.add(e.getStandaardProductSubGroepProductSubGroep());
            productGroepen.add(e.getStandaardProductGroepProductGroep());
            standaardVerpakkingen.add(e.getStandaardVerpakkingVerpakking());
            colliVerpakkingen.add(e.getStandaardVerpakkingVerpakking());
            fabrikanten.add(e.getStandaardFabrikantFabrikant());
            bestelGroepen.add(e.getBestelGroep());
            etiketten.add(e.getStandaardEtiketEtiket());
            voorraadPlaatsen.add(e.getStandaardVoorraadPlaatsVoorraadPlaats());
            analytischeRekeningen.add(e.getStandaardAnalytischeRekeningAnalytischeRekening());
        });

        newVerpakkingen = new ArrayList();
        List<Integer> idVP = new ArrayList();
        standaardVerpakkingen.forEach(e -> {
            if (!idVP.contains(Integer.valueOf(e.getId()))) {
                newVerpakkingen.add(e);
            }
            idVP.add(e.getId());
        });
        colliVerpakkingen.forEach(e -> {
            if (!idVP.contains(Integer.valueOf(e.getId()))) {
                newVerpakkingen.add(e);
            }
            idVP.add(e.getId());
        });

        newAnalytischeRekeningen = new ArrayList();
        List<Integer> idAR = new ArrayList();
        analytischeRekeningen.forEach(e -> {
            if (!idAR.contains(Integer.valueOf(e.getId()))) {
                newAnalytischeRekeningen.add(e);
            }
            idAR.add(e.getId());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(removeDuplicates(productSubgroepen, newProductSubGroepen), "ProductSubGroep", ProductSubGroep.class, false, false);
        DB.insert(removeDuplicates(productGroepen, newProductgroepen), "ProductGroep", ProductGroep.class, false, false);
        DB.insert(newVerpakkingen, "Verpakking", Verpakking.class, true, false);
        DB.insert(removeDuplicates(fabrikanten, newFabrikanten), "Fabrikanten", Fabrikant.class, false, false);
        DB.insert(removeDuplicates(bestelGroepen, newBestelgroepen), "BestelGroepen", BestelGroep.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, true, false);
        DB.insert(removeDuplicates(analytischeRekeningen, newAnalytischeRekeningen), "AnalytischeRekeningen", AnalytischeRekening.class, true, false);

        DB.insert(newProductcategorieën, "ProductCategorie", ProductCategorie.class, true, false);

    }

    //EERSTE KEER UITGAANDEBESTELLING EN BESTELBON
    public static void exportBestelbonnenUitgaandeBestellingen() {
        newUitgaandBestellingen = Mapper.oldBestelbonDetailsToNewUitgaandeBestelling();
        newBestelbonnen = Mapper.oldBestelbonHoofdingToNewBestelbon();

        DB.insert(newUitgaandBestellingen, "UitgaandeBestellingen", UitgaandeBestelling.class, true, true);
        DB.insert(newBestelbonnen, "Bestelbonnen", Bestelbon.class, true, false);
    }

    //EERSTE KEER AANKOOPPRODUCTEN
    private static void exportAankoopproducten() {
        newAankoopproducten = Mapper.oldAankoopproductToNewAankoopproduct();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Etiket> etiketten = new ArrayList();
        List<Fabrikant> fabrikanten = new ArrayList();
        List<AnalytischeRekening> analytischeRekeningen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();
        List<BestelGroep> bestelgroepen = new ArrayList();
        List<ProductCategorie> productCategorien = new ArrayList();
        List<ProductGroep> productgroepen = new ArrayList();
        List<ProductSubGroep> productSubgroepen = new ArrayList();
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList();
        List<ReceptProduct> receptProducten = new ArrayList();
        List<VestigingAankoopProduct> tussen = new ArrayList();

        newAankoopproducten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            fabrikanten.add(e.getFabrikant());
            etiketten.add(e.getEtiket());
            bestelgroepen.add(e.getBestelGroep());
            voorraadPlaatsen.add(e.getVoorraadPlaats());
            productSubgroepen.add(e.getProductSubGroep());
            productgroepen.add(e.getProductGroep());
            analytischeRekeningen.add(e.getAnalytischeRekening());
            algemeneRekeningen.add(e.getAlgemeneRekening());
            productCategorien.add(e.getProductCategorie());
            receptProducten.add(e.getReceptProduct());
            e.getAankoopProductvestigingen().forEach(t -> {
                tussen.add(t);
            });
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(removeDuplicates(productSubgroepen, newProductSubGroepen), "ProductSubGroep", ProductSubGroep.class, false, false);
        DB.insert(removeDuplicates(productgroepen, newProductgroepen), "ProductGroep", ProductGroep.class, false, false);
        DB.insert(removeDuplicates(fabrikanten, newFabrikanten), "Fabrikanten", Fabrikant.class, false, false);
        DB.insert(removeDuplicates(bestelgroepen, newBestelgroepen), "BestelGroepen", BestelGroep.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(analytischeRekeningen, newAnalytischeRekeningen), "AnalytischeRekeningen", AnalytischeRekening.class, false, false);
        DB.insert(removeDuplicates(productCategorien, newProductcategorieën), "ProductCategorie", ProductCategorie.class, false, false);
        DB.insert(removeDuplicates(receptProducten, newReceptProducten), "ReceptProducten", ReceptProduct.class, false, false);

        DB.insert(newAankoopproducten, "AankoopProducten", AankoopProduct.class, true, false);

        newReceptProducten.forEach(e -> {
            List<AankoopProduct> aankoopProducten = newAankoopproducten.stream().filter(a -> a.getReceptProduct().getId() == e.getId()).collect(Collectors.toList());
            e.setAankoopProducten(aankoopProducten);
        });

        DB.insert(tussen, "VestigingAankoopProduct", VestigingAankoopProduct.class, true, true);

        //SKIPBIG
//        Import.getBestelbonnendetail().stream().map(old -> (Old.Bestelling.BestelbonDetail) old).collect(Collectors.toList()).forEach(e -> {
//
//            AankoopProduct aankoopProduct = newAankoopproducten.stream().filter(t -> t.getId() == e.getId_aankoopproduct()).findFirst().orElse(null);
//            UitgaandeBestelling uitgaandeBestelling = newUitgaandBestellingen.stream().filter(t -> t.getId() == e.getId_bestelbon()).findFirst().orElse(null);
//            if (uitgaandeBestelling != null && aankoopProduct != null) {
//                uitgaandeBestelling.setAankoopProduct(aankoopProduct);
//                String query = String.format("UPDATE UitgaandeBestellingen SET AankoopProductId = %d WHERE UitgaandeBestellingId = %d", aankoopProduct.getId(), uitgaandeBestelling.getId());
//                DB.executeCustomQuery(query);
//            }
//        });
    }

    // EERSTE KEER BASISRECEPTEN + Tussen tabel receptproduct-basisrecept
    public static void exportBasisRecepten() {
        newBasisRecepten = Mapper.oldReceptenToBasisRecepten();
        List<TussenTabellen.ReceptProductBasisRecept> tussen = new ArrayList();
        newBasisRecepten.forEach(e -> {
            e.getBasisReceptReceptProducten().forEach(t -> {
                tussen.add(t);
            });
        });
        DB.insert(newBasisRecepten, "BasisRecepten", BasisRecept.class, true, true);
        DB.insert(tussen, "ReceptProductBasisRecepten", ReceptProductBasisRecept.class, true, true);

    }

    //EERSTE KEER MATERIEELGROEPEN
    public static void exportMaterieelGroepen() {
        newMaterieelGroepen = Mapper.oldMaterieelgroepToNewMaterieelGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newMaterieelGroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newMaterieelGroepen, "Materieelgroepen", Materieelgroep.class, true, false);

    }

    //EERSTE KEER MATERIEEL
    public static void exportMaterieel() {
        newMaterieel = Mapper.oldMaterieelToNewMaterieel();
        List<Materieelgroep> materieelGroepen = new ArrayList();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Leverancier> leveranciers = new ArrayList();
        List<Onderhoud> onderhouden = new ArrayList();

        newMaterieel.forEach(e -> {
            materieelGroepen.add(e.getMaterieelgroep());
            omschrijvingen.add(e.getOmschrijving());
            leveranciers.add(e.getLeverancier());
            onderhouden.add(e.getOnderhoud());
        });

        DB.insert(removeDuplicates(materieelGroepen, newMaterieelGroepen), "Materieelgroepen", Materieelgroep.class, false, false);
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(leveranciers, newLeveranciers), "Leverancier", Leverancier.class, false, false);
        DB.insert(deleteDuplicates(onderhouden), "Onderhouden", Onderhoud.class, true, false);
        DB.insert(newMaterieel, "Materieelen", Materieel.class, true, false);
    }

    //EERSTE KEER PRODUCTIEGROEPEN
    public static void exportProductiegroepen() {
        newProductiegroepen = Mapper.oldProductiegroepToNewProductiegroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> rekeningen = new ArrayList();

        newProductiegroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            rekeningen.add(e.getAlgemeneRekening());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(rekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newProductiegroepen, "Productiegroepen", Productiegroep.class, true, false);
    }

    //EERSTE KEER RECEPTGROEPEN
    public static void exportReceptengroepen() {
        newReceptengroepen = Mapper.oldReceptengroepToNewReceptenGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newReceptengroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newReceptengroepen, "Receptgroepen", Receptgroep.class, true, false);
    }

    //EERSTE KEER BEWAARCONDITIES
    public static void exportBewaarcondities() {
        newBewaarcondities = Mapper.oldBewaarconditieToNewBewaarconditie();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newBewaarcondities.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBewaarcondities, "Bewaarconditie", Bewaarconditie.class, true, false);
    }

    //EERSTE KEER BEWAARTEMPERATUREN
    public static void exportBewaarTemperaturen() {
        newBewaarTemperaturen = Mapper.oldBewaarTemperatuurToNewBewaarTemperatuur();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newBewaarTemperaturen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBewaarTemperaturen, "BewaarTemperatuur", BewaarTemperatuur.class, true, false);
    }

    //EERSTE KEER VERDEELGROEPEN
    public static void exportVerdeelgroepen() {
        newVerdeelgroepen = Mapper.oldVerdeelgroepToNewVerdeelgroep();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newVerdeelgroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newVerdeelgroepen, "Verkoopsverdeelgroepen", Verkoopsverdeelgroep.class, true, false);
    }

    //EERSTE KEER VERKOOPSVERPAKKING
    public static void exportVerkoopsverpakking() {
        newVerkoopsverpakking = Mapper.oldVerkoopsverpakkingToNewVerkoopsverpakking();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Verkoopsverdeelgroep> verkoopsVerdeelgroepen = new ArrayList();

        newVerkoopsverpakking.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            verkoopsVerdeelgroepen.add(e.getVerkoopsverdeelgroep());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(verkoopsVerdeelgroepen, newVerdeelgroepen), "Verkoopsverdeelgroepen", Verkoopsverdeelgroep.class, false, false);
        DB.insert(newVerkoopsverpakking, "Verkoopsverpakkingen", Verkoopsverpakking.class, true, false);
    }

    //EERSTE KEER VASTEKOSTEN
    public static void exportVastekosten() {
        newVasteKosten = Mapper.oldVastekostToNewVastekost();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newVasteKosten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newVasteKosten, "VasteKosten", VasteKost.class, true, false);
    }

    //EERSTE KEER ONRECHTSTREEKSEKOSTEN
    public static void exportOnrechtstreekseKosten() {
        newOnrechtstreekseKosten = Mapper.oldOnrechtstreekseKostToNewOnrechtstreekseKost();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newOnrechtstreekseKosten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newOnrechtstreekseKosten, "OnrechtstreekseKosten", OnrechtstreekseKost.class, true, false);
    }

    //EERSTE KEER VOORSTELLINGOPPRODUCTIELIJST, VOOORRAADPRODUCTEN, JOBS, AFGEWERKT PRODUCT
    public static void exportAfgewerkteProducten() {
        newAfgewerkteProducten = Mapper.oldAfgewerktProductToNewAfgewerktProduct();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Productiegroep> productiegroepen = new ArrayList();
        List<Receptgroep> receptGroepen = new ArrayList();
        List<VoorraadProduct> voorraadProduct = new ArrayList();
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList();
        List<Etiket> etiketten = new ArrayList();
        List<Bewaarconditie> bewaarcondities = new ArrayList();
        List<BewaarTemperatuur> bewaarTemperaturen = new ArrayList();
        List<Omschrijving> bereidingswijzes = new ArrayList();
        List<VoorstellingOpProductielijst> voorstellingen = new ArrayList();
        List<Job> jobs = new ArrayList();
        List<Verkoopsverpakking> verkoopsverpakkingen = new ArrayList();
        List<VasteKost> vasteKosten = new ArrayList();
        List<OnrechtstreekseKost> onrechtstreekseKosten = new ArrayList();

        newAfgewerkteProducten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            productiegroepen.add(e.getProductiegroep());
            receptGroepen.add(e.getReceptgroep());
            voorraadProduct.add(e.getVoorraadProduct());
            voorraadPlaatsen.add(e.getVoorraadplaats());
            etiketten.add(e.getVerdeelEtiketEtiket());
            bewaarcondities.add(e.getBewaarconditie());
            bewaarTemperaturen.add(e.getBewaarTemperatuur());
            bereidingswijzes.add(e.getBereidingswijzeOmschrijving());
            voorstellingen.add(e.getVoorstellingOpProductielijst());
            jobs.add(e.getJob());
            verkoopsverpakkingen.add(e.getVerkoopsverpakking());
            vasteKosten.add(e.getVasteKost());
            onrechtstreekseKosten.add(e.getOnrechtstreekseKost());
        });

        newJobs = jobs;

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(productiegroepen, newProductiegroepen), "Productiegroepen", Productiegroep.class, false, false);
        DB.insert(removeDuplicates(receptGroepen, newReceptengroepen), "Receptgroepen", Receptgroep.class, false, false);
        DB.insert(deleteDuplicates(voorraadProduct), "VoorraadProducten", VoorraadProduct.class, true, true);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(bewaarcondities, newBewaarcondities), "Bewaarconditie", Bewaarconditie.class, false, false);
        DB.insert(removeDuplicates(bewaarTemperaturen, newBewaarTemperaturen), "BewaarTemperatuur", BewaarTemperatuur.class, false, false);
        DB.insert(bereidingswijzes, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(deleteDuplicates(voorstellingen), "VoorstellingOpProductielijst", VoorstellingOpProductielijst.class, true, true);
        DB.insert(deleteDuplicates(jobs), "Jobs", Job.class, true, false);
        DB.insert(removeDuplicates(verkoopsverpakkingen, newVerkoopsverpakking), "Verkoopsverpakkingen", Verkoopsverpakking.class, false, false);
        DB.insert(removeDuplicates(vasteKosten, newVasteKosten), "VasteKosten", VasteKost.class, false, false);
        DB.insert(removeDuplicates(onrechtstreekseKosten, newOnrechtstreekseKosten), "OnrechtstreekseKosten", OnrechtstreekseKost.class, false, false);

        DB.insert(newAfgewerkteProducten, "AfgewerktProduct", AfgewerktProduct.class, true, false);

    }

    //EERSTE KEER VERKOOPPRODUCTGROEPEN
    public static void exportVerkoopProductgroepen() {
        newVerkoopProductgroep = Mapper.oldVerkoopProductGroepToNewVerkoopProductGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Productiegroep> groepen = new ArrayList();

        newVerkoopProductgroep.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            groepen.add(e.getProductiegroep());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(groepen, newProductiegroepen), "Productiegroepen", Productiegroep.class, false, false);
        DB.insert(newVerkoopProductgroep, "VerkoopProductGroepen", VerkoopProductGroep.class, true, false);

    }

    //EERSTE KEER BARCODEPREFIXEN
    public static void exportBarcodeprefixen() {
        newBarcodePrefixen = Mapper.oldBarcodePrefixenToNewBarcodePrefixen();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newBarcodePrefixen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBarcodePrefixen, "BarcodePrefixes", BarcodePrefix.class, true, false);
    }

    //EERSTE KEER PRIVATELABELS
    public static void exportPrivatelabels() {
        newPrivateLabels = Mapper.oldKlantPrivateLabelToNewPrivateLabel();
        List<Adres> adressen = new ArrayList();
        newPrivateLabels.forEach(e -> {
            adressen.add(e.getAdres());
        });
        DB.insert(adressen, "Adressen", Adres.class, false, true);
        DB.insert(newPrivateLabels, "PrivateLabels", PrivateLabel.class, true, false);

    }

    //EERSTE KEER BTWPERCENTAGES
    public static void exportBtwpercentages() {
        newBtwpercentages = Mapper.oldBtwcodeToNewBTWPercentage();
        List<AlgemeneRekening> rekeningen = new ArrayList<>();
        newBtwpercentages.forEach(e -> {
            rekeningen.add(e.getAlgemeneRekeningAftrekbaarAlgemeneRekening());
            rekeningen.add(e.getAlgemeneRekeningVerschuldigdAlgemeneRekening());
        });
        DB.insert(removeDuplicates(rekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newBtwpercentages, "BTWpercentages", BTWPercentage.class, true, false);

    }

    //EERSTE KEER VARIANTGROEPEN
    public static void exportVariantGroepen() {
        newVariantgroepen = Mapper.oldVariantHoofdingToNewVariantGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newVariantgroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newVariantgroepen, "VariantGroepen", VariantGroep.class, true, false);

    }

    //EERSTE KEER OPTIEGROEPEN
    public static void exportOptiegroepen() {
        newOptiegroepen = Mapper.oldOptieHoofdingToNewOptiegroep();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newOptiegroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newOptiegroepen, "OptieGroepen", OptieGroep.class, true, false);
    }

    //EERSTE KEER MICROBIOLOGISCHEPARAMETERS
    public static void exportMicrobiologischeParameters() {
        newMicrobiologischeParameters = Mapper.oldMicrobiologischeToNewMicrobiologische();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newMicrobiologischeParameters.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            omschrijvingen.add(e.getTekstTechnischeFicheOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newMicrobiologischeParameters, "MicroBiologischeParameters", MicrobiologischeParameter.class, true, false);
    }

    //EERSTE KEER LOTNUMMERTYPE
    public static void exportLotnummertypes() {
        newLotnummertypes = Mapper.oldLotnummerTypeToNewLotnummerType();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newLotnummertypes.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newLotnummertypes, "LotnummerTypes", LotnummerType.class, true, false);
    }

    //EERSTE KEER LOTNUMMERDRAGER
    public static void exportLotnummerDrager() {
        newLotnummerDragers = Mapper.oldLotnummerDragerToNewLotnummerDrager();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newLotnummerDragers.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newLotnummerDragers, "LotnummerDragers", LotnummerDrager.class, true, false);

    }

    //EERSTE KEER LOTNUMMERAANBRENGERS
    public static void exportLotnummerAanbrengers() {
        newLotnummerAanbrengers = Mapper.oldLotnummerAanbrengerToNewLotnummerAanbrenger();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newLotnummerAanbrengers.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newLotnummerAanbrengers, "LotnummerAanbrengers", LotnummerAanbrenger.class, true, false);

    }

    //EERSTE KEER WINSTMARGES
    public static void exportWinstmarges() {
        newWinstmarges = Mapper.oldWinstmargesToNewWinstmarge();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newWinstmarges.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newWinstmarges, "Winstmarges", Winstmarge.class, true, false);
    }

    //EERSTE KEER DISTRIBUTIEWIJZE
    public static void exportDistributiewijzes() {
        newDistributiewijzes = Mapper.oldDistributieWijzeToNewDistribibutieWijze();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newDistributiewijzes.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newDistributiewijzes, "DistributieWijzes", DistributieWijze.class, true, false);
    }

    //EERSTE KEER FYSISCHE EIGENSCHAP, VERKOOPSBARCODE EN VERKOOPPRODUCTEN
    public static void exportVerkoopProducten() {
        newVerkoopProducten = Mapper.oldVerkoopProductenToNewVerkoopProducten();
        List<Productiegroep> productiegroepen = new ArrayList<>(); //NIET eerste keer has ID
        List<VoorraadProduct> voorraadProducten = new ArrayList();// NIET eerste keer NO ID
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList();// NIET eerste keer has id
        List<Etiket> etiketten = new ArrayList();// NIET eerste keer has id
        List<Bewaarconditie> bewaarcondities = new ArrayList(); //NIET eerste keer has ID
        List<BewaarTemperatuur> bewaarTemperaturen = new ArrayList(); // NIET eerste keer has id
        List<Job> jobs = new ArrayList(); //NIET eerste keer NO id
        List<VasteKost> vasteKosten = new ArrayList(); //NIET eerste keer has id
        List<OnrechtstreekseKost> onrechtstreekseKosten = new ArrayList(); //NIET eerste keer has id
        List<VerkoopProductGroep> verkoopProductenGroepen = new ArrayList(); //has id
        List<BarcodePrefix> barcodePrefixen = new ArrayList(); //has id
        List<PrivateLabel> privateLabels = new ArrayList(); //has Id
        List<VerkoopsBarcode> verkoopsBarcode = new ArrayList(); //no id
        List<Verkoopsverpakking> verkoopsVerpakking = new ArrayList(); //has id
        List<FysischeEigenschap> fysischeEig = new ArrayList(); // no id
        List<Omschrijving> omschrijvingen = new ArrayList(); //no id
        List<BTWPercentage> btwpercentages = new ArrayList(); // has id
        List<VariantGroep> variantGroepen = new ArrayList(); //has id
        List<OptieGroep> optieGroepen = new ArrayList(); //has id
        List<MicrobiologischeParameter> micro = new ArrayList(); //has id
        List<LotnummerType> lotnummerTypes = new ArrayList(); //has id
        List<LotnummerDrager> lotnummerDragers = new ArrayList(); // has id
        List<LotnummerAanbrenger> lotnummerAanbrengers = new ArrayList(); //has id
        List<Winstmarge> winstmarges = new ArrayList(); // has id
        List<DistributieWijze> distributiewijzes = new ArrayList(); //has id

        newVerkoopProducten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            omschrijvingen.add(e.getBereidingswijzeOmschrijving());
            productiegroepen.add(e.getProductiegroep());
            voorraadProducten.add(e.getVoorraadProduct());
            voorraadPlaatsen.add(e.getVoorraadPlaats());
            etiketten.add(e.getVoorraadEtiketEtiket());
            bewaarcondities.add(e.getBewaarConditie());
            bewaarTemperaturen.add(e.getBewaarTemperatuur());
            jobs.add(e.getJob());
            vasteKosten.add(e.getVasteKost());
            onrechtstreekseKosten.add(e.getOnrechtstreekseKost());
            verkoopProductenGroepen.add(e.getVerkoopProductGroep());
            barcodePrefixen.add(e.getBarcodePrefix());
            privateLabels.add(e.getPrivateLabel());
            verkoopsBarcode.add(e.getVerpakkingsBarcodeVerkoopsBarcode());
            verkoopsBarcode.add(e.getColliBarcodeVerkoopsBarcode());
            verkoopsBarcode.add(e.getPalletBarcodeVerkoopsBarcode());
            verkoopsVerpakking.add(e.getVermeldingLeveringsbonVerkoopsverpakking());
            fysischeEig.add(e.getBreedteFysischeEigenschap());
            fysischeEig.add(e.getDiameterFysischeEigenschap());
            fysischeEig.add(e.getGewichtFysischeEigenschap());
            fysischeEig.add(e.getHoogteFysischeEigenschap());
            fysischeEig.add(e.getLengteFysischeEigenschap());
            omschrijvingen.add(e.getKleurOmschrijving());
            omschrijvingen.add(e.getAfwerkingOmschrijving());
            btwpercentages.add(e.getBTWpercentage());
            variantGroepen.add(e.getVariantGroep());
            optieGroepen.add(e.getOptieGroep());
            micro.add(e.getMicroBiologischeParameter());
            lotnummerTypes.add(e.getLotnummerType());
            lotnummerDragers.add(e.getLotnummerDrager());
            lotnummerAanbrengers.add(e.getLotnummerAanbrenger());
            omschrijvingen.add(e.getProductBeschrijvingOmschrijving());
            omschrijvingen.add(e.getGebruiksaanwijzingOmschrijving());
            winstmarges.add(e.getWinstmarge());
            distributiewijzes.add(e.getDistributieWijze());
            omschrijvingen.add(e.getIngrediëntenOmschrijving());
        });
        DB.insert(removeDuplicates(productiegroepen, newProductiegroepen), "Productiegroepen", Productiegroep.class, false, false);
        DB.insert(deleteDuplicates(voorraadProducten), "VoorraadProducten", VoorraadProduct.class, false, true);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(bewaarcondities, newBewaarcondities), "Bewaarconditie", Bewaarconditie.class, false, false);
        DB.insert(removeDuplicates(bewaarTemperaturen, newBewaarTemperaturen), "BewaarTemperatuur", BewaarTemperatuur.class, false, false);
        DB.insert(removeDuplicates(jobs, newJobs), "Jobs", Job.class, false, true);
        DB.insert(removeDuplicates(vasteKosten, newVasteKosten), "VasteKosten", VasteKost.class, false, false);
        DB.insert(removeDuplicates(onrechtstreekseKosten, newOnrechtstreekseKosten), "OnrechtstreekseKosten", OnrechtstreekseKost.class, false, false);
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(verkoopProductenGroepen, newVerkoopProductgroep), "VerkoopProductGroepen", VerkoopProductGroep.class, false, false);
        DB.insert(removeDuplicates(barcodePrefixen, newBarcodePrefixen), "BarcodePrefixes", BarcodePrefix.class, false, false);
        DB.insert(removeDuplicates(privateLabels, newPrivateLabels), "PrivateLabels", PrivateLabel.class, false, false);
        DB.insert(verkoopsBarcode, "VerkoopsBarcodes", VerkoopsBarcode.class, true, true);
        DB.insert(removeDuplicates(verkoopsVerpakking, newVerkoopsverpakking), "Verkoopsverpakkingen", Verkoopsverpakking.class, false, false);
        DB.insert(fysischeEig, "FysischeEigenschappen", FysischeEigenschap.class, true, true);
        DB.insert(removeDuplicates(btwpercentages, newBtwpercentages), "BTWpercentages", BTWPercentage.class, false, false);
        DB.insert(removeDuplicates(variantGroepen, newVariantgroepen), "VariantGroepen", VariantGroep.class, false, false);
        DB.insert(removeDuplicates(optieGroepen, newOptiegroepen), "OptieGroepen", OptieGroep.class, false, false);
        DB.insert(removeDuplicates(lotnummerTypes, newLotnummertypes), "LotnummerTypes", LotnummerType.class, false, false);
        DB.insert(removeDuplicates(lotnummerDragers, newLotnummerDragers), "LotnummerDragers", LotnummerDrager.class, false, false);
        DB.insert(removeDuplicates(lotnummerAanbrengers, newLotnummerAanbrengers), "LotnummerAanbrengers", LotnummerAanbrenger.class, false, false);
        DB.insert(removeDuplicates(winstmarges, newWinstmarges), "Winstmarges", Winstmarge.class, false, false);
        DB.insert(removeDuplicates(distributiewijzes, newDistributiewijzes), "DistributieWijzes", DistributieWijze.class, false, false);

        DB.insert(newVerkoopProducten, "VerkoopProduct", VerkoopProduct.class, true, false);

        List<AankoopProductVerkoopProduct> tussentabel = new ArrayList();
        Import.getAankoopproducten().forEach(e -> {
            Old.Aankoopproducten.Aankoopproduct product = (Old.Aankoopproducten.Aankoopproduct) e;
            int idAankoop = product.getId_aankoopproduct();
            int idVerkoop = product.getId_verkoopproduct();
            AankoopProduct aankoop = newAankoopproducten.stream().filter(t -> t.getId() == idAankoop).findFirst().get();
            VerkoopProduct verkoop = newVerkoopProducten.stream().filter(t -> t.getId() == idVerkoop).findFirst().get();
            TussenTabellen.AankoopProductVerkoopProduct av = new AankoopProductVerkoopProduct(aankoop,verkoop);
            aankoop.setAankoopProductenVerkoopProducten(List.of(av));
            verkoop.setVerkoopProductAankoopProduct(List.of(av));
            tussentabel.add(av);
        });
        
        DB.insert(tussentabel, "AankoopProductVerkoopProduct", AankoopProductVerkoopProduct.class, true, true);
    }

    //EERSTE KEER VOORBEREIDPRODUCT
    public static void exportVoorbereideProducten() {
        newVoorbereideProducten = Mapper.oldVoorbereidProductToNewVoorbereidProduct();
        List<Omschrijving> omschrijvingen = new ArrayList(); //no id
        List<Productiegroep> productiegroepen = new ArrayList(); //has id
        List<Receptgroep> receptgroepen = new ArrayList(); // has id
        List<VoorraadProduct> voorraadProducten = new ArrayList(); //no id
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList(); //has id
        List<Etiket> etiketten = new ArrayList(); //has id
        List<Bewaarconditie> bewaarcondities = new ArrayList(); // has id
        List<BewaarTemperatuur> bewaarTemperaturen = new ArrayList(); //has id
        List<VoorstellingOpProductielijst> voorstellingen = new ArrayList(); //no id
        List<Job> jobs = new ArrayList(); // no id
        List<Verkoopsverpakking> verkoopverpakking = new ArrayList(); //has id
        List<VasteKost> vasteKosten = new ArrayList(); //has id
        List<OnrechtstreekseKost> onrechtstreekseKosten = new ArrayList(); //has id

        newVoorbereideProducten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            omschrijvingen.add(e.getBereidingswijzeOmschrijving());
            productiegroepen.add(e.getProductiegroep());
            receptgroepen.add(e.getReceptgroep());
            voorraadPlaatsen.add(e.getVoorraadplaats());
            voorraadProducten.add(e.getVoorraadProduct());
            etiketten.add(e.getVerdeelEtiketEtiket());
            bewaarcondities.add(e.getBewaarconditie());
            bewaarTemperaturen.add(e.getBewaarTemperatuur());
            voorstellingen.add(e.getVoorstellingOpProductielijst());
            jobs.add(e.getJob());
            verkoopverpakking.add(e.getVerkoopsverpakking());
            vasteKosten.add(e.getVasteKost());
            onrechtstreekseKosten.add(e.getOnrechtstreekseKost());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(productiegroepen, newProductiegroepen), "Productiegroepen", Productiegroep.class, false, false);
        DB.insert(removeDuplicates(receptgroepen, newReceptengroepen), "Receptgroepen", Receptgroep.class, false, false);
        DB.insert(deleteDuplicates(voorraadProducten), "VoorraadProducten", VoorraadProduct.class, false, true);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(bewaarcondities, newBewaarcondities), "Bewaarconditie", Bewaarconditie.class, false, false);
        DB.insert(removeDuplicates(bewaarTemperaturen, newBewaarTemperaturen), "BewaarTemperatuur", BewaarTemperatuur.class, false, false);
        DB.insert(deleteDuplicates(voorstellingen), "VoorstellingOpProductielijst", VoorstellingOpProductielijst.class, false, true);
        DB.insert(removeDuplicates(jobs, newJobs), "Jobs", Job.class, false, false);
        DB.insert(removeDuplicates(verkoopverpakking, newVerkoopsverpakking), "Verkoopsverpakkingen", Verkoopsverpakking.class, false, false);
        DB.insert(removeDuplicates(vasteKosten, newVasteKosten), "VasteKosten", VasteKost.class, false, false);
        DB.insert(removeDuplicates(onrechtstreekseKosten, newOnrechtstreekseKosten), "OnrechtstreekseKosten", OnrechtstreekseKost.class, false, false);

        DB.insert(newVoorbereideProducten, "VoorbereidProduct", VoorbereidProduct.class, true, false);
    }

    //EERSTE KEER GEBRUIKER
    public static void exportGebruikers() {
        newGebruikers = Mapper.oldGebruikersToNewGebruikers();
        DB.insert(newGebruikers, "AspNetUsers", Gebruiker.class, true, false);
    }

    public static void exportFunctieVanPersonen() {
        newFunctieVanPersonen = Mapper.oldPersoneelsKostenToFunctieVanPersonen();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newFunctieVanPersonen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(deleteDuplicates(newFunctieVanPersonen), "FunctieVanPersoonen", FunctieVanPersoon.class, true, false);
    }

    //EERSTE KEER WERKNEMERS
    public static void exportWerknemers() {
        newWerknemers = Mapper.oldWerknemersToNewWerknemer();
        DB.insert(newWerknemers, "Werknemers", Werknemer.class, true, false);
    }

    //EERSTE KEER IPADRESSEN EN WEEEGSCHALEN
    public static void exportWeegschalen() {
        newWeegschalen = Mapper.oldWeegschaallToNewWeegschaal();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<IPAdres> ipadressen = new ArrayList();
        newWeegschalen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            ipadressen.add(e.getIpAdres());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(ipadressen, "IPAdres", IPAdres.class, true, true);
        DB.insert(newWeegschalen, "Weegschaalen", Weegschaal.class, true, false);
    }

    //EERSTE KEER KNEDERS
    public static void exportKneders() {
        newKneders = Mapper.oldKnederToNewKneder();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newKneders.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newKneders, "Kneder", Kneder.class, true, false);
    }

    //EERSTE KEER WERKPLEKKEN
    public static void exportWerkplekken() {
        newWerkplekken = Mapper.oldWerkplekkenToNewWerkplekken();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newWerkplekken.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newWerkplekken, "Werkplekken", Werkplek.class, true, false);

    }

    //EERSTE KEER ALLERGEENGROEPEN
    public static void exportAllergeengroepen() {
        newAllergeenGroepen = Mapper.oldAllergeenGroepenToNewAllergenenGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newAllergeenGroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newAllergeenGroepen, "AllergeenGroepen", AllergeenGroep.class, true, false);
    }

    //EERSTE KEER ALLERGENEN
    public static void exportAllergenen() {
        newAllergenen = Mapper.oldAllergenenToNewAllergenen();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AllergeenGroep> allergeengroepen = new ArrayList();
        newAllergenen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            omschrijvingen.add(e.getEtiketOmschrijvingOmschrijving());
            allergeengroepen.add(e.getAllergeenGroep());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(allergeengroepen, newAllergeenGroepen), "AllergeenGroepen", AllergeenGroep.class, false, false);
        DB.insert(newAllergenen, "Allergenen", Allergeen.class, true, false);
    }

    //EERSTE KEER BRONVOEDINGSWAARDES
    public static void exportBronvoedingswaardes() {
        newBronvoedingswaardes = Mapper.oldBronvoedingswaardeToNewBronvoedingswaarde();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newBronvoedingswaardes.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newBronvoedingswaardes, "BronVoedingswaarde", BronVoedingswaarde.class, true, false);

    }

    //EERSTE KEER SCANNERS
    public static void exportScanners() {
        newScanners = Mapper.oldWerkstationToNewScanner();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newScanners.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newScanners, "Scanners", Scanner.class, true, true);
    }

    //EERSTE KEER INGREDIENTGROEPEN
    public static void exportIngredientGroepen() {
        newIngredientGroepen = Mapper.oldIngredientGroepToNewIngredientGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newIngredientGroepen.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newIngredientGroepen, "IngrediëntGroepen", IngrediëntGroep.class, true, false);
    }

    //EERSTE KEER ORIGINES
    public static void exportOrigines() {
        newOrigines = Mapper.oldOrigineToNewOrigine();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<IngrediëntGroep> ingredientGroepen = new ArrayList();

        newOrigines.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            ingredientGroepen.add(e.getIngrediëntGroep());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(ingredientGroepen, newIngredientGroepen), "IngrediëntGroepen", IngrediëntGroep.class, false, false);
        DB.insert(newOrigines, "Origines", Origine.class, true, false);
    }

    //EERSTE KEER INGREDIENTEN, AROMAS en 
    public static void expotIngredienten() {
        newIngredienten = Mapper.oldIngredientenToNewIngredienten();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<IngrediëntGroep> groep = new ArrayList();
        List<Aroma> aromas = new ArrayList();
        List<Origine> origines = new ArrayList();
        List<SoortPlantaardig> soortPlantaardig = new ArrayList();

        newIngredienten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            groep.add(e.getIngrediëntGroep());
            aromas.add(e.getAroma());
            origines.add(e.getOrigine());
            soortPlantaardig.add(e.getSoortPlantaardig());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(groep, newIngredientGroepen), "IngrediëntGroepen", IngrediëntGroep.class, false, false);
        DB.insert(aromas, "Aromas", Aroma.class, true, true);
        DB.insert(removeDuplicates(origines, newOrigines), "Origines", Origine.class, false, false);
        DB.insert(soortPlantaardig, "SoortenPlantaardig", SoortPlantaardig.class, true, true);
        DB.insert(newIngredienten, "Ingrediënt", Ingrediënt.class, true, false);
    }

    //EERSTE KEER OPTIES
    public static void exportOpties() {
        newOpties = Mapper.oldOptieDetailsToNewOpties();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<OptieGroep> optiegroepen = new ArrayList();
        newOpties.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            optiegroepen.add(e.getOptieGroep());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(optiegroepen, newOptiegroepen), "OptieGroepen", OptieGroep.class, false, false);
        DB.insert(newOpties, "Opties", Optie.class, true, false);
    }

    //EERSTE KEER VARIANTEN
    public static void exportVarianten() {
        newVarianten = Mapper.oldVariantDetailToNewVariant();
        List<VariantGroep> vargroepen = new ArrayList();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newVarianten.forEach(e -> {
            vargroepen.add(e.getVariantGroep());
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(vargroepen, newVariantgroepen), "VariantGroepen", VariantGroep.class, false, false);
        DB.insert(deleteDuplicates(newVarianten), "Varianten", Variant.class, true, false);
    }

    //EERSTE KEER VOORRAADCORRECTIES
    public static void exportVoorraadcorrecties() {
        newVoorraadcorrecties = Mapper.oldVoorraadcorrectieToNewVoorraadCorrectie();
        List<Omschrijving> omschrijvingen = new ArrayList();

        newVoorraadcorrecties.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newVoorraadcorrecties, "Voorraadcorrecties", Voorraadcorrectie.class, true, false);
    }

    //EERSTE KEER BASISPRODUCTEN
    private static void exportBasisproducten() {
        newBasisproducten = Mapper.oldHalffabrikaatToNewBasisProduct();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<Productiegroep> productiegroepen = new ArrayList();
        List<Receptgroep> receptgroepen = new ArrayList();
        List<VoorraadProduct> voorraadProducten = new ArrayList();
        List<VoorraadPlaats> voorraadPlaatsen = new ArrayList();
        List<Etiket> etiketten = new ArrayList<>();
        List<Bewaarconditie> bewaarcondities = new ArrayList<>();
        List<BewaarTemperatuur> bewaarTemperaturen = new ArrayList();
        List<VoorstellingOpProductielijst> voorstellingen = new ArrayList();
        List<Job> jobs = new ArrayList();
        List<Verkoopsverpakking> verpakkingen = new ArrayList();
        List<VasteKost> vasteKoste = new ArrayList();
        List<OnrechtstreekseKost> onrechtStreekseKosten = new ArrayList();

        newBasisproducten.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
            omschrijvingen.add(e.getBereidingswijzeOmschrijving());
            productiegroepen.add(e.getProductiegroep());
            receptgroepen.add(e.getReceptgroep());
            voorraadProducten.add(e.getVoorraadProduct());
            voorraadPlaatsen.add(e.getVoorraadplaats());
            etiketten.add(e.getVerdeelEtiketEtiket());
            bewaarcondities.add(e.getBewaarconditie());
            bewaarTemperaturen.add(e.getBewaarTemperatuur());
            voorstellingen.add(e.getVoorstellingOpProductielijst());
            jobs.add(e.getJob());
            verpakkingen.add(e.getVerkoopsverpakking());
            vasteKoste.add(e.getVasteKost());
            onrechtStreekseKosten.add(e.getOnrechtstreekseKost());

        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(productiegroepen, newProductiegroepen), "Productiegroepen", Productiegroep.class, false, false);
        DB.insert(removeDuplicates(receptgroepen, newReceptengroepen), "Receptgroepen", Receptgroep.class, false, false);
        DB.insert(deleteDuplicates(voorraadProducten), "VoorraadProducten", VoorraadProduct.class, false, true);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(bewaarcondities, newBewaarcondities), "Bewaarconditie", Bewaarconditie.class, false, false);
        DB.insert(removeDuplicates(bewaarTemperaturen, newBewaarTemperaturen), "BewaarTemperatuur", BewaarTemperatuur.class, false, false);
        DB.insert(deleteDuplicates(voorstellingen), "VoorstellingOpProductielijst", VoorstellingOpProductielijst.class, false, true);
        DB.insert(removeDuplicates(jobs, newJobs), "Jobs", Job.class, false, false);
        DB.insert(removeDuplicates(verpakkingen, newVerkoopsverpakking), "Verkoopsverpakkingen", Verkoopsverpakking.class, false, false);
        DB.insert(removeDuplicates(vasteKoste, newVasteKosten), "VasteKosten", VasteKost.class, false, false);
        DB.insert(removeDuplicates(onrechtStreekseKosten, newOnrechtstreekseKosten), "OnrechtstreekseKosten", OnrechtstreekseKost.class, false, false);
        DB.insert(newBasisproducten, "BasisProduct", BasisProduct.class, true, false);

        Import.getHalffabrikaten().forEach(e->{
            
        });
    }

    //EERSTE KEER KASSABESTELLINGEN
    public static void exportKassabestellingen() {
        newKassabestellingen = Mapper.oldKassaBestellingHoofdingToNewKassaBestelling();
        List<Bedrijf> bedrijven = new ArrayList();
        List<Klant> klanten = new ArrayList();
        List<Adres> adressen = new ArrayList();
        List<Gebruiker> gebruikers = new ArrayList();

        newKassabestellingen.forEach(e -> {
            bedrijven.add(e.getBedrijf());
            klanten.add(e.getKlant());
            adressen.add(e.getAdres());
            gebruikers.add(e.getGebruiker());
        });

        //Klanten eerst?
        DB.insert(removeDuplicates(bedrijven, newBedrijven), "Bedrijven", Bedrijf.class, false, false);
        //KLANT 
        //DB.insert
        DB.insert(deleteDuplicates(adressen), "Adressen", Adres.class, false, true);
        //DB.insert(deleteDuplicates(gebruikers), tableName, type, true, true); -> gaat niet a.d.h.v AspNetUsers...
        DB.insert(newKassabestellingen, "KassaBestellingen", Kassabestelling.class, true, false);
    }

    //EERSTE KEER KASSABESTELLINGRECORDS
    public static void exportKassabestellingRecords() {
        newKassabestellingRecords = Mapper.oldKassaBestellingDetailToNewKassaBestellingRecord();
        List<Bedrijf> bedrijven = new ArrayList();
        List<VerkoopProduct> verkoopProducten = new ArrayList();
        List<Variant> varianten = new ArrayList();
        List<VariantGroep> variantGroepen = new ArrayList();
        List<Optie> opties = new ArrayList();
        List<OptieGroep> optiegroepen = new ArrayList();
        List<Kassabestelling> kassabestellingen = new ArrayList();
        //gebruiker geskipt wegens aspnetuser
        newKassabestellingRecords.forEach(e -> {
            bedrijven.add(e.getBedrijf());
            verkoopProducten.add(e.getVerkoopProduct());
            varianten.add(e.getVariant());
            variantGroepen.add(e.getVariantGroep());
            opties.add(e.getOptie());
            optiegroepen.add(e.getOptieGroep());
            kassabestellingen.add(e.getKassaBestelling());
        });

        newKassabestellingen.forEach(e -> {
            List<KassabestellingRecord> records = newKassabestellingRecords.stream().filter(t -> t.getKassaBestelling().getId() == e.getId()).collect(Collectors.toList());
            e.setKassaBestellingRecords(records);
        });

        DB.insert(removeDuplicates(bedrijven, newBedrijven), "Bedrijven", Bedrijf.class, false, false);
        DB.insert(removeDuplicates(verkoopProducten, newVerkoopProducten), "VerkoopProduct", VerkoopProduct.class, false, false);
        DB.insert(removeDuplicates(variantGroepen, newVariantgroepen), "VariantGroepen", VariantGroep.class, false, false);
        DB.insert(removeDuplicates(varianten, newVarianten), "Varianten", Variant.class, false, false);
        DB.insert(removeDuplicates(optiegroepen, newOptiegroepen), "OptieGroepen", OptieGroep.class, false, false);
        DB.insert(removeDuplicates(opties, newOpties), "Opties", Optie.class, false, false);
        DB.insert(removeDuplicates(kassabestellingen, newKassabestellingen), "KassaBestellingen", Kassabestelling.class, false, false);
        DB.insert(newKassabestellingRecords, "KassaBestellingRecords", KassabestellingRecord.class, true, true);
    }

    //EERSTE KEER KLANTVERDEELGROEPEN
    public static void exportKlantverdeelgroep() {
        newKlantverdeelgroep = Mapper.oldKlantverdeelgroepToNewKlantverdeelgroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newKlantverdeelgroep.forEach(e -> {
            omschrijvingen.add(e.getOmschrijving());
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(newKlantverdeelgroep, "KlantVerdeelGroep", KlantVerdeelGroep.class, true, false);
    }

    //EERSTE KEER VERENDBONNEN
    public static void exportVerzendbonnen() {
        newVerzendbonnen = Mapper.oldVerzendbonToNewVerzendbon();
        List<Bedrijf> bedrijven = new ArrayList();
        List<Bestelbon> bestelbonnen = new ArrayList();
        List<VerkoopProduct> verkoopProducten = new ArrayList();
        List<Werknemer> werknemers = new ArrayList();
        List<Variant> varianten = new ArrayList();
        List<VariantGroep> variantGroepen = new ArrayList();
        List<Optie> opties = new ArrayList();
        List<OptieGroep> optiegroepen = new ArrayList();

        newVerzendbonnen.forEach(e -> {
            bedrijven.add(e.getBedrijf());
            bestelbonnen.add(e.getBestelbon());
            verkoopProducten.add(e.getVerkoopProduct());
            werknemers.add(e.getWerknemer());
            variantGroepen.add(e.getVariantGroep());
            varianten.add(e.getVariant());
            optiegroepen.add(e.getOptieGroep());
            opties.add(e.getOptie());
        });
        DB.insert(removeDuplicates(bedrijven, newBedrijven), "Bedrijven", Bedrijf.class, false, false);
        DB.insert(removeDuplicates(verkoopProducten, newVerkoopProducten), "VerkoopProduct", VerkoopProduct.class, false, false);
        DB.insert(removeDuplicates(variantGroepen, newVariantgroepen), "VariantGroepen", VariantGroep.class, false, false);
        DB.insert(removeDuplicates(varianten, newVarianten), "Varianten", Variant.class, false, false);
        DB.insert(removeDuplicates(optiegroepen, newOptiegroepen), "OptieGroepen", OptieGroep.class, false, false);
        DB.insert(removeDuplicates(opties, newOpties), "Opties", Optie.class, false, false);
        DB.insert(removeDuplicates(bestelbonnen, newBestelbonnen), "Bestelbonnen", Bestelbon.class, false, false);
        DB.insert(removeDuplicates(werknemers, newWerknemers), "Werknemers", Werknemer.class, false, false);
        DB.insert(newVerzendbonnen, "Verzendbonnen", Verzendbon.class, true, true);
    }

    //EERSTE KEER WERKSTATIONS
    public static void exportWerkstations() {
        newWerkstations = Mapper.oldWerkstationToNewWerkstation();
        List<Gebruiker> gebruikers = new ArrayList();
        List<Bedrijf> bedrijven = new ArrayList();
        List<Printer> printers = new ArrayList();
        List<Weegschaal> weegschalen = new ArrayList();

        newWerkstations.forEach(e -> {
            gebruikers.add(e.getGebruiker());
            bedrijven.add(e.getBedrijf());
            printers.add(e.getDefaulPrinterVoorPrijskaartjesPrinter());
            printers.add(e.getDefaultPrinterEtikettenVerpakkingPrinter());
            e.getWeegschalen().forEach(p -> weegschalen.add(p));
        });

        //gebruikers not insertable, aspnetusers
        DB.insert(removeDuplicates(bedrijven, newBedrijven), "Bedrijven", Bedrijf.class, false, false);
        DB.insert(removeDuplicates(printers, newPrinters), "Printers", Printer.class, false, false);
        DB.insert(removeDuplicates(weegschalen, newWeegschalen), "Weegschaalen", Weegschaal.class, false, false);
        DB.insert(newWerkstations, "WerkStations", Werkstation.class, true, false);
    }

    //EERSTE KEER ONTVANGSTBONNEN
    public static void exportOntvangstbonnen() {
        newOntvangstbonnen = Mapper.oldLeveringsbonToNewOntvangstbon();

        List<Bedrijf> bedrijven = new ArrayList();
        List<AankoopProduct> aankoopProducten = new ArrayList();
        //List<Gebruiker> gebruikers = new ArrayList(); not possible
        List<Leverancier> leveranciers = new ArrayList();
        List<Werkstation> werkstations = new ArrayList();

        newOntvangstbonnen.forEach(e -> {
            bedrijven.add(e.getBedrijf());
            aankoopProducten.add(e.getAankoopProduct());
            //gebruikers.add(e.getGebruiker());
            leveranciers.add(e.getLeverancier());
            werkstations.add(e.getWerkstation());
        });

        DB.insert(removeDuplicates(bedrijven, newBedrijven), "Bedrijven", Bedrijf.class, false, false);
        DB.insert(removeDuplicates(aankoopProducten, newAankoopproducten), "AankoopProducten", AankoopProduct.class, false, false);
        //DB.insert(removeDuplicates(gebruikers, newGebruikers), tableName, type, true, true);
        DB.insert(removeDuplicates(leveranciers, newLeveranciers), "Leverancier", Leverancier.class, false, false);
        DB.insert(removeDuplicates(werkstations, newWerkstations), "Werkstations", Werkstation.class, false, false);
        DB.insert(newOntvangstbonnen, "Ontvangstbonnen", Ontvangstbon.class, true, true);
    }

    private static void exportKlanten() {
        newKlanten = Mapper.oldKlantToNewKlant();
        List<KlantVerdeelGroep> verdeelgroepen = new ArrayList();
        List<KlantAdres> klantadressen = new ArrayList();

        newKlanten.forEach(e -> {
            verdeelgroepen.add(e.getVerdeelgroep());
            klantadressen.add(e.getKlantAdressen().get(0)); // oude klanten hebben er sws maar 1
        });

        DB.insert(removeDuplicates(verdeelgroepen, newKlantverdeelgroep), "KlantVerdeelGroep", KlantVerdeelGroep.class, false, false);
        DB.insert(klantadressen, "KlantAdres", KlantAdres.class, true, true);
        DB.insert(newKlanten, "Klant", Klant.class, true, false);
    }

}
