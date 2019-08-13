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

    public int VoorbereidProductId;

    public int BasisReceptId;

    public VoorbereidProduct VoorbereidProduct;
    public BasisRecept BasisRecept;

    public VoorbereidProductBasisRecept() {

    }

    public VoorbereidProductBasisRecept(VoorbereidProduct voorbereidProduct, BasisRecept basisRecept) {
        VoorbereidProduct = voorbereidProduct;
        VoorbereidProductId = VoorbereidProduct.VoorbereidProductId;
        BasisRecept = basisRecept;
        BasisReceptId = basisRecept.BasisReceptId;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductBasisReceptId;
    }
}
