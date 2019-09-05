/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;
import java.sql.Date;
import Algemeen.Omschrijving;
import Algemeen.DagSchema;
import Bedrijven.FunctieVanPersoon;
import Gebruikers.Werknemer;
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
import enums.Status;
import enums.TaakFrequentie;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Taak implements New {

    public int TaakId;
    public int TijdsduurUren;
    public int TijdsduurMinuten;
    public boolean Blokkeren;
    public Omschrijving Omschrijving;
    public boolean TijdsduurAfhankelijkVanHoeveelheid;
    public FunctieVanPersoon BevoegdeFunctieFunctieVanPersoon;
    public Omschrijving TitelOmschrijving;
    public boolean TijdsGebonden;
    public Werknemer Werknemer;
    public DagSchema WerknemerDagSchema;
    public TaakFrequentie Frequentie;
    public Status Status;
    public Date Startuur;
    public Date Einduur;
    
    public List<BasisProductTaak> TaakBasisProducten;
    public List<AfgewerktProductTaak> TaakAfgewerkteProducten;
    public List<VerkoopProductTaak> TaakVerkoopProducten;
    public List<VoorbereidProductTaak> TaakVoorbereidProducten;
    public List<ReceptProductTaak> TaakReceptProducten;

    public Taak() {
    }

    public Taak(int TaakId, int TijdsduurUren, int TijdsduurMinuten, boolean Blokkeren, Omschrijving Omschrijving, boolean TijdsduurAfhankelijkVanHoeveelheid, FunctieVanPersoon BevoegdeFunctieFunctieVanPersoon, Omschrijving TitelOmschrijving, boolean TijdsGebonden, Werknemer Werknemer, DagSchema WerknemerDagSchema, TaakFrequentie Frequentie, Status Status, Date Startuur, Date Einduur) {
        this.TaakId = TaakId;
        this.TijdsduurUren = TijdsduurUren;
        this.TijdsduurMinuten = TijdsduurMinuten;
        this.Blokkeren = Blokkeren;
        this.Omschrijving = Omschrijving;
        this.TijdsduurAfhankelijkVanHoeveelheid = TijdsduurAfhankelijkVanHoeveelheid;
        this.BevoegdeFunctieFunctieVanPersoon = BevoegdeFunctieFunctieVanPersoon;
        this.TitelOmschrijving = TitelOmschrijving;
        this.TijdsGebonden = TijdsGebonden;
        this.Werknemer = Werknemer;
        this.WerknemerDagSchema = WerknemerDagSchema;
        this.Frequentie = Frequentie;
        this.Status = Status;
        this.Startuur = Startuur;
        this.Einduur = Einduur;
    }

    

    public DagSchema getWerknemerDagSchema() {
        return WerknemerDagSchema;
    }

    public void setWerknemerDagSchema(DagSchema WerknemerDagSchema) {
        this.WerknemerDagSchema = WerknemerDagSchema;
    }

    public TaakFrequentie getFrequentie() {
        return Frequentie;
    }

    public void setFrequentie(TaakFrequentie Frequentie) {
        this.Frequentie = Frequentie;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public Date getStartuur() {
        return Startuur;
    }

    public void setStartuur(Date Startuur) {
        this.Startuur = Startuur;
    }

    public Date getEinduur() {
        return Einduur;
    }

    public void setEinduur(Date Einduur) {
        this.Einduur = Einduur;
    }
    
   

    

    public int getTaakId() {
        return TaakId;
    }

    public void setTaakId(int TaakId) {
        this.TaakId = TaakId;
    }

    public int getTijdsduurUren() {
        return TijdsduurUren;
    }

    public void setTijdsduurUren(int TijdsduurUren) {
        this.TijdsduurUren = TijdsduurUren;
    }

    public int getTijdsduurMinuten() {
        return TijdsduurMinuten;
    }

    public void setTijdsduurMinuten(int TijdsduurMinuten) {
        this.TijdsduurMinuten = TijdsduurMinuten;
    }

    public boolean isTijdsduurAfhankelijkVanHoeveelheid() {
        return TijdsduurAfhankelijkVanHoeveelheid;
    }

    public void setTijdsduurAfhankelijkVanHoeveelheid(boolean TijdsduurAfhankelijkVanHoeveelheid) {
        this.TijdsduurAfhankelijkVanHoeveelheid = TijdsduurAfhankelijkVanHoeveelheid;
    }

    public FunctieVanPersoon getBevoegdeFunctieFunctieVanPersoon() {
        return BevoegdeFunctieFunctieVanPersoon;
    }

    public void setBevoegdeFunctieFunctieVanPersoon(FunctieVanPersoon BevoegdeFunctieFunctieVanPersoon) {
        this.BevoegdeFunctieFunctieVanPersoon = BevoegdeFunctieFunctieVanPersoon;
    }

    public Omschrijving getTitelOmschrijving() {
        return TitelOmschrijving;
    }

    public void setTitelOmschrijving(Omschrijving TitelOmschrijving) {
        this.TitelOmschrijving = TitelOmschrijving;
    }

    public boolean isTijdsGebonden() {
        return TijdsGebonden;
    }

    public void setTijdsGebonden(boolean TijdsGebonden) {
        this.TijdsGebonden = TijdsGebonden;
    }

    public Werknemer getWerknemer() {
        return Werknemer;
    }

    public void setWerknemer(Werknemer Werknemer) {
        this.Werknemer = Werknemer;
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
        this.TaakId = id;
    }

    @Override
    public int getId() {
        return this.TaakId;
    }

}
