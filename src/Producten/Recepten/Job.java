/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten.Recepten;

import Algemeen.Omschrijving;
import Bedrijven.FunctieVanPersoon;
import New.New;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Job implements New{

    public int JobId;
    public Omschrijving Omschrijving;
    public String ExterneCode;
    public FunctieVanPersoon FunctieVanPersoon;
    public int Volgnummer;
    public boolean Blokkeren;
    public List<BasisRecept> Recepten;
    public List<Taak> Taken;

    public Job() {
    }

    public Job(int JobId, Omschrijving Omschrijving, String ExterneCode, FunctieVanPersoon FunctieVanPersoon, int Volgnummer, boolean Blokkeren, List<BasisRecept> Recepten, List<Taak> Taken) {
        this.JobId = JobId;
        this.Omschrijving = Omschrijving;
        this.ExterneCode = ExterneCode;
        this.FunctieVanPersoon = FunctieVanPersoon;
        this.Volgnummer = Volgnummer;
        this.Blokkeren = Blokkeren;
        this.Recepten = Recepten;
        this.Taken = Taken;
    }

    public int getJobId() {
        return JobId;
    }

    public void setJobId(int JobId) {
        this.JobId = JobId;
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

    public FunctieVanPersoon getFunctieVanPersoon() {
        return FunctieVanPersoon;
    }

    public void setFunctieVanPersoon(FunctieVanPersoon FunctieVanPersoon) {
        this.FunctieVanPersoon = FunctieVanPersoon;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public List<BasisRecept> getRecepten() {
        return Recepten;
    }

    public void setRecepten(List<BasisRecept> Recepten) {
        this.Recepten = Recepten;
    }

    public List<Taak> getTaken() {
        return Taken;
    }

    public void setTaken(List<Taak> Taken) {
        this.Taken = Taken;
    }

    @Override
    public void setId(int id) {
        this.JobId=id;
    }
     @Override
    public int getId() {
        return this.JobId;
    }
    
}
