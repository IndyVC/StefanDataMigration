/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import enums.ScannerType;

/**
 *
 * @author stefa
 */
public class Scanner implements New {
    public int ScannerId;
        public ScannerType  ScannerType;
        public Omschrijving Omschrijving;
        public boolean IsBatch;
        public boolean GebruikenOpDitWerkstation;

    public Scanner() {
    }

    public Scanner(int ScannerId, ScannerType ScannerType, Omschrijving Omschrijving, boolean IsBatch, boolean GebruikenOpDitWerkstation) {
        this.ScannerId = ScannerId;
        this.ScannerType = ScannerType;
        this.Omschrijving = Omschrijving;
        this.IsBatch = IsBatch;
        this.GebruikenOpDitWerkstation = GebruikenOpDitWerkstation;
    }

    public int getScannerId() {
        return ScannerId;
    }

    public void setScannerId(int ScannerId) {
        this.ScannerId = ScannerId;
    }

    public ScannerType getScannerType() {
        return ScannerType;
    }

    public void setScannerType(ScannerType ScannerType) {
        this.ScannerType = ScannerType;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isIsBatch() {
        return IsBatch;
    }

    public void setIsBatch(boolean IsBatch) {
        this.IsBatch = IsBatch;
    }

    public boolean isGebruikenOpDitWerkstation() {
        return GebruikenOpDitWerkstation;
    }

    public void setGebruikenOpDitWerkstation(boolean GebruikenOpDitWerkstation) {
        this.GebruikenOpDitWerkstation = GebruikenOpDitWerkstation;
    }

    @Override
    public void setId(int id) {
        this.ScannerId=id;
    }
         @Override
    public int getId() {
        return this.ScannerId;
    }
        
}
