package Old.Allergeen;
import Old.Old;
import Utils.Util;

public class Allergeengroep implements Old { 
private int id_allergeengroep;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Allergeengroep(String[] data){
this.id_allergeengroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_allergeengroep() {
return this.id_allergeengroep;
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
public void setId_allergeengroep(int id_allergeengroep){
 this.id_allergeengroep=id_allergeengroep;
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