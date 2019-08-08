/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import Producten.VoorbereidProduct;

/**
 *
 * @author stefa
 */
public class VoorbereidProductMaterieel {

    public int VoorbereidProductMaterieelId;

    public int VoorbereidProductId;

    public int MaterieelId;

    public VoorbereidProduct VoorbereidProduct;
    public Materieel Materieel;

    public VoorbereidProductMaterieel() {

    }

    public VoorbereidProductMaterieel(VoorbereidProduct voorbereidProduct, Materieel materieel) {
        VoorbereidProduct = voorbereidProduct;
        VoorbereidProductId = VoorbereidProduct.VoorbereidProductId;
        Materieel = materieel;
        MaterieelId = Materieel.MaterieelId;
    }
}
