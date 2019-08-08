/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class Receptgroep implements New{
    public int ReceptgroepId;
        public Omschrijving Omschrijving;

    public Receptgroep() {
    }

    public Receptgroep(int ReceptgroepId, Omschrijving Omschrijving) {
        this.ReceptgroepId = ReceptgroepId;
        this.Omschrijving = Omschrijving;
    }

    public int getReceptgroepId() {
        return ReceptgroepId;
    }

    public void setReceptgroepId(int ReceptgroepId) {
        this.ReceptgroepId = ReceptgroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.ReceptgroepId=id;
    }
        
         @Override
    public int getId() {
        return this.ReceptgroepId;
    }
}
