/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;
import java.sql.Date;
import Gebruikers.Werknemer;
import New.New;

/**
 *
 * @author stefa
 */
public class Klacht implements New{

    public int KlachtId;
    public String Naam;
    public Omschrijving Omschrijving;
    public Date KlachtOpgenomen;
    public Date KlachtAfgerond;
    public Werknemer KlachtMelderWerknemer;
    public boolean Afgerond;

    public Klacht(int Id, String Naam, Omschrijving Omschrijving, Date KlachtOpgenomen, Date KlachtAfgerond, Werknemer KlachtMelder, boolean Afgerond) {
        this.KlachtId = Id;
        this.Naam = Naam;
        this.Omschrijving = Omschrijving;
        this.KlachtOpgenomen = KlachtOpgenomen;
        this.KlachtAfgerond = KlachtAfgerond;
        this.KlachtMelderWerknemer = KlachtMelder;
        this.Afgerond = Afgerond;
    }

    public Klacht() {
    }

    public int getId() {
        return KlachtId;
    }

    public void setId(int Id) {
        this.KlachtId = Id;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Date getKlachtOpgenomen() {
        return KlachtOpgenomen;
    }

    public void setKlachtOpgenomen(Date KlachtOpgenomen) {
        this.KlachtOpgenomen = KlachtOpgenomen;
    }

    public Date getKlachtAfgerond() {
        return KlachtAfgerond;
    }

    public void setKlachtAfgerond(Date KlachtAfgerond) {
        this.KlachtAfgerond = KlachtAfgerond;
    }

    public Werknemer getKlachtMelderWerknemer() {
        return KlachtMelderWerknemer;
    }

    public void setKlachtMelderWerknemer(Werknemer KlachtMelderWerknemer) {
        this.KlachtMelderWerknemer = KlachtMelderWerknemer;
    }

    public boolean isAfgerond() {
        return Afgerond;
    }

    public void setAfgerond(boolean Afgerond) {
        this.Afgerond = Afgerond;
    }
   
}
