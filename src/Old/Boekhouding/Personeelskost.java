package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Personeelskost implements Old { 
private int id_bedrijf;
private int jaar;
private int id_uitvoerend_persoon;
private String omschrijvingn;
private String omschrijvingf;
private double bedrag_per_uur;
private Date inserted;
private Date updated;

public Personeelskost(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.jaar = Util.Int(data[1]);
this.id_uitvoerend_persoon = Util.Int(data[2]);
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.bedrag_per_uur = Util.Double(data[5]);
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getJaar() {
return this.jaar;
}
public int getId_uitvoerend_persoon() {
return this.id_uitvoerend_persoon;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public double getBedrag_per_uur() {
return this.bedrag_per_uur;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setJaar(int jaar){
 this.jaar=jaar;
 }
public void setId_uitvoerend_persoon(int id_uitvoerend_persoon){
 this.id_uitvoerend_persoon=id_uitvoerend_persoon;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setBedrag_per_uur(double bedrag_per_uur){
 this.bedrag_per_uur=bedrag_per_uur;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}