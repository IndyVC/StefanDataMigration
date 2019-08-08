package Old.Percentage;
import Old.Old;
import Utils.Util;

public class PercentageWinstmarge implements Old { 
private int id_bedrijf;
private int id_winstmarge;
private String omschrijvingn;
private String omschrijvingf;
private double percentage;
private int cc;

public PercentageWinstmarge(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_winstmarge = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.percentage = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_winstmarge() {
return this.id_winstmarge;
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
public void setId_winstmarge(int id_winstmarge){
 this.id_winstmarge=id_winstmarge;
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