package Old;
import Utils.Util;
import java.sql.Date;

public class EigenFabrikaatInGebruik implements Old { 
private int id_bedrijf;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private Date in_gebruik;
private int id_gebruik;
private String lotnummer;
private Date datum_houdbaarheid;
private boolean tonen;
private Date inserted;
private Date updated;
private double hoeveelheid_in_gebruik;
private int pp;
private String lotnummer_extern;
private boolean manuele_ingave;

public EigenFabrikaatInGebruik(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.code_eigen_fabrikaat = Util.Int(data[1]);
this.id_eigen_fabrikaat = Util.Int(data[2]);
this.in_gebruik = Util.Date(data[3]);
this.id_gebruik = Util.Int(data[4]);
this.lotnummer = data[5];
this.datum_houdbaarheid = Util.Date(data[6]);
this.tonen = Util.Boolean(data[7]);
this.inserted = Util.Date(data[8]);
this.updated = Util.Date(data[9]);
this.hoeveelheid_in_gebruik = Util.Double(data[10]);
this.pp = Util.Int(data[11]);
this.lotnummer_extern = data[12];
this.manuele_ingave = Util.Boolean(data[13]);
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
public Date getIn_gebruik() {
return this.in_gebruik;
}
public int getId_gebruik() {
return this.id_gebruik;
}
public String getLotnummer() {
return this.lotnummer;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public boolean getTonen() {
return this.tonen;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public double getHoeveelheid_in_gebruik() {
return this.hoeveelheid_in_gebruik;
}
public int getPp() {
return this.pp;
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
public void setIn_gebruik(Date in_gebruik){
 this.in_gebruik=in_gebruik;
 }
public void setId_gebruik(int id_gebruik){
 this.id_gebruik=id_gebruik;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setTonen(boolean tonen){
 this.tonen=tonen;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setHoeveelheid_in_gebruik(double hoeveelheid_in_gebruik){
 this.hoeveelheid_in_gebruik=hoeveelheid_in_gebruik;
 }
public void setPp(int pp){
 this.pp=pp;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setManuele_ingave(boolean manuele_ingave){
 this.manuele_ingave=manuele_ingave;
 }
}