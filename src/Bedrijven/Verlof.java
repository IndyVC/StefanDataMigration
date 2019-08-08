/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;
import New.New;
import Old.Klant.Klant;
import TussenTabellen.KlantVerlof;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Verlof implements New{

    public int VerlofId;
    public Date StartDatum;
    public Date EindDatum;
    
    public List<KlantVerlof> VerlofKlanten;
    public List<Klant> Klanten;

    public Verlof() {
    }

    public Verlof(int VerlofId, Date StartDatum, Date EindDatum, List<KlantVerlof> VerlofKlanten, List<Klant> Klanten) {
        this.VerlofId = VerlofId;
        this.StartDatum = StartDatum;
        this.EindDatum = EindDatum;
        this.VerlofKlanten = VerlofKlanten;
        this.Klanten = Klanten;
    }

    public int getVerlofId() {
        return VerlofId;
    }

    public void setVerlofId(int VerlofId) {
        this.VerlofId = VerlofId;
    }

    public Date getStartDatum() {
        return StartDatum;
    }

    public void setStartDatum(Date StartDatum) {
        this.StartDatum = StartDatum;
    }

    public Date getEindDatum() {
        return EindDatum;
    }

    public void setEindDatum(Date EindDatum) {
        this.EindDatum = EindDatum;
    }

    public List<KlantVerlof> getVerlofKlanten() {
        return VerlofKlanten;
    }

    public void setVerlofKlanten(List<KlantVerlof> VerlofKlanten) {
        this.VerlofKlanten = VerlofKlanten;
    }

    public List<Klant> getKlanten() {
        return Klanten;
    }

    public void setKlanten(List<Klant> Klanten) {
        this.Klanten = Klanten;
    }

    @Override
    public void setId(int id) {
        this.VerlofId=id;
    }

    @Override
    public int getId() {
        return this.VerlofId;
    }
    
    
}
