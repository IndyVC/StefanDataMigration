/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class VariantGroep implements New{
     public int VariantGroepId;
        public Omschrijving Omschrijving;

        public boolean Blokkeren;

    public VariantGroep() {
    }

    public VariantGroep(int VariantGroepId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.VariantGroepId = VariantGroepId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getVariantGroepId() {
        return VariantGroepId;
    }

    public void setVariantGroepId(int VariantGroepId) {
        this.VariantGroepId = VariantGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.VariantGroepId=id;
    }
        
             @Override
    public int getId() {
        return this.VariantGroepId;
    }
        
}
