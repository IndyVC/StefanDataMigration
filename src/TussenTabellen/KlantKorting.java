/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bestellingen.Klant;
import Boekhouding.Korting;
import New.New;

/**
 *
 * @author stefa
 */
public class KlantKorting implements New{

    public int KlantKortingId;

    public Klant Klant;
    public Korting Korting;

    public KlantKorting() {

    }

    public KlantKorting(Klant klant, Korting korting) {
        Klant = klant;
        Korting = korting;
    }

    @Override
    public void setId(int id) {
        this.KlantKortingId=id;
    }

    @Override
    public int getId() {
        return KlantKortingId;
    }

    public int getKlantKortingId() {
        return KlantKortingId;
    }

    public void setKlantKortingId(int KlantKortingId) {
        this.KlantKortingId = KlantKortingId;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public Korting getKorting() {
        return Korting;
    }

    public void setKorting(Korting Korting) {
        this.Korting = Korting;
    }
    
    
}
