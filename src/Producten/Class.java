/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Boekhouding.AlgemeneRekening;
import java.util.List;

/**
 *
 * @author stefa
 
public class Class {

    public int ProductGroepId;

    public Omschrijving Omschrijving;
    public AlgemeneRekening AlgemeneRekening;
    public List<ProductSubGroep> ProductSubGroepen;

    public Class() {
    }

    public Class(int ProductGroepId, Omschrijving Omschrijving, AlgemeneRekening AlgemeneRekening, List<ProductSubGroep> ProductSubGroepen) {
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

}
*/