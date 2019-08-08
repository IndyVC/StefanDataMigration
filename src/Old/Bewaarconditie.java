package Old;
import Utils.Util;

public class Bewaarconditie implements Old { 
private int id_bewaarconditie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Bewaarconditie(String[] data){
this.id_bewaarconditie = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_bewaarconditie() {
return this.id_bewaarconditie;
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
public void setId_bewaarconditie(int id_bewaarconditie){
 this.id_bewaarconditie=id_bewaarconditie;
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