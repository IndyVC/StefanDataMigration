/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class VasteKost implements New{
    
    public int VasteKostId;
    public Omschrijving Omschrijving;
    public double PercentageAtelierkosten;
    public double PercentageVerkoopskosten;
    public double PercentageBeheerskosten;
    public double PercentageAndereKosten;
    public boolean Blokkeren;

    public VasteKost() {
    }

    public VasteKost(int VasteKostId, Omschrijving Omschrijving, double PercentageAtelierkosten, double PercentageVerkoopskosten, double PercentageBeheerskosten, double PercentageAndereKosten, boolean Blokkeren) {
        this.VasteKostId = VasteKostId;
        this.Omschrijving = Omschrijving;
        this.PercentageAtelierkosten = PercentageAtelierkosten;
        this.PercentageVerkoopskosten = PercentageVerkoopskosten;
        this.PercentageBeheerskosten = PercentageBeheerskosten;
        this.PercentageAndereKosten = PercentageAndereKosten;
        this.Blokkeren = Blokkeren;
    }

    public int getVasteKostId() {
        return VasteKostId;
    }

    public void setVasteKostId(int VasteKostId) {
        this.VasteKostId = VasteKostId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public double getPercentageAtelierkosten() {
        return PercentageAtelierkosten;
    }

    public void setPercentageAtelierkosten(double PercentageAtelierkosten) {
        this.PercentageAtelierkosten = PercentageAtelierkosten;
    }

    public double getPercentageVerkoopskosten() {
        return PercentageVerkoopskosten;
    }

    public void setPercentageVerkoopskosten(double PercentageVerkoopskosten) {
        this.PercentageVerkoopskosten = PercentageVerkoopskosten;
    }

    public double getPercentageBeheerskosten() {
        return PercentageBeheerskosten;
    }

    public void setPercentageBeheerskosten(double PercentageBeheerskosten) {
        this.PercentageBeheerskosten = PercentageBeheerskosten;
    }

    public double getPercentageAndereKosten() {
        return PercentageAndereKosten;
    }

    public void setPercentageAndereKosten(double PercentageAndereKosten) {
        this.PercentageAndereKosten = PercentageAndereKosten;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.VasteKostId=id;
    }
    
     @Override
    public int getId() {
        return this.VasteKostId;
    }
}
