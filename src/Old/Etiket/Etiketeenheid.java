package Old.Etiket;
import Old.Old;
import Utils.Util;

public class Etiketeenheid implements Old { 
private int id_etiketteneenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Etiketeenheid(String[] data){
this.id_etiketteneenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_etiketteneenheid() {
return this.id_etiketteneenheid;
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
public void setId_etiketteneenheid(int id_etiketteneenheid){
 this.id_etiketteneenheid=id_etiketteneenheid;
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