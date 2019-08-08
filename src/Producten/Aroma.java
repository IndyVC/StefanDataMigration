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
public class Aroma implements New{

    public int AromaId;
    public Omschrijving Omschrijving;

    public Aroma() {
    }

    public Aroma(int AromaId, Omschrijving Omschrijving) {
        this.AromaId = AromaId;
        this.Omschrijving = Omschrijving;
    }

    public int getAromaId() {
        return AromaId;
    }

    public void setAromaId(int AromaId) {
        this.AromaId = AromaId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.AromaId=id;
    }
    
     @Override
    public int getId() {
        return this.AromaId;
    }
}
