package Old.Voorraad;
import Old.Old;
import Utils.Util;

public class Voorraadcorrectie implements Old { 
private int id_voorraadcorrectie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Voorraadcorrectie(String[] data){
this.id_voorraadcorrectie = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_voorraadcorrectie() {
return this.id_voorraadcorrectie;
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
public void setId_voorraadcorrectie(int id_voorraadcorrectie){
 this.id_voorraadcorrectie=id_voorraadcorrectie;
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