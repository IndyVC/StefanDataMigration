/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Bedrijven.Fabrikant;
import Bestellingen.BestelGroep;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Materialen.Etiket;
import Materialen.Verpakking;
import New.New;
import Voorraden.VoorraadPlaats;
import enums.BtwCode;
import enums.Eenheid;
import enums.EtiketPrintMogelijkheid;
import enums.VerpakkingsEenheid;

/**
 *
 * @author stefa
 */
public class ProductCategorie implements New{

    public int ProductCategorieId;
    public Omschrijving Omschrijving;
    public ProductGroep StandaardProductGroepProductGroep;
    public ProductSubGroep StandaardProductSubGroepProductSubGroep;
    public Fabrikant StandaardFabrikantFabrikant;
    public BestelGroep BestelGroep;
    public Verpakking StandaardVerpakkingVerpakking;
    public Verpakking StandaardColliVerpakkingVerpakking;
    public Eenheid StandaardEenheid;
    public VerpakkingsEenheid StandaardAankoopEenheid;
    public Etiket StandaardEtiketEtiket;
    public VerpakkingsEenheid StandaardEenheidOpEtiket;
    public VerpakkingsEenheid StandaardVoorraadEenheid;
    public VoorraadPlaats StandaardVoorraadPlaats;
    public BtwCode StandaardBtwCode;
    public VerpakkingsEenheid StandaardPrijsEenheid;
    public AlgemeneRekening StandaardAlgemeneRekeningAlgemeneRekening;
    public AnalytischeRekening StandaardAnalytischeRekeningAnalytischeRekening;
    public boolean StandaardDoorverkoop;
    public boolean StandaardVoorraad;
    public boolean AfdrukkenEtiketIntern;
    public boolean AfdrukkenEtiketVerbruik;
    public VerpakkingsEenheid StandaardVerbruiksEenheidOpEtiket;
    public boolean IsBeperkthoudbaarNaOpenen;
    public boolean AfdrukkenEtikettenVanVerkoopProducten;
    public EtiketPrintMogelijkheid EtiketPrint;
    public boolean AfdrukkenEtiketMetIngrediënten;
    public boolean IsHulpstof;
    public boolean IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen;
    public boolean IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten;
    public boolean IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten;
    public boolean IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten;

    public ProductCategorie() {
    }

    public ProductCategorie(int ProductCategorieId, Omschrijving Omschrijving, ProductGroep StandaardProductGroep, ProductSubGroep StandaardProductSubGroep, Fabrikant StandaardFabrikant, BestelGroep BestelGroep, Verpakking StandaardVerpakking, Verpakking StandaardColliVerpakking, Eenheid StandaardEenheid, VerpakkingsEenheid StandaardAankoopEenheid, Etiket StandaardEtiket, VerpakkingsEenheid StandaardEenheidOpEtiket, VerpakkingsEenheid StandaardVoorraadEenheid, VoorraadPlaats StandaardVoorraadPlaats, BtwCode StandaardBtwCode, VerpakkingsEenheid StandaardPrijsEenheid, AlgemeneRekening StandaardAlgemeneRekening, AnalytischeRekening StandaardAnalytischeRekening, boolean StandaardDoorverkoop, boolean StandaardVoorraad, boolean AfdrukkenEtiketIntern, boolean AfdrukkenEtiketVerbruik, VerpakkingsEenheid StandaardVerbruiksEenheidOpEtiket, boolean IsBeperkthoudbaarNaOpenen, boolean AfdrukkenEtikettenVanVerkoopProducten, EtiketPrintMogelijkheid EtiketPrint, boolean AfdrukkenEtiketMetIngrediënten, boolean IsHulpstof, boolean IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen, boolean IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten, boolean IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten, boolean IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten) {
        this.ProductCategorieId = ProductCategorieId;
        this.Omschrijving = Omschrijving;
        this.StandaardProductGroepProductGroep = StandaardProductGroep;
        this.StandaardProductSubGroepProductSubGroep = StandaardProductSubGroep;
        this.StandaardFabrikantFabrikant = StandaardFabrikant;
        this.BestelGroep = BestelGroep;
        this.StandaardVerpakkingVerpakking = StandaardVerpakking;
        this.StandaardColliVerpakkingVerpakking = StandaardColliVerpakking;
        this.StandaardEenheid = StandaardEenheid;
        this.StandaardAankoopEenheid = StandaardAankoopEenheid;
        this.StandaardEtiketEtiket = StandaardEtiket;
        this.StandaardEenheidOpEtiket = StandaardEenheidOpEtiket;
        this.StandaardVoorraadEenheid = StandaardVoorraadEenheid;
        this.StandaardVoorraadPlaats = StandaardVoorraadPlaats;
        this.StandaardBtwCode = StandaardBtwCode;
        this.StandaardPrijsEenheid = StandaardPrijsEenheid;
        this.StandaardAlgemeneRekeningAlgemeneRekening = StandaardAlgemeneRekening;
        this.StandaardAnalytischeRekeningAnalytischeRekening = StandaardAnalytischeRekening;
        this.StandaardDoorverkoop = StandaardDoorverkoop;
        this.StandaardVoorraad = StandaardVoorraad;
        this.AfdrukkenEtiketIntern = AfdrukkenEtiketIntern;
        this.AfdrukkenEtiketVerbruik = AfdrukkenEtiketVerbruik;
        this.StandaardVerbruiksEenheidOpEtiket = StandaardVerbruiksEenheidOpEtiket;
        this.IsBeperkthoudbaarNaOpenen = IsBeperkthoudbaarNaOpenen;
        this.AfdrukkenEtikettenVanVerkoopProducten = AfdrukkenEtikettenVanVerkoopProducten;
        this.EtiketPrint = EtiketPrint;
        this.AfdrukkenEtiketMetIngrediënten = AfdrukkenEtiketMetIngrediënten;
        this.IsHulpstof = IsHulpstof;
        this.IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen = IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen;
        this.IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten = IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten;
        this.IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten = IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten;
        this.IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten = IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten;
    }

    public int getProductCategorieId() {
        return ProductCategorieId;
    }

    public void setProductCategorieId(int ProductCategorieId) {
        this.ProductCategorieId = ProductCategorieId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public ProductGroep getStandaardProductGroepProductGroep() {
        return StandaardProductGroepProductGroep;
    }

    public void setStandaardProductGroepProductGroep(ProductGroep StandaardProductGroepProductGroep) {
        this.StandaardProductGroepProductGroep = StandaardProductGroepProductGroep;
    }

    public ProductSubGroep getStandaardProductSubGroepProductSubGroep() {
        return StandaardProductSubGroepProductSubGroep;
    }

    public void setStandaardProductSubGroepProductSubGroep(ProductSubGroep StandaardProductSubGroepProductSubGroep) {
        this.StandaardProductSubGroepProductSubGroep = StandaardProductSubGroepProductSubGroep;
    }

    public Fabrikant getStandaardFabrikantFabrikant() {
        return StandaardFabrikantFabrikant;
    }

    public void setStandaardFabrikantFabrikant(Fabrikant StandaardFabrikantFabrikant) {
        this.StandaardFabrikantFabrikant = StandaardFabrikantFabrikant;
    }

    public BestelGroep getBestelGroep() {
        return BestelGroep;
    }

    public void setBestelGroep(BestelGroep BestelGroep) {
        this.BestelGroep = BestelGroep;
    }

    public Verpakking getStandaardVerpakkingVerpakking() {
        return StandaardVerpakkingVerpakking;
    }

    public void setStandaardVerpakkingVerpakking(Verpakking StandaardVerpakkingVerpakking) {
        this.StandaardVerpakkingVerpakking = StandaardVerpakkingVerpakking;
    }

    public Verpakking getStandaardColliVerpakkingVerpakking() {
        return StandaardColliVerpakkingVerpakking;
    }

    public void setStandaardColliVerpakkingVerpakking(Verpakking StandaardColliVerpakkingVerpakking) {
        this.StandaardColliVerpakkingVerpakking = StandaardColliVerpakkingVerpakking;
    }
   
 
    public Eenheid getStandaardEenheid() {
        return StandaardEenheid;
    }

    public void setStandaardEenheid(Eenheid StandaardEenheid) {
        this.StandaardEenheid = StandaardEenheid;
    }

    public VerpakkingsEenheid getStandaardAankoopEenheid() {
        return StandaardAankoopEenheid;
    }

    public void setStandaardAankoopEenheid(VerpakkingsEenheid StandaardAankoopEenheid) {
        this.StandaardAankoopEenheid = StandaardAankoopEenheid;
    }

    public Etiket getStandaardEtiketEtiket() {
        return StandaardEtiketEtiket;
    }

    public void setStandaardEtiketEtiket(Etiket StandaardEtiketEtiket) {
        this.StandaardEtiketEtiket = StandaardEtiketEtiket;
    }

    public VerpakkingsEenheid getStandaardEenheidOpEtiket() {
        return StandaardEenheidOpEtiket;
    }

    public void setStandaardEenheidOpEtiket(VerpakkingsEenheid StandaardEenheidOpEtiket) {
        this.StandaardEenheidOpEtiket = StandaardEenheidOpEtiket;
    }

    public VerpakkingsEenheid getStandaardVoorraadEenheid() {
        return StandaardVoorraadEenheid;
    }

    public void setStandaardVoorraadEenheid(VerpakkingsEenheid StandaardVoorraadEenheid) {
        this.StandaardVoorraadEenheid = StandaardVoorraadEenheid;
    }

    public VoorraadPlaats getStandaardVoorraadPlaats() {
        return StandaardVoorraadPlaats;
    }

    public void setStandaardVoorraadPlaats(VoorraadPlaats StandaardVoorraadPlaats) {
        this.StandaardVoorraadPlaats = StandaardVoorraadPlaats;
    }

    public BtwCode getStandaardBtwCode() {
        return StandaardBtwCode;
    }

    public void setStandaardBtwCode(BtwCode StandaardBtwCode) {
        this.StandaardBtwCode = StandaardBtwCode;
    }

    public VerpakkingsEenheid getStandaardPrijsEenheid() {
        return StandaardPrijsEenheid;
    }

    public void setStandaardPrijsEenheid(VerpakkingsEenheid StandaardPrijsEenheid) {
        this.StandaardPrijsEenheid = StandaardPrijsEenheid;
    }

    public AlgemeneRekening getStandaardAlgemeneRekeningAlgemeneRekening() {
        return StandaardAlgemeneRekeningAlgemeneRekening;
    }

    public void setStandaardAlgemeneRekeningAlgemeneRekening(AlgemeneRekening StandaardAlgemeneRekeningAlgemeneRekening) {
        this.StandaardAlgemeneRekeningAlgemeneRekening = StandaardAlgemeneRekeningAlgemeneRekening;
    }

    public AnalytischeRekening getStandaardAnalytischeRekeningAnalytischeRekening() {
        return StandaardAnalytischeRekeningAnalytischeRekening;
    }

    public void setStandaardAnalytischeRekeningAnalytischeRekening(AnalytischeRekening StandaardAnalytischeRekeningAnalytischeRekening) {
        this.StandaardAnalytischeRekeningAnalytischeRekening = StandaardAnalytischeRekeningAnalytischeRekening;
    }

    public boolean isStandaardDoorverkoop() {
        return StandaardDoorverkoop;
    }

    public void setStandaardDoorverkoop(boolean StandaardDoorverkoop) {
        this.StandaardDoorverkoop = StandaardDoorverkoop;
    }

    public boolean isStandaardVoorraad() {
        return StandaardVoorraad;
    }

    public void setStandaardVoorraad(boolean StandaardVoorraad) {
        this.StandaardVoorraad = StandaardVoorraad;
    }

    public boolean isAfdrukkenEtiketIntern() {
        return AfdrukkenEtiketIntern;
    }

    public void setAfdrukkenEtiketIntern(boolean AfdrukkenEtiketIntern) {
        this.AfdrukkenEtiketIntern = AfdrukkenEtiketIntern;
    }

    public boolean isAfdrukkenEtiketVerbruik() {
        return AfdrukkenEtiketVerbruik;
    }

    public void setAfdrukkenEtiketVerbruik(boolean AfdrukkenEtiketVerbruik) {
        this.AfdrukkenEtiketVerbruik = AfdrukkenEtiketVerbruik;
    }

    public VerpakkingsEenheid getStandaardVerbruiksEenheidOpEtiket() {
        return StandaardVerbruiksEenheidOpEtiket;
    }

    public void setStandaardVerbruiksEenheidOpEtiket(VerpakkingsEenheid StandaardVerbruiksEenheidOpEtiket) {
        this.StandaardVerbruiksEenheidOpEtiket = StandaardVerbruiksEenheidOpEtiket;
    }

    public boolean isIsBeperkthoudbaarNaOpenen() {
        return IsBeperkthoudbaarNaOpenen;
    }

    public void setIsBeperkthoudbaarNaOpenen(boolean IsBeperkthoudbaarNaOpenen) {
        this.IsBeperkthoudbaarNaOpenen = IsBeperkthoudbaarNaOpenen;
    }

    public boolean isAfdrukkenEtikettenVanVerkoopProducten() {
        return AfdrukkenEtikettenVanVerkoopProducten;
    }

    public void setAfdrukkenEtikettenVanVerkoopProducten(boolean AfdrukkenEtikettenVanVerkoopProducten) {
        this.AfdrukkenEtikettenVanVerkoopProducten = AfdrukkenEtikettenVanVerkoopProducten;
    }

    public EtiketPrintMogelijkheid getEtiketPrint() {
        return EtiketPrint;
    }

    public void setEtiketPrint(EtiketPrintMogelijkheid EtiketPrint) {
        this.EtiketPrint = EtiketPrint;
    }

    public boolean isAfdrukkenEtiketMetIngrediënten() {
        return AfdrukkenEtiketMetIngrediënten;
    }

    public void setAfdrukkenEtiketMetIngrediënten(boolean AfdrukkenEtiketMetIngrediënten) {
        this.AfdrukkenEtiketMetIngrediënten = AfdrukkenEtiketMetIngrediënten;
    }

    public boolean isIsHulpstof() {
        return IsHulpstof;
    }

    public void setIsHulpstof(boolean IsHulpstof) {
        this.IsHulpstof = IsHulpstof;
    }

    public boolean isIsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen() {
        return IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen;
    }

    public void setIsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen(boolean IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen) {
        this.IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen = IsZichtbaarBijDeIngaveVanReceptenDegenEnBeslagen;
    }

    public boolean isIsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten() {
        return IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten;
    }

    public void setIsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten(boolean IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten) {
        this.IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten = IsZichtbaarBijDeIngaveVanReceptenVoorberijdeProducten;
    }

    public boolean isIsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten() {
        return IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten;
    }

    public void setIsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten(boolean IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten) {
        this.IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten = IsZichtbaarBijDeIngaveVanReceptenAfgewerkteProducten;
    }

    public boolean isIsZichtbaarBijDeIngaveVanReceptenVerkoopProducten() {
        return IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten;
    }

    public void setIsZichtbaarBijDeIngaveVanReceptenVerkoopProducten(boolean IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten) {
        this.IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten = IsZichtbaarBijDeIngaveVanReceptenVerkoopProducten;
    }

    @Override
    public void setId(int id) {
        this.ProductCategorieId=id;
    }
    
     @Override
    public int getId() {
        return this.ProductCategorieId;
    }
}
