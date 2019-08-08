/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.Vestiging;
import Producten.BasisProduct;

/**
 *
 * @author stefa
 */
public class BasisProductVestiging {

    public int BasisProductVestigingId;

    public int BasisProductId;

    public int VestigingId;

    public BasisProduct BasisProduct;
    public Vestiging Vestiging;

    public BasisProductVestiging() {

    }

    public BasisProductVestiging(BasisProduct basisProduct, Vestiging vestiging) {
        BasisProduct = basisProduct;
        BasisProductId = BasisProduct.BasisProductId;
        Vestiging = vestiging;
        VestigingId = Vestiging.getVestgingId();
    }
}
