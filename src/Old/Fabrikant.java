package Old;
import Utils.Util;

public class Fabrikant implements Old { 
private int id_fabrikant;
private int id_online;
private String naam;
private String inserted;
private String updated;
private int cc;

public Fabrikant(String[] data){
this.id_fabrikant = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.naam = data[2];
this.inserted = data[3];
this.updated = data[4];
this.cc = Util.Int(data[5]);
}
public int getId_fabrikant() {
return this.id_fabrikant;
}
public int getId_online() {
return this.id_online;
}
public String getNaam() {
return this.naam;
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
public void setId_fabrikant(int id_fabrikant){
 this.id_fabrikant=id_fabrikant;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setNaam(String naam){
 this.naam=naam;
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
}