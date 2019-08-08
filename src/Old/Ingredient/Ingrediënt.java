package Old.Ingredient;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Ingrediënt implements Old { 
private int id_ingredient;
private int id_online;
private String omschrijvingn;
private String omschrijvingf;
private int id_land_oorsprong;
private int id_origine;
private int id_functie;
private int id_etiket_tekst;
private String e_code;
private boolean additief;
private boolean technologische_functie;
private boolean plantaardige_olien_vetten;
private boolean etiket_verkoopproduct;
private double etiket_verkoopproduct_percentage_ondergrens;
private double etiket_verkoopproduct_percentage_bovengrens;
private Date inserted;
private Date updated;
private int cc;
private int id_ingredientgroep;
private String zoekomschrijving;
private boolean vermelden_enummer;

public Ingrediënt(String[] data){
this.id_ingredient = Util.Int(data[0]);
this.id_online = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.id_land_oorsprong = Util.Int(data[4]);
this.id_origine = Util.Int(data[5]);
this.id_functie = Util.Int(data[6]);
this.id_etiket_tekst = Util.Int(data[7]);
this.e_code = data[8];
this.additief = Util.Boolean(data[9]);
this.technologische_functie = Util.Boolean(data[10]);
this.plantaardige_olien_vetten = Util.Boolean(data[11]);
this.etiket_verkoopproduct = Util.Boolean(data[12]);
this.etiket_verkoopproduct_percentage_ondergrens = Util.Double(data[13]);
this.etiket_verkoopproduct_percentage_bovengrens = Util.Double(data[14]);
this.inserted = Util.Date(data[15]);
this.updated = Util.Date(data[16]);
this.cc = Util.Int(data[17]);
this.id_ingredientgroep = Util.Int(data[18]);
this.zoekomschrijving = data[19];
this.vermelden_enummer = Util.Boolean(data[20]);
}
public int getId_ingredient() {
return this.id_ingredient;
}
public int getId_online() {
return this.id_online;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_land_oorsprong() {
return this.id_land_oorsprong;
}
public int getId_origine() {
return this.id_origine;
}
public int getId_functie() {
return this.id_functie;
}
public int getId_etiket_tekst() {
return this.id_etiket_tekst;
}
public String getEnum() {
return this.e_code;
}
public boolean getAdditief() {
return this.additief;
}
public boolean getTechnologische_functie() {
return this.technologische_functie;
}
public boolean getPlantaardige_olien_vetten() {
return this.plantaardige_olien_vetten;
}
public boolean getEtiket_verkoopproduct() {
return this.etiket_verkoopproduct;
}
public double getEtiket_verkoopproduct_percentage_ondergrens() {
return this.etiket_verkoopproduct_percentage_ondergrens;
}
public double getEtiket_verkoopproduct_percentage_bovengrens() {
return this.etiket_verkoopproduct_percentage_bovengrens;
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
public int getId_ingredientgroep() {
return this.id_ingredientgroep;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public boolean getVermelden_enummer() {
return this.vermelden_enummer;
}
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_land_oorsprong(int id_land_oorsprong){
 this.id_land_oorsprong=id_land_oorsprong;
 }
public void setId_origine(int id_origine){
 this.id_origine=id_origine;
 }
public void setId_functie(int id_functie){
 this.id_functie=id_functie;
 }
public void setId_etiket_tekst(int id_etiket_tekst){
 this.id_etiket_tekst=id_etiket_tekst;
 }
public void setEnum(String e_code){
 this.e_code=e_code;
 }
public void setAdditief(boolean additief){
 this.additief=additief;
 }
public void setTechnologische_functie(boolean technologische_functie){
 this.technologische_functie=technologische_functie;
 }
public void setPlantaardige_olien_vetten(boolean plantaardige_olien_vetten){
 this.plantaardige_olien_vetten=plantaardige_olien_vetten;
 }
public void setEtiket_verkoopproduct(boolean etiket_verkoopproduct){
 this.etiket_verkoopproduct=etiket_verkoopproduct;
 }
public void setEtiket_verkoopproduct_percentage_ondergrens(double etiket_verkoopproduct_percentage_ondergrens){
 this.etiket_verkoopproduct_percentage_ondergrens=etiket_verkoopproduct_percentage_ondergrens;
 }
public void setEtiket_verkoopproduct_percentage_bovengrens(double etiket_verkoopproduct_percentage_bovengrens){
 this.etiket_verkoopproduct_percentage_bovengrens=etiket_verkoopproduct_percentage_bovengrens;
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
public void setId_ingredientgroep(int id_ingredientgroep){
 this.id_ingredientgroep=id_ingredientgroep;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setVermelden_enummer(boolean vermelden_enummer){
 this.vermelden_enummer=vermelden_enummer;
 }
}