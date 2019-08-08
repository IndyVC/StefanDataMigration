/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Materialen.Materieel;
import Producten.AfgewerktProduct;

/**
 *
 * @author stefa
 */
public class AfgewerktProductMaterieel {

    public int AfgewerktProductMaterieelId;

    public int AfgewerktProductId;

    public int MaterieelId;

    public AfgewerktProduct AfgewerktProduct;
    public Materieel Materieel;

    public AfgewerktProductMaterieel() {

    }

    public AfgewerktProductMaterieel(AfgewerktProduct afgewerktProduct, Materieel materieel) {
        AfgewerktProduct = afgewerktProduct;
        AfgewerktProductId = afgewerktProduct.AfgewerktProductId;
        Materieel = materieel;
        MaterieelId = materieel.MaterieelId;
    }
}
