package Old.Product;
import Old.Old;
import Utils.Util;

public class Productgroep implements Old { 
private int id_productgroep;
private String omschrijvingn;
private String omschrijvingf;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private int cc;
private int id_productcategorie;

public Productgroep(String[] data){
this.id_productgroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_algemene_rekening_type = Util.Int(data[3]);
this.id_algemene_rekening = Util.Int(data[4]);
this.cc = Util.Int(data[5]);
this.id_productcategorie = Util.Int(data[6]);
}
public int getId_productgroep() {
return this.id_productgroep;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_algemene_rekening_type() {
return this.id_algemene_rekening_type;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public int getCc() {
return this.cc;
}
public int getId_productcategorie() {
return this.id_productcategorie;
}
public void setId_productgroep(int id_productgroep){
 this.id_productgroep=id_productgroep;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_algemene_rekening_type(int id_algemene_rekening_type){
 this.id_algemene_rekening_type=id_algemene_rekening_type;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_productcategorie(int id_productcategorie){
 this.id_productcategorie=id_productcategorie;
 }
}