package Old;
import Utils.Util;

public class Leveranciersgroep implements Old { 
private int id_leveranciersgroep;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Leveranciersgroep(String[] data){
this.id_leveranciersgroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_leveranciersgroep() {
return this.id_leveranciersgroep;
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
public void setId_leveranciersgroep(int id_leveranciersgroep){
 this.id_leveranciersgroep=id_leveranciersgroep;
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