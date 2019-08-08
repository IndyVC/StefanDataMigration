package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerzendbonHoofding implements Old { 
private int id_bedrijf;
private int id_verzendbon;
private Date datum_verzendbon;
private int id_klant;
private String id_convertie;
private boolean doorgestuurd_naar_Probak;
private boolean afgedrukt;
private Date inserted;
private Date updated;
private int cc;
private Date datum_te_leveren;
private String referentie_klant;
private Date datum_besteld;
private String uur;
private boolean betaald;
private double kortingspercentage;
private double bedrag_betaald;
private double bedrag_bestelling;
private double bedrag_korting;
private String reden_korting;
private boolean levering;
private boolean express;
private boolean factuur_gewenst;
private String referentie;
private String opmerking;

public VerzendbonHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verzendbon = Util.Int(data[1]);
this.datum_verzendbon = Util.Date(data[2]);
this.id_klant = Util.Int(data[3]);
this.id_convertie = data[4];
this.doorgestuurd_naar_Probak = Util.Boolean(data[5]);
this.afgedrukt = Util.Boolean(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.datum_te_leveren = Util.Date(data[10]);
this.referentie_klant = data[11];
this.datum_besteld = Util.Date(data[12]);
this.uur = data[13];
this.betaald = Util.Boolean(data[14]);
this.kortingspercentage = Util.Double(data[15]);
this.bedrag_betaald = Util.Double(data[16]);
this.bedrag_bestelling = Util.Double(data[17]);
this.bedrag_korting = Util.Double(data[18]);
this.reden_korting = data[19];
this.levering = Util.Boolean(data[20]);
this.express = Util.Boolean(data[21]);
this.factuur_gewenst = Util.Boolean(data[22]);
this.referentie = data[23];
this.opmerking = data[24];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verzendbon() {
return this.id_verzendbon;
}
public Date getDatum_verzendbon() {
return this.datum_verzendbon;
}
public int getId_klant() {
return this.id_klant;
}
public String getId_convertie() {
return this.id_convertie;
}
public boolean getDoorgestuurd_naar_Probak() {
return this.doorgestuurd_naar_Probak;
}
public boolean getAfgedrukt() {
return this.afgedrukt;
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
public Date getDatum_te_leveren() {
return this.datum_te_leveren;
}
public String getReferentie_klant() {
return this.referentie_klant;
}
public Date getDatum_besteld() {
return this.datum_besteld;
}
public String getUur() {
return this.uur;
}
public boolean getBetaald() {
return this.betaald;
}
public double getKortingspercentage() {
return this.kortingspercentage;
}
public double getBedrag_betaald() {
return this.bedrag_betaald;
}
public double getBedrag_bestelling() {
return this.bedrag_bestelling;
}
public double getBedrag_korting() {
return this.bedrag_korting;
}
public String getReden_korting() {
return this.reden_korting;
}
public boolean getLevering() {
return this.levering;
}
public boolean getExpress() {
return this.express;
}
public boolean getFactuur_gewenst() {
return this.factuur_gewenst;
}
public String getReferentie() {
return this.referentie;
}
public String getOpmerking() {
return this.opmerking;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verzendbon(int id_verzendbon){
 this.id_verzendbon=id_verzendbon;
 }
public void setDatum_verzendbon(Date datum_verzendbon){
 this.datum_verzendbon=datum_verzendbon;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setDoorgestuurd_naar_Probak(boolean doorgestuurd_naar_Probak){
 this.doorgestuurd_naar_Probak=doorgestuurd_naar_Probak;
 }
public void setAfgedrukt(boolean afgedrukt){
 this.afgedrukt=afgedrukt;
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
public void setDatum_te_leveren(Date datum_te_leveren){
 this.datum_te_leveren=datum_te_leveren;
 }
public void setReferentie_klant(String referentie_klant){
 this.referentie_klant=referentie_klant;
 }
public void setDatum_besteld(Date datum_besteld){
 this.datum_besteld=datum_besteld;
 }
public void setUur(String uur){
 this.uur=uur;
 }
public void setBetaald(boolean betaald){
 this.betaald=betaald;
 }
public void setKortingspercentage(double kortingspercentage){
 this.kortingspercentage=kortingspercentage;
 }
public void setBedrag_betaald(double bedrag_betaald){
 this.bedrag_betaald=bedrag_betaald;
 }
public void setBedrag_bestelling(double bedrag_bestelling){
 this.bedrag_bestelling=bedrag_bestelling;
 }
public void setBedrag_korting(double bedrag_korting){
 this.bedrag_korting=bedrag_korting;
 }
public void setReden_korting(String reden_korting){
 this.reden_korting=reden_korting;
 }
public void setLevering(boolean levering){
 this.levering=levering;
 }
public void setExpress(boolean express){
 this.express=express;
 }
public void setFactuur_gewenst(boolean factuur_gewenst){
 this.factuur_gewenst=factuur_gewenst;
 }
public void setReferentie(String referentie){
 this.referentie=referentie;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
 }
}