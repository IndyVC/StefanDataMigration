/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;

/**
 *
 * @author stefa
 */
public class ExcelLocatie implements New{
    public int ExcelLocatieId;
    public int Tabblad;
    public String Kolom;
    public int Rij;

    public ExcelLocatie() {
    }

    public ExcelLocatie(int ExcelLocatieId, int Tabblad, String Kolom, int Rij) {
        this.ExcelLocatieId = ExcelLocatieId;
        this.Tabblad = Tabblad;
        this.Kolom = Kolom;
        this.Rij = Rij;
    }

    public int getExcelLocatieId() {
        return ExcelLocatieId;
    }

    public int getTabblad() {
        return Tabblad;
    }

    public String getKolom() {
        return Kolom;
    }

    public int getRij() {
        return Rij;
    }

    public void setExcelLocatieId(int ExcelLocatieId) {
        this.ExcelLocatieId = ExcelLocatieId;
    }

    public void setTabblad(int Tabblad) {
        this.Tabblad = Tabblad;
    }

    public void setKolom(String Kolom) {
        this.Kolom = Kolom;
    }

    public void setRij(int Rij) {
        this.Rij = Rij;
    }

    @Override
    public void setId(int id) {
        this.ExcelLocatieId=id;
    }

    @Override
    public int getId() {
        return this.ExcelLocatieId;
    }
    
    
}
