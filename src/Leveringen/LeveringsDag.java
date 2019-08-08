/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leveringen;

import New.New;
import TussenTabellen.LeverancierLeveringsDag;
import enums.DayOfWeek;
import java.util.List;

/**
 *
 * @author stefa
 */
public class LeveringsDag implements New{

    public int LeveringsDagId;
    public DayOfWeek DayOfWeek;
    public boolean IsEenLeveringsDag;
    public List<LeverancierLeveringsDag> LeveringsDagLeveranciers;
    public List<Leverancier> Leverancier;

    public LeveringsDag() {
    }

    public LeveringsDag(int LeveringsDagId, DayOfWeek DayOfWeek, boolean IsEenLeveringsDag, List<LeverancierLeveringsDag> LeveringsDagLeveranciers, List<Leverancier> Leverancier) {
        this.LeveringsDagId = LeveringsDagId;
        this.DayOfWeek = DayOfWeek;
        this.IsEenLeveringsDag = IsEenLeveringsDag;
        this.LeveringsDagLeveranciers = LeveringsDagLeveranciers;
        this.Leverancier = Leverancier;
    }

    public int getLeveringsDagId() {
        return LeveringsDagId;
    }

    public void setLeveringsDagId(int LeveringsDagId) {
        this.LeveringsDagId = LeveringsDagId;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    public boolean isIsEenLeveringsDag() {
        return IsEenLeveringsDag;
    }

    public void setIsEenLeveringsDag(boolean IsEenLeveringsDag) {
        this.IsEenLeveringsDag = IsEenLeveringsDag;
    }

    public List<LeverancierLeveringsDag> getLeveringsDagLeveranciers() {
        return LeveringsDagLeveranciers;
    }

    public void setLeveringsDagLeveranciers(List<LeverancierLeveringsDag> LeveringsDagLeveranciers) {
        this.LeveringsDagLeveranciers = LeveringsDagLeveranciers;
    }

    public List<Leverancier> getLeverancier() {
        return Leverancier;
    }

    public void setLeverancier(List<Leverancier> Leverancier) {
        this.Leverancier = Leverancier;
    }

    @Override
    public void setId(int id) {
        this.LeveringsDagId=id;
    }
 @Override
    public int getId() {
        return this.LeveringsDagId;
    }
    
}
