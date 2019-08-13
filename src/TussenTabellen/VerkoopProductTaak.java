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

    public VerkoopProduct VerkoopProduct;
    public Taak Taak;

    public VerkoopProductTaak() {

    }

    public VerkoopProductTaak(VerkoopProduct verkoopProduct, Taak taak) {
        VerkoopProduct = verkoopProduct;
        Taak = taak;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductTaakId=id;
    }

    @Override
    public int getId() {
        return VerkoopProductTaakId;
    }

    public int getVerkoopProductTaakId() {
        return VerkoopProductTaakId;
    }

    public void setVerkoopProductTaakId(int VerkoopProductTaakId) {
        this.VerkoopProductTaakId = VerkoopProductTaakId;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
    }

    public Taak getTaak() {
        return Taak;
    }

    public void setTaak(Taak Taak) {
        this.Taak = Taak;
    }
    
}
