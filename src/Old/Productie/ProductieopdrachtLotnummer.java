package Old.Productie;
import Old.Old;
import Utils.Util;

public class ProductieopdrachtLotnummer implements Old { 
private int id_bedrijf;
private int id_produktieopdracht;
private int volgnummer;
private String lotnummer;
private int cc;
private boolean gecontroleerd_lotnummer;

public ProductieopdrachtLotnummer(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktieopdracht = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.lotnummer = data[3];
this.cc = Util.Int(data[4]);
this.gecontroleerd_lotnummer = Util.Boolean(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktieopdracht() {
return this.id_produktieopdracht;
}
public int getVolgnummer() {
return this.volgnummer;
}
public String getLotnummer() {
return this.lotnummer;
}
public int getCc() {
return this.cc;
}
public boolean getGecontroleerd_lotnummer() {
return this.gecontroleerd_lotnummer;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktieopdracht(int id_produktieopdracht){
 this.id_produktieopdracht=id_produktieopdracht;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setGecontroleerd_lotnummer(boolean gecontroleerd_lotnummer){
 this.gecontroleerd_lotnummer=gecontroleerd_lotnummer;
 }
}