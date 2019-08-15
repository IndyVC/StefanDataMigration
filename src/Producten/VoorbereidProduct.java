/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.ExcelLocatie;
import Algemeen.Omschrijving;
import Boekhouding.OnrechtstreekseKost;
import Boekhouding.VasteKost;
import Materialen.Etiket;
import Materialen.Materieel;
import New.New;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Job;
import Producten.Recepten.Receptgroep;
import Producten.Recepten.Taak;
import TussenTabellen.VoorbereidProductBasisRecept;
import TussenTabellen.VoorbereidProductMaterieel;
import TussenTabellen.VoorbereidProductTaak;
import Voorraden.BewaarTemperatuur;
import Voorraden.Bewaarconditie;
import Voorraden.VoorraadPlaats;
import Voorraden.VoorraadProduct;
import enums.Eenheid;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class VoorbereidProduct implements New {

    public int VoorbereidProductId;
    public String AantalPersonen;
    public String ExterneCode;
    public Omschrijving Omschrijving;
    public Productiegroep Productiegroep;
    public Receptgroep Receptgroep;
    public Eenheid Recepteenheid;
    public boolean MoetGewogenWorden;
    public double MaximumWeeggewicht;
    public double RelatieveMarge;
    public double AbsoluteMarge;
    public double BasiskostPerEenheid;
    public double Eenheidsgewicht;
    public Eenheid GewichtEenheid;
    public boolean Goedgekeurd;
    public boolean DagProductie;
    public VoorraadProduct VoorraadProduct;
    public VoorraadPlaats Voorraadplaats;
    public String ExtraVermeldingVoorraadPlaats;
    public double MinimumVoorraad;
    public double MaximumVoorraad;
    public boolean EtiketAfdrukken;
    public Etiket VoorraadEtiketEtiket;
    public int EenhedenPerEtiket;
    public Etiket VerdeelEtiketEtiket;
    public Bewaarconditie Bewaarconditie;
    public BewaarTemperatuur BewaarTemperatuur;
    public int MinimumAantalDagenHoudbaar;
    public Omschrijving BereidingswijzeOmschrijving;
    public String Foto;
    public ExcelLocatie ExcelLocatie;
    public VoorstellingOpProductielijst VoorstellingOpProductielijst;
    public boolean ReceptWijzigbaar;
    public Job Job;
    public Verkoopsverpakking Verkoopsverpakking;
    public VasteKost VasteKost;
    public OnrechtstreekseKost OnrechtstreekseKost;
    public boolean Blokkeren;

       
    public List<VoorbereidProductBasisRecept> VoorbereidProductBasisRecepten;
    public List<VoorbereidProductTaak> VoorbereidProductTaken;
    public List<VoorbereidProductMaterieel> VoorbereidProductMaterielen;
    
    public VoorbereidProduct() {
        VoorbereidProductBasisRecepten = new ArrayList();
        VoorbereidProductTaken = new ArrayList();
        VoorbereidProductMaterielen = new ArrayList();
    }

    public VoorbereidProduct(int VoorbereidProductId, String AantalPersonen, String ExterneCode, Omschrijving Omschrijving, Productiegroep Productiegroep, Receptgroep Receptgroep, Eenheid Recepteenheid, Boolean MoetGewogenWorden, double MaximumWeeggewicht, double RelatieveMarge, double AbsoluteMarge, double BasiskostPerEenheid, double Eenheidsgewicht, Eenheid GewichtEenheid, Boolean Goedgekeurd, Boolean DagProductie, VoorraadProduct VoorraadProduct, VoorraadPlaats Voorraadplaats, String ExtraVermeldingVoorraadPlaats, double MinimumVoorraad, double MaximumVoorraad, Boolean EtiketAfdrukken, Etiket VoorraadEtiket, int EenhedenPerEtiket, Etiket VerdeelEtiket, Bewaarconditie Bewaarconditie, BewaarTemperatuur BewaarTemperatuur, int MinimumAantalDagenHoudbaar, Omschrijving Bereidingswijze, String Foto, ExcelLocatie ExcelLocatie, VoorstellingOpProductielijst VoorstellingOpProductielijst, Boolean ReceptWijzigbaar, Job Job, Verkoopsverpakking Verkoopsverpakking, VasteKost VasteKost, OnrechtstreekseKost OnrechtstreekseKost, Boolean Blokkeren) {
        this();
        this.VoorbereidProductId = VoorbereidProductId;
        this.AantalPersonen = AantalPersonen;
        this.ExterneCode = ExterneCode;
        this.Omschrijving = Omschrijving;
        this.Productiegroep = Productiegroep;
        this.Receptgroep = Receptgroep;
        this.Recepteenheid = Recepteenheid;
        this.MoetGewogenWorden = MoetGewogenWorden;
        this.MaximumWeeggewicht = MaximumWeeggewicht;
        this.RelatieveMarge = RelatieveMarge;
        this.AbsoluteMarge = AbsoluteMarge;
        this.BasiskostPerEenheid = BasiskostPerEenheid;
        this.Eenheidsgewicht = Eenheidsgewicht;
        this.GewichtEenheid = GewichtEenheid;
        this.Goedgekeurd = Goedgekeurd;
        this.DagProductie = DagProductie;
        this.VoorraadProduct = VoorraadProduct;
        this.Voorraadplaats = Voorraadplaats;
        this.ExtraVermeldingVoorraadPlaats = ExtraVermeldingVoorraadPlaats;
        this.MinimumVoorraad = MinimumVoorraad;
        this.MaximumVoorraad = MaximumVoorraad;
        this.EtiketAfdrukken = EtiketAfdrukken;
        this.VoorraadEtiketEtiket = VoorraadEtiket;
        this.EenhedenPerEtiket = EenhedenPerEtiket;
        this.VerdeelEtiketEtiket = VerdeelEtiket;
        this.Bewaarconditie = Bewaarconditie;
        this.BewaarTemperatuur = BewaarTemperatuur;
        this.MinimumAantalDagenHoudbaar = MinimumAantalDagenHoudbaar;
        this.BereidingswijzeOmschrijving = Bereidingswijze;
        this.Foto = Foto;
        this.ExcelLocatie = ExcelLocatie;
        this.VoorstellingOpProductielijst = VoorstellingOpProductielijst;
        this.ReceptWijzigbaar = ReceptWijzigbaar;
        this.Job = Job;
        this.Verkoopsverpakking = Verkoopsverpakking;
        this.VasteKost = VasteKost;
        this.OnrechtstreekseKost = OnrechtstreekseKost;
        this.Blokkeren = Blokkeren;

    }

    public int getVoorbereidProductId() {
        return VoorbereidProductId;
    }

    public void setVoorbereidProductId(int VoorbereidProductId) {
        this.VoorbereidProductId = VoorbereidProductId;
    }

    public String getAantalPersonen() {
        return AantalPersonen;
    }

    public void setAantalPersonen(String AantalPersonen) {
        this.AantalPersonen = AantalPersonen;
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

    public double getBasiskostPerEenheid() {
        return BasiskostPerEenheid;
    }

    public void setBasiskostPerEenheid(double BasiskostPerEenheid) {
        this.BasiskostPerEenheid = BasiskostPerEenheid;
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

    public VoorraadPlaats getVoorraadplaats() {
        return Voorraadplaats;
    }

    public void setVoorraadplaats(VoorraadPlaats Voorraadplaats) {
        this.Voorraadplaats = Voorraadplaats;
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

    public Bewaarconditie getBewaarconditie() {
        return Bewaarconditie;
    }

    public void setBewaarconditie(Bewaarconditie Bewaarconditie) {
        this.Bewaarconditie = Bewaarconditie;
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

    public Verkoopsverpakking getVerkoopsverpakking() {
        return Verkoopsverpakking;
    }

    public void setVerkoopsverpakking(Verkoopsverpakking Verkoopsverpakking) {
        this.Verkoopsverpakking = Verkoopsverpakking;
    }

    public VasteKost getVasteKost() {
        return VasteKost;
    }

    public void setVasteKost(VasteKost VasteKost) {
        this.VasteKost = VasteKost;
    }

    public OnrechtstreekseKost getOnrechtstreekseKost() {
        return OnrechtstreekseKost;
    }

    public void setOnrechtstreekseKost(OnrechtstreekseKost OnrechtstreekseKost) {
        this.OnrechtstreekseKost = OnrechtstreekseKost;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public List<VoorbereidProductBasisRecept> getVoorbereidProductBasisRecepten() {
        return VoorbereidProductBasisRecepten;
    }

    public void setVoorbereidProductBasisRecepten(List<VoorbereidProductBasisRecept> VoorbereidProductBasisRecepten) {
        this.VoorbereidProductBasisRecepten = VoorbereidProductBasisRecepten;
    }

    public List<VoorbereidProductTaak> getVoorbereidProductTaken() {
        return VoorbereidProductTaken;
    }

    public void setVoorbereidProductTaken(List<VoorbereidProductTaak> VoorbereidProductTaken) {
        this.VoorbereidProductTaken = VoorbereidProductTaken;
    }

    public List<VoorbereidProductMaterieel> getVoorbereidProductMaterielen() {
        return VoorbereidProductMaterielen;
    }

    public void setVoorbereidProductMaterielen(List<VoorbereidProductMaterieel> VoorbereidProductMaterielen) {
        this.VoorbereidProductMaterielen = VoorbereidProductMaterielen;
    }

    



    @Override
    public void setId(int id) {
        this.VoorbereidProductId = id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductId;
    }

}
