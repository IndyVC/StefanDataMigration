package Old.Lotnummer;
import Old.Old;
import Utils.Util;

public class LotnummerType implements Old { 
private int id_lotnummer_type;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public LotnummerType(String[] data){
this.id_lotnummer_type = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_lotnummer_type() {
return this.id_lotnummer_type;
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
public void setId_lotnummer_type(int id_lotnummer_type){
 this.id_lotnummer_type=id_lotnummer_type;
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