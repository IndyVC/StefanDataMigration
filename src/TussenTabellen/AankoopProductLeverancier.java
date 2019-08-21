/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Leveringen.Leverancier;
import New.New;
import Producten.AankoopProduct;

/**
 *
 * @author stefa
 */
public class AankoopProductLeverancier implements New {

    public int AankoopProductLeverancierId;

    public AankoopProduct AankoopProduct;
    public Leverancier Leverancier;

    public AankoopProductLeverancier() {
    }

    public AankoopProductLeverancier(int AankoopProductLeverancierId, AankoopProduct AankoopProduct, Leverancier Leverancier) {
        this.AankoopProductLeverancierId = AankoopProductLeverancierId;
        this.AankoopProduct = AankoopProduct;
        this.Leverancier = Leverancier;
    }

    public int getAankoopProductLeverancierId() {
        return AankoopProductLeverancierId;
    }

    public void setAankoopProductLeverancierId(int AankoopProductLeverancierId) {
        this.AankoopProductLeverancierId = AankoopProductLeverancierId;
    }

    public AankoopProduct getAankoopProduct() {
        return AankoopProduct;
    }

    public void setAankoopProduct(AankoopProduct AankoopProduct) {
        this.AankoopProduct = AankoopProduct;
    }

    public Leverancier getLeverancier() {
        return Leverancier;
    }

    public void setLeverancier(Leverancier Leverancier) {
        this.Leverancier = Leverancier;
    }

    @Override
    public void setId(int id) {
        this.AankoopProductLeverancierId=id;
    }

    @Override
    public int getId() {
        return this.AankoopProductLeverancierId;
    }
    
    
}
