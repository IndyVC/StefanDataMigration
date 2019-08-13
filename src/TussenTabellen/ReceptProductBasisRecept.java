/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import New.New;
import Producten.ReceptProduct;
import Producten.Recepten.BasisRecept;

/**
 *
 * @author stefa
 */
public class ReceptProductBasisRecept implements New{

    public int ReceptProductBasisReceptId;
    public ReceptProduct ReceptProduct;
    public BasisRecept BasisRecept;

    public ReceptProductBasisRecept() {

    }

    public ReceptProductBasisRecept(ReceptProduct receptProduct, BasisRecept basisRecept) {
        ReceptProduct = receptProduct;
        BasisRecept = basisRecept;
    }

    @Override
    public void setId(int id) {
        this.ReceptProductBasisReceptId=id;
    }

    @Override
    public int getId() {
        return ReceptProductBasisReceptId;
    }

    public int getReceptProductBasisReceptId() {
        return ReceptProductBasisReceptId;
    }

    public void setReceptProductBasisReceptId(int ReceptProductBasisReceptId) {
        this.ReceptProductBasisReceptId = ReceptProductBasisReceptId;
    }

    public ReceptProduct getReceptProduct() {
        return ReceptProduct;
    }

    public void setReceptProduct(ReceptProduct ReceptProduct) {
        this.ReceptProduct = ReceptProduct;
    }

    public BasisRecept getBasisRecept() {
        return BasisRecept;
    }

    public void setBasisRecept(BasisRecept BasisRecept) {
        this.BasisRecept = BasisRecept;
    }
    
        
}
