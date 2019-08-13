/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.AfgewerktProduct;
import Producten.Recepten.Taak;

/**
 *
 * @author stefa
 */
public class AfgewerktProductTaak implements New{

    public int AfgewerktProductTaakId;

    public AfgewerktProduct AfgewerktProduct;
    public Taak Taak;

    public AfgewerktProductTaak() {

    }

    public AfgewerktProductTaak(AfgewerktProduct afgewerktProduct, Taak taak) {
        AfgewerktProduct = afgewerktProduct;
        Taak = taak;
    }

    @Override
    public void setId(int id) {
        this.AfgewerktProductTaakId=id;
    }

    @Override
    public int getId() {
        return this.AfgewerktProductTaakId;
    }

    public int getAfgewerktProductTaakId() {
        return AfgewerktProductTaakId;
    }

    public void setAfgewerktProductTaakId(int AfgewerktProductTaakId) {
        this.AfgewerktProductTaakId = AfgewerktProductTaakId;
    }

    public AfgewerktProduct getAfgewerktProduct() {
        return AfgewerktProduct;
    }

    public void setAfgewerktProduct(AfgewerktProduct AfgewerktProduct) {
        this.AfgewerktProduct = AfgewerktProduct;
    }

    public Taak getTaak() {
        return Taak;
    }

    public void setTaak(Taak Taak) {
        this.Taak = Taak;
    }
    
}
