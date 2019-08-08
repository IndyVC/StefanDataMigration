/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adressen;

import New.New;
import enums.Land;

/**
 *
 * @author stefa
 */
public class Adres implements New {
    public int AdresId;
    public String Straat;
    public String Huisnummer;
    public String Bus;
    public String Postcode;
    public String Stad;
    public Land Land;

    public Adres() {
    }

    public Adres(int AdresId, String Straat, String Huisnummer, String Bus, String Postcode, String Stad, Land Land) {
        this.AdresId = AdresId;
        this.Straat = Straat;
        this.Huisnummer = Huisnummer;
        this.Bus = Bus;
        this.Postcode = Postcode;
        this.Stad = Stad;
        this.Land = Land;
    }

    public int getAdresId() {
        return AdresId;
    }

    public String getStraat() {
        return Straat;
    }

    public String getHuisnummer() {
        return Huisnummer;
    }

    public String getBus() {
        return Bus;
    }

    public String getPostcode() {
        return Postcode;
    }

    public String getStad() {
        return Stad;
    }

    public Land getLand() {
        return Land;
    }

    public void setAdresId(int AdresId) {
        this.AdresId = AdresId;
    }

    public void setStraat(String Straat) {
        this.Straat = Straat;
    }

    public void setHuisnummer(String Huisnummer) {
        this.Huisnummer = Huisnummer;
    }

    public void setBus(String Bus) {
        this.Bus = Bus;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public void setStad(String Stad) {
        this.Stad = Stad;
    }

    public void setLand(Land Land) {
        this.Land = Land;
    }

    @Override
    public void setId(int id) {
        this.AdresId = id;
    }

    @Override
    public int getId() {
        return this.AdresId;
    }
    
    
}
