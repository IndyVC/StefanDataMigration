/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import Producten.ReceptProduct;

/**
 *
 * @author stefa
 */
public class ReceptProductMaterieel {

    public int ReceptProductMaterieelId;

    public int ReceptProductId;

    public int MaterieelId;

    public ReceptProduct ReceptProduct;
    public Materieel Materieel;

    public ReceptProductMaterieel() {

    }

    public ReceptProductMaterieel(ReceptProduct receptProduct, Materieel materieel) {
        ReceptProduct = receptProduct;
        ReceptProductId = ReceptProduct.ReceptProductId;
        Materieel = materieel;
        MaterieelId = materieel.MaterieelId;
    }
}
