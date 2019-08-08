package Old.Voorraad;
import Old.Old;
import Utils.Util;

public class Voorraadplaats implements Old { 
private int id_voorraadplaats;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private boolean aankoopproducten;
private boolean halffabrikaten;
private boolean voorbereide_producten;
private boolean afgewerkte_producten;
private boolean verkoopproducten;
private int id_leveradres;

public Voorraadplaats(String[] data){
this.id_voorraadplaats = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.aankoopproducten = Util.Boolean(data[4]);
this.halffabrikaten = Util.Boolean(data[5]);
this.voorbereide_producten = Util.Boolean(data[6]);
this.afgewerkte_producten = Util.Boolean(data[7]);
this.verkoopproducten = Util.Boolean(data[8]);
this.id_leveradres = Util.Int(data[9]);
}
public int getId_voorraadplaats() {
return this.id_voorraadplaats;
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
public boolean getAankoopproducten() {
return this.aankoopproducten;
}
public boolean getHalffabrikaten() {
return this.halffabrikaten;
}
public boolean getVoorbereide_producten() {
return this.voorbereide_producten;
}
public boolean getAfgewerkte_producten() {
return this.afgewerkte_producten;
}
public boolean getVerkoopproducten() {
return this.verkoopproducten;
}
public int getId_leveradres() {
return this.id_leveradres;
}
public void setId_voorraadplaats(int id_voorraadplaats){
 this.id_voorraadplaats=id_voorraadplaats;
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
public void setAankoopproducten(boolean aankoopproducten){
 this.aankoopproducten=aankoopproducten;
 }
public void setHalffabrikaten(boolean halffabrikaten){
 this.halffabrikaten=halffabrikaten;
 }
public void setVoorbereide_producten(boolean voorbereide_producten){
 this.voorbereide_producten=voorbereide_producten;
 }
public void setAfgewerkte_producten(boolean afgewerkte_producten){
 this.afgewerkte_producten=afgewerkte_producten;
 }
public void setVerkoopproducten(boolean verkoopproducten){
 this.verkoopproducten=verkoopproducten;
 }
public void setId_leveradres(int id_leveradres){
 this.id_leveradres=id_leveradres;
 }
}