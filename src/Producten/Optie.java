/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Optie implements New {

    public int OptieId;

    public OptieGroep OptieGroep;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    //public List<Optie> Opties;

    public Optie() {
    }

    public Optie(int OptieId, OptieGroep OptieGroep, Omschrijving Omschrijving, boolean Blokkeren) {
        this.OptieId = OptieId;
        this.OptieGroep = OptieGroep;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
        //this.Opties = Opties;
    }

    public int getOptieId() {
        return OptieId;
    }

    public void setOptieId(int OptieId) {
        this.OptieId = OptieId;
    }

    public OptieGroep getOptieGroep() {
        return OptieGroep;
    }

    public void setOptieGroep(OptieGroep OptieGroep) {
        this.OptieGroep = OptieGroep;
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

//    public List<Optie> getOpties() {
//        return Opties;
//    }
//
//    public void setOpties(List<Optie> Opties) {
//        this.Opties = Opties;
//    }

    @Override
    public void setId(int id) {
        this.OptieId=id;
    }
 @Override
    public int getId() {
        return this.OptieId;
    }
}
