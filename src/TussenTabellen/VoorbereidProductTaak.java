/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.Recepten.Taak;
import Producten.VoorbereidProduct;

/**
 *
 * @author stefa
 */
public class VoorbereidProductTaak implements New{

    public int VoorbereidProductTaakId;

    public int VoorbereidProductId;

    public int TaakId;

    public VoorbereidProduct VoorbereidProduct;
    public Taak Taak;

    public VoorbereidProductTaak() {

    }

    public VoorbereidProductTaak(VoorbereidProduct voorbereidProduct, Taak taak) {
        VoorbereidProduct = voorbereidProduct;
        VoorbereidProductId = VoorbereidProduct.VoorbereidProductId;
        Taak = taak;
        TaakId = Taak.TaakId;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductTaakId = id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductTaakId;
    }
}
