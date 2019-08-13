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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class BasisRecept implements New{

    public int BasisReceptId;

    public Omschrijving Omschrijving;
    public double Hoeveelheid;
    public double Percentage;
    public int Volgnummer;
    public boolean Hulpstof;
    public boolean Telbasis;
    public int AantalPersonen;

    public List<BasisProductBasisRecept> BasisReceptBasisProducten;
    public List<AfgewerktProductBasisRecept> BasisReceptAfgewerkteProducten;
    public List<VerkoopProductBasisRecept> BasisReceptverkoopProducten;
    public List<VoorbereidProductBasisRecept> BasisReceptVoorbereidProducten;
    public List<ReceptProductBasisRecept> BasisReceptReceptProducten;

    public BasisRecept() {
    }

    public BasisRecept(int BasisReceptId, Omschrijving Omschrijving, double Hoeveelheid, double Percentage, int Volgnummer, boolean Hulpstof, boolean Telbasis, int AantalPersonen) {
        this.BasisReceptId = BasisReceptId;
        this.Omschrijving = Omschrijving;
        this.Hoeveelheid = Hoeveelheid;
        this.Percentage = Percentage;
        this.Volgnummer = Volgnummer;
        this.Hulpstof = Hulpstof;
        this.Telbasis = Telbasis;
        this.AantalPersonen = AantalPersonen;
        BasisReceptBasisProducten = new ArrayList();
        BasisReceptAfgewerkteProducten = new ArrayList();
        BasisReceptverkoopProducten =new ArrayList();
        BasisReceptVoorbereidProducten = new ArrayList();
        BasisReceptReceptProducten = new ArrayList();
        
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

    public double getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(double Hoeveelheid) {
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

    public boolean getHulpstof() {
        return Hulpstof;
    }

    public void setHulpstof(boolean Hulpstof) {
        this.Hulpstof = Hulpstof;
    }

    public boolean getTelbasis() {
        return Telbasis;
    }

    public void setTelbasis(boolean Telbasis) {
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

    public List<AfgewerktProductBasisRecept> getBasisReceptAfgewerkteProducten() {
        return BasisReceptAfgewerkteProducten;
    }

    public void setBasisReceptAfgewerkteProducten(List<AfgewerktProductBasisRecept> BasisReceptAfgewerkteProducten) {
        this.BasisReceptAfgewerkteProducten = BasisReceptAfgewerkteProducten;
    }

 

    public List<VerkoopProductBasisRecept> getBasisReceptverkoopProducten() {
        return BasisReceptverkoopProducten;
    }

    public void setBasisReceptverkoopProducten(List<VerkoopProductBasisRecept> BasisReceptverkoopProducten) {
        this.BasisReceptverkoopProducten = BasisReceptverkoopProducten;
    }

    public List<VoorbereidProductBasisRecept> getBasisReceptVoorbereidProducten() {
        return BasisReceptVoorbereidProducten;
    }

    public void setBasisReceptVoorbereidProducten(List<VoorbereidProductBasisRecept> BasisReceptVoorbereidProducten) {
        this.BasisReceptVoorbereidProducten = BasisReceptVoorbereidProducten;
    }


    public List<ReceptProductBasisRecept> getBasisReceptReceptProducten() {
        return BasisReceptReceptProducten;
    }

    public void setBasisReceptReceptProducten(List<ReceptProductBasisRecept> BasisReceptReceptProducten) {
        this.BasisReceptReceptProducten = BasisReceptReceptProducten;
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
