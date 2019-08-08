package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineFunctie implements Old { 
private int id_functie;
private String omschrijvingn;
private String omschrijvingf;

public OnlineFunctie(String[] data){
this.id_functie = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
}
public int getId_functie() {
return this.id_functie;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public void setId_functie(int id_functie){
 this.id_functie=id_functie;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
}