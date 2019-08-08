package Old.Levering;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class LeveringsbonDetail implements Old { 
private int id_bedrijf;
private int id_leveringsbon;
private int volgnummer;
private int id_aankoopproduct;
private double hoeveelheid;
private double eenheidsprijs;
private Date datum_houdbaarheid;
private String lotnummer;
private int cc;
private int id_aankoopeenheid;
private int id_verpakkingseenheid;
private int id_basiseenheid;
private int id_collieenheid;
private int id_prijseenheid;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;
private double aantal_colli_palet;
private double totaal;
private int aantal_etiketten;
private double leveringstemperatuur;
private double eenheidsgewicht;
private boolean is_gefactureerd;
private String lotnummer_extern;
private double netto_gewicht;
private int gekozen_aankoopeenheid;
private int id_gebruik;
private Date datum_gebruik;
private String reden_gebruik;
private double hoeveelheid_reden;
private double hoeveelheid_vuilbak;
private double hoeveelheid_geweigerd;
private double hoeveelheid_terug;
private boolean tonen;
private boolean gescand;
private double hoeveelheid_in_gebruik;

public LeveringsbonDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leveringsbon = Util.Int(data[1]);
this.volgnummer = Util.Int(data[2]);
this.id_aankoopproduct = Util.Int(data[3]);
this.hoeveelheid = Util.Double(data[4]);
this.eenheidsprijs = Util.Double(data[5]);
this.datum_houdbaarheid = Util.Date(data[6]);
this.lotnummer = data[7];
this.cc = Util.Int(data[8]);
this.id_aankoopeenheid = Util.Int(data[9]);
this.id_verpakkingseenheid = Util.Int(data[10]);
this.id_basiseenheid = Util.Int(data[11]);
this.id_collieenheid = Util.Int(data[12]);
this.id_prijseenheid = Util.Int(data[13]);
this.aantal_eenheden_verpakking = Util.Double(data[14]);
this.aantal_verpakkingen_colli = Util.Double(data[15]);
this.aantal_colli_palet = Util.Double(data[16]);
this.totaal = Util.Double(data[17]);
this.aantal_etiketten = Util.Int(data[18]);
this.leveringstemperatuur = Util.Double(data[19]);
this.eenheidsgewicht = Util.Double(data[20]);
this.is_gefactureerd = Util.Boolean(data[21]);
this.lotnummer_extern = data[22];
this.netto_gewicht = Util.Double(data[23]);
this.gekozen_aankoopeenheid = Util.Int(data[24]);
this.id_gebruik = Util.Int(data[25]);
this.datum_gebruik = Util.Date(data[26]);
this.reden_gebruik = data[27];
this.hoeveelheid_reden = Util.Double(data[28]);
this.hoeveelheid_vuilbak = Util.Double(data[29]);
this.hoeveelheid_geweigerd = Util.Double(data[30]);
this.hoeveelheid_terug = Util.Double(data[31]);
this.tonen = Util.Boolean(data[32]);
this.gescand = Util.Boolean(data[33]);
this.hoeveelheid_in_gebruik = Util.Double(data[34]);
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
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public String getLotnummer() {
return this.lotnummer;
}
public int getCc() {
return this.cc;
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
public double getTotaal() {
return this.totaal;
}
public int getAantal_etiketten() {
return this.aantal_etiketten;
}
public double getLeveringstemperatuur() {
return this.leveringstemperatuur;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public boolean getIs_gefactureerd() {
return this.is_gefactureerd;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public double getNetto_gewicht() {
return this.netto_gewicht;
}
public int getGekozen_aankoopeenheid() {
return this.gekozen_aankoopeenheid;
}
public int getId_gebruik() {
return this.id_gebruik;
}
public Date getDatum_gebruik() {
return this.datum_gebruik;
}
public String getReden_gebruik() {
return this.reden_gebruik;
}
public double getHoeveelheid_reden() {
return this.hoeveelheid_reden;
}
public double getHoeveelheid_vuilbak() {
return this.hoeveelheid_vuilbak;
}
public double getHoeveelheid_geweigerd() {
return this.hoeveelheid_geweigerd;
}
public double getHoeveelheid_terug() {
return this.hoeveelheid_terug;
}
public boolean getTonen() {
return this.tonen;
}
public boolean getGescand() {
return this.gescand;
}
public double getHoeveelheid_in_gebruik() {
return this.hoeveelheid_in_gebruik;
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
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setCc(int cc){
 this.cc=cc;
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
public void setTotaal(double totaal){
 this.totaal=totaal;
 }
public void setAantal_etiketten(int aantal_etiketten){
 this.aantal_etiketten=aantal_etiketten;
 }
public void setLeveringstemperatuur(double leveringstemperatuur){
 this.leveringstemperatuur=leveringstemperatuur;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setIs_gefactureerd(boolean is_gefactureerd){
 this.is_gefactureerd=is_gefactureerd;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setNetto_gewicht(double netto_gewicht){
 this.netto_gewicht=netto_gewicht;
 }
public void setGekozen_aankoopeenheid(int gekozen_aankoopeenheid){
 this.gekozen_aankoopeenheid=gekozen_aankoopeenheid;
 }
public void setId_gebruik(int id_gebruik){
 this.id_gebruik=id_gebruik;
 }
public void setDatum_gebruik(Date datum_gebruik){
 this.datum_gebruik=datum_gebruik;
 }
public void setReden_gebruik(String reden_gebruik){
 this.reden_gebruik=reden_gebruik;
 }
public void setHoeveelheid_reden(double hoeveelheid_reden){
 this.hoeveelheid_reden=hoeveelheid_reden;
 }
public void setHoeveelheid_vuilbak(double hoeveelheid_vuilbak){
 this.hoeveelheid_vuilbak=hoeveelheid_vuilbak;
 }
public void setHoeveelheid_geweigerd(double hoeveelheid_geweigerd){
 this.hoeveelheid_geweigerd=hoeveelheid_geweigerd;
 }
public void setHoeveelheid_terug(double hoeveelheid_terug){
 this.hoeveelheid_terug=hoeveelheid_terug;
 }
public void setTonen(boolean tonen){
 this.tonen=tonen;
 }
public void setGescand(boolean gescand){
 this.gescand=gescand;
 }
public void setHoeveelheid_in_gebruik(double hoeveelheid_in_gebruik){
 this.hoeveelheid_in_gebruik=hoeveelheid_in_gebruik;
 }
}