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
public class VoorraadPlaats implements New {

    public int VoorraadPlaatsId;

    public Omschrijving Omschrijving;
    public double Temperatuur;

    public VoorraadPlaats() {
    }

    public VoorraadPlaats(int VoorraadPlaatsId, Omschrijving Omschrijving, double Temperatuur) {
        this.VoorraadPlaatsId = VoorraadPlaatsId;
        this.Omschrijving = Omschrijving;
        this.Temperatuur = Temperatuur;
    }

    public int getVoorraadPlaatsId() {
        return VoorraadPlaatsId;
    }

    public void setVoorraadPlaatsId(int VoorraadPlaatsId) {
        this.VoorraadPlaatsId = VoorraadPlaatsId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public double getTemperatuur() {
        return Temperatuur;
    }

    public void setTemperatuur(double Temperatuur) {
        this.Temperatuur = Temperatuur;
    }

    @Override
    public void setId(int id) {
        this.VoorraadPlaatsId=id;
    }
 @Override
    public int getId() {
        return this.VoorraadPlaatsId;
    }
}
