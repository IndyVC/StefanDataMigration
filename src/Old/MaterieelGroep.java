package Old;
import Utils.Util;
import java.sql.Date;

public class MaterieelGroep implements Old { 
private int id_bedrijf;
private int id_materieelgroep;
private String omschrijvingn;
private String omschrijvingf;
private Date inserted;
private Date updated;
private String omschrijvinge;

public MaterieelGroep(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_materieelgroep = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.omschrijvinge = data[6];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_materieelgroep() {
return this.id_materieelgroep;
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
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_materieelgroep(int id_materieelgroep){
 this.id_materieelgroep=id_materieelgroep;
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
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
}