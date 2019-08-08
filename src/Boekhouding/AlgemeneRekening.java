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
public class AlgemeneRekening implements New{
    
    public Omschrijving Omschrijving;
    public int AlgemeneRekeningId;
    public String BoekhoudRekening;
    public boolean HoeveelheidMeegeven;
    public boolean IsEenAankoop;
    public boolean IsEenKorting;
    public boolean IsDiverse;
    public boolean MetBtw;

    public AlgemeneRekening() {
    }

    public AlgemeneRekening(Omschrijving Omschrijving, int AlgemeneRekeningId, String BoekhoudRekening, boolean HoeveelheidMeegeven, boolean IsEenAankoop, boolean IsEenKorting, boolean IsDiverse, boolean MetBtw) {
        this.Omschrijving = Omschrijving;
        this.AlgemeneRekeningId = AlgemeneRekeningId;
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

    public int getAlgemeneRekeningId() {
        return AlgemeneRekeningId;
    }

    public void setAlgemeneRekeningId(int AlgemeneRekeningId) {
        this.AlgemeneRekeningId = AlgemeneRekeningId;
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
        this.AlgemeneRekeningId=id;
    }
     @Override
    public int getId() {
        return this.AlgemeneRekeningId;
    }
    
    
}
