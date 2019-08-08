/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import Old.Printer;
import enums.EtiketType;

/**
 *
 * @author stefa
 */
public class Etiket implements New{

    public int EtiketId;
    public String BestandsNaam;
    public Omschrijving Omschrijving;
    public EtiketType EtiketType;
    public Printer Printer;

    public Etiket() {
    }

    public Etiket(int EtiketId, String BestandsNaam, Omschrijving Omschrijving, EtiketType EtiketType, Printer Printer) {
        this.EtiketId = EtiketId;
        this.BestandsNaam = BestandsNaam;
        this.Omschrijving = Omschrijving;
        this.EtiketType = EtiketType;
        this.Printer = Printer;
    }

    public int getEtiketId() {
        return EtiketId;
    }

    public void setEtiketId(int EtiketId) {
        this.EtiketId = EtiketId;
    }

    public String getBestandsNaam() {
        return BestandsNaam;
    }

    public void setBestandsNaam(String BestandsNaam) {
        this.BestandsNaam = BestandsNaam;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public EtiketType getEtiketType() {
        return EtiketType;
    }

    public void setEtiketType(EtiketType EtiketType) {
        this.EtiketType = EtiketType;
    }

    public Printer getPrinter() {
        return Printer;
    }

    public void setPrinter(Printer Printer) {
        this.Printer = Printer;
    }

    @Override
    public void setId(int id) {
        this.EtiketId=id;
    }
    
     @Override
    public int getId() {
        return this.EtiketId;
    }
}
