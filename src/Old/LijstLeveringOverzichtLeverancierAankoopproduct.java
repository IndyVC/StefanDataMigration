package Old;
import Utils.Util;
import java.sql.Date;

public class LijstLeveringOverzichtLeverancierAankoopproduct implements Old { 
private int id_bedrijf;
private int id_leveringsbon;
private int volgnummer;
private int id_leverancier;
private int id_aankoopproduct;
private String referentie_product;
private double hoeveelheid;
private String afkorting_aankoopeenheid;
private double eenheidsprijs;
private String afkorting_prijseenheid;
private double totaal;
private Date datum_leveringsbon;
private double leveringstemperatuur;
private Date datum_houdbaarheid;
private String lotnummer;

public LijstLeveringOverzichtLeverancierAankoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leveringsbon = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.id_leverancier = Util.Int(data[3]);
this.id_aankoopproduct = Util.Int(data[4]);
this.referentie_product = data[5];
this.hoeveelheid = Util.Double(data[6]);
this.afkorting_aankoopeenheid = data[7];
this.eenheidsprijs = Util.Double(data[8]);
this.afkorting_prijseenheid = data[9];
this.totaal = Util.Double(data[10]);
this.datum_leveringsbon = Util.Date(data[11]);
this.leveringstemperatuur = Util.Double(data[12]);
this.datum_houdbaarheid = Util.Date(data[13]);
this.lotnummer = data[14];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leveringsbon() {
return this.id_leveringsbon;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getId_leverancier() {
return this.id_leverancier;
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
public String getAfkorting_aankoopeenheid() {
return this.afkorting_aankoopeenheid;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public String getAfkorting_prijseenheid() {
return this.afkorting_prijseenheid;
}
public double getTotaal() {
return this.totaal;
}
public Date getDatum_leveringsbon() {
return this.datum_leveringsbon;
}
public double getLeveringstemperatuur() {
return this.leveringstemperatuur;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public String getLotnummer() {
return this.lotnummer;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leveringsbon(int id_leveringsbon){
 this.id_leveringsbon=id_leveringsbon;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
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
public void setAfkorting_aankoopeenheid(String afkorting_aankoopeenheid){
 this.afkorting_aankoopeenheid=afkorting_aankoopeenheid;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setAfkorting_prijseenheid(String afkorting_prijseenheid){
 this.afkorting_prijseenheid=afkorting_prijseenheid;
 }
public void setTotaal(double totaal){
 this.totaal=totaal;
 }
public void setDatum_leveringsbon(Date datum_leveringsbon){
 this.datum_leveringsbon=datum_leveringsbon;
 }
public void setLeveringstemperatuur(double leveringstemperatuur){
 this.leveringstemperatuur=leveringstemperatuur;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
}