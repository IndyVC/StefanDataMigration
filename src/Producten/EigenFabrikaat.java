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
import New.New;
import Old.Bewaarconditie;
import Old.Etiket.Etiket;
import Old.Product.Productiegroep;
import Old.Recept.Receptgroep;
import Old.Verkoopsverpakking;
import Producten.Recepten.Job;
import Voorraden.BewaarTemperatuur;
import Voorraden.VoorraadPlaats;
import Voorraden.VoorraadProduct;
import enums.Eenheid;

/**
 *
 * @author stefa
 */
public class EigenFabrikaat implements New{

    public int ExterneCode;
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
    public Etiket VoorraadEtiket;
    public int EenhedenPerEtiket;
    public Etiket VerdeelEtiket;
    public Bewaarconditie Bewaarconditie;
    public BewaarTemperatuur BewaarTemperatuur;
    public int MinimumAantalDagenHoudbaar;
    public Omschrijving Bereidingswijze;
    public String Foto;
    public ExcelLocatie ExcelLocatie;
    public VoorstellingOpProductielijst VoorstellingOpProductielijst;
    public boolean ReceptWijzigbaar;
    public Job Job;
    public Verkoopsverpakking Verkoopsverpakking;
    public VasteKost VasteKost;
    public OnrechtstreekseKost OnrechtstreekseKost;
    public boolean Blokkeren;
    public String PerPersoonAlsString;

    public EigenFabrikaat() {
    }

    public EigenFabrikaat(int ExterneCode, Omschrijving Omschrijving, Productiegroep Productiegroep, Receptgroep Receptgroep, Eenheid Recepteenheid, boolean MoetGewogenWorden, double MaximumWeeggewicht, double RelatieveMarge, double AbsoluteMarge, double BasiskostPerEenheid, double Eenheidsgewicht, Eenheid GewichtEenheid, boolean Goedgekeurd, boolean DagProductie, VoorraadProduct VoorraadProduct, VoorraadPlaats Voorraadplaats, String ExtraVermeldingVoorraadPlaats, double MinimumVoorraad, double MaximumVoorraad, boolean EtiketAfdrukken, Etiket VoorraadEtiket, int EenhedenPerEtiket, Etiket VerdeelEtiket, Bewaarconditie Bewaarconditie, BewaarTemperatuur BewaarTemperatuur, int MinimumAantalDagenHoudbaar, Omschrijving Bereidingswijze, String Foto, ExcelLocatie ExcelLocatie, VoorstellingOpProductielijst VoorstellingOpProductielijst, boolean ReceptWijzigbaar, Job Job, Verkoopsverpakking Verkoopsverpakking, VasteKost VasteKost, OnrechtstreekseKost OnrechtstreekseKost, boolean Blokkeren, String PerPersoonAlsString) {
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
        this.VoorraadEtiket = VoorraadEtiket;
        this.EenhedenPerEtiket = EenhedenPerEtiket;
        this.VerdeelEtiket = VerdeelEtiket;
        this.Bewaarconditie = Bewaarconditie;
        this.BewaarTemperatuur = BewaarTemperatuur;
        this.MinimumAantalDagenHoudbaar = MinimumAantalDagenHoudbaar;
        this.Bereidingswijze = Bereidingswijze;
        this.Foto = Foto;
        this.ExcelLocatie = ExcelLocatie;
        this.VoorstellingOpProductielijst = VoorstellingOpProductielijst;
        this.ReceptWijzigbaar = ReceptWijzigbaar;
        this.Job = Job;
        this.Verkoopsverpakking = Verkoopsverpakking;
        this.VasteKost = VasteKost;
        this.OnrechtstreekseKost = OnrechtstreekseKost;
        this.Blokkeren = Blokkeren;
        this.PerPersoonAlsString = PerPersoonAlsString;
    }

    public int getExterneCode() {
        return ExterneCode;
    }

    public void setExterneCode(int ExterneCode) {
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

    public Etiket getVoorraadEtiket() {
        return VoorraadEtiket;
    }

    public void setVoorraadEtiket(Etiket VoorraadEtiket) {
        this.VoorraadEtiket = VoorraadEtiket;
    }

    public int getEenhedenPerEtiket() {
        return EenhedenPerEtiket;
    }

    public void setEenhedenPerEtiket(int EenhedenPerEtiket) {
        this.EenhedenPerEtiket = EenhedenPerEtiket;
    }

    public Etiket getVerdeelEtiket() {
        return VerdeelEtiket;
    }

    public void setVerdeelEtiket(Etiket VerdeelEtiket) {
        this.VerdeelEtiket = VerdeelEtiket;
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

    public Omschrijving getBereidingswijze() {
        return Bereidingswijze;
    }

    public void setBereidingswijze(Omschrijving Bereidingswijze) {
        this.Bereidingswijze = Bereidingswijze;
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

    public String getPerPersoonAlsString() {
        return PerPersoonAlsString;
    }

    public void setPerPersoonAlsString(String PerPersoonAlsString) {
        this.PerPersoonAlsString = PerPersoonAlsString;
    }

    @Override
    public void setId(int id) {
        this.ExterneCode=id;
    }
     @Override
    public int getId() {
        return this.ExterneCode;
    }
    

}
