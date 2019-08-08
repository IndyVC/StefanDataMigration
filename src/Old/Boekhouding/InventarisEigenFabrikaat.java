package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class InventarisEigenFabrikaat implements Old { 
private int id_bedrijf;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private Date datum_opname;
private double hoeveelheid;
private int id_recepteenheid;
private Date inserted;
private Date updated;
private int cc;
private int pp;
private Date houdbaar_tot;
private String lotnummer;

public InventarisEigenFabrikaat(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.code_eigen_fabrikaat = Util.Int(data[1]);
this.id_eigen_fabrikaat = Util.Int(data[2]);
this.datum_opname = Util.Date(data[3]);
this.hoeveelheid = Util.Double(data[4]);
this.id_recepteenheid = Util.Int(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
this.cc = Util.Int(data[8]);
this.pp = Util.Int(data[9]);
this.houdbaar_tot = Util.Date(data[10]);
this.lotnummer = data[11];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public int getId_eigen_fabrikaat() {
return this.id_eigen_fabrikaat;
}
public Date getDatum_opname() {
return this.datum_opname;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
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
public int getPp() {
return this.pp;
}
public Date getHoudbaar_tot() {
return this.houdbaar_tot;
}
public String getLotnummer() {
return this.lotnummer;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setId_eigen_fabrikaat(int id_eigen_fabrikaat){
 this.id_eigen_fabrikaat=id_eigen_fabrikaat;
 }
public void setDatum_opname(Date datum_opname){
 this.datum_opname=datum_opname;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
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
public void setPp(int pp){
 this.pp=pp;
 }
public void setHoudbaar_tot(Date houdbaar_tot){
 this.houdbaar_tot=houdbaar_tot;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
}