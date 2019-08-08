package Old.Percentage;
import Old.Old;
import Utils.Util;

public class PercentageOnrechtstreekseProductiekost implements Old { 
private int id_bedrijf;
private int id_onrechtstreekse_produktiekost;
private String omschrijvingn;
private String omschrijvingf;
private double percentage;
private int cc;

public PercentageOnrechtstreekseProductiekost(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_onrechtstreekse_produktiekost = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.percentage = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_onrechtstreekse_produktiekost() {
return this.id_onrechtstreekse_produktiekost;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getPercentage() {
return this.percentage;
}
public int getCc() {
return this.cc;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_onrechtstreekse_produktiekost(int id_onrechtstreekse_produktiekost){
 this.id_onrechtstreekse_produktiekost=id_onrechtstreekse_produktiekost;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}