/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gebruikers;

import Bedrijven.FunctieVanPersoon;
import New.New;

/**
 *
 * @author stefa
 */
public class Werknemer implements New{
    
    public int WerknemerId;
    public String LoginId;
    public String Naam;
    public String Email;
    public FunctieVanPersoon FunctieVanPersoon;

    public Werknemer() {
    }

    public Werknemer(int WerknemerId, String LoginId, String Naam, String Email, FunctieVanPersoon FunctieVanPersoon) {
        this.WerknemerId = WerknemerId;
        this.LoginId = LoginId;
        this.Naam = Naam;
        this.Email = Email;
        this.FunctieVanPersoon = FunctieVanPersoon;
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

    @Override
    public void setId(int id) {
        this.WerknemerId=id;
    }
    
     @Override
    public int getId() {
        return this.WerknemerId;
    }
}
