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
public class AllergeenGroep implements New {

    public int AllergeenGroepId;
    public Omschrijving Omschrijving;

    public AllergeenGroep() {
    }

    public AllergeenGroep(int AllergeenGroepId, Omschrijving Omschrijving) {
        this.AllergeenGroepId = AllergeenGroepId;
        this.Omschrijving = Omschrijving;
    }

    public int getAllergeenGroepId() {
        return AllergeenGroepId;
    }

    public void setAllergeenGroepId(int AllergeenGroepId) {
        this.AllergeenGroepId = AllergeenGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {

        this.AllergeenGroepId = id;
    }
     @Override
    public int getId() {
        return this.AllergeenGroepId;
    }

}
