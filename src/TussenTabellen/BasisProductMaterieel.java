/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import New.New;
import Producten.BasisProduct;

/**
 *
 * @author stefa
 */
public class BasisProductMaterieel implements New{

    public int BasisProductMaterieelId;

    public BasisProduct BasisProduct;
    public Materieel Materieel;

    public BasisProductMaterieel() {

    }

    public BasisProductMaterieel(BasisProduct basisProduct, Materieel materieel) {
        BasisProduct = basisProduct;
        Materieel = materieel;
    }

    @Override
    public void setId(int id) {
        this.BasisProductMaterieelId=id;
    }

    @Override
    public int getId() {
        return this.BasisProductMaterieelId;
    }

    public int getBasisProductMaterieelId() {
        return BasisProductMaterieelId;
    }

    public void setBasisProductMaterieelId(int BasisProductMaterieelId) {
        this.BasisProductMaterieelId = BasisProductMaterieelId;
    }

    public BasisProduct getBasisProduct() {
        return BasisProduct;
    }

    public void setBasisProduct(BasisProduct BasisProduct) {
        this.BasisProduct = BasisProduct;
    }

    public Materieel getMaterieel() {
        return Materieel;
    }

    public void setMaterieel(Materieel Materieel) {
        this.Materieel = Materieel;
    }
    
    
}
