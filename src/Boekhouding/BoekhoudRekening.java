/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import New.New;

/**
 *
 * @author stefa
 */
public class BoekhoudRekening implements New{
    
    public int BoekhoudRekeningId;
    public String BoekhoudRekeningNummer;
    public String Naam;

    public BoekhoudRekening() {
    }

    public BoekhoudRekening(int BoekhoudRekeningId, String BoekhoudRekeningNummer, String Naam) {
        this.BoekhoudRekeningId = BoekhoudRekeningId;
        this.BoekhoudRekeningNummer = BoekhoudRekeningNummer;
        this.Naam = Naam;
    }

    public int getBoekhoudRekeningId() {
        return BoekhoudRekeningId;
    }

    public void setBoekhoudRekeningId(int BoekhoudRekeningId) {
        this.BoekhoudRekeningId = BoekhoudRekeningId;
    }

    public String getBoekhoudRekeningNummer() {
        return BoekhoudRekeningNummer;
    }

    public void setBoekhoudRekeningNummer(String BoekhoudRekeningNummer) {
        this.BoekhoudRekeningNummer = BoekhoudRekeningNummer;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    @Override
    public void setId(int id) {
        this.BoekhoudRekeningId=id;
    }
     @Override
    public int getId() {
        return this.BoekhoudRekeningId;
    }
    
}
