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
public class Origine implements New{

    public int OrigineId;

    public Omschrijving Omschrijving;
    public boolean Blokkeren;
    public IngrediëntGroep IngrediëntGroep;

    public Origine() {
    }

    public Origine(int OrigineId, Omschrijving Omschrijving, boolean Blokkeren, IngrediëntGroep IngrediëntGroep) {
        this.OrigineId = OrigineId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
        this.IngrediëntGroep = IngrediëntGroep;
    }

    public int getOrigineId() {
        return OrigineId;
    }

    public void setOrigineId(int OrigineId) {
        this.OrigineId = OrigineId;
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

    public IngrediëntGroep getIngrediëntGroep() {
        return IngrediëntGroep;
    }

    public void setIngrediëntGroep(IngrediëntGroep IngrediëntGroep) {
        this.IngrediëntGroep = IngrediëntGroep;
    }

    @Override
    public void setId(int id) {
        this.OrigineId=id;
    }
     @Override
    public int getId() {
        return this.OrigineId;
    }
    
}
