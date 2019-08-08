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
public class LotnummerDrager implements New{

    public int LotnummerDragerId;

    public Omschrijving Omschrijving;
    public boolean Blokkeren;

    public LotnummerDrager() {
    }

    public LotnummerDrager(int LotnummerDragerId, Omschrijving Omschrijving, boolean Blokkeren) {
        this.LotnummerDragerId = LotnummerDragerId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
    }

    public int getLotnummerDragerId() {
        return LotnummerDragerId;
    }

    public void setLotnummerDragerId(int LotnummerDragerId) {
        this.LotnummerDragerId = LotnummerDragerId;
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
        this.LotnummerDragerId=id;
    }
 @Override
    public int getId() {
        return this.LotnummerDragerId;
    }
}
