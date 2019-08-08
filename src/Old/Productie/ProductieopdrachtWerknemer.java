package Old.Productie;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class ProductieopdrachtWerknemer implements Old { 
private int id_bedrijf;
private int id_produktieopdracht;
private int id_werknemer;
private Date inserted;
private int cc;
private int tijd;

public ProductieopdrachtWerknemer(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktieopdracht = Util.Int(data[1]);
this.id_werknemer = Util.Int(data[2]);
this.inserted = Util.Date(data[3]);
this.cc = Util.Int(data[4]);
this.tijd = Util.Int(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktieopdracht() {
return this.id_produktieopdracht;
}
public int getId_werknemer() {
return this.id_werknemer;
}
public Date getInserted() {
return this.inserted;
}
public int getCc() {
return this.cc;
}
public int getTijd() {
return this.tijd;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktieopdracht(int id_produktieopdracht){
 this.id_produktieopdracht=id_produktieopdracht;
 }
public void setId_werknemer(int id_werknemer){
 this.id_werknemer=id_werknemer;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setTijd(int tijd){
 this.tijd=tijd;
 }
}