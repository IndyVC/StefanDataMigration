package Old;
import Utils.Util;

public class Bewaartemperatuur implements Old { 
private int id_bewaartemperatuur;
private String omschrijvingn;
private String omschrijvingf;
private int bewaartemperatuur_minimum;
private int cc;
private int bewaartemperatuur_maximum;

public Bewaartemperatuur(String[] data){
this.id_bewaartemperatuur = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.bewaartemperatuur_minimum = Util.Int(data[3]);
this.cc = Util.Int(data[4]);
this.bewaartemperatuur_maximum = Util.Int(data[5]);
}
public int getId_bewaartemperatuur() {
return this.id_bewaartemperatuur;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getBewaartemperatuur_minimum() {
return this.bewaartemperatuur_minimum;
}
public int getCc() {
return this.cc;
}
public int getBewaartemperatuur_maximum() {
return this.bewaartemperatuur_maximum;
}
public void setId_bewaartemperatuur(int id_bewaartemperatuur){
 this.id_bewaartemperatuur=id_bewaartemperatuur;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setBewaartemperatuur_minimum(int bewaartemperatuur_minimum){
 this.bewaartemperatuur_minimum=bewaartemperatuur_minimum;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setBewaartemperatuur_maximum(int bewaartemperatuur_maximum){
 this.bewaartemperatuur_maximum=bewaartemperatuur_maximum;
 }
}