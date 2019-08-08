/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Adressen.Adres;
import Bedrijven.Vestiging;
import New.New;
import Producten.ReceptProduct;

/**
 *
 * @author stefa
 */
public class Bestelbon implements New {
    
    public int BestelbonId;
    public Vestiging Vestgiging;
    public Adres LeveringsAdres;
    public ReceptProduct ReceptProduct;

    public Bestelbon() {
    }

    public Bestelbon(int BestelbonId, Vestiging Vestgiging, Adres LeveringsAdres, ReceptProduct ReceptProduct) {
        this.BestelbonId = BestelbonId;
        this.Vestgiging = Vestgiging;
        this.LeveringsAdres = LeveringsAdres;
        this.ReceptProduct = ReceptProduct;
    }

    public int getBestelbonId() {
        return BestelbonId;
    }

    public void setBestelbonId(int BestelbonId) {
        this.BestelbonId = BestelbonId;
    }

    public Vestiging getVestgiging() {
        return Vestgiging;
    }

    public void setVestgiging(Vestiging Vestgiging) {
        this.Vestgiging = Vestgiging;
    }

    public Adres getLeveringsAdres() {
        return LeveringsAdres;
    }

    public void setLeveringsAdres(Adres LeveringsAdres) {
        this.LeveringsAdres = LeveringsAdres;
    }

    public ReceptProduct getReceptProduct() {
        return ReceptProduct;
    }

    public void setReceptProduct(ReceptProduct ReceptProduct) {
        this.ReceptProduct = ReceptProduct;
    }

    @Override
    public void setId(int id) {
        this.BestelbonId=id;
    }
     @Override
    public int getId() {
        return this.BestelbonId;
    }
    
}
