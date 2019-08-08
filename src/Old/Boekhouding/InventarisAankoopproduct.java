package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class InventarisAankoopproduct implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private Date datum_opname;
private double hoeveelheid;
private double eenheidsprijs;
private int cc;
private int id_voorraadeenheid;
private int id_prijseenheid;
private double totaal;
private Date inserted;
private Date updated;
private int pp;
private Date houdbaar_tot;
private String lotnummer;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;

public InventarisAankoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.datum_opname = Util.Date(data[2]);
this.hoeveelheid = Util.Double(data[3]);
this.eenheidsprijs = Util.Double(data[4]);
this.cc = Util.Int(data[5]);
this.id_voorraadeenheid = Util.Int(data[6]);
this.id_prijseenheid = Util.Int(data[7]);
this.totaal = Util.Double(data[8]);
this.inserted = Util.Date(data[9]);
this.updated = Util.Date(data[10]);
this.pp = Util.Int(data[11]);
this.houdbaar_tot = Util.Date(data[12]);
this.lotnummer = data[13];
this.aantal_eenheden_verpakking = Util.Double(data[14]);
this.aantal_verpakkingen_colli = Util.Double(data[15]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public Date getDatum_opname() {
return this.datum_opname;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public int getCc() {
return this.cc;
}
public int getId_voorraadeenheid() {
return this.id_voorraadeenheid;
}
public int getId_prijseenheid() {
return this.id_prijseenheid;
}
public double getTotaal() {
return this.totaal;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
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
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setDatum_opname(Date datum_opname){
 this.datum_opname=datum_opname;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_voorraadeenheid(int id_voorraadeenheid){
 this.id_voorraadeenheid=id_voorraadeenheid;
 }
public void setId_prijseenheid(int id_prijseenheid){
 this.id_prijseenheid=id_prijseenheid;
 }
public void setTotaal(double totaal){
 this.totaal=totaal;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
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
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
}