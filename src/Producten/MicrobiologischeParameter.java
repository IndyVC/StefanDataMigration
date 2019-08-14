/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class MicrobiologischeParameter implements New {
    public int MicroBiologischeParameterId;

        public Omschrijving Omschrijving;
        public Omschrijving TekstTechnischeFicheOmschrijving;

    public MicrobiologischeParameter() {
    }

    public MicrobiologischeParameter(int MicroBiologischeParameterId, Omschrijving Omschrijving, Omschrijving TekstTechnischeFiche) {
        this.MicroBiologischeParameterId = MicroBiologischeParameterId;
        this.Omschrijving = Omschrijving;
        this.TekstTechnischeFicheOmschrijving = TekstTechnischeFiche;
    }

    public int getMicroBiologischeParameterId() {
        return MicroBiologischeParameterId;
    }

    public void setMicroBiologischeParameterId(int MicroBiologischeParameterId) {
        this.MicroBiologischeParameterId = MicroBiologischeParameterId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Omschrijving getTekstTechnischeFicheOmschrijving() {
        return TekstTechnischeFicheOmschrijving;
    }

    public void setTekstTechnischeFicheOmschrijving(Omschrijving TekstTechnischeFicheOmschrijving) {
        this.TekstTechnischeFicheOmschrijving = TekstTechnischeFicheOmschrijving;
    }

    @Override
    public void setId(int id) {
        this.MicroBiologischeParameterId=id;
    }
        
     @Override
    public int getId() {
        return this.MicroBiologischeParameterId;
    }
        
}
