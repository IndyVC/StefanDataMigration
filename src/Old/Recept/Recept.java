package Old.Recept;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Recept implements Old { 
private int id_bedrijf;
private int code_header;
private int id_header;
private int code_detail;
private int id_detail;
private double hoeveelheid;
private double percentage;
private Date inserted;
private Date updated;
private int cc;
private int volgnummer;
private boolean hulpstof;
private boolean telbasis;
private int aantal_personen;

public Recept(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.code_header = Util.Int(data[1]);
this.id_header = Util.Int(data[2]);
this.code_detail = Util.Int(data[3]);
this.id_detail = Util.Int(data[4]);
this.hoeveelheid = Util.Double(data[5]);
this.percentage = Util.Double(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.volgnummer = Util.Int(data[10]);
this.hulpstof = Util.Boolean(data[11]);
this.telbasis = Util.Boolean(data[12]);
this.aantal_personen = Util.Int(data[13]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getCode_header() {
return this.code_header;
}
public int getId_header() {
return this.id_header;
}
public int getCode_detail() {
return this.code_detail;
}
public int getId_detail() {
return this.id_detail;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public double getPercentage() {
return this.percentage;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public int getVolgnummer() {
return this.volgnummer;
}
public boolean getHulpstof() {
return this.hulpstof;
}
public boolean getTelbasis() {
return this.telbasis;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setCode_header(int code_header){
 this.code_header=code_header;
 }
public void setId_header(int id_header){
 this.id_header=id_header;
 }
public void setCode_detail(int code_detail){
 this.code_detail=code_detail;
 }
public void setId_detail(int id_detail){
 this.id_detail=id_detail;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setHulpstof(boolean hulpstof){
 this.hulpstof=hulpstof;
 }
public void setTelbasis(boolean telbasis){
 this.telbasis=telbasis;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
}