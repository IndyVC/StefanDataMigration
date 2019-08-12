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
    public AlgemeneRekening AlgemeneRekeningLeveranciersAlgemeneRekening;
    public AlgemeneRekening AlgemeneRekeningKortingOntvangenAlgemeneRekening;
    public AlgemeneRekening AlgemeneRekeningKlantenAlgemeneRekening;
    public AlgemeneRekening AlgemeneRekeningKortingGegevenAlgemeneRekening;
    public boolean Blokkeren;
    
    public Dagboek() {
    }

    public Dagboek(int DagboekId, Omschrijving Omschrijving, String ExterneCode, AlgemeneRekening AlgemeneRekeningLeveranciers, AlgemeneRekening AlgemeneRekeningKortingOntvangen, AlgemeneRekening AlgemeneRekeningKlanten, AlgemeneRekening AlgemeneRekeningKortingGegeven, boolean Blokkeren) {
        this.DagboekId = DagboekId;
        this.Omschrijving = Omschrijving;
        this.ExterneCode = ExterneCode;
        this.AlgemeneRekeningLeveranciersAlgemeneRekening = AlgemeneRekeningLeveranciers;
        this.AlgemeneRekeningKortingOntvangenAlgemeneRekening = AlgemeneRekeningKortingOntvangen;
        this.AlgemeneRekeningKlantenAlgemeneRekening = AlgemeneRekeningKlanten;
        this.AlgemeneRekeningKortingGegevenAlgemeneRekening = AlgemeneRekeningKortingGegeven;
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

    public AlgemeneRekening getAlgemeneRekeningLeveranciersAlgemeneRekening() {
        return AlgemeneRekeningLeveranciersAlgemeneRekening;
    }

    public void setAlgemeneRekeningLeveranciersAlgemeneRekening(AlgemeneRekening AlgemeneRekeningLeveranciersAlgemeneRekening) {
        this.AlgemeneRekeningLeveranciersAlgemeneRekening = AlgemeneRekeningLeveranciersAlgemeneRekening;
    }

    public AlgemeneRekening getAlgemeneRekeningKortingOntvangenAlgemeneRekening() {
        return AlgemeneRekeningKortingOntvangenAlgemeneRekening;
    }

    public void setAlgemeneRekeningKortingOntvangenAlgemeneRekening(AlgemeneRekening AlgemeneRekeningKortingOntvangenAlgemeneRekening) {
        this.AlgemeneRekeningKortingOntvangenAlgemeneRekening = AlgemeneRekeningKortingOntvangenAlgemeneRekening;
    }

    public AlgemeneRekening getAlgemeneRekeningKlantenAlgemeneRekening() {
        return AlgemeneRekeningKlantenAlgemeneRekening;
    }

    public void setAlgemeneRekeningKlantenAlgemeneRekening(AlgemeneRekening AlgemeneRekeningKlantenAlgemeneRekening) {
        this.AlgemeneRekeningKlantenAlgemeneRekening = AlgemeneRekeningKlantenAlgemeneRekening;
    }

    public AlgemeneRekening getAlgemeneRekeningKortingGegevenAlgemeneRekening() {
        return AlgemeneRekeningKortingGegevenAlgemeneRekening;
    }

    public void setAlgemeneRekeningKortingGegevenAlgemeneRekening(AlgemeneRekening AlgemeneRekeningKortingGegevenAlgemeneRekening) {
        this.AlgemeneRekeningKortingGegevenAlgemeneRekening = AlgemeneRekeningKortingGegevenAlgemeneRekening;
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
