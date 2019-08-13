/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;

import Algemeen.Omschrijving;
import New.New;
import Producten.AfgewerktProduct;
import Producten.BasisProduct;
import Producten.ReceptProduct;
import Producten.VerkoopProduct;
import Producten.VoorbereidProduct;
import TussenTabellen.AfgewerktProductTaak;
import TussenTabellen.BasisProductTaak;
import TussenTabellen.ReceptProductTaak;
import TussenTabellen.VerkoopProductTaak;
import TussenTabellen.VoorbereidProductTaak;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Taak implements New{

    public int TaakId;
    public String Tijdsduur;
    public boolean Blokkeren;
    public Omschrijving Omschrijving;
    public List<BasisProductTaak> TaakBasisProducten;
    public List<AfgewerktProductTaak> TaakAfgewerkteProducten;
    public List<VerkoopProductTaak> TaakVerkoopProducten;
    public List<VoorbereidProductTaak> TaakVoorbereidProducten;
    public List<ReceptProductTaak> TaakReceptProducten;

    public Taak() {
    }

    public Taak(int TaakId, String Tijdsduur, boolean Blokkeren, Omschrijving Omschrijving) {
        this.TaakId = TaakId;
        this.Tijdsduur = Tijdsduur;
        this.Blokkeren = Blokkeren;
        this.Omschrijving = Omschrijving;
        this.TaakBasisProducten = TaakBasisProducten;
        this.TaakAfgewerkteProducten = TaakAfgewerkteProducten;
        this.TaakVerkoopProducten = TaakVerkoopProducten;
        this.TaakVoorbereidProducten = TaakVoorbereidProducten;
        this.TaakReceptProducten = TaakReceptProducten;
    }

    public int getTaakId() {
        return TaakId;
    }

    public void setTaakId(int TaakId) {
        this.TaakId = TaakId;
    }

    public String getTijdsduur() {
        return Tijdsduur;
    }

    public void setTijdsduur(String Tijdsduur) {
        this.Tijdsduur = Tijdsduur;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public List<BasisProductTaak> getTaakBasisProducten() {
        return TaakBasisProducten;
    }

    public void setTaakBasisProducten(List<BasisProductTaak> TaakBasisProducten) {
        this.TaakBasisProducten = TaakBasisProducten;
    }

    public List<AfgewerktProductTaak> getTaakAfgewerkteProducten() {
        return TaakAfgewerkteProducten;
    }

    public void setTaakAfgewerkteProducten(List<AfgewerktProductTaak> TaakAfgewerkteProducten) {
        this.TaakAfgewerkteProducten = TaakAfgewerkteProducten;
    }


    public List<VerkoopProductTaak> getTaakVerkoopProducten() {
        return TaakVerkoopProducten;
    }

    public void setTaakVerkoopProducten(List<VerkoopProductTaak> TaakVerkoopProducten) {
        this.TaakVerkoopProducten = TaakVerkoopProducten;
    }


    public List<VoorbereidProductTaak> getTaakVoorbereidProducten() {
        return TaakVoorbereidProducten;
    }

    public void setTaakVoorbereidProducten(List<VoorbereidProductTaak> TaakVoorbereidProducten) {
        this.TaakVoorbereidProducten = TaakVoorbereidProducten;
    }
    
    public List<ReceptProductTaak> getTaakReceptProducten() {
        return TaakReceptProducten;
    }

    public void setTaakReceptProducten(List<ReceptProductTaak> TaakReceptProducten) {
        this.TaakReceptProducten = TaakReceptProducten;
    }

    @Override
    public void setId(int id) {
        this.TaakId=id;
    }
    
     @Override
    public int getId() {
        return this.TaakId;
    }

}
