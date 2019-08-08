package Old.Bedrijf;
import Old.Old;
import Utils.Util;

public class Bedrijf implements Old { 
    
private int id_bedrijf;
private String id_boekhouding;
private String naam;
private String straat;
private String huisnummer;
private int id_land;
private String postcode;
private String woonplaats;
private int id_taalcode;
private String telefoonnummer;
private String faxnummer;
private String emailadres;
private String url;
private int id_bank;
private String banknummer;
private String iban;
private String bic;
private String ondernemingsnummer;
private String rechtspersonenregister;
private int cc;
private int id_aanspreking;
private String inserted;
private String updated;
private String emailadres_lijsten;
private String naam_verantwoordelijke_kwaliteit;
private String titel_verantwoordelijke_kwaliteit;
private String emergency_contact_telefoonnummer;
private String emergency_contact_emailadres;
private String id_convertie;
private String id_extern1;
private String logo;
private double relatieve_marge;
private double absolute_marge;
private String vestigingsnummer;

public Bedrijf(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_boekhouding = data[1];
this.naam = data[2];
this.straat = data[3];
this.huisnummer = data[4];
this.id_land = Util.Int(data[5]);
this.postcode = data[6];
this.woonplaats = data[7];
this.id_taalcode = Util.Int(data[8]);
this.telefoonnummer = data[9];
this.faxnummer = data[10];
this.emailadres = data[11];
this.url = data[12];
this.id_bank = Util.Int(data[13]);
this.banknummer = data[14];
this.iban = data[15];
this.bic = data[16];
this.ondernemingsnummer = data[17];
this.rechtspersonenregister = data[18];
this.cc = Util.Int(data[19]);
this.id_aanspreking = Util.Int(data[20]);
this.inserted = data[21];
this.updated = data[22];
this.emailadres_lijsten = data[23];
this.naam_verantwoordelijke_kwaliteit = data[24];
this.titel_verantwoordelijke_kwaliteit = data[25];
this.emergency_contact_telefoonnummer = data[26];
this.emergency_contact_emailadres = data[27];
this.id_convertie = data[28];
this.id_extern1 = data[29];
this.logo = data[30];
this.relatieve_marge = Util.Double(data[31]);
this.absolute_marge = Util.Double(data[32]);
this.vestigingsnummer = data[33];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public String getId_boekhouding() {
return this.id_boekhouding;
}
public String getNaam() {
return this.naam;
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
public String getFaxnummer() {
return this.faxnummer;
}
public String getEmailadres() {
return this.emailadres;
}
public String getUrl() {
return this.url;
}
public int getId_bank() {
return this.id_bank;
}
public String getBanknummer() {
return this.banknummer;
}
public String getIban() {
return this.iban;
}
public String getBic() {
return this.bic;
}
public String getOndernemingsnummer() {
return this.ondernemingsnummer;
}
public String getRechtspersonenregister() {
return this.rechtspersonenregister;
}
public int getCc() {
return this.cc;
}
public int getId_aanspreking() {
return this.id_aanspreking;
}
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public String getEmailadres_lijsten() {
return this.emailadres_lijsten;
}
public String getNaam_verantwoordelijke_kwaliteit() {
return this.naam_verantwoordelijke_kwaliteit;
}
public String getTitel_verantwoordelijke_kwaliteit() {
return this.titel_verantwoordelijke_kwaliteit;
}
public String getEmergency_contact_telefoonnummer() {
return this.emergency_contact_telefoonnummer;
}
public String getEmergency_contact_emailadres() {
return this.emergency_contact_emailadres;
}
public String getId_convertie() {
return this.id_convertie;
}
public String getId_extern1() {
return this.id_extern1;
}
public String getLogo() {
return this.logo;
}
public double getRelatieve_marge() {
return this.relatieve_marge;
}
public double getAbsolute_marge() {
return this.absolute_marge;
}
public String getVestigingsnummer() {
return this.vestigingsnummer;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_boekhouding(String id_boekhouding){
 this.id_boekhouding=id_boekhouding;
 }
public void setNaam(String naam){
 this.naam=naam;
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
public void setFaxnummer(String faxnummer){
 this.faxnummer=faxnummer;
 }
public void setEmailadres(String emailadres){
 this.emailadres=emailadres;
 }
public void setUrl(String url){
 this.url=url;
 }
public void setId_bank(int id_bank){
 this.id_bank=id_bank;
 }
public void setBanknummer(String banknummer){
 this.banknummer=banknummer;
 }
public void setIban(String iban){
 this.iban=iban;
 }
public void setBic(String bic){
 this.bic=bic;
 }
public void setOndernemingsnummer(String ondernemingsnummer){
 this.ondernemingsnummer=ondernemingsnummer;
 }
public void setRechtspersonenregister(String rechtspersonenregister){
 this.rechtspersonenregister=rechtspersonenregister;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_aanspreking(int id_aanspreking){
 this.id_aanspreking=id_aanspreking;
 }
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setEmailadres_lijsten(String emailadres_lijsten){
 this.emailadres_lijsten=emailadres_lijsten;
 }
public void setNaam_verantwoordelijke_kwaliteit(String naam_verantwoordelijke_kwaliteit){
 this.naam_verantwoordelijke_kwaliteit=naam_verantwoordelijke_kwaliteit;
 }
public void setTitel_verantwoordelijke_kwaliteit(String titel_verantwoordelijke_kwaliteit){
 this.titel_verantwoordelijke_kwaliteit=titel_verantwoordelijke_kwaliteit;
 }
public void setEmergency_contact_telefoonnummer(String emergency_contact_telefoonnummer){
 this.emergency_contact_telefoonnummer=emergency_contact_telefoonnummer;
 }
public void setEmergency_contact_emailadres(String emergency_contact_emailadres){
 this.emergency_contact_emailadres=emergency_contact_emailadres;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setId_extern1(String id_extern1){
 this.id_extern1=id_extern1;
 }
public void setLogo(String logo){
 this.logo=logo;
 }
public void setRelatieve_marge(double relatieve_marge){
 this.relatieve_marge=relatieve_marge;
 }
public void setAbsolute_marge(double absolute_marge){
 this.absolute_marge=absolute_marge;
 }
public void setVestigingsnummer(String vestigingsnummer){
 this.vestigingsnummer=vestigingsnummer;
 }
}