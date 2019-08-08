package Old.Allergeen;
import Old.Old;
import Utils.Util;

public class Allergeen implements Old { 
private int id_allergeen;
private String omschrijvingn;
private String omschrijvingf;
private int id_allergeengroep;
private int type;
private int cc;
private int id_online;
private String inserted;
private String updated;
private String omschrijvingn_etiketten;
private String omschrijvingf_etiketten;

public Allergeen(String[] data){
this.id_allergeen = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_allergeengroep = Util.Int(data[3]);
this.type = Util.Int(data[4]);
this.cc = Util.Int(data[5]);
this.id_online = Util.Int(data[6]);
this.inserted = data[7];
this.updated = data[8];
this.omschrijvingn_etiketten = data[9];
this.omschrijvingf_etiketten = data[10];
}
public int getId_allergeen() {
return this.id_allergeen;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_allergeengroep() {
return this.id_allergeengroep;
}
public int getType() {
return this.type;
}
public int getCc() {
return this.cc;
}
public int getId_online() {
return this.id_online;
}
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public String getOmschrijvingn_etiketten() {
return this.omschrijvingn_etiketten;
}
public String getOmschrijvingf_etiketten() {
return this.omschrijvingf_etiketten;
}
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_allergeengroep(int id_allergeengroep){
 this.id_allergeengroep=id_allergeengroep;
 }
public void setType(int type){
 this.type=type;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setOmschrijvingn_etiketten(String omschrijvingn_etiketten){
 this.omschrijvingn_etiketten=omschrijvingn_etiketten;
 }
public void setOmschrijvingf_etiketten(String omschrijvingf_etiketten){
 this.omschrijvingf_etiketten=omschrijvingf_etiketten;
 }
}