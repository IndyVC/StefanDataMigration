/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voorraden;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class VoorraadProduct implements New {

    public int VoorraadProductId;

    public Omschrijving Omschrijving;
    public boolean Voorraad;

    public boolean VoorraadOpMaandag;

    public boolean VoorraadOpDinsdag;

    public boolean VoorraadOpWoensdag;

    public boolean VoorraadOpDonderdag;

    public boolean VoorraadOpVrijdag;

    public boolean VoorraadOpZaterdag;

    public boolean VoorraadOpZondag;

    public VoorraadProduct() {
    }

    public VoorraadProduct(int VoorraadProductId, Omschrijving Omschrijving, boolean Voorraad, boolean VoorraadOpMaandag, boolean VoorraadOpDinsdag, boolean VoorraadOpWoensdag, boolean VoorraadOpDonderdag, boolean VoorraadOpVrijdag, boolean VoorraadOpZaterdag, boolean VoorraadOpZondag) {
        this.VoorraadProductId = VoorraadProductId;
        this.Omschrijving = Omschrijving;
        this.Voorraad = Voorraad;
        this.VoorraadOpMaandag = VoorraadOpMaandag;
        this.VoorraadOpDinsdag = VoorraadOpDinsdag;
        this.VoorraadOpWoensdag = VoorraadOpWoensdag;
        this.VoorraadOpDonderdag = VoorraadOpDonderdag;
        this.VoorraadOpVrijdag = VoorraadOpVrijdag;
        this.VoorraadOpZaterdag = VoorraadOpZaterdag;
        this.VoorraadOpZondag = VoorraadOpZondag;
    }

    public int getVoorraadProductId() {
        return VoorraadProductId;
    }

    public void setVoorraadProductId(int VoorraadProductId) {
        this.VoorraadProductId = VoorraadProductId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isVoorraad() {
        return Voorraad;
    }

    public void setVoorraad(boolean Voorraad) {
        this.Voorraad = Voorraad;
    }

    public boolean isVoorraadOpMaandag() {
        return VoorraadOpMaandag;
    }

    public void setVoorraadOpMaandag(boolean VoorraadOpMaandag) {
        this.VoorraadOpMaandag = VoorraadOpMaandag;
    }

    public boolean isVoorraadOpDinsdag() {
        return VoorraadOpDinsdag;
    }

    public void setVoorraadOpDinsdag(boolean VoorraadOpDinsdag) {
        this.VoorraadOpDinsdag = VoorraadOpDinsdag;
    }

    public boolean isVoorraadOpWoensdag() {
        return VoorraadOpWoensdag;
    }

    public void setVoorraadOpWoensdag(boolean VoorraadOpWoensdag) {
        this.VoorraadOpWoensdag = VoorraadOpWoensdag;
    }

    public boolean isVoorraadOpDonderdag() {
        return VoorraadOpDonderdag;
    }

    public void setVoorraadOpDonderdag(boolean VoorraadOpDonderdag) {
        this.VoorraadOpDonderdag = VoorraadOpDonderdag;
    }

    public boolean isVoorraadOpVrijdag() {
        return VoorraadOpVrijdag;
    }

    public void setVoorraadOpVrijdag(boolean VoorraadOpVrijdag) {
        this.VoorraadOpVrijdag = VoorraadOpVrijdag;
    }

    public boolean isVoorraadOpZaterdag() {
        return VoorraadOpZaterdag;
    }

    public void setVoorraadOpZaterdag(boolean VoorraadOpZaterdag) {
        this.VoorraadOpZaterdag = VoorraadOpZaterdag;
    }

    public boolean isVoorraadOpZondag() {
        return VoorraadOpZondag;
    }

    public void setVoorraadOpZondag(boolean VoorraadOpZondag) {
        this.VoorraadOpZondag = VoorraadOpZondag;
    }

    @Override
    public void setId(int id) {
        this.VoorraadProductId=id;
    }
     @Override
    public int getId() {
        return this.VoorraadProductId;
    }
    
}
