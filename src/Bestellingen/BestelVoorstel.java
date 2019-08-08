/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Adressen.OntvangstAdres;
import Bedrijven.Vestiging;
import New.New;
import Producten.ReceptProduct;

/**
 *
 * @author stefa
 */
public class BestelVoorstel implements New {

    public int BestelVoorstelId;
    public Vestiging Vestiging;
    public OntvangstAdres Ontvangstadres;
    public ReceptProduct Receptproduct;

    public BestelVoorstel() {
    }

    public BestelVoorstel(int BestelVoorstelId, Vestiging Vestiging, OntvangstAdres Ontvangstadres, ReceptProduct Receptproduct) {
        this.BestelVoorstelId = BestelVoorstelId;
        this.Vestiging = Vestiging;
        this.Ontvangstadres = Ontvangstadres;
        this.Receptproduct = Receptproduct;
    }

    public int getBestelVoorstelId() {
        return BestelVoorstelId;
    }

    public void setBestelVoorstelId(int BestelVoorstelId) {
        this.BestelVoorstelId = BestelVoorstelId;
    }

    public Vestiging getVestiging() {
        return Vestiging;
    }

    public void setVestiging(Vestiging Vestiging) {
        this.Vestiging = Vestiging;
    }

    public OntvangstAdres getOntvangstadres() {
        return Ontvangstadres;
    }

    public void setOntvangstadres(OntvangstAdres Ontvangstadres) {
        this.Ontvangstadres = Ontvangstadres;
    }

    public ReceptProduct getReceptproduct() {
        return Receptproduct;
    }

    public void setReceptproduct(ReceptProduct Receptproduct) {
        this.Receptproduct = Receptproduct;
    }

    @Override
    public void setId(int id) {
        this.BestelVoorstelId = id;
    }

    @Override
    public int getId() {
        return this.getBestelVoorstelId();
    }

}
