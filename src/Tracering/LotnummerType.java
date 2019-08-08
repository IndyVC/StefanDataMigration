/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tracering;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class LotnummerType implements New{

    public int LotnummerTypeId;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public LotnummerType() {
    }

    public LotnummerType(int LotnummerTypeId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.LotnummerTypeId = LotnummerTypeId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getLotnummerTypeId() {
        return LotnummerTypeId;
    }

    public void setLotnummerTypeId(int LotnummerTypeId) {
        this.LotnummerTypeId = LotnummerTypeId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.LotnummerTypeId=id;
    }
     @Override
    public int getId() {
        return this.LotnummerTypeId;
    }

}
