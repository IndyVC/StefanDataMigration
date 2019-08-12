/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class Dagboek implements New {
    
    public int DagboekId;
    public Omschrijving Omschrijving;
    public String ExterneCode;
    public AlgemeneRekening AlgemeneRekeningLeveranciers;
    public AlgemeneRekening AlgemeneRekeningKortingOntvangen;
    public AlgemeneRekening AlgemeneRekeningKlanten;
    public AlgemeneRekening AlgemeneRekeningKortingGegeven;
    public boolean Blokkeren;
    
    public Dagboek() {
    }

    public Dagboek(int DagboekId, Omschrijving Omschrijving, String ExterneCode, AlgemeneRekening AlgemeneRekeningLeveranciers, AlgemeneRekening AlgemeneRekeningKortingOntvangen, AlgemeneRekening AlgemeneRekeningKlanten, AlgemeneRekening AlgemeneRekeningKortingGegeven, boolean Blokkeren) {
        this.DagboekId = DagboekId;
        this.Omschrijving = Omschrijving;
        this.ExterneCode = ExterneCode;
        this.AlgemeneRekeningLeveranciers = AlgemeneRekeningLeveranciers;
        this.AlgemeneRekeningKortingOntvangen = AlgemeneRekeningKortingOntvangen;
        this.AlgemeneRekeningKlanten = AlgemeneRekeningKlanten;
        this.AlgemeneRekeningKortingGegeven = AlgemeneRekeningKortingGegeven;
        this.Blokkeren = Blokkeren;
    }

    public int getDagboekId() {
        return DagboekId;
    }

    public void setDagboekId(int DagboekId) {
        this.DagboekId = DagboekId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public String getExterneCode() {
        return ExterneCode;
    }

    public void setExterneCode(String ExterneCode) {
        this.ExterneCode = ExterneCode;
    }

    public AlgemeneRekening getAlgemeneRekeningLeveranciers() {
        return AlgemeneRekeningLeveranciers;
    }

    public void setAlgemeneRekeningLeveranciers(AlgemeneRekening AlgemeneRekeningLeveranciers) {
        this.AlgemeneRekeningLeveranciers = AlgemeneRekeningLeveranciers;
    }

    public AlgemeneRekening getAlgemeneRekeningKortingOntvangen() {
        return AlgemeneRekeningKortingOntvangen;
    }

    public void setAlgemeneRekeningKortingOntvangen(AlgemeneRekening AlgemeneRekeningKortingOntvangen) {
        this.AlgemeneRekeningKortingOntvangen = AlgemeneRekeningKortingOntvangen;
    }

    public AlgemeneRekening getAlgemeneRekeningKlanten() {
        return AlgemeneRekeningKlanten;
    }

    public void setAlgemeneRekeningKlanten(AlgemeneRekening AlgemeneRekeningKlanten) {
        this.AlgemeneRekeningKlanten = AlgemeneRekeningKlanten;
    }

    public AlgemeneRekening getAlgemeneRekeningKortingGegeven() {
        return AlgemeneRekeningKortingGegeven;
    }

    public void setAlgemeneRekeningKortingGegeven(AlgemeneRekening AlgemeneRekeningKortingGegeven) {
        this.AlgemeneRekeningKortingGegeven = AlgemeneRekeningKortingGegeven;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.DagboekId=id;
    }
     @Override
    public int getId() {
        return this.DagboekId;
    }
    
}
