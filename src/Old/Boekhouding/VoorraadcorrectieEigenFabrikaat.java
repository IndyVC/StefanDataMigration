package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VoorraadcorrectieEigenFabrikaat implements Old { 
private int id_bedrijf;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private Date datum;
private double hoeveelheid;
private int id_recepteenheid;
private int id_voorraadcorrectie;
private String opmerking;
private Date inserted;
private Date updated;
private int cc;
private int pp;
private Date houdbaar_tot;
private String lotnummer;
private String lotnummer_extern;
private boolean manuele_ingave;

public VoorraadcorrectieEigenFabrikaat(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.code_eigen_fabrikaat = Util.Int(data[1]);
this.id_eigen_fabrikaat = Util.Int(data[2]);
this.datum = Util.Date(data[3]);
this.hoeveelheid = Util.Double(data[4]);
this.id_recepteenheid = Util.Int(data[5]);
this.id_voorraadcorrectie = Util.Int(data[6]);
this.opmerking = data[7];
this.inserted = Util.Date(data[8]);
this.updated = Util.Date(data[9]);
this.cc = Util.Int(data[10]);
this.pp = Util.Int(data[11]);
this.houdbaar_tot = Util.Date(data[12]);
this.lotnummer = data[13];
this.lotnummer_extern = data[14];
this.manuele_ingave = Util.Boolean(data[15]);
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
public Date getDatum() {
return this.datum;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public int getId_voorraadcorrectie() {
return this.id_voorraadcorrectie;
}
public String getOpmerking() {
return this.opmerking;
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
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public boolean getManuele_ingave() {
return this.manuele_ingave;
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
public void setDatum(Date datum){
 this.datum=datum;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setId_voorraadcorrectie(int id_voorraadcorrectie){
 this.id_voorraadcorrectie=id_voorraadcorrectie;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
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
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setManuele_ingave(boolean manuele_ingave){
 this.manuele_ingave=manuele_ingave;
 }
}