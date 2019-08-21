/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Bedrijven.Fabrikant;
import Bedrijven.Vestiging;
import Bestellingen.BestelGroep;
import Boekhouding.AlgemeneRekening;
import Boekhouding.AnalytischeRekening;
import Materialen.Etiket;
import Materialen.EtiketTekst;
import New.New;
import TussenTabellen.AankoopProductLeverancier;
import TussenTabellen.AankoopProductVerkoopProduct;
import TussenTabellen.VestigingAankoopProduct;
import Voorraden.VoorraadPlaats;
import enums.BtwCode;
import enums.Eenheid;
import enums.MuntEenheid;
import enums.VerpakkingsEenheid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class AankoopProduct implements New {

    public int AankoopProductId;
    public Omschrijving Omschrijving;
    public ProductCategorie ProductCategorie;
    public ProductGroep ProductGroep;
    public ProductSubGroep ProductSubGroep;
    public BestelGroep BestelGroep;
    public VerpakkingsEenheid VerpakkingsEenheid;
    public Eenheid AankoopEenheid;
    public Eenheid VoorraadEenhied;
    public Eenheid EtiketEenheid;
    public double EenhedenPerVerpakking;
    public double VerpakkingenPerOmverpakking;
    public double NettoGewichtPerVerpakking;
    public double BrutoGewichtPerVerpakking;
    public double MinimumBestelHoeveelheid;
    public double TeBestellenVeelvoud;
    public int MinimumLeveringsTermijnInDagen;
    public int MinimumAantalDagenHoudbaar;
    public boolean NaarVoorRaad;
    public double MinimumVoorraad;
    public double MaximumVoorraad;
    public VoorraadPlaats VoorraadPlaats;
    public BtwCode BtwCode;
    public AlgemeneRekening AlgemeneRekening;
    public AnalytischeRekening AnalytischeRekening;
    public boolean WordtDoorVerkocht;
    public boolean Blokkeren;
    public String ProductInfo;
    public double GewichtPerEenheid;
    public Eenheid BasisEenheid;
    public MuntEenheid PrijsEenheid;
    public boolean EtiketIntern;
    public Etiket Etiket;
    public BigDecimal Gtin;
    public EtiketTekst EtiketTekst;
    public Fabrikant Fabrikant;
    public double VerliesPercentage;
    public String Foto;
    public String BarcodeOpOmverpakking;
    public boolean GaatOnmiddelijkInGebruik;
    public boolean IsBeperktHoudbaarNaOpenen;
    public int AantalDagenHoudbaarNaOpenen;
    public Eenheid EenheidBijInGebruikName;
    public int AantalLotenInGebruik;
    public ReceptProduct ReceptProduct;
    public List<VestigingAankoopProduct> AankoopProductvestigingen;
    public List<AankoopProductVerkoopProduct> AankoopProductenVerkoopProducten;
    public List<AankoopProductLeverancier> AankoopProductLeveranciers;

    public AankoopProduct() {
        this.AankoopProductenVerkoopProducten = new ArrayList();
        this.AankoopProductvestigingen = new ArrayList();
        this.AankoopProductLeveranciers = new ArrayList();
    }

    public AankoopProduct(int AankoopProductId, Omschrijving Omschrijving, ProductCategorie ProductCategorie, ProductGroep ProductGroep, ProductSubGroep ProductSubGroep, BestelGroep BestelGroep, VerpakkingsEenheid VerpakkingsEenheid, Eenheid AankoopEenheid, Eenheid VoorraadEenhied, Eenheid EtiketEenheid, double EenhedenPerVerpakking, double VerpakkingenPerOmverpakking, double NettoGewichtPerVerpakking, double BrutoGewichtPerVerpakking, double MinimumBestelHoeveelheid, double TeBestellenVeelvoud, int MinimumLeveringsTermijnInDagen, int MinimumAantalDagenHoudbaar, boolean NaarVoorRaad, double MinimumVoorraad, double MaximumVoorraad, VoorraadPlaats VoorraadPlaats, BtwCode BtwCode, AlgemeneRekening AlgemeneRekening, AnalytischeRekening AnalytischeRekening, boolean WordtDoorVerkocht, boolean Blokkeren, String ProductInfo, double GewichtPerEenheid, Eenheid BasisEenheid, MuntEenheid PrijsEenheid, boolean EtiketIntern, Etiket Etiket, BigDecimal Gtin, EtiketTekst EtiketTekst, Fabrikant Fabrikant, double VerliesPercentage, String Foto, String BarcodeOpOmverpakking, boolean GaatOnmiddelijkInGebruik, boolean IsBeperktHoudbaarNaOpenen, int AantalDagenHoudbaarNaOpenen, Eenheid EenheidBijInGebruikName, int AantalLotenInGebruik, ReceptProduct ReceptProduct) {
        this();
        this.AankoopProductId = AankoopProductId;
        this.Omschrijving = Omschrijving;
        this.ProductCategorie = ProductCategorie;
        this.ProductGroep = ProductGroep;
        this.ProductSubGroep = ProductSubGroep;
        this.BestelGroep = BestelGroep;
        this.VerpakkingsEenheid = VerpakkingsEenheid;
        this.AankoopEenheid = AankoopEenheid;
        this.VoorraadEenhied = VoorraadEenhied;
        this.EtiketEenheid = EtiketEenheid;
        this.EenhedenPerVerpakking = EenhedenPerVerpakking;
        this.VerpakkingenPerOmverpakking = VerpakkingenPerOmverpakking;
        this.NettoGewichtPerVerpakking = NettoGewichtPerVerpakking;
        this.BrutoGewichtPerVerpakking = BrutoGewichtPerVerpakking;
        this.MinimumBestelHoeveelheid = MinimumBestelHoeveelheid;
        this.TeBestellenVeelvoud = TeBestellenVeelvoud;
        this.MinimumLeveringsTermijnInDagen = MinimumLeveringsTermijnInDagen;
        this.MinimumAantalDagenHoudbaar = MinimumAantalDagenHoudbaar;
        this.NaarVoorRaad = NaarVoorRaad;
        this.MinimumVoorraad = MinimumVoorraad;
        this.MaximumVoorraad = MaximumVoorraad;
        this.VoorraadPlaats = VoorraadPlaats;
        this.BtwCode = BtwCode;
        this.AlgemeneRekening = AlgemeneRekening;
        this.AnalytischeRekening = AnalytischeRekening;
        this.WordtDoorVerkocht = WordtDoorVerkocht;
        this.Blokkeren = Blokkeren;
        this.ProductInfo = ProductInfo;
        this.GewichtPerEenheid = GewichtPerEenheid;
        this.BasisEenheid = BasisEenheid;
        this.PrijsEenheid = PrijsEenheid;
        this.EtiketIntern = EtiketIntern;
        this.Etiket = Etiket;
        this.Gtin = Gtin;
        this.EtiketTekst = EtiketTekst;
        this.Fabrikant = Fabrikant;
        this.VerliesPercentage = VerliesPercentage;
        this.Foto = Foto;
        this.BarcodeOpOmverpakking = BarcodeOpOmverpakking;
        this.GaatOnmiddelijkInGebruik = GaatOnmiddelijkInGebruik;
        this.IsBeperktHoudbaarNaOpenen = IsBeperktHoudbaarNaOpenen;
        this.AantalDagenHoudbaarNaOpenen = AantalDagenHoudbaarNaOpenen;
        this.EenheidBijInGebruikName = EenheidBijInGebruikName;
        this.AantalLotenInGebruik = AantalLotenInGebruik;
        this.ReceptProduct = ReceptProduct;

    }

    public List<AankoopProductLeverancier> getAankoopProductLeveranciers() {
        return AankoopProductLeveranciers;
    }

    public void setAankoopProductLeveranciers(List<AankoopProductLeverancier> AankoopProductLeveranciers) {
        this.AankoopProductLeveranciers = AankoopProductLeveranciers;
    }

    
    public int getAankoopProductId() {
        return AankoopProductId;
    }

    public void setAankoopProductId(int AankoopProductId) {
        this.AankoopProductId = AankoopProductId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public ProductCategorie getProductCategorie() {
        return ProductCategorie;
    }

    public void setProductCategorie(ProductCategorie ProductCategorie) {
        this.ProductCategorie = ProductCategorie;
    }

    public ProductGroep getProductGroep() {
        return ProductGroep;
    }

    public void setProductGroep(ProductGroep ProductGroep) {
        this.ProductGroep = ProductGroep;
    }

    public ProductSubGroep getProductSubGroep() {
        return ProductSubGroep;
    }

    public void setProductSubGroep(ProductSubGroep ProductSubGroep) {
        this.ProductSubGroep = ProductSubGroep;
    }

    public BestelGroep getBestelGroep() {
        return BestelGroep;
    }

    public void setBestelGroep(BestelGroep BestelGroep) {
        this.BestelGroep = BestelGroep;
    }

    public VerpakkingsEenheid getVerpakkingsEenheid() {
        return VerpakkingsEenheid;
    }

    public void setVerpakkingsEenheid(VerpakkingsEenheid VerpakkingsEenheid) {
        this.VerpakkingsEenheid = VerpakkingsEenheid;
    }

    public Eenheid getAankoopEenheid() {
        return AankoopEenheid;
    }

    public void setAankoopEenheid(Eenheid AankoopEenheid) {
        this.AankoopEenheid = AankoopEenheid;
    }

    public Eenheid getVoorraadEenhied() {
        return VoorraadEenhied;
    }

    public void setVoorraadEenhied(Eenheid VoorraadEenhied) {
        this.VoorraadEenhied = VoorraadEenhied;
    }

    public Eenheid getEtiketEenheid() {
        return EtiketEenheid;
    }

    public void setEtiketEenheid(Eenheid EtiketEenheid) {
        this.EtiketEenheid = EtiketEenheid;
    }

    public double getEenhedenPerVerpakking() {
        return EenhedenPerVerpakking;
    }

    public void setEenhedenPerVerpakking(double EenhedenPerVerpakking) {
        this.EenhedenPerVerpakking = EenhedenPerVerpakking;
    }

    public double getVerpakkingenPerOmverpakking() {
        return VerpakkingenPerOmverpakking;
    }

    public void setVerpakkingenPerOmverpakking(double VerpakkingenPerOmverpakking) {
        this.VerpakkingenPerOmverpakking = VerpakkingenPerOmverpakking;
    }

    public void setEenhedenPerVerpakking(int EenhedenPerVerpakking) {
        this.EenhedenPerVerpakking = EenhedenPerVerpakking;
    }

    public double getMinimumBestelHoeveelheid() {
        return MinimumBestelHoeveelheid;
    }

    public void setMinimumBestelHoeveelheid(double MinimumBestelHoeveelheid) {
        this.MinimumBestelHoeveelheid = MinimumBestelHoeveelheid;
    }

    public double getTeBestellenVeelvoud() {
        return TeBestellenVeelvoud;
    }

    public void setTeBestellenVeelvoud(double TeBestellenVeelvoud) {
        this.TeBestellenVeelvoud = TeBestellenVeelvoud;
    }

    public void setVerpakkingenPerOmverpakking(int VerpakkingenPerOmverpakking) {
        this.VerpakkingenPerOmverpakking = VerpakkingenPerOmverpakking;
    }

    public double getNettoGewichtPerVerpakking() {
        return NettoGewichtPerVerpakking;
    }

    public void setNettoGewichtPerVerpakking(double NettoGewichtPerVerpakking) {
        this.NettoGewichtPerVerpakking = NettoGewichtPerVerpakking;
    }

    public double getBrutoGewichtPerVerpakking() {
        return BrutoGewichtPerVerpakking;
    }

    public void setBrutoGewichtPerVerpakking(double BrutoGewichtPerVerpakking) {
        this.BrutoGewichtPerVerpakking = BrutoGewichtPerVerpakking;
    }

    public void setTeBestellenVeelvoud(int TeBestellenVeelvoud) {
        this.TeBestellenVeelvoud = TeBestellenVeelvoud;
    }

    public int getMinimumLeveringsTermijnInDagen() {
        return MinimumLeveringsTermijnInDagen;
    }

    public void setMinimumLeveringsTermijnInDagen(int MinimumLeveringsTermijnInDagen) {
        this.MinimumLeveringsTermijnInDagen = MinimumLeveringsTermijnInDagen;
    }

    public int getMinimumAantalDagenHoudbaar() {
        return MinimumAantalDagenHoudbaar;
    }

    public void setMinimumAantalDagenHoudbaar(int MinimumAantalDagenHoudbaar) {
        this.MinimumAantalDagenHoudbaar = MinimumAantalDagenHoudbaar;
    }

    public boolean isNaarVoorRaad() {
        return NaarVoorRaad;
    }

    public void setNaarVoorRaad(boolean NaarVoorRaad) {
        this.NaarVoorRaad = NaarVoorRaad;
    }

    public double getMinimumVoorraad() {
        return MinimumVoorraad;
    }

    public void setMinimumVoorraad(double MinimumVoorraad) {
        this.MinimumVoorraad = MinimumVoorraad;
    }

    public double getMaximumVoorraad() {
        return MaximumVoorraad;
    }

    public void setMaximumVoorraad(double MaximumVoorraad) {
        this.MaximumVoorraad = MaximumVoorraad;
    }

    public VoorraadPlaats getVoorraadPlaats() {
        return VoorraadPlaats;
    }

    public void setVoorraadPlaats(VoorraadPlaats VoorraadPlaats) {
        this.VoorraadPlaats = VoorraadPlaats;
    }

    public BtwCode getBtwCode() {
        return BtwCode;
    }

    public void setBtwCode(BtwCode BtwCode) {
        this.BtwCode = BtwCode;
    }

    public AlgemeneRekening getAlgemeneRekening() {
        return AlgemeneRekening;
    }

    public void setAlgemeneRekening(AlgemeneRekening AlgemeneRekening) {
        this.AlgemeneRekening = AlgemeneRekening;
    }

    public AnalytischeRekening getAnalytischeRekening() {
        return AnalytischeRekening;
    }

    public void setAnalytischeRekening(AnalytischeRekening AnalytischeRekening) {
        this.AnalytischeRekening = AnalytischeRekening;
    }

    public boolean isWordtDoorVerkocht() {
        return WordtDoorVerkocht;
    }

    public void setWordtDoorVerkocht(boolean WordtDoorVerkocht) {
        this.WordtDoorVerkocht = WordtDoorVerkocht;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    public double getGewichtPerEenheid() {
        return GewichtPerEenheid;
    }

    public void setGewichtPerEenheid(double GewichtPerEenheid) {
        this.GewichtPerEenheid = GewichtPerEenheid;
    }

    public Eenheid getBasisEenheid() {
        return BasisEenheid;
    }

    public void setBasisEenheid(Eenheid BasisEenheid) {
        this.BasisEenheid = BasisEenheid;
    }

    public MuntEenheid getPrijsEenheid() {
        return PrijsEenheid;
    }

    public void setPrijsEenheid(MuntEenheid PrijsEenheid) {
        this.PrijsEenheid = PrijsEenheid;
    }

    public boolean isEtiketIntern() {
        return EtiketIntern;
    }

    public void setEtiketIntern(boolean EtiketIntern) {
        this.EtiketIntern = EtiketIntern;
    }

    public Etiket getEtiket() {
        return Etiket;
    }

    public void setEtiket(Etiket Etiket) {
        this.Etiket = Etiket;
    }

    public BigDecimal getGtin() {
        return Gtin;
    }

    public void setGtin(BigDecimal Gtin) {
        this.Gtin = Gtin;
    }

    public EtiketTekst getEtiketTekst() {
        return EtiketTekst;
    }

    public void setEtiketTekst(EtiketTekst EtiketTekst) {
        this.EtiketTekst = EtiketTekst;
    }

    public Fabrikant getFabrikant() {
        return Fabrikant;
    }

    public void setFabrikant(Fabrikant Fabrikant) {
        this.Fabrikant = Fabrikant;
    }

    public double getVerliesPercentage() {
        return VerliesPercentage;
    }

    public void setVerliesPercentage(double VerliesPercentage) {
        this.VerliesPercentage = VerliesPercentage;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getBarcodeOpOmverpakking() {
        return BarcodeOpOmverpakking;
    }

    public void setBarcodeOpOmverpakking(String BarcodeOpOmverpakking) {
        this.BarcodeOpOmverpakking = BarcodeOpOmverpakking;
    }

    public boolean isGaatOnmiddelijkInGebruik() {
        return GaatOnmiddelijkInGebruik;
    }

    public void setGaatOnmiddelijkInGebruik(boolean GaatOnmiddelijkInGebruik) {
        this.GaatOnmiddelijkInGebruik = GaatOnmiddelijkInGebruik;
    }

    public boolean isIsBeperktHoudbaarNaOpenen() {
        return IsBeperktHoudbaarNaOpenen;
    }

    public void setIsBeperktHoudbaarNaOpenen(boolean IsBeperktHoudbaarNaOpenen) {
        this.IsBeperktHoudbaarNaOpenen = IsBeperktHoudbaarNaOpenen;
    }

    public int getAantalDagenHoudbaarNaOpenen() {
        return AantalDagenHoudbaarNaOpenen;
    }

    public void setAantalDagenHoudbaarNaOpenen(int AantalDagenHoudbaarNaOpenen) {
        this.AantalDagenHoudbaarNaOpenen = AantalDagenHoudbaarNaOpenen;
    }

    public Eenheid getEenheidBijInGebruikName() {
        return EenheidBijInGebruikName;
    }

    public void setEenheidBijInGebruikName(Eenheid EenheidBijInGebruikName) {
        this.EenheidBijInGebruikName = EenheidBijInGebruikName;
    }

    public int getAantalLotenInGebruik() {
        return AantalLotenInGebruik;
    }

    public void setAantalLotenInGebruik(int AantalLotenInGebruik) {
        this.AantalLotenInGebruik = AantalLotenInGebruik;
    }

    public ReceptProduct getReceptProduct() {
        return ReceptProduct;
    }

    public void setReceptProduct(ReceptProduct ReceptProduct) {
        this.ReceptProduct = ReceptProduct;
    }

    public List<VestigingAankoopProduct> getAankoopProductvestigingen() {
        return AankoopProductvestigingen;
    }

    public void setAankoopProductvestigingen(List<VestigingAankoopProduct> AankoopProductvestigingen) {
        this.AankoopProductvestigingen = AankoopProductvestigingen;
    }

    public List<AankoopProductVerkoopProduct> getAankoopProductenVerkoopProducten() {
        return AankoopProductenVerkoopProducten;
    }

    public void setAankoopProductenVerkoopProducten(List<AankoopProductVerkoopProduct> AankoopProductenVerkoopProducten) {
        this.AankoopProductenVerkoopProducten = AankoopProductenVerkoopProducten;
    }

    @Override
    public void setId(int id) {
        this.AankoopProductId = id;
    }

    @Override
    public int getId() {
        return this.AankoopProductId;
    }

}
