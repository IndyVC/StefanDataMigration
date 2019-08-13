/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import New.New;
import Producten.AfgewerktProduct;

/**
 *
 * @author stefa
 */
public class AfgewerktProductMaterieel implements New{

    public int AfgewerktProductMaterieelId;

    public AfgewerktProduct AfgewerktProduct;
    public Materieel Materieel;

    public AfgewerktProductMaterieel() {

    }

    public AfgewerktProductMaterieel(AfgewerktProduct afgewerktProduct, Materieel materieel) {
        AfgewerktProduct = afgewerktProduct;
        Materieel = materieel;
    }

    @Override
    public void setId(int id) {
        this.AfgewerktProductMaterieelId=id;
    }

    @Override
    public int getId() {
        return this.AfgewerktProductMaterieelId;
    }

    public int getAfgewerktProductMaterieelId() {
        return AfgewerktProductMaterieelId;
    }

    public void setAfgewerktProductMaterieelId(int AfgewerktProductMaterieelId) {
        this.AfgewerktProductMaterieelId = AfgewerktProductMaterieelId;
    }

    public AfgewerktProduct getAfgewerktProduct() {
        return AfgewerktProduct;
    }

    public void setAfgewerktProduct(AfgewerktProduct AfgewerktProduct) {
        this.AfgewerktProduct = AfgewerktProduct;
    }

    public Materieel getMaterieel() {
        return Materieel;
    }

    public void setMaterieel(Materieel Materieel) {
        this.Materieel = Materieel;
    }
    
    
}
