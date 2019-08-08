package Old.Percentage;
import Old.Old;
import Utils.Util;

public class PercentageVasteKost implements Old { 
private int id_bedrijf;
private int id_vaste_kost;
private String omschrijvingn;
private String omschrijvingf;
private double percentage_atelierkosten;
private double percentage_verkoopkosten;
private double percentage_beheerskosten;
private double percentage_andere;
private int cc;

public PercentageVasteKost(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_vaste_kost = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.percentage_atelierkosten = Util.Double(data[4]);
this.percentage_verkoopkosten = Util.Double(data[5]);
this.percentage_beheerskosten = Util.Double(data[6]);
this.percentage_andere = Util.Double(data[7]);
this.cc = Util.Int(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_vaste_kost() {
return this.id_vaste_kost;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getPercentage_atelierkosten() {
return this.percentage_atelierkosten;
}
public double getPercentage_verkoopkosten() {
return this.percentage_verkoopkosten;
}
public double getPercentage_beheerskosten() {
return this.percentage_beheerskosten;
}
public double getPercentage_andere() {
return this.percentage_andere;
}
public int getCc() {
return this.cc;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_vaste_kost(int id_vaste_kost){
 this.id_vaste_kost=id_vaste_kost;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setPercentage_atelierkosten(double percentage_atelierkosten){
 this.percentage_atelierkosten=percentage_atelierkosten;
 }
public void setPercentage_verkoopkosten(double percentage_verkoopkosten){
 this.percentage_verkoopkosten=percentage_verkoopkosten;
 }
public void setPercentage_beheerskosten(double percentage_beheerskosten){
 this.percentage_beheerskosten=percentage_beheerskosten;
 }
public void setPercentage_andere(double percentage_andere){
 this.percentage_andere=percentage_andere;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}