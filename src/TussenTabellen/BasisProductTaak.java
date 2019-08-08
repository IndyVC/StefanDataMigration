/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.BasisProduct;
import Producten.Recepten.Taak;

/**
 *
 * @author stefa
 */
public class BasisProductTaak {

    public int BasisProductTaakId;

    public int BasisProductId;

    public int TaakId;

    public BasisProduct BasisProduct;
    public Taak Taak;

    public BasisProductTaak() {

    }

    public BasisProductTaak(BasisProduct basisProduct, Taak taak) {
        BasisProduct = basisProduct;
        BasisProductId = BasisProduct.BasisProductId;
        Taak = taak;
        TaakId = Taak.TaakId;
    }
}
