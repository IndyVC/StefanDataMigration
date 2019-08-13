/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.Recepten.BasisRecept;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class VerkoopProductBasisRecept implements New{

    public int VerkoopProductBasisReceptId;


    public VerkoopProduct VerkoopProduct;
    public BasisRecept BasisRecept;

    public VerkoopProductBasisRecept() {

    }

    public VerkoopProductBasisRecept(VerkoopProduct verkoopProduct, BasisRecept basisRecept) {
        VerkoopProduct = verkoopProduct;
        BasisRecept = basisRecept;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return this.VerkoopProductBasisReceptId;
    }

    public int getVerkoopProductBasisReceptId() {
        return VerkoopProductBasisReceptId;
    }

    public void setVerkoopProductBasisReceptId(int VerkoopProductBasisReceptId) {
        this.VerkoopProductBasisReceptId = VerkoopProductBasisReceptId;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
    }

    public BasisRecept getBasisRecept() {
        return BasisRecept;
    }

    public void setBasisRecept(BasisRecept BasisRecept) {
        this.BasisRecept = BasisRecept;
    }
    
}
