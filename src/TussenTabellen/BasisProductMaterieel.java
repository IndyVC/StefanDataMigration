/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import Producten.BasisProduct;

/**
 *
 * @author stefa
 */
public class BasisProductMaterieel {

    public int BasisProductMaterieelId;

    public int BasisProductId;

    public int MaterieelId;

    public BasisProduct BasisProduct;
    public Materieel Materieel;

    public BasisProductMaterieel() {

    }

    public BasisProductMaterieel(BasisProduct basisProduct, Materieel materieel) {
        BasisProduct = basisProduct;
        BasisProductId = BasisProduct.BasisProductId;
        Materieel = materieel;
        MaterieelId = Materieel.MaterieelId;
    }
}
