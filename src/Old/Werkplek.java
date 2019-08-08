package Old;
import Utils.Util;
import java.sql.Date;

public class Werkplek implements Old { 
private int id_bedrijf;
private int id_werkplek;
private String omschrijvingn;
private String omschrijvingf;
private Date inserted;
private Date updated;
private int cc;
private String omschrijvinge;
private boolean blokkeren;

public Werkplek(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_werkplek = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.cc = Util.Int(data[6]);
this.omschrijvinge = data[7];
this.blokkeren = Util.Boolean(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_werkplek() {
return this.id_werkplek;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
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
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_werkplek(int id_werkplek){
 this.id_werkplek=id_werkplek;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
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
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
}