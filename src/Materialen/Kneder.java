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
public class Kneder implements New{

    public int KnederId;
    public double Inhoud;

    public Omschrijving Omschrijving;

    public Kneder() {
    }

    public Kneder(int KnederId, double Inhoud, Omschrijving Omschrijving) {
        this.KnederId = KnederId;
        this.Inhoud = Inhoud;
        this.Omschrijving = Omschrijving;
    }

    public int getKnederId() {
        return KnederId;
    }

    public void setKnederId(int KnederId) {
        this.KnederId = KnederId;
    }

    public double getInhoud() {
        return Inhoud;
    }

    public void setInhoud(double Inhoud) {
        this.Inhoud = Inhoud;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.KnederId=id;
    }
     @Override
    public int getId() {
        return this.KnederId;
    }
    
}
