package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VoorraadcorrectieAankoopproduct implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private Date datum;
private double hoeveelheid;
private int id_voorraadeenheid;
private int id_voorraadcorrectie;
private String opmerking;
private Date inserted;
private Date updated;
private int cc;
private int pp;
private Date houdbaar_tot;
private String lotnummer;
private int id_eenheid;
private String lotnummer_extern;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;
private boolean manuele_ingave;

public VoorraadcorrectieAankoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.datum = Util.Date(data[2]);
this.hoeveelheid = Util.Double(data[3]);
this.id_voorraadeenheid = Util.Int(data[4]);
this.id_voorraadcorrectie = Util.Int(data[5]);
this.opmerking = data[6];
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.pp = Util.Int(data[10]);
this.houdbaar_tot = Util.Date(data[11]);
this.lotnummer = data[12];
this.id_eenheid = Util.Int(data[13]);
this.lotnummer_extern = data[14];
this.aantal_eenheden_verpakking = Util.Double(data[15]);
this.aantal_verpakkingen_colli = Util.Double(data[16]);
this.manuele_ingave = Util.Boolean(data[17]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public Date getDatum() {
return this.datum;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public int getId_voorraadeenheid() {
return this.id_voorraadeenheid;
}
public int getId_voorraadcorrectie() {
return this.id_voorraadcorrectie;
}
public String getOpmerking() {
return this.opmerking;
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
public int getPp() {
return this.pp;
}
public Date getHoudbaar_tot() {
return this.houdbaar_tot;
}
public String getLotnummer() {
return this.lotnummer;
}
public int getId_eenheid() {
return this.id_eenheid;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public boolean getManuele_ingave() {
return this.manuele_ingave;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setDatum(Date datum){
 this.datum=datum;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setId_voorraadeenheid(int id_voorraadeenheid){
 this.id_voorraadeenheid=id_voorraadeenheid;
 }
public void setId_voorraadcorrectie(int id_voorraadcorrectie){
 this.id_voorraadcorrectie=id_voorraadcorrectie;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
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
public void setPp(int pp){
 this.pp=pp;
 }
public void setHoudbaar_tot(Date houdbaar_tot){
 this.houdbaar_tot=houdbaar_tot;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setId_eenheid(int id_eenheid){
 this.id_eenheid=id_eenheid;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
public void setManuele_ingave(boolean manuele_ingave){
 this.manuele_ingave=manuele_ingave;
 }
}