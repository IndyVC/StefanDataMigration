package Old;
import Utils.Util;

public class Origine implements Old { 
private int id_origine;
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private String inserted;
private String updated;
private int cc;
private int id_ingredientgroep;

public Origine(String[] data){
this.id_origine = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.inserted = data[4];
this.updated = data[5];
this.cc = Util.Int(data[6]);
this.id_ingredientgroep = Util.Int(data[7]);
}
public int getId_origine() {
return this.id_origine;
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
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public int getId_ingredientgroep() {
return this.id_ingredientgroep;
}
public void setId_origine(int id_origine){
 this.id_origine=id_origine;
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
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_ingredientgroep(int id_ingredientgroep){
 this.id_ingredientgroep=id_ingredientgroep;
 }
}