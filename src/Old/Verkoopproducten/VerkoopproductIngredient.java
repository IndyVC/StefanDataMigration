package Old.Verkoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerkoopproductIngredient implements Old { 
private int id_bedrijf;
private int id_verkoopproduct;
private int id_ingredient;
private double percentage;
private int volgnummer;
private int cc;
private Date inserted;
private Date updated;
private boolean kwid;

public VerkoopproductIngredient(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopproduct = Util.Int(data[1]);
this.id_ingredient = Util.Int(data[2]);
this.percentage = Util.Double(data[3]);
this.volgnummer = Util.Int(data[4]);
this.cc = Util.Int(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
this.kwid = Util.Boolean(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public int getId_ingredient() {
return this.id_ingredient;
}
public double getPercentage() {
return this.percentage;
}
public int getVolgnummer() {
return this.volgnummer;
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
public boolean getKwid() {
return this.kwid;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
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
public void setKwid(boolean kwid){
 this.kwid=kwid;
 }
}