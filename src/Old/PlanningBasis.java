package Old;
import Utils.Util;
import java.sql.Date;

public class PlanningBasis implements Old { 
private int id_bedrijf;
private int id_planning_basis;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private int id_produktiegroep;
private double hoeveelheid;
private boolean volgens_voorraad;
private int id_recepteenheid;
private int aantal_personen;
private boolean maandag;
private boolean dinsdag;
private boolean woensdag;
private boolean donderdag;
private boolean vrijdag;
private boolean zaterdag;
private boolean zondag;
private int id_regelmaat;
private int vanaf_dag;
private int vanaf_maand;
private Date vanaf_datum;
private int tot_dag;
private int tot_maand;
private Date tot_datum;
private boolean periode_planning;
private boolean actief;
private Date inserted;
private Date updated;
private int cc;
private int id_periode;
private boolean blokkeren;

public PlanningBasis(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_planning_basis = Util.Int(data[1]);
this.code_eigen_fabrikaat = Util.Int(data[2]);
this.id_eigen_fabrikaat = Util.Int(data[3]);
this.id_produktiegroep = Util.Int(data[4]);
this.hoeveelheid = Util.Double(data[5]);
this.volgens_voorraad = Util.Boolean(data[6]);
this.id_recepteenheid = Util.Int(data[7]);
this.aantal_personen = Util.Int(data[8]);
this.maandag = Util.Boolean(data[9]);
this.dinsdag = Util.Boolean(data[10]);
this.woensdag = Util.Boolean(data[11]);
this.donderdag = Util.Boolean(data[12]);
this.vrijdag = Util.Boolean(data[13]);
this.zaterdag = Util.Boolean(data[14]);
this.zondag = Util.Boolean(data[15]);
this.id_regelmaat = Util.Int(data[16]);
this.vanaf_dag = Util.Int(data[17]);
this.vanaf_maand = Util.Int(data[18]);
this.vanaf_datum = Util.Date(data[19]);
this.tot_dag = Util.Int(data[20]);
this.tot_maand = Util.Int(data[21]);
this.tot_datum = Util.Date(data[22]);
this.periode_planning = Util.Boolean(data[23]);
this.actief = Util.Boolean(data[24]);
this.inserted = Util.Date(data[25]);
this.updated = Util.Date(data[26]);
this.cc = Util.Int(data[27]);
this.id_periode = Util.Int(data[28]);
this.blokkeren = Util.Boolean(data[29]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_planning_basis() {
return this.id_planning_basis;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public int getId_eigen_fabrikaat() {
return this.id_eigen_fabrikaat;
}
public int getId_produktiegroep() {
return this.id_produktiegroep;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public boolean getVolgens_voorraad() {
return this.volgens_voorraad;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public boolean getMaandag() {
return this.maandag;
}
public boolean getDinsdag() {
return this.dinsdag;
}
public boolean getWoensdag() {
return this.woensdag;
}
public boolean getDonderdag() {
return this.donderdag;
}
public boolean getVrijdag() {
return this.vrijdag;
}
public boolean getZaterdag() {
return this.zaterdag;
}
public boolean getZondag() {
return this.zondag;
}
public int getId_regelmaat() {
return this.id_regelmaat;
}
public int getVanaf_dag() {
return this.vanaf_dag;
}
public int getVanaf_maand() {
return this.vanaf_maand;
}
public Date getVanaf_datum() {
return this.vanaf_datum;
}
public int getTot_dag() {
return this.tot_dag;
}
public int getTot_maand() {
return this.tot_maand;
}
public Date getTot_datum() {
return this.tot_datum;
}
public boolean getPeriode_planning() {
return this.periode_planning;
}
public boolean getActief() {
return this.actief;
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
public int getId_periode() {
return this.id_periode;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_planning_basis(int id_planning_basis){
 this.id_planning_basis=id_planning_basis;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setId_eigen_fabrikaat(int id_eigen_fabrikaat){
 this.id_eigen_fabrikaat=id_eigen_fabrikaat;
 }
public void setId_produktiegroep(int id_produktiegroep){
 this.id_produktiegroep=id_produktiegroep;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setVolgens_voorraad(boolean volgens_voorraad){
 this.volgens_voorraad=volgens_voorraad;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setMaandag(boolean maandag){
 this.maandag=maandag;
 }
public void setDinsdag(boolean dinsdag){
 this.dinsdag=dinsdag;
 }
public void setWoensdag(boolean woensdag){
 this.woensdag=woensdag;
 }
public void setDonderdag(boolean donderdag){
 this.donderdag=donderdag;
 }
public void setVrijdag(boolean vrijdag){
 this.vrijdag=vrijdag;
 }
public void setZaterdag(boolean zaterdag){
 this.zaterdag=zaterdag;
 }
public void setZondag(boolean zondag){
 this.zondag=zondag;
 }
public void setId_regelmaat(int id_regelmaat){
 this.id_regelmaat=id_regelmaat;
 }
public void setVanaf_dag(int vanaf_dag){
 this.vanaf_dag=vanaf_dag;
 }
public void setVanaf_maand(int vanaf_maand){
 this.vanaf_maand=vanaf_maand;
 }
public void setVanaf_datum(Date vanaf_datum){
 this.vanaf_datum=vanaf_datum;
 }
public void setTot_dag(int tot_dag){
 this.tot_dag=tot_dag;
 }
public void setTot_maand(int tot_maand){
 this.tot_maand=tot_maand;
 }
public void setTot_datum(Date tot_datum){
 this.tot_datum=tot_datum;
 }
public void setPeriode_planning(boolean periode_planning){
 this.periode_planning=periode_planning;
 }
public void setActief(boolean actief){
 this.actief=actief;
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
public void setId_periode(int id_periode){
 this.id_periode=id_periode;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
}