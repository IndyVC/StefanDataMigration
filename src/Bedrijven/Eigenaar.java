/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import New.New;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Eigenaar implements New{
    
    public int EigenaarId;
    public String Naam;
    
    public List<Bedrijf> Bedrijven;

    public Eigenaar() {
    }

    public Eigenaar(int EigenaarId, String Naam, List<Bedrijf> Bedrijven) {
        this.EigenaarId = EigenaarId;
        this.Naam = Naam;
        this.Bedrijven = Bedrijven;
    }

    public int getEigenaarId() {
        return EigenaarId;
    }

    public void setEigenaarId(int EigenaarId) {
        this.EigenaarId = EigenaarId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public List<Bedrijf> getBedrijven() {
        return Bedrijven;
    }

    public void setBedrijven(List<Bedrijf> Bedrijven) {
        this.Bedrijven = Bedrijven;
    }

    @Override
    public void setId(int id) {
        this.EigenaarId=id;
    }

    @Override
    public int getId() {
        return this.EigenaarId;
    }
    
    
}
