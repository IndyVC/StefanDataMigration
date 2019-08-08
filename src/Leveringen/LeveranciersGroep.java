/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leveringen;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class LeveranciersGroep implements New{
    
    public int LeveranciersGroepId;
    public Omschrijving Omschrijving;

    public LeveranciersGroep() {
    }

    public LeveranciersGroep(int LeveranciersGroepId, Omschrijving Omschrijving) {
        this.LeveranciersGroepId = LeveranciersGroepId;
        this.Omschrijving = Omschrijving;
    }

    public int getLeveranciersGroepId() {
        return LeveranciersGroepId;
    }

    public void setLeveranciersGroepId(int LeveranciersGroepId) {
        this.LeveranciersGroepId = LeveranciersGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.LeveranciersGroepId=id;
    }
     @Override
    public int getId() {
        return this.LeveranciersGroepId;
    }
    
}
