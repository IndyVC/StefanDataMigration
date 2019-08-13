/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TussenTabellen;

import Algemeen.BereikbaarheidOpDag;
import Bestellingen.Klant;
import New.New;

/**
 *
 * @author stefa
 */
public class KlantBereikbaarheidOpDag implements New{

    public int KlantBereikbaarheidOpDagId;
    public Klant Klant;
    public BereikbaarheidOpDag BereikbaarheidOpDag;

    public KlantBereikbaarheidOpDag() {

    }

    public KlantBereikbaarheidOpDag(Klant klant, BereikbaarheidOpDag bereikbaarheidOpDag) {
        Klant = klant;
        BereikbaarheidOpDag = bereikbaarheidOpDag;
    }

    @Override
    public void setId(int id) {
        this.KlantBereikbaarheidOpDagId=id;
    }

    @Override
    public int getId() {
        return KlantBereikbaarheidOpDagId;
    }

    public int getKlantBereikbaarheidOpDagId() {
        return KlantBereikbaarheidOpDagId;
    }

    public void setKlantBereikbaarheidOpDagId(int KlantBereikbaarheidOpDagId) {
        this.KlantBereikbaarheidOpDagId = KlantBereikbaarheidOpDagId;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public BereikbaarheidOpDag getBereikbaarheidOpDag() {
        return BereikbaarheidOpDag;
    }

    public void setBereikbaarheidOpDag(BereikbaarheidOpDag BereikbaarheidOpDag) {
        this.BereikbaarheidOpDag = BereikbaarheidOpDag;
    }
    
    
}
