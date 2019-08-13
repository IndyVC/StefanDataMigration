/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.Recepten.BasisRecept;
import Producten.VoorbereidProduct;

/**
 *
 * @author stefa
 */
public class VoorbereidProductBasisRecept implements New {

    public int VoorbereidProductBasisReceptId;

    public VoorbereidProduct VoorbereidProduct;
    public BasisRecept BasisRecept;

    public VoorbereidProductBasisRecept() {

    }

    public VoorbereidProductBasisRecept(VoorbereidProduct voorbereidProduct, BasisRecept basisRecept) {
        VoorbereidProduct = voorbereidProduct;
        BasisRecept = basisRecept;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductBasisReceptId;
    }

    public int getVoorbereidProductBasisReceptId() {
        return VoorbereidProductBasisReceptId;
    }

    public void setVoorbereidProductBasisReceptId(int VoorbereidProductBasisReceptId) {
        this.VoorbereidProductBasisReceptId = VoorbereidProductBasisReceptId;
    }

    public VoorbereidProduct getVoorbereidProduct() {
        return VoorbereidProduct;
    }

    public void setVoorbereidProduct(VoorbereidProduct VoorbereidProduct) {
        this.VoorbereidProduct = VoorbereidProduct;
    }

    public BasisRecept getBasisRecept() {
        return BasisRecept;
    }

    public void setBasisRecept(BasisRecept BasisRecept) {
        this.BasisRecept = BasisRecept;
    }
    
}
