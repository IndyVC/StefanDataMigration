package Old.Product;
import Old.Old;
import Utils.Util;

public class Productsubgroep implements Old { 
private int id_productsubgroep;
private String omschrijvingn;
private String omschrijvingf;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private int cc;
private int id_bedrijf;
private String zoekomschrijving;
private int id_productgroep;

public Productsubgroep(String[] data){
this.id_productsubgroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_algemene_rekening_type = Util.Int(data[3]);
this.id_algemene_rekening = Util.Int(data[4]);
this.cc = Util.Int(data[5]);
this.id_bedrijf = Util.Int(data[6]);
this.zoekomschrijving = data[7];
this.id_productgroep = Util.Int(data[8]);
}
public int getId_productsubgroep() {
return this.id_productsubgroep;
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
public int getId_bedrijf() {
return this.id_bedrijf;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public int getId_productgroep() {
return this.id_productgroep;
}
public void setId_productsubgroep(int id_productsubgroep){
 this.id_productsubgroep=id_productsubgroep;
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
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setId_productgroep(int id_productgroep){
 this.id_productgroep=id_productgroep;
 }
}