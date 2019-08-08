/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class VerkoopProductMaterieel {

    public int VerkoopProductMaterieelId;

    public int VerkoopProductId;

    public int MaterieelId;

    public VerkoopProduct VerkoopProduct;
    public Materieel Materieel;

    public VerkoopProductMaterieel() {

    }

    public VerkoopProductMaterieel(VerkoopProduct verkoopProduct, Materieel materieel) {
        VerkoopProduct = verkoopProduct;
        VerkoopProductId = VerkoopProduct.VerkoopProductId;
        Materieel = materieel;
        MaterieelId = Materieel.MaterieelId;
    }
}
