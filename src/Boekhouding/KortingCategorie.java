/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import New.New;

/**
 *
 * @author stefa
 */
public class KortingCategorie implements New {
    
    public int KortingCategorieId;
    public String Naam;

    public KortingCategorie() {
    }

    public KortingCategorie(int KortingCategorieId, String Naam) {
        this.KortingCategorieId = KortingCategorieId;
        this.Naam = Naam;
    }

    public int getKortingCategorieId() {
        return KortingCategorieId;
    }

    public void setKortingCategorieId(int KortingCategorieId) {
        this.KortingCategorieId = KortingCategorieId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    @Override
    public void setId(int id) {
        this.KortingCategorieId=id;
    }
     @Override
    public int getId() {
        return this.KortingCategorieId;
    }
    
}
