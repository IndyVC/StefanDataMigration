package Old.Klant;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class KlantBestellingStandaard implements Old { 
private int id_bedrijf;
private int id_klant;
private int dag_van_de_week;
private boolean bestelling;
private String bestelling_standaard_uur;
private boolean bestelling_standaard_levering;
private boolean bestelling_verzendbon_afdrukken;
private boolean bestelling_bestelbon_afdrukken;
private boolean bestelling_mail_bestelbon;
private String bestelling_opmerking;
private Date inserted;
private Date updated;
private boolean bestelling_mail_verzendbon;

public KlantBestellingStandaard(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_klant = Util.Int(data[1]);
this.dag_van_de_week = Util.Int(data[2]);
this.bestelling = Util.Boolean(data[3]);
this.bestelling_standaard_uur = data[4];
this.bestelling_standaard_levering = Util.Boolean(data[5]);
this.bestelling_verzendbon_afdrukken = Util.Boolean(data[6]);
this.bestelling_bestelbon_afdrukken = Util.Boolean(data[7]);
this.bestelling_mail_bestelbon = Util.Boolean(data[8]);
this.bestelling_opmerking = data[9];
this.inserted = Util.Date(data[10]);
this.updated = Util.Date(data[11]);
this.bestelling_mail_verzendbon = Util.Boolean(data[12]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_klant() {
return this.id_klant;
}
public int getDag_van_de_week() {
return this.dag_van_de_week;
}
public boolean getBestelling() {
return this.bestelling;
}
public String getBestelling_standaard_uur() {
return this.bestelling_standaard_uur;
}
public boolean getBestelling_standaard_levering() {
return this.bestelling_standaard_levering;
}
public boolean getBestelling_verzendbon_afdrukken() {
return this.bestelling_verzendbon_afdrukken;
}
public boolean getBestelling_bestelbon_afdrukken() {
return this.bestelling_bestelbon_afdrukken;
}
public boolean getBestelling_mail_bestelbon() {
return this.bestelling_mail_bestelbon;
}
public String getBestelling_opmerking() {
return this.bestelling_opmerking;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public boolean getBestelling_mail_verzendbon() {
return this.bestelling_mail_verzendbon;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setDag_van_de_week(int dag_van_de_week){
 this.dag_van_de_week=dag_van_de_week;
 }
public void setBestelling(boolean bestelling){
 this.bestelling=bestelling;
 }
public void setBestelling_standaard_uur(String bestelling_standaard_uur){
 this.bestelling_standaard_uur=bestelling_standaard_uur;
 }
public void setBestelling_standaard_levering(boolean bestelling_standaard_levering){
 this.bestelling_standaard_levering=bestelling_standaard_levering;
 }
public void setBestelling_verzendbon_afdrukken(boolean bestelling_verzendbon_afdrukken){
 this.bestelling_verzendbon_afdrukken=bestelling_verzendbon_afdrukken;
 }
public void setBestelling_bestelbon_afdrukken(boolean bestelling_bestelbon_afdrukken){
 this.bestelling_bestelbon_afdrukken=bestelling_bestelbon_afdrukken;
 }
public void setBestelling_mail_bestelbon(boolean bestelling_mail_bestelbon){
 this.bestelling_mail_bestelbon=bestelling_mail_bestelbon;
 }
public void setBestelling_opmerking(String bestelling_opmerking){
 this.bestelling_opmerking=bestelling_opmerking;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setBestelling_mail_verzendbon(boolean bestelling_mail_verzendbon){
 this.bestelling_mail_verzendbon=bestelling_mail_verzendbon;
 }
}