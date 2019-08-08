package Old.Voorraad;
import Old.Old;
import Utils.Util;

public class Voorraadeenheid implements Old { 
private int id_voorraadeenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Voorraadeenheid(String[] data){
this.id_voorraadeenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_voorraadeenheid() {
return this.id_voorraadeenheid;
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
public void setId_voorraadeenheid(int id_voorraadeenheid){
 this.id_voorraadeenheid=id_voorraadeenheid;
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