package Old.Productie;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Productieopdracht implements Old { 
private int id_bedrijf;
private int id_produktieopdracht;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private double hoeveelheid;
private int id_recepteenheid;
private int aantal_etiketten;
private Date inserted;
private Date updated;
private int cc;
private String lotnummer;
private Date datum_produktie;
private Date datum_houdbaarheid;
private boolean voorraad;
private int aantal_personen;
private String opmerking;
private boolean overschot;
private double hoeveelheid_telbasis;
private String werkstation;
private boolean produktie_backoffice;
private int id_regelmaat;
private int id_frequentie;
private int id_variant_header;
private int id_variant_detail;
private int id_option_header;
private int id_option_detail;
private String opmerking_backoffice;
private String lotnummer_extern;

public Productieopdracht(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktieopdracht = Util.Int(data[1]);
this.code_eigen_fabrikaat = Util.Int(data[2]);
this.id_eigen_fabrikaat = Util.Int(data[3]);
this.hoeveelheid = Util.Double(data[4]);
this.id_recepteenheid = Util.Int(data[5]);
this.aantal_etiketten = Util.Int(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.lotnummer = data[10];
this.datum_produktie = Util.Date(data[11]);
this.datum_houdbaarheid = Util.Date(data[12]);
this.voorraad = Util.Boolean(data[13]);
this.aantal_personen = Util.Int(data[14]);
this.opmerking = data[15];
this.overschot = Util.Boolean(data[16]);
this.hoeveelheid_telbasis = Util.Double(data[17]);
this.werkstation = data[18];
this.produktie_backoffice = Util.Boolean(data[19]);
this.id_regelmaat = Util.Int(data[20]);
this.id_frequentie = Util.Int(data[21]);
this.id_variant_header = Util.Int(data[22]);
this.id_variant_detail = Util.Int(data[23]);
this.id_option_header = Util.Int(data[24]);
this.id_option_detail = Util.Int(data[25]);
this.opmerking_backoffice = data[26];
this.lotnummer_extern = data[27];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktieopdracht() {
return this.id_produktieopdracht;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public int getId_eigen_fabrikaat() {
return this.id_eigen_fabrikaat;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public int getAantal_etiketten() {
return this.aantal_etiketten;
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
public String getLotnummer() {
return this.lotnummer;
}
public Date getDatum_produktie() {
return this.datum_produktie;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public boolean getVoorraad() {
return this.voorraad;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public String getOpmerking() {
return this.opmerking;
}
public boolean getOverschot() {
return this.overschot;
}
public double getHoeveelheid_telbasis() {
return this.hoeveelheid_telbasis;
}
public String getWerkstation() {
return this.werkstation;
}
public boolean getProduktie_backoffice() {
return this.produktie_backoffice;
}
public int getId_regelmaat() {
return this.id_regelmaat;
}
public int getId_frequentie() {
return this.id_frequentie;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_variant_detail() {
return this.id_variant_detail;
}
public int getId_option_header() {
return this.id_option_header;
}
public int getId_option_detail() {
return this.id_option_detail;
}
public String getOpmerking_backoffice() {
return this.opmerking_backoffice;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktieopdracht(int id_produktieopdracht){
 this.id_produktieopdracht=id_produktieopdracht;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setId_eigen_fabrikaat(int id_eigen_fabrikaat){
 this.id_eigen_fabrikaat=id_eigen_fabrikaat;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setAantal_etiketten(int aantal_etiketten){
 this.aantal_etiketten=aantal_etiketten;
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
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setDatum_produktie(Date datum_produktie){
 this.datum_produktie=datum_produktie;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setVoorraad(boolean voorraad){
 this.voorraad=voorraad;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
 }
public void setOverschot(boolean overschot){
 this.overschot=overschot;
 }
public void setHoeveelheid_telbasis(double hoeveelheid_telbasis){
 this.hoeveelheid_telbasis=hoeveelheid_telbasis;
 }
public void setWerkstation(String werkstation){
 this.werkstation=werkstation;
 }
public void setProduktie_backoffice(boolean produktie_backoffice){
 this.produktie_backoffice=produktie_backoffice;
 }
public void setId_regelmaat(int id_regelmaat){
 this.id_regelmaat=id_regelmaat;
 }
public void setId_frequentie(int id_frequentie){
 this.id_frequentie=id_frequentie;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_variant_detail(int id_variant_detail){
 this.id_variant_detail=id_variant_detail;
 }
public void setId_option_header(int id_option_header){
 this.id_option_header=id_option_header;
 }
public void setId_option_detail(int id_option_detail){
 this.id_option_detail=id_option_detail;
 }
public void setOpmerking_backoffice(String opmerking_backoffice){
 this.opmerking_backoffice=opmerking_backoffice;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
}