package Old.Recept;
import Old.Old;
import Utils.Util;

public class Recepteenheid implements Old { 
private int id_recepteenheid;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private String afkortingn;
private String afkortingf;
private double omrekeningsfactor1;
private double omrekeningsfactor0;
private double omrekeningsfactor2;
private double omrekeningsfactor3;
private int id_basiseenheid;

public Recepteenheid(String[] data){
this.id_recepteenheid = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
this.afkortingn = data[4];
this.afkortingf = data[5];
this.omrekeningsfactor1 = Util.Double(data[6]);
this.omrekeningsfactor0 = Util.Double(data[7]);
this.omrekeningsfactor2 = Util.Double(data[8]);
this.omrekeningsfactor3 = Util.Double(data[9]);
this.id_basiseenheid = Util.Int(data[10]);
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getCc() {
return this.cc;
}
public String getAfkortingn() {
return this.afkortingn;
}
public String getAfkortingf() {
return this.afkortingf;
}
public double getOmrekeningsfactor1() {
return this.omrekeningsfactor1;
}
public double getOmrekeningsfactor0() {
return this.omrekeningsfactor0;
}
public double getOmrekeningsfactor2() {
return this.omrekeningsfactor2;
}
public double getOmrekeningsfactor3() {
return this.omrekeningsfactor3;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setAfkortingn(String afkortingn){
 this.afkortingn=afkortingn;
 }
public void setAfkortingf(String afkortingf){
 this.afkortingf=afkortingf;
 }
public void setOmrekeningsfactor1(double omrekeningsfactor1){
 this.omrekeningsfactor1=omrekeningsfactor1;
 }
public void setOmrekeningsfactor0(double omrekeningsfactor0){
 this.omrekeningsfactor0=omrekeningsfactor0;
 }
public void setOmrekeningsfactor2(double omrekeningsfactor2){
 this.omrekeningsfactor2=omrekeningsfactor2;
 }
public void setOmrekeningsfactor3(double omrekeningsfactor3){
 this.omrekeningsfactor3=omrekeningsfactor3;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
}