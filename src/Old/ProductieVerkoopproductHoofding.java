package Old;
import Utils.Util;
import java.sql.Date;

public class ProductieVerkoopproductHoofding implements Old { 
private int id_bedrijf;
private Date datum_levering;
private int id_verkoopproduct;
private int volgnummer;
private int id_variant_header;
private int id_variant_detail;
private int id_remark_header;
private int id_remark_detail;
private double hoeveelheid_levering1;
private double hoeveelheid_levering2;
private double hoeveelheid_levering3;
private double hoeveelheid_levering4;
private double hoeveelheid_levering5;
private double hoeveelheid_levering6;
private double hoeveelheid_levering7;
private double hoeveelheid_levering8;
private double hoeveelheid_levering9;
private int aantal_personen;
private String tekst;
private Date inserted;
private Date updated;
private int cc;
private double totale_hoeveelheid;
private double aangepaste_hoeveelheid;
private boolean end_drilldown;
private boolean uit_voorraad;
private int id_regelmaat;

public ProductieVerkoopproductHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.datum_levering = Util.Date(data[1]);
this.id_verkoopproduct = Util.Int(data[2]);
this.volgnummer = Util.Int(data[3]);
this.id_variant_header = Util.Int(data[4]);
this.id_variant_detail = Util.Int(data[5]);
this.id_remark_header = Util.Int(data[6]);
this.id_remark_detail = Util.Int(data[7]);
this.hoeveelheid_levering1 = Util.Double(data[8]);
this.hoeveelheid_levering2 = Util.Double(data[9]);
this.hoeveelheid_levering3 = Util.Double(data[10]);
this.hoeveelheid_levering4 = Util.Double(data[11]);
this.hoeveelheid_levering5 = Util.Double(data[12]);
this.hoeveelheid_levering6 = Util.Double(data[13]);
this.hoeveelheid_levering7 = Util.Double(data[14]);
this.hoeveelheid_levering8 = Util.Double(data[15]);
this.hoeveelheid_levering9 = Util.Double(data[16]);
this.aantal_personen = Util.Int(data[17]);
this.tekst = data[18];
this.inserted = Util.Date(data[19]);
this.updated = Util.Date(data[20]);
this.cc = Util.Int(data[21]);
this.totale_hoeveelheid = Util.Double(data[22]);
this.aangepaste_hoeveelheid = Util.Double(data[23]);
this.end_drilldown = Util.Boolean(data[24]);
this.uit_voorraad = Util.Boolean(data[25]);
this.id_regelmaat = Util.Int(data[26]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public Date getDatum_levering() {
return this.datum_levering;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_variant_detail() {
return this.id_variant_detail;
}
public int getId_remark_header() {
return this.id_remark_header;
}
public int getId_remark_detail() {
return this.id_remark_detail;
}
public double getHoeveelheid_levering1() {
return this.hoeveelheid_levering1;
}
public double getHoeveelheid_levering2() {
return this.hoeveelheid_levering2;
}
public double getHoeveelheid_levering3() {
return this.hoeveelheid_levering3;
}
public double getHoeveelheid_levering4() {
return this.hoeveelheid_levering4;
}
public double getHoeveelheid_levering5() {
return this.hoeveelheid_levering5;
}
public double getHoeveelheid_levering6() {
return this.hoeveelheid_levering6;
}
public double getHoeveelheid_levering7() {
return this.hoeveelheid_levering7;
}
public double getHoeveelheid_levering8() {
return this.hoeveelheid_levering8;
}
public double getHoeveelheid_levering9() {
return this.hoeveelheid_levering9;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public String getTekst() {
return this.tekst;
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
public double getTotale_hoeveelheid() {
return this.totale_hoeveelheid;
}
public double getAangepaste_hoeveelheid() {
return this.aangepaste_hoeveelheid;
}
public boolean getEnd_drilldown() {
return this.end_drilldown;
}
public boolean getUit_voorraad() {
return this.uit_voorraad;
}
public int getId_regelmaat() {
return this.id_regelmaat;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setDatum_levering(Date datum_levering){
 this.datum_levering=datum_levering;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_variant_detail(int id_variant_detail){
 this.id_variant_detail=id_variant_detail;
 }
public void setId_remark_header(int id_remark_header){
 this.id_remark_header=id_remark_header;
 }
public void setId_remark_detail(int id_remark_detail){
 this.id_remark_detail=id_remark_detail;
 }
public void setHoeveelheid_levering1(double hoeveelheid_levering1){
 this.hoeveelheid_levering1=hoeveelheid_levering1;
 }
public void setHoeveelheid_levering2(double hoeveelheid_levering2){
 this.hoeveelheid_levering2=hoeveelheid_levering2;
 }
public void setHoeveelheid_levering3(double hoeveelheid_levering3){
 this.hoeveelheid_levering3=hoeveelheid_levering3;
 }
public void setHoeveelheid_levering4(double hoeveelheid_levering4){
 this.hoeveelheid_levering4=hoeveelheid_levering4;
 }
public void setHoeveelheid_levering5(double hoeveelheid_levering5){
 this.hoeveelheid_levering5=hoeveelheid_levering5;
 }
public void setHoeveelheid_levering6(double hoeveelheid_levering6){
 this.hoeveelheid_levering6=hoeveelheid_levering6;
 }
public void setHoeveelheid_levering7(double hoeveelheid_levering7){
 this.hoeveelheid_levering7=hoeveelheid_levering7;
 }
public void setHoeveelheid_levering8(double hoeveelheid_levering8){
 this.hoeveelheid_levering8=hoeveelheid_levering8;
 }
public void setHoeveelheid_levering9(double hoeveelheid_levering9){
 this.hoeveelheid_levering9=hoeveelheid_levering9;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setTekst(String tekst){
 this.tekst=tekst;
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
public void setTotale_hoeveelheid(double totale_hoeveelheid){
 this.totale_hoeveelheid=totale_hoeveelheid;
 }
public void setAangepaste_hoeveelheid(double aangepaste_hoeveelheid){
 this.aangepaste_hoeveelheid=aangepaste_hoeveelheid;
 }
public void setEnd_drilldown(boolean end_drilldown){
 this.end_drilldown=end_drilldown;
 }
public void setUit_voorraad(boolean uit_voorraad){
 this.uit_voorraad=uit_voorraad;
 }
public void setId_regelmaat(int id_regelmaat){
 this.id_regelmaat=id_regelmaat;
 }
}