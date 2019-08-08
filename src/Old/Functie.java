package Old;
import Utils.Util;
import java.sql.Date;

public class Functie implements Old { 
private int id_functie;
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private Date inserted;
private Date updated;
private int cc;

public Functie(String[] data){
this.id_functie = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.cc = Util.Int(data[6]);
}
public int getId_functie() {
return this.id_functie;
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
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public void setId_functie(int id_functie){
 this.id_functie=id_functie;
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