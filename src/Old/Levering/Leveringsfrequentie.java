package Old.Levering;
import Old.Old;
import Utils.Util;

public class Leveringsfrequentie implements Old { 
private int id_leveringsfrequentie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Leveringsfrequentie(String[] data){
this.id_leveringsfrequentie = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_leveringsfrequentie() {
return this.id_leveringsfrequentie;
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
public void setId_leveringsfrequentie(int id_leveringsfrequentie){
 this.id_leveringsfrequentie=id_leveringsfrequentie;
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