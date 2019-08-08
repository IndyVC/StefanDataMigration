package Old.Nutrionele;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class NutrioneleInformatieDetail implements Old { 
private int id_nutrionele_informatie_header;
private int id_nutrionele_informatie_detail;
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private double basishoeveelheid;
private int id_nutrionele_eenheid;
private Date inserted;
private Date updated;
private int cc;
private boolean wettelijk;
private int vak;

public NutrioneleInformatieDetail(String[] data){
this.id_nutrionele_informatie_header = Util.Int(data[0]);
this.id_nutrionele_informatie_detail = Util.Int(data[1]);
this.id_online = Util.Int(data[2]);
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.basishoeveelheid = Util.Double(data[5]);
this.id_nutrionele_eenheid = Util.Int(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.wettelijk = Util.Boolean(data[10]);
this.vak = Util.Int(data[11]);
}
public int getId_nutrionele_informatie_header() {
return this.id_nutrionele_informatie_header;
}
public int getId_nutrionele_informatie_detail() {
return this.id_nutrionele_informatie_detail;
}
public int getId_online() {
return this.id_online;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getBasishoeveelheid() {
return this.basishoeveelheid;
}
public int getId_nutrionele_eenheid() {
return this.id_nutrionele_eenheid;
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
public boolean getWettelijk() {
return this.wettelijk;
}
public int getVak() {
return this.vak;
}
public void setId_nutrionele_informatie_header(int id_nutrionele_informatie_header){
 this.id_nutrionele_informatie_header=id_nutrionele_informatie_header;
 }
public void setId_nutrionele_informatie_detail(int id_nutrionele_informatie_detail){
 this.id_nutrionele_informatie_detail=id_nutrionele_informatie_detail;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setBasishoeveelheid(double basishoeveelheid){
 this.basishoeveelheid=basishoeveelheid;
 }
public void setId_nutrionele_eenheid(int id_nutrionele_eenheid){
 this.id_nutrionele_eenheid=id_nutrionele_eenheid;
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
public void setWettelijk(boolean wettelijk){
 this.wettelijk=wettelijk;
 }
public void setVak(int vak){
 this.vak=vak;
 }
}