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
import Bedrijven.Bedrijf;
import Bedrijven.Eigenaar;
import Bedrijven.Fabrikant;
import Bedrijven.Vestiging;
import Bestellingen.BestelVoorstel;
import Import.Import;
import Producten.ReceptProduct;
import Utils.DB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Indy Van Canegem
 * 
 * UITLEG:
 * Alles wordt opgehaald door Import klasse.
 * Alles wordt gemuteerd door de Mapper klasse.
 * Alles wordt weggeschreven door de Export klasse.
 * 
 * UITLEG EXPORT KLASSE:
 * Verwijder commentaar NOOIT! Je moet weten of het de eerste keer is dat een bepaalde klasse wordt 
 * weggeschreven, zodat de boolean deleteAllPrevious op true staat. Daarna mag dit NIET meer.
 */
public class Export {

    public static List<Bedrijf> newBedrijven;
    public static List<Fabrikant> newFabrikanten;
    public static List<OntvangstAdres> newOntvangstAdressen;
    public static List<BestelVoorstel> newBestelvoorstellen;
    private static List<ReceptProduct> newReceptProducten;
    
    public static void export() {
        Import.readOld();
        System.out.println("EXPORT BEDRIJF START");
        exportBedrijf();
        System.out.println("EXPORT FABRIKANTEN START");
        exportFabrikanten();
        System.out.println("EXPORT ONTVANGSTADRESSEN");
        exportOntvangstAdressen();
        System.out.println("EXPORT RECEPTPRODUCTEN (RECEPTPRODUCTEN NIET VOLLEDIG)");
        exportReceptProducten();
        System.out.println("EXPORT BESTELVOORSTELLEN");
        exportBestelvoorstellen();

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
        //VESTIGING ZIJN ADRES WIJST NAAR DIE VAN HET BEDRIJF IN DIT GEVAL.
        DB.insert(vestigingen, "Vestigingen", Vestiging.class, true, false);
        DB.insert(eigenaars, "Eigenaars", Eigenaar.class, true, true); //EIGENAAR bestond nog niet, dus generate ID.
        DB.insert(bankRekeningNummers, "BankRekeningNummers", BankRekeningNummer.class, true, false);
        eigenaars.forEach(eigenaar -> {
            eigenaar.Bedrijven.forEach(bedrijf -> {
                String query = String.format("UPDATE %s set EigenaarId = %d where BedrijfId = %d;", "Bedrijven", eigenaar.getId(), bedrijf.getId());
                DB.executeCustomQuery(query, "Bedrijven");
            });
        });
    }
    
    //EERSTE KEER FABRIKANTEN
    public static void exportFabrikanten(){
        newFabrikanten = Mapper.oldFabrikantToNewFabrikant();
        DB.insert(newFabrikanten, "Fabrikanten", Fabrikant.class, true, false);
    }
    
    //EERSTE KEER ONTVANGSTADRESSEN
    public static void exportOntvangstAdressen(){
        newOntvangstAdressen = Mapper.oldLeveringsAdresToOntvangstAdres();
        List<Adres> adressen = new ArrayList();
 
        newOntvangstAdressen.forEach(ontvangstAdres->{
            adressen.add(ontvangstAdres.Adres);
        });
        
        DB.insert(adressen, "Adressen", Adres.class, false, true);
        DB.insert(newOntvangstAdressen, "OntvangstAdressen", OntvangstAdres.class, true, false);
    }
    
    //EERSTE KEER BESTELVOORSTELLEN
    public static void exportBestelvoorstellen(){
        newBestelvoorstellen = Mapper.oldBestelVoorstelToNewBestelVoorstel();
        DB.insert(newBestelvoorstellen, "BestelVoorstellen", BestelVoorstel.class, true, true);
    }
    
    //EERSTE KEER OMSCRHIJVING = RECEPTPRODUCTEN
    public static void exportReceptProducten(){
        newReceptProducten = Mapper.oldReceptproductToNewReceptproduct();
        List<Omschrijving> omschrijvingen = new ArrayList();
        newReceptProducten.forEach(e->{
            omschrijvingen.add(e.Omschrijving);
        });
        DB.insert(omschrijvingen, "Omschrijvingen", Omschrijving.class, true, true);

        DB.insert(newReceptProducten, "ReceptProducten", ReceptProduct.class, true, false);
    }
    
}
