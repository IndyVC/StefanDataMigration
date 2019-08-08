package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineOrigine implements Old { 
private int id_origine;
private String omschrijvingn;
private String omschrijvingf;
private int id_ingredientgroep;

public OnlineOrigine(String[] data){
this.id_origine = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_ingredientgroep = Util.Int(data[3]);
}
public int getId_origine() {
return this.id_origine;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_ingredientgroep() {
return this.id_ingredientgroep;
}
public void setId_origine(int id_origine){
 this.id_origine=id_origine;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_ingredientgroep(int id_ingredientgroep){
 this.id_ingredientgroep=id_ingredientgroep;
 }
}