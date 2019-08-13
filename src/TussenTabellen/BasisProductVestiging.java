/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.Vestiging;
import New.New;
import Producten.BasisProduct;

/**
 *
 * @author stefa
 */
public class BasisProductVestiging implements New{

    public int BasisProductVestigingId;

    public BasisProduct BasisProduct;
    public Vestiging Vestiging;

    public BasisProductVestiging() {

    }

    public BasisProductVestiging(BasisProduct basisProduct, Vestiging vestiging) {
        BasisProduct = basisProduct;
        Vestiging = vestiging;
    }

    @Override
    public void setId(int id) {
        this.BasisProductVestigingId=id;
    }

    @Override
    public int getId() {
        return this.BasisProductVestigingId;
    }

    public int getBasisProductVestigingId() {
        return BasisProductVestigingId;
    }

    public void setBasisProductVestigingId(int BasisProductVestigingId) {
        this.BasisProductVestigingId = BasisProductVestigingId;
    }

    public BasisProduct getBasisProduct() {
        return BasisProduct;
    }

    public void setBasisProduct(BasisProduct BasisProduct) {
        this.BasisProduct = BasisProduct;
    }

    public Vestiging getVestiging() {
        return Vestiging;
    }

    public void setVestiging(Vestiging Vestiging) {
        this.Vestiging = Vestiging;
    }
    
    
}
