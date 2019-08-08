/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Boekhouding.AlgemeneRekening;
import New.New;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ProductGroep implements New{

    public int ProductGroepId;
    public Omschrijving Omschrijving;
    public AlgemeneRekening AlgemeneRekening;

    public List<ProductSubGroep> ProductSubGroepen;

    public ProductGroep() {
    }

    public ProductGroep(int ProductGroepId, Omschrijving Omschrijving, AlgemeneRekening AlgemeneRekening, List<ProductSubGroep> ProductSubGroepen) {
        this.ProductGroepId = ProductGroepId;
        this.Omschrijving = Omschrijving;
        this.AlgemeneRekening = AlgemeneRekening;
        this.ProductSubGroepen = ProductSubGroepen;
    }

    

    public int getProductGroepId() {
        return ProductGroepId;
    }

    public void setProductGroepId(int ProductGroepId) {
        this.ProductGroepId = ProductGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public AlgemeneRekening getAlgemeneRekening() {
        return AlgemeneRekening;
    }

    public void setAlgemeneRekening(AlgemeneRekening AlgemeneRekening) {
        this.AlgemeneRekening = AlgemeneRekening;
    }

    public List<ProductSubGroep> getProductSubGroepen() {
        return ProductSubGroepen;
    }

    public void setProductSubGroepen(List<ProductSubGroep> ProductSubGroepen) {
        this.ProductSubGroepen = ProductSubGroepen;
    }

    @Override
    public void setId(int id) {
        this.ProductGroepId=id;
    }
 @Override
    public int getId() {
        return this.ProductGroepId;
    }

}
