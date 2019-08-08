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
public class OptieGroep implements New{

    public int OptieGroepId;
    public Omschrijving Omschrijving;

    public boolean Blokkeren;

    public OptieGroep() {
    }

    public OptieGroep(int OptieGroepId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.OptieGroepId = OptieGroepId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getOptieGroepId() {
        return OptieGroepId;
    }

    public void setOptieGroepId(int OptieGroepId) {
        this.OptieGroepId = OptieGroepId;
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
        this.OptieGroepId=id;
    }
 @Override
    public int getId() {
        return this.OptieGroepId;
    }
}
