/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class BarcodePrefix implements New{

    public int BarcodePrefixId;
    public int Prefix;

    public Omschrijving Omschrijving;

    public String PositiesArtikelcode;

    public String PositiesVerkoopprijs;

    public int Invoeggetal;

    public boolean Extern;

    public BarcodePrefix() {
    }

    public BarcodePrefix(int BarcodePrefixId, int Prefix, Omschrijving Omschrijving, String PositiesArtikelcode, String PositiesVerkoopprijs, int Invoeggetal, boolean Extern) {
        this.BarcodePrefixId = BarcodePrefixId;
        this.Prefix = Prefix;
        this.Omschrijving = Omschrijving;
        this.PositiesArtikelcode = PositiesArtikelcode;
        this.PositiesVerkoopprijs = PositiesVerkoopprijs;
        this.Invoeggetal = Invoeggetal;
        this.Extern = Extern;
    }

    public int getBarcodePrefixId() {
        return BarcodePrefixId;
    }

    public void setBarcodePrefixId(int BarcodePrefixId) {
        this.BarcodePrefixId = BarcodePrefixId;
    }

    public int getPrefix() {
        return Prefix;
    }

    public void setPrefix(int Prefix) {
        this.Prefix = Prefix;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public String getPositiesArtikelcode() {
        return PositiesArtikelcode;
    }

    public void setPositiesArtikelcode(String PositiesArtikelcode) {
        this.PositiesArtikelcode = PositiesArtikelcode;
    }

    public String getPositiesVerkoopprijs() {
        return PositiesVerkoopprijs;
    }

    public void setPositiesVerkoopprijs(String PositiesVerkoopprijs) {
        this.PositiesVerkoopprijs = PositiesVerkoopprijs;
    }

    public int getInvoeggetal() {
        return Invoeggetal;
    }

    public void setInvoeggetal(int Invoeggetal) {
        this.Invoeggetal = Invoeggetal;
    }

    public boolean isExtern() {
        return Extern;
    }

    public void setExtern(boolean Extern) {
        this.Extern = Extern;
    }

    @Override
    public void setId(int id) {
        this.BarcodePrefixId=id;
    }
     @Override
    public int getId() {
        return this.BarcodePrefixId;
    }
    
}
