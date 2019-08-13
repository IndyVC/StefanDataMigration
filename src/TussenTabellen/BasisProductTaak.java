/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.BasisProduct;
import Producten.Recepten.Taak;

/**
 *
 * @author stefa
 */
public class BasisProductTaak implements New{

    public int BasisProductTaakId;

    public BasisProduct BasisProduct;
    public Taak Taak;

    public BasisProductTaak() {

    }

    public BasisProductTaak(BasisProduct basisProduct, Taak taak) {
        BasisProduct = basisProduct;
        Taak = taak;
    }

    @Override
    public void setId(int id) {
        this.BasisProductTaakId=id;
    }

    @Override
    public int getId() {
        return this.BasisProductTaakId;
    }

    public int getBasisProductTaakId() {
        return BasisProductTaakId;
    }

    public void setBasisProductTaakId(int BasisProductTaakId) {
        this.BasisProductTaakId = BasisProductTaakId;
    }

    public BasisProduct getBasisProduct() {
        return BasisProduct;
    }

    public void setBasisProduct(BasisProduct BasisProduct) {
        this.BasisProduct = BasisProduct;
    }

    public Taak getTaak() {
        return Taak;
    }

    public void setTaak(Taak Taak) {
        this.Taak = Taak;
    }
    
    
}
