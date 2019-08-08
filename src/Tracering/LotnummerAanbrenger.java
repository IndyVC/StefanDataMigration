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
public class LotnummerAanbrenger implements New{

    public int LotnummerAanbrengerId;

    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public LotnummerAanbrenger() {
    }

    public LotnummerAanbrenger(int LotnummerAanbrengerId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.LotnummerAanbrengerId = LotnummerAanbrengerId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getLotnummerAanbrengerId() {
        return LotnummerAanbrengerId;
    }

    public void setLotnummerAanbrengerId(int LotnummerAanbrengerId) {
        this.LotnummerAanbrengerId = LotnummerAanbrengerId;
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
        this.LotnummerAanbrengerId=id;
    }
 @Override
    public int getId() {
        return this.LotnummerAanbrengerId;
    }
}
