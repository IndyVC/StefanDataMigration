package Old;
import Utils.Util;

public class LandOorsprong implements Old { 
private int id_land_oorsprong;
private int id_online;
private String naamn;
private String naamf;
private String inserted;
private String updated;
private int cc;

public LandOorsprong(String[] data){
this.id_land_oorsprong = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.naamn = data[2];
this.naamf = data[3];
this.inserted = data[4];
this.updated = data[5];
this.cc = Util.Int(data[6]);
}
public int getId_land_oorsprong() {
return this.id_land_oorsprong;
}
public int getId_online() {
return this.id_online;
}
public String getNaamn() {
return this.naamn;
}
public String getNaamf() {
return this.naamf;
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
public void setId_land_oorsprong(int id_land_oorsprong){
 this.id_land_oorsprong=id_land_oorsprong;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setNaamn(String naamn){
 this.naamn=naamn;
 }
public void setNaamf(String naamf){
 this.naamf=naamf;
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