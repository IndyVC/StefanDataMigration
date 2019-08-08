package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductNutrioneleInformatie implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private int id_nutrionele_informatie_header;
private int id_nutrionele_informatie_detail;
private double waarde;
private String inserted;
private String updated;
private int cc;
private String technische_fiche_versie;
private Date technische_fiche_datum;

public AankoopproductNutrioneleInformatie(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.id_nutrionele_informatie_header = Util.Int(data[2]);
this.id_nutrionele_informatie_detail = Util.Int(data[3]);
this.waarde = Util.Double(data[4]);
this.inserted = data[5];
this.updated = data[6];
this.cc = Util.Int(data[7]);
this.technische_fiche_versie = data[8];
this.technische_fiche_datum = Util.Date(data[9]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_nutrionele_informatie_header() {
return this.id_nutrionele_informatie_header;
}
public int getId_nutrionele_informatie_detail() {
return this.id_nutrionele_informatie_detail;
}
public double getWaarde() {
return this.waarde;
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
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_nutrionele_informatie_header(int id_nutrionele_informatie_header){
 this.id_nutrionele_informatie_header=id_nutrionele_informatie_header;
 }
public void setId_nutrionele_informatie_detail(int id_nutrionele_informatie_detail){
 this.id_nutrionele_informatie_detail=id_nutrionele_informatie_detail;
 }
public void setWaarde(double waarde){
 this.waarde=waarde;
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
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
}