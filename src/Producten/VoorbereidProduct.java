/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;
import Old.Materieel;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Taak;
import TussenTabellen.VoorbereidProductBasisRecept;
import TussenTabellen.VoorbereidProductMaterieel;
import TussenTabellen.VoorbereidProductTaak;
import java.util.List;

/**
 *
 * @author stefa
 */
public class VoorbereidProduct implements New{

    public int VoorbereidProductId;
    public List<VoorbereidProductBasisRecept> VoorbereidProductBasisRecepten;
    public List<BasisRecept> BasisRecepten;
    public List<VoorbereidProductTaak> VoorbereidProductTaken;
    public List<Taak> ReceptTaken;
    public List<VoorbereidProductMaterieel> VoorbereidProductMaterielen;
    public List<Materieel> ReceptMaterieel;
    public int AantalPersonen;

    public VoorbereidProduct() {
    }

    public VoorbereidProduct(int VoorbereidProductId, List<VoorbereidProductBasisRecept> VoorbereidProductBasisRecepten, List<BasisRecept> BasisRecepten, List<VoorbereidProductTaak> VoorbereidProductTaken, List<Taak> ReceptTaken, List<VoorbereidProductMaterieel> VoorbereidProductMaterielen, List<Materieel> ReceptMaterieel, int AantalPersonen) {
        this.VoorbereidProductId = VoorbereidProductId;
        this.VoorbereidProductBasisRecepten = VoorbereidProductBasisRecepten;
        this.BasisRecepten = BasisRecepten;
        this.VoorbereidProductTaken = VoorbereidProductTaken;
        this.ReceptTaken = ReceptTaken;
        this.VoorbereidProductMaterielen = VoorbereidProductMaterielen;
        this.ReceptMaterieel = ReceptMaterieel;
        this.AantalPersonen = AantalPersonen;
    }

    public int getVoorbereidProductId() {
        return VoorbereidProductId;
    }

    public void setVoorbereidProductId(int VoorbereidProductId) {
        this.VoorbereidProductId = VoorbereidProductId;
    }

    public List<VoorbereidProductBasisRecept> getVoorbereidProductBasisRecepten() {
        return VoorbereidProductBasisRecepten;
    }

    public void setVoorbereidProductBasisRecepten(List<VoorbereidProductBasisRecept> VoorbereidProductBasisRecepten) {
        this.VoorbereidProductBasisRecepten = VoorbereidProductBasisRecepten;
    }

    public List<BasisRecept> getBasisRecepten() {
        return BasisRecepten;
    }

    public void setBasisRecepten(List<BasisRecept> BasisRecepten) {
        this.BasisRecepten = BasisRecepten;
    }

    public List<VoorbereidProductTaak> getVoorbereidProductTaken() {
        return VoorbereidProductTaken;
    }

    public void setVoorbereidProductTaken(List<VoorbereidProductTaak> VoorbereidProductTaken) {
        this.VoorbereidProductTaken = VoorbereidProductTaken;
    }

    public List<Taak> getReceptTaken() {
        return ReceptTaken;
    }

    public void setReceptTaken(List<Taak> ReceptTaken) {
        this.ReceptTaken = ReceptTaken;
    }

    public List<VoorbereidProductMaterieel> getVoorbereidProductMaterielen() {
        return VoorbereidProductMaterielen;
    }

    public void setVoorbereidProductMaterielen(List<VoorbereidProductMaterieel> VoorbereidProductMaterielen) {
        this.VoorbereidProductMaterielen = VoorbereidProductMaterielen;
    }

    public List<Materieel> getReceptMaterieel() {
        return ReceptMaterieel;
    }

    public void setReceptMaterieel(List<Materieel> ReceptMaterieel) {
        this.ReceptMaterieel = ReceptMaterieel;
    }

    public int getAantalPersonen() {
        return AantalPersonen;
    }

    public void setAantalPersonen(int AantalPersonen) {
        this.AantalPersonen = AantalPersonen;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductId=id;
    }
    
     @Override
    public int getId() {
        return this.VoorbereidProductId;
    }

}
