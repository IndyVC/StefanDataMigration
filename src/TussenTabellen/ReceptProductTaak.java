/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.ReceptProduct;
import Producten.Recepten.Taak;

/**
 *
 * @author stefa
 */
public class ReceptProductTaak implements New {

    public int ReceptProductTaakId;

    public ReceptProduct ReceptProduct;
    public Taak Taak;

    public ReceptProductTaak() {

    }

    public ReceptProductTaak(ReceptProduct receptProduct, Taak taak) {
        ReceptProduct = receptProduct;
        Taak = taak;
    }

    @Override
    public void setId(int id) {
        this.ReceptProductTaakId=id;
    }

    @Override
    public int getId() {
        return this.ReceptProductTaakId;
    }

    public int getReceptProductTaakId() {
        return ReceptProductTaakId;
    }

    public void setReceptProductTaakId(int ReceptProductTaakId) {
        this.ReceptProductTaakId = ReceptProductTaakId;
    }

    public ReceptProduct getReceptProduct() {
        return ReceptProduct;
    }

    public void setReceptProduct(ReceptProduct ReceptProduct) {
        this.ReceptProduct = ReceptProduct;
    }

    public Taak getTaak() {
        return Taak;
    }

    public void setTaak(Taak Taak) {
        this.Taak = Taak;
    }
    
    
}
