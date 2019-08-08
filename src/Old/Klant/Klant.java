package Old.Klant;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Klant implements Old { 
private int id_bedrijf;
private int id_klant;
private String id_convertie;
private int id_aanspreking;
private String naam;
private String zoeknaam;
private String straat;
private String huisnummer;
private int id_land;
private String postcode;
private String woonplaats;
private int id_taalcode;
private boolean blokkeren;
private Date blokkeren_einddatum;
private Date inserted;
private Date updated;
private int cc;
private String telefoonnummer;
private String ondernemingsnummer;
private boolean zichtbaar;
private boolean verstuur_verzendbon;
private String email_verzendbon;
private int id_soort_klant;
private int id_hoofdklant;
private String prokas_referentie;
private Date begin_vakantieperiode;
private Date einde_vakantieperiode;
private String naam_kolom_rasterlijst_klant;
private int volgorde_kolom_rasterlijst_klanten;
private int kleur_kolom_rasterlijst_a;
private int kleur_kolom_rasterlijst_r;
private int kleur_kolom_rasterlijst_g;
private int kleur_kolom_rasterlijst_b;
private boolean rasterlijst_klant;
private int id_klantverdeelgroep;
private boolean verdeellijst_klant;
private boolean prijzen_op_bestelbon;

public Klant(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_klant = Util.Int(data[1]);
this.id_convertie = data[2];
this.id_aanspreking = Util.Int(data[3]);
this.naam = data[4];
this.zoeknaam = data[5];
this.straat = data[6];
this.huisnummer = data[7];
this.id_land = Util.Int(data[8]);
this.postcode = data[9];
this.woonplaats = data[10];
this.id_taalcode = Util.Int(data[11]);
this.blokkeren = Util.Boolean(data[12]);
this.blokkeren_einddatum = Util.Date(data[13]);
this.inserted = Util.Date(data[14]);
this.updated = Util.Date(data[15]);
this.cc = Util.Int(data[16]);
this.telefoonnummer = data[17];
this.ondernemingsnummer = data[18];
this.zichtbaar = Util.Boolean(data[19]);
this.verstuur_verzendbon = Util.Boolean(data[20]);
this.email_verzendbon = data[21];
this.id_soort_klant = Util.Int(data[22]);
this.id_hoofdklant = Util.Int(data[23]);
this.prokas_referentie = data[24];
this.begin_vakantieperiode = Util.Date(data[25]);
this.einde_vakantieperiode = Util.Date(data[26]);
this.naam_kolom_rasterlijst_klant = data[27];
this.volgorde_kolom_rasterlijst_klanten = Util.Int(data[28]);
this.kleur_kolom_rasterlijst_a = Util.Int(data[29]);
this.kleur_kolom_rasterlijst_r = Util.Int(data[30]);
this.kleur_kolom_rasterlijst_g = Util.Int(data[31]);
this.kleur_kolom_rasterlijst_b = Util.Int(data[32]);
this.rasterlijst_klant = Util.Boolean(data[33]);
this.id_klantverdeelgroep = Util.Int(data[34]);
this.verdeellijst_klant = Util.Boolean(data[35]);
this.prijzen_op_bestelbon = Util.Boolean(data[36]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_klant() {
return this.id_klant;
}
public String getId_convertie() {
return this.id_convertie;
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
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getBlokkeren_einddatum() {
return this.blokkeren_einddatum;
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
public String getTelefoonnummer() {
return this.telefoonnummer;
}
public String getOndernemingsnummer() {
return this.ondernemingsnummer;
}
public boolean getZichtbaar() {
return this.zichtbaar;
}
public boolean getVerstuur_verzendbon() {
return this.verstuur_verzendbon;
}
public String getEmail_verzendbon() {
return this.email_verzendbon;
}
public int getId_soort_klant() {
return this.id_soort_klant;
}
public int getId_hoofdklant() {
return this.id_hoofdklant;
}
public String getProkas_referentie() {
return this.prokas_referentie;
}
public Date getBegin_vakantieperiode() {
return this.begin_vakantieperiode;
}
public Date getEinde_vakantieperiode() {
return this.einde_vakantieperiode;
}
public String getNaam_kolom_rasterlijst_klant() {
return this.naam_kolom_rasterlijst_klant;
}
public int getVolgorde_kolom_rasterlijst_klanten() {
return this.volgorde_kolom_rasterlijst_klanten;
}
public int getKleur_kolom_rasterlijst_a() {
return this.kleur_kolom_rasterlijst_a;
}
public int getKleur_kolom_rasterlijst_r() {
return this.kleur_kolom_rasterlijst_r;
}
public int getKleur_kolom_rasterlijst_g() {
return this.kleur_kolom_rasterlijst_g;
}
public int getKleur_kolom_rasterlijst_b() {
return this.kleur_kolom_rasterlijst_b;
}
public boolean getRasterlijst_klant() {
return this.rasterlijst_klant;
}
public int getId_klantverdeelgroep() {
return this.id_klantverdeelgroep;
}
public boolean getVerdeellijst_klant() {
return this.verdeellijst_klant;
}
public boolean getPrijzen_op_bestelbon() {
return this.prijzen_op_bestelbon;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
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
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBlokkeren_einddatum(Date blokkeren_einddatum){
 this.blokkeren_einddatum=blokkeren_einddatum;
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
public void setTelefoonnummer(String telefoonnummer){
 this.telefoonnummer=telefoonnummer;
 }
public void setOndernemingsnummer(String ondernemingsnummer){
 this.ondernemingsnummer=ondernemingsnummer;
 }
public void setZichtbaar(boolean zichtbaar){
 this.zichtbaar=zichtbaar;
 }
public void setVerstuur_verzendbon(boolean verstuur_verzendbon){
 this.verstuur_verzendbon=verstuur_verzendbon;
 }
public void setEmail_verzendbon(String email_verzendbon){
 this.email_verzendbon=email_verzendbon;
 }
public void setId_soort_klant(int id_soort_klant){
 this.id_soort_klant=id_soort_klant;
 }
public void setId_hoofdklant(int id_hoofdklant){
 this.id_hoofdklant=id_hoofdklant;
 }
public void setProkas_referentie(String prokas_referentie){
 this.prokas_referentie=prokas_referentie;
 }
public void setBegin_vakantieperiode(Date begin_vakantieperiode){
 this.begin_vakantieperiode=begin_vakantieperiode;
 }
public void setEinde_vakantieperiode(Date einde_vakantieperiode){
 this.einde_vakantieperiode=einde_vakantieperiode;
 }
public void setNaam_kolom_rasterlijst_klant(String naam_kolom_rasterlijst_klant){
 this.naam_kolom_rasterlijst_klant=naam_kolom_rasterlijst_klant;
 }
public void setVolgorde_kolom_rasterlijst_klanten(int volgorde_kolom_rasterlijst_klanten){
 this.volgorde_kolom_rasterlijst_klanten=volgorde_kolom_rasterlijst_klanten;
 }
public void setKleur_kolom_rasterlijst_a(int kleur_kolom_rasterlijst_a){
 this.kleur_kolom_rasterlijst_a=kleur_kolom_rasterlijst_a;
 }
public void setKleur_kolom_rasterlijst_r(int kleur_kolom_rasterlijst_r){
 this.kleur_kolom_rasterlijst_r=kleur_kolom_rasterlijst_r;
 }
public void setKleur_kolom_rasterlijst_g(int kleur_kolom_rasterlijst_g){
 this.kleur_kolom_rasterlijst_g=kleur_kolom_rasterlijst_g;
 }
public void setKleur_kolom_rasterlijst_b(int kleur_kolom_rasterlijst_b){
 this.kleur_kolom_rasterlijst_b=kleur_kolom_rasterlijst_b;
 }
public void setRasterlijst_klant(boolean rasterlijst_klant){
 this.rasterlijst_klant=rasterlijst_klant;
 }
public void setId_klantverdeelgroep(int id_klantverdeelgroep){
 this.id_klantverdeelgroep=id_klantverdeelgroep;
 }
public void setVerdeellijst_klant(boolean verdeellijst_klant){
 this.verdeellijst_klant=verdeellijst_klant;
 }
public void setPrijzen_op_bestelbon(boolean prijzen_op_bestelbon){
 this.prijzen_op_bestelbon=prijzen_op_bestelbon;
 }
}