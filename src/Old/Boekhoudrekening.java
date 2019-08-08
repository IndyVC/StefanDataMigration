package Old;
import Utils.Util;

public class Boekhoudrekening implements Old { 
private int id_type;
private int id_boekhoudrekening;
private String omschrijvingn;
private String omschrijvingf;
private String boekhoudrekening;
private int cc;
private boolean is_aankoop;
private boolean is_korting;
private boolean is_diverse;
private boolean is_btw;
private boolean hoeveelheid_verplicht;

public Boekhoudrekening(String[] data){
this.id_type = Util.Int(data[0]);
this.id_boekhoudrekening = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.boekhoudrekening = data[4];
this.cc = Util.Int(data[5]);
this.is_aankoop = Util.Boolean(data[6]);
this.is_korting = Util.Boolean(data[7]);
this.is_diverse = Util.Boolean(data[8]);
this.is_btw = Util.Boolean(data[9]);
this.hoeveelheid_verplicht = Util.Boolean(data[10]);
}
public int getId_type() {
return this.id_type;
}
public int getId_boekhoudrekening() {
return this.id_boekhoudrekening;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getBoekhoudrekening() {
return this.boekhoudrekening;
}
public int getCc() {
return this.cc;
}
public boolean getIs_aankoop() {
return this.is_aankoop;
}
public boolean getIs_korting() {
return this.is_korting;
}
public boolean getIs_diverse() {
return this.is_diverse;
}
public boolean getIs_btw() {
return this.is_btw;
}
public boolean getHoeveelheid_verplicht() {
return this.hoeveelheid_verplicht;
}
public void setId_type(int id_type){
 this.id_type=id_type;
 }
public void setId_boekhoudrekening(int id_boekhoudrekening){
 this.id_boekhoudrekening=id_boekhoudrekening;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setBoekhoudrekening(String boekhoudrekening){
 this.boekhoudrekening=boekhoudrekening;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setIs_aankoop(boolean is_aankoop){
 this.is_aankoop=is_aankoop;
 }
public void setIs_korting(boolean is_korting){
 this.is_korting=is_korting;
 }
public void setIs_diverse(boolean is_diverse){
 this.is_diverse=is_diverse;
 }
public void setIs_btw(boolean is_btw){
 this.is_btw=is_btw;
 }
public void setHoeveelheid_verplicht(boolean hoeveelheid_verplicht){
 this.hoeveelheid_verplicht=hoeveelheid_verplicht;
 }
}