package Old.Weegschaal;
import Old.Old;
import Utils.Util;

public class Weegschaal implements Old { 
private int id_bedrijf;
private int id_weegschaal;
private int id_weegschaalmodel;
private String omschrijvingn;
private String omschrijvingf;
private boolean tcp_weegschaal;
private String netwerkadres;
private int netwerkpoort;
private double maximaal_meetgewicht;

public Weegschaal(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_weegschaal = Util.Int(data[1]);
this.id_weegschaalmodel = Util.Int(data[2]);
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.tcp_weegschaal = Util.Boolean(data[5]);
this.netwerkadres = data[6];
this.netwerkpoort = Util.Int(data[7]);
this.maximaal_meetgewicht = Util.Double(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_weegschaal() {
return this.id_weegschaal;
}
public int getId_weegschaalmodel() {
return this.id_weegschaalmodel;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public boolean getTcp_weegschaal() {
return this.tcp_weegschaal;
}
public String getNetwerkadres() {
return this.netwerkadres;
}
public int getNetwerkpoort() {
return this.netwerkpoort;
}
public double getMaximaal_meetgewicht() {
return this.maximaal_meetgewicht;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_weegschaal(int id_weegschaal){
 this.id_weegschaal=id_weegschaal;
 }
public void setId_weegschaalmodel(int id_weegschaalmodel){
 this.id_weegschaalmodel=id_weegschaalmodel;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setTcp_weegschaal(boolean tcp_weegschaal){
 this.tcp_weegschaal=tcp_weegschaal;
 }
public void setNetwerkadres(String netwerkadres){
 this.netwerkadres=netwerkadres;
 }
public void setNetwerkpoort(int netwerkpoort){
 this.netwerkpoort=netwerkpoort;
 }
public void setMaximaal_meetgewicht(double maximaal_meetgewicht){
 this.maximaal_meetgewicht=maximaal_meetgewicht;
 }
}