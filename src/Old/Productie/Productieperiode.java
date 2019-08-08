package Old.Productie;
import Old.Old;
import Utils.Util;

public class Productieperiode implements Old { 
private int id_produktieperiode;
private String omschrijvingn;
private String omschrijvingf;
private int extra_dagen;
private int extra_maanden;

public Productieperiode(String[] data){
this.id_produktieperiode = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.extra_dagen = Util.Int(data[3]);
this.extra_maanden = Util.Int(data[4]);
}
public int getId_produktieperiode() {
return this.id_produktieperiode;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getExtra_dagen() {
return this.extra_dagen;
}
public int getExtra_maanden() {
return this.extra_maanden;
}
public void setId_produktieperiode(int id_produktieperiode){
 this.id_produktieperiode=id_produktieperiode;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setExtra_dagen(int extra_dagen){
 this.extra_dagen=extra_dagen;
 }
public void setExtra_maanden(int extra_maanden){
 this.extra_maanden=extra_maanden;
 }
}