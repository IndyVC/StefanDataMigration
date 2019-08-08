/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import java.sql.Date;

import Algemeen.Omschrijving;
import New.New;
import enums.SoortFeestdag;

/**
 *
 * @author stefa
 */
public class FeestDag implements New{

    public int FeestdagId;
    public Omschrijving Omschrijving;
    public SoortFeestdag Soortfeestdag;
    public Date StartDatum;
    public Date EindDatum;
    public boolean JaarlijksWederend;
    public boolean Blokkeren;

    public FeestDag() {
    }

    public FeestDag(int FeestdagId, Omschrijving Omschrijving, SoortFeestdag Soortfeestdag, Date StartDatum, Date EindDatum, boolean JaarlijksWederend, boolean Blokkeren) {
        this.FeestdagId = FeestdagId;
        this.Omschrijving = Omschrijving;
        this.Soortfeestdag = Soortfeestdag;
        this.StartDatum = StartDatum;
        this.EindDatum = EindDatum;
        this.JaarlijksWederend = JaarlijksWederend;
        this.Blokkeren = Blokkeren;
    }

    public int getFeestdagId() {
        return FeestdagId;
    }

    public void setFeestdagId(int FeestdagId) {
        this.FeestdagId = FeestdagId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public SoortFeestdag getSoortfeestdag() {
        return Soortfeestdag;
    }

    public void setSoortfeestdag(SoortFeestdag Soortfeestdag) {
        this.Soortfeestdag = Soortfeestdag;
    }

    public Date getStartDatum() {
        return StartDatum;
    }

    public void setStartDatum(Date StartDatum) {
        this.StartDatum = StartDatum;
    }

    public Date getEindDatum() {
        return EindDatum;
    }

    public void setEindDatum(Date EindDatum) {
        this.EindDatum = EindDatum;
    }

    public boolean isJaarlijksWederend() {
        return JaarlijksWederend;
    }

    public void setJaarlijksWederend(boolean JaarlijksWederend) {
        this.JaarlijksWederend = JaarlijksWederend;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.FeestdagId=id;
    }

    @Override
    public int getId() {
        return this.FeestdagId;
    }
    
    

}
