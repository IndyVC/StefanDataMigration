package Old.Recept;
import Old.Old;
import Utils.Util;

public class Receptingave implements Old { 
private int id_receptingave;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Receptingave(String[] data){
this.id_receptingave = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_receptingave() {
return this.id_receptingave;
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
public void setId_receptingave(int id_receptingave){
 this.id_receptingave=id_receptingave;
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