package Old;
import Utils.Util;

public class Printer implements Old { 
private String id_werkstation;
private int id_printer;
private String locatien;
private String locatief;
private String naam;
private int type;
private int cc;
private boolean standaard_inkomende_bestelbon;
private boolean standaard_verzendbon;

public Printer(String[] data){
this.id_werkstation = data[0];
this.id_printer = Util.Int(data[1]);
this.locatien = data[2];
this.locatief = data[3];
this.naam = data[4];
this.type = Util.Int(data[5]);
this.cc = Util.Int(data[6]);
this.standaard_inkomende_bestelbon = Util.Boolean(data[7]);
this.standaard_verzendbon = Util.Boolean(data[8]);
}
public String getId_werkstation() {
return this.id_werkstation;
}
public int getId_printer() {
return this.id_printer;
}
public String getLocatien() {
return this.locatien;
}
public String getLocatief() {
return this.locatief;
}
public String getNaam() {
return this.naam;
}
public int getType() {
return this.type;
}
public int getCc() {
return this.cc;
}
public boolean getStandaard_inkomende_bestelbon() {
return this.standaard_inkomende_bestelbon;
}
public boolean getStandaard_verzendbon() {
return this.standaard_verzendbon;
}
public void setId_werkstation(String id_werkstation){
 this.id_werkstation=id_werkstation;
 }
public void setId_printer(int id_printer){
 this.id_printer=id_printer;
 }
public void setLocatien(String locatien){
 this.locatien=locatien;
 }
public void setLocatief(String locatief){
 this.locatief=locatief;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setType(int type){
 this.type=type;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setStandaard_inkomende_bestelbon(boolean standaard_inkomende_bestelbon){
 this.standaard_inkomende_bestelbon=standaard_inkomende_bestelbon;
 }
public void setStandaard_verzendbon(boolean standaard_verzendbon){
 this.standaard_verzendbon=standaard_verzendbon;
 }
}