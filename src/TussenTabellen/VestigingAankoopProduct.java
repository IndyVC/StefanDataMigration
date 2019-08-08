/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.Vestiging;
import Producten.AankoopProduct;

/**
 *
 * @author stefa
 */
 public class VestigingAankoopProduct
    {
        public int VestigingAankoopProductId;

        public int VestigingId;
        public int AankoopProductId;

        public Vestiging Vestiging;
        public AankoopProduct AankoopProduct;

        public VestigingAankoopProduct()
        {

        }

        public VestigingAankoopProduct(Vestiging vestiging, AankoopProduct aankoopProduct)
        {
            Vestiging = vestiging;
            VestigingId = Vestiging.getVestgingId();
            AankoopProduct = aankoopProduct;
            AankoopProductId = AankoopProduct.AankoopProductId;
        }
    }