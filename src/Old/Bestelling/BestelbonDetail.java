package Old.Bestelling;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class BestelbonDetail implements Old { 
private int id_bedrijf;
private int id_bestelbon;
private int volgnummer;
private int id_aankoopproduct;
private String referentie_product;
private double hoeveelheid;
private String eenheid;
private double eenheidsprijs;
private int id_aankoopeenheid;
private int id_verpakkingseenheid;
private int id_basiseenheid;
private int id_collieenheid;
private int id_prijseenheid;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;
private double aantal_colli_palet;
private double eenheidsgewicht;
private double totaal;
private double geleverde_hoeveelheid;
private String opmerking;
private boolean afgewerkt;
private Date inserted;
private Date updated;
private int id_receptproduct;

public BestelbonDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_bestelbon = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.id_aankoopproduct = Util.Int(data[3]);
this.referentie_product = data[4];
this.hoeveelheid = Util.Double(data[5]);
this.eenheid = data[6];
this.eenheidsprijs = Util.Double(data[7]);
this.id_aankoopeenheid = Util.Int(data[8]);
this.id_verpakkingseenheid = Util.Int(data[9]);
this.id_basiseenheid = Util.Int(data[10]);
this.id_collieenheid = Util.Int(data[11]);
this.id_prijseenheid = Util.Int(data[12]);
this.aantal_eenheden_verpakking = Util.Double(data[13]);
this.aantal_verpakkingen_colli = Util.Double(data[14]);
this.aantal_colli_palet = Util.Double(data[15]);
this.eenheidsgewicht = Util.Double(data[16]);
this.totaal = Util.Double(data[17]);
this.geleverde_hoeveelheid = Util.Double(data[18]);
this.opmerking = data[19];
this.afgewerkt = Util.Boolean(data[20]);
this.inserted = Util.Date(data[21]);
this.updated = Util.Date(data[22]);
this.id_receptproduct = Util.Int(data[23]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_bestelbon() {
return this.id_bestelbon;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public String getReferentie_product() {
return this.referentie_product;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public String getEenheid() {
return this.eenheid;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public int getId_aankoopeenheid() {
return this.id_aankoopeenheid;
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public int getId_collieenheid() {
return this.id_collieenheid;
}
public int getId_prijseenheid() {
return this.id_prijseenheid;
}
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public double getAantal_colli_palet() {
return this.aantal_colli_palet;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public double getTotaal() {
return this.totaal;
}
public double getGeleverde_hoeveelheid() {
return this.geleverde_hoeveelheid;
}
public String getOpmerking() {
return this.opmerking;
}
public boolean getAfgewerkt() {
return this.afgewerkt;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public int getId_receptproduct() {
return this.id_receptproduct;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_bestelbon(int id_bestelbon){
 this.id_bestelbon=id_bestelbon;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setReferentie_product(String referentie_product){
 this.referentie_product=referentie_product;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setEenheid(String eenheid){
 this.eenheid=eenheid;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setId_aankoopeenheid(int id_aankoopeenheid){
 this.id_aankoopeenheid=id_aankoopeenheid;
 }
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setId_collieenheid(int id_collieenheid){
 this.id_collieenheid=id_collieenheid;
 }
public void setId_prijseenheid(int id_prijseenheid){
 this.id_prijseenheid=id_prijseenheid;
 }
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
public void setAantal_colli_palet(double aantal_colli_palet){
 this.aantal_colli_palet=aantal_colli_palet;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setTotaal(double totaal){
 this.totaal=totaal;
 }
public void setGeleverde_hoeveelheid(double geleverde_hoeveelheid){
 this.geleverde_hoeveelheid=geleverde_hoeveelheid;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
 }
public void setAfgewerkt(boolean afgewerkt){
 this.afgewerkt=afgewerkt;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setId_receptproduct(int id_receptproduct){
 this.id_receptproduct=id_receptproduct;
 }
}