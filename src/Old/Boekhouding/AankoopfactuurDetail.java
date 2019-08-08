package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopfactuurDetail implements Old { 
private int id_bedrijf;
private int id_boekjaar;
private int id_dagboek;
private int id_factuur;
private int volgnummer;
private int id_type_algemeen;
private int id_algemene_rekening;
private int id_type_analytisch;
private int id_analytische_rekening;
private double bedrag;
private String debet_credit;
private int id_muntcode;
private double wisselkoers;
private double bedrag_eigen_munt;
private int id_btwcode;
private int id_aankoopproduct;
private int id_aankoopeenheid;
private int id_collieenheid;
private int id_prijseenheid;
private int id_verpakkingseenheid;
private int id_basiseenheid;
private double eenheidsprijs;
private double hoeveelheid;
private Date inserted;
private Date updated;
private String soort_boeking;
private Date datum_houdbaarheid;
private Date datum_levering;
private String lotnummer;
private double leveringstemperatuur;
private int id_bestelbon;
private int id_leveringsbon;
private double maatstaf;
private String lotnummer_extern;
private int id_gebruik;
private Date datum_gebruik;
private String reden_gebruik;
private double hoeveelheid_reden;
private double hoeveelheid_vuilbak;
private double hoeveelheid_geweigerd;
private double hoeveelheid_terug;
private boolean tonen;
private boolean gescand;
private double hoeveelheid_in_gebruik;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;

public AankoopfactuurDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_boekjaar = Util.Int(data[1]);
this.id_dagboek = Util.Int(data[2]);
this.id_factuur = Util.Int(data[3]);
this.volgnummer = Util.Int(data[4]);
this.id_type_algemeen = Util.Int(data[5]);
this.id_algemene_rekening = Util.Int(data[6]);
this.id_type_analytisch = Util.Int(data[7]);
this.id_analytische_rekening = Util.Int(data[8]);
this.bedrag = Util.Double(data[9]);
this.debet_credit = data[10];
this.id_muntcode = Util.Int(data[11]);
this.wisselkoers = Util.Double(data[12]);
this.bedrag_eigen_munt = Util.Double(data[13]);
this.id_btwcode = Util.Int(data[14]);
this.id_aankoopproduct = Util.Int(data[15]);
this.id_aankoopeenheid = Util.Int(data[16]);
this.id_collieenheid = Util.Int(data[17]);
this.id_prijseenheid = Util.Int(data[18]);
this.id_verpakkingseenheid = Util.Int(data[19]);
this.id_basiseenheid = Util.Int(data[20]);
this.eenheidsprijs = Util.Double(data[21]);
this.hoeveelheid = Util.Double(data[22]);
this.inserted = Util.Date(data[23]);
this.updated = Util.Date(data[24]);
this.soort_boeking = data[25];
this.datum_houdbaarheid = Util.Date(data[26]);
this.datum_levering = Util.Date(data[27]);
this.lotnummer = data[28];
this.leveringstemperatuur = Util.Double(data[29]);
this.id_bestelbon = Util.Int(data[30]);
this.id_leveringsbon = Util.Int(data[31]);
this.maatstaf = Util.Double(data[32]);
this.lotnummer_extern = data[33];
this.id_gebruik = Util.Int(data[34]);
this.datum_gebruik = Util.Date(data[35]);
this.reden_gebruik = data[36];
this.hoeveelheid_reden = Util.Double(data[37]);
this.hoeveelheid_vuilbak = Util.Double(data[38]);
this.hoeveelheid_geweigerd = Util.Double(data[39]);
this.hoeveelheid_terug = Util.Double(data[40]);
this.tonen = Util.Boolean(data[41]);
this.gescand = Util.Boolean(data[42]);
this.hoeveelheid_in_gebruik = Util.Double(data[43]);
this.aantal_eenheden_verpakking = Util.Double(data[44]);
this.aantal_verpakkingen_colli = Util.Double(data[45]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_boekjaar() {
return this.id_boekjaar;
}
public int getId_dagboek() {
return this.id_dagboek;
}
public int getId_factuur() {
return this.id_factuur;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getId_type_algemeen() {
return this.id_type_algemeen;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public int getId_type_analytisch() {
return this.id_type_analytisch;
}
public int getId_analytische_rekening() {
return this.id_analytische_rekening;
}
public double getBedrag() {
return this.bedrag;
}
public String getDebet_credit() {
return this.debet_credit;
}
public int getId_muntcode() {
return this.id_muntcode;
}
public double getWisselkoers() {
return this.wisselkoers;
}
public double getBedrag_eigen_munt() {
return this.bedrag_eigen_munt;
}
public int getId_btwcode() {
return this.id_btwcode;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_aankoopeenheid() {
return this.id_aankoopeenheid;
}
public int getId_collieenheid() {
return this.id_collieenheid;
}
public int getId_prijseenheid() {
return this.id_prijseenheid;
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public String getSoort_boeking() {
return this.soort_boeking;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public Date getDatum_levering() {
return this.datum_levering;
}
public String getLotnummer() {
return this.lotnummer;
}
public double getLeveringstemperatuur() {
return this.leveringstemperatuur;
}
public int getId_bestelbon() {
return this.id_bestelbon;
}
public int getId_leveringsbon() {
return this.id_leveringsbon;
}
public double getMaatstaf() {
return this.maatstaf;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public int getId_gebruik() {
return this.id_gebruik;
}
public Date getDatum_gebruik() {
return this.datum_gebruik;
}
public String getReden_gebruik() {
return this.reden_gebruik;
}
public double getHoeveelheid_reden() {
return this.hoeveelheid_reden;
}
public double getHoeveelheid_vuilbak() {
return this.hoeveelheid_vuilbak;
}
public double getHoeveelheid_geweigerd() {
return this.hoeveelheid_geweigerd;
}
public double getHoeveelheid_terug() {
return this.hoeveelheid_terug;
}
public boolean getTonen() {
return this.tonen;
}
public boolean getGescand() {
return this.gescand;
}
public double getHoeveelheid_in_gebruik() {
return this.hoeveelheid_in_gebruik;
}
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_boekjaar(int id_boekjaar){
 this.id_boekjaar=id_boekjaar;
 }
public void setId_dagboek(int id_dagboek){
 this.id_dagboek=id_dagboek;
 }
public void setId_factuur(int id_factuur){
 this.id_factuur=id_factuur;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setId_type_algemeen(int id_type_algemeen){
 this.id_type_algemeen=id_type_algemeen;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setId_type_analytisch(int id_type_analytisch){
 this.id_type_analytisch=id_type_analytisch;
 }
public void setId_analytische_rekening(int id_analytische_rekening){
 this.id_analytische_rekening=id_analytische_rekening;
 }
public void setBedrag(double bedrag){
 this.bedrag=bedrag;
 }
public void setDebet_credit(String debet_credit){
 this.debet_credit=debet_credit;
 }
public void setId_muntcode(int id_muntcode){
 this.id_muntcode=id_muntcode;
 }
public void setWisselkoers(double wisselkoers){
 this.wisselkoers=wisselkoers;
 }
public void setBedrag_eigen_munt(double bedrag_eigen_munt){
 this.bedrag_eigen_munt=bedrag_eigen_munt;
 }
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_aankoopeenheid(int id_aankoopeenheid){
 this.id_aankoopeenheid=id_aankoopeenheid;
 }
public void setId_collieenheid(int id_collieenheid){
 this.id_collieenheid=id_collieenheid;
 }
public void setId_prijseenheid(int id_prijseenheid){
 this.id_prijseenheid=id_prijseenheid;
 }
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setSoort_boeking(String soort_boeking){
 this.soort_boeking=soort_boeking;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setDatum_levering(Date datum_levering){
 this.datum_levering=datum_levering;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setLeveringstemperatuur(double leveringstemperatuur){
 this.leveringstemperatuur=leveringstemperatuur;
 }
public void setId_bestelbon(int id_bestelbon){
 this.id_bestelbon=id_bestelbon;
 }
public void setId_leveringsbon(int id_leveringsbon){
 this.id_leveringsbon=id_leveringsbon;
 }
public void setMaatstaf(double maatstaf){
 this.maatstaf=maatstaf;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setId_gebruik(int id_gebruik){
 this.id_gebruik=id_gebruik;
 }
public void setDatum_gebruik(Date datum_gebruik){
 this.datum_gebruik=datum_gebruik;
 }
public void setReden_gebruik(String reden_gebruik){
 this.reden_gebruik=reden_gebruik;
 }
public void setHoeveelheid_reden(double hoeveelheid_reden){
 this.hoeveelheid_reden=hoeveelheid_reden;
 }
public void setHoeveelheid_vuilbak(double hoeveelheid_vuilbak){
 this.hoeveelheid_vuilbak=hoeveelheid_vuilbak;
 }
public void setHoeveelheid_geweigerd(double hoeveelheid_geweigerd){
 this.hoeveelheid_geweigerd=hoeveelheid_geweigerd;
 }
public void setHoeveelheid_terug(double hoeveelheid_terug){
 this.hoeveelheid_terug=hoeveelheid_terug;
 }
public void setTonen(boolean tonen){
 this.tonen=tonen;
 }
public void setGescand(boolean gescand){
 this.gescand=gescand;
 }
public void setHoeveelheid_in_gebruik(double hoeveelheid_in_gebruik){
 this.hoeveelheid_in_gebruik=hoeveelheid_in_gebruik;
 }
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
}