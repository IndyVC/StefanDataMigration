package Old.Online;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class OnlineAankoopproduct implements Old { 
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private int id_verpakkingseenheid;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;
private double aantal_colli_palet;
private double nettogewicht_verpakkingseenheid;
private double brutogewicht_verpakkingseenheid;
private boolean blokkeren;
private Date blokkeren_einddatum;
private double eenheidsgewicht;
private String ingredienten;
private int id_basiseenheid;
private int id_collieenheid;
private String gtin;
private int id_fabrikant;
private String fabrikant_referentie_product;
private Date technische_fiche_datum;
private String technische_fiche_versie;
private String link_technische_fiche;
private String colli_barcode;
private String identificerende_barcode;
private String info;
private Date inserted;
private Date updated;
private boolean controleren;

public OnlineAankoopproduct(String[] data){
this.id_online = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.zoekomschrijving = data[3];
this.id_verpakkingseenheid = Util.Int(data[4]);
this.aantal_eenheden_verpakking = Util.Double(data[5]);
this.aantal_verpakkingen_colli = Util.Double(data[6]);
this.aantal_colli_palet = Util.Double(data[7]);
this.nettogewicht_verpakkingseenheid = Util.Double(data[8]);
this.brutogewicht_verpakkingseenheid = Util.Double(data[9]);
this.blokkeren = Util.Boolean(data[10]);
this.blokkeren_einddatum = Util.Date(data[11]);
this.eenheidsgewicht = Util.Double(data[12]);
this.ingredienten = data[13];
this.id_basiseenheid = Util.Int(data[14]);
this.id_collieenheid = Util.Int(data[15]);
this.gtin = data[16];
this.id_fabrikant = Util.Int(data[17]);
this.fabrikant_referentie_product = data[18];
this.technische_fiche_datum = Util.Date(data[19]);
this.technische_fiche_versie = data[20];
this.link_technische_fiche = data[21];
this.colli_barcode = data[22];
this.identificerende_barcode = data[23];
this.info = data[24];
this.inserted = Util.Date(data[25]);
this.updated = Util.Date(data[26]);
this.controleren = Util.Boolean(data[27]);
}
public int getId_online() {
return this.id_online;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public double getAantal_colli_palet() {
return this.aantal_colli_palet;
}
public double getNettogewicht_verpakkingseenheid() {
return this.nettogewicht_verpakkingseenheid;
}
public double getBrutogewicht_verpakkingseenheid() {
return this.brutogewicht_verpakkingseenheid;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getBlokkeren_einddatum() {
return this.blokkeren_einddatum;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public String getIngredienten() {
return this.ingredienten;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public int getId_collieenheid() {
return this.id_collieenheid;
}
public String getGtin() {
return this.gtin;
}
public int getId_fabrikant() {
return this.id_fabrikant;
}
public String getFabrikant_referentie_product() {
return this.fabrikant_referentie_product;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public String getLink_technische_fiche() {
return this.link_technische_fiche;
}
public String getColli_barcode() {
return this.colli_barcode;
}
public String getIdentificerende_barcode() {
return this.identificerende_barcode;
}
public String getInfo() {
return this.info;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public boolean getControleren() {
return this.controleren;
}
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
public void setAantal_colli_palet(double aantal_colli_palet){
 this.aantal_colli_palet=aantal_colli_palet;
 }
public void setNettogewicht_verpakkingseenheid(double nettogewicht_verpakkingseenheid){
 this.nettogewicht_verpakkingseenheid=nettogewicht_verpakkingseenheid;
 }
public void setBrutogewicht_verpakkingseenheid(double brutogewicht_verpakkingseenheid){
 this.brutogewicht_verpakkingseenheid=brutogewicht_verpakkingseenheid;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBlokkeren_einddatum(Date blokkeren_einddatum){
 this.blokkeren_einddatum=blokkeren_einddatum;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setIngredienten(String ingredienten){
 this.ingredienten=ingredienten;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setId_collieenheid(int id_collieenheid){
 this.id_collieenheid=id_collieenheid;
 }
public void setGtin(String gtin){
 this.gtin=gtin;
 }
public void setId_fabrikant(int id_fabrikant){
 this.id_fabrikant=id_fabrikant;
 }
public void setFabrikant_referentie_product(String fabrikant_referentie_product){
 this.fabrikant_referentie_product=fabrikant_referentie_product;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setLink_technische_fiche(String link_technische_fiche){
 this.link_technische_fiche=link_technische_fiche;
 }
public void setColli_barcode(String colli_barcode){
 this.colli_barcode=colli_barcode;
 }
public void setIdentificerende_barcode(String identificerende_barcode){
 this.identificerende_barcode=identificerende_barcode;
 }
public void setInfo(String info){
 this.info=info;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setControleren(boolean controleren){
 this.controleren=controleren;
 }
}