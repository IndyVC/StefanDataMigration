package Old.Productie;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class RechtstreekseProductiekost implements Old { 
private int id_bedrijf;
private int id_rechtstreekse_produktiekost;
private String id_convertie;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private double kostprijs1;
private Date inserted;
private Date updated;
private int cc;
private int id_recepteenheid;
private boolean tijdsduur_afhankelijk_van_hoeveelheid;
private double kostprijs2;
private double kostprijs3;
private double kostprijs4;
private double kostprijs5;
private double kostprijs6;
private double kostprijs7;
private double kostprijs8;
private double kostprijs9;
private int id_uitvoerend_persoon;
private int standaard_tijd;
private String omschrijvinge;
private int id_soort;
private boolean blokkeren;
private String lijst_taken;
private int id_jobgroep;

public RechtstreekseProductiekost(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_rechtstreekse_produktiekost = Util.Int(data[1]);
this.id_convertie = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.zoekomschrijving = data[5];
this.kostprijs1 = Util.Double(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.id_recepteenheid = Util.Int(data[10]);
this.tijdsduur_afhankelijk_van_hoeveelheid = Util.Boolean(data[11]);
this.kostprijs2 = Util.Double(data[12]);
this.kostprijs3 = Util.Double(data[13]);
this.kostprijs4 = Util.Double(data[14]);
this.kostprijs5 = Util.Double(data[15]);
this.kostprijs6 = Util.Double(data[16]);
this.kostprijs7 = Util.Double(data[17]);
this.kostprijs8 = Util.Double(data[18]);
this.kostprijs9 = Util.Double(data[19]);
this.id_uitvoerend_persoon = Util.Int(data[20]);
this.standaard_tijd = Util.Int(data[21]);
this.omschrijvinge = data[22];
this.id_soort = Util.Int(data[23]);
this.blokkeren = Util.Boolean(data[24]);
this.lijst_taken = data[25];
this.id_jobgroep = Util.Int(data[26]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_rechtstreekse_produktiekost() {
return this.id_rechtstreekse_produktiekost;
}
public String getId_convertie() {
return this.id_convertie;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public double getKostprijs1() {
return this.kostprijs1;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public boolean getTijdsduur_afhankelijk_van_hoeveelheid() {
return this.tijdsduur_afhankelijk_van_hoeveelheid;
}
public double getKostprijs2() {
return this.kostprijs2;
}
public double getKostprijs3() {
return this.kostprijs3;
}
public double getKostprijs4() {
return this.kostprijs4;
}
public double getKostprijs5() {
return this.kostprijs5;
}
public double getKostprijs6() {
return this.kostprijs6;
}
public double getKostprijs7() {
return this.kostprijs7;
}
public double getKostprijs8() {
return this.kostprijs8;
}
public double getKostprijs9() {
return this.kostprijs9;
}
public int getId_uitvoerend_persoon() {
return this.id_uitvoerend_persoon;
}
public int getStandaard_tijd() {
return this.standaard_tijd;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public int getId_soort() {
return this.id_soort;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public String getLijst_taken() {
return this.lijst_taken;
}
public int getId_jobgroep() {
return this.id_jobgroep;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_rechtstreekse_produktiekost(int id_rechtstreekse_produktiekost){
 this.id_rechtstreekse_produktiekost=id_rechtstreekse_produktiekost;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setKostprijs1(double kostprijs1){
 this.kostprijs1=kostprijs1;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setTijdsduur_afhankelijk_van_hoeveelheid(boolean tijdsduur_afhankelijk_van_hoeveelheid){
 this.tijdsduur_afhankelijk_van_hoeveelheid=tijdsduur_afhankelijk_van_hoeveelheid;
 }
public void setKostprijs2(double kostprijs2){
 this.kostprijs2=kostprijs2;
 }
public void setKostprijs3(double kostprijs3){
 this.kostprijs3=kostprijs3;
 }
public void setKostprijs4(double kostprijs4){
 this.kostprijs4=kostprijs4;
 }
public void setKostprijs5(double kostprijs5){
 this.kostprijs5=kostprijs5;
 }
public void setKostprijs6(double kostprijs6){
 this.kostprijs6=kostprijs6;
 }
public void setKostprijs7(double kostprijs7){
 this.kostprijs7=kostprijs7;
 }
public void setKostprijs8(double kostprijs8){
 this.kostprijs8=kostprijs8;
 }
public void setKostprijs9(double kostprijs9){
 this.kostprijs9=kostprijs9;
 }
public void setId_uitvoerend_persoon(int id_uitvoerend_persoon){
 this.id_uitvoerend_persoon=id_uitvoerend_persoon;
 }
public void setStandaard_tijd(int standaard_tijd){
 this.standaard_tijd=standaard_tijd;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setId_soort(int id_soort){
 this.id_soort=id_soort;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setLijst_taken(String lijst_taken){
 this.lijst_taken=lijst_taken;
 }
public void setId_jobgroep(int id_jobgroep){
 this.id_jobgroep=id_jobgroep;
 }
}