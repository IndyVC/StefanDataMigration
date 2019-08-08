/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adressen;

import New.New;

/**
 *
 * @author stefa
 */
public class OntvangstAdres implements New{

    public int OntvangstAdresId;
    public Adres Adres;
    public String Naam;
    public String Telefoonnummer;

    public OntvangstAdres() {
    }

    public OntvangstAdres(int OntvangstAdresId, Adres adres, String naam, String telefoonnummer) {
        this.OntvangstAdresId = OntvangstAdresId;
        this.Adres = adres;
        this.Naam = naam;
        this.Telefoonnummer = telefoonnummer;
    }

    public int getOntvangstAdresId() {
        return OntvangstAdresId;
    }

    public Adres getAdres() {
        return Adres;
    }

    public String getNaam() {
        return Naam;
    }

    public String getTelefoonnummer() {
        return Telefoonnummer;
    }

    public void setOntvangstAdresId(int OntvangstAdresId) {
        this.OntvangstAdresId = OntvangstAdresId;
    }

    public void setAdresId(Adres AdresId) {
        this.Adres = AdresId;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public void setTelefoonnummer(String Telefoonnummer) {
        this.Telefoonnummer = Telefoonnummer;
    }

    @Override
    public void setId(int id) {
        this.OntvangstAdresId = id;
    }

    @Override
    public int getId() {
        return this.OntvangstAdresId;
    }

}
