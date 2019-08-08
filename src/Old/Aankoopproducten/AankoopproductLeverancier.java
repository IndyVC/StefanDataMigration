package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductLeverancier implements Old { 
private String TABLE;
private int id_aankoopproduct;
private int id_leverancier;
private String referentie_product;
private Date inserted;
private Date updated;
private int cc;

public AankoopproductLeverancier(String[] data){
this.TABLE = data[0];
this.id_aankoopproduct = Util.Int(data[1]);
this.id_leverancier = Util.Int(data[2]);
this.referentie_product = data[3];
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.cc = Util.Int(data[6]);
}
public String getTABLE() {
return this.TABLE;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public String getReferentie_product() {
return this.referentie_product;
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
public void setTABLE(String TABLE){
 this.TABLE=TABLE;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setReferentie_product(String referentie_product){
 this.referentie_product=referentie_product;
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