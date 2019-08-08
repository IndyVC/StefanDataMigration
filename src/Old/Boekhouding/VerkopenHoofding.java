package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerkopenHoofding implements Old { 
private int id_bedrijf;
private int id_point_of_sales;
private Date datum_uur;
private int id_prokas_nummer;
private String id_klant_prokas;
private int id_klant;
private Date inserted;
private Date updated;

public VerkopenHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_point_of_sales = Util.Int(data[1]);
this.datum_uur = Util.Date(data[2]);
this.id_prokas_nummer = Util.Int(data[3]);
this.id_klant_prokas = data[4];
this.id_klant = Util.Int(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
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
public String getId_klant_prokas() {
return this.id_klant_prokas;
}
public int getId_klant() {
return this.id_klant;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
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
public void setId_klant_prokas(String id_klant_prokas){
 this.id_klant_prokas=id_klant_prokas;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}