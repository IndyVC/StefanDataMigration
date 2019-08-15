/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

/**
 *
 * @author stefa
 */
public class Opmerking {

    public int OpmerkingId;
    public String Tekst;

    public Opmerking() {
    }

    public Opmerking(int OpmerkingId, String Tekst) {
        this.OpmerkingId = OpmerkingId;
        this.Tekst = Tekst;
    }

    public int getOpmerkingId() {
        return OpmerkingId;
    }

    public void setOpmerkingId(int OpmerkingId) {
        this.OpmerkingId = OpmerkingId;
    }

    public String getTekst() {
        return Tekst;
    }

    public void setTekst(String Tekst) {
        this.Tekst = Tekst;
    }

}
