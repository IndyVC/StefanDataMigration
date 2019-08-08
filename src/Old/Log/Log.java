package Old.Log;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Log implements Old { 
private Date tijd;
private String data;
private int id_bedrijf;
private int id_toegang;
private int id_verwerking;
private String werkstation;
private int hoeveelheid;
private String dateandlot;
private String beschrijving;

public Log(String[] data){
this.tijd = Util.Date(data[0]);
this.data = data[1];
this.id_bedrijf = Util.Int(data[2]);
this.id_toegang = Util.Int(data[3]);
this.id_verwerking = Util.Int(data[4]);
this.werkstation = data[5];
this.hoeveelheid = Util.Int(data[6]);
this.dateandlot = data[7];
this.beschrijving = data[8];
}
public Date getTijd() {
return this.tijd;
}
public String getData() {
return this.data;
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_toegang() {
return this.id_toegang;
}
public int getId_verwerking() {
return this.id_verwerking;
}
public String getWerkstation() {
return this.werkstation;
}
public int getHoeveelheid() {
return this.hoeveelheid;
}
public String getDateandlot() {
return this.dateandlot;
}
public String getBeschrijving() {
return this.beschrijving;
}
public void setTijd(Date tijd){
 this.tijd=tijd;
 }
public void setData(String data){
 this.data=data;
 }
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_toegang(int id_toegang){
 this.id_toegang=id_toegang;
 }
public void setId_verwerking(int id_verwerking){
 this.id_verwerking=id_verwerking;
 }
public void setWerkstation(String werkstation){
 this.werkstation=werkstation;
 }
public void setHoeveelheid(int hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setDateandlot(String dateandlot){
 this.dateandlot=dateandlot;
 }
public void setBeschrijving(String beschrijving){
 this.beschrijving=beschrijving;
 }
}