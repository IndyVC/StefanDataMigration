package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class OrderpickingDetail implements Old { 
private int id_bedrijf;
private int id_orderpicking;
private int id_produktieopdracht;
private String lotnummer;
private double hoeveelheid;
private Date inserted;
private Date updated;
private int cc;
private int volgnummer;
private int volgnummer_verkoopproduct;
private int id_verkoopproduct;
private double verkoopprijs;
private double basisprijs;
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
private double verwerkte_hoeveelheid;
private String id_convertie;
private double hoeveelheid_winkelbestelling;

public OrderpickingDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_orderpicking = Util.Int(data[1]);
this.id_produktieopdracht = Util.Int(data[2]);
this.lotnummer = data[3];
this.hoeveelheid = Util.Double(data[4]);
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.cc = Util.Int(data[7]);
this.volgnummer = Util.Int(data[8]);
this.volgnummer_verkoopproduct = Util.Int(data[9]);
this.id_verkoopproduct = Util.Int(data[10]);
this.verkoopprijs = Util.Double(data[11]);
this.basisprijs = Util.Double(data[12]);
this.eenheid = Util.Int(data[13]);
this.aantal_personen = Util.Int(data[14]);
this.id_variant_header = Util.Int(data[15]);
this.id_variant_detail = Util.Int(data[16]);
this.bedrag_variant = Util.Double(data[17]);
this.bedrag_variant_per_eenheid = Util.Boolean(data[18]);
this.id_option_header = Util.Int(data[19]);
this.id_option_detail = Util.Int(data[20]);
this.bedrag_option = Util.Double(data[21]);
this.bedrag_option_per_eenheid = Util.Boolean(data[22]);
this.kortingsbedrag = Util.Double(data[23]);
this.korting_manueel_aangepast = Util.Boolean(data[24]);
this.mag_korting_berekend_worden = Util.Boolean(data[25]);
this.leveringskost = Util.Double(data[26]);
this.leveringskosten_berekenen = Util.Boolean(data[27]);
this.totaal_bedrag = Util.Double(data[28]);
this.tekst = data[29];
this.verwerkte_hoeveelheid = Util.Double(data[30]);
this.id_convertie = data[31];
this.hoeveelheid_winkelbestelling = Util.Double(data[32]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_orderpicking() {
return this.id_orderpicking;
}
public int getId_produktieopdracht() {
return this.id_produktieopdracht;
}
public String getLotnummer() {
return this.lotnummer;
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
public int getCc() {
return this.cc;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getVolgnummer_verkoopproduct() {
return this.volgnummer_verkoopproduct;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public double getVerkoopprijs() {
return this.verkoopprijs;
}
public double getBasisprijs() {
return this.basisprijs;
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
public double getVerwerkte_hoeveelheid() {
return this.verwerkte_hoeveelheid;
}
public String getId_convertie() {
return this.id_convertie;
}
public double getHoeveelheid_winkelbestelling() {
return this.hoeveelheid_winkelbestelling;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_orderpicking(int id_orderpicking){
 this.id_orderpicking=id_orderpicking;
 }
public void setId_produktieopdracht(int id_produktieopdracht){
 this.id_produktieopdracht=id_produktieopdracht;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
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
public void setCc(int cc){
 this.cc=cc;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setVolgnummer_verkoopproduct(int volgnummer_verkoopproduct){
 this.volgnummer_verkoopproduct=volgnummer_verkoopproduct;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setVerkoopprijs(double verkoopprijs){
 this.verkoopprijs=verkoopprijs;
 }
public void setBasisprijs(double basisprijs){
 this.basisprijs=basisprijs;
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
public void setVerwerkte_hoeveelheid(double verwerkte_hoeveelheid){
 this.verwerkte_hoeveelheid=verwerkte_hoeveelheid;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setHoeveelheid_winkelbestelling(double hoeveelheid_winkelbestelling){
 this.hoeveelheid_winkelbestelling=hoeveelheid_winkelbestelling;
 }
}