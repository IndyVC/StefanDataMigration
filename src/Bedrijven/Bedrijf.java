/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Adressen.Adres;
import New.New;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Bedrijf implements New{

    public int BedrijfId;
    public String Naam;
    public String TelefoonNummer;
    public String Email;
    public Adres Adres;
    public List<Vestiging> Vestigingen;

    public Bedrijf() {
    }

    public Bedrijf(int BedrijfId, String Naam, String TelefoonNummer, String Email, Adres Adres, List<Vestiging> Vestigingen) {
        this.BedrijfId = BedrijfId;
        this.Naam = Naam;
        this.TelefoonNummer = TelefoonNummer;
        this.Email = Email;
        this.Adres = Adres;
        this.Vestigingen = Vestigingen;
    }

    public int getBedrijfId() {
        return BedrijfId;
    }

    public String getNaam() {
        return Naam;
    }

    public String getTelefoonNummer() {
        return TelefoonNummer;
    }

    public String getEmail() {
        return Email;
    }

    public Adres getAdres() {
        return Adres;
    }

    public List<Vestiging> getVestigingen() {
        return Vestigingen;
    }

    public void setBedrijfId(int BedrijfId) {
        this.BedrijfId = BedrijfId;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public void setTelefoonNummer(String TelefoonNummer) {
        this.TelefoonNummer = TelefoonNummer;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }

    public void setVestigingen(List<Vestiging> Vestigingen) {
        this.Vestigingen = Vestigingen;
    }

    @Override
    public void setId(int id) {
        this.BedrijfId=id;
    }

    @Override
    public int getId() {
        return this.BedrijfId;
    }
    
    
}
