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
public class DistributieWijze implements New{
     public int DistributieWijzeId;

        public Omschrijving Omschrijving;

    public DistributieWijze() {
    }

    public DistributieWijze(int DistributieWijzeId, Omschrijving Omschrijving) {
        this.DistributieWijzeId = DistributieWijzeId;
        this.Omschrijving = Omschrijving;
    }

    public int getDistributieWijzeId() {
        return DistributieWijzeId;
    }

    public void setDistributieWijzeId(int DistributieWijzeId) {
        this.DistributieWijzeId = DistributieWijzeId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.DistributieWijzeId=id;
    }
        
         @Override
    public int getId() {
        return this.DistributieWijzeId;
    }
}
