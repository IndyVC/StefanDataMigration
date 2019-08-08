package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class KassabestellingDetail implements Old { 
private int id_bedrijf;
private int id_kassabestelling;
private int volgnummer;
private double hoeveelheid;
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
private boolean verdeelticket_afgedrukt;

public KassabestellingDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_kassabestelling = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.hoeveelheid = Util.Double(data[3]);
this.id_verkoopproduct = Util.Int(data[4]);
this.aantal_personen = Util.Int(data[5]);
this.id_variant_header = Util.Int(data[6]);
this.id_variant_detail = Util.Int(data[7]);
this.id_option_header = Util.Int(data[8]);
this.id_option_detail = Util.Int(data[9]);
this.opmerking = data[10];
this.inserted = Util.Date(data[11]);
this.updated = Util.Date(data[12]);
this.cc = Util.Int(data[13]);
this.verdeelticket_afgedrukt = Util.Boolean(data[14]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_kassabestelling() {
return this.id_kassabestelling;
}
public int getVolgnummer() {
return this.volgnummer;
}
public double getHoeveelheid() {
return this.hoeveelheid;
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
public boolean getVerdeelticket_afgedrukt() {
return this.verdeelticket_afgedrukt;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_kassabestelling(int id_kassabestelling){
 this.id_kassabestelling=id_kassabestelling;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
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
public void setVerdeelticket_afgedrukt(boolean verdeelticket_afgedrukt){
 this.verdeelticket_afgedrukt=verdeelticket_afgedrukt;
 }
}