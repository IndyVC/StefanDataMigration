/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Bestellingen.Klant;
import Boekhouding.Korting;

/**
 *
 * @author stefa
 */
public class KlantKorting {

    public int KlantKortingId;

    public int KlantId;

    public int KortingId;

    public Klant Klant;
    public Korting Korting;

    public KlantKorting() {

    }

    public KlantKorting(Klant klant, Korting korting) {
        Klant = klant;
        KlantId = Klant.KlantId;
        Korting = korting;
        KortingId = Korting.KortingId;
    }
}
