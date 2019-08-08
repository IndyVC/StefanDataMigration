package Old;
import Utils.Util;

public class BtwcodeLeverancier implements Old { 
private int id_btwcode;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public BtwcodeLeverancier(String[] data){
this.id_btwcode = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_btwcode() {
return this.id_btwcode;
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
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
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