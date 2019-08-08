/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class AnalytischeRekening implements New {

    public Omschrijving Omschrijving;
    public int AnalytischeRekeningId;
    public String BoekhoudRekening;
    public boolean HoeveelheidMeegeven;
    public boolean IsEenAankoop;
    public boolean IsEenKorting;
    public boolean IsDiverse;
    public boolean MetBtw;

    public AnalytischeRekening() {
    }

    public AnalytischeRekening(Omschrijving Omschrijving, int AnalytischeRekeningId, String BoekhoudRekening, boolean HoeveelheidMeegeven, boolean IsEenAankoop, boolean IsEenKorting, boolean IsDiverse, boolean MetBtw) {
        this.Omschrijving = Omschrijving;
        this.AnalytischeRekeningId = AnalytischeRekeningId;
        this.BoekhoudRekening = BoekhoudRekening;
        this.HoeveelheidMeegeven = HoeveelheidMeegeven;
        this.IsEenAankoop = IsEenAankoop;
        this.IsEenKorting = IsEenKorting;
        this.IsDiverse = IsDiverse;
        this.MetBtw = MetBtw;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public int getAnalytischeRekeningId() {
        return AnalytischeRekeningId;
    }

    public void setAnalytischeRekeningId(int AnalytischeRekeningId) {
        this.AnalytischeRekeningId = AnalytischeRekeningId;
    }

    public String getBoekhoudRekening() {
        return BoekhoudRekening;
    }

    public void setBoekhoudRekening(String BoekhoudRekening) {
        this.BoekhoudRekening = BoekhoudRekening;
    }

    public boolean isHoeveelheidMeegeven() {
        return HoeveelheidMeegeven;
    }

    public void setHoeveelheidMeegeven(boolean HoeveelheidMeegeven) {
        this.HoeveelheidMeegeven = HoeveelheidMeegeven;
    }

    public boolean isIsEenAankoop() {
        return IsEenAankoop;
    }

    public void setIsEenAankoop(boolean IsEenAankoop) {
        this.IsEenAankoop = IsEenAankoop;
    }

    public boolean isIsEenKorting() {
        return IsEenKorting;
    }

    public void setIsEenKorting(boolean IsEenKorting) {
        this.IsEenKorting = IsEenKorting;
    }

    public boolean isIsDiverse() {
        return IsDiverse;
    }

    public void setIsDiverse(boolean IsDiverse) {
        this.IsDiverse = IsDiverse;
    }

    public boolean isMetBtw() {
        return MetBtw;
    }

    public void setMetBtw(boolean MetBtw) {
        this.MetBtw = MetBtw;
    }

    @Override
    public void setId(int id) {
        this.AnalytischeRekeningId = id;
    }
 @Override
    public int getId() {
        return this.AnalytischeRekeningId;
    }
}
