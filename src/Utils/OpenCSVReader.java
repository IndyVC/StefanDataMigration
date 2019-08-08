package Utils;

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
import Old.Ingredient.Ingredientgroep;
import Old.Leveranciersgroep;
import Old.Levering.Leveringsfrequentie;
import Old.Lijst;
import Old.Muntcode;
import Old.Old;
import Old.Printer;
import Old.Product.Productcategorie;
import Old.Product.Productgroep;
import Old.Product.Productiegroep;
import Old.Product.Productsubgroep;
import Old.Recept.Recepteenheid;
import Old.Recept.Receptgroep;
import Old.Tekst;
import Old.Etiket.Etiketeenheid;
import Old.EtiketDefault;
import Old.Fabrikant;
import Old.Functie;
import Old.Gebruiker;
import Old.Halffabrikaat;
import Old.Ingredient.IngredientAllergeen;
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
import Old.Levering.Leveringsadres;
import Old.Levering.LeveringsbonDetail;
import Old.Levering.LeveringsbonHoofding;
import Old.Levering.Leveringstemperatuur;
import Old.Lotnummer.LotnummerAanbrenger;
import Old.Lotnummer.LotnummerDrager;
import Old.Lotnummer.LotnummerType;
import Old.Parameters.MicrobiologischeParameter;
import Old.Nutrionele.NutrioneleEenheid;
import Old.Nutrionele.NutrioneleInformatieDetail;
import Old.Nutrionele.NutrioneleInformatieHoofding;
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
import Old.Productie.PrinterProductielijstWerkstation;
import Old.Productie.Productieopdracht;
import Old.Productie.Productieperiode;
import Old.Productie.ProductieopdrachtLotnummer;
import Old.Productie.ProductieopdrachtVerbruik;
import Old.Productie.ProductieopdrachtWerknemer;
import Old.Recept.Recept;
import Old.Recept.Receptingave;
import Old.Recept.Receptproduct;
import Old.Productie.RechtstreekseProductiekost;
import Old.ProductieEigenFabrikaatHoofding;
import Old.ProductieVerkoopproductHoofding;
import Old.Regelmaat;
import Old.Taalcode;
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
import Old.WebshopAPI;
import Old.Weegschaal.Weegschaal;
import Old.Weegschaal.Weegschaalmodel;
import Old.Werknemer;
import Old.Werkplek;
import Old.Werkstation;
import Old.Woonplaats;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import java.io.File;
import static java.io.File.separator;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class OpenCSVReader {

    public OpenCSVReader() {

    }

    public static <T> List<Old> parseCsvFileToBeans(final String filename, final char fieldDelimiter, Class<T> type) throws IOException {

        String[] headers = null;
        List<String[]> data = new ArrayList<>();
        List<Old> beans = new ArrayList<>();

        try (
                Reader reader = Files.newBufferedReader(Paths.get(filename));
                CSVReader csv
                = new CSVReaderBuilder(reader)
                        .withCSVParser(new CSVParserBuilder().withSeparator(fieldDelimiter).withIgnoreQuotations(true).withEscapeChar('£').build())
                        .build();) {
            // Reading Records One by One in a String array
            headers = csv.readNext();
            String[] row;
            while ((row = csv.readNext()) != null) {
                data.add(row);
                Old old = returnOld(type, row);
                beans.add(old);
            }
        }
        return beans;
    }

    public static <T> Old returnOld(Class<T> type, String[] row) {
        Old old = null;
        if (type == Werkstation.class) {
            return old = new Werkstation(row);
        } else if (type == Lijst.class) {
            return old = new Lijst(row);
        } else if (type == Tekst.class) {
            return old = new Tekst(row);
        } else if (type == Aanspreektitel.class) {
            return old = new Aanspreektitel(row);
        } else if (type == Printer.class) {
            return old = new Printer(row);
        } else if (type == Leveranciersgroep.class) {
            return old = new Leveranciersgroep(row);
        } else if (type == Leveringsfrequentie.class) {
            return old = new Leveringsfrequentie(row);
        } else if (type == Muntcode.class) {
            return old = new Muntcode(row);
        } else if (type == Betalingsvoorwaarde.class) {
            return old = new Betalingsvoorwaarde(row);
        } else if (type == Dagboek.class) {
            return old = new Dagboek(row);
        } else if (type == Boekhoudrekening.class) {
            return old = new Boekhoudrekening(row);
        } else if (type == Bankinstelling.class) {
            return old = new Bankinstelling(row);
        } else if (type == Productgroep.class) {
            return old = new Productgroep(row);
        } else if (type == Productsubgroep.class) {
            return old = new Productsubgroep(row);
        } else if (type == Productiegroep.class) {
            return old = new Productiegroep(row);
        } else if (type == Bestelgroep.class) {
            return old = new Bestelgroep(row);
        } else if (type == Receptgroep.class) {
            return old = new Receptgroep(row);
        } else if (type == Recepteenheid.class) {
            return old = new Recepteenheid(row);
        } else if (type == Verpakkingseenheid.class) {
            return old = new Verpakkingseenheid(row);
        } else if (type == Voorraadplaats.class) {
            return old = new Voorraadplaats(row);
        } else if (type == Btwcode.class) {
            return old = new Btwcode(row);
        } else if (type == Ingredientgroep.class) {
            return old = new Ingredientgroep(row);
        } else if (type == Productcategorie.class) {
            return old = new Productcategorie(row);
        } else if (type == Aankoopeenheid.class) {
            return old = new Aankoopeenheid(row);
        } else if (type == Etiketeenheid.class) {
            return old = new Etiketeenheid(row);
        } else if (type == Voorraadeenheid.class) {
            return old = new Voorraadeenheid(row);
        } else if (type == Allergeengroep.class) {
            return old = new Allergeengroep(row);
        } else if (type == Allergeen.class) {
            return old = new Allergeen(row);
        } else if (type == Verkoopproductgroep.class) {
            return old = new Verkoopproductgroep(row);
        } else if (type == Kneder.class) {
            return old = new Kneder(row);
        } else if (type == Basiseenheid.class) {
            return old = new Basiseenheid(row);
        } else if (type == Prijseenheid.class) {
            return old = new Prijseenheid(row);
        } else if (type == Taalcode.class) {
            return old = new Taalcode(row);
        } else if (type == BtwcodeLeverancier.class) {
            return old = new BtwcodeLeverancier(row);
        } else if (type == Contactname.class) {
            return old = new Contactname(row);
        } else if (type == Werknemer.class) {
            return old = new Werknemer(row);
        } else if (type == Etiket.class) {
            return old = new Etiket(row);
        } else if (type == EtiketPrinter.class) {
            return old = new EtiketPrinter(row);
        } else if (type == Receptingave.class) {
            return old = new Receptingave(row);
        } else if (type == Bewaartemperatuur.class) {
            return old = new Bewaartemperatuur(row);
        } else if (type == MicrobiologischeParameter.class) {
            return old = new MicrobiologischeParameter(row);
        } else if (type == BronVoedingswaarde.class) {
            return old = new BronVoedingswaarde(row);
        } else if (type == Leveringstemperatuur.class) {
            return old = new Leveringstemperatuur(row);
        } else if (type == VariantHoofding.class) {
            return old = new VariantHoofding(row);
        } else if (type == VariantDetail.class) {
            return old = new VariantDetail(row);
        } else if (type == OptieHoofding.class) {
            return old = new OptieHoofding(row);
        } else if (type == OptieDetail.class) {
            return old = new OptieDetail(row);
        } else if (type == EtiketTekst.class) {
            return old = new EtiketTekst(row);
        } else if (type == Fabrikant.class) {
            return old = new Fabrikant(row);
        } else if (type == LandOorsprong.class) {
            return old = new LandOorsprong(row);
        } else if (type == Origine.class) {
            return old = new Origine(row);
        } else if (type == Functie.class) {
            return old = new Functie(row);
        } else if (type == Ingrediënt.class) {
            return old = new Ingrediënt(row);
        } else if (type == IngredientAllergeen.class) {
            return old = new IngredientAllergeen(row);
        } else if (type == NutrioneleInformatieHoofding.class) {
            return old = new NutrioneleInformatieHoofding(row);
        } else if (type == NutrioneleInformatieDetail.class) {
            return old = new NutrioneleInformatieDetail(row);
        } else if (type == NutrioneleEenheid.class) {
            return old = new NutrioneleEenheid(row);
        } else if (type == LotnummerType.class) {
            return old = new LotnummerType(row);
        } else if (type == LotnummerDrager.class) {
            return old = new LotnummerDrager(row);
        } else if (type == LotnummerAanbrenger.class) {
            return old = new LotnummerAanbrenger(row);
        } else if (type == Distributiewijze.class) {
            return old = new Distributiewijze(row);
        } else if (type == Bewaarconditie.class) {
            return old = new Bewaarconditie(row);
        } else if (type == WebshopAPI.class) {
            return old = new WebshopAPI(row);
        } else if (type == Voorraadcorrectie.class) {
            return old = new Voorraadcorrectie(row);
        } else if (type == Ventilatiecode.class) {
            return old = new Ventilatiecode(row);
        } else if (type == BarcodePrefix.class) {
            return old = new BarcodePrefix(row);
        } else if (type == PercentageVasteKost.class) {
            return old = new PercentageVasteKost(row);
        } else if (type == PercentageOnrechtstreekseProductiekost.class) {
            return old = new PercentageOnrechtstreekseProductiekost(row);
        } else if (type == PercentageWinstmarge.class) {
            return old = new PercentageWinstmarge(row);
        } else if (type == PercentageKost.class) {
            return old = new PercentageKost(row);
        } else if (type == Personeelskost.class) {
            return old = new Personeelskost(row);
        } else if (type == EtiketDefault.class) {
            return old = new EtiketDefault(row);
        } else if (type == Weegschaalmodel.class) {
            return old = new Weegschaalmodel(row);
        } else if (type == Weegschaal.class) {
            return old = new Weegschaal(row);
        } else if (type == PeriodeInstelling.class) {
            return old = new PeriodeInstelling(row);
        } else if (type == Bedrijf.class) {
            return old = new Bedrijf(row);
        } else if (type == BedrijvenAllergeen.class) {
            return old = new BedrijvenAllergeen(row);
        } else if (type == Gebruiker.class) {
            return old = new Gebruiker(row);
        } else if (type == Land.class) {
            return old = new Land(row);
        } else if (type == Woonplaats.class) {
            return old = new Woonplaats(row);
        } else if (type == Leverancier.class) {
            return old = new Leverancier(row);
        } else if (type == Aankoopproduct.class) {
            return old = new Aankoopproduct(row);
        } else if (type == AankoopproductAllergeen.class) {
            return old = new AankoopproductAllergeen(row);
        } else if (type == AankoopproductLeverancier.class) {
            return old = new AankoopproductLeverancier(row);
        } else if (type == AankoopproductNutrioneleInformatie.class) {
            return old = new AankoopproductNutrioneleInformatie(row);
        } else if (type == AankoopproductIngredient.class) {
            return old = new AankoopproductIngredient(row);
        } else if (type == AankoopproductEenheidsprijs.class) {
            return old = new AankoopproductEenheidsprijs(row);
        } else if (type == AankoopproductTechnischeVersie.class) {
            return old = new AankoopproductTechnischeVersie(row);
        } else if (type == Receptproduct.class) {
            return old = new Receptproduct(row);
        } else if (type == Halffabrikaat.class) {
            return old = new Halffabrikaat(row);
        }else if (type == Voorbereidproduct.class) {
            return old = new Voorbereidproduct(row);
        }else if (type == Afgewerktproduct.class) {
            return old = new Afgewerktproduct(row);
        }else if (type == AfgewerktproductIngredient.class) {
            return old = new AfgewerktproductIngredient(row);
        }else if (type == Verkoopproduct.class) {
            return old = new Verkoopproduct(row);
        }else if (type == VerkoopproductAllergeen.class) {
            return old = new VerkoopproductAllergeen(row);
        }else if (type == VerkoopproductIngredient.class) {
            return old = new VerkoopproductIngredient(row);
        }else if (type == RechtstreekseProductiekost.class) {
            return old = new RechtstreekseProductiekost(row);
        }else if (type == Klant.class) {
            return old = new Klant(row);
        }else if (type == KlantPrivateLabel.class) {
            return old = new KlantPrivateLabel(row);
        }else if (type == AankoopproductTekstIngredient.class) {
            return old = new AankoopproductTekstIngredient(row);
        }else if (type == ParameterProductielijst.class) {
            return old = new ParameterProductielijst(row);
        }else if (type == PrinterProductielijstWerkstation.class) {
            return old = new PrinterProductielijstWerkstation(row);
        }else if (type == PointOfSales.class) {
            return old = new PointOfSales(row);
        }else if (type == KlantArtikelKoppeling.class) {
            return old = new KlantArtikelKoppeling(row);
        }else if (type == Verkoopsverpakking.class) {
            return old = new Verkoopsverpakking(row);
        }else if (type == Verdeelgroep.class) {
            return old = new Verdeelgroep(row);
        }else if (type == KlantBestellingStandaard.class) {
            return old = new KlantBestellingStandaard(row);
        }else if (type == BedrijfLink.class) {
            return old = new BedrijfLink(row);
        }else if (type == KlantVerdeelgroep.class) {
            return old = new KlantVerdeelgroep(row);
        }else if (type == Leveringsadres.class) {
            return old = new Leveringsadres(row);
        }else if (type == Recept.class) {
            return old = new Recept(row);
        }else if (type == Bestelvoorstel.class) {
            return old = new Bestelvoorstel(row);
        }else if (type == BestelbonHoofding.class) {
            return old = new BestelbonHoofding(row);
        }else if (type == BestelbonDetail.class) {
            return old = new BestelbonDetail(row);
        }else if (type == LeveringsbonHoofding.class) {
            return old = new LeveringsbonHoofding(row);
        }else if (type == LeveringsbonDetail.class) {
            return old = new LeveringsbonDetail(row);
        }else if (type == InventarisAankoopproduct.class) {
            return old = new InventarisAankoopproduct(row);
        }else if (type == InventarisEigenFabrikaat.class) {
            return old = new InventarisEigenFabrikaat(row);
        }else if (type == VoorraadcorrectieAankoopproduct.class) {
            return old = new VoorraadcorrectieAankoopproduct(row);
        }else if (type == VoorraadcorrectieEigenFabrikaat.class) {
            return old = new VoorraadcorrectieEigenFabrikaat(row);
        }else if (type == AankoopproductInGebruik.class) {
            return old = new AankoopproductInGebruik(row);
        }else if (type == EigenFabrikaatInGebruik.class) {
            return old = new EigenFabrikaatInGebruik(row);
        }else if (type == Productieperiode.class) {
            return old = new Productieperiode(row);
        }else if (type == Productieopdracht.class) {
            return old = new Productieopdracht(row);
        }else if (type == ProductieopdrachtWerknemer.class) {
            return old = new ProductieopdrachtWerknemer(row);
        }else if (type == ProductieopdrachtVerbruik.class) {
            return old = new ProductieopdrachtVerbruik(row);
        }else if (type == ProductieopdrachtLotnummer.class) {
            return old = new ProductieopdrachtLotnummer(row);
        }else if (type == ProductieVerkoopproductHoofding.class) {
            return old = new ProductieVerkoopproductHoofding(row);
        }else if (type == ProductieEigenFabrikaatHoofding.class) {
            return old = new ProductieEigenFabrikaatHoofding(row);
        }else if (type == Regelmaat.class) {
            return old = new Regelmaat(row);
        }else if (type == PlanningBasis.class) {
            return old = new PlanningBasis(row);
        }else if (type == OrderpickingHoofding.class) {
            return old = new OrderpickingHoofding(row);
        }else if (type == OrderpickingDetail.class) {
            return old = new OrderpickingDetail(row);
        }else if (type == VerzendbonHoofding.class) {
            return old = new VerzendbonHoofding(row);
        }else if (type == VerzendbonDetail.class) {
            return old = new VerzendbonDetail(row);
        }else if (type == KassabestellingHoofding.class) {
            return old = new KassabestellingHoofding(row);
        }else if (type == KassabestellingDetail.class) {
            return old = new KassabestellingDetail(row);
        }else if (type == VerkopenHoofding.class) {
            return old = new VerkopenHoofding(row);
        }else if (type == VerkopenDetail.class) {
            return old = new VerkopenDetail(row);
        }else if (type == VasteBestellingHoofding.class) {
            return old = new VasteBestellingHoofding(row);
        }else if (type == VasteBestellingDetail.class) {
            return old = new VasteBestellingDetail(row);
        }else if (type == Boekjaar.class) {
            return old = new Boekjaar(row);
        }else if (type == AankoopfactuurHoofding.class) {
            return old = new AankoopfactuurHoofding(row);
        }else if (type == AankoopfactuurDetail.class) {
            return old = new AankoopfactuurDetail(row);
        }else if (type == Materieel.class) {
            return old = new Materieel(row);
        }else if (type == MaterieelGroep.class) {
            return old = new MaterieelGroep(row);
        }else if (type == Werkplek.class) {
            return old = new Werkplek(row);
        }else if (type == LijstLeveringTotaalLeverancierAankoopproduct.class) {
            return old = new LijstLeveringTotaalLeverancierAankoopproduct(row);
        }else if (type == LijstLeveringOverzichtLeverancierAankoopproduct.class) {
            return old = new LijstLeveringOverzichtLeverancierAankoopproduct(row);
        }else if (type == OnlineAankoopproduct.class) {
            return old = new OnlineAankoopproduct(row);
        }else if (type == OnlineVerpakkingseenheid.class) {
            return old = new OnlineVerpakkingseenheid(row);
        }else if (type == OnlineFabrikant.class) {
            return old = new OnlineFabrikant(row);
        }else if (type == OnlineFunctie.class) {
            return old = new OnlineFunctie(row);
        }else if (type == OnlineAankoopproductIngredient.class) {
            return old = new OnlineAankoopproductIngredient(row);
        }else if (type == OnlineAankoopproductAllergeen.class) {
            return old = new OnlineAankoopproductAllergeen(row);
        }else if (type == OnlineAankoopproductNutrioneleInformatie.class) {
            return old = new OnlineAankoopproductNutrioneleInformatie(row);
        }else if (type == OnlineIngredient.class) {
            return old = new OnlineIngredient(row);
        }else if (type == OnlineIngredientAllergeen.class) {
            return old = new OnlineIngredientAllergeen(row);
        }else if (type == OnlineOrigine.class) {
            return old = new OnlineOrigine(row);
        }else if (type == LogVerwerkteFile.class) {
            return old = new LogVerwerkteFile(row);
        }else if (type == Log.class) {
            return old = new Log(row);
        }

        throw new IllegalArgumentException("returnOld aanvullen!");
    }

}
