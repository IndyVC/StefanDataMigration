/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;
import java.sql.Date;

import Algemeen.Omschrijving;
import Bedrijven.PrivateLabel;
import Boekhouding.Winstmarge;
import Materialen.Verpakking;
import New.New;
import Old.Boekhouding.BTWpercentage;
import Old.Etiket.BarcodePrefix;
import Old.Lotnummer.LotnummerAanbrenger;
import Old.Lotnummer.LotnummerDrager;
import Old.Lotnummer.LotnummerType;
import Old.Materieel;
import Old.Verkoopsverpakking;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Taak;
import TussenTabellen.AankoopProductVerkoopProduct;
import TussenTabellen.VerkoopProductBasisRecept;
import TussenTabellen.VerkoopProductMaterieel;
import TussenTabellen.VerkoopProductTaak;
import enums.Eenheid;
import java.util.List;

/**
 *
 * @author stefa
 */
public class VerkoopProduct implements New {
     public int VerkoopProductId;
        public boolean OnlineBeschikbaar;
        public Date OnlineLaatstAangemaakt;
        public String GelinktMetCode;
        public VerkoopProductGroep VerkoopProductGroep;
        public BarcodePrefix BarcodePrefix;
        public PrivateLabel PrivateLabel;
        public Verpakking PrimaireVerpakking;
        public Verpakking SecundaireVerpakking;
        public int StuksPerVerpakking;
        public VerkoopsBarcode VerpakkingsBarcode;
        public int VerpakkingenPerColli;
        public VerkoopsBarcode ColliBarcode;
        public int CollisPerPallet;
        public VerkoopsBarcode PalletBarcode;
        public Verkoopsverpakking VermeldingLeveringsbon;
        public FysischeEigenschap Gewicht;
        public FysischeEigenschap Hoogte;
        public FysischeEigenschap Lengte;
        public FysischeEigenschap Breedte;
        public FysischeEigenschap Diameter;
        public Omschrijving Kleur;
        public Omschrijving Afwerking;
        public BTWpercentage BTWpercentage;
        public double Verkoopprijs;
        public Eenheid Verkoopeenheid;
        public VariantGroep VariantGroep;
        public OptieGroep OptieGroep;
        public MicrobiologischeParameter MicroBiologischeParameter;
        public LotnummerType LotnummerType;
        public LotnummerDrager LotnummerDrager;
        public LotnummerAanbrenger LotnummerAanbrenger;
        public Omschrijving ProductBeschrijving;
        public Omschrijving Gebruiksaanwijzing;
        public Winstmarge Winstmarge;
        public DistributieWijze DistributieWijze;
        public Omschrijving Ingrediënten;

        public List<GoedgekeurdeIngave> GoedgekeurdeIngaves;
        public List<FysischeEigenschap> FysischeEigenschappen;
        public List<AankoopProductVerkoopProduct> VerkoopProductAankoopProduct;
        public List<AankoopProduct> VerkoopProducten;

        public List<VerkoopProductBasisRecept> VerkoopProductBasisRecepten;
        public List<BasisRecept> BasisRecepten;
        public List<VerkoopProductTaak> VerkoopProductTaken;
        public List<Taak> ReceptTaken;
        public List<VerkoopProductMaterieel> VerkoopProductMaterielen;
        public List<Materieel> ReceptMaterieel;
       
    public VerkoopProduct() {
    }

    public VerkoopProduct(int VerkoopProductId, boolean OnlineBeschikbaar, Date OnlineLaatstAangemaakt, String GelinktMetCode, VerkoopProductGroep VerkoopProductGroep, BarcodePrefix BarcodePrefix, PrivateLabel PrivateLabel, Verpakking PrimaireVerpakking, Verpakking SecundaireVerpakking, int StuksPerVerpakking, VerkoopsBarcode VerpakkingsBarcode, int VerpakkingenPerColli, VerkoopsBarcode ColliBarcode, int CollisPerPallet, VerkoopsBarcode PalletBarcode, Verkoopsverpakking VermeldingLeveringsbon, FysischeEigenschap Gewicht, FysischeEigenschap Hoogte, FysischeEigenschap Lengte, FysischeEigenschap Breedte, FysischeEigenschap Diameter, Omschrijving Kleur, Omschrijving Afwerking, BTWpercentage BTWpercentage, double Verkoopprijs, Eenheid Verkoopeenheid, VariantGroep VariantGroep, OptieGroep OptieGroep, MicrobiologischeParameter MicroBiologischeParameter, LotnummerType LotnummerType, LotnummerDrager LotnummerDrager, LotnummerAanbrenger LotnummerAanbrenger, Omschrijving ProductBeschrijving, Omschrijving Gebruiksaanwijzing, Winstmarge Winstmarge, DistributieWijze DistributieWijze, Omschrijving Ingrediënten, List<GoedgekeurdeIngave> GoedgekeurdeIngaves, List<FysischeEigenschap> FysischeEigenschappen, List<AankoopProductVerkoopProduct> VerkoopProductAankoopProduct, List<AankoopProduct> VerkoopProducten, List<VerkoopProductBasisRecept> VerkoopProductBasisRecepten, List<BasisRecept> BasisRecepten, List<VerkoopProductTaak> VerkoopProductTaken, List<Taak> ReceptTaken, List<VerkoopProductMaterieel> VerkoopProductMaterielen, List<Materieel> ReceptMaterieel) {
        this.VerkoopProductId = VerkoopProductId;
        this.OnlineBeschikbaar = OnlineBeschikbaar;
        this.OnlineLaatstAangemaakt = OnlineLaatstAangemaakt;
        this.GelinktMetCode = GelinktMetCode;
        this.VerkoopProductGroep = VerkoopProductGroep;
        this.BarcodePrefix = BarcodePrefix;
        this.PrivateLabel = PrivateLabel;
        this.PrimaireVerpakking = PrimaireVerpakking;
        this.SecundaireVerpakking = SecundaireVerpakking;
        this.StuksPerVerpakking = StuksPerVerpakking;
        this.VerpakkingsBarcode = VerpakkingsBarcode;
        this.VerpakkingenPerColli = VerpakkingenPerColli;
        this.ColliBarcode = ColliBarcode;
        this.CollisPerPallet = CollisPerPallet;
        this.PalletBarcode = PalletBarcode;
        this.VermeldingLeveringsbon = VermeldingLeveringsbon;
        this.Gewicht = Gewicht;
        this.Hoogte = Hoogte;
        this.Lengte = Lengte;
        this.Breedte = Breedte;
        this.Diameter = Diameter;
        this.Kleur = Kleur;
        this.Afwerking = Afwerking;
        this.BTWpercentage = BTWpercentage;
        this.Verkoopprijs = Verkoopprijs;
        this.Verkoopeenheid = Verkoopeenheid;
        this.VariantGroep = VariantGroep;
        this.OptieGroep = OptieGroep;
        this.MicroBiologischeParameter = MicroBiologischeParameter;
        this.LotnummerType = LotnummerType;
        this.LotnummerDrager = LotnummerDrager;
        this.LotnummerAanbrenger = LotnummerAanbrenger;
        this.ProductBeschrijving = ProductBeschrijving;
        this.Gebruiksaanwijzing = Gebruiksaanwijzing;
        this.Winstmarge = Winstmarge;
        this.DistributieWijze = DistributieWijze;
        this.Ingrediënten = Ingrediënten;
        this.GoedgekeurdeIngaves = GoedgekeurdeIngaves;
        this.FysischeEigenschappen = FysischeEigenschappen;
        this.VerkoopProductAankoopProduct = VerkoopProductAankoopProduct;
        this.VerkoopProducten = VerkoopProducten;
        this.VerkoopProductBasisRecepten = VerkoopProductBasisRecepten;
        this.BasisRecepten = BasisRecepten;
        this.VerkoopProductTaken = VerkoopProductTaken;
        this.ReceptTaken = ReceptTaken;
        this.VerkoopProductMaterielen = VerkoopProductMaterielen;
        this.ReceptMaterieel = ReceptMaterieel;
    }

    
    public int getVerkoopProductId() {
        return VerkoopProductId;
    }

    public void setVerkoopProductId(int VerkoopProductId) {
        this.VerkoopProductId = VerkoopProductId;
    }

    public boolean isOnlineBeschikbaar() {
        return OnlineBeschikbaar;
    }

    public void setOnlineBeschikbaar(boolean OnlineBeschikbaar) {
        this.OnlineBeschikbaar = OnlineBeschikbaar;
    }

    public Date getOnlineLaatstAangemaakt() {
        return OnlineLaatstAangemaakt;
    }

    public void setOnlineLaatstAangemaakt(Date OnlineLaatstAangemaakt) {
        this.OnlineLaatstAangemaakt = OnlineLaatstAangemaakt;
    }

    public String getGelinktMetCode() {
        return GelinktMetCode;
    }

    public void setGelinktMetCode(String GelinktMetCode) {
        this.GelinktMetCode = GelinktMetCode;
    }

    public VerkoopProductGroep getVerkoopProductGroep() {
        return VerkoopProductGroep;
    }

    public void setVerkoopProductGroep(VerkoopProductGroep VerkoopProductGroep) {
        this.VerkoopProductGroep = VerkoopProductGroep;
    }

    public BarcodePrefix getBarcodePrefix() {
        return BarcodePrefix;
    }

    public void setBarcodePrefix(BarcodePrefix BarcodePrefix) {
        this.BarcodePrefix = BarcodePrefix;
    }

    public PrivateLabel getPrivateLabel() {
        return PrivateLabel;
    }

    public void setPrivateLabel(PrivateLabel PrivateLabel) {
        this.PrivateLabel = PrivateLabel;
    }

    public Verpakking getPrimaireVerpakking() {
        return PrimaireVerpakking;
    }

    public void setPrimaireVerpakking(Verpakking PrimaireVerpakking) {
        this.PrimaireVerpakking = PrimaireVerpakking;
    }

    public Verpakking getSecundaireVerpakking() {
        return SecundaireVerpakking;
    }

    public void setSecundaireVerpakking(Verpakking SecundaireVerpakking) {
        this.SecundaireVerpakking = SecundaireVerpakking;
    }

    public int getStuksPerVerpakking() {
        return StuksPerVerpakking;
    }

    public void setStuksPerVerpakking(int StuksPerVerpakking) {
        this.StuksPerVerpakking = StuksPerVerpakking;
    }

    public VerkoopsBarcode getVerpakkingsBarcode() {
        return VerpakkingsBarcode;
    }

    public void setVerpakkingsBarcode(VerkoopsBarcode VerpakkingsBarcode) {
        this.VerpakkingsBarcode = VerpakkingsBarcode;
    }

    public int getVerpakkingenPerColli() {
        return VerpakkingenPerColli;
    }

    public void setVerpakkingenPerColli(int VerpakkingenPerColli) {
        this.VerpakkingenPerColli = VerpakkingenPerColli;
    }

    public VerkoopsBarcode getColliBarcode() {
        return ColliBarcode;
    }

    public void setColliBarcode(VerkoopsBarcode ColliBarcode) {
        this.ColliBarcode = ColliBarcode;
    }

    public int getCollisPerPallet() {
        return CollisPerPallet;
    }

    public void setCollisPerPallet(int CollisPerPallet) {
        this.CollisPerPallet = CollisPerPallet;
    }

    public VerkoopsBarcode getPalletBarcode() {
        return PalletBarcode;
    }

    public void setPalletBarcode(VerkoopsBarcode PalletBarcode) {
        this.PalletBarcode = PalletBarcode;
    }

    public Verkoopsverpakking getVermeldingLeveringsbon() {
        return VermeldingLeveringsbon;
    }

    public void setVermeldingLeveringsbon(Verkoopsverpakking VermeldingLeveringsbon) {
        this.VermeldingLeveringsbon = VermeldingLeveringsbon;
    }

    public FysischeEigenschap getGewicht() {
        return Gewicht;
    }

    public void setGewicht(FysischeEigenschap Gewicht) {
        this.Gewicht = Gewicht;
    }

    public FysischeEigenschap getHoogte() {
        return Hoogte;
    }

    public void setHoogte(FysischeEigenschap Hoogte) {
        this.Hoogte = Hoogte;
    }

    public FysischeEigenschap getLengte() {
        return Lengte;
    }

    public void setLengte(FysischeEigenschap Lengte) {
        this.Lengte = Lengte;
    }

    public FysischeEigenschap getBreedte() {
        return Breedte;
    }

    public void setBreedte(FysischeEigenschap Breedte) {
        this.Breedte = Breedte;
    }

    public FysischeEigenschap getDiameter() {
        return Diameter;
    }

    public void setDiameter(FysischeEigenschap Diameter) {
        this.Diameter = Diameter;
    }

    public Omschrijving getKleur() {
        return Kleur;
    }

    public void setKleur(Omschrijving Kleur) {
        this.Kleur = Kleur;
    }

    public Omschrijving getAfwerking() {
        return Afwerking;
    }

    public void setAfwerking(Omschrijving Afwerking) {
        this.Afwerking = Afwerking;
    }

    public BTWpercentage getBTWpercentage() {
        return BTWpercentage;
    }

    public void setBTWpercentage(BTWpercentage BTWpercentage) {
        this.BTWpercentage = BTWpercentage;
    }

    public double getVerkoopprijs() {
        return Verkoopprijs;
    }

    public void setVerkoopprijs(double Verkoopprijs) {
        this.Verkoopprijs = Verkoopprijs;
    }

    public Eenheid getVerkoopeenheid() {
        return Verkoopeenheid;
    }

    public void setVerkoopeenheid(Eenheid Verkoopeenheid) {
        this.Verkoopeenheid = Verkoopeenheid;
    }

    public VariantGroep getVariantGroep() {
        return VariantGroep;
    }

    public void setVariantGroep(VariantGroep VariantGroep) {
        this.VariantGroep = VariantGroep;
    }

    public OptieGroep getOptieGroep() {
        return OptieGroep;
    }

    public void setOptieGroep(OptieGroep OptieGroep) {
        this.OptieGroep = OptieGroep;
    }

    public MicrobiologischeParameter getMicroBiologischeParameter() {
        return MicroBiologischeParameter;
    }

    public void setMicroBiologischeParameter(MicrobiologischeParameter MicroBiologischeParameter) {
        this.MicroBiologischeParameter = MicroBiologischeParameter;
    }

    public LotnummerType getLotnummerType() {
        return LotnummerType;
    }

    public void setLotnummerType(LotnummerType LotnummerType) {
        this.LotnummerType = LotnummerType;
    }

    public LotnummerDrager getLotnummerDrager() {
        return LotnummerDrager;
    }

    public void setLotnummerDrager(LotnummerDrager LotnummerDrager) {
        this.LotnummerDrager = LotnummerDrager;
    }

    public LotnummerAanbrenger getLotnummerAanbrenger() {
        return LotnummerAanbrenger;
    }

    public void setLotnummerAanbrenger(LotnummerAanbrenger LotnummerAanbrenger) {
        this.LotnummerAanbrenger = LotnummerAanbrenger;
    }

    public Omschrijving getProductBeschrijving() {
        return ProductBeschrijving;
    }

    public void setProductBeschrijving(Omschrijving ProductBeschrijving) {
        this.ProductBeschrijving = ProductBeschrijving;
    }

    public Omschrijving getGebruiksaanwijzing() {
        return Gebruiksaanwijzing;
    }

    public void setGebruiksaanwijzing(Omschrijving Gebruiksaanwijzing) {
        this.Gebruiksaanwijzing = Gebruiksaanwijzing;
    }

    public Winstmarge getWinstmarge() {
        return Winstmarge;
    }

    public void setWinstmarge(Winstmarge Winstmarge) {
        this.Winstmarge = Winstmarge;
    }

    public DistributieWijze getDistributieWijze() {
        return DistributieWijze;
    }

    public void setDistributieWijze(DistributieWijze DistributieWijze) {
        this.DistributieWijze = DistributieWijze;
    }

    public Omschrijving getIngrediënten() {
        return Ingrediënten;
    }

    public void setIngrediënten(Omschrijving Ingrediënten) {
        this.Ingrediënten = Ingrediënten;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductId=id;
    }
         @Override
    public int getId() {
        return this.VerkoopProductId;
    }
        
}
