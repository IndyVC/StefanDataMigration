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
public class VerkoopProductGroep implements New{
    public int VerkoopProductGroepId;
        public Omschrijving Omschrijving;
        public String Folder;
        public Productiegroep Productiegroep;
        public boolean ReceptenOnline;

    public VerkoopProductGroep() {
    }

    public VerkoopProductGroep(int VerkoopProductGroepId, Omschrijving Omschrijving, String Folder, Productiegroep Productiegroep, boolean ReceptenOnline) {
        this.VerkoopProductGroepId = VerkoopProductGroepId;
        this.Omschrijving = Omschrijving;
        this.Folder = Folder;
        this.Productiegroep = Productiegroep;
        this.ReceptenOnline = ReceptenOnline;
    }

    public int getVerkoopProductGroepId() {
        return VerkoopProductGroepId;
    }

    public void setVerkoopProductGroepId(int VerkoopProductGroepId) {
        this.VerkoopProductGroepId = VerkoopProductGroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public String getFolder() {
        return Folder;
    }

    public void setFolder(String Folder) {
        this.Folder = Folder;
    }

    public Productiegroep getProductiegroep() {
        return Productiegroep;
    }

    public void setProductiegroep(Productiegroep Productiegroep) {
        this.Productiegroep = Productiegroep;
    }

    public boolean isReceptenOnline() {
        return ReceptenOnline;
    }

    public void setReceptenOnline(boolean ReceptenOnline) {
        this.ReceptenOnline = ReceptenOnline;
    }

    @Override
    public void setId(int id) {
        this.VerkoopProductGroepId=id;
    }
         @Override
    public int getId() {
        return this.VerkoopProductGroepId;
    }
        
}
