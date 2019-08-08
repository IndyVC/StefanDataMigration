/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Producten.AankoopProduct;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class AankoopProductVerkoopProduct
    {
        public int AankoopProductVerkoopProductId;
        public int AankoopProductId;
        public int VerkoopProductId;

        public AankoopProduct AankoopProduct;
        public VerkoopProduct VerkoopProduct;

        public AankoopProductVerkoopProduct()
        {

        }

        public AankoopProductVerkoopProduct(AankoopProduct aankoopProduct, VerkoopProduct verkoopProduct)
        {
            AankoopProduct = aankoopProduct;
            AankoopProductId = AankoopProduct.AankoopProductId;
            VerkoopProduct = verkoopProduct;
            VerkoopProductId = VerkoopProduct.VerkoopProductId;
        }
    }