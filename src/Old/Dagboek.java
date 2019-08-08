package Old;
import Utils.Util;

public class Dagboek implements Old { 
private int id_dagboek;
private String omschrijvingn;
private String omschrijvingf;
private String codeboekhouding;
private int cc;
private int id_leveranciersrekening;
private int id_kortingContant;

public Dagboek(String[] data){
this.id_dagboek = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.codeboekhouding = data[3];
this.cc = Util.Int(data[4]);
this.id_leveranciersrekening = Util.Int(data[5]);
this.id_kortingContant = Util.Int(data[6]);
}
public int getId_dagboek() {
return this.id_dagboek;
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
public int getId_leveranciersrekening() {
return this.id_leveranciersrekening;
}
public int getId_kortingContant() {
return this.id_kortingContant;
}
public void setId_dagboek(int id_dagboek){
 this.id_dagboek=id_dagboek;
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
public void setId_leveranciersrekening(int id_leveranciersrekening){
 this.id_leveranciersrekening=id_leveranciersrekening;
 }
public void setId_kortingContant(int id_kortingContant){
 this.id_kortingContant=id_kortingContant;
 }
}