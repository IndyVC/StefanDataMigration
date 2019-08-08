/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Adressen.Adres;
import New.New;
import enums.Taal;

/**
 *
 * @author stefa
 */
public class PrivateLabel implements New{
    
    public int PrivateLabelId;
    public String Aansprekingen;
    public String Naam;
    public Adres Adres;
    public Taal Taal;
    public String URLWebsite;
    public String Logo;
    public String Telefoonnummer;

    public PrivateLabel() {
    }

    public PrivateLabel(int PrivateLabelId, String Aansprekingen, String Naam, Adres Adres, Taal Taal, String URLWebsite, String Logo, String Telefoonnummer) {
        this.PrivateLabelId = PrivateLabelId;
        this.Aansprekingen = Aansprekingen;
        this.Naam = Naam;
        this.Adres = Adres;
        this.Taal = Taal;
        this.URLWebsite = URLWebsite;
        this.Logo = Logo;
        this.Telefoonnummer = Telefoonnummer;
    }

    public int getPrivateLabelId() {
        return PrivateLabelId;
    }

    public void setPrivateLabelId(int PrivateLabelId) {
        this.PrivateLabelId = PrivateLabelId;
    }

    public String getAansprekingen() {
        return Aansprekingen;
    }

    public void setAansprekingen(String Aansprekingen) {
        this.Aansprekingen = Aansprekingen;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public Adres getAdres() {
        return Adres;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }

    public Taal getTaal() {
        return Taal;
    }

    public void setTaal(Taal Taal) {
        this.Taal = Taal;
    }

    public String getURLWebsite() {
        return URLWebsite;
    }

    public void setURLWebsite(String URLWebsite) {
        this.URLWebsite = URLWebsite;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public String getTelefoonnummer() {
        return Telefoonnummer;
    }

    public void setTelefoonnummer(String Telefoonnummer) {
        this.Telefoonnummer = Telefoonnummer;
    }

    @Override
    public void setId(int id) {
        this.PrivateLabelId=id;
    }

    @Override
    public int getId() {
        return this.PrivateLabelId;
    }
    
    
}
