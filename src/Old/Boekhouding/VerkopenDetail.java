package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerkopenDetail implements Old { 
private int id_bedrijf;
private int id_point_of_sales;
private Date datum_uur;
private int id_prokas_nummer;
private int volgnummer;
private int id_verkoopproduct;
private int aantal_personen;
private int id_variant_header;
private int id_variant_detail;
private int id_option_header;
private int id_option_detail;
private int id_kassabestelling_prokas;
private Date inserted;
private Date updated;
private double hoeveelheid;

public VerkopenDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_point_of_sales = Util.Int(data[1]);
this.datum_uur = Util.Date(data[2]);
this.id_prokas_nummer = Util.Int(data[3]);
this.volgnummer = Util.Int(data[4]);
this.id_verkoopproduct = Util.Int(data[5]);
this.aantal_personen = Util.Int(data[6]);
this.id_variant_header = Util.Int(data[7]);
this.id_variant_detail = Util.Int(data[8]);
this.id_option_header = Util.Int(data[9]);
this.id_option_detail = Util.Int(data[10]);
this.id_kassabestelling_prokas = Util.Int(data[11]);
this.inserted = Util.Date(data[12]);
this.updated = Util.Date(data[13]);
this.hoeveelheid = Util.Double(data[14]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_point_of_sales() {
return this.id_point_of_sales;
}
public Date getDatum_uur() {
return this.datum_uur;
}
public int getId_prokas_nummer() {
return this.id_prokas_nummer;
}
public int getVolgnummer() {
return this.volgnummer;
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
public int getId_kassabestelling_prokas() {
return this.id_kassabestelling_prokas;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_point_of_sales(int id_point_of_sales){
 this.id_point_of_sales=id_point_of_sales;
 }
public void setDatum_uur(Date datum_uur){
 this.datum_uur=datum_uur;
 }
public void setId_prokas_nummer(int id_prokas_nummer){
 this.id_prokas_nummer=id_prokas_nummer;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
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
public void setId_kassabestelling_prokas(int id_kassabestelling_prokas){
 this.id_kassabestelling_prokas=id_kassabestelling_prokas;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
}