package Old;
import Utils.Util;
import java.sql.Date;

public class LijstLeveringTotaalLeverancierAankoopproduct implements Old { 
private int id_bedrijf;
private int id_leverancier;
private int id_aankoopproduct;
private Date datum_leveringsbon;
private double eenheidsprijs;
private double hoeveelheid;
private double totaal;
private String afkorting_aankoopeenheid;
private String afkorting_prijseenheid;

public LijstLeveringTotaalLeverancierAankoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leverancier = Util.Int(data[1]);
this.id_aankoopproduct = Util.Int(data[2]);
this.datum_leveringsbon = Util.Date(data[3]);
this.eenheidsprijs = Util.Double(data[4]);
this.hoeveelheid = Util.Double(data[5]);
this.totaal = Util.Double(data[6]);
this.afkorting_aankoopeenheid = data[7];
this.afkorting_prijseenheid = data[8];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public Date getDatum_leveringsbon() {
return this.datum_leveringsbon;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public double getTotaal() {
return this.totaal;
}
public String getAfkorting_aankoopeenheid() {
return this.afkorting_aankoopeenheid;
}
public String getAfkorting_prijseenheid() {
return this.afkorting_prijseenheid;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setDatum_leveringsbon(Date datum_leveringsbon){
 this.datum_leveringsbon=datum_leveringsbon;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setTotaal(double totaal){
 this.totaal=totaal;
 }
public void setAfkorting_aankoopeenheid(String afkorting_aankoopeenheid){
 this.afkorting_aankoopeenheid=afkorting_aankoopeenheid;
 }
public void setAfkorting_prijseenheid(String afkorting_prijseenheid){
 this.afkorting_prijseenheid=afkorting_prijseenheid;
 }
}