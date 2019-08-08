/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Adressen.Adres;
import Bestellingen.Klant;

/**
 *
 * @author stefa
 */
public class KlantAdres {

    public int KlantAdresId;

    public int KlantId;

    public int AdresId;

    public Klant Klant;
    public Adres Adres;

    public KlantAdres() {

    }

    public KlantAdres(Klant klant, Adres adres) {
        Klant = klant;
        KlantId = Klant.KlantId;
        Adres = adres;
        AdresId = Adres.AdresId;
    }
}
