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
public class BetalingsVoorwaarde implements New{
    
    public Omschrijving Omschrijving;
    public int BetalingsVoorwaardeId;
    public String BetalingsVoorwaardeCode;
    public String Boekhouding;
    public int AantalDagen;
    public boolean FactuurdatumIsVervalDatum;

    public BetalingsVoorwaarde() {
    }

    public BetalingsVoorwaarde(Omschrijving Omschrijving, int BetalingsVoorwaardeId, String BetalingsVoorwaardeCode, String Boekhouding, int AantalDagen, boolean FactuurdatumIsVervalDatum) {
        this.Omschrijving = Omschrijving;
        this.BetalingsVoorwaardeId = BetalingsVoorwaardeId;
        this.BetalingsVoorwaardeCode = BetalingsVoorwaardeCode;
        this.Boekhouding = Boekhouding;
        this.AantalDagen = AantalDagen;
        this.FactuurdatumIsVervalDatum = FactuurdatumIsVervalDatum;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public int getBetalingsVoorwaardeId() {
        return BetalingsVoorwaardeId;
    }

    public void setBetalingsVoorwaardeId(int BetalingsVoorwaardeId) {
        this.BetalingsVoorwaardeId = BetalingsVoorwaardeId;
    }

    public String getBetalingsVoorwaardeCode() {
        return BetalingsVoorwaardeCode;
    }

    public void setBetalingsVoorwaardeCode(String BetalingsVoorwaardeCode) {
        this.BetalingsVoorwaardeCode = BetalingsVoorwaardeCode;
    }

    public String getBoekhouding() {
        return Boekhouding;
    }

    public void setBoekhouding(String Boekhouding) {
        this.Boekhouding = Boekhouding;
    }

    public int getAantalDagen() {
        return AantalDagen;
    }

    public void setAantalDagen(int AantalDagen) {
        this.AantalDagen = AantalDagen;
    }

    public boolean isFactuurdatumIsVervalDatum() {
        return FactuurdatumIsVervalDatum;
    }

    public void setFactuurdatumIsVervalDatum(boolean FactuurdatumIsVervalDatum) {
        this.FactuurdatumIsVervalDatum = FactuurdatumIsVervalDatum;
    }

    @Override
    public void setId(int id) {
        this.BetalingsVoorwaardeId=id;
    }
     @Override
    public int getId() {
        return this.BetalingsVoorwaardeId;
    }
    
}
