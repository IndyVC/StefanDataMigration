/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bedrijven.Verlof;
import New.New;
import Old.Klant.Klant;

/**
 *
 * @author stefa
 */
public class KlantVerlof implements New {

    public int KlantVerlofId;

    public Klant Klant;
    public Verlof Verlof;

    public KlantVerlof() {
    }

    public KlantVerlof(Klant Klant, Verlof Verlof) {
        this.Klant = Klant;
        this.Verlof = Verlof;
    }

    public int getKlantVerlofId() {
        return KlantVerlofId;
    }

    public void setKlantVerlofId(int KlantVerlofId) {
        this.KlantVerlofId = KlantVerlofId;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public Verlof getVerlof() {
        return Verlof;
    }

    public void setVerlof(Verlof Verlof) {
        this.Verlof = Verlof;
    }

    @Override
    public void setId(int id) {
        this.KlantVerlofId=id;
    }

    @Override
    public int getId() {
        return this.KlantVerlofId;
    }

}
