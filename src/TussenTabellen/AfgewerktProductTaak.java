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

    public int AfgewerktProductId;

    public int TaakId;

    public AfgewerktProduct AfgewerktProduct;
    public Taak Taak;

    public AfgewerktProductTaak() {

    }

    public AfgewerktProductTaak(AfgewerktProduct afgewerktProduct, Taak taak) {
        AfgewerktProduct = afgewerktProduct;
        AfgewerktProductId = afgewerktProduct.AfgewerktProductId;
        Taak = taak;
        TaakId = Taak.TaakId;
    }

    @Override
    public void setId(int id) {
        this.AfgewerktProductTaakId=id;
    }

    @Override
    public int getId() {
        return this.AfgewerktProductTaakId;
    }
}
