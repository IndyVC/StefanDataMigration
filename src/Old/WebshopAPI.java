package Old;
import Utils.Util;

public class WebshopAPI implements Old { 
private int id_webshop_api;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public WebshopAPI(String[] data){
this.id_webshop_api = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_webshop_api() {
return this.id_webshop_api;
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
public void setId_webshop_api(int id_webshop_api){
 this.id_webshop_api=id_webshop_api;
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