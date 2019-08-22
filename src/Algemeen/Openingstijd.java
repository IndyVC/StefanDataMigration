/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;
import enums.DayOfWeek;

/**
 *
 * @author stefa
 */
public class Openingstijd implements New {
    
    public int OpeningsTijdId;
    public DayOfWeek DayOfWeek;
    public String StartUurVoormiddag;
    public String SluitUurVoormiddag;
    public String StartUurNamiddag;
    public String SluitUurNamiddag;
    public int LeverancierId;

    public Openingstijd() {
    }

    public Openingstijd(int OpeningsTijdId, DayOfWeek DayOfWeek, String StartUurVoormiddag, String SluitUurVoormiddag, String StartUurNamiddag, String SluitUurNamiddag) {
        this.OpeningsTijdId = OpeningsTijdId;
        this.DayOfWeek = DayOfWeek;
        this.StartUurVoormiddag = StartUurVoormiddag;
        this.SluitUurVoormiddag = SluitUurVoormiddag;
        this.StartUurNamiddag = StartUurNamiddag;
        this.SluitUurNamiddag = SluitUurNamiddag;
    }

    public int getLeverancierId() {
        return LeverancierId;
    }

    public void setLeverancierId(int LeverancierId) {
        this.LeverancierId = LeverancierId;
    }

    
    public int getOpeningsTijdId() {
        return OpeningsTijdId;
    }

    public void setOpeningsTijdId(int OpeningsTijdId) {
        this.OpeningsTijdId = OpeningsTijdId;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public String getStartUurVoormiddag() {
        return StartUurVoormiddag;
    }

    public void setStartUurVoormiddag(String StartUurVoormiddag) {
        this.StartUurVoormiddag = StartUurVoormiddag;
    }

    public String getSluitUurVoormiddag() {
        return SluitUurVoormiddag;
    }

    public void setSluitUurVoormiddag(String SluitUurVoormiddag) {
        this.SluitUurVoormiddag = SluitUurVoormiddag;
    }

    public String getStartUurNamiddag() {
        return StartUurNamiddag;
    }

    public void setStartUurNamiddag(String StartUurNamiddag) {
        this.StartUurNamiddag = StartUurNamiddag;
    }

    public String getSluitUurNamiddag() {
        return SluitUurNamiddag;
    }

    public void setSluitUurNamiddag(String SluitUurNamiddag) {
        this.SluitUurNamiddag = SluitUurNamiddag;
    }

    @Override
    public void setId(int id) {
        this.OpeningsTijdId = id;
    }

    @Override
    public int getId() {
        return this.OpeningsTijdId;
    }
    
    
}
