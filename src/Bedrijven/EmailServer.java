/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import New.New;

/**
 *
 * @author stefa
 */
public class EmailServer implements New{
    public int EmailServerId;
    public String Servernaam;
    public int Poort;
    public boolean Authentificatie;
    public String Gebruikersnaam;
    public String Paswoord;

    public EmailServer() {
    }

    public EmailServer(int EmailServerId, String Servernaam, int Poort, boolean Authentificatie, String Gebruikersnaam, String Paswoord) {
        this.EmailServerId = EmailServerId;
        this.Servernaam = Servernaam;
        this.Poort = Poort;
        this.Authentificatie = Authentificatie;
        this.Gebruikersnaam = Gebruikersnaam;
        this.Paswoord = Paswoord;
    }

    public int getEmailServerId() {
        return EmailServerId;
    }

    public void setEmailServerId(int EmailServerId) {
        this.EmailServerId = EmailServerId;
    }

    public String getServernaam() {
        return Servernaam;
    }

    public void setServernaam(String Servernaam) {
        this.Servernaam = Servernaam;
    }

    public int getPoort() {
        return Poort;
    }

    public void setPoort(int Poort) {
        this.Poort = Poort;
    }

    public boolean isAuthentificatie() {
        return Authentificatie;
    }

    public void setAuthentificatie(boolean Authentificatie) {
        this.Authentificatie = Authentificatie;
    }

    public String getGebruikersnaam() {
        return Gebruikersnaam;
    }

    public void setGebruikersnaam(String Gebruikersnaam) {
        this.Gebruikersnaam = Gebruikersnaam;
    }

    public String getPaswoord() {
        return Paswoord;
    }

    public void setPaswoord(String Paswoord) {
        this.Paswoord = Paswoord;
    }

    @Override
    public void setId(int id) {
        this.EmailServerId = id;
    }

    @Override
    public int getId() {
        return this.EmailServerId;
    }
    
}
