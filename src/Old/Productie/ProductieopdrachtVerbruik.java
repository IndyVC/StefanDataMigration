package Old.Productie;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class ProductieopdrachtVerbruik implements Old { 
private int id_bedrijf;
private int id_produktieopdracht;
private int volgnummer;
private int code_detail;
private int id_detail;
private double hoeveelheid;
private int id_recepteenheid;
private Date inserted;
private Date updated;
private int cc;
private Date datum_produktie;
private int pp;
private String lotnummer;
private Date tht;
private boolean gecontroleerd_lotnummer;
private int id_aankoopproduct;
private String lotnummer_extern;

public ProductieopdrachtVerbruik(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktieopdracht = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.code_detail = Util.Int(data[3]);
this.id_detail = Util.Int(data[4]);
this.hoeveelheid = Util.Double(data[5]);
this.id_recepteenheid = Util.Int(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.datum_produktie = Util.Date(data[10]);
this.pp = Util.Int(data[11]);
this.lotnummer = data[12];
this.tht = Util.Date(data[13]);
this.gecontroleerd_lotnummer = Util.Boolean(data[14]);
this.id_aankoopproduct = Util.Int(data[15]);
this.lotnummer_extern = data[16];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktieopdracht() {
return this.id_produktieopdracht;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getCode_detail() {
return this.code_detail;
}
public int getId_detail() {
return this.id_detail;
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
public Date getDatum_produktie() {
return this.datum_produktie;
}
public int getPp() {
return this.pp;
}
public String getLotnummer() {
return this.lotnummer;
}
public Date getTht() {
return this.tht;
}
public boolean getGecontroleerd_lotnummer() {
return this.gecontroleerd_lotnummer;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktieopdracht(int id_produktieopdracht){
 this.id_produktieopdracht=id_produktieopdracht;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setCode_detail(int code_detail){
 this.code_detail=code_detail;
 }
public void setId_detail(int id_detail){
 this.id_detail=id_detail;
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
public void setDatum_produktie(Date datum_produktie){
 this.datum_produktie=datum_produktie;
 }
public void setPp(int pp){
 this.pp=pp;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setTht(Date tht){
 this.tht=tht;
 }
public void setGecontroleerd_lotnummer(boolean gecontroleerd_lotnummer){
 this.gecontroleerd_lotnummer=gecontroleerd_lotnummer;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
}