/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;
import Old.Origine;
import enums.FunctieVanIngrediënt;

/**
 *
 * @author stefa
 */
public class Ingrediënt implements New{

    public int IngrediëntId;

    public Omschrijving Omschrijving;
    public IngrediëntGroep IngrediëntGroep;
    public boolean VermeldenAlsOmschrijving;

    public boolean TechnologischeFunctie;

    public String Enummer;
    public FunctieVanIngrediënt Functie;

    public Aroma Aroma;
    public Origine Origine;

    public SoortPlantaardig SoortPlantaardig;
    public String Vitamine;

    public Ingrediënt() {
    }

    public Ingrediënt(int IngrediëntId, Omschrijving Omschrijving, IngrediëntGroep IngrediëntGroep, boolean VermeldenAlsOmschrijving, boolean TechnologischeFunctie, String Enummer, FunctieVanIngrediënt Functie, Aroma Aroma, Origine Origine, SoortPlantaardig SoortPlantaardig, String Vitamine) {
        this.IngrediëntId = IngrediëntId;
        this.Omschrijving = Omschrijving;
        this.IngrediëntGroep = IngrediëntGroep;
        this.VermeldenAlsOmschrijving = VermeldenAlsOmschrijving;
        this.TechnologischeFunctie = TechnologischeFunctie;
        this.Enummer = Enummer;
        this.Functie = Functie;
        this.Aroma = Aroma;
        this.Origine = Origine;
        this.SoortPlantaardig = SoortPlantaardig;
        this.Vitamine = Vitamine;
    }

    public int getIngrediëntId() {
        return IngrediëntId;
    }

    public void setIngrediëntId(int IngrediëntId) {
        this.IngrediëntId = IngrediëntId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public IngrediëntGroep getIngrediëntGroep() {
        return IngrediëntGroep;
    }

    public void setIngrediëntGroep(IngrediëntGroep IngrediëntGroep) {
        this.IngrediëntGroep = IngrediëntGroep;
    }

    public boolean isVermeldenAlsOmschrijving() {
        return VermeldenAlsOmschrijving;
    }

    public void setVermeldenAlsOmschrijving(boolean VermeldenAlsOmschrijving) {
        this.VermeldenAlsOmschrijving = VermeldenAlsOmschrijving;
    }

    public boolean isTechnologischeFunctie() {
        return TechnologischeFunctie;
    }

    public void setTechnologischeFunctie(boolean TechnologischeFunctie) {
        this.TechnologischeFunctie = TechnologischeFunctie;
    }

    public String getEnummer() {
        return Enummer;
    }

    public void setEnummer(String Enummer) {
        this.Enummer = Enummer;
    }

    public FunctieVanIngrediënt getFunctie() {
        return Functie;
    }

    public void setFunctie(FunctieVanIngrediënt Functie) {
        this.Functie = Functie;
    }

    public Aroma getAroma() {
        return Aroma;
    }

    public void setAroma(Aroma Aroma) {
        this.Aroma = Aroma;
    }

    public Origine getOrigine() {
        return Origine;
    }

    public void setOrigine(Origine Origine) {
        this.Origine = Origine;
    }

    public SoortPlantaardig getSoortPlantaardig() {
        return SoortPlantaardig;
    }

    public void setSoortPlantaardig(SoortPlantaardig SoortPlantaardig) {
        this.SoortPlantaardig = SoortPlantaardig;
    }

    public String getVitamine() {
        return Vitamine;
    }

    public void setVitamine(String Vitamine) {
        this.Vitamine = Vitamine;
    }

    @Override
    public void setId(int id) {
        this.IngrediëntId=id;
    }
     @Override
    public int getId() {
        return this.IngrediëntId;
    }
    
    
}
