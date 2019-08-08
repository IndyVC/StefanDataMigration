/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Bedrijven.Vestiging;
import New.New;
import Old.Materieel;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Taak;
import TussenTabellen.BasisProductBasisRecept;
import TussenTabellen.BasisProductMaterieel;
import TussenTabellen.BasisProductTaak;
import TussenTabellen.BasisProductVestiging;
import java.util.List;

/**
 *
 * @author stefa
 */
public class BasisProduct implements New{
     public int BasisProductId;
        public List<FysischeEigenschap> FysischeEigenschappen;
        public List<BasisProductVestiging> BasisProductVestigingen;
        public List<Vestiging> Vestigingen;
        public List<BasisProductBasisRecept> BasisProductBasisRecepten;
        public List<BasisRecept> BasisRecepten;
        public List<BasisProductTaak> BasisProductTaken;
        public List<Taak> ReceptTaken;
        public List<BasisProductMaterieel> BasisProductMaterielen;
        public List<Materieel> ReceptMaterieel;

    public BasisProduct() {
    }

    public BasisProduct(int BasisProductId, List<FysischeEigenschap> FysischeEigenschappen, List<BasisProductVestiging> BasisProductVestigingen, List<Vestiging> Vestigingen, List<BasisProductBasisRecept> BasisProductBasisRecepten, List<BasisRecept> BasisRecepten, List<BasisProductTaak> BasisProductTaken, List<Taak> ReceptTaken, List<BasisProductMaterieel> BasisProductMaterielen, List<Materieel> ReceptMaterieel) {
        this.BasisProductId = BasisProductId;
        this.FysischeEigenschappen = FysischeEigenschappen;
        this.BasisProductVestigingen = BasisProductVestigingen;
        this.Vestigingen = Vestigingen;
        this.BasisProductBasisRecepten = BasisProductBasisRecepten;
        this.BasisRecepten = BasisRecepten;
        this.BasisProductTaken = BasisProductTaken;
        this.ReceptTaken = ReceptTaken;
        this.BasisProductMaterielen = BasisProductMaterielen;
        this.ReceptMaterieel = ReceptMaterieel;
    }

    public int getBasisProductId() {
        return BasisProductId;
    }

    public void setBasisProductId(int BasisProductId) {
        this.BasisProductId = BasisProductId;
    }

    public List<FysischeEigenschap> getFysischeEigenschappen() {
        return FysischeEigenschappen;
    }

    public void setFysischeEigenschappen(List<FysischeEigenschap> FysischeEigenschappen) {
        this.FysischeEigenschappen = FysischeEigenschappen;
    }

    public List<BasisProductVestiging> getBasisProductVestigingen() {
        return BasisProductVestigingen;
    }

    public void setBasisProductVestigingen(List<BasisProductVestiging> BasisProductVestigingen) {
        this.BasisProductVestigingen = BasisProductVestigingen;
    }

    public List<Vestiging> getVestigingen() {
        return Vestigingen;
    }

    public void setVestigingen(List<Vestiging> Vestigingen) {
        this.Vestigingen = Vestigingen;
    }

    public List<BasisProductBasisRecept> getBasisProductBasisRecepten() {
        return BasisProductBasisRecepten;
    }

    public void setBasisProductBasisRecepten(List<BasisProductBasisRecept> BasisProductBasisRecepten) {
        this.BasisProductBasisRecepten = BasisProductBasisRecepten;
    }

    public List<BasisRecept> getBasisRecepten() {
        return BasisRecepten;
    }

    public void setBasisRecepten(List<BasisRecept> BasisRecepten) {
        this.BasisRecepten = BasisRecepten;
    }

    public List<BasisProductTaak> getBasisProductTaken() {
        return BasisProductTaken;
    }

    public void setBasisProductTaken(List<BasisProductTaak> BasisProductTaken) {
        this.BasisProductTaken = BasisProductTaken;
    }

    public List<Taak> getReceptTaken() {
        return ReceptTaken;
    }

    public void setReceptTaken(List<Taak> ReceptTaken) {
        this.ReceptTaken = ReceptTaken;
    }

    public List<BasisProductMaterieel> getBasisProductMaterielen() {
        return BasisProductMaterielen;
    }

    public void setBasisProductMaterielen(List<BasisProductMaterieel> BasisProductMaterielen) {
        this.BasisProductMaterielen = BasisProductMaterielen;
    }

    public List<Materieel> getReceptMaterieel() {
        return ReceptMaterieel;
    }

    public void setReceptMaterieel(List<Materieel> ReceptMaterieel) {
        this.ReceptMaterieel = ReceptMaterieel;
    }

    @Override
    public void setId(int id) {
        this.BasisProductId=id;
    }
         @Override
    public int getId() {
        return this.BasisProductId;
    }
        
        
}
