/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import New.New;
import Producten.VoorbereidProduct;

/**
 *
 * @author stefa
 */
public class VoorbereidProductMaterieel implements New{

    public int VoorbereidProductMaterieelId;

    public VoorbereidProduct VoorbereidProduct;
    public Materieel Materieel;

    public VoorbereidProductMaterieel() {

    }

    public VoorbereidProductMaterieel(VoorbereidProduct voorbereidProduct, Materieel materieel) {
        VoorbereidProduct = voorbereidProduct;
        Materieel = materieel;
    }

    @Override
    public void setId(int id) {
        this.VoorbereidProductMaterieelId=id;
    }

    @Override
    public int getId() {
        return this.VoorbereidProductMaterieelId;
    }

    public int getVoorbereidProductMaterieelId() {
        return VoorbereidProductMaterieelId;
    }

    public void setVoorbereidProductMaterieelId(int VoorbereidProductMaterieelId) {
        this.VoorbereidProductMaterieelId = VoorbereidProductMaterieelId;
    }

    public VoorbereidProduct getVoorbereidProduct() {
        return VoorbereidProduct;
    }

    public void setVoorbereidProduct(VoorbereidProduct VoorbereidProduct) {
        this.VoorbereidProduct = VoorbereidProduct;
    }

    public Materieel getMaterieel() {
        return Materieel;
    }

    public void setMaterieel(Materieel Materieel) {
        this.Materieel = Materieel;
    }
    
    
}
