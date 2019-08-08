/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.Recepten.BasisRecept;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class VerkoopProductBasisRecept {

    public int VerkoopProductBasisReceptId;

    public int VerkoopProductId;

    public int BasisReceptId;

    public VerkoopProduct VerkoopProduct;
    public BasisRecept BasisRecept;

    public VerkoopProductBasisRecept() {

    }

    public VerkoopProductBasisRecept(VerkoopProduct verkoopProduct, BasisRecept basisRecept) {
        VerkoopProduct = verkoopProduct;
        VerkoopProductId = VerkoopProduct.VerkoopProductId;
        BasisRecept = basisRecept;
        BasisReceptId = BasisRecept.BasisReceptId;
    }
}
