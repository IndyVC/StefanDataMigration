package Old.Verkoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerkoopproductNutrioneleInformatie implements Old { 
private int id_bedrijf;
private int id_verkoopproduct;
private int id_nutrionele_informatie_header;
private int id_nutrionele_informatie_detail;
private double waarde;
private int cc;
private Date inserted;
private Date updated;

public VerkoopproductNutrioneleInformatie(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopproduct = Util.Int(data[1]);
this.id_nutrionele_informatie_header = Util.Int(data[2]);
this.id_nutrionele_informatie_detail = Util.Int(data[3]);
this.waarde = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
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
public int getCc() {
return this.cc;
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
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
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
public void setCc(int cc){
 this.cc=cc;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}