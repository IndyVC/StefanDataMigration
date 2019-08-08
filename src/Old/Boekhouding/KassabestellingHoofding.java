package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class KassabestellingHoofding implements Old { 
private int id_bedrijf;
private int id_kassabestelling;
private int id_klant;
private int id_bestelling_kassa;
private Date datum_levering;
private String uur;
private boolean levering;
private String naam;
private String straat;
private String huisnummer;
private String busnummer;
private String postcode;
private String woonplaats;
private String telefoon;
private String email;
private String memo;
private Date inserted;
private String updated;
private int cc;
private boolean winkelbestelling;
private int id_bestelklant;
private String gebruiker;
private int obv_vaste_bestelling;
private String prokas_ref_klant;
private int percentage_vaste_bestelling;

public KassabestellingHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_kassabestelling = Util.Int(data[1]);
this.id_klant = Util.Int(data[2]);
this.id_bestelling_kassa = Util.Int(data[3]);
this.datum_levering = Util.Date(data[4]);
this.uur = data[5];
this.levering = Util.Boolean(data[6]);
this.naam = data[7];
this.straat = data[8];
this.huisnummer = data[9];
this.busnummer = data[10];
this.postcode = data[11];
this.woonplaats = data[12];
this.telefoon = data[13];
this.email = data[14];
this.memo = data[15];
this.inserted = Util.Date(data[16]);
this.updated = data[17];
this.cc = Util.Int(data[18]);
this.winkelbestelling = Util.Boolean(data[19]);
this.id_bestelklant = Util.Int(data[20]);
this.gebruiker = data[21];
this.obv_vaste_bestelling = Util.Int(data[22]);
this.prokas_ref_klant = data[23];
this.percentage_vaste_bestelling = Util.Int(data[24]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_kassabestelling() {
return this.id_kassabestelling;
}
public int getId_klant() {
return this.id_klant;
}
public int getId_bestelling_kassa() {
return this.id_bestelling_kassa;
}
public Date getDatum_levering() {
return this.datum_levering;
}
public String getUur() {
return this.uur;
}
public boolean getLevering() {
return this.levering;
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
public String getBusnummer() {
return this.busnummer;
}
public String getPostcode() {
return this.postcode;
}
public String getWoonplaats() {
return this.woonplaats;
}
public String getTelefoon() {
return this.telefoon;
}
public String getEmail() {
return this.email;
}
public String getMemo() {
return this.memo;
}
public Date getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public boolean getWinkelbestelling() {
return this.winkelbestelling;
}
public int getId_bestelklant() {
return this.id_bestelklant;
}
public String getGebruiker() {
return this.gebruiker;
}
public int getObv_vaste_bestelling() {
return this.obv_vaste_bestelling;
}
public String getProkas_ref_klant() {
return this.prokas_ref_klant;
}
public int getPercentage_vaste_bestelling() {
return this.percentage_vaste_bestelling;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_kassabestelling(int id_kassabestelling){
 this.id_kassabestelling=id_kassabestelling;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setId_bestelling_kassa(int id_bestelling_kassa){
 this.id_bestelling_kassa=id_bestelling_kassa;
 }
public void setDatum_levering(Date datum_levering){
 this.datum_levering=datum_levering;
 }
public void setUur(String uur){
 this.uur=uur;
 }
public void setLevering(boolean levering){
 this.levering=levering;
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
public void setBusnummer(String busnummer){
 this.busnummer=busnummer;
 }
public void setPostcode(String postcode){
 this.postcode=postcode;
 }
public void setWoonplaats(String woonplaats){
 this.woonplaats=woonplaats;
 }
public void setTelefoon(String telefoon){
 this.telefoon=telefoon;
 }
public void setEmail(String email){
 this.email=email;
 }
public void setMemo(String memo){
 this.memo=memo;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setWinkelbestelling(boolean winkelbestelling){
 this.winkelbestelling=winkelbestelling;
 }
public void setId_bestelklant(int id_bestelklant){
 this.id_bestelklant=id_bestelklant;
 }
public void setGebruiker(String gebruiker){
 this.gebruiker=gebruiker;
 }
public void setObv_vaste_bestelling(int obv_vaste_bestelling){
 this.obv_vaste_bestelling=obv_vaste_bestelling;
 }
public void setProkas_ref_klant(String prokas_ref_klant){
 this.prokas_ref_klant=prokas_ref_klant;
 }
public void setPercentage_vaste_bestelling(int percentage_vaste_bestelling){
 this.percentage_vaste_bestelling=percentage_vaste_bestelling;
 }
}