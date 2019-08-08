package Old.Bestelling;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class BestelbonHoofding implements Old { 
private int id_bedrijf;
private int id_bestelbon;
private int id_leveradres;
private int id_leverancier;
private Date datum_bestelbon;
private Date datum_gewenste_levering;
private String opmerking;
private boolean afgewerkt;
private Date inserted;
private Date updated;
private int id_gebruiker;

public BestelbonHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_bestelbon = Util.Int(data[1]);
this.id_leveradres = Util.Int(data[2]);
this.id_leverancier = Util.Int(data[3]);
this.datum_bestelbon = Util.Date(data[4]);
this.datum_gewenste_levering = Util.Date(data[5]);
this.opmerking = data[6];
this.afgewerkt = Util.Boolean(data[7]);
this.inserted = Util.Date(data[8]);
this.updated = Util.Date(data[9]);
this.id_gebruiker = Util.Int(data[10]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_bestelbon() {
return this.id_bestelbon;
}
public int getId_leveradres() {
return this.id_leveradres;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public Date getDatum_bestelbon() {
return this.datum_bestelbon;
}
public Date getDatum_gewenste_levering() {
return this.datum_gewenste_levering;
}
public String getOpmerking() {
return this.opmerking;
}
public boolean getAfgewerkt() {
return this.afgewerkt;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getId_gebruiker() {
return this.id_gebruiker;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_bestelbon(int id_bestelbon){
 this.id_bestelbon=id_bestelbon;
 }
public void setId_leveradres(int id_leveradres){
 this.id_leveradres=id_leveradres;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setDatum_bestelbon(Date datum_bestelbon){
 this.datum_bestelbon=datum_bestelbon;
 }
public void setDatum_gewenste_levering(Date datum_gewenste_levering){
 this.datum_gewenste_levering=datum_gewenste_levering;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
 }
public void setAfgewerkt(boolean afgewerkt){
 this.afgewerkt=afgewerkt;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setId_gebruiker(int id_gebruiker){
 this.id_gebruiker=id_gebruiker;
 }
}