/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.BasisProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class BasisProductBasisRecept implements New{

    public int BasisProductBasisReceptId;

    public BasisProduct BasisProduct;
    public BasisRecept BasisRecept;

    public BasisProductBasisRecept() {

    }

    public BasisProductBasisRecept(BasisProduct basisProduct, BasisRecept basisRecept) {
        BasisProduct = basisProduct;
        BasisRecept = basisRecept;
    }

    @Override
    public void setId(int id) {
        this.BasisProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return this.BasisProductBasisReceptId;
    }

    public int getBasisProductBasisReceptId() {
        return BasisProductBasisReceptId;
    }

    public void setBasisProductBasisReceptId(int BasisProductBasisReceptId) {
        this.BasisProductBasisReceptId = BasisProductBasisReceptId;
    }

    public BasisProduct getBasisProduct() {
        return BasisProduct;
    }

    public void setBasisProduct(BasisProduct BasisProduct) {
        this.BasisProduct = BasisProduct;
    }

    public BasisRecept getBasisRecept() {
        return BasisRecept;
    }

    public void setBasisRecept(BasisRecept BasisRecept) {
        this.BasisRecept = BasisRecept;
    }
    
    
}
