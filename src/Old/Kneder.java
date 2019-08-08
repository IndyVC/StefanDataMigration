package Old;
import Utils.Util;

public class Kneder implements Old { 
private int id_kneder;
private String id_convertie;
private String omschrijvingn;
private String omschrijvingf;
private double inhoud;
private int cc;

public Kneder(String[] data){
this.id_kneder = Util.Int(data[0]);
this.id_convertie = data[1];
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.inhoud = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
}
public int getId_kneder() {
return this.id_kneder;
}
public String getId_convertie() {
return this.id_convertie;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getInhoud() {
return this.inhoud;
}
public int getCc() {
return this.cc;
}
public void setId_kneder(int id_kneder){
 this.id_kneder=id_kneder;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setInhoud(double inhoud){
 this.inhoud=inhoud;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}