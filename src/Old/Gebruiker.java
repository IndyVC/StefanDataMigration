package Old;
import Utils.Util;

public class Gebruiker implements Old { 
private int id_gebruiker;
private String naam;
private int id_taalcode;
private String paswoord;
private int id_toegangsniveau;
private int cc;
private int id_leveradres;
private String emailadres;

public Gebruiker(String[] data){
this.id_gebruiker = Util.Int(data[0]);
this.naam = data[1];
this.id_taalcode = Util.Int(data[2]);
this.paswoord = data[3];
this.id_toegangsniveau = Util.Int(data[4]);
this.cc = Util.Int(data[5]);
this.id_leveradres = Util.Int(data[6]);
this.emailadres = data[7];
}
public int getId_gebruiker() {
return this.id_gebruiker;
}
public String getNaam() {
return this.naam;
}
public int getId_taalcode() {
return this.id_taalcode;
}
public String getPaswoord() {
return this.paswoord;
}
public int getId_toegangsniveau() {
return this.id_toegangsniveau;
}
public int getCc() {
return this.cc;
}
public int getId_leveradres() {
return this.id_leveradres;
}
public String getEmailadres() {
return this.emailadres;
}
public void setId_gebruiker(int id_gebruiker){
 this.id_gebruiker=id_gebruiker;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setId_taalcode(int id_taalcode){
 this.id_taalcode=id_taalcode;
 }
public void setPaswoord(String paswoord){
 this.paswoord=paswoord;
 }
public void setId_toegangsniveau(int id_toegangsniveau){
 this.id_toegangsniveau=id_toegangsniveau;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_leveradres(int id_leveradres){
 this.id_leveradres=id_leveradres;
 }
public void setEmailadres(String emailadres){
 this.emailadres=emailadres;
 }
}