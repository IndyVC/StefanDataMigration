/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import java.sql.Date;


/**
 *
 * @author stefa
 */
public class Onderhoud implements New{
    public int OnderhoudId;
        public Omschrijving Omschrijving;
        public Date OnderhoudsDatum;

    public Onderhoud() {
    }

    public Onderhoud(int OnderhoudId, Omschrijving Omschrijving, Date OnderhoudsDatum) {
        this.OnderhoudId = OnderhoudId;
        this.Omschrijving = Omschrijving;
        this.OnderhoudsDatum = OnderhoudsDatum;
    }

    public int getOnderhoudId() {
        return OnderhoudId;
    }

    public void setOnderhoudId(int OnderhoudId) {
        this.OnderhoudId = OnderhoudId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Date getOnderhoudsDatum() {
        return OnderhoudsDatum;
    }

    public void setOnderhoudsDatum(Date OnderhoudsDatum) {
        this.OnderhoudsDatum = OnderhoudsDatum;
    }

    @Override
    public void setId(int id) {
        this.OnderhoudId=id;
    }
        
         @Override
    public int getId() {
        return this.OnderhoudId;
    }
}
