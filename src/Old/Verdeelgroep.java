
package Old;
import Utils.Util;
import java.sql.Date;

public class Verdeelgroep implements Old { 
private int id_bedrijf;
private int id_verdeelgroep;
private String omschrijvingn;
private String omschrijvingf;
private String omschrijvinge;
private Date inserted;
private Date updated;

public Verdeelgroep(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verdeelgroep = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.omschrijvinge = data[4];
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verdeelgroep() {
return this.id_verdeelgroep;
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
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verdeelgroep(int id_verdeelgroep){
 this.id_verdeelgroep=id_verdeelgroep;
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
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}