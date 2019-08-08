/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Import;

import Old.Boekhouding.AankoopfactuurDetail;
import Old.Boekhouding.AankoopfactuurHoofding;
import Old.Boekhouding.AankoopproductInGebruik;
import Old.Aankoopproducten.Aankoopeenheid;
import Old.Aankoopproducten.Aankoopproduct;
import Old.Aankoopproducten.AankoopproductAllergeen;
import Old.Aankoopproducten.AankoopproductEenheidsprijs;
import Old.Aankoopproducten.AankoopproductIngredient;
import Old.Aankoopproducten.AankoopproductLeverancier;
import Old.Aankoopproducten.AankoopproductNutrioneleInformatie;
import Old.Aankoopproducten.AankoopproductTechnischeVersie;
import Old.Aankoopproducten.AankoopproductTekstIngredient;
import Old.Aanspreektitel;
import Old.Afgewerkteproducten.Afgewerktproduct;
import Old.Afgewerkteproducten.AfgewerktproductIngredient;
import Old.Allergeen.Allergeen;
import Old.Allergeen.Allergeengroep;
import Old.Boekhouding.Bankinstelling;
import Old.Etiket.BarcodePrefix;
import Old.Basiseenheid;
import Old.Bedrijf.Bedrijf;
import Old.Boekhouding.BedrijfLink;
import Old.BedrijvenAllergeen;
import Old.Bestelling.BestelbonDetail;
import Old.Bestelling.BestelbonHoofding;
import Old.Bestelling.Bestelgroep;
import Old.Bestelling.Bestelvoorstel;
import Old.Boekhouding.Betalingsvoorwaarde;
import Old.Bewaarconditie;
import Old.Bewaartemperatuur;
import Old.Boekhoudrekening;
import Old.Boekjaar;
import Old.BronVoedingswaarde;
import Old.Boekhouding.Btwcode;
import Old.BtwcodeLeverancier;
import Old.Contactname;
import Old.Dagboek;
import Old.Distributiewijze;
import Old.EigenFabrikaatInGebruik;
import Old.Etiket.Etiket;
import Old.Etiket.EtiketPrinter;
import Old.Etiket.EtiketTekst;
import Old.Etiket.Etiketeenheid;
import Old.EtiketDefault;
import Old.Fabrikant;
import Old.Functie;
import Old.Gebruiker;
import Old.Halffabrikaat;
import Old.Ingredient.IngredientAllergeen;
import Old.Ingredient.Ingredientgroep;
import Old.Ingredient.Ingrediënt;
import Old.Boekhouding.InventarisAankoopproduct;
import Old.Boekhouding.InventarisEigenFabrikaat;
import Old.Boekhouding.KassabestellingDetail;
import Old.Boekhouding.KassabestellingHoofding;
import Old.Klant.Klant;
import Old.Klant.KlantArtikelKoppeling;
import Old.Klant.KlantBestellingStandaard;
import Old.Klant.KlantPrivateLabel;
import Old.KlantVerdeelgroep;
import Old.Kneder;
import Old.Land;
import Old.LandOorsprong;
import Old.Leverancier;
import Old.Leveranciersgroep;
import Old.Levering.Leveringsadres;
import Old.Levering.LeveringsbonDetail;
import Old.Levering.LeveringsbonHoofding;
import Old.Levering.Leveringsfrequentie;
import Old.Levering.Leveringstemperatuur;
import Old.Lijst;
import Old.Lotnummer.LotnummerAanbrenger;
import Old.Lotnummer.LotnummerDrager;
import Old.Lotnummer.LotnummerType;
import Old.Parameters.MicrobiologischeParameter;
import Old.Muntcode;
import Old.Nutrionele.NutrioneleEenheid;
import Old.Nutrionele.NutrioneleInformatieDetail;
import Old.Nutrionele.NutrioneleInformatieHoofding;
import Old.Old;
import Old.OptieDetail;
import Old.OptieHoofding;
import Old.Boekhouding.OrderpickingDetail;
import Old.Boekhouding.OrderpickingHoofding;
import Old.Origine;
import Old.Parameters.ParameterProductielijst;
import Old.Percentage.PercentageKost;
import Old.Percentage.PercentageOnrechtstreekseProductiekost;
import Old.Percentage.PercentageVasteKost;
import Old.Percentage.PercentageWinstmarge;
import Old.PeriodeInstelling;
import Old.Boekhouding.Personeelskost;
import Old.PlanningBasis;
import Old.Boekhouding.PointOfSales;
import Old.Prijseenheid;
import Old.Printer;
import Old.Productie.PrinterProductielijstWerkstation;
import Old.Product.Productcategorie;
import Old.Product.Productgroep;
import Old.Product.Productiegroep;
import Old.Product.Productsubgroep;
import Old.Productie.Productieopdracht;
import Old.Productie.Productieperiode;
import Old.Productie.ProductieopdrachtLotnummer;
import Old.Productie.ProductieopdrachtVerbruik;
import Old.Productie.ProductieopdrachtWerknemer;
import Old.Recept.Recept;
import Old.Productie.RechtstreekseProductiekost;
import Old.ProductieEigenFabrikaatHoofding;
import Old.ProductieVerkoopproductHoofding;
import Old.Regelmaat;
import Old.Taalcode;
import Old.Tekst;
import Old.VariantDetail;
import Old.VariantHoofding;
import Old.Boekhouding.VasteBestellingDetail;
import Old.Boekhouding.VasteBestellingHoofding;
import Old.Ventilatiecode;
import Old.Verdeelgroep;
import Old.Verkoopproducten.Verkoopproduct;
import Old.Verkoopproducten.VerkoopproductAllergeen;
import Old.Verkoopproducten.VerkoopproductIngredient;
import Old.Verkoopproducten.Verkoopproductgroep;
import Old.Verkoopsverpakking;
import Old.Boekhouding.VerkopenDetail;
import Old.Boekhouding.VerkopenHoofding;
import Old.Verpakkingseenheid;
import Old.Boekhouding.VerzendbonDetail;
import Old.Boekhouding.VerzendbonHoofding;
import Old.Voorbereideproducten.Voorbereidproduct;
import Old.Voorraad.Voorraadcorrectie;
import Old.Voorraad.Voorraadeenheid;
import Old.Voorraad.Voorraadplaats;
import Old.Boekhouding.VoorraadcorrectieAankoopproduct;
import Old.Boekhouding.VoorraadcorrectieEigenFabrikaat;
import Old.LijstLeveringOverzichtLeverancierAankoopproduct;
import Old.LijstLeveringTotaalLeverancierAankoopproduct;
import Old.Log.Log;
import Old.Log.LogVerwerkteFile;
import Old.Materieel;
import Old.MaterieelGroep;
import Old.Online.OnlineAankoopproduct;
import Old.Online.OnlineAankoopproductAllergeen;
import Old.Online.OnlineFabrikant;
import Old.Online.OnlineFunctie;
import Old.Online.OnlineVerpakkingseenheid;
import Old.Online.OnlineAankoopproductIngredient;
import Old.Online.OnlineAankoopproductNutrioneleInformatie;
import Old.Online.OnlineIngredient;
import Old.Online.OnlineIngredientAllergeen;
import Old.Online.OnlineOrigine;
import Old.Recept.Recepteenheid;
import Old.Recept.Receptgroep;
import Old.Recept.Receptingave;
import Old.Recept.Receptproduct;
import Old.WebshopAPI;
import Old.Weegschaal.Weegschaal;
import Old.Weegschaal.Weegschaalmodel;
import Old.Werknemer;
import Old.Werkplek;
import Old.Werkstation;
import Old.Woonplaats;
import Utils.OpenCSVReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefa
 */
public class Import {

    private static List<Old> werkstations;
    private static List<Old> lijsten;
    private static List<Old> teksten;
    private static List<Old> aansprekingen;
    private static List<Old> printers;
    private static List<Old> leveranciersgroepen;
    private static List<Old> leveringsfrequenties;
    private static List<Old> muntcodes;
    private static List<Old> betalingsvoorwaardes;
    private static List<Old> dagboeken;
    private static List<Old> boekhoudrekeningen;
    private static List<Old> bankinstellingen;
    private static List<Old> productgroepen;
    private static List<Old> productsubgroepen;
    private static List<Old> productiegroepen;
    private static List<Old> bestelgroepen;
    private static List<Old> receptgroepen;
    private static List<Old> recepteenheden;
    private static List<Old> verpakkingseenheden;
    private static List<Old> voorraadplaatsen;
    private static List<Old> btwcodes;
    private static List<Old> ingredientgroepen;
    private static List<Old> productcategorieen;
    private static List<Old> aankoopeenheden;
    private static List<Old> etiketteneenheden;
    private static List<Old> voorraadeenheden;
    private static List<Old> allergeengroepen;
    private static List<Old> allergenen;
    private static List<Old> verkoopproductgroepen;
    private static List<Old> kneders;
    private static List<Old> basiseenheden;
    private static List<Old> prijseenheden;
    private static List<Old> taalcodes;
    private static List<Old> btwcodesleveranciers;
    private static List<Old> contactnames;
    private static List<Old> werknemers;
    private static List<Old> etiketten;
    private static List<Old> etikettenprinters;
    private static List<Old> receptingaves;
    private static List<Old> bewaartemperaturen;
    private static List<Old> microbiologischeparameters;
    private static List<Old> bronvoedingswaarden;
    private static List<Old> leveringstemperaturen;
    private static List<Old> variantenhoofding;
    private static List<Old> variantendetail;
    private static List<Old> optieshoofding;
    private static List<Old> optiesdetail;
    private static List<Old> etiketteksten;
    private static List<Old> fabrikanten;
    private static List<Old> landenoorsprong;
    private static List<Old> origines;
    private static List<Old> functies;
    private static List<Old> ingredienten;
    private static List<Old> ingredientenallergenen;
    private static List<Old> nutrioneleinformatiehoofding;
    private static List<Old> nutrioneleinformatiedetail;
    private static List<Old> nutrioneleeenheden;
    private static List<Old> lotnummertypes;
    private static List<Old> lotnummerdragers;
    private static List<Old> lotnummeraanbrengers;
    private static List<Old> distributiewijzes;
    private static List<Old> bewaarcondities;
    private static List<Old> webshopsapi;
    private static List<Old> voorraadcorrecties;
    private static List<Old> ventilatiecodes;
    private static List<Old> barcodesprefixen;
    private static List<Old> percentagevastekosten;
    private static List<Old> percentageonrechtstreekseproductiekosten;
    private static List<Old> percentagewinstmarges;
    private static List<Old> percentagekosten;
    private static List<Old> personeelskosten;
    private static List<Old> etikettendefaults;
    private static List<Old> weegschaalmodellen;
    private static List<Old> weegschalen;
    private static List<Old> periodeInstellingen;
    private static List<Old> bedrijven;
    private static List<Old> bedrijvenallergenen;
    private static List<Old> gebruikers;
    private static List<Old> landen;
    private static List<Old> woonplaatsen;
    private static List<Old> leveranciers;
    private static List<Old> aankoopproducten;
    private static List<Old> aankoopproductenallergenen;
    private static List<Old> aankoopproductenleveranciers;
    private static List<Old> aankoopproductennutrioneleinformatie;
    private static List<Old> aankoopproducteningredienten;
    private static List<Old> aankoopproducteneenheidsprijzen;
    private static List<Old> aankoopproductentechnischeversies;
    private static List<Old> receptproducten;
    private static List<Old> halffabrikaten;
    private static List<Old> voorbereideproducten;
    private static List<Old> afgewerkteproducten;
    private static List<Old> afgewerkteproducteningredienten;
    private static List<Old> verkoopproducten;
    private static List<Old> verkoopproductenallergenen;
    private static List<Old> verkoopproducteningredienten;
    private static List<Old> rechtstreekseproductiekosten;
    private static List<Old> klanten;
    private static List<Old> klantenlabel;
    private static List<Old> aankoopproductenteksteningredienten;
    private static List<Old> parametersproductielijsten;
    private static List<Old> printersproductielijstenwerkstations;
    private static List<Old> pointofsales;
    private static List<Old> klantartikelkoppeling;
    private static List<Old> verkoopsverpakkingen;
    private static List<Old> verdeelgroepen;
    private static List<Old> klantenbestellingstandaarden;
    private static List<Old> bedrijvenlinken;
    private static List<Old> klantverdeelgroep;
    private static List<Old> leveringsadressen;
    private static List<Old> recepten;
    private static List<Old> bestelvoorstellen;
    private static List<Old> bestelbonnenhoofding;
    private static List<Old> bestelbonnendetail;
    private static List<Old> leveringsbonnenhoofding;
    private static List<Old> leveringsbonnenhoofdingb;
    private static List<Old> leveringsbonnendetail;
    private static List<Old> leveringsbonnendetailb;
    private static List<Old> inventarisaankoopproducten;
    private static List<Old> inventariseigenfabrikaten;
    private static List<Old> voorraadcorrectiesaankoopproducten;
    private static List<Old> voorraadcorrectieseigenfabrikaten;
    private static List<Old> aankoopproductingebruik;
    private static List<Old> eigenfabrikaatingebruik;
    private static List<Old> productieperiode;
    private static List<Old> productieopdrachten;
    private static List<Old> productieopdrachtenwerknemers;
    private static List<Old> productieopdrachtenverbruik;
    private static List<Old> productieopdrachtenlotnummers;
    private static List<Old> productieverkoopproductenhoofding;
    private static List<Old> productieeigenfabrikatenhoofding;
    private static List<Old> regelmaat;
    private static List<Old> planningbasis;
    private static List<Old> orderpickinghoofding;
    private static List<Old> orderpickingdetail;
    private static List<Old> verzendbonhoofding;
    private static List<Old> verzendbondetail;
    private static List<Old> kassabestellinghoofding;
    private static List<Old> kassabestellingdetail;
    private static List<Old> verkopenhoofding;
    private static List<Old> verkopendetail;
    private static List<Old> vastebestellinghoofding;
    private static List<Old> vastebestellingdetail;
    private static List<Old> boekjaren;
    private static List<Old> aankoopfacturenhoofding;
    private static List<Old> aankoopfacturendetail;
    private static List<Old> materieel;
    private static List<Old> materieelgroep;
    private static List<Old> werkplek;
    private static List<Old> lijstleveringtotaalleverancieraankoopproduct;
    private static List<Old> lijstleveringoverzichtleverancieraankoopproduct;
    private static List<Old> onlineaankoopproducten;
    private static List<Old> onlineverpakkingseenheid;
    private static List<Old> onlinefabrikanten;
    private static List<Old> onlinefuncties;
    private static List<Old> onlineaankoopproducteningredienten;
    private static List<Old> onlineaankoopproductenallergenen;
    private static List<Old> onlineaankoopproductennutrioneleinformatie;
    private static List<Old> onlineingredienten;
    private static List<Old> onlineingredientenallergenen;
    private static List<Old> onlineorigines;
    private static List<Old> logverwerktefiles;
    private static List<Old> log;

    public static void readOld() {
        String WerkstationsT001 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WerkstationsT001.csv";
        String LijstenT004 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LijstenT004.csv";
        String TekstenT008 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\TekstenT008.csv";
        String AansprekingenT101 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AansprekingenT101.csv";
        String PrintersT102 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PrintersT102.csv";
        String LeveranciersgroepenT103 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveranciersgroepenT103.csv";
        String LeveringsfrequentieT104 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsfrequentieT104.csv";
        String MuntcodesT105 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\MuntcodesT105.csv";
        String BetalingsvoorwaardenT106 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BetalingsvoorwaardenT106.csv";
        String DagboekenT107 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\DagboekenT107.csv";
        String BoekhoudrekeningenT108 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BoekhoudrekeningenT108.csv";
        String BankinstellingenT109 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BankinstellingenT109.csv";
        String ProductgroepenT110 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductgroepenT110.csv";
        String ProductsubgroepenT111 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductsubgroepenT111.csv";
        String ProductiegroepenT112 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductiegroepenT112.csv";
        String BestelgroepenT113 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BestelgroepenT113.csv";
        String ReceptgroepenT114 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ReceptgroepenT114.csv";
        String RecepteenhedenT115 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\RecepteenhedenT115.csv";
        String VerpakkingseenhedenT116 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerpakkingseenhedenT116.csv";
        String VoorraadplaatsenT117 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorraadplaatsenT117.csv";
        String BtwcodesT118 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BtwcodesT118.csv";
        String IngrediëntgroepenT119 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\IngrediëntgroepenT119.csv";
        String ProductcategorieT120 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductcategorieT120.csv";
        String AankoopeenhedenT121 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopeenhedenT121.csv";
        String EtiketteneenhedenT122 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EtiketteneenhedenT122.csv";
        String VoorraadeenhedenT123 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorraadeenhedenT123.csv";
        String AllergeengroepenT124 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AllergeengroepenT124.csv";
        String AllergenenT125 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AllergenenT125.csv";
        String VerkoopproductgroepenT126 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkoopproductgroepenT126.csv";
        String KnedersT127 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KnedersT127.csv";
        String BasiseenhedenT128 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BasiseenhedenT128.csv";
        String PrijseenhedenT129 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PrijseenhedenT129.csv";
        String TaalcodesT130 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\TaalcodesT130.csv";
        String BtwcodesLeveranciersT131 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BtwcodesLeveranciersT131.csv";
        String ContactnamesT132 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ContactnamesT132.csv";
        String WerknemersT133 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WerknemersT133.csv";
        String EtikettenT134 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EtikettenT134.csv";
        String EtikettenPrintersT136 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EtikettenPrintersT136.csv";
        String ReceptingavesT135 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ReceptingavesT135.csv";
        String BewaartemperaturenT137 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BewaartemperaturenT137.csv";
        String MicrobiologischeParametersT138 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\MicrobiologischeParametersT138.csv";
        String BronnenVoedingswaardenT139 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BronnenVoedingswaardenT139.csv";
        String LeveringstemperaturenT140 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringstemperaturenT140.csv";
        String VariantenHoofdingT141 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VariantenHoofdingT141.csv";
        String VariantenDetailT142 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VariantenDetailT142.csv";
        String OptiesHoofdingT143 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OptiesHoofdingT143.csv";
        String OptiesDetailT144 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OptiesDetailT144.csv";
        String EtiketTekstenT145 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EtiketTekstenT145.csv";
        String FabrikantenT146 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\FabrikantenT146.csv";
        String LandenOorsprongT147 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LandenOorsprongT147.csv";
        String OriginesT148 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OriginesT148.csv";
        String FunctiesT149 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\FunctiesT149.csv";
        String IngrediëntenT150 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\IngrediëntenT150.csv";
        String IngredientenAllergenenT151 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\IngredientenAllergenenT151.csv";
        String NutrioneleInformatieHoofdingT152 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\NutrioneleInformatieHoofdingT152.csv";
        String NutrioneleInformatieDetailT153 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\NutrioneleInformatieDetailT153.csv";
        String NutrioneleEenhedenT154 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\NutrioneleEenhedenT154.csv";
        String LotnummerTypesT155 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LotnummerTypesT155.csv";
        String LotnummerDragersT156 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LotnummerDragersT156.csv";
        String LotnummerAanbrengersT157 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LotnummerAanbrengersT157.csv";
        String DistributiewijzesT158 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\DistributiewijzesT158.csv";
        String BewaarconditiesT159 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BewaarconditiesT159.csv";
        String WebshopsAPIT160 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WebshopsAPIT160.csv";
        String VoorraadcorrectiesT161 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorraadcorrectiesT161.csv";
        String VentilatiecodesT162 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VentilatiecodesT162.csv";
        String BarcodePrefixenT163 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BarcodePrefixenT163.csv";
        String PercentageVasteKostenT171 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PercentageVasteKostenT171.csv";
        String PercentageOnrechtstreekseProductiekostenT172 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PercentageOnrechtstreekseProductiekostenT172.csv";
        String PercentageWinstmargesT173 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PercentageWinstmargesT173.csv";
        String PercentageKostenT174 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PercentageKostenT174.csv";
        String PersoneelskostenT175 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PersoneelskostenT175.csv";
        String EtikettenDefaultsT176 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EtikettenDefaultsT176.csv";
        String WeegschaalmodellenT177 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WeegschaalmodellenT177.csv";
        String WeegschalenT178 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WeegschalenT178.csv";
        String PeriodeInstellingenT179 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PeriodeInstellingenT179.csv";
        String BedrijvenT201 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BedrijvenT201.csv";
        String BedrijvenAllergenenT207 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BedrijvenAllergenenT207.csv";
        String GebruikersT202 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\GebruikersT202.csv";
        String LandenT203 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LandenT203.csv";
        String WoonplaatsenT204 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WoonplaatsenT204.csv";
        String LeveranciersT205 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveranciersT205.csv";
        String AankoopproductenT206 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenT206.csv";
        String AankoopproductenAllergenenT208 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenAllergenenT208.csv";
        String AankoopproductenLeveranciersT209 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenLeveranciersT209.csv";
        String AankoopproductenNutrioneleInformatieT211 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenNutrioneleInformatieT211.csv";
        String AankoopproductenIngredientenT217 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenIngredientenT217.csv";
        String AankoopproductenEenheidsprijzenT220 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenEenheidsprijzenT220.csv";
        String AankoopproductenTechnischeVersiesT228 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenTechnischeVersiesT228.csv";
        String ReceptproductenT210 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ReceptproductenT210.csv";
        String HalffabrikatenT212 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\HalffabrikatenT212.csv";
        String VoorbereideProductenT213 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorbereideProductenT213.csv";
        String AfgewerkteProductenT214 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AfgewerkteProductenT214.csv";
        String AfgewerkteProductenIngredientenT216 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AfgewerkteProductenIngredientenT216.csv";
        String VerkoopproductenT215 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkoopproductenT215.csv";
        String VerkoopproductenAllergenenT229 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkoopproductenAllergenenT229.csv";
        String VerkoopproductenIngredientenT230 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkoopproductenIngredientenT230.csv";
        String RechtstreekseProductiekostenT219 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\RechtstreekseProductiekostenT219.csv";
        String KlantenT225 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KlantenT225.csv";
        String KlantenPrivateLabelT226 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KlantenPrivateLabelT226.csv";
        String AankoopproductenTekstenIngredientenT227 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductenTekstenIngredientenT227.csv";
        String ParametersProductielijstenT234 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ParametersProductielijstenT234.csv";
        String PrintersProductielijstenWerkstationT236 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PrintersProductielijstenWerkstationT236.csv";
        String PointOfSalesT237 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PointOfSalesT237.csv";
        String KlantArtikelsKoppelingT238 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KlantArtikelsKoppelingT238.csv";
        String VerkoopsverpakkingenT239 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkoopsverpakkingenT239.csv";
        String VerdeelgroepenT240 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerdeelgroepenT240.csv";
        String KlantenBestellingenStandaardenT241 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KlantenBestellingenStandaardenT241.csv";
        String BedrijvenLinkenT242 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BedrijvenLinkenT242.csv";
        String KlantVerdeelgroepenT243 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KlantVerdeelgroepenT243.csv";
        String LeveringsadressenT250 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsadressenT250.csv";
        String ReceptenT301 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ReceptenT301.csv";
        String BestelvoorstellenT350 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BestelvoorstellenT350.csv";
        String BestelbonnenHoofdingT351 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BestelbonnenHoofdingT351.csv";
        String BestelbonnenDetailT352 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BestelbonnenDetailT352.csv";
        String LeveringsbonnenHoofdingT401 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsbonnenHoofdingT401.csv";
        String LeveringsbonnenHoofdingT401b = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsbonnenHoofdingT401b.csv";
        String LeveringsbonnenDetailT402 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsbonnenDetailT402.csv";
        String LeveringsbonnenDetailT402b = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LeveringsbonnenDetailT402b.csv";
        String InventarisAankoopproductenT451 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\InventarisAankoopproductenT451.csv";
        String InventarisEigenFabrikatenT452 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\InventarisEigenFabrikatenT452.csv";
        String VoorraadcorrectiesAankoopproductenT453 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorraadcorrectiesAankoopproductenT453.csv";
        String VoorraadcorrectieEigenFabrikatenT454 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VoorraadcorrectieEigenFabrikatenT454.csv";
        String AankoopproductInGebruikT461 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopproductInGebruikT461.csv";
        String EigenFabrikaatInGebruikT462 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\EigenFabrikaatInGebruikT462.csv";
        String ProductieperiodeT500 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieperiodeT500.csv";
        String ProductieopdrachtenT501 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieopdrachtenT501.csv";
        String ProductieopdrachtenWerknemersT502 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieopdrachtenWerknemersT502.csv";
        String ProductieopdrachtenVerbruikT503 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieopdrachtenVerbruikT503.csv";
        String ProductieopdrachtenLotnummersT504 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieopdrachtenLotnummersT504.csv";
        String ProductieVerkoopproductenHoofdingT508 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieVerkoopproductenHoofdingT508.csv";
        String ProductieEigenFabrikatenHoofdingT509 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\ProductieEigenFabrikatenHoofdingT509.csv";
        String RegelmaatT520 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\RegelmaatT520.csv";
        String PlanningBasisT525 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\PlanningBasisT525.csv";
        String OrderpickingHoofdingT601 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OrderpickingHoofdingT601.csv";
        String OrderpickingDetailT602 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OrderpickingDetailT602.csv";
        String VerzendbonHoofdingT603 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerzendbonHoofdingT603.csv";
        String VerzendbonDetailT604 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerzendbonDetailT604.csv";
        String KassabestellingHoofdingT605 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KassabestellingHoofdingT605.csv";
        String KassabestellingDetailT606 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\KassabestellingDetailT606.csv";
        String VerkopenHoofdingT621 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkopenHoofdingT621.csv";
        String VerkopenDetailT622 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VerkopenDetailT622.csv";
        String VasteBestellingHoofdingT651 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VasteBestellingHoofdingT651.csv";
        String VasteBestellingDetailT652 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\VasteBestellingDetailT652.csv";
        String BoekjarenT700 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\BoekjarenT700.csv";
        String AankoopfacturenHoofdingT701 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopfacturenHoofdingT701.csv";
        String AankoopfacturenDetailT702 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\AankoopfacturenDetailT702.csv";
        String MaterieelT803 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\MaterieelT803.csv";
        String MaterieelGroepT812 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\MaterieelGroepT812.csv";
        String WerkplekT813 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\WerkplekT813.csv";
        String LijstLeveringenTotalenLeverancierAankoopproductT901 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LijstLeveringenTotalenLeverancierAankoopproductT901.csv";
        String LijstLeveringenOverzichtLeverancierAankoopproductT904 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LijstLeveringenOverzichtLeverancierAankoopproductT904.csv";
        String OnlineAankoopproductenT950 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineAankoopproductenT950.csv";
        String OnlineVerpakkingseenheidT951 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineVerpakkingseenheidT951.csv";
        String OnlineFabrikantenT952 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineFabrikantenT952.csv";
        String OnlineFunctiesT953 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineFunctiesT953.csv";
        String OnlineAankoopproductenIngrediëntenT954 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineAankoopproductenIngrediëntenT954.csv";
        String OnlineAankoopproductenAllergenenT955 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineAankoopproductenAllergenenT955.csv";
        String OnlineAankoopproductenNutrioneleInformatieT956 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineAankoopproductenNutrioneleInformatieT956.csv";
        String OnlineIngredientenT957 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineIngredientenT957.csv";
        String OnlineIngredientenAllergenenT958 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineIngredientenAllergenenT958.csv";
        String OnlineOriginesT959 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\OnlineOriginesT959.csv";
        String LogVerwerkteFilesT990 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LogVerwerkteFilesT990.csv";
        String LogT999 = "C:\\Users\\stefa\\OneDrive\\Bureaublad\\DATA MIGRATION INDY\\data excel\\LogT999.csv";

        try {

            werkstations = OpenCSVReader.parseCsvFileToBeans(WerkstationsT001, ';', Werkstation.class);

            lijsten = OpenCSVReader.parseCsvFileToBeans(LijstenT004, ';', Lijst.class);

            teksten = OpenCSVReader.parseCsvFileToBeans(TekstenT008, ';', Tekst.class);

            aansprekingen = OpenCSVReader.parseCsvFileToBeans(AansprekingenT101, ';', Aanspreektitel.class);

            printers = OpenCSVReader.parseCsvFileToBeans(PrintersT102, ';', Printer.class);

            leveranciersgroepen = OpenCSVReader.parseCsvFileToBeans(LeveranciersgroepenT103, ';', Leveranciersgroep.class);

            leveringsfrequenties = OpenCSVReader.parseCsvFileToBeans(LeveringsfrequentieT104, ';', Leveringsfrequentie.class);

            muntcodes = OpenCSVReader.parseCsvFileToBeans(MuntcodesT105, ';', Muntcode.class);

            betalingsvoorwaardes = OpenCSVReader.parseCsvFileToBeans(BetalingsvoorwaardenT106, ';', Betalingsvoorwaarde.class);

            dagboeken = OpenCSVReader.parseCsvFileToBeans(DagboekenT107, ';', Dagboek.class);

            boekhoudrekeningen = OpenCSVReader.parseCsvFileToBeans(BoekhoudrekeningenT108, ';', Boekhoudrekening.class);

            bankinstellingen = OpenCSVReader.parseCsvFileToBeans(BankinstellingenT109, ';', Bankinstelling.class);

            productgroepen = OpenCSVReader.parseCsvFileToBeans(ProductgroepenT110, ';', Productgroep.class);

            productsubgroepen = OpenCSVReader.parseCsvFileToBeans(ProductsubgroepenT111, ';', Productsubgroep.class);

            productiegroepen = OpenCSVReader.parseCsvFileToBeans(ProductiegroepenT112, ';', Productiegroep.class);

            bestelgroepen = OpenCSVReader.parseCsvFileToBeans(BestelgroepenT113, ';', Bestelgroep.class);

            receptgroepen = OpenCSVReader.parseCsvFileToBeans(ReceptgroepenT114, ';', Receptgroep.class);

            recepteenheden = OpenCSVReader.parseCsvFileToBeans(RecepteenhedenT115, ';', Recepteenheid.class);

            verpakkingseenheden = OpenCSVReader.parseCsvFileToBeans(VerpakkingseenhedenT116, ';', Verpakkingseenheid.class);

            voorraadplaatsen = OpenCSVReader.parseCsvFileToBeans(VoorraadplaatsenT117, ';', Voorraadplaats.class);

            btwcodes = OpenCSVReader.parseCsvFileToBeans(BtwcodesT118, ';', Btwcode.class);

            ingredientgroepen = OpenCSVReader.parseCsvFileToBeans(IngrediëntgroepenT119, ';', Ingredientgroep.class);

            productcategorieen = OpenCSVReader.parseCsvFileToBeans(ProductcategorieT120, ';', Productcategorie.class);

            aankoopeenheden = OpenCSVReader.parseCsvFileToBeans(AankoopeenhedenT121, ';', Aankoopeenheid.class);

            etiketteneenheden = OpenCSVReader.parseCsvFileToBeans(EtiketteneenhedenT122, ';', Etiketeenheid.class);

            voorraadeenheden = OpenCSVReader.parseCsvFileToBeans(VoorraadeenhedenT123, ';', Voorraadeenheid.class);

            allergeengroepen = OpenCSVReader.parseCsvFileToBeans(AllergeengroepenT124, ';', Allergeengroep.class);

            allergenen = OpenCSVReader.parseCsvFileToBeans(AllergenenT125, ';', Allergeen.class);

            verkoopproductgroepen = OpenCSVReader.parseCsvFileToBeans(VerkoopproductgroepenT126, ';', Verkoopproductgroep.class);

            kneders = OpenCSVReader.parseCsvFileToBeans(KnedersT127, ';', Kneder.class);

            basiseenheden = OpenCSVReader.parseCsvFileToBeans(BasiseenhedenT128, ';', Basiseenheid.class);

            prijseenheden = OpenCSVReader.parseCsvFileToBeans(PrijseenhedenT129, ';', Prijseenheid.class);

            taalcodes = OpenCSVReader.parseCsvFileToBeans(TaalcodesT130, ';', Taalcode.class);

            btwcodesleveranciers = OpenCSVReader.parseCsvFileToBeans(BtwcodesLeveranciersT131, ';', BtwcodeLeverancier.class);

            contactnames = OpenCSVReader.parseCsvFileToBeans(ContactnamesT132, ';', Contactname.class);

            werknemers = OpenCSVReader.parseCsvFileToBeans(WerknemersT133, ';', Werknemer.class);

            etiketten = OpenCSVReader.parseCsvFileToBeans(EtikettenT134, ';', Etiket.class);

            etikettenprinters = OpenCSVReader.parseCsvFileToBeans(EtikettenPrintersT136, ';', EtiketPrinter.class);

            receptingaves = OpenCSVReader.parseCsvFileToBeans(ReceptingavesT135, ';', Receptingave.class);

            bewaartemperaturen = OpenCSVReader.parseCsvFileToBeans(BewaartemperaturenT137, ';', Bewaartemperatuur.class);

            microbiologischeparameters = OpenCSVReader.parseCsvFileToBeans(MicrobiologischeParametersT138, ';', MicrobiologischeParameter.class);

            bronvoedingswaarden = OpenCSVReader.parseCsvFileToBeans(BronnenVoedingswaardenT139, ';', BronVoedingswaarde.class);

            leveringstemperaturen = OpenCSVReader.parseCsvFileToBeans(LeveringstemperaturenT140, ';', Leveringstemperatuur.class);

            variantenhoofding = OpenCSVReader.parseCsvFileToBeans(VariantenHoofdingT141, ';', VariantHoofding.class);

            variantendetail = OpenCSVReader.parseCsvFileToBeans(VariantenDetailT142, ';', VariantDetail.class);

            optieshoofding = OpenCSVReader.parseCsvFileToBeans(OptiesHoofdingT143, ';', OptieHoofding.class);

            optiesdetail = OpenCSVReader.parseCsvFileToBeans(OptiesDetailT144, ';', OptieDetail.class);

            etiketteksten = OpenCSVReader.parseCsvFileToBeans(EtiketTekstenT145, ';', EtiketTekst.class);

            fabrikanten = OpenCSVReader.parseCsvFileToBeans(FabrikantenT146, ';', Fabrikant.class);

            landenoorsprong = OpenCSVReader.parseCsvFileToBeans(LandenOorsprongT147, ';', LandOorsprong.class);

            origines = OpenCSVReader.parseCsvFileToBeans(OriginesT148, ';', Origine.class);

            functies = OpenCSVReader.parseCsvFileToBeans(FunctiesT149, ';', Functie.class);

            ingredienten = OpenCSVReader.parseCsvFileToBeans(IngrediëntenT150, ';', Ingrediënt.class);

            ingredientenallergenen = OpenCSVReader.parseCsvFileToBeans(IngredientenAllergenenT151, ';', IngredientAllergeen.class);

            nutrioneleinformatiehoofding = OpenCSVReader.parseCsvFileToBeans(NutrioneleInformatieHoofdingT152, ';', NutrioneleInformatieHoofding.class);

            nutrioneleinformatiedetail = OpenCSVReader.parseCsvFileToBeans(NutrioneleInformatieDetailT153, ';', NutrioneleInformatieDetail.class);

            nutrioneleeenheden = OpenCSVReader.parseCsvFileToBeans(NutrioneleEenhedenT154, ';', NutrioneleEenheid.class);

            lotnummertypes = OpenCSVReader.parseCsvFileToBeans(LotnummerTypesT155, ';', LotnummerType.class);

            lotnummerdragers = OpenCSVReader.parseCsvFileToBeans(LotnummerDragersT156, ';', LotnummerDrager.class);

            lotnummeraanbrengers = OpenCSVReader.parseCsvFileToBeans(LotnummerAanbrengersT157, ';', LotnummerAanbrenger.class);

            distributiewijzes = OpenCSVReader.parseCsvFileToBeans(DistributiewijzesT158, ';', Distributiewijze.class);

            bewaarcondities = OpenCSVReader.parseCsvFileToBeans(BewaarconditiesT159, ';', Bewaarconditie.class);

            webshopsapi = OpenCSVReader.parseCsvFileToBeans(WebshopsAPIT160, ';', WebshopAPI.class);

            voorraadcorrecties = OpenCSVReader.parseCsvFileToBeans(VoorraadcorrectiesT161, ';', Voorraadcorrectie.class);

            ventilatiecodes = OpenCSVReader.parseCsvFileToBeans(VentilatiecodesT162, ';', Ventilatiecode.class);

            barcodesprefixen = OpenCSVReader.parseCsvFileToBeans(BarcodePrefixenT163, ';', BarcodePrefix.class);

            percentagevastekosten = OpenCSVReader.parseCsvFileToBeans(PercentageVasteKostenT171, ';', PercentageVasteKost.class);

            percentageonrechtstreekseproductiekosten = OpenCSVReader.parseCsvFileToBeans(PercentageOnrechtstreekseProductiekostenT172, ';', PercentageOnrechtstreekseProductiekost.class);

            percentagewinstmarges = OpenCSVReader.parseCsvFileToBeans(PercentageWinstmargesT173, ';', PercentageWinstmarge.class);

            percentagekosten = OpenCSVReader.parseCsvFileToBeans(PercentageKostenT174, ';', PercentageKost.class);

            personeelskosten = OpenCSVReader.parseCsvFileToBeans(PersoneelskostenT175, ';', Personeelskost.class);

            etikettendefaults = OpenCSVReader.parseCsvFileToBeans(EtikettenDefaultsT176, ';', EtiketDefault.class);

            weegschaalmodellen = OpenCSVReader.parseCsvFileToBeans(WeegschaalmodellenT177, ';', Weegschaalmodel.class);

            weegschalen = OpenCSVReader.parseCsvFileToBeans(WeegschalenT178, ';', Weegschaal.class);

            periodeInstellingen = OpenCSVReader.parseCsvFileToBeans(PeriodeInstellingenT179, ';', PeriodeInstelling.class);

            bedrijven = OpenCSVReader.parseCsvFileToBeans(BedrijvenT201, ';', Bedrijf.class);

            bedrijvenallergenen = OpenCSVReader.parseCsvFileToBeans(BedrijvenAllergenenT207, ';', BedrijvenAllergeen.class);

            gebruikers = OpenCSVReader.parseCsvFileToBeans(GebruikersT202, ';', Gebruiker.class);

            landen = OpenCSVReader.parseCsvFileToBeans(LandenT203, ';', Land.class);

            woonplaatsen = OpenCSVReader.parseCsvFileToBeans(WoonplaatsenT204, ';', Woonplaats.class);

            leveranciers = OpenCSVReader.parseCsvFileToBeans(LeveranciersT205, ';', Leverancier.class);

            aankoopproducten = OpenCSVReader.parseCsvFileToBeans(AankoopproductenT206, ';', Aankoopproduct.class);

            aankoopproductenallergenen = OpenCSVReader.parseCsvFileToBeans(AankoopproductenAllergenenT208, ';', AankoopproductAllergeen.class);

            aankoopproductenleveranciers = OpenCSVReader.parseCsvFileToBeans(AankoopproductenLeveranciersT209, ';', AankoopproductLeverancier.class);

            aankoopproductennutrioneleinformatie = OpenCSVReader.parseCsvFileToBeans(AankoopproductenNutrioneleInformatieT211, ';', AankoopproductNutrioneleInformatie.class);

            aankoopproducteningredienten = OpenCSVReader.parseCsvFileToBeans(AankoopproductenIngredientenT217, ';', AankoopproductIngredient.class);

            aankoopproducteneenheidsprijzen = OpenCSVReader.parseCsvFileToBeans(AankoopproductenEenheidsprijzenT220, ';', AankoopproductEenheidsprijs.class);

            aankoopproductentechnischeversies = OpenCSVReader.parseCsvFileToBeans(AankoopproductenTechnischeVersiesT228, ';', AankoopproductTechnischeVersie.class);

            receptproducten = OpenCSVReader.parseCsvFileToBeans(ReceptproductenT210, ';', Receptproduct.class);

            halffabrikaten = OpenCSVReader.parseCsvFileToBeans(HalffabrikatenT212, ';', Halffabrikaat.class);

            voorbereideproducten = OpenCSVReader.parseCsvFileToBeans(VoorbereideProductenT213, ';', Voorbereidproduct.class);

            afgewerkteproducten = OpenCSVReader.parseCsvFileToBeans(AfgewerkteProductenT214, ';', Afgewerktproduct.class);

            afgewerkteproducteningredienten = OpenCSVReader.parseCsvFileToBeans(AfgewerkteProductenIngredientenT216, ';', AfgewerktproductIngredient.class);

            verkoopproducten = OpenCSVReader.parseCsvFileToBeans(VerkoopproductenT215, ';', Verkoopproduct.class);

            verkoopproductenallergenen = OpenCSVReader.parseCsvFileToBeans(VerkoopproductenAllergenenT229, ';', VerkoopproductAllergeen.class);

            verkoopproducteningredienten = OpenCSVReader.parseCsvFileToBeans(VerkoopproductenIngredientenT230, ';', VerkoopproductIngredient.class);

            rechtstreekseproductiekosten = OpenCSVReader.parseCsvFileToBeans(RechtstreekseProductiekostenT219, ';', RechtstreekseProductiekost.class);

            klanten = OpenCSVReader.parseCsvFileToBeans(KlantenT225, ';', Klant.class);

            klantenlabel = OpenCSVReader.parseCsvFileToBeans(KlantenPrivateLabelT226, ';', KlantPrivateLabel.class);

            aankoopproductenteksteningredienten = OpenCSVReader.parseCsvFileToBeans(AankoopproductenTekstenIngredientenT227, ';', AankoopproductTekstIngredient.class);

            parametersproductielijsten = OpenCSVReader.parseCsvFileToBeans(ParametersProductielijstenT234, ';', ParameterProductielijst.class);

            printersproductielijstenwerkstations = OpenCSVReader.parseCsvFileToBeans(PrintersProductielijstenWerkstationT236, ';', PrinterProductielijstWerkstation.class);

            pointofsales = OpenCSVReader.parseCsvFileToBeans(PointOfSalesT237, ';', PointOfSales.class);

            klantartikelkoppeling = OpenCSVReader.parseCsvFileToBeans(KlantArtikelsKoppelingT238, ';', KlantArtikelKoppeling.class);

            verkoopsverpakkingen = OpenCSVReader.parseCsvFileToBeans(VerkoopsverpakkingenT239, ';', Verkoopsverpakking.class);

            verdeelgroepen = OpenCSVReader.parseCsvFileToBeans(VerdeelgroepenT240, ';', Verdeelgroep.class);

            klantenbestellingstandaarden = OpenCSVReader.parseCsvFileToBeans(KlantenBestellingenStandaardenT241, ';', KlantBestellingStandaard.class);

            bedrijvenlinken = OpenCSVReader.parseCsvFileToBeans(BedrijvenLinkenT242, ';', BedrijfLink.class);

            klantverdeelgroep = OpenCSVReader.parseCsvFileToBeans(KlantVerdeelgroepenT243, ';', KlantVerdeelgroep.class);

            leveringsadressen = OpenCSVReader.parseCsvFileToBeans(LeveringsadressenT250, ';', Leveringsadres.class);

            recepten = OpenCSVReader.parseCsvFileToBeans(ReceptenT301, ';', Recept.class);

            bestelvoorstellen = OpenCSVReader.parseCsvFileToBeans(BestelvoorstellenT350, ';', Bestelvoorstel.class);

            bestelbonnenhoofding = OpenCSVReader.parseCsvFileToBeans(BestelbonnenHoofdingT351, ';', BestelbonHoofding.class);

            bestelbonnendetail = OpenCSVReader.parseCsvFileToBeans(BestelbonnenDetailT352, ';', BestelbonDetail.class);

            leveringsbonnenhoofding = OpenCSVReader.parseCsvFileToBeans(LeveringsbonnenHoofdingT401, ';', LeveringsbonHoofding.class);

            leveringsbonnenhoofdingb = OpenCSVReader.parseCsvFileToBeans(LeveringsbonnenHoofdingT401b, ';', LeveringsbonHoofding.class);

            leveringsbonnendetail = OpenCSVReader.parseCsvFileToBeans(LeveringsbonnenDetailT402, ';', LeveringsbonDetail.class);

            leveringsbonnendetailb = OpenCSVReader.parseCsvFileToBeans(LeveringsbonnenDetailT402b, ';', LeveringsbonDetail.class);

            inventarisaankoopproducten = OpenCSVReader.parseCsvFileToBeans(InventarisAankoopproductenT451, ';', InventarisAankoopproduct.class);

            inventariseigenfabrikaten = OpenCSVReader.parseCsvFileToBeans(InventarisEigenFabrikatenT452, ';', InventarisEigenFabrikaat.class);

            voorraadcorrectiesaankoopproducten = OpenCSVReader.parseCsvFileToBeans(VoorraadcorrectiesAankoopproductenT453, ';', VoorraadcorrectieAankoopproduct.class);

            voorraadcorrectieseigenfabrikaten = OpenCSVReader.parseCsvFileToBeans(VoorraadcorrectieEigenFabrikatenT454, ';', VoorraadcorrectieEigenFabrikaat.class);

            aankoopproductingebruik = OpenCSVReader.parseCsvFileToBeans(AankoopproductInGebruikT461, ';', AankoopproductInGebruik.class);

            eigenfabrikaatingebruik = OpenCSVReader.parseCsvFileToBeans(EigenFabrikaatInGebruikT462, ';', EigenFabrikaatInGebruik.class);

            productieperiode = OpenCSVReader.parseCsvFileToBeans(ProductieperiodeT500, ';', Productieperiode.class);

            productieopdrachten = OpenCSVReader.parseCsvFileToBeans(ProductieopdrachtenT501, ';', Productieopdracht.class);

            productieopdrachtenwerknemers = OpenCSVReader.parseCsvFileToBeans(ProductieopdrachtenWerknemersT502, ';', ProductieopdrachtWerknemer.class);

            productieopdrachtenverbruik = OpenCSVReader.parseCsvFileToBeans(ProductieopdrachtenVerbruikT503, ';', ProductieopdrachtVerbruik.class);

            productieopdrachtenlotnummers = OpenCSVReader.parseCsvFileToBeans(ProductieopdrachtenLotnummersT504, ';', ProductieopdrachtLotnummer.class);

            productieverkoopproductenhoofding = OpenCSVReader.parseCsvFileToBeans(ProductieVerkoopproductenHoofdingT508, ';', ProductieVerkoopproductHoofding.class);

            productieeigenfabrikatenhoofding = OpenCSVReader.parseCsvFileToBeans(ProductieEigenFabrikatenHoofdingT509, ';', ProductieEigenFabrikaatHoofding.class);

            regelmaat = OpenCSVReader.parseCsvFileToBeans(RegelmaatT520, ';', Regelmaat.class);

            planningbasis = OpenCSVReader.parseCsvFileToBeans(PlanningBasisT525, ';', PlanningBasis.class);

            orderpickinghoofding = OpenCSVReader.parseCsvFileToBeans(OrderpickingHoofdingT601, ';', OrderpickingHoofding.class);

            orderpickingdetail = OpenCSVReader.parseCsvFileToBeans(OrderpickingDetailT602, ';', OrderpickingDetail.class);

            verzendbonhoofding = OpenCSVReader.parseCsvFileToBeans(VerzendbonHoofdingT603, ';', VerzendbonHoofding.class);

            verzendbondetail = OpenCSVReader.parseCsvFileToBeans(VerzendbonDetailT604, ';', VerzendbonDetail.class);

            kassabestellinghoofding = OpenCSVReader.parseCsvFileToBeans(KassabestellingHoofdingT605, ';', KassabestellingHoofding.class);

            kassabestellingdetail = OpenCSVReader.parseCsvFileToBeans(KassabestellingDetailT606, ';', KassabestellingDetail.class);

            verkopenhoofding = OpenCSVReader.parseCsvFileToBeans(VerkopenHoofdingT621, ';', VerkopenHoofding.class);

            verkopendetail = OpenCSVReader.parseCsvFileToBeans(VerkopenDetailT622, ';', VerkopenDetail.class);

            vastebestellinghoofding = OpenCSVReader.parseCsvFileToBeans(VasteBestellingHoofdingT651, ';', VasteBestellingHoofding.class);

            vastebestellingdetail = OpenCSVReader.parseCsvFileToBeans(VasteBestellingDetailT652, ';', VasteBestellingDetail.class);

            boekjaren = OpenCSVReader.parseCsvFileToBeans(BoekjarenT700, ';', Boekjaar.class);

            aankoopfacturenhoofding = OpenCSVReader.parseCsvFileToBeans(AankoopfacturenHoofdingT701, ';', AankoopfactuurHoofding.class);

            aankoopfacturendetail = OpenCSVReader.parseCsvFileToBeans(AankoopfacturenDetailT702, ';', AankoopfactuurDetail.class);

            materieel = OpenCSVReader.parseCsvFileToBeans(MaterieelT803, ';', Materieel.class);

            materieelgroep = OpenCSVReader.parseCsvFileToBeans(MaterieelGroepT812, ';', MaterieelGroep.class);

            werkplek = OpenCSVReader.parseCsvFileToBeans(WerkplekT813, ';', Werkplek.class);

            lijstleveringtotaalleverancieraankoopproduct = OpenCSVReader.parseCsvFileToBeans(LijstLeveringenTotalenLeverancierAankoopproductT901, ';', LijstLeveringTotaalLeverancierAankoopproduct.class);

            lijstleveringoverzichtleverancieraankoopproduct = OpenCSVReader.parseCsvFileToBeans(LijstLeveringenOverzichtLeverancierAankoopproductT904, ';', LijstLeveringOverzichtLeverancierAankoopproduct.class);

            onlineaankoopproducten = OpenCSVReader.parseCsvFileToBeans(OnlineAankoopproductenT950, ';', OnlineAankoopproduct.class);

            onlineverpakkingseenheid = OpenCSVReader.parseCsvFileToBeans(OnlineVerpakkingseenheidT951, ';', OnlineVerpakkingseenheid.class);

            onlinefabrikanten = OpenCSVReader.parseCsvFileToBeans(OnlineFabrikantenT952, ';', OnlineFabrikant.class);

            onlinefuncties = OpenCSVReader.parseCsvFileToBeans(OnlineFunctiesT953, ';', OnlineFunctie.class);

            onlineaankoopproducteningredienten = OpenCSVReader.parseCsvFileToBeans(OnlineAankoopproductenIngrediëntenT954, ';', OnlineAankoopproductIngredient.class);

            onlineaankoopproductenallergenen = OpenCSVReader.parseCsvFileToBeans(OnlineAankoopproductenAllergenenT955, ';', OnlineAankoopproductAllergeen.class);

            onlineaankoopproductennutrioneleinformatie = OpenCSVReader.parseCsvFileToBeans(OnlineAankoopproductenNutrioneleInformatieT956, ';', OnlineAankoopproductNutrioneleInformatie.class);

            onlineingredienten = OpenCSVReader.parseCsvFileToBeans(OnlineIngredientenT957, ';', OnlineIngredient.class);

            onlineingredientenallergenen = OpenCSVReader.parseCsvFileToBeans(OnlineIngredientenAllergenenT958, ';', OnlineIngredientAllergeen.class);

            onlineorigines = OpenCSVReader.parseCsvFileToBeans(OnlineOriginesT959, ';', OnlineOrigine.class);

            logverwerktefiles = OpenCSVReader.parseCsvFileToBeans(LogVerwerkteFilesT990, ';', LogVerwerkteFile.class);

            log = OpenCSVReader.parseCsvFileToBeans(LogT999, ';', Log.class);

        } catch (IOException ex) {
            Logger.getLogger(Import.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Old> getWerkstations() {
        return werkstations;
    }

    public static void setWerkstations(List<Old> werkstations) {
        Import.werkstations = werkstations;
    }

    public static List<Old> getLijsten() {
        return lijsten;
    }

    public static void setLijsten(List<Old> lijsten) {
        Import.lijsten = lijsten;
    }

    public static List<Old> getTeksten() {
        return teksten;
    }

    public static void setTeksten(List<Old> teksten) {
        Import.teksten = teksten;
    }

    public static List<Old> getAansprekingen() {
        return aansprekingen;
    }

    public static void setAansprekingen(List<Old> aansprekingen) {
        Import.aansprekingen = aansprekingen;
    }

    public static List<Old> getPrinters() {
        return printers;
    }

    public static void setPrinters(List<Old> printers) {
        Import.printers = printers;
    }

    public static List<Old> getLeveranciersgroepen() {
        return leveranciersgroepen;
    }

    public static void setLeveranciersgroepen(List<Old> leveranciersgroepen) {
        Import.leveranciersgroepen = leveranciersgroepen;
    }

    public static List<Old> getLeveringsfrequenties() {
        return leveringsfrequenties;
    }

    public static void setLeveringsfrequenties(List<Old> leveringsfrequenties) {
        Import.leveringsfrequenties = leveringsfrequenties;
    }

    public static List<Old> getMuntcodes() {
        return muntcodes;
    }

    public static void setMuntcodes(List<Old> muntcodes) {
        Import.muntcodes = muntcodes;
    }

    public static List<Old> getBetalingsvoorwaardes() {
        return betalingsvoorwaardes;
    }

    public static void setBetalingsvoorwaardes(List<Old> betalingsvoorwaardes) {
        Import.betalingsvoorwaardes = betalingsvoorwaardes;
    }

    public static List<Old> getDagboeken() {
        return dagboeken;
    }

    public static void setDagboeken(List<Old> dagboeken) {
        Import.dagboeken = dagboeken;
    }

    public static List<Old> getBoekhoudrekeningen() {
        return boekhoudrekeningen;
    }

    public static void setBoekhoudrekeningen(List<Old> boekhoudrekeningen) {
        Import.boekhoudrekeningen = boekhoudrekeningen;
    }

    public static List<Old> getBankinstellingen() {
        return bankinstellingen;
    }

    public static void setBankinstellingen(List<Old> bankinstellingen) {
        Import.bankinstellingen = bankinstellingen;
    }

    public static List<Old> getProductgroepen() {
        return productgroepen;
    }

    public static void setProductgroepen(List<Old> productgroepen) {
        Import.productgroepen = productgroepen;
    }

    public static List<Old> getProductsubgroepen() {
        return productsubgroepen;
    }

    public static void setProductsubgroepen(List<Old> productsubgroepen) {
        Import.productsubgroepen = productsubgroepen;
    }

    public static List<Old> getProductiegroepen() {
        return productiegroepen;
    }

    public static void setProductiegroepen(List<Old> productiegroepen) {
        Import.productiegroepen = productiegroepen;
    }

    public static List<Old> getBestelgroepen() {
        return bestelgroepen;
    }

    public static void setBestelgroepen(List<Old> bestelgroepen) {
        Import.bestelgroepen = bestelgroepen;
    }

    public static List<Old> getReceptgroepen() {
        return receptgroepen;
    }

    public static void setReceptgroepen(List<Old> receptgroepen) {
        Import.receptgroepen = receptgroepen;
    }

    public static List<Old> getRecepteenheden() {
        return recepteenheden;
    }

    public static void setRecepteenheden(List<Old> recepteenheden) {
        Import.recepteenheden = recepteenheden;
    }

    public static List<Old> getVerpakkingseenheden() {
        return verpakkingseenheden;
    }

    public static void setVerpakkingseenheden(List<Old> verpakkingseenheden) {
        Import.verpakkingseenheden = verpakkingseenheden;
    }

    public static List<Old> getVoorraadplaatsen() {
        return voorraadplaatsen;
    }

    public static void setVoorraadplaatsen(List<Old> voorraadplaatsen) {
        Import.voorraadplaatsen = voorraadplaatsen;
    }

    public static List<Old> getBtwcodes() {
        return btwcodes;
    }

    public static void setBtwcodes(List<Old> btwcodes) {
        Import.btwcodes = btwcodes;
    }

    public static List<Old> getIngredientgroepen() {
        return ingredientgroepen;
    }

    public static void setIngredientgroepen(List<Old> ingredientgroepen) {
        Import.ingredientgroepen = ingredientgroepen;
    }

    public static List<Old> getProductcategorieen() {
        return productcategorieen;
    }

    public static void setProductcategorieen(List<Old> productcategorieen) {
        Import.productcategorieen = productcategorieen;
    }

    public static List<Old> getAankoopeenheden() {
        return aankoopeenheden;
    }

    public static void setAankoopeenheden(List<Old> aankoopeenheden) {
        Import.aankoopeenheden = aankoopeenheden;
    }

    public static List<Old> getEtiketteneenheden() {
        return etiketteneenheden;
    }

    public static void setEtiketteneenheden(List<Old> etiketteneenheden) {
        Import.etiketteneenheden = etiketteneenheden;
    }

    public static List<Old> getVoorraadeenheden() {
        return voorraadeenheden;
    }

    public static void setVoorraadeenheden(List<Old> voorraadeenheden) {
        Import.voorraadeenheden = voorraadeenheden;
    }

    public static List<Old> getAllergeengroepen() {
        return allergeengroepen;
    }

    public static void setAllergeengroepen(List<Old> allergeengroepen) {
        Import.allergeengroepen = allergeengroepen;
    }

    public static List<Old> getAllergenen() {
        return allergenen;
    }

    public static void setAllergenen(List<Old> allergenen) {
        Import.allergenen = allergenen;
    }

    public static List<Old> getVerkoopproductgroepen() {
        return verkoopproductgroepen;
    }

    public static void setVerkoopproductgroepen(List<Old> verkoopproductgroepen) {
        Import.verkoopproductgroepen = verkoopproductgroepen;
    }

    public static List<Old> getKneders() {
        return kneders;
    }

    public static void setKneders(List<Old> kneders) {
        Import.kneders = kneders;
    }

    public static List<Old> getBasiseenheden() {
        return basiseenheden;
    }

    public static void setBasiseenheden(List<Old> basiseenheden) {
        Import.basiseenheden = basiseenheden;
    }

    public static List<Old> getPrijseenheden() {
        return prijseenheden;
    }

    public static void setPrijseenheden(List<Old> prijseenheden) {
        Import.prijseenheden = prijseenheden;
    }

    public static List<Old> getTaalcodes() {
        return taalcodes;
    }

    public static void setTaalcodes(List<Old> taalcodes) {
        Import.taalcodes = taalcodes;
    }

    public static List<Old> getBtwcodesleveranciers() {
        return btwcodesleveranciers;
    }

    public static void setBtwcodesleveranciers(List<Old> btwcodesleveranciers) {
        Import.btwcodesleveranciers = btwcodesleveranciers;
    }

    public static List<Old> getContactnames() {
        return contactnames;
    }

    public static void setContactnames(List<Old> contactnames) {
        Import.contactnames = contactnames;
    }

    public static List<Old> getWerknemers() {
        return werknemers;
    }

    public static void setWerknemers(List<Old> werknemers) {
        Import.werknemers = werknemers;
    }

    public static List<Old> getEtiketten() {
        return etiketten;
    }

    public static void setEtiketten(List<Old> etiketten) {
        Import.etiketten = etiketten;
    }

    public static List<Old> getEtikettenprinters() {
        return etikettenprinters;
    }

    public static void setEtikettenprinters(List<Old> etikettenprinters) {
        Import.etikettenprinters = etikettenprinters;
    }

    public static List<Old> getReceptingaves() {
        return receptingaves;
    }

    public static void setReceptingaves(List<Old> receptingaves) {
        Import.receptingaves = receptingaves;
    }

    public static List<Old> getBewaartemperaturen() {
        return bewaartemperaturen;
    }

    public static void setBewaartemperaturen(List<Old> bewaartemperaturen) {
        Import.bewaartemperaturen = bewaartemperaturen;
    }

    public static List<Old> getMicrobiologischeparameters() {
        return microbiologischeparameters;
    }

    public static void setMicrobiologischeparameters(List<Old> microbiologischeparameters) {
        Import.microbiologischeparameters = microbiologischeparameters;
    }

    public static List<Old> getBronvoedingswaarden() {
        return bronvoedingswaarden;
    }

    public static void setBronvoedingswaarden(List<Old> bronvoedingswaarden) {
        Import.bronvoedingswaarden = bronvoedingswaarden;
    }

    public static List<Old> getLeveringstemperaturen() {
        return leveringstemperaturen;
    }

    public static void setLeveringstemperaturen(List<Old> leveringstemperaturen) {
        Import.leveringstemperaturen = leveringstemperaturen;
    }

    public static List<Old> getVariantenhoofding() {
        return variantenhoofding;
    }

    public static void setVariantenhoofding(List<Old> variantenhoofding) {
        Import.variantenhoofding = variantenhoofding;
    }

    public static List<Old> getVariantendetail() {
        return variantendetail;
    }

    public static void setVariantendetail(List<Old> variantendetail) {
        Import.variantendetail = variantendetail;
    }

    public static List<Old> getOptieshoofding() {
        return optieshoofding;
    }

    public static void setOptieshoofding(List<Old> optieshoofding) {
        Import.optieshoofding = optieshoofding;
    }

    public static List<Old> getOptiesdetail() {
        return optiesdetail;
    }

    public static void setOptiesdetail(List<Old> optiesdetail) {
        Import.optiesdetail = optiesdetail;
    }

    public static List<Old> getEtiketteksten() {
        return etiketteksten;
    }

    public static void setEtiketteksten(List<Old> etiketteksten) {
        Import.etiketteksten = etiketteksten;
    }

    public static List<Old> getFabrikanten() {
        return fabrikanten;
    }

    public static void setFabrikanten(List<Old> fabrikanten) {
        Import.fabrikanten = fabrikanten;
    }

    public static List<Old> getLandenoorsprong() {
        return landenoorsprong;
    }

    public static void setLandenoorsprong(List<Old> landenoorsprong) {
        Import.landenoorsprong = landenoorsprong;
    }

    public static List<Old> getOrigines() {
        return origines;
    }

    public static void setOrigines(List<Old> origines) {
        Import.origines = origines;
    }

    public static List<Old> getFuncties() {
        return functies;
    }

    public static void setFuncties(List<Old> functies) {
        Import.functies = functies;
    }

    public static List<Old> getIngredienten() {
        return ingredienten;
    }

    public static void setIngredienten(List<Old> ingredienten) {
        Import.ingredienten = ingredienten;
    }

    public static List<Old> getIngredientenallergenen() {
        return ingredientenallergenen;
    }

    public static void setIngredientenallergenen(List<Old> ingredientenallergenen) {
        Import.ingredientenallergenen = ingredientenallergenen;
    }

    public static List<Old> getNutrioneleinformatiehoofding() {
        return nutrioneleinformatiehoofding;
    }

    public static void setNutrioneleinformatiehoofding(List<Old> nutrioneleinformatiehoofding) {
        Import.nutrioneleinformatiehoofding = nutrioneleinformatiehoofding;
    }

    public static List<Old> getNutrioneleinformatiedetail() {
        return nutrioneleinformatiedetail;
    }

    public static void setNutrioneleinformatiedetail(List<Old> nutrioneleinformatiedetail) {
        Import.nutrioneleinformatiedetail = nutrioneleinformatiedetail;
    }

    public static List<Old> getNutrioneleeenheden() {
        return nutrioneleeenheden;
    }

    public static void setNutrioneleeenheden(List<Old> nutrioneleeenheden) {
        Import.nutrioneleeenheden = nutrioneleeenheden;
    }

    public static List<Old> getLotnummertypes() {
        return lotnummertypes;
    }

    public static void setLotnummertypes(List<Old> lotnummertypes) {
        Import.lotnummertypes = lotnummertypes;
    }

    public static List<Old> getLotnummerdragers() {
        return lotnummerdragers;
    }

    public static void setLotnummerdragers(List<Old> lotnummerdragers) {
        Import.lotnummerdragers = lotnummerdragers;
    }

    public static List<Old> getLotnummeraanbrengers() {
        return lotnummeraanbrengers;
    }

    public static void setLotnummeraanbrengers(List<Old> lotnummeraanbrengers) {
        Import.lotnummeraanbrengers = lotnummeraanbrengers;
    }

    public static List<Old> getDistributiewijzes() {
        return distributiewijzes;
    }

    public static void setDistributiewijzes(List<Old> distributiewijzes) {
        Import.distributiewijzes = distributiewijzes;
    }

    public static List<Old> getBewaarcondities() {
        return bewaarcondities;
    }

    public static void setBewaarcondities(List<Old> bewaarcondities) {
        Import.bewaarcondities = bewaarcondities;
    }

    public static List<Old> getWebshopsapi() {
        return webshopsapi;
    }

    public static void setWebshopsapi(List<Old> webshopsapi) {
        Import.webshopsapi = webshopsapi;
    }

    public static List<Old> getVoorraadcorrecties() {
        return voorraadcorrecties;
    }

    public static void setVoorraadcorrecties(List<Old> voorraadcorrecties) {
        Import.voorraadcorrecties = voorraadcorrecties;
    }

    public static List<Old> getVentilatiecodes() {
        return ventilatiecodes;
    }

    public static void setVentilatiecodes(List<Old> ventilatiecodes) {
        Import.ventilatiecodes = ventilatiecodes;
    }

    public static List<Old> getBarcodesprefixen() {
        return barcodesprefixen;
    }

    public static void setBarcodesprefixen(List<Old> barcodesprefixen) {
        Import.barcodesprefixen = barcodesprefixen;
    }

    public static List<Old> getPercentagevastekosten() {
        return percentagevastekosten;
    }

    public static void setPercentagevastekosten(List<Old> percentagevastekosten) {
        Import.percentagevastekosten = percentagevastekosten;
    }

    public static List<Old> getPercentageonrechtstreekseproductiekosten() {
        return percentageonrechtstreekseproductiekosten;
    }

    public static void setPercentageonrechtstreekseproductiekosten(List<Old> percentageonrechtstreekseproductiekosten) {
        Import.percentageonrechtstreekseproductiekosten = percentageonrechtstreekseproductiekosten;
    }

    public static List<Old> getPercentagewinstmarges() {
        return percentagewinstmarges;
    }

    public static void setPercentagewinstmarges(List<Old> percentagewinstmarges) {
        Import.percentagewinstmarges = percentagewinstmarges;
    }

    public static List<Old> getPercentagekosten() {
        return percentagekosten;
    }

    public static void setPercentagekosten(List<Old> percentagekosten) {
        Import.percentagekosten = percentagekosten;
    }

    public static List<Old> getPersoneelskosten() {
        return personeelskosten;
    }

    public static void setPersoneelskosten(List<Old> personeelskosten) {
        Import.personeelskosten = personeelskosten;
    }

    public static List<Old> getEtikettendefaults() {
        return etikettendefaults;
    }

    public static void setEtikettendefaults(List<Old> etikettendefaults) {
        Import.etikettendefaults = etikettendefaults;
    }

    public static List<Old> getWeegschaalmodellen() {
        return weegschaalmodellen;
    }

    public static void setWeegschaalmodellen(List<Old> weegschaalmodellen) {
        Import.weegschaalmodellen = weegschaalmodellen;
    }

    public static List<Old> getWeegschalen() {
        return weegschalen;
    }

    public static void setWeegschalen(List<Old> weegschalen) {
        Import.weegschalen = weegschalen;
    }

    public static List<Old> getPeriodeInstellingen() {
        return periodeInstellingen;
    }

    public static void setPeriodeInstellingen(List<Old> periodeInstellingen) {
        Import.periodeInstellingen = periodeInstellingen;
    }

    public static List<Old> getBedrijven() {
        return bedrijven;
    }

    public static void setBedrijven(List<Old> bedrijven) {
        Import.bedrijven = bedrijven;
    }

    public static List<Old> getBedrijvenallergenen() {
        return bedrijvenallergenen;
    }

    public static void setBedrijvenallergenen(List<Old> bedrijvenallergenen) {
        Import.bedrijvenallergenen = bedrijvenallergenen;
    }

    public static List<Old> getGebruikers() {
        return gebruikers;
    }

    public static void setGebruikers(List<Old> gebruikers) {
        Import.gebruikers = gebruikers;
    }

    public static List<Old> getLanden() {
        return landen;
    }

    public static void setLanden(List<Old> landen) {
        Import.landen = landen;
    }

    public static List<Old> getWoonplaatsen() {
        return woonplaatsen;
    }

    public static void setWoonplaatsen(List<Old> woonplaatsen) {
        Import.woonplaatsen = woonplaatsen;
    }

    public static List<Old> getLeveranciers() {
        return leveranciers;
    }

    public static void setLeveranciers(List<Old> leveranciers) {
        Import.leveranciers = leveranciers;
    }

    public static List<Old> getAankoopproducten() {
        return aankoopproducten;
    }

    public static void setAankoopproducten(List<Old> aankoopproducten) {
        Import.aankoopproducten = aankoopproducten;
    }

    public static List<Old> getAankoopproductenallergenen() {
        return aankoopproductenallergenen;
    }

    public static void setAankoopproductenallergenen(List<Old> aankoopproductenallergenen) {
        Import.aankoopproductenallergenen = aankoopproductenallergenen;
    }

    public static List<Old> getAankoopproductenleveranciers() {
        return aankoopproductenleveranciers;
    }

    public static void setAankoopproductenleveranciers(List<Old> aankoopproductenleveranciers) {
        Import.aankoopproductenleveranciers = aankoopproductenleveranciers;
    }

    public static List<Old> getAankoopproductennutrioneleinformatie() {
        return aankoopproductennutrioneleinformatie;
    }

    public static void setAankoopproductennutrioneleinformatie(List<Old> aankoopproductennutrioneleinformatie) {
        Import.aankoopproductennutrioneleinformatie = aankoopproductennutrioneleinformatie;
    }

    public static List<Old> getAankoopproducteningredienten() {
        return aankoopproducteningredienten;
    }

    public static void setAankoopproducteningredienten(List<Old> aankoopproducteningredienten) {
        Import.aankoopproducteningredienten = aankoopproducteningredienten;
    }

    public static List<Old> getAankoopproducteneenheidsprijzen() {
        return aankoopproducteneenheidsprijzen;
    }

    public static void setAankoopproducteneenheidsprijzen(List<Old> aankoopproducteneenheidsprijzen) {
        Import.aankoopproducteneenheidsprijzen = aankoopproducteneenheidsprijzen;
    }

    public static List<Old> getAankoopproductentechnischeversies() {
        return aankoopproductentechnischeversies;
    }

    public static void setAankoopproductentechnischeversies(List<Old> aankoopproductentechnischeversies) {
        Import.aankoopproductentechnischeversies = aankoopproductentechnischeversies;
    }

    public static List<Old> getReceptproducten() {
        return receptproducten;
    }

    public static void setReceptproducten(List<Old> receptproducten) {
        Import.receptproducten = receptproducten;
    }

    public static List<Old> getHalffabrikaten() {
        return halffabrikaten;
    }

    public static void setHalffabrikaten(List<Old> halffabrikaten) {
        Import.halffabrikaten = halffabrikaten;
    }

    public static List<Old> getVoorbereideproducten() {
        return voorbereideproducten;
    }

    public static void setVoorbereideproducten(List<Old> voorbereideproducten) {
        Import.voorbereideproducten = voorbereideproducten;
    }

    public static List<Old> getAfgewerkteproducten() {
        return afgewerkteproducten;
    }

    public static void setAfgewerkteproducten(List<Old> afgewerkteproducten) {
        Import.afgewerkteproducten = afgewerkteproducten;
    }

    public static List<Old> getAfgewerkteproducteningredienten() {
        return afgewerkteproducteningredienten;
    }

    public static void setAfgewerkteproducteningredienten(List<Old> afgewerkteproducteningredienten) {
        Import.afgewerkteproducteningredienten = afgewerkteproducteningredienten;
    }

    public static List<Old> getVerkoopproducten() {
        return verkoopproducten;
    }

    public static void setVerkoopproducten(List<Old> verkoopproducten) {
        Import.verkoopproducten = verkoopproducten;
    }

    public static List<Old> getVerkoopproductenallergenen() {
        return verkoopproductenallergenen;
    }

    public static void setVerkoopproductenallergenen(List<Old> verkoopproductenallergenen) {
        Import.verkoopproductenallergenen = verkoopproductenallergenen;
    }

    public static List<Old> getVerkoopproducteningredienten() {
        return verkoopproducteningredienten;
    }

    public static void setVerkoopproducteningredienten(List<Old> verkoopproducteningredienten) {
        Import.verkoopproducteningredienten = verkoopproducteningredienten;
    }

    public static List<Old> getRechtstreekseproductiekosten() {
        return rechtstreekseproductiekosten;
    }

    public static void setRechtstreekseproductiekosten(List<Old> rechtstreekseproductiekosten) {
        Import.rechtstreekseproductiekosten = rechtstreekseproductiekosten;
    }

    public static List<Old> getKlanten() {
        return klanten;
    }

    public static void setKlanten(List<Old> klanten) {
        Import.klanten = klanten;
    }

    public static List<Old> getKlantenlabel() {
        return klantenlabel;
    }

    public static void setKlantenlabel(List<Old> klantenlabel) {
        Import.klantenlabel = klantenlabel;
    }

    public static List<Old> getAankoopproductenteksteningredienten() {
        return aankoopproductenteksteningredienten;
    }

    public static void setAankoopproductenteksteningredienten(List<Old> aankoopproductenteksteningredienten) {
        Import.aankoopproductenteksteningredienten = aankoopproductenteksteningredienten;
    }

    public static List<Old> getParametersproductielijsten() {
        return parametersproductielijsten;
    }

    public static void setParametersproductielijsten(List<Old> parametersproductielijsten) {
        Import.parametersproductielijsten = parametersproductielijsten;
    }

    public static List<Old> getPrintersproductielijstenwerkstations() {
        return printersproductielijstenwerkstations;
    }

    public static void setPrintersproductielijstenwerkstations(List<Old> printersproductielijstenwerkstations) {
        Import.printersproductielijstenwerkstations = printersproductielijstenwerkstations;
    }

    public static List<Old> getPointofsales() {
        return pointofsales;
    }

    public static void setPointofsales(List<Old> pointofsales) {
        Import.pointofsales = pointofsales;
    }

    public static List<Old> getKlantartikelkoppeling() {
        return klantartikelkoppeling;
    }

    public static void setKlantartikelkoppeling(List<Old> klantartikelkoppeling) {
        Import.klantartikelkoppeling = klantartikelkoppeling;
    }

    public static List<Old> getVerkoopsverpakkingen() {
        return verkoopsverpakkingen;
    }

    public static void setVerkoopsverpakkingen(List<Old> verkoopsverpakkingen) {
        Import.verkoopsverpakkingen = verkoopsverpakkingen;
    }

    public static List<Old> getVerdeelgroepen() {
        return verdeelgroepen;
    }

    public static void setVerdeelgroepen(List<Old> verdeelgroepen) {
        Import.verdeelgroepen = verdeelgroepen;
    }

    public static List<Old> getKlantenbestellingstandaarden() {
        return klantenbestellingstandaarden;
    }

    public static void setKlantenbestellingstandaarden(List<Old> klantenbestellingstandaarden) {
        Import.klantenbestellingstandaarden = klantenbestellingstandaarden;
    }

    public static List<Old> getBedrijvenlinken() {
        return bedrijvenlinken;
    }

    public static void setBedrijvenlinken(List<Old> bedrijvenlinken) {
        Import.bedrijvenlinken = bedrijvenlinken;
    }

    public static List<Old> getKlantverdeelgroep() {
        return klantverdeelgroep;
    }

    public static void setKlantverdeelgroep(List<Old> klantverdeelgroep) {
        Import.klantverdeelgroep = klantverdeelgroep;
    }

    public static List<Old> getLeveringsadressen() {
        return leveringsadressen;
    }

    public static void setLeveringsadressen(List<Old> leveringsadressen) {
        Import.leveringsadressen = leveringsadressen;
    }

    public static List<Old> getRecepten() {
        return recepten;
    }

    public static void setRecepten(List<Old> recepten) {
        Import.recepten = recepten;
    }

    public static List<Old> getBestelvoorstellen() {
        return bestelvoorstellen;
    }

    public static void setBestelvoorstellen(List<Old> bestelvoorstellen) {
        Import.bestelvoorstellen = bestelvoorstellen;
    }

    public static List<Old> getBestelbonnenhoofding() {
        return bestelbonnenhoofding;
    }

    public static void setBestelbonnenhoofding(List<Old> bestelbonnenhoofding) {
        Import.bestelbonnenhoofding = bestelbonnenhoofding;
    }

    public static List<Old> getBestelbonnendetail() {
        return bestelbonnendetail;
    }

    public static void setBestelbonnendetail(List<Old> bestelbonnendetail) {
        Import.bestelbonnendetail = bestelbonnendetail;
    }

    public static List<Old> getLeveringsbonnenhoofding() {
        return leveringsbonnenhoofding;
    }

    public static void setLeveringsbonnenhoofding(List<Old> leveringsbonnenhoofding) {
        Import.leveringsbonnenhoofding = leveringsbonnenhoofding;
    }

    public static List<Old> getLeveringsbonnenhoofdingb() {
        return leveringsbonnenhoofdingb;
    }

    public static void setLeveringsbonnenhoofdingb(List<Old> leveringsbonnenhoofdingb) {
        Import.leveringsbonnenhoofdingb = leveringsbonnenhoofdingb;
    }

    public static List<Old> getLeveringsbonnendetail() {
        return leveringsbonnendetail;
    }

    public static void setLeveringsbonnendetail(List<Old> leveringsbonnendetail) {
        Import.leveringsbonnendetail = leveringsbonnendetail;
    }

    public static List<Old> getLeveringsbonnendetailb() {
        return leveringsbonnendetailb;
    }

    public static void setLeveringsbonnendetailb(List<Old> leveringsbonnendetailb) {
        Import.leveringsbonnendetailb = leveringsbonnendetailb;
    }

    public static List<Old> getInventarisaankoopproducten() {
        return inventarisaankoopproducten;
    }

    public static void setInventarisaankoopproducten(List<Old> inventarisaankoopproducten) {
        Import.inventarisaankoopproducten = inventarisaankoopproducten;
    }

    public static List<Old> getInventariseigenfabrikaten() {
        return inventariseigenfabrikaten;
    }

    public static void setInventariseigenfabrikaten(List<Old> inventariseigenfabrikaten) {
        Import.inventariseigenfabrikaten = inventariseigenfabrikaten;
    }

    public static List<Old> getVoorraadcorrectiesaankoopproducten() {
        return voorraadcorrectiesaankoopproducten;
    }

    public static void setVoorraadcorrectiesaankoopproducten(List<Old> voorraadcorrectiesaankoopproducten) {
        Import.voorraadcorrectiesaankoopproducten = voorraadcorrectiesaankoopproducten;
    }

    public static List<Old> getVoorraadcorrectieseigenfabrikaten() {
        return voorraadcorrectieseigenfabrikaten;
    }

    public static void setVoorraadcorrectieseigenfabrikaten(List<Old> voorraadcorrectieseigenfabrikaten) {
        Import.voorraadcorrectieseigenfabrikaten = voorraadcorrectieseigenfabrikaten;
    }

    public static List<Old> getAankoopproductingebruik() {
        return aankoopproductingebruik;
    }

    public static void setAankoopproductingebruik(List<Old> aankoopproductingebruik) {
        Import.aankoopproductingebruik = aankoopproductingebruik;
    }

    public static List<Old> getEigenfabrikaatingebruik() {
        return eigenfabrikaatingebruik;
    }

    public static void setEigenfabrikaatingebruik(List<Old> eigenfabrikaatingebruik) {
        Import.eigenfabrikaatingebruik = eigenfabrikaatingebruik;
    }

    public static List<Old> getProductieperiode() {
        return productieperiode;
    }

    public static void setProductieperiode(List<Old> productieperiode) {
        Import.productieperiode = productieperiode;
    }

    public static List<Old> getProductieopdrachten() {
        return productieopdrachten;
    }

    public static void setProductieopdrachten(List<Old> productieopdrachten) {
        Import.productieopdrachten = productieopdrachten;
    }

    public static List<Old> getProductieopdrachtenwerknemers() {
        return productieopdrachtenwerknemers;
    }

    public static void setProductieopdrachtenwerknemers(List<Old> productieopdrachtenwerknemers) {
        Import.productieopdrachtenwerknemers = productieopdrachtenwerknemers;
    }

    public static List<Old> getProductieopdrachtenverbruik() {
        return productieopdrachtenverbruik;
    }

    public static void setProductieopdrachtenverbruik(List<Old> productieopdrachtenverbruik) {
        Import.productieopdrachtenverbruik = productieopdrachtenverbruik;
    }

    public static List<Old> getProductieopdrachtenlotnummers() {
        return productieopdrachtenlotnummers;
    }

    public static void setProductieopdrachtenlotnummers(List<Old> productieopdrachtenlotnummers) {
        Import.productieopdrachtenlotnummers = productieopdrachtenlotnummers;
    }

    public static List<Old> getProductieverkoopproductenhoofding() {
        return productieverkoopproductenhoofding;
    }

    public static void setProductieverkoopproductenhoofding(List<Old> productieverkoopproductenhoofding) {
        Import.productieverkoopproductenhoofding = productieverkoopproductenhoofding;
    }

    public static List<Old> getProductieeigenfabrikatenhoofding() {
        return productieeigenfabrikatenhoofding;
    }

    public static void setProductieeigenfabrikatenhoofding(List<Old> productieeigenfabrikatenhoofding) {
        Import.productieeigenfabrikatenhoofding = productieeigenfabrikatenhoofding;
    }

    public static List<Old> getRegelmaat() {
        return regelmaat;
    }

    public static void setRegelmaat(List<Old> regelmaat) {
        Import.regelmaat = regelmaat;
    }

    public static List<Old> getPlanningbasis() {
        return planningbasis;
    }

    public static void setPlanningbasis(List<Old> planningbasis) {
        Import.planningbasis = planningbasis;
    }

    public static List<Old> getOrderpickinghoofding() {
        return orderpickinghoofding;
    }

    public static void setOrderpickinghoofding(List<Old> orderpickinghoofding) {
        Import.orderpickinghoofding = orderpickinghoofding;
    }

    public static List<Old> getOrderpickingdetail() {
        return orderpickingdetail;
    }

    public static void setOrderpickingdetail(List<Old> orderpickingdetail) {
        Import.orderpickingdetail = orderpickingdetail;
    }

    public static List<Old> getVerzendbonhoofding() {
        return verzendbonhoofding;
    }

    public static void setVerzendbonhoofding(List<Old> verzendbonhoofding) {
        Import.verzendbonhoofding = verzendbonhoofding;
    }

    public static List<Old> getVerzendbondetail() {
        return verzendbondetail;
    }

    public static void setVerzendbondetail(List<Old> verzendbondetail) {
        Import.verzendbondetail = verzendbondetail;
    }

    public static List<Old> getKassabestellinghoofding() {
        return kassabestellinghoofding;
    }

    public static void setKassabestellinghoofding(List<Old> kassabestellinghoofding) {
        Import.kassabestellinghoofding = kassabestellinghoofding;
    }

    public static List<Old> getKassabestellingdetail() {
        return kassabestellingdetail;
    }

    public static void setKassabestellingdetail(List<Old> kassabestellingdetail) {
        Import.kassabestellingdetail = kassabestellingdetail;
    }

    public static List<Old> getVerkopenhoofding() {
        return verkopenhoofding;
    }

    public static void setVerkopenhoofding(List<Old> verkopenhoofding) {
        Import.verkopenhoofding = verkopenhoofding;
    }

    public static List<Old> getVerkopendetail() {
        return verkopendetail;
    }

    public static void setVerkopendetail(List<Old> verkopendetail) {
        Import.verkopendetail = verkopendetail;
    }

    public static List<Old> getVastebestellinghoofding() {
        return vastebestellinghoofding;
    }

    public static void setVastebestellinghoofding(List<Old> vastebestellinghoofding) {
        Import.vastebestellinghoofding = vastebestellinghoofding;
    }

    public static List<Old> getVastebestellingdetail() {
        return vastebestellingdetail;
    }

    public static void setVastebestellingdetail(List<Old> vastebestellingdetail) {
        Import.vastebestellingdetail = vastebestellingdetail;
    }

    public static List<Old> getBoekjaren() {
        return boekjaren;
    }

    public static void setBoekjaren(List<Old> boekjaren) {
        Import.boekjaren = boekjaren;
    }

    public static List<Old> getAankoopfacturenhoofding() {
        return aankoopfacturenhoofding;
    }

    public static void setAankoopfacturenhoofding(List<Old> aankoopfacturenhoofding) {
        Import.aankoopfacturenhoofding = aankoopfacturenhoofding;
    }

    public static List<Old> getAankoopfacturendetail() {
        return aankoopfacturendetail;
    }

    public static void setAankoopfacturendetail(List<Old> aankoopfacturendetail) {
        Import.aankoopfacturendetail = aankoopfacturendetail;
    }

    public static List<Old> getMaterieel() {
        return materieel;
    }

    public static void setMaterieel(List<Old> materieel) {
        Import.materieel = materieel;
    }

    public static List<Old> getMaterieelgroep() {
        return materieelgroep;
    }

    public static void setMaterieelgroep(List<Old> materieelgroep) {
        Import.materieelgroep = materieelgroep;
    }

    public static List<Old> getWerkplek() {
        return werkplek;
    }

    public static void setWerkplek(List<Old> werkplek) {
        Import.werkplek = werkplek;
    }

    public static List<Old> getLijstleveringtotaalleverancieraankoopproduct() {
        return lijstleveringtotaalleverancieraankoopproduct;
    }

    public static void setLijstleveringtotaalleverancieraankoopproduct(List<Old> lijstleveringtotaalleverancieraankoopproduct) {
        Import.lijstleveringtotaalleverancieraankoopproduct = lijstleveringtotaalleverancieraankoopproduct;
    }

    public static List<Old> getLijstleveringoverzichtleverancieraankoopproduct() {
        return lijstleveringoverzichtleverancieraankoopproduct;
    }

    public static void setLijstleveringoverzichtleverancieraankoopproduct(List<Old> lijstleveringoverzichtleverancieraankoopproduct) {
        Import.lijstleveringoverzichtleverancieraankoopproduct = lijstleveringoverzichtleverancieraankoopproduct;
    }

    public static List<Old> getOnlineaankoopproducten() {
        return onlineaankoopproducten;
    }

    public static void setOnlineaankoopproducten(List<Old> onlineaankoopproducten) {
        Import.onlineaankoopproducten = onlineaankoopproducten;
    }

    public static List<Old> getOnlineverpakkingseenheid() {
        return onlineverpakkingseenheid;
    }

    public static void setOnlineverpakkingseenheid(List<Old> onlineverpakkingseenheid) {
        Import.onlineverpakkingseenheid = onlineverpakkingseenheid;
    }

    public static List<Old> getOnlinefabrikanten() {
        return onlinefabrikanten;
    }

    public static void setOnlinefabrikanten(List<Old> onlinefabrikanten) {
        Import.onlinefabrikanten = onlinefabrikanten;
    }

    public static List<Old> getOnlinefuncties() {
        return onlinefuncties;
    }

    public static void setOnlinefuncties(List<Old> onlinefuncties) {
        Import.onlinefuncties = onlinefuncties;
    }

    public static List<Old> getOnlineaankoopproducteningredienten() {
        return onlineaankoopproducteningredienten;
    }

    public static void setOnlineaankoopproducteningredienten(List<Old> onlineaankoopproducteningredienten) {
        Import.onlineaankoopproducteningredienten = onlineaankoopproducteningredienten;
    }

    public static List<Old> getOnlineaankoopproductenallergenen() {
        return onlineaankoopproductenallergenen;
    }

    public static void setOnlineaankoopproductenallergenen(List<Old> onlineaankoopproductenallergenen) {
        Import.onlineaankoopproductenallergenen = onlineaankoopproductenallergenen;
    }

    public static List<Old> getOnlineaankoopproductennutrioneleinformatie() {
        return onlineaankoopproductennutrioneleinformatie;
    }

    public static void setOnlineaankoopproductennutrioneleinformatie(List<Old> onlineaankoopproductennutrioneleinformatie) {
        Import.onlineaankoopproductennutrioneleinformatie = onlineaankoopproductennutrioneleinformatie;
    }

    public static List<Old> getOnlineingredienten() {
        return onlineingredienten;
    }

    public static void setOnlineingredienten(List<Old> onlineingredienten) {
        Import.onlineingredienten = onlineingredienten;
    }

    public static List<Old> getOnlineingredientenallergenen() {
        return onlineingredientenallergenen;
    }

    public static void setOnlineingredientenallergenen(List<Old> onlineingredientenallergenen) {
        Import.onlineingredientenallergenen = onlineingredientenallergenen;
    }

    public static List<Old> getOnlineorigines() {
        return onlineorigines;
    }

    public static void setOnlineorigines(List<Old> onlineorigines) {
        Import.onlineorigines = onlineorigines;
    }

    public static List<Old> getLogverwerktefiles() {
        return logverwerktefiles;
    }

    public static void setLogverwerktefiles(List<Old> logverwerktefiles) {
        Import.logverwerktefiles = logverwerktefiles;
    }

    public static List<Old> getLog() {
        return log;
    }

    public static void setLog(List<Old> log) {
        Import.log = log;
    }

}
