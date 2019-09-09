/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;

import java.sql.Date;
import Algemeen.Omschrijving;
import Algemeen.Planning;
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
    public boolean Blokkeren;
    public Omschrijving Omschrijving;
    public boolean TijdsduurAfhankelijkVanHoeveelheid;
    public FunctieVanPersoon BevoegdeFunctieFunctieVanPersoon;
    public Omschrijving TitelOmschrijving;
    public boolean TijdsGebonden;
    public Werknemer UitgevoerdDoorWerknemer;
    public TaakFrequentie Frequentie;
    public Status Status;
    public Date Startuur;
    public Date Einduur;
    public Planning Planning;

    public Taak() {
    }

     public Taak(boolean blokkeren, Omschrijving omschrijving, Status status, FunctieVanPersoon bevoegdeFunctie, Omschrijving titel, boolean tijdsduurAfhankelijkVanHoeveelheid, boolean tijdsGebonden, Planning planning)
        {
            Blokkeren = blokkeren;
            Omschrijving = omschrijving;
            Status = status;
            BevoegdeFunctieFunctieVanPersoon = bevoegdeFunctie;
            TitelOmschrijving = titel;
            TijdsduurAfhankelijkVanHoeveelheid = tijdsduurAfhankelijkVanHoeveelheid;
            TijdsGebonden = tijdsGebonden;
            Planning = planning;
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

    public Werknemer getUitgevoerdDoorWerknemer() {
        return UitgevoerdDoorWerknemer;
    }

    public void setUitgevoerdDoorWerknemer(Werknemer UitgevoerdDoorWerknemer) {
        this.UitgevoerdDoorWerknemer = UitgevoerdDoorWerknemer;
    }

    public Planning getPlanning() {
        return Planning;
    }

    public void setPlanning(Planning Planning) {
        this.Planning = Planning;
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
