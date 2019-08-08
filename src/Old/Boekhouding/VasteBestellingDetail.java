package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VasteBestellingDetail implements Old { 
private int id_bedrijf;
private int id_vaste_bestelling;
private int volgnummer;
private double hoeveelheid_maandag;
private double hoeveelheid_dinsdag;
private double hoeveelheid_woensdag;
private double hoeveelheid_donderdag;
private double hoeveelheid_vrijdag;
private double hoeveelheid_zaterdag;
private double hoeveelheid_zondag;
private double hoeveelheid_feestdag;
private int id_verkoopproduct;
private int aantal_personen;
private int id_variant_header;
private int id_variant_detail;
private int id_option_header;
private int id_option_detail;
private String opmerking;
private Date inserted;
private Date updated;
private int cc;

public VasteBestellingDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_vaste_bestelling = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.hoeveelheid_maandag = Util.Double(data[3]);
this.hoeveelheid_dinsdag = Util.Double(data[4]);
this.hoeveelheid_woensdag = Util.Double(data[5]);
this.hoeveelheid_donderdag = Util.Double(data[6]);
this.hoeveelheid_vrijdag = Util.Double(data[7]);
this.hoeveelheid_zaterdag = Util.Double(data[8]);
this.hoeveelheid_zondag = Util.Double(data[9]);
this.hoeveelheid_feestdag = Util.Double(data[10]);
this.id_verkoopproduct = Util.Int(data[11]);
this.aantal_personen = Util.Int(data[12]);
this.id_variant_header = Util.Int(data[13]);
this.id_variant_detail = Util.Int(data[14]);
this.id_option_header = Util.Int(data[15]);
this.id_option_detail = Util.Int(data[16]);
this.opmerking = data[17];
this.inserted = Util.Date(data[18]);
this.updated = Util.Date(data[19]);
this.cc = Util.Int(data[20]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_vaste_bestelling() {
return this.id_vaste_bestelling;
}
public int getVolgnummer() {
return this.volgnummer;
}
public double getHoeveelheid_maandag() {
return this.hoeveelheid_maandag;
}
public double getHoeveelheid_dinsdag() {
return this.hoeveelheid_dinsdag;
}
public double getHoeveelheid_woensdag() {
return this.hoeveelheid_woensdag;
}
public double getHoeveelheid_donderdag() {
return this.hoeveelheid_donderdag;
}
public double getHoeveelheid_vrijdag() {
return this.hoeveelheid_vrijdag;
}
public double getHoeveelheid_zaterdag() {
return this.hoeveelheid_zaterdag;
}
public double getHoeveelheid_zondag() {
return this.hoeveelheid_zondag;
}
public double getHoeveelheid_feestdag() {
return this.hoeveelheid_feestdag;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
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
public int getId_option_header() {
return this.id_option_header;
}
public int getId_option_detail() {
return this.id_option_detail;
}
public String getOpmerking() {
return this.opmerking;
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
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_vaste_bestelling(int id_vaste_bestelling){
 this.id_vaste_bestelling=id_vaste_bestelling;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setHoeveelheid_maandag(double hoeveelheid_maandag){
 this.hoeveelheid_maandag=hoeveelheid_maandag;
 }
public void setHoeveelheid_dinsdag(double hoeveelheid_dinsdag){
 this.hoeveelheid_dinsdag=hoeveelheid_dinsdag;
 }
public void setHoeveelheid_woensdag(double hoeveelheid_woensdag){
 this.hoeveelheid_woensdag=hoeveelheid_woensdag;
 }
public void setHoeveelheid_donderdag(double hoeveelheid_donderdag){
 this.hoeveelheid_donderdag=hoeveelheid_donderdag;
 }
public void setHoeveelheid_vrijdag(double hoeveelheid_vrijdag){
 this.hoeveelheid_vrijdag=hoeveelheid_vrijdag;
 }
public void setHoeveelheid_zaterdag(double hoeveelheid_zaterdag){
 this.hoeveelheid_zaterdag=hoeveelheid_zaterdag;
 }
public void setHoeveelheid_zondag(double hoeveelheid_zondag){
 this.hoeveelheid_zondag=hoeveelheid_zondag;
 }
public void setHoeveelheid_feestdag(double hoeveelheid_feestdag){
 this.hoeveelheid_feestdag=hoeveelheid_feestdag;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
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
public void setId_option_header(int id_option_header){
 this.id_option_header=id_option_header;
 }
public void setId_option_detail(int id_option_detail){
 this.id_option_detail=id_option_detail;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
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
}