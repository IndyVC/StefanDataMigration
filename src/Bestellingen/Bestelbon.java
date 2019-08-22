/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Adressen.Adres;
import Adressen.OntvangstAdres;
import Bedrijven.Vestiging;
import Leveringen.Leverancier;
import New.New;
import Producten.ReceptProduct;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Bestelbon implements New {

    public int BestelbonId;
    public Vestiging Vestiging;
    public OntvangstAdres OntvangstAdres;
    public Leverancier Leverancier;
    public List<UitgaandeBestelling> UitgaandeBestellingen;

    public Bestelbon() {
        UitgaandeBestellingen = new ArrayList();
    }

    public Bestelbon(int BestelbonId, Vestiging Vestgiging, OntvangstAdres LeveringsAdres, Leverancier leverancier) {
        this();
        this.BestelbonId = BestelbonId;
        this.Vestiging = Vestgiging;
        this.OntvangstAdres = LeveringsAdres;
        this.Leverancier=leverancier;
    }

    public Leverancier getLeverancier() {
        return Leverancier;
    }

    public void setLeverancier(Leverancier Leverancier) {
        this.Leverancier = Leverancier;
    }

    public int getBestelbonId() {
        return BestelbonId;
    }

    public void setBestelbonId(int BestelbonId) {
        this.BestelbonId = BestelbonId;
    }

    public Vestiging getVestgiging() {
        return Vestiging;
    }

    public void setVestgiging(Vestiging Vestgiging) {
        this.Vestiging = Vestgiging;
    }

    public OntvangstAdres getOntvangstAdres() {
        return OntvangstAdres;
    }

    public void setOntvangstAdres(OntvangstAdres OntvangstAdres) {
        this.OntvangstAdres = OntvangstAdres;
    }

    public List<UitgaandeBestelling> getUitgaandeBestellingen() {
        return UitgaandeBestellingen;
    }

    public void setUitgaandeBestellingen(List<UitgaandeBestelling> UitgaandeBestellingen) {
        this.UitgaandeBestellingen = UitgaandeBestellingen;
    }

    @Override
    public void setId(int id) {
        this.BestelbonId = id;
    }

    @Override
    public int getId() {
        return this.BestelbonId;
    }

}
