package Old;
import Utils.Util;
import java.sql.Date;

public class PeriodeInstelling implements Old { 
private int id_periode;
private int id_sub_periode;
private String omschrijvingn;
private String omschrijvingf;
private boolean wederkerend;
private Date begindatum;
private Date einddatum;
private int produktie_zoals;
private boolean produktie_maandag;
private boolean produktie_dinsdag;
private boolean produktie_woensdag;
private boolean produktie_donderdag;
private boolean produktie_vrijdag;
private boolean produktie_zaterdag;
private boolean produktie_zondag;
private boolean blokkeren;
private Date inserted;
private Date updated;
private int cc;

public PeriodeInstelling(String[] data){
this.id_periode = Util.Int(data[0]);
this.id_sub_periode = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.wederkerend = Util.Boolean(data[4]);
this.begindatum = Util.Date(data[5]);
this.einddatum = Util.Date(data[6]);
this.produktie_zoals = Util.Int(data[7]);
this.produktie_maandag = Util.Boolean(data[8]);
this.produktie_dinsdag = Util.Boolean(data[9]);
this.produktie_woensdag = Util.Boolean(data[10]);
this.produktie_donderdag = Util.Boolean(data[11]);
this.produktie_vrijdag = Util.Boolean(data[12]);
this.produktie_zaterdag = Util.Boolean(data[13]);
this.produktie_zondag = Util.Boolean(data[14]);
this.blokkeren = Util.Boolean(data[15]);
this.inserted = Util.Date(data[16]);
this.updated = Util.Date(data[17]);
this.cc = Util.Int(data[18]);
}
public int getId_periode() {
return this.id_periode;
}
public int getId_sub_periode() {
return this.id_sub_periode;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public boolean getWederkerend() {
return this.wederkerend;
}
public Date getBegindatum() {
return this.begindatum;
}
public Date getEinddatum() {
return this.einddatum;
}
public int getProduktie_zoals() {
return this.produktie_zoals;
}
public boolean getProduktie_maandag() {
return this.produktie_maandag;
}
public boolean getProduktie_dinsdag() {
return this.produktie_dinsdag;
}
public boolean getProduktie_woensdag() {
return this.produktie_woensdag;
}
public boolean getProduktie_donderdag() {
return this.produktie_donderdag;
}
public boolean getProduktie_vrijdag() {
return this.produktie_vrijdag;
}
public boolean getProduktie_zaterdag() {
return this.produktie_zaterdag;
}
public boolean getProduktie_zondag() {
return this.produktie_zondag;
}
public boolean getBlokkeren() {
return this.blokkeren;
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
public void setId_periode(int id_periode){
 this.id_periode=id_periode;
 }
public void setId_sub_periode(int id_sub_periode){
 this.id_sub_periode=id_sub_periode;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setWederkerend(boolean wederkerend){
 this.wederkerend=wederkerend;
 }
public void setBegindatum(Date begindatum){
 this.begindatum=begindatum;
 }
public void setEinddatum(Date einddatum){
 this.einddatum=einddatum;
 }
public void setProduktie_zoals(int produktie_zoals){
 this.produktie_zoals=produktie_zoals;
 }
public void setProduktie_maandag(boolean produktie_maandag){
 this.produktie_maandag=produktie_maandag;
 }
public void setProduktie_dinsdag(boolean produktie_dinsdag){
 this.produktie_dinsdag=produktie_dinsdag;
 }
public void setProduktie_woensdag(boolean produktie_woensdag){
 this.produktie_woensdag=produktie_woensdag;
 }
public void setProduktie_donderdag(boolean produktie_donderdag){
 this.produktie_donderdag=produktie_donderdag;
 }
public void setProduktie_vrijdag(boolean produktie_vrijdag){
 this.produktie_vrijdag=produktie_vrijdag;
 }
public void setProduktie_zaterdag(boolean produktie_zaterdag){
 this.produktie_zaterdag=produktie_zaterdag;
 }
public void setProduktie_zondag(boolean produktie_zondag){
 this.produktie_zondag=produktie_zondag;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
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
}