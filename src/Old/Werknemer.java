package Old;
import Utils.Util;

public class Werknemer implements Old { 
private int id_bedrijf;
private int id_werknemer;
private String naam;
private String paswoord;
private int cc;

public Werknemer(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_werknemer = Util.Int(data[1]);
this.naam = data[2];
this.paswoord = data[3];
this.cc = Util.Int(data[4]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_werknemer() {
return this.id_werknemer;
}
public String getNaam() {
return this.naam;
}
public String getPaswoord() {
return this.paswoord;
}
public int getCc() {
return this.cc;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_werknemer(int id_werknemer){
 this.id_werknemer=id_werknemer;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setPaswoord(String paswoord){
 this.paswoord=paswoord;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}