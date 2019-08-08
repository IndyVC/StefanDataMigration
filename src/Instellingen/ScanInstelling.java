/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instellingen;

import New.New;
import enums.ScanFrequentie;

/**
 *
 * @author stefa
 */
public class ScanInstelling implements New{
    
    public int ScanInstellingId;
    public ScanFrequentie ScanFrequentie;
    public boolean ScanWijzeIsBatch;
    public String BatchBestand;

    public ScanInstelling() {
    }

    public ScanInstelling(int ScanInstellingId, ScanFrequentie ScanFrequentie, boolean ScanWijzeIsBatch, String BatchBestand) {
        this.ScanInstellingId = ScanInstellingId;
        this.ScanFrequentie = ScanFrequentie;
        this.ScanWijzeIsBatch = ScanWijzeIsBatch;
        this.BatchBestand = BatchBestand;
    }

    public int getScanInstellingId() {
        return ScanInstellingId;
    }

    public void setScanInstellingId(int ScanInstellingId) {
        this.ScanInstellingId = ScanInstellingId;
    }

    public ScanFrequentie getScanFrequentie() {
        return ScanFrequentie;
    }

    public void setScanFrequentie(ScanFrequentie ScanFrequentie) {
        this.ScanFrequentie = ScanFrequentie;
    }

    public boolean isScanWijzeIsBatch() {
        return ScanWijzeIsBatch;
    }

    public void setScanWijzeIsBatch(boolean ScanWijzeIsBatch) {
        this.ScanWijzeIsBatch = ScanWijzeIsBatch;
    }

    public String getBatchBestand() {
        return BatchBestand;
    }

    public void setBatchBestand(String BatchBestand) {
        this.BatchBestand = BatchBestand;
    }

    @Override
    public void setId(int id) {
        this.ScanInstellingId=id;
    }
     @Override
    public int getId() {
        return this.ScanInstellingId;
    }
    
    
}
