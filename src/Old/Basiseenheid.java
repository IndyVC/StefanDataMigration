package Old;
import Utils.Util;

public class Basiseenheid implements Old { 
private int id_basiseenheid;
private String omschrijvingn;
private String omschrijvingf;
private String afkortingn;
private String afkortingf;
private int cc;

public Basiseenheid(String[] data){
this.id_basiseenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.afkortingn = data[3];
this.afkortingf = data[4];
this.cc = Util.Int(data[5]);
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getAfkortingn() {
return this.afkortingn;
}
public String getAfkortingf() {
return this.afkortingf;
}
public int getCc() {
return this.cc;
}
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setAfkortingn(String afkortingn){
 this.afkortingn=afkortingn;
 }
public void setAfkortingf(String afkortingf){
 this.afkortingf=afkortingf;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}