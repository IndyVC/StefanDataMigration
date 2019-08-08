package Old;
import Utils.Util;

public class Land implements Old { 
private int id_land;
private String naamn;
private String naamf;
private String landcode;
private String isocode;
private String maskpostcodes;
private String maskondernemingsnummers;
private String maskbanknummers;
private int cc;
private String id_convertie;

public Land(String[] data){
this.id_land = Util.Int(data[0]);
this.naamn = data[1];
this.naamf = data[2];
this.landcode = data[3];
this.isocode = data[4];
this.maskpostcodes = data[5];
this.maskondernemingsnummers = data[6];
this.maskbanknummers = data[7];
this.cc = Util.Int(data[8]);
this.id_convertie = data[9];
}
public int getId_land() {
return this.id_land;
}
public String getNaamn() {
return this.naamn;
}
public String getNaamf() {
return this.naamf;
}
public String getLandcode() {
return this.landcode;
}
public String getIsocode() {
return this.isocode;
}
public String getMaskpostcodes() {
return this.maskpostcodes;
}
public String getMaskondernemingsnummers() {
return this.maskondernemingsnummers;
}
public String getMaskbanknummers() {
return this.maskbanknummers;
}
public int getCc() {
return this.cc;
}
public String getId_convertie() {
return this.id_convertie;
}
public void setId_land(int id_land){
 this.id_land=id_land;
 }
public void setNaamn(String naamn){
 this.naamn=naamn;
 }
public void setNaamf(String naamf){
 this.naamf=naamf;
 }
public void setLandcode(String landcode){
 this.landcode=landcode;
 }
public void setIsocode(String isocode){
 this.isocode=isocode;
 }
public void setMaskpostcodes(String maskpostcodes){
 this.maskpostcodes=maskpostcodes;
 }
public void setMaskondernemingsnummers(String maskondernemingsnummers){
 this.maskondernemingsnummers=maskondernemingsnummers;
 }
public void setMaskbanknummers(String maskbanknummers){
 this.maskbanknummers=maskbanknummers;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
}