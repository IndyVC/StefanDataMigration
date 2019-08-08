package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductIngredient implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private int id_ingredient;
private double percentage;
private Date inserted;
private Date updated;
private int cc;
private boolean kwid;
private boolean vermelden_ingredienten;
private boolean vermelden_type;
private String technische_fiche_versie;
private Date technische_fiche_datum;
private int volgnummer;
private int ppm;

public AankoopproductIngredient(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.id_ingredient = Util.Int(data[2]);
this.percentage = Util.Double(data[3]);
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.cc = Util.Int(data[6]);
this.kwid = Util.Boolean(data[7]);
this.vermelden_ingredienten = Util.Boolean(data[8]);
this.vermelden_type = Util.Boolean(data[9]);
this.technische_fiche_versie = data[10];
this.technische_fiche_datum = Util.Date(data[11]);
this.volgnummer = Util.Int(data[12]);
this.ppm = Util.Int(data[13]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_ingredient() {
return this.id_ingredient;
}
public double getPercentage() {
return this.percentage;
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
public boolean getKwid() {
return this.kwid;
}
public boolean getVermelden_ingredienten() {
return this.vermelden_ingredienten;
}
public boolean getVermelden_type() {
return this.vermelden_type;
}
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public int getVolgnummer() {
return this.volgnummer;
}
public int getPpm() {
return this.ppm;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
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
public void setKwid(boolean kwid){
 this.kwid=kwid;
 }
public void setVermelden_ingredienten(boolean vermelden_ingredienten){
 this.vermelden_ingredienten=vermelden_ingredienten;
 }
public void setVermelden_type(boolean vermelden_type){
 this.vermelden_type=vermelden_type;
 }
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
public void setVolgnummer(int volgnummer){
 this.volgnummer=volgnummer;
 }
public void setPpm(int ppm){
 this.ppm=ppm;
 }
}