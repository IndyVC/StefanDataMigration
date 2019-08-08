/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;
import enums.AllergeenType;

/**
 *
 * @author stefa
 */
public class Allergeen implements New{

    public int AllergeenId;

    public Omschrijving EtiketOmschrijving;
    public Omschrijving Omschrijving;
    public AllergeenType AllergeenType;
    public AllergeenGroep AllergeenGroep;

    public Allergeen() {
    }

    public Allergeen(int AllergeenId, Omschrijving EtiketOmschrijving, Omschrijving Omschrijving, AllergeenType AllergeenType, AllergeenGroep AllergeenGroep) {
        this.AllergeenId = AllergeenId;
        this.EtiketOmschrijving = EtiketOmschrijving;
        this.Omschrijving = Omschrijving;
        this.AllergeenType = AllergeenType;
        this.AllergeenGroep = AllergeenGroep;
    }

    public int getAllergeenId() {
        return AllergeenId;
    }

    public void setAllergeenId(int AllergeenId) {
        this.AllergeenId = AllergeenId;
    }

    public Omschrijving getEtiketOmschrijving() {
        return EtiketOmschrijving;
    }

    public void setEtiketOmschrijving(Omschrijving EtiketOmschrijving) {
        this.EtiketOmschrijving = EtiketOmschrijving;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public AllergeenType getAllergeenType() {
        return AllergeenType;
    }

    public void setAllergeenType(AllergeenType AllergeenType) {
        this.AllergeenType = AllergeenType;
    }

    public AllergeenGroep getAllergeenGroep() {
        return AllergeenGroep;
    }

    public void setAllergeenGroep(AllergeenGroep AllergeenGroep) {
        this.AllergeenGroep = AllergeenGroep;
    }

    @Override
    public void setId(int id) {
        this.AllergeenId=id;
    }
    
     @Override
    public int getId() {
        return this.AllergeenId;
    }
}
