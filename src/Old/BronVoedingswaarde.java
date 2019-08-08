package Old;
import Utils.Util;

public class BronVoedingswaarde implements Old { 
private int id_voedingswaarden_bron;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private boolean berekenen;

public BronVoedingswaarde(String[] data){
this.id_voedingswaarden_bron = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.berekenen = Util.Boolean(data[4]);
}
public int getId_voedingswaarden_bron() {
return this.id_voedingswaarden_bron;
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
public boolean getBerekenen() {
return this.berekenen;
}
public void setId_voedingswaarden_bron(int id_voedingswaarden_bron){
 this.id_voedingswaarden_bron=id_voedingswaarden_bron;
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
public void setBerekenen(boolean berekenen){
 this.berekenen=berekenen;
 }
}