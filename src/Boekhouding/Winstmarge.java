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
public class Winstmarge implements New{
    
    public int WinstmargeId;
    public double Percentage;
    public Omschrijving Omschrijving;

    public Winstmarge() {
    }

    public Winstmarge(int WinstmargeId, double Percentage, Omschrijving Omschrijving) {
        this.WinstmargeId = WinstmargeId;
        this.Percentage = Percentage;
        this.Omschrijving = Omschrijving;
    }

    public int getWinstmargeId() {
        return WinstmargeId;
    }

    public void setWinstmargeId(int WinstmargeId) {
        this.WinstmargeId = WinstmargeId;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.WinstmargeId=id;
    }
    
     @Override
    public int getId() {
        return this.WinstmargeId;
    }
}
