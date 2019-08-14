/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import java.sql.Date;

import Algemeen.Omschrijving;
import Bedrijven.PrivateLabel;
import Boekhouding.BTWPercentage;
import Boekhouding.Winstmarge;
import Materialen.BarcodePrefix;
import Materialen.Verpakking;
import New.New;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Taak;
import Tracering.LotnummerAanbrenger;
import Tracering.LotnummerDrager;
import Tracering.LotnummerType;
import TussenTabellen.AankoopProductVerkoopProduct;
import TussenTabellen.VerkoopProductBasisRecept;
import TussenTabellen.VerkoopProductMaterieel;
import TussenTabellen.VerkoopProductTaak;
import enums.Eenheid;
import enums.VerpakkingsEenheid;
import java.util.ArrayList;
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
    public VerpakkingsEenheid PrimaireVerpakkingVerpakking;
    public VerpakkingsEenheid SecundaireVerpakkingVerpakking;
    public int StuksPerVerpakking;
    public VerkoopsBarcode VerpakkingsBarcodeVerkoopsBarcode;
    public int VerpakkingenPerColli;
    public VerkoopsBarcode ColliBarcodeVerkoopsBarcode;
    public int CollisPerPallet;
    public VerkoopsBarcode PalletBarcodeVerkoopsBarcode;
    public Verkoopsverpakking VermeldingLeveringsbonVerkoopsverpakking;
    public FysischeEigenschap GewichtFysischeEigenschap;
    public FysischeEigenschap HoogteFysischeEigenschap;
    public FysischeEigenschap LengteFysischeEigenschap;
    public FysischeEigenschap BreedteFysischeEigenschap;
    public FysischeEigenschap DiameterFysischeEigenschap;
    public Omschrijving KleurOmschrijving;
    public Omschrijving AfwerkingOmschrijving;
    public BTWPercentage BTWpercentage;
    public double Verkoopprijs;
    public Eenheid Verkoopeenheid;
    public VariantGroep VariantGroep;
    public OptieGroep OptieGroep;
    public MicrobiologischeParameter MicroBiologischeParameter;
    public LotnummerType LotnummerType;
    public LotnummerDrager LotnummerDrager;
    public LotnummerAanbrenger LotnummerAanbrenger;
    public Omschrijving ProductBeschrijvingOmschrijving;
    public Omschrijving GebruiksaanwijzingOmschrijving;
    public Winstmarge Winstmarge;
    public DistributieWijze DistributieWijze;
    public Omschrijving IngrediëntenOmschrijving;

    public List<GoedgekeurdeIngave> GoedgekeurdeIngaves;
    public List<AankoopProductVerkoopProduct> VerkoopProductAankoopProduct;

    public List<VerkoopProductBasisRecept> VerkoopProductBasisRecepten;
    public List<VerkoopProductTaak> VerkoopProductTaken;
    public List<VerkoopProductMaterieel> VerkoopProductMaterielen;

    public VerkoopProduct() {
    }

    public VerkoopProduct(int VerkoopProductId, boolean OnlineBeschikbaar, Date OnlineLaatstAangemaakt, String GelinktMetCode, VerkoopProductGroep VerkoopProductGroep, BarcodePrefix BarcodePrefix, PrivateLabel PrivateLabel, VerpakkingsEenheid PrimaireVerpakkingVerpakking, VerpakkingsEenheid SecundaireVerpakkingVerpakking, int StuksPerVerpakking, VerkoopsBarcode VerpakkingsBarcodeVerkoopsBarcode, int VerpakkingenPerColli, VerkoopsBarcode ColliBarcodeVerkoopsBarcode, int CollisPerPallet, VerkoopsBarcode PalletBarcodeVerkoopsBarcode, Verkoopsverpakking VermeldingLeveringsbonVerkoopsverpakking, FysischeEigenschap GewichtFysischeEigenschap, FysischeEigenschap HoogteFysischeEigenschap, FysischeEigenschap LengteFysischeEigenschap, FysischeEigenschap BreedteFysischeEigenschap, FysischeEigenschap DiameterFysischeEigenschap, Omschrijving KleurOmschrijving, Omschrijving AfwerkingOmschrijving, BTWPercentage BTWpercentage, double Verkoopprijs, Eenheid Verkoopeenheid, VariantGroep VariantGroep, OptieGroep OptieGroep, MicrobiologischeParameter MicroBiologischeParameter, LotnummerType LotnummerType, LotnummerDrager LotnummerDrager, LotnummerAanbrenger LotnummerAanbrenger, Omschrijving ProductBeschrijvingOmschrijving, Omschrijving GebruiksaanwijzingOmschrijving, Winstmarge Winstmarge, DistributieWijze DistributieWijze, Omschrijving IngrediëntenOmschrijving) {
        this.VerkoopProductId = VerkoopProductId;
        this.OnlineBeschikbaar = OnlineBeschikbaar;
        this.OnlineLaatstAangemaakt = OnlineLaatstAangemaakt;
        this.GelinktMetCode = GelinktMetCode;
        this.VerkoopProductGroep = VerkoopProductGroep;
        this.BarcodePrefix = BarcodePrefix;
        this.PrivateLabel = PrivateLabel;
        this.PrimaireVerpakkingVerpakking = PrimaireVerpakkingVerpakking;
        this.SecundaireVerpakkingVerpakking = SecundaireVerpakkingVerpakking;
        this.StuksPerVerpakking = StuksPerVerpakking;
        this.VerpakkingsBarcodeVerkoopsBarcode = VerpakkingsBarcodeVerkoopsBarcode;
        this.VerpakkingenPerColli = VerpakkingenPerColli;
        this.ColliBarcodeVerkoopsBarcode = ColliBarcodeVerkoopsBarcode;
        this.CollisPerPallet = CollisPerPallet;
        this.PalletBarcodeVerkoopsBarcode = PalletBarcodeVerkoopsBarcode;
        this.VermeldingLeveringsbonVerkoopsverpakking = VermeldingLeveringsbonVerkoopsverpakking;
        this.GewichtFysischeEigenschap = GewichtFysischeEigenschap;
        this.HoogteFysischeEigenschap = HoogteFysischeEigenschap;
        this.LengteFysischeEigenschap = LengteFysischeEigenschap;
        this.BreedteFysischeEigenschap = BreedteFysischeEigenschap;
        this.DiameterFysischeEigenschap = DiameterFysischeEigenschap;
        this.KleurOmschrijving = KleurOmschrijving;
        this.AfwerkingOmschrijving = AfwerkingOmschrijving;
        this.BTWpercentage = BTWpercentage;
        this.Verkoopprijs = Verkoopprijs;
        this.Verkoopeenheid = Verkoopeenheid;
        this.VariantGroep = VariantGroep;
        this.OptieGroep = OptieGroep;
        this.MicroBiologischeParameter = MicroBiologischeParameter;
        this.LotnummerType = LotnummerType;
        this.LotnummerDrager = LotnummerDrager;
        this.LotnummerAanbrenger = LotnummerAanbrenger;
        this.ProductBeschrijvingOmschrijving = ProductBeschrijvingOmschrijving;
        this.GebruiksaanwijzingOmschrijving = GebruiksaanwijzingOmschrijving;
        this.Winstmarge = Winstmarge;
        this.DistributieWijze = DistributieWijze;
        this.IngrediëntenOmschrijving = IngrediëntenOmschrijving;
    }

    public VerpakkingsEenheid getPrimaireVerpakkingVerpakking() {
        return PrimaireVerpakkingVerpakking;
    }

    public void setPrimaireVerpakkingVerpakking(VerpakkingsEenheid PrimaireVerpakkingVerpakking) {
        this.PrimaireVerpakkingVerpakking = PrimaireVerpakkingVerpakking;
    }

    public VerpakkingsEenheid getSecundaireVerpakkingVerpakking() {
        return SecundaireVerpakkingVerpakking;
    }

    public void setSecundaireVerpakkingVerpakking(VerpakkingsEenheid SecundaireVerpakkingVerpakking) {
        this.SecundaireVerpakkingVerpakking = SecundaireVerpakkingVerpakking;
    }

    public Eenheid getVerkoopeenheid() {
        return Verkoopeenheid;
    }

    public void setVerkoopeenheid(Eenheid Verkoopeenheid) {
        this.Verkoopeenheid = Verkoopeenheid;
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

    public int getStuksPerVerpakking() {
        return StuksPerVerpakking;
    }

    public void setStuksPerVerpakking(int StuksPerVerpakking) {
        this.StuksPerVerpakking = StuksPerVerpakking;
    }

    public VerkoopsBarcode getVerpakkingsBarcodeVerkoopsBarcode() {
        return VerpakkingsBarcodeVerkoopsBarcode;
    }

    public void setVerpakkingsBarcodeVerkoopsBarcode(VerkoopsBarcode VerpakkingsBarcodeVerkoopsBarcode) {
        this.VerpakkingsBarcodeVerkoopsBarcode = VerpakkingsBarcodeVerkoopsBarcode;
    }

    public int getVerpakkingenPerColli() {
        return VerpakkingenPerColli;
    }

    public void setVerpakkingenPerColli(int VerpakkingenPerColli) {
        this.VerpakkingenPerColli = VerpakkingenPerColli;
    }

    public VerkoopsBarcode getColliBarcodeVerkoopsBarcode() {
        return ColliBarcodeVerkoopsBarcode;
    }

    public void setColliBarcodeVerkoopsBarcode(VerkoopsBarcode ColliBarcodeVerkoopsBarcode) {
        this.ColliBarcodeVerkoopsBarcode = ColliBarcodeVerkoopsBarcode;
    }

    public int getCollisPerPallet() {
        return CollisPerPallet;
    }

    public void setCollisPerPallet(int CollisPerPallet) {
        this.CollisPerPallet = CollisPerPallet;
    }

    public VerkoopsBarcode getPalletBarcodeVerkoopsBarcode() {
        return PalletBarcodeVerkoopsBarcode;
    }

    public void setPalletBarcodeVerkoopsBarcode(VerkoopsBarcode PalletBarcodeVerkoopsBarcode) {
        this.PalletBarcodeVerkoopsBarcode = PalletBarcodeVerkoopsBarcode;
    }

    public Verkoopsverpakking getVermeldingLeveringsbonVerkoopsverpakking() {
        return VermeldingLeveringsbonVerkoopsverpakking;
    }

    public void setVermeldingLeveringsbonVerkoopsverpakking(Verkoopsverpakking VermeldingLeveringsbonVerkoopsverpakking) {
        this.VermeldingLeveringsbonVerkoopsverpakking = VermeldingLeveringsbonVerkoopsverpakking;
    }

    public FysischeEigenschap getGewichtFysischeEigenschap() {
        return GewichtFysischeEigenschap;
    }

    public void setGewichtFysischeEigenschap(FysischeEigenschap GewichtFysischeEigenschap) {
        this.GewichtFysischeEigenschap = GewichtFysischeEigenschap;
    }

    public FysischeEigenschap getHoogteFysischeEigenschap() {
        return HoogteFysischeEigenschap;
    }

    public void setHoogteFysischeEigenschap(FysischeEigenschap HoogteFysischeEigenschap) {
        this.HoogteFysischeEigenschap = HoogteFysischeEigenschap;
    }

    public FysischeEigenschap getLengteFysischeEigenschap() {
        return LengteFysischeEigenschap;
    }

    public void setLengteFysischeEigenschap(FysischeEigenschap LengteFysischeEigenschap) {
        this.LengteFysischeEigenschap = LengteFysischeEigenschap;
    }

    public FysischeEigenschap getBreedteFysischeEigenschap() {
        return BreedteFysischeEigenschap;
    }

    public void setBreedteFysischeEigenschap(FysischeEigenschap BreedteFysischeEigenschap) {
        this.BreedteFysischeEigenschap = BreedteFysischeEigenschap;
    }

    public FysischeEigenschap getDiameterFysischeEigenschap() {
        return DiameterFysischeEigenschap;
    }

    public void setDiameterFysischeEigenschap(FysischeEigenschap DiameterFysischeEigenschap) {
        this.DiameterFysischeEigenschap = DiameterFysischeEigenschap;
    }

    public Omschrijving getKleurOmschrijving() {
        return KleurOmschrijving;
    }

    public void setKleurOmschrijving(Omschrijving KleurOmschrijving) {
        this.KleurOmschrijving = KleurOmschrijving;
    }

    public Omschrijving getAfwerkingOmschrijving() {
        return AfwerkingOmschrijving;
    }

    public void setAfwerkingOmschrijving(Omschrijving AfwerkingOmschrijving) {
        this.AfwerkingOmschrijving = AfwerkingOmschrijving;
    }

    public BTWPercentage getBTWpercentage() {
        return BTWpercentage;
    }

    public void setBTWpercentage(BTWPercentage BTWpercentage) {
        this.BTWpercentage = BTWpercentage;
    }

    public double getVerkoopprijs() {
        return Verkoopprijs;
    }

    public void setVerkoopprijs(double Verkoopprijs) {
        this.Verkoopprijs = Verkoopprijs;
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

    public Omschrijving getProductBeschrijvingOmschrijving() {
        return ProductBeschrijvingOmschrijving;
    }

    public void setProductBeschrijvingOmschrijving(Omschrijving ProductBeschrijvingOmschrijving) {
        this.ProductBeschrijvingOmschrijving = ProductBeschrijvingOmschrijving;
    }

    public Omschrijving getGebruiksaanwijzingOmschrijving() {
        return GebruiksaanwijzingOmschrijving;
    }

    public void setGebruiksaanwijzingOmschrijving(Omschrijving GebruiksaanwijzingOmschrijving) {
        this.GebruiksaanwijzingOmschrijving = GebruiksaanwijzingOmschrijving;
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

    public Omschrijving getIngrediëntenOmschrijving() {
        return IngrediëntenOmschrijving;
    }

    public void setIngrediëntenOmschrijving(Omschrijving IngrediëntenOmschrijving) {
        this.IngrediëntenOmschrijving = IngrediëntenOmschrijving;
    }

    public List<GoedgekeurdeIngave> getGoedgekeurdeIngaves() {
        return GoedgekeurdeIngaves;
    }

    public void setGoedgekeurdeIngaves(List<GoedgekeurdeIngave> GoedgekeurdeIngaves) {
        this.GoedgekeurdeIngaves = GoedgekeurdeIngaves;
    }

    public List<AankoopProductVerkoopProduct> getVerkoopProductAankoopProduct() {
        return VerkoopProductAankoopProduct;
    }

    public void setVerkoopProductAankoopProduct(List<AankoopProductVerkoopProduct> VerkoopProductAankoopProduct) {
        this.VerkoopProductAankoopProduct = VerkoopProductAankoopProduct;
    }

    public List<VerkoopProductBasisRecept> getVerkoopProductBasisRecepten() {
        return VerkoopProductBasisRecepten;
    }

    public void setVerkoopProductBasisRecepten(List<VerkoopProductBasisRecept> VerkoopProductBasisRecepten) {
        this.VerkoopProductBasisRecepten = VerkoopProductBasisRecepten;
    }

    public List<VerkoopProductTaak> getVerkoopProductTaken() {
        return VerkoopProductTaken;
    }

    public void setVerkoopProductTaken(List<VerkoopProductTaak> VerkoopProductTaken) {
        this.VerkoopProductTaken = VerkoopProductTaken;
    }

    public List<VerkoopProductMaterieel> getVerkoopProductMaterielen() {
        return VerkoopProductMaterielen;
    }

    public void setVerkoopProductMaterielen(List<VerkoopProductMaterieel> VerkoopProductMaterielen) {
        this.VerkoopProductMaterielen = VerkoopProductMaterielen;
    }

    
    @Override
    public void setId(int id) {
        this.VerkoopProductId = id;
    }

    @Override
    public int getId() {
        return this.VerkoopProductId;
    }

}
