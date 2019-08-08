/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;
import java.sql.Date;

/**
 *
 * @author stefa
 */
public class TechnischeVersie implements New{

    public int TechnischeVersieId;

    public String Versienummer;

    public Date Versiedatum;

    public TechnischeVersie() {
    }

    public TechnischeVersie(int TechnischeVersieId, String Versienummer, Date Versiedatum) {
        this.TechnischeVersieId = TechnischeVersieId;
        this.Versienummer = Versienummer;
        this.Versiedatum = Versiedatum;
    }

    public int getTechnischeVersieId() {
        return TechnischeVersieId;
    }

    public void setTechnischeVersieId(int TechnischeVersieId) {
        this.TechnischeVersieId = TechnischeVersieId;
    }

    public String getVersienummer() {
        return Versienummer;
    }

    public void setVersienummer(String Versienummer) {
        this.Versienummer = Versienummer;
    }

    public Date getVersiedatum() {
        return Versiedatum;
    }

    public void setVersiedatum(Date Versiedatum) {
        this.Versiedatum = Versiedatum;
    }

    @Override
    public void setId(int id) {
        this.TechnischeVersieId=id;
    }
 @Override
    public int getId() {
        return this.TechnischeVersieId;
    }
}
