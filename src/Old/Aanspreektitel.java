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
public class Aanspreektitel implements Old{
    private int id_aanspreektitel;
    private String omschrijvingn;
    private String omschrijvingf;
    private String afkortingn;
    private String afkortingf;
    private int cc;
    private String id_convertie;

    public Aanspreektitel(int id_aanspreektitel, String omschrijvingn, String omschrijvingf, String afkortingn, String afkortingf, int cc, String id_convertie) {
        this.id_aanspreektitel = id_aanspreektitel;
        this.omschrijvingn = omschrijvingn;
        this.omschrijvingf = omschrijvingf;
        this.afkortingn = afkortingn;
        this.afkortingf = afkortingf;
        this.cc = cc;
        this.id_convertie = id_convertie;
    }
    
    public Aanspreektitel(String[] data){
        this.id_aanspreektitel = Util.Int(data[0]);
        this.omschrijvingn = data[1];
        this.omschrijvingf = data[2];
        this.afkortingn = data[3];
        this.afkortingf = data[4];
        this.cc = Util.Int(data[5]);
        this.id_convertie = data[6];
    }

    public int getId_aanspreektitel() {
        return id_aanspreektitel;
    }

    public void setId_aanspreektitel(int id_aanspreektitel) {
        this.id_aanspreektitel = id_aanspreektitel;
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

    public String getAfkortingn() {
        return afkortingn;
    }

    public void setAfkortingn(String afkortingn) {
        this.afkortingn = afkortingn;
    }

    public String getAfkortingf() {
        return afkortingf;
    }

    public void setAfkortingf(String afkortingf) {
        this.afkortingf = afkortingf;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getId_convertie() {
        return id_convertie;
    }

    public void setId_convertie(String id_convertie) {
        this.id_convertie = id_convertie;
    }
    
    
}
