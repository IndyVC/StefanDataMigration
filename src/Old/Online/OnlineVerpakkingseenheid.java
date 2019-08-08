package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineVerpakkingseenheid implements Old { 
private int id_verpakkingseenheid;
private String omschrijvingn;
private String omschrijvingf;
private String afkortingn;
private String afkortingf;

public OnlineVerpakkingseenheid(String[] data){
this.id_verpakkingseenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.afkortingn = data[3];
this.afkortingf = data[4];
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getAfkortingn() {
return this.afkortingn;
}
public String getAfkortingf() {
return this.afkortingf;
}
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setAfkortingn(String afkortingn){
 this.afkortingn=afkortingn;
 }
public void setAfkortingf(String afkortingf){
 this.afkortingf=afkortingf;
 }
}