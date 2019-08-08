package Old.Recept;
import Old.Old;
import Utils.Util;

public class Receptgroep implements Old { 
private int id_receptgroep;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private String id_convertie;

public Receptgroep(String[] data){
this.id_receptgroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.id_convertie = data[4];
}
public int getId_receptgroep() {
return this.id_receptgroep;
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
public String getId_convertie() {
return this.id_convertie;
}
public void setId_receptgroep(int id_receptgroep){
 this.id_receptgroep=id_receptgroep;
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
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
}