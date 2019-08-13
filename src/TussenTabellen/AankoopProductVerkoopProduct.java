/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.AankoopProduct;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class AankoopProductVerkoopProduct implements New{

    public int AankoopProductVerkoopProductId;
    public AankoopProduct AankoopProduct;
    public VerkoopProduct VerkoopProduct;

    public AankoopProductVerkoopProduct() {

    }

    public AankoopProductVerkoopProduct(AankoopProduct aankoopProduct, VerkoopProduct verkoopProduct) {
        AankoopProduct = aankoopProduct;
        VerkoopProduct = verkoopProduct;
    }

    @Override
    public void setId(int id) {
        this.AankoopProductVerkoopProductId = id;
    }

    @Override
    public int getId() {
        return this.AankoopProductVerkoopProductId;
    }

    public int getAankoopProductVerkoopProductId() {
        return AankoopProductVerkoopProductId;
    }

    public void setAankoopProductVerkoopProductId(int AankoopProductVerkoopProductId) {
        this.AankoopProductVerkoopProductId = AankoopProductVerkoopProductId;
    }

    public AankoopProduct getAankoopProduct() {
        return AankoopProduct;
    }

    public void setAankoopProduct(AankoopProduct AankoopProduct) {
        this.AankoopProduct = AankoopProduct;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
    }
    
    
}
