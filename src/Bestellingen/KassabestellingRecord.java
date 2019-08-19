/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Bedrijven.Bedrijf;
import New.New;
import Producten.Optie;
import Producten.OptieGroep;
import Producten.Variant;
import Producten.VariantGroep;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class KassabestellingRecord implements New {

    public int KassaBestellingRecordId;
    public Bedrijf Bedrijf;
    public int Volgnummer;
    public double Hoeveelheid;
    public VerkoopProduct VerkoopProductId;
    public int Aantal_Personen;
    public Variant Variant;
    public VariantGroep VariantGroep;
    public Optie Optie;
    public OptieGroep OptieGroep;
    public String Opmerking;
    public boolean VerdeelticketAfdrukken;
    public KassaBestelling KassaBestelling;

    public KassabestellingRecord() {
    }

    public KassabestellingRecord(int KassaBestellingRecordId, Bedrijf Bedrijf, int Volgnummer, double Hoeveelheid, VerkoopProduct VerkoopProductId, int Aantal_Personen, Variant Variant, VariantGroep VariantGroep, Optie Optie, OptieGroep OptieGroep, String Opmerking, boolean VerdeelticketAfdrukken, KassaBestelling KassaBestelling) {
        this.KassaBestellingRecordId = KassaBestellingRecordId;
        this.Bedrijf = Bedrijf;
        this.Volgnummer = Volgnummer;
        this.Hoeveelheid = Hoeveelheid;
        this.VerkoopProductId = VerkoopProductId;
        this.Aantal_Personen = Aantal_Personen;
        this.Variant = Variant;
        this.VariantGroep = VariantGroep;
        this.Optie = Optie;
        this.OptieGroep = OptieGroep;
        this.Opmerking = Opmerking;
        this.VerdeelticketAfdrukken = VerdeelticketAfdrukken;
        this.KassaBestelling = KassaBestelling;
    }

    public KassaBestelling getKassaBestelling() {
        return KassaBestelling;
    }

    public void setKassaBestelling(KassaBestelling KassaBestelling) {
        this.KassaBestelling = KassaBestelling;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public int getKassaBestellingRecordId() {
        return KassaBestellingRecordId;
    }

    public void setKassaBestellingRecordId(int KassaBestellingRecordId) {
        this.KassaBestellingRecordId = KassaBestellingRecordId;
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

    public void setHoeveelheid(double Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public VerkoopProduct getVerkoopProductId() {
        return VerkoopProductId;
    }

    public void setVerkoopProductId(VerkoopProduct VerkoopProductId) {
        this.VerkoopProductId = VerkoopProductId;
    }

    public int getAantal_Personen() {
        return Aantal_Personen;
    }

    public void setAantal_Personen(int Aantal_Personen) {
        this.Aantal_Personen = Aantal_Personen;
    }

    public Variant getVariant() {
        return Variant;
    }

    public void setVariant(Variant Variant) {
        this.Variant = Variant;
    }

    public VariantGroep getVariantGroep() {
        return VariantGroep;
    }

    public void setVariantGroep(VariantGroep VariantGroep) {
        this.VariantGroep = VariantGroep;
    }

    public Optie getOptie() {
        return Optie;
    }

    public void setOptie(Optie Optie) {
        this.Optie = Optie;
    }

    public OptieGroep getOptieGroep() {
        return OptieGroep;
    }

    public void setOptieGroep(OptieGroep OptieGroep) {
        this.OptieGroep = OptieGroep;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    public boolean isVerdeelticketAfdrukken() {
        return VerdeelticketAfdrukken;
    }

    public void setVerdeelticketAfdrukken(boolean VerdeelticketAfdrukken) {
        this.VerdeelticketAfdrukken = VerdeelticketAfdrukken;
    }

    @Override
    public void setId(int id) {
        this.KassaBestellingRecordId=id;
    }

    @Override
    public int getId() {
        return this.KassaBestellingRecordId;
    }

}
