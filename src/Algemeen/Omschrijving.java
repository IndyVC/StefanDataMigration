/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;

/**
 *
 * @author stefa
 */
public class Omschrijving implements New{
    
    public int OmschrijvingId;
    public String NederlandseOmschrijving;
    public String FranseOmschrijving;
    public String EngelseOmschrijving;

    public Omschrijving() {
        this.OmschrijvingId=-1;
    }

    public Omschrijving(int OmschrijvingId, String NederlandseOmschrijving, String FranseOmschrijving, String EngelseOmschrijving) {
        this.OmschrijvingId = OmschrijvingId;
        this.NederlandseOmschrijving = NederlandseOmschrijving;
        this.FranseOmschrijving = FranseOmschrijving;
        this.EngelseOmschrijving = EngelseOmschrijving;
    }

    public int getOmschrijvingId() {
        return OmschrijvingId;
    }

    public String getNederlandseOmschrijving() {
        return NederlandseOmschrijving;
    }

    public String getFranseOmschrijving() {
        return FranseOmschrijving;
    }

    public String getEngelseOmschrijving() {
        return EngelseOmschrijving;
    }

    public void setOmschrijvingId(int OmschrijvingId) {
        this.OmschrijvingId = OmschrijvingId;
    }

    public void setNederlandseOmschrijving(String NederlandseOmschrijving) {
        this.NederlandseOmschrijving = NederlandseOmschrijving;
    }

    public void setFranseOmschrijving(String FranseOmschrijving) {
        this.FranseOmschrijving = FranseOmschrijving;
    }

    public void setEngelseOmschrijving(String EngelseOmschrijving) {
        this.EngelseOmschrijving = EngelseOmschrijving;
    }

    @Override
    public void setId(int id) {
        this.OmschrijvingId=id;
    }

    @Override
    public int getId() {
        return this.OmschrijvingId;
    }
    
    
}
