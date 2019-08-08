package Old.Afgewerkteproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AfgewerktproductIngredient implements Old { 
private int id_bedrijf;
private int id_afgewerkt_product;
private Date datum_versie;
private String ingredienten_voorstel_nederlands;
private String ingredienten_manueel_nederlands;
private Date inserted;
private Date updated;
private int cc;
private int nummer_versie;
private String ingredienten_manueel_frans;
private String ingredienten_voorstel_frans;
private String ingredienten_manueel_engels;
private String ingredienten_voorstel_engels;

public AfgewerktproductIngredient(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_afgewerkt_product = Util.Int(data[1]);
this.datum_versie = Util.Date(data[2]);
this.ingredienten_voorstel_nederlands = data[3];
this.ingredienten_manueel_nederlands = data[4];
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.cc = Util.Int(data[7]);
this.nummer_versie = Util.Int(data[8]);
this.ingredienten_manueel_frans = data[9];
this.ingredienten_voorstel_frans = data[10];
this.ingredienten_manueel_engels = data[11];
this.ingredienten_voorstel_engels = data[12];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_afgewerkt_product() {
return this.id_afgewerkt_product;
}
public Date getDatum_versie() {
return this.datum_versie;
}
public String getIngredienten_voorstel_nederlands() {
return this.ingredienten_voorstel_nederlands;
}
public String getIngredienten_manueel_nederlands() {
return this.ingredienten_manueel_nederlands;
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
public int getNummer_versie() {
return this.nummer_versie;
}
public String getIngredienten_manueel_frans() {
return this.ingredienten_manueel_frans;
}
public String getIngredienten_voorstel_frans() {
return this.ingredienten_voorstel_frans;
}
public String getIngredienten_manueel_engels() {
return this.ingredienten_manueel_engels;
}
public String getIngredienten_voorstel_engels() {
return this.ingredienten_voorstel_engels;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_afgewerkt_product(int id_afgewerkt_product){
 this.id_afgewerkt_product=id_afgewerkt_product;
 }
public void setDatum_versie(Date datum_versie){
 this.datum_versie=datum_versie;
 }
public void setIngredienten_voorstel_nederlands(String ingredienten_voorstel_nederlands){
 this.ingredienten_voorstel_nederlands=ingredienten_voorstel_nederlands;
 }
public void setIngredienten_manueel_nederlands(String ingredienten_manueel_nederlands){
 this.ingredienten_manueel_nederlands=ingredienten_manueel_nederlands;
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
public void setNummer_versie(int nummer_versie){
 this.nummer_versie=nummer_versie;
 }
public void setIngredienten_manueel_frans(String ingredienten_manueel_frans){
 this.ingredienten_manueel_frans=ingredienten_manueel_frans;
 }
public void setIngredienten_voorstel_frans(String ingredienten_voorstel_frans){
 this.ingredienten_voorstel_frans=ingredienten_voorstel_frans;
 }
public void setIngredienten_manueel_engels(String ingredienten_manueel_engels){
 this.ingredienten_manueel_engels=ingredienten_manueel_engels;
 }
public void setIngredienten_voorstel_engels(String ingredienten_voorstel_engels){
 this.ingredienten_voorstel_engels=ingredienten_voorstel_engels;
 }
}