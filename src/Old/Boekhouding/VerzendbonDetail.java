package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerzendbonDetail implements Old { 
private int id_bedrijf;
private int id_verzendbon;
private int volgnummer;
private int id_bestelbon_klant;
private String id_bestelbon_klant_convertie;
private int id_verkoopproduct;
private double hoeveelheid;
private String lotnummer;
private Date timestamp_picking;
private int id_werknemer;
private double verkoopprijs;
private double basisprijs;
private Date inserted;
private Date updated;
private int cc;
private int eenheid;
private int aantal_personen;
private int id_variant_header;
private int id_variant_detail;
private double bedrag_variant;
private boolean bedrag_variant_per_eenheid;
private int id_option_header;
private int id_option_detail;
private double bedrag_option;
private boolean bedrag_option_per_eenheid;
private double kortingsbedrag;
private boolean korting_manueel_aangepast;
private boolean mag_korting_berekend_worden;
private double leveringskost;
private boolean leveringskosten_berekenen;
private double totaal_bedrag;
private String tekst;
private String lotnummer_verzendbon;

public VerzendbonDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verzendbon = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.id_bestelbon_klant = Util.Int(data[3]);
this.id_bestelbon_klant_convertie = data[4];
this.id_verkoopproduct = Util.Int(data[5]);
this.hoeveelheid = Util.Double(data[6]);
this.lotnummer = data[7];
this.timestamp_picking = Util.Date(data[8]);
this.id_werknemer = Util.Int(data[9]);
this.verkoopprijs = Util.Double(data[10]);
this.basisprijs = Util.Double(data[11]);
this.inserted = Util.Date(data[12]);
this.updated = Util.Date(data[13]);
this.cc = Util.Int(data[14]);
this.eenheid = Util.Int(data[15]);
this.aantal_personen = Util.Int(data[16]);
this.id_variant_header = Util.Int(data[17]);
this.id_variant_detail = Util.Int(data[18]);
this.bedrag_variant = Util.Double(data[19]);
this.bedrag_variant_per_eenheid = Util.Boolean(data[20]);
this.id_option_header = Util.Int(data[21]);
this.id_option_detail = Util.Int(data[22]);
this.bedrag_option = Util.Double(data[23]);
this.bedrag_option_per_eenheid = Util.Boolean(data[24]);
this.kortingsbedrag = Util.Double(data[25]);
this.korting_manueel_aangepast = Util.Boolean(data[26]);
this.mag_korting_berekend_worden = Util.Boolean(data[27]);
this.leveringskost = Util.Double(data[28]);
this.leveringskosten_berekenen = Util.Boolean(data[29]);
this.totaal_bedrag = Util.Double(data[30]);
this.tekst = data[31];
this.lotnummer_verzendbon = data[32];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verzendbon() {
return this.id_verzendbon;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getId_bestelbon_klant() {
return this.id_bestelbon_klant;
}
public String getId_bestelbon_klant_convertie() {
return this.id_bestelbon_klant_convertie;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public String getLotnummer() {
return this.lotnummer;
}
public Date getTimestamp_picking() {
return this.timestamp_picking;
}
public int getId_werknemer() {
return this.id_werknemer;
}
public double getVerkoopprijs() {
return this.verkoopprijs;
}
public double getBasisprijs() {
return this.basisprijs;
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
public int getEenheid() {
return this.eenheid;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_variant_detail() {
return this.id_variant_detail;
}
public double getBedrag_variant() {
return this.bedrag_variant;
}
public boolean getBedrag_variant_per_eenheid() {
return this.bedrag_variant_per_eenheid;
}
public int getId_option_header() {
return this.id_option_header;
}
public int getId_option_detail() {
return this.id_option_detail;
}
public double getBedrag_option() {
return this.bedrag_option;
}
public boolean getBedrag_option_per_eenheid() {
return this.bedrag_option_per_eenheid;
}
public double getKortingsbedrag() {
return this.kortingsbedrag;
}
public boolean getKorting_manueel_aangepast() {
return this.korting_manueel_aangepast;
}
public boolean getMag_korting_berekend_worden() {
return this.mag_korting_berekend_worden;
}
public double getLeveringskost() {
return this.leveringskost;
}
public boolean getLeveringskosten_berekenen() {
return this.leveringskosten_berekenen;
}
public double getTotaal_bedrag() {
return this.totaal_bedrag;
}
public String getTekst() {
return this.tekst;
}
public String getLotnummer_verzendbon() {
return this.lotnummer_verzendbon;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verzendbon(int id_verzendbon){
 this.id_verzendbon=id_verzendbon;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setId_bestelbon_klant(int id_bestelbon_klant){
 this.id_bestelbon_klant=id_bestelbon_klant;
 }
public void setId_bestelbon_klant_convertie(String id_bestelbon_klant_convertie){
 this.id_bestelbon_klant_convertie=id_bestelbon_klant_convertie;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setTimestamp_picking(Date timestamp_picking){
 this.timestamp_picking=timestamp_picking;
 }
public void setId_werknemer(int id_werknemer){
 this.id_werknemer=id_werknemer;
 }
public void setVerkoopprijs(double verkoopprijs){
 this.verkoopprijs=verkoopprijs;
 }
public void setBasisprijs(double basisprijs){
 this.basisprijs=basisprijs;
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
public void setEenheid(int eenheid){
 this.eenheid=eenheid;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_variant_detail(int id_variant_detail){
 this.id_variant_detail=id_variant_detail;
 }
public void setBedrag_variant(double bedrag_variant){
 this.bedrag_variant=bedrag_variant;
 }
public void setBedrag_variant_per_eenheid(boolean bedrag_variant_per_eenheid){
 this.bedrag_variant_per_eenheid=bedrag_variant_per_eenheid;
 }
public void setId_option_header(int id_option_header){
 this.id_option_header=id_option_header;
 }
public void setId_option_detail(int id_option_detail){
 this.id_option_detail=id_option_detail;
 }
public void setBedrag_option(double bedrag_option){
 this.bedrag_option=bedrag_option;
 }
public void setBedrag_option_per_eenheid(boolean bedrag_option_per_eenheid){
 this.bedrag_option_per_eenheid=bedrag_option_per_eenheid;
 }
public void setKortingsbedrag(double kortingsbedrag){
 this.kortingsbedrag=kortingsbedrag;
 }
public void setKorting_manueel_aangepast(boolean korting_manueel_aangepast){
 this.korting_manueel_aangepast=korting_manueel_aangepast;
 }
public void setMag_korting_berekend_worden(boolean mag_korting_berekend_worden){
 this.mag_korting_berekend_worden=mag_korting_berekend_worden;
 }
public void setLeveringskost(double leveringskost){
 this.leveringskost=leveringskost;
 }
public void setLeveringskosten_berekenen(boolean leveringskosten_berekenen){
 this.leveringskosten_berekenen=leveringskosten_berekenen;
 }
public void setTotaal_bedrag(double totaal_bedrag){
 this.totaal_bedrag=totaal_bedrag;
 }
public void setTekst(String tekst){
 this.tekst=tekst;
 }
public void setLotnummer_verzendbon(String lotnummer_verzendbon){
 this.lotnummer_verzendbon=lotnummer_verzendbon;
 }
}