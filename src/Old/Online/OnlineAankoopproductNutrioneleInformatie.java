package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineAankoopproductNutrioneleInformatie implements Old { 
private int id_online;
private int id_nutrionele_informatie_header;
private int id_nutrionele_informatie_detail;
private double waarde;

public OnlineAankoopproductNutrioneleInformatie(String[] data){
this.id_online = Util.Int(data[0]);
this.id_nutrionele_informatie_header = Util.Int(data[1]);
this.id_nutrionele_informatie_detail = Util.Int(data[2]);
this.waarde = Util.Double(data[3]);
}
public int getId_online() {
return this.id_online;
}
public int getId_nutrionele_informatie_header() {
return this.id_nutrionele_informatie_header;
}
public int getId_nutrionele_informatie_detail() {
return this.id_nutrionele_informatie_detail;
}
public double getWaarde() {
return this.waarde;
}
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setId_nutrionele_informatie_header(int id_nutrionele_informatie_header){
 this.id_nutrionele_informatie_header=id_nutrionele_informatie_header;
 }
public void setId_nutrionele_informatie_detail(int id_nutrionele_informatie_detail){
 this.id_nutrionele_informatie_detail=id_nutrionele_informatie_detail;
 }
public void setWaarde(double waarde){
 this.waarde=waarde;
 }
}