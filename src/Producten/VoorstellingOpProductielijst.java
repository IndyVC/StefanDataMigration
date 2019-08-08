/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;

/**
 *
 * @author stefa
 */
public class VoorstellingOpProductielijst implements New{

    public int VoorstellingOpProductielijstId;
    public boolean LijnNaOmschrijving;
    public boolean ArceringOmschrijving;

    public VoorstellingOpProductielijst() {
    }

    public VoorstellingOpProductielijst(int VoorstellingOpProductielijstId, boolean LijnNaOmschrijving, boolean ArceringOmschrijving) {
        this.VoorstellingOpProductielijstId = VoorstellingOpProductielijstId;
        this.LijnNaOmschrijving = LijnNaOmschrijving;
        this.ArceringOmschrijving = ArceringOmschrijving;
    }

    public int getVoorstellingOpProductielijstId() {
        return VoorstellingOpProductielijstId;
    }

    public void setVoorstellingOpProductielijstId(int VoorstellingOpProductielijstId) {
        this.VoorstellingOpProductielijstId = VoorstellingOpProductielijstId;
    }

    public boolean isLijnNaOmschrijving() {
        return LijnNaOmschrijving;
    }

    public void setLijnNaOmschrijving(boolean LijnNaOmschrijving) {
        this.LijnNaOmschrijving = LijnNaOmschrijving;
    }

    public boolean isArceringOmschrijving() {
        return ArceringOmschrijving;
    }

    public void setArceringOmschrijving(boolean ArceringOmschrijving) {
        this.ArceringOmschrijving = ArceringOmschrijving;
    }

    @Override
    public void setId(int id) {
        this.VoorstellingOpProductielijstId=id;
    }
 @Override
    public int getId() {
        return this.VoorstellingOpProductielijstId;
    }
}
