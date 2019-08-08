package Old;
import Utils.Util;

public class Regelmaat implements Old { 
private int id_regelmaat;
private String omschrijvingn;
private String omschrijvingf;
private int id_sub_periode;

public Regelmaat(String[] data){
this.id_regelmaat = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_sub_periode = Util.Int(data[3]);
}
public int getId_regelmaat() {
return this.id_regelmaat;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_sub_periode() {
return this.id_sub_periode;
}
public void setId_regelmaat(int id_regelmaat){
 this.id_regelmaat=id_regelmaat;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_sub_periode(int id_sub_periode){
 this.id_sub_periode=id_sub_periode;
 }
}