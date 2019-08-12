/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import enums.Printertype;

/**
 *
 * @author stefa
 */
public class Printer implements New{
    public int PrinterId;
        public Omschrijving LocatieOmschrijvingOmschrijving;
        public Omschrijving Omschrijving;
        public Printertype PrinterType;
        public boolean StandaardVoorBestelbonnen;
        public boolean StandaardVoorVerzendbonnen;

    public Printer() {
    }

    public Printer(int PrinterId, Omschrijving LocatieOmschrijving, Omschrijving Omschrijving, Printertype PrinterType, boolean StandaardVoorBestelbonnen, boolean StandaardVoorVerzendbonnen) {
        this.PrinterId = PrinterId;
        this.LocatieOmschrijvingOmschrijving = LocatieOmschrijving;
        this.Omschrijving = Omschrijving;
        this.PrinterType = PrinterType;
        this.StandaardVoorBestelbonnen = StandaardVoorBestelbonnen;
        this.StandaardVoorVerzendbonnen = StandaardVoorVerzendbonnen;
    }

    public int getPrinterId() {
        return PrinterId;
    }

    public void setPrinterId(int PrinterId) {
        this.PrinterId = PrinterId;
    }

    public Omschrijving getLocatieOmschrijvingOmschrijving() {
        return LocatieOmschrijvingOmschrijving;
    }

    public void setLocatieOmschrijvingOmschrijving(Omschrijving LocatieOmschrijvingOmschrijving) {
        this.LocatieOmschrijvingOmschrijving = LocatieOmschrijvingOmschrijving;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Printertype getPrinterType() {
        return PrinterType;
    }

    public void setPrinterType(Printertype PrinterType) {
        this.PrinterType = PrinterType;
    }

    public boolean isStandaardVoorBestelbonnen() {
        return StandaardVoorBestelbonnen;
    }

    public void setStandaardVoorBestelbonnen(boolean StandaardVoorBestelbonnen) {
        this.StandaardVoorBestelbonnen = StandaardVoorBestelbonnen;
    }

    public boolean isStandaardVoorVerzendbonnen() {
        return StandaardVoorVerzendbonnen;
    }

    public void setStandaardVoorVerzendbonnen(boolean StandaardVoorVerzendbonnen) {
        this.StandaardVoorVerzendbonnen = StandaardVoorVerzendbonnen;
    }

    @Override
    public void setId(int id) {
        this.PrinterId=id;
    }
         @Override
    public int getId() {
        return this.PrinterId;
    }
        
}
