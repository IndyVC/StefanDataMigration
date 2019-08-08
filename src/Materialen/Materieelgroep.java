/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class Materieelgroep implements New {

    public int MaterieelgroepId;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public Materieelgroep() {
    }

    public Materieelgroep(int MaterieelgroepId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.MaterieelgroepId = MaterieelgroepId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getMaterieelgroepId() {
        return MaterieelgroepId;
    }

    public void setMaterieelgroepId(int MaterieelgroepId) {
        this.MaterieelgroepId = MaterieelgroepId;
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
        this.MaterieelgroepId = id;
    }
 @Override
    public int getId() {
        return this.MaterieelgroepId;
    }
}
