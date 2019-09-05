/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gebruikers;
import java.sql.Date;
import Bedrijven.FunctieVanPersoon;
import Leveringen.Werkplek;
import New.New;

/**
 *
 * @author stefa
 */
public class Werknemer implements New {

    public int WerknemerId;
    public String LoginId;
    public String Naam;
    public String Email;
    public FunctieVanPersoon FunctieVanPersoon;
    public Werkplek Werkplek;
    public String Rijksregisternummer;
    public Date GeboorteDatum;
    public int Regime;
    public Date DatumInDienst;
    
    public Werknemer() {
    }

    public Werknemer(int WerknemerId, String LoginId, String Naam, String Email, FunctieVanPersoon FunctieVanPersoon, String rijksregisternummer, Date datumInDienst, Date geboorteDatum, int regime) {
        this.WerknemerId = WerknemerId;
        this.LoginId = LoginId;
        this.Naam = Naam;
        this.Email = Email;
        this.FunctieVanPersoon = FunctieVanPersoon;
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

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
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

    public FunctieVanPersoon getFunctieVanPersoon() {
        return FunctieVanPersoon;
    }

    public void setFunctieVanPersoon(FunctieVanPersoon FunctieVanPersoon) {
        this.FunctieVanPersoon = FunctieVanPersoon;
    }

    public Werkplek getWerkplek() {
        return Werkplek;
    }

    public void setWerkplek(Werkplek Werkplek) {
        this.Werkplek = Werkplek;
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
