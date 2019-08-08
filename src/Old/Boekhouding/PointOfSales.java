package Old.Boekhouding;
import Old.Old;
import Utils.Util;

public class PointOfSales implements Old { 
private int id_bedrijf;
private int id_point_of_sales;
private int id_klant;
private String reference_headquarters;
private String reference_point_of_sales;
private String inserted;
private String updated;
private int cc;
private String folder_import_bestellingen;
private String folder_import_overschotten;
private String folder_save_bestellingen;
private String folder_save_overschotten;
private String folder_import_verkopen;
private String folder_save_verkopen;

public PointOfSales(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_point_of_sales = Util.Int(data[1]);
this.id_klant = Util.Int(data[2]);
this.reference_headquarters = data[3];
this.reference_point_of_sales = data[4];
this.inserted = data[5];
this.updated = data[6];
this.cc = Util.Int(data[7]);
this.folder_import_bestellingen = data[8];
this.folder_import_overschotten = data[9];
this.folder_save_bestellingen = data[10];
this.folder_save_overschotten = data[11];
this.folder_import_verkopen = data[12];
this.folder_save_verkopen = data[13];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_point_of_sales() {
return this.id_point_of_sales;
}
public int getId_klant() {
return this.id_klant;
}
public String getReference_headquarters() {
return this.reference_headquarters;
}
public String getReference_point_of_sales() {
return this.reference_point_of_sales;
}
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public String getFolder_import_bestellingen() {
return this.folder_import_bestellingen;
}
public String getFolder_import_overschotten() {
return this.folder_import_overschotten;
}
public String getFolder_save_bestellingen() {
return this.folder_save_bestellingen;
}
public String getFolder_save_overschotten() {
return this.folder_save_overschotten;
}
public String getFolder_import_verkopen() {
return this.folder_import_verkopen;
}
public String getFolder_save_verkopen() {
return this.folder_save_verkopen;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_point_of_sales(int id_point_of_sales){
 this.id_point_of_sales=id_point_of_sales;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setReference_headquarters(String reference_headquarters){
 this.reference_headquarters=reference_headquarters;
 }
public void setReference_point_of_sales(String reference_point_of_sales){
 this.reference_point_of_sales=reference_point_of_sales;
 }
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setFolder_import_bestellingen(String folder_import_bestellingen){
 this.folder_import_bestellingen=folder_import_bestellingen;
 }
public void setFolder_import_overschotten(String folder_import_overschotten){
 this.folder_import_overschotten=folder_import_overschotten;
 }
public void setFolder_save_bestellingen(String folder_save_bestellingen){
 this.folder_save_bestellingen=folder_save_bestellingen;
 }
public void setFolder_save_overschotten(String folder_save_overschotten){
 this.folder_save_overschotten=folder_save_overschotten;
 }
public void setFolder_import_verkopen(String folder_import_verkopen){
 this.folder_import_verkopen=folder_import_verkopen;
 }
public void setFolder_save_verkopen(String folder_save_verkopen){
 this.folder_save_verkopen=folder_save_verkopen;
 }
}