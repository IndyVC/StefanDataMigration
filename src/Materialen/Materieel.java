/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import Old.Leverancier;
import Producten.AfgewerktProduct;
import Producten.BasisProduct;
import Producten.ReceptProduct;
import Producten.VerkoopProduct;
import Producten.VoorbereidProduct;
import TussenTabellen.AfgewerktProductMaterieel;
import TussenTabellen.BasisProductMaterieel;
import TussenTabellen.ReceptProductMaterieel;
import TussenTabellen.VerkoopProductMaterieel;
import TussenTabellen.VoorbereidProductMaterieel;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Materieel implements New{

    public int MaterieelId;
    public Materieelgroep Materieelgroep;

    public boolean MoetGekeurdWorden;

    public Date LaatsteKeuring;
    public Date VolgendeKeuring;

    public Omschrijving Omschrijving;

    public Leverancier Leverancier;

    public String GebruiksaanwijzingBestand;

    public String VeiligheidsficheBestand;

    public String TechnischeKeuringBestand;

    public String OnderhoudsschemaBestand;

    public String IngebruikstellingBestand;

    public String Foto;

    public boolean Blokkeren;

    public String Gebruiksaanwijzing;

    public String Veiligheidsfiche;

    public Onderhoud Onderhoud;
    public List<BasisProductMaterieel> MaterieelBasisProducten;
    public List<BasisProduct> BasisProducten;
    public List<AfgewerktProductMaterieel> MaterieelAfgewerktProducten;
    public List<AfgewerktProduct> AfgewerkteProducten;
    public List<VerkoopProductMaterieel> MaterieelVerkoopProducten;
    public List<VerkoopProduct> VerkoopProducten;
    public List<VoorbereidProductMaterieel> MaterieelVoorbereidProducten;
    public List<VoorbereidProduct> VoorbereidProducten;
    public List<ReceptProductMaterieel> MaterieelReceptProducten;
    public List<ReceptProduct> ReceptProducten;

    public Materieel() {
    }

    public Materieel(int MaterieelId, Materieelgroep Materieelgroep, boolean MoetGekeurdWorden, Date LaatsteKeuring, Date VolgendeKeuring, Omschrijving Omschrijving, Leverancier Leverancier, String GebruiksaanwijzingBestand, String VeiligheidsficheBestand, String TechnischeKeuringBestand, String OnderhoudsschemaBestand, String IngebruikstellingBestand, String Foto, boolean Blokkeren, String Gebruiksaanwijzing, String Veiligheidsfiche, Onderhoud Onderhoud, List<BasisProductMaterieel> MaterieelBasisProducten, List<BasisProduct> BasisProducten, List<AfgewerktProductMaterieel> MaterieelAfgewerktProducten, List<AfgewerktProduct> AfgewerkteProducten, List<VerkoopProductMaterieel> MaterieelVerkoopProducten, List<VerkoopProduct> VerkoopProducten, List<VoorbereidProductMaterieel> MaterieelVoorbereidProducten, List<VoorbereidProduct> VoorbereidProducten, List<ReceptProductMaterieel> MaterieelReceptProducten, List<ReceptProduct> ReceptProducten) {
        this.MaterieelId = MaterieelId;
        this.Materieelgroep = Materieelgroep;
        this.MoetGekeurdWorden = MoetGekeurdWorden;
        this.LaatsteKeuring = LaatsteKeuring;
        this.VolgendeKeuring = VolgendeKeuring;
        this.Omschrijving = Omschrijving;
        this.Leverancier = Leverancier;
        this.GebruiksaanwijzingBestand = GebruiksaanwijzingBestand;
        this.VeiligheidsficheBestand = VeiligheidsficheBestand;
        this.TechnischeKeuringBestand = TechnischeKeuringBestand;
        this.OnderhoudsschemaBestand = OnderhoudsschemaBestand;
        this.IngebruikstellingBestand = IngebruikstellingBestand;
        this.Foto = Foto;
        this.Blokkeren = Blokkeren;
        this.Gebruiksaanwijzing = Gebruiksaanwijzing;
        this.Veiligheidsfiche = Veiligheidsfiche;
        this.Onderhoud = Onderhoud;
        this.MaterieelBasisProducten = MaterieelBasisProducten;
        this.BasisProducten = BasisProducten;
        this.MaterieelAfgewerktProducten = MaterieelAfgewerktProducten;
        this.AfgewerkteProducten = AfgewerkteProducten;
        this.MaterieelVerkoopProducten = MaterieelVerkoopProducten;
        this.VerkoopProducten = VerkoopProducten;
        this.MaterieelVoorbereidProducten = MaterieelVoorbereidProducten;
        this.VoorbereidProducten = VoorbereidProducten;
        this.MaterieelReceptProducten = MaterieelReceptProducten;
        this.ReceptProducten = ReceptProducten;
    }

    public int getMaterieelId() {
        return MaterieelId;
    }

    public void setMaterieelId(int MaterieelId) {
        this.MaterieelId = MaterieelId;
    }

    public Materieelgroep getMaterieelgroep() {
        return Materieelgroep;
    }

    public void setMaterieelgroep(Materieelgroep Materieelgroep) {
        this.Materieelgroep = Materieelgroep;
    }

    public boolean isMoetGekeurdWorden() {
        return MoetGekeurdWorden;
    }

    public void setMoetGekeurdWorden(boolean MoetGekeurdWorden) {
        this.MoetGekeurdWorden = MoetGekeurdWorden;
    }

    public Date getLaatsteKeuring() {
        return LaatsteKeuring;
    }

    public void setLaatsteKeuring(Date LaatsteKeuring) {
        this.LaatsteKeuring = LaatsteKeuring;
    }

    public Date getVolgendeKeuring() {
        return VolgendeKeuring;
    }

    public void setVolgendeKeuring(Date VolgendeKeuring) {
        this.VolgendeKeuring = VolgendeKeuring;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Leverancier getLeverancier() {
        return Leverancier;
    }

    public void setLeverancier(Leverancier Leverancier) {
        this.Leverancier = Leverancier;
    }

    public String getGebruiksaanwijzingBestand() {
        return GebruiksaanwijzingBestand;
    }

    public void setGebruiksaanwijzingBestand(String GebruiksaanwijzingBestand) {
        this.GebruiksaanwijzingBestand = GebruiksaanwijzingBestand;
    }

    public String getVeiligheidsficheBestand() {
        return VeiligheidsficheBestand;
    }

    public void setVeiligheidsficheBestand(String VeiligheidsficheBestand) {
        this.VeiligheidsficheBestand = VeiligheidsficheBestand;
    }

    public String getTechnischeKeuringBestand() {
        return TechnischeKeuringBestand;
    }

    public void setTechnischeKeuringBestand(String TechnischeKeuringBestand) {
        this.TechnischeKeuringBestand = TechnischeKeuringBestand;
    }

    public String getOnderhoudsschemaBestand() {
        return OnderhoudsschemaBestand;
    }

    public void setOnderhoudsschemaBestand(String OnderhoudsschemaBestand) {
        this.OnderhoudsschemaBestand = OnderhoudsschemaBestand;
    }

    public String getIngebruikstellingBestand() {
        return IngebruikstellingBestand;
    }

    public void setIngebruikstellingBestand(String IngebruikstellingBestand) {
        this.IngebruikstellingBestand = IngebruikstellingBestand;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public String getGebruiksaanwijzing() {
        return Gebruiksaanwijzing;
    }

    public void setGebruiksaanwijzing(String Gebruiksaanwijzing) {
        this.Gebruiksaanwijzing = Gebruiksaanwijzing;
    }

    public String getVeiligheidsfiche() {
        return Veiligheidsfiche;
    }

    public void setVeiligheidsfiche(String Veiligheidsfiche) {
        this.Veiligheidsfiche = Veiligheidsfiche;
    }

    public Onderhoud getOnderhoud() {
        return Onderhoud;
    }

    public void setOnderhoud(Onderhoud Onderhoud) {
        this.Onderhoud = Onderhoud;
    }

    public List<BasisProductMaterieel> getMaterieelBasisProducten() {
        return MaterieelBasisProducten;
    }

    public void setMaterieelBasisProducten(List<BasisProductMaterieel> MaterieelBasisProducten) {
        this.MaterieelBasisProducten = MaterieelBasisProducten;
    }

    public List<BasisProduct> getBasisProducten() {
        return BasisProducten;
    }

    public void setBasisProducten(List<BasisProduct> BasisProducten) {
        this.BasisProducten = BasisProducten;
    }

    public List<AfgewerktProductMaterieel> getMaterieelAfgewerktProducten() {
        return MaterieelAfgewerktProducten;
    }

    public void setMaterieelAfgewerktProducten(List<AfgewerktProductMaterieel> MaterieelAfgewerktProducten) {
        this.MaterieelAfgewerktProducten = MaterieelAfgewerktProducten;
    }

    public List<AfgewerktProduct> getAfgewerkteProducten() {
        return AfgewerkteProducten;
    }

    public void setAfgewerkteProducten(List<AfgewerktProduct> AfgewerkteProducten) {
        this.AfgewerkteProducten = AfgewerkteProducten;
    }

    public List<VerkoopProductMaterieel> getMaterieelVerkoopProducten() {
        return MaterieelVerkoopProducten;
    }

    public void setMaterieelVerkoopProducten(List<VerkoopProductMaterieel> MaterieelVerkoopProducten) {
        this.MaterieelVerkoopProducten = MaterieelVerkoopProducten;
    }

    public List<VerkoopProduct> getVerkoopProducten() {
        return VerkoopProducten;
    }

    public void setVerkoopProducten(List<VerkoopProduct> VerkoopProducten) {
        this.VerkoopProducten = VerkoopProducten;
    }

    public List<VoorbereidProductMaterieel> getMaterieelVoorbereidProducten() {
        return MaterieelVoorbereidProducten;
    }

    public void setMaterieelVoorbereidProducten(List<VoorbereidProductMaterieel> MaterieelVoorbereidProducten) {
        this.MaterieelVoorbereidProducten = MaterieelVoorbereidProducten;
    }

    public List<VoorbereidProduct> getVoorbereidProducten() {
        return VoorbereidProducten;
    }

    public void setVoorbereidProducten(List<VoorbereidProduct> VoorbereidProducten) {
        this.VoorbereidProducten = VoorbereidProducten;
    }

    public List<ReceptProductMaterieel> getMaterieelReceptProducten() {
        return MaterieelReceptProducten;
    }

    public void setMaterieelReceptProducten(List<ReceptProductMaterieel> MaterieelReceptProducten) {
        this.MaterieelReceptProducten = MaterieelReceptProducten;
    }

    public List<ReceptProduct> getReceptProducten() {
        return ReceptProducten;
    }

    public void setReceptProducten(List<ReceptProduct> ReceptProducten) {
        this.ReceptProducten = ReceptProducten;
    }

    @Override
    public void setId(int id) {
        this.MaterieelId=id;
    }
    
     @Override
    public int getId() {
        return this.MaterieelId;
    }

}