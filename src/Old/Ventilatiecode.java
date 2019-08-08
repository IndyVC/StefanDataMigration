package Old;
import Utils.Util;

public class Ventilatiecode implements Old { 
private int id_ventilatiecode;
private String omschrijvingn;
private String omschrijvingf;
private String codeboekhouding;
private int cc;

public Ventilatiecode(String[] data){
this.id_ventilatiecode = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.codeboekhouding = data[3];
this.cc = Util.Int(data[4]);
}
public int getId_ventilatiecode() {
return this.id_ventilatiecode;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getCodeboekhouding() {
return this.codeboekhouding;
}
public int getCc() {
return this.cc;
}
public void setId_ventilatiecode(int id_ventilatiecode){
 this.id_ventilatiecode=id_ventilatiecode;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setCodeboekhouding(String codeboekhouding){
 this.codeboekhouding=codeboekhouding;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}