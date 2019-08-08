package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineIngredient implements Old { 
private int id_ingredient;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private int id_origine;
private int id_ingredientgroep;
private int id_functie;
private String e_code;
private String omschrijvinge;

public OnlineIngredient(String[] data){
this.id_ingredient = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.zoekomschrijving = data[3];
this.id_origine = Util.Int(data[4]);
this.id_ingredientgroep = Util.Int(data[5]);
this.id_functie = Util.Int(data[6]);
this.e_code = data[7];
this.omschrijvinge = data[8];
}
public int getId_ingredient() {
return this.id_ingredient;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public int getId_origine() {
return this.id_origine;
}
public int getId_ingredientgroep() {
return this.id_ingredientgroep;
}
public int getId_functie() {
return this.id_functie;
}
public String getE_code() {
return this.e_code;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setId_origine(int id_origine){
 this.id_origine=id_origine;
 }
public void setId_ingredientgroep(int id_ingredientgroep){
 this.id_ingredientgroep=id_ingredientgroep;
 }
public void setId_functie(int id_functie){
 this.id_functie=id_functie;
 }
public void setE_code(String e_code){
 this.e_code=e_code;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
}