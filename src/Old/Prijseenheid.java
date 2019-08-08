package Old;
import Utils.Util;

public class Prijseenheid implements Old { 
private int id_prijseenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Prijseenheid(String[] data){
this.id_prijseenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_prijseenheid() {
return this.id_prijseenheid;
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
public void setId_prijseenheid(int id_prijseenheid){
 this.id_prijseenheid=id_prijseenheid;
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