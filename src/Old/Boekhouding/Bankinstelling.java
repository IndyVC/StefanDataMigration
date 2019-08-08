package Old.Boekhouding;
import Old.Old;
import Utils.Util;

public class Bankinstelling implements Old { 
private int id_bank;
private String naam;
private String bankcode;
private int cc;

public Bankinstelling(String[] data){
this.id_bank = Util.Int(data[0]);
this.naam = data[1];
this.bankcode = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_bank() {
return this.id_bank;
}
public String getNaam() {
return this.naam;
}
public String getBankcode() {
return this.bankcode;
}
public int getCc() {
return this.cc;
}
public void setId_bank(int id_bank){
 this.id_bank=id_bank;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setBankcode(String bankcode){
 this.bankcode=bankcode;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}