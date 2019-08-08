package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;

public class Aankoopeenheid implements Old { 
private int id_aankoopeenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Aankoopeenheid(String[] data){
this.id_aankoopeenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_aankoopeenheid() {
return this.id_aankoopeenheid;
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
public void setId_aankoopeenheid(int id_aankoopeenheid){
 this.id_aankoopeenheid=id_aankoopeenheid;
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