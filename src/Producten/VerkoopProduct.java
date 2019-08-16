/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.ExcelLocatie;
import java.sql.Date;

import Algemeen.Omschrijving;
import Bedrijven.PrivateLabel;
import Boekhouding.BTWPercentage;
import Boekhouding.OnrechtstreekseKost;
import Boekhouding.VasteKost;
import Boekhouding.Winstmarge;
import Materialen.BarcodePrefix;
import Materialen.Etiket;
import Materialen.Verpakking;
import New.New;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Job;
import Producten.Recepten.Receptgroep;
import Producten.Recepten.Taak;
import Tracering.LotnummerAanbrenger;
import Tracering.LotnummerDrager;
import Tracering.LotnummerType;
import TussenTabellen.AankoopProductVerkoopProduct;
import TussenTabellen.VerkoopProductBasisRecept;
import TussenTabellen.VerkoopProductMaterieel;
import TussenTabellen.VerkoopProductTaak;
import Voorraden.BewaarTemperatuur;
import Voorraden.Bewaarconditie;
import Voorraden.VoorraadPlaats;
import Voorraden.VoorraadProduct;
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
    public VerpakkingsEenheid PrimaireVerpakking;
    public VerpakkingsEenheid SecundaireVerpakking;
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
    public String ExterneCode;
    public Omschrijving Omschrijving;
    public Productiegroep Productiegroep;
    public Receptgroep Receptgroep;
    public Eenheid Recepteenheid;
    public boolean MoetGewogenWorden;
    public double MaximumWeeggewicht;
    public double RelatieveMarge;
    public double AbsoluteMarge;
    public double BasisKostPerEenheid;
    public double Eenheidsgewicht;
    public Eenheid GewichtEenheid;
    public boolean Goedgekeurd;
    public boolean DagProductie;
    public VoorraadProduct VoorraadProduct;
    public VoorraadPlaats VoorraadPlaats;
    public String ExtraVermeldingVoorraadPlaats;
    public double MinimumVoorraad;
    public double MaximumVoorraad;
    public boolean EtiketAfdrukken;
    public Etiket VoorraadEtiketEtiket;
    public int EenhedenPerEtiket;
    public Etiket VerdeelEtiketEtiket;
    public Bewaarconditie BewaarConditie;
    public BewaarTemperatuur BewaarTemperatuur;
    public int MinimumAantalDagenHoudbaar;
    public Omschrijving BereidingswijzeOmschrijving;
    public String Foto;
    public ExcelLocatie ExcelLocatie;
    public VoorstellingOpProductielijst VoorstellingOpProductielijst;
    public boolean ReceptWijzigbaar;
    public Job Job;
    public Verkoopsverpakking VerkoopsVerpakking;
    public boolean Blokkeren;
    public OnrechtstreekseKost OnrechtstreekseKost;
    public VasteKost VasteKost;

    
    public List<GoedgekeurdeIngave> GoedgekeurdeIngaves;
    public List<AankoopProductVerkoopProduct> VerkoopProductAankoopProduct;

    public List<VerkoopProductBasisRecept> VerkoopProductBasisRecepten;
    public List<VerkoopProductTaak> VerkoopProductTaken;
    public List<VerkoopProductMaterieel> VerkoopProductMaterielen;
     
    public VerkoopProduct() {
    }

    public VerkoopProduct(int verkoopProductid, String externeCode, Omschrijving omschrijving, Productiegroep productiegroep, Receptgroep receptgroep, Eenheid recepteenheid, boolean moetGewogenWorden, double maximumWeeggewicht,
            double relativeMarge, double absoluteMarge, double basiskostPerEenheid, double eenheidsgewicht, Eenheid gewichtEenheid, boolean goedgekeurd, boolean dagProductie, VoorraadProduct voorraadproduct, VoorraadPlaats voorraadplaats,
            String extraVermeldingVoorraadPlaats, double minimumVoorraad, double maximumVoorraad, boolean etiketAfdrukken, Etiket voorraadEtiket, int eenhedenPerEtiket, Etiket verdeelEtiket, Bewaarconditie bewaarconditie,
            BewaarTemperatuur bewaartemperatuur, int minimumAantalHoudbaar, Omschrijving bereidingswijze, String foto, ExcelLocatie excelLocatie, VoorstellingOpProductielijst voorstellingOpProductielijst, boolean receptWijzigbaar, Job job,
            Verkoopsverpakking verkoopsverpakking, VasteKost vasteKost, OnrechtstreekseKost onrechtstreekseKost, boolean blokkeren, boolean onlineBeschikbaar, Date onlineLaatstAangemaakt, String gelinktMetCode, VerkoopProductGroep verkoopProductGroep,
            BarcodePrefix barcodePrefix, PrivateLabel privateLabel, VerpakkingsEenheid primaireVerpakking, VerpakkingsEenheid secundaireVerpakking, int stuksPerVerpakking, VerkoopsBarcode verpakkingsBarcode, int verpakkingenPerColli,
            VerkoopsBarcode colliBarcode, int collisPerPallet, VerkoopsBarcode palletBarcode, Verkoopsverpakking vermeldingLeveringsbon, FysischeEigenschap gewicht, FysischeEigenschap hoogte, FysischeEigenschap lengte, FysischeEigenschap breedte,
            FysischeEigenschap diameter, Omschrijving kleur, Omschrijving afwerking, BTWPercentage btwPercentage, double verkoopprijs, Eenheid verkoopeenheid, VariantGroep variantGroep, OptieGroep optieGroep,
            MicrobiologischeParameter microBiologischeParameter, LotnummerType lotnummerType, LotnummerDrager lotnummerDrager, LotnummerAanbrenger lotnummerAanbrenger, Omschrijving productBeschrijving, Omschrijving gebruiksaanwijzing,
            Winstmarge winstMarge, DistributieWijze distributieWijze, Omschrijving ingrediënten) {

        this.ExterneCode = externeCode;
        this.Omschrijving = omschrijving;
        this.Productiegroep = productiegroep;
        this.Receptgroep = receptgroep;
        this.Recepteenheid = recepteenheid;
        this.MoetGewogenWorden = moetGewogenWorden;
        this.MaximumWeeggewicht = maximumWeeggewicht;
        this.RelatieveMarge = relativeMarge;
        this.AbsoluteMarge = absoluteMarge;
        this.BasisKostPerEenheid = basiskostPerEenheid;
        this.Eenheidsgewicht = eenheidsgewicht;
        this.GewichtEenheid = gewichtEenheid;
        this.Goedgekeurd = goedgekeurd;
        this.DagProductie = dagProductie;
        this.VoorraadProduct = voorraadproduct;
        this.VoorraadPlaats = voorraadplaats;
        this.ExtraVermeldingVoorraadPlaats = extraVermeldingVoorraadPlaats;
        this.MinimumVoorraad = minimumVoorraad;
        this.MaximumVoorraad = maximumVoorraad;
        this.EtiketAfdrukken = etiketAfdrukken;
        this.VoorraadEtiketEtiket = voorraadEtiket;
        this.EenhedenPerEtiket = eenhedenPerEtiket;
        this.VerdeelEtiketEtiket = verdeelEtiket;
        this.BewaarConditie = bewaarconditie;
        this.BewaarTemperatuur = bewaartemperatuur;
        this.MinimumAantalDagenHoudbaar = minimumAantalHoudbaar;
        this.BereidingswijzeOmschrijving = bereidingswijze;
        this.Foto = foto;
        this.ExcelLocatie = excelLocatie;
        this.VoorstellingOpProductielijst = voorstellingOpProductielijst;
        this.ReceptWijzigbaar = receptWijzigbaar;
        this.Job = job;
        this.VerkoopsVerpakking = verkoopsverpakking;
        this.VasteKost = vasteKost;
        this.OnrechtstreekseKost = onrechtstreekseKost;
        this.Blokkeren = blokkeren;
        this.VerkoopProductId = verkoopProductid;
        this.OnlineBeschikbaar = onlineBeschikbaar;
        this.OnlineLaatstAangemaakt = onlineLaatstAangemaakt;
        this.GelinktMetCode = gelinktMetCode;
        this.VerkoopProductGroep = verkoopProductGroep;
        this.BarcodePrefix = barcodePrefix;
        this.PrivateLabel = privateLabel;
        this.PrimaireVerpakking = primaireVerpakking;
        this.SecundaireVerpakking = secundaireVerpakking;
        this.StuksPerVerpakking = stuksPerVerpakking;
        this.VerpakkingsBarcodeVerkoopsBarcode = verpakkingsBarcode;
        this.VerpakkingenPerColli = verpakkingenPerColli;
        this.ColliBarcodeVerkoopsBarcode = colliBarcode;
        this.CollisPerPallet = collisPerPallet;
        this.PalletBarcodeVerkoopsBarcode = palletBarcode;
        this.VermeldingLeveringsbonVerkoopsverpakking = vermeldingLeveringsbon;
        this.GewichtFysischeEigenschap = gewicht;
        this.HoogteFysischeEigenschap = hoogte;
        this.LengteFysischeEigenschap = lengte;
        this.BreedteFysischeEigenschap = breedte;
        this.DiameterFysischeEigenschap = diameter;
        this.KleurOmschrijving = kleur;
        this.AfwerkingOmschrijving=afwerking;
        this.BTWpercentage = btwPercentage;
        this.Verkoopprijs = verkoopprijs;
        this.Verkoopeenheid = verkoopeenheid;
        this.VariantGroep = variantGroep;
        this.OptieGroep = optieGroep;
        this.MicroBiologischeParameter= microBiologischeParameter;
        this.LotnummerType=lotnummerType;
        this.LotnummerDrager = lotnummerDrager;
        this.LotnummerAanbrenger = lotnummerAanbrenger;
        this.ProductBeschrijvingOmschrijving = productBeschrijving;
        this.GebruiksaanwijzingOmschrijving=gebruiksaanwijzing;
        this.Winstmarge=winstMarge;
        this.DistributieWijze=distributieWijze;
        this.IngrediëntenOmschrijving=ingrediënten;

    }

    public String getExterneCode() {
        return ExterneCode;
    }

    public void setExterneCode(String ExterneCode) {
        this.ExterneCode = ExterneCode;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Productiegroep getProductiegroep() {
        return Productiegroep;
    }

    public void setProductiegroep(Productiegroep Productiegroep) {
        this.Productiegroep = Productiegroep;
    }

    public Receptgroep getReceptgroep() {
        return Receptgroep;
    }

    public void setReceptgroep(Receptgroep Receptgroep) {
        this.Receptgroep = Receptgroep;
    }

    public Eenheid getRecepteenheid() {
        return Recepteenheid;
    }

    public void setRecepteenheid(Eenheid Recepteenheid) {
        this.Recepteenheid = Recepteenheid;
    }

    public boolean isMoetGewogenWorden() {
        return MoetGewogenWorden;
    }

    public void setMoetGewogenWorden(boolean MoetGewogenWorden) {
        this.MoetGewogenWorden = MoetGewogenWorden;
    }

    public double getMaximumWeeggewicht() {
        return MaximumWeeggewicht;
    }

    public void setMaximumWeeggewicht(double MaximumWeeggewicht) {
        this.MaximumWeeggewicht = MaximumWeeggewicht;
    }

    public double getRelatieveMarge() {
        return RelatieveMarge;
    }

    public void setRelatieveMarge(double RelatieveMarge) {
        this.RelatieveMarge = RelatieveMarge;
    }

    public double getAbsoluteMarge() {
        return AbsoluteMarge;
    }

    public void setAbsoluteMarge(double AbsoluteMarge) {
        this.AbsoluteMarge = AbsoluteMarge;
    }

    public double getBasisKostPerEenheid() {
        return BasisKostPerEenheid;
    }

    public void setBasisKostPerEenheid(double BasisKostPerEenheid) {
        this.BasisKostPerEenheid = BasisKostPerEenheid;
    }

    public double getEenheidsgewicht() {
        return Eenheidsgewicht;
    }

    public void setEenheidsgewicht(double Eenheidsgewicht) {
        this.Eenheidsgewicht = Eenheidsgewicht;
    }

    public Eenheid getGewichtEenheid() {
        return GewichtEenheid;
    }

    public void setGewichtEenheid(Eenheid GewichtEenheid) {
        this.GewichtEenheid = GewichtEenheid;
    }

    public boolean isGoedgekeurd() {
        return Goedgekeurd;
    }

    public void setGoedgekeurd(boolean Goedgekeurd) {
        this.Goedgekeurd = Goedgekeurd;
    }

    public boolean isDagProductie() {
        return DagProductie;
    }

    public void setDagProductie(boolean DagProductie) {
        this.DagProductie = DagProductie;
    }

    public VoorraadProduct getVoorraadProduct() {
        return VoorraadProduct;
    }

    public void setVoorraadProduct(VoorraadProduct VoorraadProduct) {
        this.VoorraadProduct = VoorraadProduct;
    }

    public VoorraadPlaats getVoorraadPlaats() {
        return VoorraadPlaats;
    }

    public void setVoorraadPlaats(VoorraadPlaats VoorraadPlaats) {
        this.VoorraadPlaats = VoorraadPlaats;
    }

    public String getExtraVermeldingVoorraadPlaats() {
        return ExtraVermeldingVoorraadPlaats;
    }

    public void setExtraVermeldingVoorraadPlaats(String ExtraVermeldingVoorraadPlaats) {
        this.ExtraVermeldingVoorraadPlaats = ExtraVermeldingVoorraadPlaats;
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

    public boolean isEtiketAfdrukken() {
        return EtiketAfdrukken;
    }

    public void setEtiketAfdrukken(boolean EtiketAfdrukken) {
        this.EtiketAfdrukken = EtiketAfdrukken;
    }

    public Etiket getVoorraadEtiketEtiket() {
        return VoorraadEtiketEtiket;
    }

    public void setVoorraadEtiketEtiket(Etiket VoorraadEtiketEtiket) {
        this.VoorraadEtiketEtiket = VoorraadEtiketEtiket;
    }

    public int getEenhedenPerEtiket() {
        return EenhedenPerEtiket;
    }

    public void setEenhedenPerEtiket(int EenhedenPerEtiket) {
        this.EenhedenPerEtiket = EenhedenPerEtiket;
    }

    public Etiket getVerdeelEtiketEtiket() {
        return VerdeelEtiketEtiket;
    }

    public void setVerdeelEtiketEtiket(Etiket VerdeelEtiketEtiket) {
        this.VerdeelEtiketEtiket = VerdeelEtiketEtiket;
    }

    public Bewaarconditie getBewaarConditie() {
        return BewaarConditie;
    }

    public void setBewaarConditie(Bewaarconditie BewaarConditie) {
        this.BewaarConditie = BewaarConditie;
    }

    public BewaarTemperatuur getBewaarTemperatuur() {
        return BewaarTemperatuur;
    }

    public void setBewaarTemperatuur(BewaarTemperatuur BewaarTemperatuur) {
        this.BewaarTemperatuur = BewaarTemperatuur;
    }

    public int getMinimumAantalDagenHoudbaar() {
        return MinimumAantalDagenHoudbaar;
    }

    public void setMinimumAantalDagenHoudbaar(int MinimumAantalDagenHoudbaar) {
        this.MinimumAantalDagenHoudbaar = MinimumAantalDagenHoudbaar;
    }

    public Omschrijving getBereidingswijzeOmschrijving() {
        return BereidingswijzeOmschrijving;
    }

    public void setBereidingswijzeOmschrijving(Omschrijving BereidingswijzeOmschrijving) {
        this.BereidingswijzeOmschrijving = BereidingswijzeOmschrijving;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public ExcelLocatie getExcelLocatie() {
        return ExcelLocatie;
    }

    public void setExcelLocatie(ExcelLocatie ExcelLocatie) {
        this.ExcelLocatie = ExcelLocatie;
    }

    public VoorstellingOpProductielijst getVoorstellingOpProductielijst() {
        return VoorstellingOpProductielijst;
    }

    public void setVoorstellingOpProductielijst(VoorstellingOpProductielijst VoorstellingOpProductielijst) {
        this.VoorstellingOpProductielijst = VoorstellingOpProductielijst;
    }

    public boolean isReceptWijzigbaar() {
        return ReceptWijzigbaar;
    }

    public void setReceptWijzigbaar(boolean ReceptWijzigbaar) {
        this.ReceptWijzigbaar = ReceptWijzigbaar;
    }

    public Job getJob() {
        return Job;
    }

    public void setJob(Job Job) {
        this.Job = Job;
    }

    public Verkoopsverpakking getVerkoopsVerpakking() {
        return VerkoopsVerpakking;
    }

    public void setVerkoopsVerpakking(Verkoopsverpakking VerkoopsVerpakking) {
        this.VerkoopsVerpakking = VerkoopsVerpakking;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public OnrechtstreekseKost getOnrechtstreekseKost() {
        return OnrechtstreekseKost;
    }

    public void setOnrechtstreekseKost(OnrechtstreekseKost OnrechtstreekseKost) {
        this.OnrechtstreekseKost = OnrechtstreekseKost;
    }

    public VasteKost getVasteKost() {
        return VasteKost;
    }

    public void setVasteKost(VasteKost VasteKost) {
        this.VasteKost = VasteKost;
    }

    
    public VerpakkingsEenheid getPrimaireVerpakking() {
        return PrimaireVerpakking;
    }

    public void setPrimaireVerpakking(VerpakkingsEenheid PrimaireVerpakking) {
        this.PrimaireVerpakking = PrimaireVerpakking;
    }

    public VerpakkingsEenheid getSecundaireVerpakking() {
        return SecundaireVerpakking;
    }

    public void setSecundaireVerpakking(VerpakkingsEenheid SecundaireVerpakking) {
        this.SecundaireVerpakking = SecundaireVerpakking;
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
