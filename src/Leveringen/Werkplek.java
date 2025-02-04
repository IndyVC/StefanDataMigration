/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leveringen;

import Algemeen.Omschrijving;
import Bedrijven.Vestiging;
import New.New;

/**
 *
 * @author stefa
 */
public class Werkplek implements New{
    
    public int WerkplekId;
    public Omschrijving Omschrijving;
    public boolean Blokkeren;
    public Vestiging Vestiging;

    public Werkplek() {
    }

    public Werkplek(int WerkplekId, Omschrijving Omschrijving, boolean Blokkeren, Vestiging vestiging) {
        this.WerkplekId = WerkplekId;
        this.Omschrijving = Omschrijving;
        this.Blokkeren = Blokkeren;
        this.Vestiging = vestiging;
    }

    public int getWerkplekId() {
        return WerkplekId;
    }

    public void setWerkplekId(int WerkplekId) {
        this.WerkplekId = WerkplekId;
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

    public Vestiging getVestiging() {
        return Vestiging;
    }

    public void setVestiging(Vestiging Vestiging) {
        this.Vestiging = Vestiging;
    }

    
    @Override
    public void setId(int id) {
        this.WerkplekId=id;
    }
     @Override
    public int getId() {
        return this.WerkplekId;
    }
    
}
