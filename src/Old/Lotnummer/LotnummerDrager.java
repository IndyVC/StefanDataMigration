package Old.Lotnummer;
import Old.Old;
import Utils.Util;

public class LotnummerDrager implements Old { 
private int id_lotnummer_drager;
private String omschrijvingn;
private String omschrijvingf;
private int cc;

public LotnummerDrager(String[] data){
this.id_lotnummer_drager = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.cc = Util.Int(data[3]);
}
public int getId_lotnummer_drager() {
return this.id_lotnummer_drager;
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
public void setId_lotnummer_drager(int id_lotnummer_drager){
 this.id_lotnummer_drager=id_lotnummer_drager;
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

    public Object[] getId_lotnummer_type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}