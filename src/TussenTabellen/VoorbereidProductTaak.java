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

    public VoorbereidProduct VoorbereidProduct;
    public Taak Taak;

    public VoorbereidProductTaak() {

    }

    public VoorbereidProductTaak(VoorbereidProduct voorbereidProduct, Taak taak) {
        VoorbereidProduct = voorbereidProduct;
        Taak = taak;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductTaakId = id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductTaakId;
    }

    public int getVoorbereidProductTaakId() {
        return VoorbereidProductTaakId;
    }

    public void setVoorbereidProductTaakId(int VoorbereidProductTaakId) {
        this.VoorbereidProductTaakId = VoorbereidProductTaakId;
    }

    public VoorbereidProduct getVoorbereidProduct() {
        return VoorbereidProduct;
    }

    public void setVoorbereidProduct(VoorbereidProduct VoorbereidProduct) {
        this.VoorbereidProduct = VoorbereidProduct;
    }

    public Taak getTaak() {
        return Taak;
    }

    public void setTaak(Taak Taak) {
        this.Taak = Taak;
    }
    
    
}
