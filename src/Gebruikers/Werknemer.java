/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gebruikers;

import Algemeen.Planning;
import java.sql.Date;
import Bedrijven.FunctieVanPersoon;
import Leveringen.Werkplek;
import New.New;
import TussenTabellen.WerknemerFunctie;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Werknemer implements New {

    public int WerknemerId;
    public String Voornaam;
    public String Naam;
    public String Email;
    public String Rijksregisternummer;
    public Date GeboorteDatum;
    public int Regime;
    public Date DatumInDienst;
    public List<WerknemerFunctie> Functies;
    public List<Planning> Planningen;

    public Werknemer() {
    }

    public Werknemer(int WerknemerId, String Voornaam, String Naam, String Email, String rijksregisternummer, Date datumInDienst, Date geboorteDatum, int regime) {
        this.WerknemerId = WerknemerId;
        this.Voornaam = Voornaam;
        this.Naam = Naam;
        this.Email = Email;
    }

    public String getRijksregisternummer() {
        return Rijksregisternummer;
    }

    public void setRijksregisternummer(String Rijksregisternummer) {
        this.Rijksregisternummer = Rijksregisternummer;
    }

    public Date getGeboorteDatum() {
        return GeboorteDatum;
    }

    public void setGeboorteDatum(Date GeboorteDatum) {
        this.GeboorteDatum = GeboorteDatum;
    }

    public int getRegime() {
        return Regime;
    }

    public void setRegime(int Regime) {
        this.Regime = Regime;
    }

    public Date getDatumInDienst() {
        return DatumInDienst;
    }

    public void setDatumInDienst(Date DatumInDienst) {
        this.DatumInDienst = DatumInDienst;
    }

    public int getWerknemerId() {
        return WerknemerId;
    }

    public void setWerknemerId(int WerknemerId) {
        this.WerknemerId = WerknemerId;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String Voornaam) {
        this.Voornaam = Voornaam;
    }

    public List<WerknemerFunctie> getFuncties() {
        return Functies;
    }

    public void setFuncties(List<WerknemerFunctie> Functie) {
        this.Functies = Functie;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Planning> getPlanningen() {
        return Planningen;
    }

    public void setPlanningen(List<Planning> Planningen) {
        this.Planningen = Planningen;
    }


    @Override
    public void setId(int id) {
        this.WerknemerId = id;
    }

    @Override
    public int getId() {
        return this.WerknemerId;
    }
}
