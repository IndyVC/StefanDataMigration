package Old.Product;
import Old.Old;
import Utils.Util;

public class Productcategorie implements Old { 
private int id_productcategorie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private boolean houdbaarheidsdatum_bijhouden;
private String omschrijvinge;
private int default_aankoopproduct_productgroep;
private int default_aankoopproduct_productsubgroep;
private int default_aankoopproduct_fabrikant;
private int default_aankoopproduct_bestelgroep;
private int default_aankoopproduct_verpakkingseenheid;
private int default_aankoopproduct_collieenheid;
private int default_aankoopproduct_basiseenheid;
private int default_aankoopproduct_aankoopeenheid;
private int default_aankoopproduct_leveringstemperatuur;
private int default_aankoopproduct_etiket;
private int default_aankoopproduct_etiketteneenheid;
private int default_aankoopproduct_tekst_etiket;
private int default_aankoopproduct_voorraadeenheid;
private int default_aankoopproduct_voorraadplaats;
private int default_aankoopproduct_btwcode;
private int default_aankoopproduct_prijseenheid;
private int default_aankoopproduct_algemene_rekening_type;
private int default_aankoopproduct_algemene_rekening;
private int default_aankoopproduct_analytische_rekening_type;
private int default_aankoopproduct_analytische_rekening;
private boolean default_aankoopproduct_doorverkoop;
private boolean default_aankoopproduct_statistieken;
private boolean default_aankoopproduct_voorraad;
private boolean default_aankoopproduct_afdrukken_etiketten_intern;
private boolean default_aankoopproduct_afdrukken_etiketten_verkoopproducten;
private boolean default_aankoopproduct_afdrukken_ingredienten;
private boolean default_receptproduct_hulpstof;
private boolean default_receptproduct_halffabrikaten;
private boolean default_receptproduct_voorbereide_producten;
private boolean default_receptproduct_afgewerkte_producten;
private boolean default_receptproduct_verkoopproducten;
private int id_etiket_omschrijving;
private boolean default_aankoopproduct_afdrukken_etiket_verbruik;
private int default_aankoopproduct_id_etiket_verbruik;
private int default_aankoopproduct_ingebruikname_per_eenheid;
private boolean default_aankoopproduct_beperkt_houdbaar_na_openen;
private boolean tracering_mogelijk;

public Productcategorie(String[] data){
this.id_productcategorie = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.houdbaarheidsdatum_bijhouden = Util.Boolean(data[4]);
this.omschrijvinge = data[5];
this.default_aankoopproduct_productgroep = Util.Int(data[6]);
this.default_aankoopproduct_productsubgroep = Util.Int(data[7]);
this.default_aankoopproduct_fabrikant = Util.Int(data[8]);
this.default_aankoopproduct_bestelgroep = Util.Int(data[9]);
this.default_aankoopproduct_verpakkingseenheid = Util.Int(data[10]);
this.default_aankoopproduct_collieenheid = Util.Int(data[11]);
this.default_aankoopproduct_basiseenheid = Util.Int(data[12]);
this.default_aankoopproduct_aankoopeenheid = Util.Int(data[13]);
this.default_aankoopproduct_leveringstemperatuur = Util.Int(data[14]);
this.default_aankoopproduct_etiket = Util.Int(data[15]);
this.default_aankoopproduct_etiketteneenheid = Util.Int(data[16]);
this.default_aankoopproduct_tekst_etiket = Util.Int(data[17]);
this.default_aankoopproduct_voorraadeenheid = Util.Int(data[18]);
this.default_aankoopproduct_voorraadplaats = Util.Int(data[19]);
this.default_aankoopproduct_btwcode = Util.Int(data[20]);
this.default_aankoopproduct_prijseenheid = Util.Int(data[21]);
this.default_aankoopproduct_algemene_rekening_type = Util.Int(data[22]);
this.default_aankoopproduct_algemene_rekening = Util.Int(data[23]);
this.default_aankoopproduct_analytische_rekening_type = Util.Int(data[24]);
this.default_aankoopproduct_analytische_rekening = Util.Int(data[25]);
this.default_aankoopproduct_doorverkoop = Util.Boolean(data[26]);
this.default_aankoopproduct_statistieken = Util.Boolean(data[27]);
this.default_aankoopproduct_voorraad = Util.Boolean(data[28]);
this.default_aankoopproduct_afdrukken_etiketten_intern = Util.Boolean(data[29]);
this.default_aankoopproduct_afdrukken_etiketten_verkoopproducten = Util.Boolean(data[30]);
this.default_aankoopproduct_afdrukken_ingredienten = Util.Boolean(data[31]);
this.default_receptproduct_hulpstof = Util.Boolean(data[32]);
this.default_receptproduct_halffabrikaten = Util.Boolean(data[33]);
this.default_receptproduct_voorbereide_producten = Util.Boolean(data[34]);
this.default_receptproduct_afgewerkte_producten = Util.Boolean(data[35]);
this.default_receptproduct_verkoopproducten = Util.Boolean(data[36]);
this.id_etiket_omschrijving = Util.Int(data[37]);
this.default_aankoopproduct_afdrukken_etiket_verbruik = Util.Boolean(data[38]);
this.default_aankoopproduct_id_etiket_verbruik = Util.Int(data[39]);
this.default_aankoopproduct_ingebruikname_per_eenheid = Util.Int(data[40]);
this.default_aankoopproduct_beperkt_houdbaar_na_openen = Util.Boolean(data[41]);
this.tracering_mogelijk = Util.Boolean(data[42]);
}
public int getId_productcategorie() {
return this.id_productcategorie;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getCc() {
return this.cc;
}
public boolean getHoudbaarheidsdatum_bijhouden() {
return this.houdbaarheidsdatum_bijhouden;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public int getDefault_aankoopproduct_productgroep() {
return this.default_aankoopproduct_productgroep;
}
public int getDefault_aankoopproduct_productsubgroep() {
return this.default_aankoopproduct_productsubgroep;
}
public int getDefault_aankoopproduct_fabrikant() {
return this.default_aankoopproduct_fabrikant;
}
public int getDefault_aankoopproduct_bestelgroep() {
return this.default_aankoopproduct_bestelgroep;
}
public int getDefault_aankoopproduct_verpakkingseenheid() {
return this.default_aankoopproduct_verpakkingseenheid;
}
public int getDefault_aankoopproduct_collieenheid() {
return this.default_aankoopproduct_collieenheid;
}
public int getDefault_aankoopproduct_basiseenheid() {
return this.default_aankoopproduct_basiseenheid;
}
public int getDefault_aankoopproduct_aankoopeenheid() {
return this.default_aankoopproduct_aankoopeenheid;
}
public int getDefault_aankoopproduct_leveringstemperatuur() {
return this.default_aankoopproduct_leveringstemperatuur;
}
public int getDefault_aankoopproduct_etiket() {
return this.default_aankoopproduct_etiket;
}
public int getDefault_aankoopproduct_etiketteneenheid() {
return this.default_aankoopproduct_etiketteneenheid;
}
public int getDefault_aankoopproduct_tekst_etiket() {
return this.default_aankoopproduct_tekst_etiket;
}
public int getDefault_aankoopproduct_voorraadeenheid() {
return this.default_aankoopproduct_voorraadeenheid;
}
public int getDefault_aankoopproduct_voorraadplaats() {
return this.default_aankoopproduct_voorraadplaats;
}
public int getDefault_aankoopproduct_btwcode() {
return this.default_aankoopproduct_btwcode;
}
public int getDefault_aankoopproduct_prijseenheid() {
return this.default_aankoopproduct_prijseenheid;
}
public int getDefault_aankoopproduct_algemene_rekening_type() {
return this.default_aankoopproduct_algemene_rekening_type;
}
public int getDefault_aankoopproduct_algemene_rekening() {
return this.default_aankoopproduct_algemene_rekening;
}
public int getDefault_aankoopproduct_analytische_rekening_type() {
return this.default_aankoopproduct_analytische_rekening_type;
}
public int getDefault_aankoopproduct_analytische_rekening() {
return this.default_aankoopproduct_analytische_rekening;
}
public boolean getDefault_aankoopproduct_doorverkoop() {
return this.default_aankoopproduct_doorverkoop;
}
public boolean getDefault_aankoopproduct_statistieken() {
return this.default_aankoopproduct_statistieken;
}
public boolean getDefault_aankoopproduct_voorraad() {
return this.default_aankoopproduct_voorraad;
}
public boolean getDefault_aankoopproduct_afdrukken_etiketten_intern() {
return this.default_aankoopproduct_afdrukken_etiketten_intern;
}
public boolean getDefault_aankoopproduct_afdrukken_etiketten_verkoopproducten() {
return this.default_aankoopproduct_afdrukken_etiketten_verkoopproducten;
}
public boolean getDefault_aankoopproduct_afdrukken_ingredienten() {
return this.default_aankoopproduct_afdrukken_ingredienten;
}
public boolean getDefault_receptproduct_hulpstof() {
return this.default_receptproduct_hulpstof;
}
public boolean getDefault_receptproduct_halffabrikaten() {
return this.default_receptproduct_halffabrikaten;
}
public boolean getDefault_receptproduct_voorbereide_producten() {
return this.default_receptproduct_voorbereide_producten;
}
public boolean getDefault_receptproduct_afgewerkte_producten() {
return this.default_receptproduct_afgewerkte_producten;
}
public boolean getDefault_receptproduct_verkoopproducten() {
return this.default_receptproduct_verkoopproducten;
}
public int getId_etiket_omschrijving() {
return this.id_etiket_omschrijving;
}
public boolean getDefault_aankoopproduct_afdrukken_etiket_verbruik() {
return this.default_aankoopproduct_afdrukken_etiket_verbruik;
}
public int getDefault_aankoopproduct_id_etiket_verbruik() {
return this.default_aankoopproduct_id_etiket_verbruik;
}
public int getDefault_aankoopproduct_ingebruikname_per_eenheid() {
return this.default_aankoopproduct_ingebruikname_per_eenheid;
}
public boolean getDefault_aankoopproduct_beperkt_houdbaar_na_openen() {
return this.default_aankoopproduct_beperkt_houdbaar_na_openen;
}
public boolean getTracering_mogelijk() {
return this.tracering_mogelijk;
}
public void setId_productcategorie(int id_productcategorie){
 this.id_productcategorie=id_productcategorie;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setHoudbaarheidsdatum_bijhouden(boolean houdbaarheidsdatum_bijhouden){
 this.houdbaarheidsdatum_bijhouden=houdbaarheidsdatum_bijhouden;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setDefault_aankoopproduct_productgroep(int default_aankoopproduct_productgroep){
 this.default_aankoopproduct_productgroep=default_aankoopproduct_productgroep;
 }
public void setDefault_aankoopproduct_productsubgroep(int default_aankoopproduct_productsubgroep){
 this.default_aankoopproduct_productsubgroep=default_aankoopproduct_productsubgroep;
 }
public void setDefault_aankoopproduct_fabrikant(int default_aankoopproduct_fabrikant){
 this.default_aankoopproduct_fabrikant=default_aankoopproduct_fabrikant;
 }
public void setDefault_aankoopproduct_bestelgroep(int default_aankoopproduct_bestelgroep){
 this.default_aankoopproduct_bestelgroep=default_aankoopproduct_bestelgroep;
 }
public void setDefault_aankoopproduct_verpakkingseenheid(int default_aankoopproduct_verpakkingseenheid){
 this.default_aankoopproduct_verpakkingseenheid=default_aankoopproduct_verpakkingseenheid;
 }
public void setDefault_aankoopproduct_collieenheid(int default_aankoopproduct_collieenheid){
 this.default_aankoopproduct_collieenheid=default_aankoopproduct_collieenheid;
 }
public void setDefault_aankoopproduct_basiseenheid(int default_aankoopproduct_basiseenheid){
 this.default_aankoopproduct_basiseenheid=default_aankoopproduct_basiseenheid;
 }
public void setDefault_aankoopproduct_aankoopeenheid(int default_aankoopproduct_aankoopeenheid){
 this.default_aankoopproduct_aankoopeenheid=default_aankoopproduct_aankoopeenheid;
 }
public void setDefault_aankoopproduct_leveringstemperatuur(int default_aankoopproduct_leveringstemperatuur){
 this.default_aankoopproduct_leveringstemperatuur=default_aankoopproduct_leveringstemperatuur;
 }
public void setDefault_aankoopproduct_etiket(int default_aankoopproduct_etiket){
 this.default_aankoopproduct_etiket=default_aankoopproduct_etiket;
 }
public void setDefault_aankoopproduct_etiketteneenheid(int default_aankoopproduct_etiketteneenheid){
 this.default_aankoopproduct_etiketteneenheid=default_aankoopproduct_etiketteneenheid;
 }
public void setDefault_aankoopproduct_tekst_etiket(int default_aankoopproduct_tekst_etiket){
 this.default_aankoopproduct_tekst_etiket=default_aankoopproduct_tekst_etiket;
 }
public void setDefault_aankoopproduct_voorraadeenheid(int default_aankoopproduct_voorraadeenheid){
 this.default_aankoopproduct_voorraadeenheid=default_aankoopproduct_voorraadeenheid;
 }
public void setDefault_aankoopproduct_voorraadplaats(int default_aankoopproduct_voorraadplaats){
 this.default_aankoopproduct_voorraadplaats=default_aankoopproduct_voorraadplaats;
 }
public void setDefault_aankoopproduct_btwcode(int default_aankoopproduct_btwcode){
 this.default_aankoopproduct_btwcode=default_aankoopproduct_btwcode;
 }
public void setDefault_aankoopproduct_prijseenheid(int default_aankoopproduct_prijseenheid){
 this.default_aankoopproduct_prijseenheid=default_aankoopproduct_prijseenheid;
 }
public void setDefault_aankoopproduct_algemene_rekening_type(int default_aankoopproduct_algemene_rekening_type){
 this.default_aankoopproduct_algemene_rekening_type=default_aankoopproduct_algemene_rekening_type;
 }
public void setDefault_aankoopproduct_algemene_rekening(int default_aankoopproduct_algemene_rekening){
 this.default_aankoopproduct_algemene_rekening=default_aankoopproduct_algemene_rekening;
 }
public void setDefault_aankoopproduct_analytische_rekening_type(int default_aankoopproduct_analytische_rekening_type){
 this.default_aankoopproduct_analytische_rekening_type=default_aankoopproduct_analytische_rekening_type;
 }
public void setDefault_aankoopproduct_analytische_rekening(int default_aankoopproduct_analytische_rekening){
 this.default_aankoopproduct_analytische_rekening=default_aankoopproduct_analytische_rekening;
 }
public void setDefault_aankoopproduct_doorverkoop(boolean default_aankoopproduct_doorverkoop){
 this.default_aankoopproduct_doorverkoop=default_aankoopproduct_doorverkoop;
 }
public void setDefault_aankoopproduct_statistieken(boolean default_aankoopproduct_statistieken){
 this.default_aankoopproduct_statistieken=default_aankoopproduct_statistieken;
 }
public void setDefault_aankoopproduct_voorraad(boolean default_aankoopproduct_voorraad){
 this.default_aankoopproduct_voorraad=default_aankoopproduct_voorraad;
 }
public void setDefault_aankoopproduct_afdrukken_etiketten_intern(boolean default_aankoopproduct_afdrukken_etiketten_intern){
 this.default_aankoopproduct_afdrukken_etiketten_intern=default_aankoopproduct_afdrukken_etiketten_intern;
 }
public void setDefault_aankoopproduct_afdrukken_etiketten_verkoopproducten(boolean default_aankoopproduct_afdrukken_etiketten_verkoopproducten){
 this.default_aankoopproduct_afdrukken_etiketten_verkoopproducten=default_aankoopproduct_afdrukken_etiketten_verkoopproducten;
 }
public void setDefault_aankoopproduct_afdrukken_ingredienten(boolean default_aankoopproduct_afdrukken_ingredienten){
 this.default_aankoopproduct_afdrukken_ingredienten=default_aankoopproduct_afdrukken_ingredienten;
 }
public void setDefault_receptproduct_hulpstof(boolean default_receptproduct_hulpstof){
 this.default_receptproduct_hulpstof=default_receptproduct_hulpstof;
 }
public void setDefault_receptproduct_halffabrikaten(boolean default_receptproduct_halffabrikaten){
 this.default_receptproduct_halffabrikaten=default_receptproduct_halffabrikaten;
 }
public void setDefault_receptproduct_voorbereide_producten(boolean default_receptproduct_voorbereide_producten){
 this.default_receptproduct_voorbereide_producten=default_receptproduct_voorbereide_producten;
 }
public void setDefault_receptproduct_afgewerkte_producten(boolean default_receptproduct_afgewerkte_producten){
 this.default_receptproduct_afgewerkte_producten=default_receptproduct_afgewerkte_producten;
 }
public void setDefault_receptproduct_verkoopproducten(boolean default_receptproduct_verkoopproducten){
 this.default_receptproduct_verkoopproducten=default_receptproduct_verkoopproducten;
 }
public void setId_etiket_omschrijving(int id_etiket_omschrijving){
 this.id_etiket_omschrijving=id_etiket_omschrijving;
 }
public void setDefault_aankoopproduct_afdrukken_etiket_verbruik(boolean default_aankoopproduct_afdrukken_etiket_verbruik){
 this.default_aankoopproduct_afdrukken_etiket_verbruik=default_aankoopproduct_afdrukken_etiket_verbruik;
 }
public void setDefault_aankoopproduct_id_etiket_verbruik(int default_aankoopproduct_id_etiket_verbruik){
 this.default_aankoopproduct_id_etiket_verbruik=default_aankoopproduct_id_etiket_verbruik;
 }
public void setDefault_aankoopproduct_ingebruikname_per_eenheid(int default_aankoopproduct_ingebruikname_per_eenheid){
 this.default_aankoopproduct_ingebruikname_per_eenheid=default_aankoopproduct_ingebruikname_per_eenheid;
 }
public void setDefault_aankoopproduct_beperkt_houdbaar_na_openen(boolean default_aankoopproduct_beperkt_houdbaar_na_openen){
 this.default_aankoopproduct_beperkt_houdbaar_na_openen=default_aankoopproduct_beperkt_houdbaar_na_openen;
 }
public void setTracering_mogelijk(boolean tracering_mogelijk){
 this.tracering_mogelijk=tracering_mogelijk;
 }
}