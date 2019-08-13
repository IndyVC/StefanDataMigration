/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.Vestiging;
import New.New;
import Producten.AankoopProduct;

/**
 *
 * @author stefa
 */
public class VestigingAankoopProduct implements New {

    public int VestigingAankoopProductId;

    public Vestiging Vestiging;
    public AankoopProduct AankoopProduct;

    public VestigingAankoopProduct() {

    }

    public VestigingAankoopProduct(Vestiging vestiging, AankoopProduct aankoopProduct) {
        Vestiging = vestiging;
        AankoopProduct = aankoopProduct;
    }

    @Override
    public void setId(int id) {
        this.VestigingAankoopProductId=id;
    }

    @Override
    public int getId() {
        return this.VestigingAankoopProductId;
    }

    public int getVestigingAankoopProductId() {
        return VestigingAankoopProductId;
    }

    public void setVestigingAankoopProductId(int VestigingAankoopProductId) {
        this.VestigingAankoopProductId = VestigingAankoopProductId;
    }

    public Vestiging getVestiging() {
        return Vestiging;
    }

    public void setVestiging(Vestiging Vestiging) {
        this.Vestiging = Vestiging;
    }

    public AankoopProduct getAankoopProduct() {
        return AankoopProduct;
    }

    public void setAankoopProduct(AankoopProduct AankoopProduct) {
        this.AankoopProduct = AankoopProduct;
    }
    
    
}
