/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.BasisProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class BasisProductBasisRecept {

    public int BasisProductBasisReceptId;

    public int BasisProductId;

    public int BasisReceptId;

    public BasisProduct BasisProduct;
    public BasisRecept BasisRecept;

    public BasisProductBasisRecept() {

    }

    public BasisProductBasisRecept(BasisProduct basisProduct, BasisRecept basisRecept) {
        BasisProduct = basisProduct;
        BasisProductId = BasisProduct.BasisProductId;
        BasisRecept = basisRecept;
        BasisReceptId = BasisRecept.BasisReceptId;
    }
}
