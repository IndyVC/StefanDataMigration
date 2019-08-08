/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voorraden;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class Bewaarconditie implements New{

    public int BewaarConditieId;

    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public Bewaarconditie() {
    }

    public Bewaarconditie(int BewaarConditieId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.BewaarConditieId = BewaarConditieId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getBewaarConditieId() {
        return BewaarConditieId;
    }

    public void setBewaarConditieId(int BewaarConditieId) {
        this.BewaarConditieId = BewaarConditieId;
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
        this.BewaarConditieId=id;
    }
 @Override
    public int getId() {
        return this.BewaarConditieId;
    }
}
