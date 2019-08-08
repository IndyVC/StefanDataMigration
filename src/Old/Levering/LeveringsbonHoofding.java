package Old.Levering;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class LeveringsbonHoofding implements Old { 
private int id_bedrijf;
private int id_leveringsbon;
private int id_leverancier;
private Date datum_leveringsbon;
private String referentie;
private String id_werkstation;
private Date inserted;
private Date updated;
private int cc;
private Date factuurdatum;
private String factuurnummer;

public LeveringsbonHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leveringsbon = Util.Int(data[1]);
this.id_leverancier = Util.Int(data[2]);
this.datum_leveringsbon = Util.Date(data[3]);
this.referentie = data[4];
this.id_werkstation = data[5];
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
this.cc = Util.Int(data[8]);
this.factuurdatum = Util.Date(data[9]);
this.factuurnummer = data[10];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leveringsbon() {
return this.id_leveringsbon;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public Date getDatum_leveringsbon() {
return this.datum_leveringsbon;
}
public String getReferentie() {
return this.referentie;
}
public String getId_werkstation() {
return this.id_werkstation;
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
public Date getFactuurdatum() {
return this.factuurdatum;
}
public String getFactuurnummer() {
return this.factuurnummer;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leveringsbon(int id_leveringsbon){
 this.id_leveringsbon=id_leveringsbon;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setDatum_leveringsbon(Date datum_leveringsbon){
 this.datum_leveringsbon=datum_leveringsbon;
 }
public void setReferentie(String referentie){
 this.referentie=referentie;
 }
public void setId_werkstation(String id_werkstation){
 this.id_werkstation=id_werkstation;
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
public void setFactuurdatum(Date factuurdatum){
 this.factuurdatum=factuurdatum;
 }
public void setFactuurnummer(String factuurnummer){
 this.factuurnummer=factuurnummer;
 }
}