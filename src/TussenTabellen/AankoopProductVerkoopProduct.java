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
    public int AankoopProductId;
    public int VerkoopProductId;

    public AankoopProduct AankoopProduct;
    public VerkoopProduct VerkoopProduct;

    public AankoopProductVerkoopProduct() {

    }

    public AankoopProductVerkoopProduct(AankoopProduct aankoopProduct, VerkoopProduct verkoopProduct) {
        AankoopProduct = aankoopProduct;
        AankoopProductId = AankoopProduct.AankoopProductId;
        VerkoopProduct = verkoopProduct;
        VerkoopProductId = VerkoopProduct.VerkoopProductId;
    }

    @Override
    public void setId(int id) {
        this.AankoopProductVerkoopProductId = id;
    }

    @Override
    public int getId() {
        return this.AankoopProductVerkoopProductId;
    }
}
