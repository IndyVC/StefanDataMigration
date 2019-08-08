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
    public List<BasisProduct> BasisProducten;
    public List<AfgewerktProductTaak> TaakAfgewerkteProducten;
    public List<AfgewerktProduct> AfgewerkteProducten;
    public List<VerkoopProductTaak> TaakVerkoopProducten;
    public List<VerkoopProduct> VerkoopProducten;
    public List<VoorbereidProductTaak> TaakVoorbereidProducten;
    public List<VoorbereidProduct> VoorbereidProducten;
    public List<ReceptProductTaak> TaakReceptProducten;
    public List<ReceptProduct> ReceptProducten;

    public Taak() {
    }

    public Taak(int TaakId, String Tijdsduur, boolean Blokkeren, Omschrijving Omschrijving, List<BasisProductTaak> TaakBasisProducten, List<BasisProduct> BasisProducten, List<AfgewerktProductTaak> TaakAfgewerkteProducten, List<AfgewerktProduct> AfgewerkteProducten, List<VerkoopProductTaak> TaakVerkoopProducten, List<VerkoopProduct> VerkoopProducten, List<VoorbereidProductTaak> TaakVoorbereidProducten, List<VoorbereidProduct> VoorbereidProducten, List<ReceptProductTaak> TaakReceptProducten, List<ReceptProduct> ReceptProducten) {
        this.TaakId = TaakId;
        this.Tijdsduur = Tijdsduur;
        this.Blokkeren = Blokkeren;
        this.Omschrijving = Omschrijving;
        this.TaakBasisProducten = TaakBasisProducten;
        this.BasisProducten = BasisProducten;
        this.TaakAfgewerkteProducten = TaakAfgewerkteProducten;
        this.AfgewerkteProducten = AfgewerkteProducten;
        this.TaakVerkoopProducten = TaakVerkoopProducten;
        this.VerkoopProducten = VerkoopProducten;
        this.TaakVoorbereidProducten = TaakVoorbereidProducten;
        this.VoorbereidProducten = VoorbereidProducten;
        this.TaakReceptProducten = TaakReceptProducten;
        this.ReceptProducten = ReceptProducten;
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

    public List<BasisProduct> getBasisProducten() {
        return BasisProducten;
    }

    public void setBasisProducten(List<BasisProduct> BasisProducten) {
        this.BasisProducten = BasisProducten;
    }

    public List<AfgewerktProductTaak> getTaakAfgewerkteProducten() {
        return TaakAfgewerkteProducten;
    }

    public void setTaakAfgewerkteProducten(List<AfgewerktProductTaak> TaakAfgewerkteProducten) {
        this.TaakAfgewerkteProducten = TaakAfgewerkteProducten;
    }

    public List<AfgewerktProduct> getAfgewerkteProducten() {
        return AfgewerkteProducten;
    }

    public void setAfgewerkteProducten(List<AfgewerktProduct> AfgewerkteProducten) {
        this.AfgewerkteProducten = AfgewerkteProducten;
    }

    public List<VerkoopProductTaak> getTaakVerkoopProducten() {
        return TaakVerkoopProducten;
    }

    public void setTaakVerkoopProducten(List<VerkoopProductTaak> TaakVerkoopProducten) {
        this.TaakVerkoopProducten = TaakVerkoopProducten;
    }

    public List<VerkoopProduct> getVerkoopProducten() {
        return VerkoopProducten;
    }

    public void setVerkoopProducten(List<VerkoopProduct> VerkoopProducten) {
        this.VerkoopProducten = VerkoopProducten;
    }

    public List<VoorbereidProductTaak> getTaakVoorbereidProducten() {
        return TaakVoorbereidProducten;
    }

    public void setTaakVoorbereidProducten(List<VoorbereidProductTaak> TaakVoorbereidProducten) {
        this.TaakVoorbereidProducten = TaakVoorbereidProducten;
    }

    public List<VoorbereidProduct> getVoorbereidProducten() {
        return VoorbereidProducten;
    }

    public void setVoorbereidProducten(List<VoorbereidProduct> VoorbereidProducten) {
        this.VoorbereidProducten = VoorbereidProducten;
    }
    
    

    public List<ReceptProductTaak> getTaakReceptProducten() {
        return TaakReceptProducten;
    }

    public void setTaakReceptProducten(List<ReceptProductTaak> TaakReceptProducten) {
        this.TaakReceptProducten = TaakReceptProducten;
    }

    public List<ReceptProduct> getReceptProducten() {
        return ReceptProducten;
    }

    public void setReceptProducten(List<ReceptProduct> ReceptProducten) {
        this.ReceptProducten = ReceptProducten;
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
