/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class BestelGroep implements New {
    
    public int BestelGroepId;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public BestelGroep() {
    }

    public BestelGroep(int BestelGroepId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.BestelGroepId = BestelGroepId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getBestelGroepId() {
        return BestelGroepId;
    }

    public void setBestelGroepId(int BestelGroepId) {
        this.BestelGroepId = BestelGroepId;
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
        this.BestelGroepId=id;
    }

    @Override
    public int getId() {
        return this.BestelGroepId;
    }
    
    
    
}
