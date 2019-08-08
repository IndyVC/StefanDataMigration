package Old.Log;
import Old.Old;
import Utils.Util;

public class LogVerwerkteFile implements Old { 
private int id_bedrijf;
private String bestandsnaam;
private String verwerkingsmoment;

public LogVerwerkteFile(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.bestandsnaam = data[1];
this.verwerkingsmoment = data[2];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public String getBestandsnaam() {
return this.bestandsnaam;
}
public String getVerwerkingsmoment() {
return this.verwerkingsmoment;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setBestandsnaam(String bestandsnaam){
 this.bestandsnaam=bestandsnaam;
 }
public void setVerwerkingsmoment(String verwerkingsmoment){
 this.verwerkingsmoment=verwerkingsmoment;
 }
}