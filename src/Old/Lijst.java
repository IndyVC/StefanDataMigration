/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Old;

import Utils.Util;

/**
 *
 * @author stefa
 */
public class Lijst implements Old{
    
    private int id_indeling;
    private int id_lijst;
    private String omschrijvingn;
    private String omschrijvingf;
    private String zoekomschrijving;
    private String naam;
    private int type;
    private int cc;
    private boolean technische_fiche;

    public Lijst(int id_indeling, int id_lijst, String omschrijvingn, String omschrijvingf, String zoekomschrijving, String naam, int type, int cc, boolean technische_fiche) {
        this.id_indeling = id_indeling;
        this.id_lijst = id_lijst;
        this.omschrijvingn = omschrijvingn;
        this.omschrijvingf = omschrijvingf;
        this.zoekomschrijving = zoekomschrijving;
        this.naam = naam;
        this.type = type;
        this.cc = cc;
        this.technische_fiche = technische_fiche;
    }
    
    public Lijst(String[] data){
        this.id_indeling = Util.Int(data[0]);
        this.id_lijst = Util.Int(data[1]);
        this.omschrijvingn = data[2];
        this.omschrijvingf = data[3];
        this.zoekomschrijving = data[4];
        this.naam = data[5];
        this.type = Util.Int(data[6]);
        this.cc = Util.Int(data[7]);
        this.technische_fiche = Util.Boolean(data[8]);
    }

    public int getId_indeling() {
        return id_indeling;
    }

    public void setId_indeling(int id_indeling) {
        this.id_indeling = id_indeling;
    }

    public int getId_lijst() {
        return id_lijst;
    }

    public void setId_lijst(int id_lijst) {
        this.id_lijst = id_lijst;
    }

    public String getOmschrijvingn() {
        return omschrijvingn;
    }

    public void setOmschrijvingn(String omschrijvingn) {
        this.omschrijvingn = omschrijvingn;
    }

    public String getOmschrijvingf() {
        return omschrijvingf;
    }

    public void setOmschrijvingf(String omschrijvingf) {
        this.omschrijvingf = omschrijvingf;
    }

    public String getZoekomschrijving() {
        return zoekomschrijving;
    }

    public void setZoekomschrijving(String zoekomschrijving) {
        this.zoekomschrijving = zoekomschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTechnische_fiche() {
        return technische_fiche;
    }

    public void setTechnische_fiche(boolean technische_fiche) {
        this.technische_fiche = technische_fiche;
    }
    
    
}
