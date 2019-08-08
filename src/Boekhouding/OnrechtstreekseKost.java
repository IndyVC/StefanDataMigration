/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class OnrechtstreekseKost implements New{
    
    public int OnrechtstreekseKostId;
    public Omschrijving Omschrijving;
    public double Percentage;
    public boolean Blokkeren;

    public OnrechtstreekseKost() {
    }

    public OnrechtstreekseKost(int OnrechtstreekseKostId, Omschrijving Omschrijving, double Percentage, boolean Blokkeren) {
        this.OnrechtstreekseKostId = OnrechtstreekseKostId;
        this.Omschrijving = Omschrijving;
        this.Percentage = Percentage;
        this.Blokkeren = Blokkeren;
    }

    public int getOnrechtstreekseKostId() {
        return OnrechtstreekseKostId;
    }

    public void setOnrechtstreekseKostId(int OnrechtstreekseKostId) {
        this.OnrechtstreekseKostId = OnrechtstreekseKostId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.OnrechtstreekseKostId=id;
    }
     @Override
    public int getId() {
        return this.OnrechtstreekseKostId;
    }
    
}
