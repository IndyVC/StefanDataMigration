/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class Verkoopsverpakking implements New{

    public int VerkoopsVerpakkingId;

    public Omschrijving Omschrijving;

    public Verkoopsverdeelgroep Verkoopsverdeelgroep;

    public int HoeveelheidVerpakking;

    public int HoeveelheidGrootverpakking;

    public boolean VerdelenGrootverpakking;

    public boolean CombinerenMeerdereProducten;

    public boolean Blokkeren;

    public Verkoopsverpakking() {
    }

    public Verkoopsverpakking(int VerkoopsVerpakkingId, Omschrijving Omschrijving, Verkoopsverdeelgroep Verkoopsverdeelgroep, int HoeveelheidVerpakking, int HoeveelheidGrootverpakking, boolean VerdelenGrootverpakking, boolean CombinerenMeerdereProducten, boolean Blokkeren) {
        this.VerkoopsVerpakkingId = VerkoopsVerpakkingId;
        this.Omschrijving = Omschrijving;
        this.Verkoopsverdeelgroep = Verkoopsverdeelgroep;
        this.HoeveelheidVerpakking = HoeveelheidVerpakking;
        this.HoeveelheidGrootverpakking = HoeveelheidGrootverpakking;
        this.VerdelenGrootverpakking = VerdelenGrootverpakking;
        this.CombinerenMeerdereProducten = CombinerenMeerdereProducten;
        this.Blokkeren = Blokkeren;
    }

    public int getVerkoopsVerpakkingId() {
        return VerkoopsVerpakkingId;
    }

    public void setVerkoopsVerpakkingId(int VerkoopsVerpakkingId) {
        this.VerkoopsVerpakkingId = VerkoopsVerpakkingId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Verkoopsverdeelgroep getVerkoopsverdeelgroep() {
        return Verkoopsverdeelgroep;
    }

    public void setVerkoopsverdeelgroep(Verkoopsverdeelgroep Verkoopsverdeelgroep) {
        this.Verkoopsverdeelgroep = Verkoopsverdeelgroep;
    }

    public int getHoeveelheidVerpakking() {
        return HoeveelheidVerpakking;
    }

    public void setHoeveelheidVerpakking(int HoeveelheidVerpakking) {
        this.HoeveelheidVerpakking = HoeveelheidVerpakking;
    }

    public int getHoeveelheidGrootverpakking() {
        return HoeveelheidGrootverpakking;
    }

    public void setHoeveelheidGrootverpakking(int HoeveelheidGrootverpakking) {
        this.HoeveelheidGrootverpakking = HoeveelheidGrootverpakking;
    }

    public boolean isVerdelenGrootverpakking() {
        return VerdelenGrootverpakking;
    }

    public void setVerdelenGrootverpakking(boolean VerdelenGrootverpakking) {
        this.VerdelenGrootverpakking = VerdelenGrootverpakking;
    }

    public boolean isCombinerenMeerdereProducten() {
        return CombinerenMeerdereProducten;
    }

    public void setCombinerenMeerdereProducten(boolean CombinerenMeerdereProducten) {
        this.CombinerenMeerdereProducten = CombinerenMeerdereProducten;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.VerkoopsVerpakkingId=id;
    }
 @Override
    public int getId() {
        return this.VerkoopsVerpakkingId;
    }
}
