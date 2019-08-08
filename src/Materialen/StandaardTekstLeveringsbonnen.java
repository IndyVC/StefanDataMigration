/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import New.New;
import enums.StandaardTekstVoorType;

/**
 *
 * @author stefa
 */
public class StandaardTekstLeveringsbonnen implements New {

    public int StandaardTekstId;
    public String Tekst;
    public String StandaardTekstCode;
    public StandaardTekstVoorType StandaardtekstVoorType;

    public StandaardTekstLeveringsbonnen() {
    }

    public StandaardTekstLeveringsbonnen(int StandaardTekstId, String Tekst, String StandaardTekstCode, StandaardTekstVoorType StandaardtekstVoorType) {
        this.StandaardTekstId = StandaardTekstId;
        this.Tekst = Tekst;
        this.StandaardTekstCode = StandaardTekstCode;
        this.StandaardtekstVoorType = StandaardtekstVoorType;
    }

    public int getStandaardTekstId() {
        return StandaardTekstId;
    }

    public void setStandaardTekstId(int StandaardTekstId) {
        this.StandaardTekstId = StandaardTekstId;
    }

    public String getTekst() {
        return Tekst;
    }

    public void setTekst(String Tekst) {
        this.Tekst = Tekst;
    }

    public String getStandaardTekstCode() {
        return StandaardTekstCode;
    }

    public void setStandaardTekstCode(String StandaardTekstCode) {
        this.StandaardTekstCode = StandaardTekstCode;
    }

    public StandaardTekstVoorType getStandaardtekstVoorType() {
        return StandaardtekstVoorType;
    }

    public void setStandaardtekstVoorType(StandaardTekstVoorType StandaardtekstVoorType) {
        this.StandaardtekstVoorType = StandaardtekstVoorType;
    }

    @Override
    public void setId(int id) {
        this.StandaardTekstId=id;
    }
    
     @Override
    public int getId() {
        return this.StandaardTekstId;
    }
}
