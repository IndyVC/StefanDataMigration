/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import New.New;
import Producten.ReceptProduct;

/**
 *
 * @author stefa
 */
public class ReceptProductMaterieel implements New {

    public int ReceptProductMaterieelId;

    public ReceptProduct ReceptProduct;
    public Materieel Materieel;

    public ReceptProductMaterieel() {

    }

    public ReceptProductMaterieel(ReceptProduct receptProduct, Materieel materieel) {
        ReceptProduct = receptProduct;
        Materieel = materieel;
    }

    @Override
    public void setId(int id) {
        this.ReceptProductMaterieelId = id;
    }

    @Override
    public int getId() {
        return this.ReceptProductMaterieelId;
    }

    public int getReceptProductMaterieelId() {
        return ReceptProductMaterieelId;
    }

    public void setReceptProductMaterieelId(int ReceptProductMaterieelId) {
        this.ReceptProductMaterieelId = ReceptProductMaterieelId;
    }

    public ReceptProduct getReceptProduct() {
        return ReceptProduct;
    }

    public void setReceptProduct(ReceptProduct ReceptProduct) {
        this.ReceptProduct = ReceptProduct;
    }

    public Materieel getMaterieel() {
        return Materieel;
    }

    public void setMaterieel(Materieel Materieel) {
        this.Materieel = Materieel;
    }
    
    
}
