/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import New.New;
import enums.Eenheid;
import java.sql.Date;

/**
 *
 * @author stefa
 */
public class UitgaandeBestelling implements New {

    public int UitgaandeBestellingId;
    public Date DatumBestelbon;
    public Date DatumGewensteLevering;
    public String Opmerking;
    public boolean Afgewerkt;
    public int Volgnummer;
    public double Hoeveelheid;
    public Eenheid Eenheid;
    public double Eenheidsprijs;
    public double AantalEenhedenVerpakking;
    public double AantalVerpakkingenColi;
    public double Eenheidsgewicht;
    public double Totaal;
    public int GeleverdeHoeveelheid;

    public UitgaandeBestelling() {
    }

    public UitgaandeBestelling(int UitgaandeBestellingId, Date DatumBestelbon, Date DatumGewensteLevering, String Opmerking, boolean Afgewerkt, int Volgnummer, double Hoeveelheid, Eenheid Eenheid, double Eenheidsprijs, double AantalEenhedenVerpakking, double AantalVerpakkingenColi, double Eenheidsgewicht, double Totaal, int GeleverdeHoeveelheid) {
        this.UitgaandeBestellingId = UitgaandeBestellingId;
        this.DatumBestelbon = DatumBestelbon;
        this.DatumGewensteLevering = DatumGewensteLevering;
        this.Opmerking = Opmerking;
        this.Afgewerkt = Afgewerkt;
        this.Volgnummer = Volgnummer;
        this.Hoeveelheid = Hoeveelheid;
        this.Eenheid = Eenheid;
        this.Eenheidsprijs = Eenheidsprijs;
        this.AantalEenhedenVerpakking = AantalEenhedenVerpakking;
        this.AantalVerpakkingenColi = AantalVerpakkingenColi;
        this.Eenheidsgewicht = Eenheidsgewicht;
        this.Totaal = Totaal;
        this.GeleverdeHoeveelheid = GeleverdeHoeveelheid;
    }

    public int getUitgaandeBestellingId() {
        return UitgaandeBestellingId;
    }

    public void setUitgaandeBestellingId(int UitgaandeBestellingId) {
        this.UitgaandeBestellingId = UitgaandeBestellingId;
    }

    public Date getDatumBestelbon() {
        return DatumBestelbon;
    }

    public void setDatumBestelbon(Date DatumBestelbon) {
        this.DatumBestelbon = DatumBestelbon;
    }

    public Date getDatumGewensteLevering() {
        return DatumGewensteLevering;
    }

    public void setDatumGewensteLevering(Date DatumGewensteLevering) {
        this.DatumGewensteLevering = DatumGewensteLevering;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    public boolean isAfgewerkt() {
        return Afgewerkt;
    }

    public void setAfgewerkt(boolean Afgewerkt) {
        this.Afgewerkt = Afgewerkt;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public double getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(int Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public Eenheid getEenheid() {
        return Eenheid;
    }

    public void setEenheid(Eenheid Eenheid) {
        this.Eenheid = Eenheid;
    }

    public double getEenheidsprijs() {
        return Eenheidsprijs;
    }

    public void setEenheidsprijs(double Eenheidsprijs) {
        this.Eenheidsprijs = Eenheidsprijs;
    }

    public double getAantalEenhedenVerpakking() {
        return AantalEenhedenVerpakking;
    }

    public void setAantalEenhedenVerpakking(int AantalEenhedenVerpakking) {
        this.AantalEenhedenVerpakking = AantalEenhedenVerpakking;
    }

    public double getAantalVerpakkingenColi() {
        return AantalVerpakkingenColi;
    }

    public void setAantalVerpakkingenColi(int AantalVerpakkingenColi) {
        this.AantalVerpakkingenColi = AantalVerpakkingenColi;
    }

    public double getEenheidsgewicht() {
        return Eenheidsgewicht;
    }

    public void setEenheidsgewicht(double Eenheidsgewicht) {
        this.Eenheidsgewicht = Eenheidsgewicht;
    }

    public double getTotaal() {
        return Totaal;
    }

    public void setTotaal(double Totaal) {
        this.Totaal = Totaal;
    }

    public int getGeleverdeHoeveelheid() {
        return GeleverdeHoeveelheid;
    }

    public void setGeleverdeHoeveelheid(int GeleverdeHoeveelheid) {
        this.GeleverdeHoeveelheid = GeleverdeHoeveelheid;
    }

    @Override
    public void setId(int id) {
        this.UitgaandeBestellingId = id;
    }
     @Override
    public int getId() {
        return this.UitgaandeBestellingId;
    }

}
