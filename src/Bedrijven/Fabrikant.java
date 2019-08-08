/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import New.New;

/**
 *
 * @author stefa
 */
public class Fabrikant implements New{
    
    public int FabrikantId;
    public String Naam;

    public Fabrikant() {
    }

    public Fabrikant(int FabrikantId, String Naam) {
        this.FabrikantId = FabrikantId;
        this.Naam = Naam;
    }

    public int getFabrikantId() {
        return FabrikantId;
    }

    public void setFabrikantId(int FabrikantId) {
        this.FabrikantId = FabrikantId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    @Override
    public void setId(int id) {
        this.FabrikantId=id;
    }

    @Override
    public int getId() {
        return this.FabrikantId;
    }
    
}
