/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.ReceptProduct;
import Producten.Recepten.Taak;

/**
 *
 * @author stefa
 */
public class ReceptProductTaak {

    public int ReceptProductTaakId;

    public int ReceptProductId;

    public int TaakId;

    public ReceptProduct ReceptProduct;
    public Taak Taak;

    public ReceptProductTaak() {

    }

    public ReceptProductTaak(ReceptProduct receptProduct, Taak taak) {
        ReceptProduct = receptProduct;
        ReceptProductId = ReceptProduct.ReceptProductId;
        Taak = taak;
        TaakId = Taak.TaakId;
    }
}
