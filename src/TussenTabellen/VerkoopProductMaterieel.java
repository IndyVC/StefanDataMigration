/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import New.New;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class VerkoopProductMaterieel implements New{

    public int VerkoopProductMaterieelId;

    public VerkoopProduct VerkoopProduct;
    public Materieel Materieel;

    public VerkoopProductMaterieel() {

    }

    public VerkoopProductMaterieel(VerkoopProduct verkoopProduct, Materieel materieel) {
        VerkoopProduct = verkoopProduct;
        Materieel = materieel;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductMaterieelId=id;
    }

    @Override
    public int getId() {
        return this.VerkoopProductMaterieelId;
    }

    public int getVerkoopProductMaterieelId() {
        return VerkoopProductMaterieelId;
    }

    public void setVerkoopProductMaterieelId(int VerkoopProductMaterieelId) {
        this.VerkoopProductMaterieelId = VerkoopProductMaterieelId;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
    }

    public Materieel getMaterieel() {
        return Materieel;
    }

    public void setMaterieel(Materieel Materieel) {
        this.Materieel = Materieel;
    }
    
}
