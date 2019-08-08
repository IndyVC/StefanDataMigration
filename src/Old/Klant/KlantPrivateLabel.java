package Old.Klant;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class KlantPrivateLabel implements Old { 
private int id_bedrijf;
private int id_private_label;
private int id_aanspreking;
private String naam;
private String zoeknaam;
private String straat;
private String huisnummer;
private int id_land;
private String postcode;
private String woonplaats;
private int id_taalcode;
private String telefoonnummer;
private Date inserted;
private Date updated;
private int cc;
private String url;
private String bestandsnaam_private_logo;

public KlantPrivateLabel(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_private_label = Util.Int(data[1]);
this.id_aanspreking = Util.Int(data[2]);
this.naam = data[3];
this.zoeknaam = data[4];
this.straat = data[5];
this.huisnummer = data[6];
this.id_land = Util.Int(data[7]);
this.postcode = data[8];
this.woonplaats = data[9];
this.id_taalcode = Util.Int(data[10]);
this.telefoonnummer = data[11];
this.inserted = Util.Date(data[12]);
this.updated = Util.Date(data[13]);
this.cc = Util.Int(data[14]);
this.url = data[15];
this.bestandsnaam_private_logo = data[16];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_private_label() {
return this.id_private_label;
}
public int getId_aanspreking() {
return this.id_aanspreking;
}
public String getNaam() {
return this.naam;
}
public String getZoeknaam() {
return this.zoeknaam;
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
public int getId_taalcode() {
return this.id_taalcode;
}
public String getTelefoonnummer() {
return this.telefoonnummer;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public String getUrl() {
return this.url;
}
public String getBestandsnaam_private_logo() {
return this.bestandsnaam_private_logo;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_private_label(int id_private_label){
 this.id_private_label=id_private_label;
 }
public void setId_aanspreking(int id_aanspreking){
 this.id_aanspreking=id_aanspreking;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setZoeknaam(String zoeknaam){
 this.zoeknaam=zoeknaam;
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
public void setId_taalcode(int id_taalcode){
 this.id_taalcode=id_taalcode;
 }
public void setTelefoonnummer(String telefoonnummer){
 this.telefoonnummer=telefoonnummer;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setUrl(String url){
 this.url=url;
 }
public void setBestandsnaam_private_logo(String bestandsnaam_private_logo){
 this.bestandsnaam_private_logo=bestandsnaam_private_logo;
 }
}