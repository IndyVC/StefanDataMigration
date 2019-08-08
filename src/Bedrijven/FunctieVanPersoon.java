/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class FunctieVanPersoon implements New{
    
    public int FunctieVanPersoonId;
    public Omschrijving Omschrijving;
    public double Uurloon;

    public FunctieVanPersoon() {
    }

    public FunctieVanPersoon(int FunctieVanPersoonId, Omschrijving Omschrijving, double Uurloon) {
        this.FunctieVanPersoonId = FunctieVanPersoonId;
        this.Omschrijving = Omschrijving;
        this.Uurloon = Uurloon;
    }

    public int getFunctieVanPersoonId() {
        return FunctieVanPersoonId;
    }

    public void setFunctieVanPersoonId(int FunctieVanPersoonId) {
        this.FunctieVanPersoonId = FunctieVanPersoonId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public double getUurloon() {
        return Uurloon;
    }

    public void setUurloon(double Uurloon) {
        this.Uurloon = Uurloon;
    }

    @Override
    public void setId(int id) {
        this.FunctieVanPersoonId = id;
    }

    @Override
    public int getId() {
        return this.FunctieVanPersoonId;
    }
    
}
