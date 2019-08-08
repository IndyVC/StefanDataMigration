package Old.Nutrionele;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class NutrioneleEenheid implements Old { 
private int id_nutrionele_eenheid;
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private String afkorting;
private Date inserted;
private Date updated;
private int cc;

public NutrioneleEenheid(String[] data){
this.id_nutrionele_eenheid = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.afkorting = data[4];
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.cc = Util.Int(data[7]);
}
public int getId_nutrionele_eenheid() {
return this.id_nutrionele_eenheid;
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
public String getAfkorting() {
return this.afkorting;
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
public void setId_nutrionele_eenheid(int id_nutrionele_eenheid){
 this.id_nutrionele_eenheid=id_nutrionele_eenheid;
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
public void setAfkorting(String afkorting){
 this.afkorting=afkorting;
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