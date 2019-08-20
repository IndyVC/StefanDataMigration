/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Adressen.Adres;
import Bedrijven.Bedrijf;
import Gebruikers.Gebruiker;
import New.New;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Kassabestelling implements New {

    public int KassaBestellingId;
    public Bedrijf Bedrijf;
    public Klant Klant;
    public int BestellingKassaId;
    public String Uur;
    public boolean Levering;
    public String Naam;
    public Adres Adres;
    public String Telefoon;
    public String Email;
    public String Memo;
    public boolean WinkelBestelling;
    public Gebruiker Gebruiker;
    public int ObvVasteBestelling;
    public String ProkasRefKlant;
    public int PercentageVasteBestelling;
    public List<KassabestellingRecord> KassaBestellingRecords;

    public Kassabestelling() {
    }

    public Kassabestelling(int KassaBestellingId, Bedrijf Bedrijf, Klant Klant, int BestellingKassaId, String Uur, boolean Levering, String Naam, Adres Adres, String Telefoon, String Email, String Memo, boolean WinkelBestelling, Gebruiker Gebruiker, int ObvVasteBestelling, String ProkasRefKlant, int PercentageVasteBestelling) {
        this.KassaBestellingId = KassaBestellingId;
        this.Bedrijf = Bedrijf;
        this.Klant = Klant;
        this.BestellingKassaId = BestellingKassaId;
        this.Uur = Uur;
        this.Levering = Levering;
        this.Naam = Naam;
        this.Adres = Adres;
        this.Telefoon = Telefoon;
        this.Email = Email;
        this.Memo = Memo;
        this.WinkelBestelling = WinkelBestelling;
        this.Gebruiker = Gebruiker;
        this.ObvVasteBestelling = ObvVasteBestelling;
        this.ProkasRefKlant = ProkasRefKlant;
        this.PercentageVasteBestelling = PercentageVasteBestelling;
        this.KassaBestellingRecords = new ArrayList();
    }

    public int getKassaBestellingId() {
        return KassaBestellingId;
    }

    public void setKassaBestellingId(int KassaBestellingId) {
        this.KassaBestellingId = KassaBestellingId;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public int getBestellingKassaId() {
        return BestellingKassaId;
    }

    public void setBestellingKassaId(int BestellingKassaId) {
        this.BestellingKassaId = BestellingKassaId;
    }

    public String getUur() {
        return Uur;
    }

    public void setUur(String Uur) {
        this.Uur = Uur;
    }

    public boolean isLevering() {
        return Levering;
    }

    public void setLevering(boolean Levering) {
        this.Levering = Levering;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public Adres getAdres() {
        return Adres;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }

    public String getTelefoon() {
        return Telefoon;
    }

    public void setTelefoon(String Telefoon) {
        this.Telefoon = Telefoon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public boolean isWinkelBestelling() {
        return WinkelBestelling;
    }

    public void setWinkelBestelling(boolean WinkelBestelling) {
        this.WinkelBestelling = WinkelBestelling;
    }

    public Gebruiker getGebruiker() {
        return Gebruiker;
    }

    public void setGebruiker(Gebruiker Gebruiker) {
        this.Gebruiker = Gebruiker;
    }

    public int getObvVasteBestelling() {
        return ObvVasteBestelling;
    }

    public void setObvVasteBestelling(int ObvVasteBestelling) {
        this.ObvVasteBestelling = ObvVasteBestelling;
    }

    public String getProkasRefKlant() {
        return ProkasRefKlant;
    }

    public void setProkasRefKlant(String ProkasRefKlant) {
        this.ProkasRefKlant = ProkasRefKlant;
    }

    public int getPercentageVasteBestelling() {
        return PercentageVasteBestelling;
    }

    public void setPercentageVasteBestelling(int PercentageVasteBestelling) {
        this.PercentageVasteBestelling = PercentageVasteBestelling;
    }

    public List<KassabestellingRecord> getKassaBestellingRecords() {
        return KassaBestellingRecords;
    }

    public void setKassaBestellingRecords(List<KassabestellingRecord> KassaBestellingRecords) {
        this.KassaBestellingRecords = KassaBestellingRecords;
    }

    @Override
    public void setId(int id) {
        this.KassaBestellingId = id;
    }

    @Override
    public int getId() {
        return this.KassaBestellingId;
    }

}
