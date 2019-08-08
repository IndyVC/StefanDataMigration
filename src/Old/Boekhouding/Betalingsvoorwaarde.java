package Old.Boekhouding;
import Old.Old;
import Utils.Util;

public class Betalingsvoorwaarde implements Old { 
private int id_betalingsvoorwaarde;
private String omschrijvingn;
private String omschrijvingf;
private int aantaldagen;
private String codeberekenenvervaldatum;
private String codeboekhouding;
private int cc;

public Betalingsvoorwaarde(String[] data){
this.id_betalingsvoorwaarde = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.aantaldagen = Util.Int(data[3]);
this.codeberekenenvervaldatum = data[4];
this.codeboekhouding = data[5];
this.cc = Util.Int(data[6]);
}
public int getId_betalingsvoorwaarde() {
return this.id_betalingsvoorwaarde;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getAantaldagen() {
return this.aantaldagen;
}
public String getCodeberekenenvervaldatum() {
return this.codeberekenenvervaldatum;
}
public String getCodeboekhouding() {
return this.codeboekhouding;
}
public int getCc() {
return this.cc;
}
public void setId_betalingsvoorwaarde(int id_betalingsvoorwaarde){
 this.id_betalingsvoorwaarde=id_betalingsvoorwaarde;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setAantaldagen(int aantaldagen){
 this.aantaldagen=aantaldagen;
 }
public void setCodeberekenenvervaldatum(String codeberekenenvervaldatum){
 this.codeberekenenvervaldatum=codeberekenenvervaldatum;
 }
public void setCodeboekhouding(String codeboekhouding){
 this.codeboekhouding=codeboekhouding;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}