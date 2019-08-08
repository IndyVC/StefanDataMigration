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
public class BewaarTemperatuur implements New{

    public int BewaarTemperatuurId;
    public Omschrijving Omschrijving;
    public int MinimumTemperatuur;
    public int MaximumTemperatuur;
    public boolean Blokkeren;

    public BewaarTemperatuur() {
    }

    public BewaarTemperatuur(int BewaarTemperatuurId, Omschrijving Omschrijving, int MinimumTemperatuur, int MaximumTemperatuur, boolean Blokkeren) {
        this.BewaarTemperatuurId = BewaarTemperatuurId;
        this.Omschrijving = Omschrijving;
        this.MinimumTemperatuur = MinimumTemperatuur;
        this.MaximumTemperatuur = MaximumTemperatuur;
        this.Blokkeren = Blokkeren;
    }

    public int getBewaarTemperatuurId() {
        return BewaarTemperatuurId;
    }

    public void setBewaarTemperatuurId(int BewaarTemperatuurId) {
        this.BewaarTemperatuurId = BewaarTemperatuurId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public int getMinimumTemperatuur() {
        return MinimumTemperatuur;
    }

    public void setMinimumTemperatuur(int MinimumTemperatuur) {
        this.MinimumTemperatuur = MinimumTemperatuur;
    }

    public int getMaximumTemperatuur() {
        return MaximumTemperatuur;
    }

    public void setMaximumTemperatuur(int MaximumTemperatuur) {
        this.MaximumTemperatuur = MaximumTemperatuur;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.BewaarTemperatuurId=id;
    }
     @Override
    public int getId() {
        return this.BewaarTemperatuurId;
    }
    
}
