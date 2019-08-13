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

    public int KlantId;

    public int OpeningstijdId;
    public Klant Klant;
    public Openingstijd Openingstijd;

    public KlantOpeningstijd() {

    }

    public KlantOpeningstijd(Klant klant, Openingstijd openingstijd) {
        Klant = klant;
        KlantId = Klant.KlantId;
        Openingstijd = openingstijd;
        OpeningstijdId = Openingstijd.OpeningsTijdId;
    }

    @Override
    public void setId(int id) {
        this.KlantOpeningsTijdId=id;
    }

    @Override
    public int getId() {
        return this.KlantOpeningsTijdId;
    }
}
