package Old.Lotnummer;
import Old.Old;
import Utils.Util;

public class LotnummerAanbrenger implements Old { 
private int id_lotnummer_aanbrenger;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public LotnummerAanbrenger(String[] data){
this.id_lotnummer_aanbrenger = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_lotnummer_aanbrenger() {
return this.id_lotnummer_aanbrenger;
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
public void setId_lotnummer_aanbrenger(int id_lotnummer_aanbrenger){
 this.id_lotnummer_aanbrenger=id_lotnummer_aanbrenger;
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