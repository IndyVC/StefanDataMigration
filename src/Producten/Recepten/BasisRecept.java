/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;

import Algemeen.Omschrijving;
import New.New;
import Producten.AfgewerktProduct;
import Producten.BasisProduct;
import Producten.ReceptProduct;
import Producten.VerkoopProduct;
import Producten.VoorbereidProduct;
import TussenTabellen.AfgewerktProductBasisRecept;
import TussenTabellen.BasisProductBasisRecept;
import TussenTabellen.ReceptProductBasisRecept;
import TussenTabellen.VerkoopProductBasisRecept;
import TussenTabellen.VoorbereidProductBasisRecept;
import java.util.List;

/**
 *
 * @author stefa
 */
public class BasisRecept implements New{

    public int BasisReceptId;

    public Omschrijving Omschrijving;
    public int Hoeveelheid;
    public double Percentage;
    public int Volgnummer;
    public String Hulpstof;
    public String Telbasis;
    public int AantalPersonen;

    public List<BasisProductBasisRecept> BasisReceptBasisProducten;
    public List<BasisProduct> BasisProducten;
    public List<AfgewerktProductBasisRecept> BasisReceptAfgewerkteProducten;
    public List<AfgewerktProduct> AfgewerktProducten;
    public List<VerkoopProductBasisRecept> BasisReceptverkoopProducten;
    public List<VerkoopProduct> VerkoopProducten;
    public List<VoorbereidProductBasisRecept> BasisReceptVoorbereidProducten;
    public List<VoorbereidProduct> VoorbereidProducten;
    public List<ReceptProductBasisRecept> BasisReceptReceptProducten;
    public List<ReceptProduct> ReceptProducten;

    public BasisRecept() {
    }

    public BasisRecept(int BasisReceptId, Omschrijving Omschrijving, int Hoeveelheid, double Percentage, int Volgnummer, String Hulpstof, String Telbasis, int AantalPersonen, List<BasisProductBasisRecept> BasisReceptBasisProducten, List<BasisProduct> BasisProducten, List<AfgewerktProductBasisRecept> BasisReceptAfgewerkteProducten, List<AfgewerktProduct> AfgewerktProducten, List<VerkoopProductBasisRecept> BasisReceptverkoopProducten, List<VerkoopProduct> VerkoopProducten, List<VoorbereidProductBasisRecept> BasisReceptVoorbereidProducten, List<VoorbereidProduct> VoorbereidProducten, List<ReceptProductBasisRecept> BasisReceptReceptProducten, List<ReceptProduct> ReceptProducten) {
        this.BasisReceptId = BasisReceptId;
        this.Omschrijving = Omschrijving;
        this.Hoeveelheid = Hoeveelheid;
        this.Percentage = Percentage;
        this.Volgnummer = Volgnummer;
        this.Hulpstof = Hulpstof;
        this.Telbasis = Telbasis;
        this.AantalPersonen = AantalPersonen;
        this.BasisReceptBasisProducten = BasisReceptBasisProducten;
        this.BasisProducten = BasisProducten;
        this.BasisReceptAfgewerkteProducten = BasisReceptAfgewerkteProducten;
        this.AfgewerktProducten = AfgewerktProducten;
        this.BasisReceptverkoopProducten = BasisReceptverkoopProducten;
        this.VerkoopProducten = VerkoopProducten;
        this.BasisReceptVoorbereidProducten = BasisReceptVoorbereidProducten;
        this.VoorbereidProducten = VoorbereidProducten;
        this.BasisReceptReceptProducten = BasisReceptReceptProducten;
        this.ReceptProducten = ReceptProducten;
    }

    public int getBasisReceptId() {
        return BasisReceptId;
    }

    public void setBasisReceptId(int BasisReceptId) {
        this.BasisReceptId = BasisReceptId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public int getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(int Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public String getHulpstof() {
        return Hulpstof;
    }

    public void setHulpstof(String Hulpstof) {
        this.Hulpstof = Hulpstof;
    }

    public String getTelbasis() {
        return Telbasis;
    }

    public void setTelbasis(String Telbasis) {
        this.Telbasis = Telbasis;
    }

    public int getAantalPersonen() {
        return AantalPersonen;
    }

    public void setAantalPersonen(int AantalPersonen) {
        this.AantalPersonen = AantalPersonen;
    }

    public List<BasisProductBasisRecept> getBasisReceptBasisProducten() {
        return BasisReceptBasisProducten;
    }

    public void setBasisReceptBasisProducten(List<BasisProductBasisRecept> BasisReceptBasisProducten) {
        this.BasisReceptBasisProducten = BasisReceptBasisProducten;
    }

    public List<BasisProduct> getBasisProducten() {
        return BasisProducten;
    }

    public void setBasisProducten(List<BasisProduct> BasisProducten) {
        this.BasisProducten = BasisProducten;
    }

    public List<AfgewerktProductBasisRecept> getBasisReceptAfgewerkteProducten() {
        return BasisReceptAfgewerkteProducten;
    }

    public void setBasisReceptAfgewerkteProducten(List<AfgewerktProductBasisRecept> BasisReceptAfgewerkteProducten) {
        this.BasisReceptAfgewerkteProducten = BasisReceptAfgewerkteProducten;
    }

    public List<AfgewerktProduct> getAfgewerktProducten() {
        return AfgewerktProducten;
    }

    public void setAfgewerktProducten(List<AfgewerktProduct> AfgewerktProducten) {
        this.AfgewerktProducten = AfgewerktProducten;
    }

    public List<VerkoopProductBasisRecept> getBasisReceptverkoopProducten() {
        return BasisReceptverkoopProducten;
    }

    public void setBasisReceptverkoopProducten(List<VerkoopProductBasisRecept> BasisReceptverkoopProducten) {
        this.BasisReceptverkoopProducten = BasisReceptverkoopProducten;
    }

    public List<VerkoopProduct> getVerkoopProducten() {
        return VerkoopProducten;
    }

    public void setVerkoopProducten(List<VerkoopProduct> VerkoopProducten) {
        this.VerkoopProducten = VerkoopProducten;
    }

    public List<VoorbereidProductBasisRecept> getBasisReceptVoorbereidProducten() {
        return BasisReceptVoorbereidProducten;
    }

    public void setBasisReceptVoorbereidProducten(List<VoorbereidProductBasisRecept> BasisReceptVoorbereidProducten) {
        this.BasisReceptVoorbereidProducten = BasisReceptVoorbereidProducten;
    }

    public List<VoorbereidProduct> getVoorbereidProducten() {
        return VoorbereidProducten;
    }

    public void setVoorbereidProducten(List<VoorbereidProduct> VoorbereidProducten) {
        this.VoorbereidProducten = VoorbereidProducten;
    }

    public List<ReceptProductBasisRecept> getBasisReceptReceptProducten() {
        return BasisReceptReceptProducten;
    }

    public void setBasisReceptReceptProducten(List<ReceptProductBasisRecept> BasisReceptReceptProducten) {
        this.BasisReceptReceptProducten = BasisReceptReceptProducten;
    }

    public List<ReceptProduct> getReceptProducten() {
        return ReceptProducten;
    }

    public void setReceptProducten(List<ReceptProduct> ReceptProducten) {
        this.ReceptProducten = ReceptProducten;
    }

    @Override
    public void setId(int id) {
        this.BasisReceptId=id;
    }
 @Override
    public int getId() {
        return this.BasisReceptId;
    }
}
