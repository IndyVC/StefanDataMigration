/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.AfgewerktProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class AfgewerktProductBasisRecept implements New{

    public int AfgewerktProductBasisReceptId;

    public AfgewerktProduct AfgewerktProduct;
    public BasisRecept BasisRecept;

    public AfgewerktProductBasisRecept() {

    }

    public AfgewerktProductBasisRecept(AfgewerktProduct afgewerktProduct, BasisRecept basisRecept) {
        AfgewerktProduct = afgewerktProduct;
        BasisRecept = basisRecept;
    }

    @Override
    public void setId(int id) {
        this.AfgewerktProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return this.AfgewerktProductBasisReceptId;
    }

    public int getAfgewerktProductBasisReceptId() {
        return AfgewerktProductBasisReceptId;
    }

    public void setAfgewerktProductBasisReceptId(int AfgewerktProductBasisReceptId) {
        this.AfgewerktProductBasisReceptId = AfgewerktProductBasisReceptId;
    }

    public AfgewerktProduct getAfgewerktProduct() {
        return AfgewerktProduct;
    }

    public void setAfgewerktProduct(AfgewerktProduct AfgewerktProduct) {
        this.AfgewerktProduct = AfgewerktProduct;
    }

    public BasisRecept getBasisRecept() {
        return BasisRecept;
    }

    public void setBasisRecept(BasisRecept BasisRecept) {
        this.BasisRecept = BasisRecept;
    }
    
    
}
