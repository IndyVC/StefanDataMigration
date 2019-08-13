/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.Recepten.Taak;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class VerkoopProductTaak implements New{

    public int VerkoopProductTaakId;

    public int VerkoopProductId;

    public int TaakId;

    public VerkoopProduct VerkoopProduct;
    public Taak Taak;

    public VerkoopProductTaak() {

    }

    public VerkoopProductTaak(VerkoopProduct verkoopProduct, Taak taak) {
        VerkoopProduct = verkoopProduct;
        VerkoopProductId = VerkoopProduct.VerkoopProductId;
        Taak = taak;
        TaakId = Taak.TaakId;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductTaakId=id;
    }

    @Override
    public int getId() {
        return VerkoopProductTaakId;
    }
}
