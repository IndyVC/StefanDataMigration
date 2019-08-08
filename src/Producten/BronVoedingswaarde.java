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
public class BronVoedingswaarde implements New {

    public int BronVoedingswaardeId;

    public Omschrijving Omschrijving;

    public boolean Berekenen;

    public boolean Blokkeren;

    public BronVoedingswaarde() {
    }

    public BronVoedingswaarde(int BronVoedingswaardeId, Omschrijving Omschrijving, boolean Berekenen, boolean Blokkeren) {
        this.BronVoedingswaardeId = BronVoedingswaardeId;
        this.Omschrijving = Omschrijving;
        this.Berekenen = Berekenen;
        this.Blokkeren = Blokkeren;
    }

    public int getBronVoedingswaardeId() {
        return BronVoedingswaardeId;
    }

    public void setBronVoedingswaardeId(int BronVoedingswaardeId) {
        this.BronVoedingswaardeId = BronVoedingswaardeId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isBerekenen() {
        return Berekenen;
    }

    public void setBerekenen(boolean Berekenen) {
        this.Berekenen = Berekenen;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.BronVoedingswaardeId=id;
    }
 @Override
    public int getId() {
        return this.BronVoedingswaardeId;
    }
}
