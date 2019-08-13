/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Adressen.Adres;
import Bestellingen.Klant;
import New.New;

/**
 *
 * @author stefa
 */
public class KlantAdres implements New{

    public int KlantAdresId;
    public Klant Klant;
    public Adres Adres;

    public KlantAdres() {

    }

    public KlantAdres(Klant klant, Adres adres) {
        Klant = klant;
        Adres = adres;
    }

    @Override
    public void setId(int id) {
        this.KlantAdresId=id;
    }

    @Override
    public int getId() {
        return this.KlantAdresId;
    }

    public int getKlantAdresId() {
        return KlantAdresId;
    }

    public void setKlantAdresId(int KlantAdresId) {
        this.KlantAdresId = KlantAdresId;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public Adres getAdres() {
        return Adres;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }
    
    
}
