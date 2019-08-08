package Old.Bestelling;
import Old.Old;
import Utils.Util;

public class Bestelgroep implements Old { 
private int id_bestelgroep;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Bestelgroep(String[] data){
this.id_bestelgroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_bestelgroep() {
return this.id_bestelgroep;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getCc() {
return this.cc;
}
public void setId_bestelgroep(int id_bestelgroep){
 this.id_bestelgroep=id_bestelgroep;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}