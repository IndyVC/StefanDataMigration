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
public class Verkoopsverdeelgroep implements New{

    public int VerkoopsverdeelgroepId;

    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public Verkoopsverdeelgroep() {
    }

    public Verkoopsverdeelgroep(int VerkoopsverdeelgroepId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.VerkoopsverdeelgroepId = VerkoopsverdeelgroepId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getVerkoopsverdeelgroepId() {
        return VerkoopsverdeelgroepId;
    }

    public void setVerkoopsverdeelgroepId(int VerkoopsverdeelgroepId) {
        this.VerkoopsverdeelgroepId = VerkoopsverdeelgroepId;
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
        this.VerkoopsverdeelgroepId=id;
    }
 @Override
    public int getId() {
        return this.VerkoopsverdeelgroepId;
    }
}
