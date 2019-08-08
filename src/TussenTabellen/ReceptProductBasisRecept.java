/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.ReceptProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class ReceptProductBasisRecept {

    public int ReceptProductBasisReceptId;

    public int ReceptProductId;

    public int BasisReceptId;

    public ReceptProduct ReceptProduct;
    public BasisRecept BasisRecept;

    public ReceptProductBasisRecept() {

    }

    public ReceptProductBasisRecept(ReceptProduct receptProduct, BasisRecept basisRecept) {
        ReceptProduct = receptProduct;
        ReceptProductId = ReceptProduct.ReceptProductId;
        BasisRecept = basisRecept;
        BasisReceptId = BasisRecept.BasisReceptId;
    }
}
