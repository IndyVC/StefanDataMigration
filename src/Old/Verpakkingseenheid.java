package Old;
import Utils.Util;

public class Verpakkingseenheid implements Old { 
private int id_verpakkingseenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private String afkortingn;
private String afkortingf;
private boolean aankoopproducten;
private boolean verkoopproducten;

public Verpakkingseenheid(String[] data){
this.id_verpakkingseenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.afkortingn = data[4];
this.afkortingf = data[5];
this.aankoopproducten = Util.Boolean(data[6]);
this.verkoopproducten = Util.Boolean(data[7]);
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
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
public String getAfkortingn() {
return this.afkortingn;
}
public String getAfkortingf() {
return this.afkortingf;
}
public boolean getAankoopproducten() {
return this.aankoopproducten;
}
public boolean getVerkoopproducten() {
return this.verkoopproducten;
}
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
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
public void setAfkortingn(String afkortingn){
 this.afkortingn=afkortingn;
 }
public void setAfkortingf(String afkortingf){
 this.afkortingf=afkortingf;
 }
public void setAankoopproducten(boolean aankoopproducten){
 this.aankoopproducten=aankoopproducten;
 }
public void setVerkoopproducten(boolean verkoopproducten){
 this.verkoopproducten=verkoopproducten;
 }
}