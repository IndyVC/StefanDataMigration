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
import Bedrijven.Verlof;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Bestellingen.BestelVoorstel;
import Bestellingen.Bestelbon;
import Bestellingen.UitgaandeBestelling;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Boekhouding.Bank;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.Dagboek;
import Import.Import;
import Leveringen.Leverancier;
import Leveringen.LeveranciersGroep;
import Leveringen.LeveringsDag;
import Materialen.Etiket;
import Materialen.Printer;
import Materialen.Verpakking;
import Producten.AankoopProduct;
import Producten.ProductCategorie;
import Producten.ProductGroep;
import Producten.ProductSubGroep;
import Producten.ReceptProduct;
import Utils.DB;
import Voorraden.VoorraadPlaats;
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
    private static List<ProductSubGroep> newProductSubGroep;
    private static List<ProductGroep> newProductgroepen;
    private static List<ProductCategorie> newProductcategorieën;
    private static List<Etiket> newEtiketten;
    private static List<AankoopProduct> newAankoopproducten;
    private static List<Verpakking> newVerpakkingen;
    private static List<AnalytischeRekening> newAnalytischeRekeningen;
    private static List<Bank> newBanken;

    public static void export() {
        Import.readOld();
        System.out.println("EXPORT BBANK");
        exportBanken();
        System.out.println("EXPORT BEDRIJF");
        exportBedrijf();
        System.out.println("EXPORT ONTVANGSTADRESSEN");
        exportOntvangstAdressen();
        System.out.println("EXPORT RECEPTPRODUCTEN (LISTS NOG NIET OPGEVULD)");
        exportReceptProducten();
        System.out.println("EXPORT BESTELVOORSTELLEN");
        exportBestelvoorstellen();
        System.out.println("EXPORT BESTELBONNEN EN UITGAANDEBESTELLINGEN");
        exportBestelbonnenUitgaandeBestellingen();
        System.out.println("EXPORT LEVERANCIERSGROEPEN");
        exportLeveranciersGroepen();
        System.out.println("EXPORT BETALINGSVOORWAARDES");
        exportBetalingsVoorwaardes();
        System.out.println("EXPORT DAGBOEKEN");
        exportDagboeken();
        System.out.println("EXPORT LEVERANCIERS");
        exportLeveranciers();
        System.out.println("EXPORT FABRIKANTEN START");
        exportFabrikanten();
        System.out.println("EXPORT ALGEMENE REKENINGEN");
        exportAlgemeneRekeningen();
        System.out.println("EXPORT BESTELGROEPEN");
        exportBestelgroepen();
        System.out.println("EXPORT PRINTERS");
        exportPrinters();
        System.out.println("EXPORT ETIKETTEN");
        exportEtiketten();
        System.out.println("EXPORT VOORRAADPLAATSEN");
        exportVoorraadPlaatsen();
        System.out.println("EXPORT PRODUCTSUBGROEPEN");
        exportProductSubgroepen();
        System.out.println("EXPORT PRODUCTGROEPEN");
        exportProductgroepen();
        System.out.println("EXPORT PRODUCTCATEGORIEEN");
        exportProductcategorieën();
        System.out.println("EXPORT AANKOOPPRODUCTEN");
        exportAankoopproducten();
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
                DB.executeCustomQuery(query, "Bedrijven");
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

    //EERSTE KEER UITGAANDEBESTELLING EN BESTELBON
    public static void exportBestelbonnenUitgaandeBestellingen() {
        newUitgaandBestellingen = Mapper.oldBestelbonDetailsToNewUitgaandeBestelling();
        newBestelbonnen = Mapper.oldBestelbonHoofdingToNewBestelbon();

        DB.insert(newUitgaandBestellingen, "UitgaandeBestellingen", UitgaandeBestelling.class, true, true);
        DB.insert(newBestelbonnen, "Bestelbonnen", Bestelbon.class, true, false);
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

        DB.insert(newLeveranciers, "Leverancier", Leverancier.class, true, false);
        newLeveranciers.forEach(leverancier -> {
            leverancier.getVerloven().forEach(v -> verloven.add(v));
            leverancier.getOpeningstijden().forEach(v -> openingstijden.add(v));
            leverancier.getLeveringsDagen().forEach(v -> leveringsdagen.add(v));
        });

        DB.insert(verloven, "Verlof", Verlof.class, true, true);
        DB.insert(openingstijden, "Openingstijd", Openingstijd.class, true, true);
        DB.insert(leveringsdagen, "LeveringsDag", LeveringsDag.class, true, true);

        System.out.println("LONG OPERATION!");
        /*
        newLeveranciers.forEach(leverancier -> {
            leverancier.getVerloven().forEach(verlof -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where VerlofId = %d;", "Verlof", leverancier.getId(), verlof.getId());
                DB.executeCustomQuery(query, "Verlof");
            });
            leverancier.getOpeningstijden().forEach(openingstijd -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where OpeningsTijdId = %d;", "Openingstijd", leverancier.getId(), openingstijd.getId());
                DB.executeCustomQuery(query, "Openingstijd");
            });
            leverancier.getLeveringsDagen().forEach(leveringsdag -> {
                String query = String.format("UPDATE %s set LeverancierId = %d where LeveringsDagId = %d;", "LeveringsDag", leverancier.getId(), leveringsdag.getId());
                DB.executeCustomQuery(query, "LeveringsDag");
            });
        })
         */

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

    public static void exportProductSubgroepen() {
        newProductSubGroep = Mapper.oldProductSubGroepToNewProductSubGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();

        newProductSubGroep.forEach(subgroep -> {
            omschrijvingen.add(subgroep.getOmschrijving());
            algemeneRekeningen.add(subgroep.getAlgemeneRekening());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newProductSubGroep, "ProductSubGroep", ProductSubGroep.class, true, false);
    }

    public static void exportProductgroepen() {
        newProductgroepen = Mapper.oldProductgroepToNewProductGroep();
        List<Omschrijving> omschrijvingen = new ArrayList();
        List<AlgemeneRekening> algemeneRekeningen = new ArrayList();

        newProductgroepen.forEach(groep -> {
            List<ProductSubGroep> subGroepen = Mapper.oldProductSubGroepToNewProductSubGroep().stream().filter(e -> e.getProductGroep().getId() == groep.getProductGroepId()).collect(Collectors.toList());
            groep.setProductSubGroepen(subGroepen);
            omschrijvingen.add(groep.getOmschrijving());
            algemeneRekeningen.add(groep.getAlgemeneRekening());
        });

        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(newProductgroepen, "ProductGroep", ProductGroep.class, true, false);
    }

    public static void exportEtiketten() {
        newEtiketten = Mapper.oldEtiketToNewEtiket();
        List<Printer> printers = new ArrayList();

        newEtiketten.forEach(e -> {
            printers.add(e.getPrinter());
        });

        DB.insert(removeDuplicates(printers, newPrinters), "Printers", Printer.class, false, false);
        DB.insert(newEtiketten, "Etiketten", Etiket.class, true, false);
    }

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
        DB.insert(removeDuplicates(productSubgroepen, newProductSubGroep), "ProductSubGroep", ProductSubGroep.class, false, false);
        DB.insert(removeDuplicates(productGroepen, newProductgroepen), "ProductGroep", ProductGroep.class, false, false);
        DB.insert(removeDuplicates(standaardVerpakkingen, newVerpakkingen), "Verpakking", Verpakking.class, true, false);
        DB.insert(removeDuplicates(colliVerpakkingen, newVerpakkingen), "Verpakking", Verpakking.class, false, false);
        DB.insert(removeDuplicates(fabrikanten, newFabrikanten), "Fabrikanten", Fabrikant.class, false, false);
        DB.insert(removeDuplicates(bestelGroepen, newBestelgroepen), "BestelGroepen", BestelGroep.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(analytischeRekeningen, newAnalytischeRekeningen), "AnalytischeRekeningen", AnalytischeRekening.class, true, false);

        DB.insert(newProductcategorieën, "ProductCategorie", ProductCategorie.class, true, false);

    }

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
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, false, true);
        DB.insert(removeDuplicates(algemeneRekeningen, newAlgemeneRekeningen), "AlgemeneRekeningen", AlgemeneRekening.class, false, false);
        DB.insert(removeDuplicates(productSubgroepen, newProductSubGroep), "ProductSubGroep", ProductSubGroep.class, false, false);
        DB.insert(removeDuplicates(productgroepen, newProductgroepen), "ProductGroep", ProductGroep.class, false, false);
        DB.insert(removeDuplicates(fabrikanten, newFabrikanten), "Fabrikanten", Fabrikant.class, false, false);
        DB.insert(removeDuplicates(bestelgroepen, newBestelgroepen), "BestelGroepen", BestelGroep.class, false, false);
        DB.insert(removeDuplicates(etiketten, newEtiketten), "Etiketten", Etiket.class, false, false);
        DB.insert(removeDuplicates(voorraadPlaatsen, newVoorraadPlaatsen), "VoorraadPlaatsen", VoorraadPlaats.class, false, false);
        DB.insert(removeDuplicates(analytischeRekeningen, newAnalytischeRekeningen), "AnalytischeRekeningen", AnalytischeRekening.class, false, false);
        DB.insert(removeDuplicates(productCategorien, newProductcategorieën), "ProductCategorie", ProductCategorie.class, false, false);
        DB.insert(removeDuplicates(receptProducten, newReceptProducten), "ReceptProducten", ReceptProduct.class, false, false);

        DB.insert(newAankoopproducten, "AankoopProducten", AankoopProduct.class, true, false);

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

}
