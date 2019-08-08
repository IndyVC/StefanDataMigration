/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.AfgewerktProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class AfgewerktProductBasisRecept {

    public int AfgewerktProductBasisReceptId;

    public int AfgewerktProductId;

    public int BasisReceptId;

    public AfgewerktProduct AfgewerktProduct;
    public BasisRecept BasisRecept;

    public AfgewerktProductBasisRecept() {

    }

    public AfgewerktProductBasisRecept(AfgewerktProduct afgewerktProduct, BasisRecept basisRecept) {
        AfgewerktProduct = afgewerktProduct;
        AfgewerktProductId = afgewerktProduct.AfgewerktProductId;
        BasisRecept = basisRecept;
        BasisReceptId = BasisRecept.BasisReceptId;
    }
}
