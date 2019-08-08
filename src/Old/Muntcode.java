package Old;
import Utils.Util;

public class Muntcode implements Old { 
private int id_muntcode;
private String omschrijvingn;
private String omschrijvingf;
private String afkorting;
private double wisselkoers;
private int cc;

public Muntcode(String[] data){
this.id_muntcode = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.afkorting = data[3];
this.wisselkoers = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
}
public int getId_muntcode() {
return this.id_muntcode;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getAfkorting() {
return this.afkorting;
}
public double getWisselkoers() {
return this.wisselkoers;
}
public int getCc() {
return this.cc;
}
public void setId_muntcode(int id_muntcode){
 this.id_muntcode=id_muntcode;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setAfkorting(String afkorting){
 this.afkorting=afkorting;
 }
public void setWisselkoers(double wisselkoers){
 this.wisselkoers=wisselkoers;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}