package Old.Voorbereideproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Voorbereidproduct implements Old { 
private int id_bedrijf;
private int id_voorbereid_product;
private String id_convertieproduct;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private int id_produktiegroep;
private String bereidingswijze;
private Date inserted;
private Date updated;
private int cc;
private int id_recepteenheid;
private int id_receptingave;
private int id_receptgroep;
private boolean voorraad;
private double voorraad_minimum;
private double voorraad_maximum;
private int eenheden_etiket;
private int minimum_aantal_dagen_houdbaar;
private int recept_aantal_stuks;
private int recept_aantal_personen;
private String bestandsnaam_foto;
private int id_etiket;
private int id_voorraadplaats;
private boolean etiket;
private int id_vaste_kost;
private int id_onrechtstreekse_produktiekost;
private boolean blokkeren;
private Date blokkeren_einddatum;
private String aantal_personen;
private boolean aantal_personen_variabel;
private double eenheidsgewicht;
private int id_bewaarconditie;
private double recept_percentage_bakverlies;
private int id_bewaartemperatuur;
private int id_deelbaar;
private boolean recept_wijzigbaar;
private double vaste_kost_per_eenheid;
private int volgorde;
private boolean moet_gewogen_worden;
private double maximaal_meetgewicht;
private double relatieve_marge;
private double absolute_marge;
private boolean lijn_na_produktielijst;
private boolean arcering_op_produktielijst;
private String omschrijving_voorraadplaats;
private boolean voorraad_maandag;
private boolean voorraad_dinsdag;
private boolean voorraad_woensdag;
private boolean voorraad_donderdag;
private boolean voorraad_vrijdag;
private boolean voorraad_zaterdag;
private boolean voorraad_zondag;
private boolean dagproduktie;
private int id_job;
private int job_volgnummer;
private String omschrijvinge;
private int excel_produktie_blad;
private String excel_produktie_kolom;
private int excel_produktie_rij;
private int id_verkoopsverpakking;

public Voorbereidproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_voorbereid_product = Util.Int(data[1]);
this.id_convertieproduct = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.zoekomschrijving = data[5];
this.id_produktiegroep = Util.Int(data[6]);
this.bereidingswijze = data[7];
this.inserted = Util.Date(data[8]);
this.updated = Util.Date(data[9]);
this.cc = Util.Int(data[10]);
this.id_recepteenheid = Util.Int(data[11]);
this.id_receptingave = Util.Int(data[12]);
this.id_receptgroep = Util.Int(data[13]);
this.voorraad = Util.Boolean(data[14]);
this.voorraad_minimum = Util.Double(data[15]);
this.voorraad_maximum = Util.Double(data[16]);
this.eenheden_etiket = Util.Int(data[17]);
this.minimum_aantal_dagen_houdbaar = Util.Int(data[18]);
this.recept_aantal_stuks = Util.Int(data[19]);
this.recept_aantal_personen = Util.Int(data[20]);
this.bestandsnaam_foto = data[21];
this.id_etiket = Util.Int(data[22]);
this.id_voorraadplaats = Util.Int(data[23]);
this.etiket = Util.Boolean(data[24]);
this.id_vaste_kost = Util.Int(data[25]);
this.id_onrechtstreekse_produktiekost = Util.Int(data[26]);
this.blokkeren = Util.Boolean(data[27]);
this.blokkeren_einddatum = Util.Date(data[28]);
this.aantal_personen = data[29];
this.aantal_personen_variabel = Util.Boolean(data[30]);
this.eenheidsgewicht = Util.Double(data[31]);
this.id_bewaarconditie = Util.Int(data[32]);
this.recept_percentage_bakverlies = Util.Double(data[33]);
this.id_bewaartemperatuur = Util.Int(data[34]);
this.id_deelbaar = Util.Int(data[35]);
this.recept_wijzigbaar = Util.Boolean(data[36]);
this.vaste_kost_per_eenheid = Util.Double(data[37]);
this.volgorde = Util.Int(data[38]);
this.moet_gewogen_worden = Util.Boolean(data[39]);
this.maximaal_meetgewicht = Util.Double(data[40]);
this.relatieve_marge = Util.Double(data[41]);
this.absolute_marge = Util.Double(data[42]);
this.lijn_na_produktielijst = Util.Boolean(data[43]);
this.arcering_op_produktielijst = Util.Boolean(data[44]);
this.omschrijving_voorraadplaats = data[45];
this.voorraad_maandag = Util.Boolean(data[46]);
this.voorraad_dinsdag = Util.Boolean(data[47]);
this.voorraad_woensdag = Util.Boolean(data[48]);
this.voorraad_donderdag = Util.Boolean(data[49]);
this.voorraad_vrijdag = Util.Boolean(data[50]);
this.voorraad_zaterdag = Util.Boolean(data[51]);
this.voorraad_zondag = Util.Boolean(data[52]);
this.dagproduktie = Util.Boolean(data[53]);
this.id_job = Util.Int(data[54]);
this.job_volgnummer = Util.Int(data[55]);
this.omschrijvinge = data[56];
this.excel_produktie_blad = Util.Int(data[57]);
this.excel_produktie_kolom = data[58];
this.excel_produktie_rij = Util.Int(data[59]);
this.id_verkoopsverpakking = Util.Int(data[60]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_voorbereid_product() {
return this.id_voorbereid_product;
}
public String getId_convertieproduct() {
return this.id_convertieproduct;
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
public int getId_produktiegroep() {
return this.id_produktiegroep;
}
public String getBereidingswijze() {
return this.bereidingswijze;
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
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public int getId_receptingave() {
return this.id_receptingave;
}
public int getId_receptgroep() {
return this.id_receptgroep;
}
public boolean getVoorraad() {
return this.voorraad;
}
public double getVoorraad_minimum() {
return this.voorraad_minimum;
}
public double getVoorraad_maximum() {
return this.voorraad_maximum;
}
public int getEenheden_etiket() {
return this.eenheden_etiket;
}
public int getMinimum_aantal_dagen_houdbaar() {
return this.minimum_aantal_dagen_houdbaar;
}
public int getRecept_aantal_stuks() {
return this.recept_aantal_stuks;
}
public int getRecept_aantal_personen() {
return this.recept_aantal_personen;
}
public String getBestandsnaam_foto() {
return this.bestandsnaam_foto;
}
public int getId_etiket() {
return this.id_etiket;
}
public int getId_voorraadplaats() {
return this.id_voorraadplaats;
}
public boolean getEtiket() {
return this.etiket;
}
public int getId_vaste_kost() {
return this.id_vaste_kost;
}
public int getId_onrechtstreekse_produktiekost() {
return this.id_onrechtstreekse_produktiekost;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getBlokkeren_einddatum() {
return this.blokkeren_einddatum;
}
public String getAantal_personen() {
return this.aantal_personen;
}
public boolean getAantal_personen_variabel() {
return this.aantal_personen_variabel;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public int getId_bewaarconditie() {
return this.id_bewaarconditie;
}
public double getRecept_percentage_bakverlies() {
return this.recept_percentage_bakverlies;
}
public int getId_bewaartemperatuur() {
return this.id_bewaartemperatuur;
}
public int getId_deelbaar() {
return this.id_deelbaar;
}
public boolean getRecept_wijzigbaar() {
return this.recept_wijzigbaar;
}
public double getVaste_kost_per_eenheid() {
return this.vaste_kost_per_eenheid;
}
public int getVolgorde() {
return this.volgorde;
}
public boolean getMoet_gewogen_worden() {
return this.moet_gewogen_worden;
}
public double getMaximaal_meetgewicht() {
return this.maximaal_meetgewicht;
}
public double getRelatieve_marge() {
return this.relatieve_marge;
}
public double getAbsolute_marge() {
return this.absolute_marge;
}
public boolean getLijn_na_produktielijst() {
return this.lijn_na_produktielijst;
}
public boolean getArcering_op_produktielijst() {
return this.arcering_op_produktielijst;
}
public String getOmschrijving_voorraadplaats() {
return this.omschrijving_voorraadplaats;
}
public boolean getVoorraad_maandag() {
return this.voorraad_maandag;
}
public boolean getVoorraad_dinsdag() {
return this.voorraad_dinsdag;
}
public boolean getVoorraad_woensdag() {
return this.voorraad_woensdag;
}
public boolean getVoorraad_donderdag() {
return this.voorraad_donderdag;
}
public boolean getVoorraad_vrijdag() {
return this.voorraad_vrijdag;
}
public boolean getVoorraad_zaterdag() {
return this.voorraad_zaterdag;
}
public boolean getVoorraad_zondag() {
return this.voorraad_zondag;
}
public boolean getDagproduktie() {
return this.dagproduktie;
}
public int getId_job() {
return this.id_job;
}
public int getJob_volgnummer() {
return this.job_volgnummer;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public int getExcel_produktie_blad() {
return this.excel_produktie_blad;
}
public String getExcel_produktie_kolom() {
return this.excel_produktie_kolom;
}
public int getExcel_produktie_rij() {
return this.excel_produktie_rij;
}
public int getId_verkoopsverpakking() {
return this.id_verkoopsverpakking;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_voorbereid_product(int id_voorbereid_product){
 this.id_voorbereid_product=id_voorbereid_product;
 }
public void setId_convertieproduct(String id_convertieproduct){
 this.id_convertieproduct=id_convertieproduct;
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
public void setId_produktiegroep(int id_produktiegroep){
 this.id_produktiegroep=id_produktiegroep;
 }
public void setBereidingswijze(String bereidingswijze){
 this.bereidingswijze=bereidingswijze;
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
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setId_receptingave(int id_receptingave){
 this.id_receptingave=id_receptingave;
 }
public void setId_receptgroep(int id_receptgroep){
 this.id_receptgroep=id_receptgroep;
 }
public void setVoorraad(boolean voorraad){
 this.voorraad=voorraad;
 }
public void setVoorraad_minimum(double voorraad_minimum){
 this.voorraad_minimum=voorraad_minimum;
 }
public void setVoorraad_maximum(double voorraad_maximum){
 this.voorraad_maximum=voorraad_maximum;
 }
public void setEenheden_etiket(int eenheden_etiket){
 this.eenheden_etiket=eenheden_etiket;
 }
public void setMinimum_aantal_dagen_houdbaar(int minimum_aantal_dagen_houdbaar){
 this.minimum_aantal_dagen_houdbaar=minimum_aantal_dagen_houdbaar;
 }
public void setRecept_aantal_stuks(int recept_aantal_stuks){
 this.recept_aantal_stuks=recept_aantal_stuks;
 }
public void setRecept_aantal_personen(int recept_aantal_personen){
 this.recept_aantal_personen=recept_aantal_personen;
 }
public void setBestandsnaam_foto(String bestandsnaam_foto){
 this.bestandsnaam_foto=bestandsnaam_foto;
 }
public void setId_etiket(int id_etiket){
 this.id_etiket=id_etiket;
 }
public void setId_voorraadplaats(int id_voorraadplaats){
 this.id_voorraadplaats=id_voorraadplaats;
 }
public void setEtiket(boolean etiket){
 this.etiket=etiket;
 }
public void setId_vaste_kost(int id_vaste_kost){
 this.id_vaste_kost=id_vaste_kost;
 }
public void setId_onrechtstreekse_produktiekost(int id_onrechtstreekse_produktiekost){
 this.id_onrechtstreekse_produktiekost=id_onrechtstreekse_produktiekost;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBlokkeren_einddatum(Date blokkeren_einddatum){
 this.blokkeren_einddatum=blokkeren_einddatum;
 }
public void setAantal_personen(String aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setAantal_personen_variabel(boolean aantal_personen_variabel){
 this.aantal_personen_variabel=aantal_personen_variabel;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setId_bewaarconditie(int id_bewaarconditie){
 this.id_bewaarconditie=id_bewaarconditie;
 }
public void setRecept_percentage_bakverlies(double recept_percentage_bakverlies){
 this.recept_percentage_bakverlies=recept_percentage_bakverlies;
 }
public void setId_bewaartemperatuur(int id_bewaartemperatuur){
 this.id_bewaartemperatuur=id_bewaartemperatuur;
 }
public void setId_deelbaar(int id_deelbaar){
 this.id_deelbaar=id_deelbaar;
 }
public void setRecept_wijzigbaar(boolean recept_wijzigbaar){
 this.recept_wijzigbaar=recept_wijzigbaar;
 }
public void setVaste_kost_per_eenheid(double vaste_kost_per_eenheid){
 this.vaste_kost_per_eenheid=vaste_kost_per_eenheid;
 }
public void setVolgorde(int volgorde){
 this.volgorde=volgorde;
 }
public void setMoet_gewogen_worden(boolean moet_gewogen_worden){
 this.moet_gewogen_worden=moet_gewogen_worden;
 }
public void setMaximaal_meetgewicht(double maximaal_meetgewicht){
 this.maximaal_meetgewicht=maximaal_meetgewicht;
 }
public void setRelatieve_marge(double relatieve_marge){
 this.relatieve_marge=relatieve_marge;
 }
public void setAbsolute_marge(double absolute_marge){
 this.absolute_marge=absolute_marge;
 }
public void setLijn_na_produktielijst(boolean lijn_na_produktielijst){
 this.lijn_na_produktielijst=lijn_na_produktielijst;
 }
public void setArcering_op_produktielijst(boolean arcering_op_produktielijst){
 this.arcering_op_produktielijst=arcering_op_produktielijst;
 }
public void setOmschrijving_voorraadplaats(String omschrijving_voorraadplaats){
 this.omschrijving_voorraadplaats=omschrijving_voorraadplaats;
 }
public void setVoorraad_maandag(boolean voorraad_maandag){
 this.voorraad_maandag=voorraad_maandag;
 }
public void setVoorraad_dinsdag(boolean voorraad_dinsdag){
 this.voorraad_dinsdag=voorraad_dinsdag;
 }
public void setVoorraad_woensdag(boolean voorraad_woensdag){
 this.voorraad_woensdag=voorraad_woensdag;
 }
public void setVoorraad_donderdag(boolean voorraad_donderdag){
 this.voorraad_donderdag=voorraad_donderdag;
 }
public void setVoorraad_vrijdag(boolean voorraad_vrijdag){
 this.voorraad_vrijdag=voorraad_vrijdag;
 }
public void setVoorraad_zaterdag(boolean voorraad_zaterdag){
 this.voorraad_zaterdag=voorraad_zaterdag;
 }
public void setVoorraad_zondag(boolean voorraad_zondag){
 this.voorraad_zondag=voorraad_zondag;
 }
public void setDagproduktie(boolean dagproduktie){
 this.dagproduktie=dagproduktie;
 }
public void setId_job(int id_job){
 this.id_job=id_job;
 }
public void setJob_volgnummer(int job_volgnummer){
 this.job_volgnummer=job_volgnummer;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setExcel_produktie_blad(int excel_produktie_blad){
 this.excel_produktie_blad=excel_produktie_blad;
 }
public void setExcel_produktie_kolom(String excel_produktie_kolom){
 this.excel_produktie_kolom=excel_produktie_kolom;
 }
public void setExcel_produktie_rij(int excel_produktie_rij){
 this.excel_produktie_rij=excel_produktie_rij;
 }
public void setId_verkoopsverpakking(int id_verkoopsverpakking){
 this.id_verkoopsverpakking=id_verkoopsverpakking;
 }
}