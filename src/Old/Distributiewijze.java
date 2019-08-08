
package Old;
import Utils.Util;

public class Distributiewijze implements Old { 
private int id_distributiewijze;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public Distributiewijze(String[] data){
this.id_distributiewijze = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_distributiewijze() {
return this.id_distributiewijze;
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
public void setId_distributiewijze(int id_distributiewijze){
 this.id_distributiewijze=id_distributiewijze;
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
}