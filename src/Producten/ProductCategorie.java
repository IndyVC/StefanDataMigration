/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Bestellingen.BestelGroep;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Materialen.Verpakking;
import New.New;
import Old.Etiket.Etiket;
import Old.Fabrikant;
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
    public ProductGroep StandaardProductGroep;
    public ProductSubGroep StandaardProductSubGroep;
    public Fabrikant StandaardFabrikant;
    public BestelGroep BestelGroep;
    public Verpakking StandaardVerpakking;
    public Verpakking StandaardColliVerpakking;
    public Eenheid StandaardEenheid;
    public VerpakkingsEenheid StandaardAankoopEenheid;
    public Etiket StandaardEtiket;
    public VerpakkingsEenheid StandaardEenheidOpEtiket;
    public VerpakkingsEenheid StandaardVoorraadEenheid;
    public VoorraadPlaats StandaardVoorraadPlaats;
    public BtwCode StandaardBtwCode;
    public VerpakkingsEenheid StandaardPrijsEenheid;
    public AlgemeneRekening StandaardAlgemeneRekening;
    public AnalytischeRekening StandaardAnalytischeRekening;
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
        this.StandaardProductGroep = StandaardProductGroep;
        this.StandaardProductSubGroep = StandaardProductSubGroep;
        this.StandaardFabrikant = StandaardFabrikant;
        this.BestelGroep = BestelGroep;
        this.StandaardVerpakking = StandaardVerpakking;
        this.StandaardColliVerpakking = StandaardColliVerpakking;
        this.StandaardEenheid = StandaardEenheid;
        this.StandaardAankoopEenheid = StandaardAankoopEenheid;
        this.StandaardEtiket = StandaardEtiket;
        this.StandaardEenheidOpEtiket = StandaardEenheidOpEtiket;
        this.StandaardVoorraadEenheid = StandaardVoorraadEenheid;
        this.StandaardVoorraadPlaats = StandaardVoorraadPlaats;
        this.StandaardBtwCode = StandaardBtwCode;
        this.StandaardPrijsEenheid = StandaardPrijsEenheid;
        this.StandaardAlgemeneRekening = StandaardAlgemeneRekening;
        this.StandaardAnalytischeRekening = StandaardAnalytischeRekening;
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

    public ProductGroep getStandaardProductGroep() {
        return StandaardProductGroep;
    }

    public void setStandaardProductGroep(ProductGroep StandaardProductGroep) {
        this.StandaardProductGroep = StandaardProductGroep;
    }

    public ProductSubGroep getStandaardProductSubGroep() {
        return StandaardProductSubGroep;
    }

    public void setStandaardProductSubGroep(ProductSubGroep StandaardProductSubGroep) {
        this.StandaardProductSubGroep = StandaardProductSubGroep;
    }

    public Fabrikant getStandaardFabrikant() {
        return StandaardFabrikant;
    }

    public void setStandaardFabrikant(Fabrikant StandaardFabrikant) {
        this.StandaardFabrikant = StandaardFabrikant;
    }

    public BestelGroep getBestelGroep() {
        return BestelGroep;
    }

    public void setBestelGroep(BestelGroep BestelGroep) {
        this.BestelGroep = BestelGroep;
    }

    public Verpakking getStandaardVerpakking() {
        return StandaardVerpakking;
    }

    public void setStandaardVerpakking(Verpakking StandaardVerpakking) {
        this.StandaardVerpakking = StandaardVerpakking;
    }

    public Verpakking getStandaardColliVerpakking() {
        return StandaardColliVerpakking;
    }

    public void setStandaardColliVerpakking(Verpakking StandaardColliVerpakking) {
        this.StandaardColliVerpakking = StandaardColliVerpakking;
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

    public Etiket getStandaardEtiket() {
        return StandaardEtiket;
    }

    public void setStandaardEtiket(Etiket StandaardEtiket) {
        this.StandaardEtiket = StandaardEtiket;
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

    public AlgemeneRekening getStandaardAlgemeneRekening() {
        return StandaardAlgemeneRekening;
    }

    public void setStandaardAlgemeneRekening(AlgemeneRekening StandaardAlgemeneRekening) {
        this.StandaardAlgemeneRekening = StandaardAlgemeneRekening;
    }

    public AnalytischeRekening getStandaardAnalytischeRekening() {
        return StandaardAnalytischeRekening;
    }

    public void setStandaardAnalytischeRekening(AnalytischeRekening StandaardAnalytischeRekening) {
        this.StandaardAnalytischeRekening = StandaardAnalytischeRekening;
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