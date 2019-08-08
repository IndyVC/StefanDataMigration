/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Boekhouding.AlgemeneRekening;
import New.New;

/**
 *
 * @author stefa
 */
public class ProductSubGroep implements New{

    public int ProductSubGroepId;
    public Omschrijving Omschrijving;
    public AlgemeneRekening AlgemeneRekening;
    public ProductGroep ProductGroep;

    public ProductSubGroep() {
    }

    public ProductSubGroep(int ProductSubGroepId, Omschrijving Omschrijving, AlgemeneRekening AlgemeneRekening, ProductGroep ProductGroep) {
        this.ProductSubGroepId = ProductSubGroepId;
        this.Omschrijving = Omschrijving;
        this.AlgemeneRekening = AlgemeneRekening;
        this.ProductGroep = ProductGroep;
    }

    public int getProductSubGroepId() {
        return ProductSubGroepId;
    }

    public void setProductSubGroepId(int ProductSubGroepId) {
        this.ProductSubGroepId = ProductSubGroepId;
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

    public ProductGroep getProductGroep() {
        return ProductGroep;
    }

    public void setProductGroep(ProductGroep ProductGroep) {
        this.ProductGroep = ProductGroep;
    }

    @Override
    public void setId(int id) {
        this.ProductSubGroepId=id;
    }
 @Override
    public int getId() {
        return this.ProductSubGroepId;
    }
}
