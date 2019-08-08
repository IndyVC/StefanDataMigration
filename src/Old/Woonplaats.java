package Old;
import Utils.Util;

public class Woonplaats implements Old { 
private int id_land;
private String postcode;
private String woonplaats;
private int cc;

public Woonplaats(String[] data){
this.id_land = Util.Int(data[0]);
this.postcode = data[1];
this.woonplaats = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_land() {
return this.id_land;
}
public String getPostcode() {
return this.postcode;
}
public String getWoonplaats() {
return this.woonplaats;
}
public int getCc() {
return this.cc;
}
public void setId_land(int id_land){
 this.id_land=id_land;
 }
public void setPostcode(String postcode){
 this.postcode=postcode;
 }
public void setWoonplaats(String woonplaats){
 this.woonplaats=woonplaats;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}