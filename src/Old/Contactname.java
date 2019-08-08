package Old;
import Utils.Util;

public class Contactname implements Old { 
private int id_contactname;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Contactname(String[] data){
this.id_contactname = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_contactname() {
return this.id_contactname;
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
public void setId_contactname(int id_contactname){
 this.id_contactname=id_contactname;
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