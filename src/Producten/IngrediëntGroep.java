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
public class IngrediëntGroep implements New {

    public int IngrediëntGroepId;

    public Omschrijving Omschrijving;

    public int Code;

    public IngrediëntGroep() {
    }

    public IngrediëntGroep(int IngrediëntGroepId, Omschrijving Omschrijving, int Code) {
        this.IngrediëntGroepId = IngrediëntGroepId;
        this.Omschrijving = Omschrijving;
        this.Code = Code;
    }

    public int getIngrediëntGroepId() {
        return IngrediëntGroepId;
    }

    public void setIngrediëntGroepId(int IngrediëntGroepId) {
        this.IngrediëntGroepId = IngrediëntGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    @Override
    public void setId(int id) {
        this.IngrediëntGroepId = id;
    }
 @Override
    public int getId() {
        return this.IngrediëntGroepId;
    }
}
