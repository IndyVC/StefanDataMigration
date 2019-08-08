package Old;
import Utils.Util;

public class Taalcode implements Old { 
private int id_taalcode;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private String id_convertie;

public Taalcode(String[] data){
this.id_taalcode = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.id_convertie = data[4];
}
public int getId_taalcode() {
return this.id_taalcode;
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
public void setId_taalcode(int id_taalcode){
 this.id_taalcode=id_taalcode;
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