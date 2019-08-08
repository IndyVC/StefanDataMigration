package Old.Levering;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Leveringstemperatuur implements Old { 
private int id_leveringstemperatuur;
private String omschrijvingn;
private String omschrijvingf;
private double leveringstemperatuur;
private int cc;
private int id_online;
private Date inserted;
private Date updated;

public Leveringstemperatuur(String[] data){
this.id_leveringstemperatuur = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.leveringstemperatuur = Util.Double(data[3]);
this.cc = Util.Int(data[4]);
this.id_online = Util.Int(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
}
public int getId_leveringstemperatuur() {
return this.id_leveringstemperatuur;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getLeveringstemperatuur() {
return this.leveringstemperatuur;
}
public int getCc() {
return this.cc;
}
public int getId_online() {
return this.id_online;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_leveringstemperatuur(int id_leveringstemperatuur){
 this.id_leveringstemperatuur=id_leveringstemperatuur;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setLeveringstemperatuur(double leveringstemperatuur){
 this.leveringstemperatuur=leveringstemperatuur;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}