/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Algemeen.Openingstijd;
import Bestellingen.Klant;
import New.New;

/**
 *
 * @author stefa
 */
public class KlantOpeningstijd implements New{

    public int KlantOpeningsTijdId;

    public Klant Klant;
    public Openingstijd Openingstijd;

    public KlantOpeningstijd() {

    }

    public KlantOpeningstijd(Klant klant, Openingstijd openingstijd) {
        Klant = klant;
        Openingstijd = openingstijd;
    }

    @Override
    public void setId(int id) {
        this.KlantOpeningsTijdId=id;
    }

    @Override
    public int getId() {
        return this.KlantOpeningsTijdId;
    }

    public int getKlantOpeningsTijdId() {
        return KlantOpeningsTijdId;
    }

    public void setKlantOpeningsTijdId(int KlantOpeningsTijdId) {
        this.KlantOpeningsTijdId = KlantOpeningsTijdId;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public Openingstijd getOpeningstijd() {
        return Openingstijd;
    }

    public void setOpeningstijd(Openingstijd Openingstijd) {
        this.Openingstijd = Openingstijd;
    }
    
    
}
