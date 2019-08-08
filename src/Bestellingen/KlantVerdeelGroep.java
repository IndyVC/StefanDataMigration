/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class KlantVerdeelGroep implements New{
    public int KlantVerdeelGroepId;
     public Omschrijving Omschrijving;

    public KlantVerdeelGroep() {
    }

    public KlantVerdeelGroep(int KlantVerdeelGroepId, Omschrijving Omschrijving) {
        this.KlantVerdeelGroepId = KlantVerdeelGroepId;
        this.Omschrijving = Omschrijving;
    }

    public int getKlantVerdeelGroepId() {
        return KlantVerdeelGroepId;
    }

    public void setKlantVerdeelGroepId(int KlantVerdeelGroepId) {
        this.KlantVerdeelGroepId = KlantVerdeelGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    @Override
    public void setId(int id) {
        this.KlantVerdeelGroepId=id;
    }
     
      @Override
    public int getId() {
        return this.KlantVerdeelGroepId;
    }
}
