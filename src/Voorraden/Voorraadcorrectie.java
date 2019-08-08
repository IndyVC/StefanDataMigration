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
public class Voorraadcorrectie implements New {

    public int VoorraadcorrectieId;

    public Omschrijving Omschrijving;

    public Voorraadcorrectie() {
    }

    public Voorraadcorrectie(int VoorraadcorrectieId, Omschrijving Omschrijving) {
        this.VoorraadcorrectieId = VoorraadcorrectieId;
        this.Omschrijving = Omschrijving;
    }

    public int getVoorraadcorrectieId() {
        return VoorraadcorrectieId;
    }

    public void setVoorraadcorrectieId(int VoorraadcorrectieId) {
        this.VoorraadcorrectieId = VoorraadcorrectieId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.VoorraadcorrectieId = id;
    }

    @Override
    public int getId() {
        return this.VoorraadcorrectieId;
    }

}
