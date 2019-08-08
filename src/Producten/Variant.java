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
public class Variant implements New {

    public int VariantId;
    public VariantGroep VariantGroep;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public Variant() {
    }

    public Variant(int VariantId, VariantGroep VariantGroep, Omschrijving Omschrijving, boolean Blokkeren) {
        this.VariantId = VariantId;
        this.VariantGroep = VariantGroep;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getVariantId() {
        return VariantId;
    }

    public void setVariantId(int VariantId) {
        this.VariantId = VariantId;
    }

    public VariantGroep getVariantGroep() {
        return VariantGroep;
    }

    public void setVariantGroep(VariantGroep VariantGroep) {
        this.VariantGroep = VariantGroep;
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
        this.VariantId=id;
    }
 @Override
    public int getId() {
        return this.VariantId;
    }
}
