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

    public int KlantId;

    public int BereikbaarheidOpDagId;

    public Klant Klant;
    public BereikbaarheidOpDag BereikbaarheidOpDag;

    public KlantBereikbaarheidOpDag() {

    }

    public KlantBereikbaarheidOpDag(Klant klant, BereikbaarheidOpDag bereikbaarheidOpDag) {
        Klant = klant;
        KlantId = Klant.KlantId;
        BereikbaarheidOpDag = bereikbaarheidOpDag;
        BereikbaarheidOpDagId = BereikbaarheidOpDag.BereikbaarheidOpDagId;
    }

    @Override
    public void setId(int id) {
        this.KlantBereikbaarheidOpDagId=id;
    }

    @Override
    public int getId() {
        return KlantBereikbaarheidOpDagId;
    }
}
