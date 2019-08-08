/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Old;

/**
 *
 * @author stefa
 */
public class Tekst implements Old{
    
    private String id_tekst;
    private String tekst;
    private String tekstn;
    private String tekstf;
    private String tekste;

    public Tekst(String id_tekst, String tekst, String tekstn, String tekstf, String tekste) {
        this.id_tekst = id_tekst;
        this.tekst = tekst;
        this.tekstn = tekstn;
        this.tekstf = tekstf;
        this.tekste = tekste;
    }
            
    
    public Tekst(String[] data) {
        this.id_tekst = data[0];
        this.tekst = data[1];
        this.tekstn = data[2];
        this.tekstf = data[3];
        this.tekste = data[4];
    }

    public String getId_tekst() {
        return id_tekst;
    }

    public void setId_tekst(String id_tekst) {
        this.id_tekst = id_tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getTekstn() {
        return tekstn;
    }

    public void setTekstn(String tekstn) {
        this.tekstn = tekstn;
    }

    public String getTekstf() {
        return tekstf;
    }

    public void setTekstf(String tekstf) {
        this.tekstf = tekstf;
    }

    public String getTekste() {
        return tekste;
    }

    public void setTekste(String tekste) {
        this.tekste = tekste;
    }
    
    
    
}
