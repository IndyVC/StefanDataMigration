package Old.Etiket;
import Old.Old;
import Utils.Util;

public class Etiket implements Old { 
private int id_etiket;
private String omschrijvingn;
private String omschrijvingf;
private String naam;
private int cc;
private int tool;
private boolean verpakking;
private boolean aankoop;
private boolean voorraad;
private boolean verbruik;
private boolean prijskaartje;

public Etiket(String[] data){
this.id_etiket = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.naam = data[3];
this.cc = Util.Int(data[4]);
this.tool = Util.Int(data[5]);
this.verpakking = Util.Boolean(data[6]);
this.aankoop = Util.Boolean(data[7]);
this.voorraad = Util.Boolean(data[8]);
this.verbruik = Util.Boolean(data[9]);
this.prijskaartje = Util.Boolean(data[10]);
}
public int getId_etiket() {
return this.id_etiket;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getNaam() {
return this.naam;
}
public int getCc() {
return this.cc;
}
public int getTool() {
return this.tool;
}
public boolean getVerpakking() {
return this.verpakking;
}
public boolean getAankoop() {
return this.aankoop;
}
public boolean getVoorraad() {
return this.voorraad;
}
public boolean getVerbruik() {
return this.verbruik;
}
public boolean getPrijskaartje() {
return this.prijskaartje;
}
public void setId_etiket(int id_etiket){
 this.id_etiket=id_etiket;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setTool(int tool){
 this.tool=tool;
 }
public void setVerpakking(boolean verpakking){
 this.verpakking=verpakking;
 }
public void setAankoop(boolean aankoop){
 this.aankoop=aankoop;
 }
public void setVoorraad(boolean voorraad){
 this.voorraad=voorraad;
 }
public void setVerbruik(boolean verbruik){
 this.verbruik=verbruik;
 }
public void setPrijskaartje(boolean prijskaartje){
 this.prijskaartje=prijskaartje;
 }
}