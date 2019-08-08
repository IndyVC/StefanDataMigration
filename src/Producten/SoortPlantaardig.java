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
public class SoortPlantaardig implements New{
     public int SoortPlantaardigId;
        public Omschrijving Omschrijving;

    public SoortPlantaardig() {
    }

    public SoortPlantaardig(int SoortPlantaardigId, Omschrijving Omschrijving) {
        this.SoortPlantaardigId = SoortPlantaardigId;
        this.Omschrijving = Omschrijving;
    }

    public int getSoortPlantaardigId() {
        return SoortPlantaardigId;
    }

    public void setSoortPlantaardigId(int SoortPlantaardigId) {
        this.SoortPlantaardigId = SoortPlantaardigId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.SoortPlantaardigId=id;
    }
         @Override
    public int getId() {
        return this.SoortPlantaardigId;
    }
}
