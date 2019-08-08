package Old;
import Utils.Util;
import java.sql.Date;

public class KlantVerdeelgroep implements Old { 
private int id_bedrijf;
private int id_klantverdeelgroep;
private String omschrijvingn;
private String omschrijvingf;
private String omschrijvinge;
private String lijst_id_verdeellijsten;
private Date inserted;
private Date updated;

public KlantVerdeelgroep(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_klantverdeelgroep = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.omschrijvinge = data[4];
this.lijst_id_verdeellijsten = data[5];
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_klantverdeelgroep() {
return this.id_klantverdeelgroep;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public String getLijst_id_verdeellijsten() {
return this.lijst_id_verdeellijsten;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_klantverdeelgroep(int id_klantverdeelgroep){
 this.id_klantverdeelgroep=id_klantverdeelgroep;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setLijst_id_verdeellijsten(String lijst_id_verdeellijsten){
 this.lijst_id_verdeellijsten=lijst_id_verdeellijsten;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}