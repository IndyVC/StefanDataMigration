package Old.Levering;
import Old.Old;
import Utils.Util;

public class Leveringsadres implements Old { 
private int id_bedrijf;
private int id_leveradres;
private String roepnaam;
private String straat;
private String huisnummer;
private int id_land;
private String postcode;
private String woonplaats;
private String telefoonnummer;
private boolean afhaaladres;

public Leveringsadres(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leveradres = Util.Int(data[1]);
this.roepnaam = data[2];
this.straat = data[3];
this.huisnummer = data[4];
this.id_land = Util.Int(data[5]);
this.postcode = data[6];
this.woonplaats = data[7];
this.telefoonnummer = data[8];
this.afhaaladres = Util.Boolean(data[9]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leveradres() {
return this.id_leveradres;
}
public String getRoepnaam() {
return this.roepnaam;
}
public String getStraat() {
return this.straat;
}
public String getHuisnummer() {
return this.huisnummer;
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
public String getTelefoonnummer() {
return this.telefoonnummer;
}
public boolean getAfhaaladres() {
return this.afhaaladres;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leveradres(int id_leveradres){
 this.id_leveradres=id_leveradres;
 }
public void setRoepnaam(String roepnaam){
 this.roepnaam=roepnaam;
 }
public void setStraat(String straat){
 this.straat=straat;
 }
public void setHuisnummer(String huisnummer){
 this.huisnummer=huisnummer;
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
public void setTelefoonnummer(String telefoonnummer){
 this.telefoonnummer=telefoonnummer;
 }
public void setAfhaaladres(boolean afhaaladres){
 this.afhaaladres=afhaaladres;
 }
}