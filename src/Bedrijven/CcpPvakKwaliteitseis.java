/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Algemeen.Omschrijving;
import New.New;
import enums.CcpPva;

/**
 *
 * @author stefa
 */
public class CcpPvakKwaliteitseis implements New{
    
    public int CcpPvakKwaliteitseisId;
    public CcpPva SoortAandachtspunt;
    public boolean Verplicht;
    public Omschrijving Omschrijving;
    public String Bestandsnaam;
    public boolean Blokkeren;
    public String Beschrijving;

    public CcpPvakKwaliteitseis(int CcpPvakKwaliteitseisId, CcpPva SoortAandachtspunt, boolean Verplicht, Omschrijving Omschrijving, String Bestandsnaam, boolean Blokkeren, String Beschrijving) {
        this.CcpPvakKwaliteitseisId = CcpPvakKwaliteitseisId;
        this.SoortAandachtspunt = SoortAandachtspunt;
        this.Verplicht = Verplicht;
        this.Omschrijving = Omschrijving;
        this.Bestandsnaam = Bestandsnaam;
        this.Blokkeren = Blokkeren;
        this.Beschrijving = Beschrijving;
    }

    public int getCcpPvakKwaliteitseisId() {
        return CcpPvakKwaliteitseisId;
    }

    public void setCcpPvakKwaliteitseisId(int CcpPvakKwaliteitseisId) {
        this.CcpPvakKwaliteitseisId = CcpPvakKwaliteitseisId;
    }

    public CcpPva getSoortAandachtspunt() {
        return SoortAandachtspunt;
    }

    public void setSoortAandachtspunt(CcpPva SoortAandachtspunt) {
        this.SoortAandachtspunt = SoortAandachtspunt;
    }

    public boolean isVerplicht() {
        return Verplicht;
    }

    public void setVerplicht(boolean Verplicht) {
        this.Verplicht = Verplicht;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public String getBestandsnaam() {
        return Bestandsnaam;
    }

    public void setBestandsnaam(String Bestandsnaam) {
        this.Bestandsnaam = Bestandsnaam;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public String getBeschrijving() {
        return Beschrijving;
    }

    public void setBeschrijving(String Beschrijving) {
        this.Beschrijving = Beschrijving;
    }

    @Override
    public void setId(int id) {
        this.CcpPvakKwaliteitseisId=id;
    }

    @Override
    public int getId() {
        return this.CcpPvakKwaliteitseisId;
    }
    
    
}
