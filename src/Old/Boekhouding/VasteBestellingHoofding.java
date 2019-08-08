package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VasteBestellingHoofding implements Old { 
private int id_bedrijf;
private int id_vaste_bestelling;
private int id_klant_vast;
private int id_klant;
private boolean blokkeren;
private Date inserted;
private Date updated;
private int cc;
private String uur;
private Date begin_actieve_periode;
private Date einde_actieve_periode;
private Date begin_niet_actieve_periode;
private Date einde_niet_actieve_periode;
private int percentage;

public VasteBestellingHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_vaste_bestelling = Util.Int(data[1]);
this.id_klant_vast = Util.Int(data[2]);
this.id_klant = Util.Int(data[3]);
this.blokkeren = Util.Boolean(data[4]);
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.cc = Util.Int(data[7]);
this.uur = data[8];
this.begin_actieve_periode = Util.Date(data[9]);
this.einde_actieve_periode = Util.Date(data[10]);
this.begin_niet_actieve_periode = Util.Date(data[11]);
this.einde_niet_actieve_periode = Util.Date(data[12]);
this.percentage = Util.Int(data[13]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_vaste_bestelling() {
return this.id_vaste_bestelling;
}
public int getId_klant_vast() {
return this.id_klant_vast;
}
public int getId_klant() {
return this.id_klant;
}
public boolean getBlokkeren() {
return this.blokkeren;
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
public String getUur() {
return this.uur;
}
public Date getBegin_actieve_periode() {
return this.begin_actieve_periode;
}
public Date getEinde_actieve_periode() {
return this.einde_actieve_periode;
}
public Date getBegin_niet_actieve_periode() {
return this.begin_niet_actieve_periode;
}
public Date getEinde_niet_actieve_periode() {
return this.einde_niet_actieve_periode;
}
public int getPercentage() {
return this.percentage;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_vaste_bestelling(int id_vaste_bestelling){
 this.id_vaste_bestelling=id_vaste_bestelling;
 }
public void setId_klant_vast(int id_klant_vast){
 this.id_klant_vast=id_klant_vast;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
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
public void setUur(String uur){
 this.uur=uur;
 }
public void setBegin_actieve_periode(Date begin_actieve_periode){
 this.begin_actieve_periode=begin_actieve_periode;
 }
public void setEinde_actieve_periode(Date einde_actieve_periode){
 this.einde_actieve_periode=einde_actieve_periode;
 }
public void setBegin_niet_actieve_periode(Date begin_niet_actieve_periode){
 this.begin_niet_actieve_periode=begin_niet_actieve_periode;
 }
public void setEinde_niet_actieve_periode(Date einde_niet_actieve_periode){
 this.einde_niet_actieve_periode=einde_niet_actieve_periode;
 }
public void setPercentage(int percentage){
 this.percentage=percentage;
 }
}