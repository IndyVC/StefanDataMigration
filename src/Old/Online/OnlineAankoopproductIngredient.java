package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineAankoopproductIngredient implements Old { 
private int id_online;
private int id_ingredient;
private double percentage;
private boolean kwid;
private boolean vermelden_type;
private int volgnummer;
private int ppm;

public OnlineAankoopproductIngredient(String[] data){
this.id_online = Util.Int(data[0]);
this.id_ingredient = Util.Int(data[1]);
this.percentage = Util.Double(data[2]);
this.kwid = Util.Boolean(data[3]);
this.vermelden_type = Util.Boolean(data[4]);
this.volgnummer = Util.Int(data[5]);
this.ppm = Util.Int(data[6]);
}
public int getId_online() {
return this.id_online;
}
public int getId_ingredient() {
return this.id_ingredient;
}
public double getPercentage() {
return this.percentage;
}
public boolean getKwid() {
return this.kwid;
}
public boolean getVermelden_type() {
return this.vermelden_type;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getPpm() {
return this.ppm;
}
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
 }
public void setKwid(boolean kwid){
 this.kwid=kwid;
 }
public void setVermelden_type(boolean vermelden_type){
 this.vermelden_type=vermelden_type;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setPpm(int ppm){
 this.ppm=ppm;
 }
}