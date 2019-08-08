/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import New.New;
import Old.Klant.Klant;
import TussenTabellen.KlantKorting;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Korting implements New {

    public int KortingId;
    public KortingCategorie KortingCategorie;
    public String KortingCode;
    public double Waarde;
    public List<KlantKorting> KortingenKlant;
    public List<Klant> Klanten;

    public Korting() {
    }

    public Korting(int KortingId, KortingCategorie KortingCategorie, String KortingCode, double Waarde, List<KlantKorting> KortingenKlant, List<Klant> Klanten) {
        this.KortingId = KortingId;
        this.KortingCategorie = KortingCategorie;
        this.KortingCode = KortingCode;
        this.Waarde = Waarde;
        this.KortingenKlant = KortingenKlant;
        this.Klanten = Klanten;
    }

    public int getKortingId() {
        return KortingId;
    }

    public void setKortingId(int KortingId) {
        this.KortingId = KortingId;
    }

    public KortingCategorie getKortingCategorie() {
        return KortingCategorie;
    }

    public void setKortingCategorie(KortingCategorie KortingCategorie) {
        this.KortingCategorie = KortingCategorie;
    }

    public String getKortingCode() {
        return KortingCode;
    }

    public void setKortingCode(String KortingCode) {
        this.KortingCode = KortingCode;
    }

    public double getWaarde() {
        return Waarde;
    }

    public void setWaarde(double Waarde) {
        this.Waarde = Waarde;
    }

    public List<KlantKorting> getKortingenKlant() {
        return KortingenKlant;
    }

    public void setKortingenKlant(List<KlantKorting> KortingenKlant) {
        this.KortingenKlant = KortingenKlant;
    }

    public List<Klant> getKlanten() {
        return Klanten;
    }

    public void setKlanten(List<Klant> Klanten) {
        this.Klanten = Klanten;
    }

    @Override
    public void setId(int id) {
        this.KortingId=id;
    }
 @Override
    public int getId() {
        return this.KortingId;
    }
}
