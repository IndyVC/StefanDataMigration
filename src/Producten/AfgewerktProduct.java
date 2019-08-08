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
import TussenTabellen.AfgewerktProductBasisRecept;
import TussenTabellen.AfgewerktProductMaterieel;
import TussenTabellen.AfgewerktProductTaak;
import java.util.List;

/**
 *
 * @author stefa
 */
public class AfgewerktProduct implements New{
     public int AfgewerktProductId;
        public double ProductieHoeveelheid;
        public List<FysischeEigenschap> FysischeEigenschappen;
        public List<AfgewerktProductBasisRecept> AfgewerktProductBasisRecepten;
        public List<BasisRecept> BasisRecepten;
        public List<AfgewerktProductTaak> AfgewerktProductTaken;
        public List<Taak> ReceptTaken;
        public List<AfgewerktProductMaterieel> AfgewerktProductMaterielen;
        public List<Materieel> ReceptMaterieel;

    public AfgewerktProduct() {
    }

    public AfgewerktProduct(int AfgewerktProductId, double ProductieHoeveelheid, List<FysischeEigenschap> FysischeEigenschappen, List<AfgewerktProductBasisRecept> AfgewerktProductBasisRecepten, List<BasisRecept> BasisRecepten, List<AfgewerktProductTaak> AfgewerktProductTaken, List<Taak> ReceptTaken, List<AfgewerktProductMaterieel> AfgewerktProductMaterielen, List<Materieel> ReceptMaterieel) {
        this.AfgewerktProductId = AfgewerktProductId;
        this.ProductieHoeveelheid = ProductieHoeveelheid;
        this.FysischeEigenschappen = FysischeEigenschappen;
        this.AfgewerktProductBasisRecepten = AfgewerktProductBasisRecepten;
        this.BasisRecepten = BasisRecepten;
        this.AfgewerktProductTaken = AfgewerktProductTaken;
        this.ReceptTaken = ReceptTaken;
        this.AfgewerktProductMaterielen = AfgewerktProductMaterielen;
        this.ReceptMaterieel = ReceptMaterieel;
    }

    public int getAfgewerktProductId() {
        return AfgewerktProductId;
    }

    public void setAfgewerktProductId(int AfgewerktProductId) {
        this.AfgewerktProductId = AfgewerktProductId;
    }

    public double getProductieHoeveelheid() {
        return ProductieHoeveelheid;
    }

    public void setProductieHoeveelheid(double ProductieHoeveelheid) {
        this.ProductieHoeveelheid = ProductieHoeveelheid;
    }

    public List<FysischeEigenschap> getFysischeEigenschappen() {
        return FysischeEigenschappen;
    }

    public void setFysischeEigenschappen(List<FysischeEigenschap> FysischeEigenschappen) {
        this.FysischeEigenschappen = FysischeEigenschappen;
    }

    public List<AfgewerktProductBasisRecept> getAfgewerktProductBasisRecepten() {
        return AfgewerktProductBasisRecepten;
    }

    public void setAfgewerktProductBasisRecepten(List<AfgewerktProductBasisRecept> AfgewerktProductBasisRecepten) {
        this.AfgewerktProductBasisRecepten = AfgewerktProductBasisRecepten;
    }

    public List<BasisRecept> getBasisRecepten() {
        return BasisRecepten;
    }

    public void setBasisRecepten(List<BasisRecept> BasisRecepten) {
        this.BasisRecepten = BasisRecepten;
    }

    public List<AfgewerktProductTaak> getAfgewerktProductTaken() {
        return AfgewerktProductTaken;
    }

    public void setAfgewerktProductTaken(List<AfgewerktProductTaak> AfgewerktProductTaken) {
        this.AfgewerktProductTaken = AfgewerktProductTaken;
    }

    public List<Taak> getReceptTaken() {
        return ReceptTaken;
    }

    public void setReceptTaken(List<Taak> ReceptTaken) {
        this.ReceptTaken = ReceptTaken;
    }

    public List<AfgewerktProductMaterieel> getAfgewerktProductMaterielen() {
        return AfgewerktProductMaterielen;
    }

    public void setAfgewerktProductMaterielen(List<AfgewerktProductMaterieel> AfgewerktProductMaterielen) {
        this.AfgewerktProductMaterielen = AfgewerktProductMaterielen;
    }

    public List<Materieel> getReceptMaterieel() {
        return ReceptMaterieel;
    }

    public void setReceptMaterieel(List<Materieel> ReceptMaterieel) {
        this.ReceptMaterieel = ReceptMaterieel;
    }

    @Override
    public void setId(int id) {
        this.AfgewerktProductId=id;
    }
        
         @Override
    public int getId() {
        return this.AfgewerktProductId;
    }
        
}
