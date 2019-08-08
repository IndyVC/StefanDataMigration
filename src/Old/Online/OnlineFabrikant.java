package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineFabrikant implements Old { 
private int id_fabrikant;
private String naam;

public OnlineFabrikant(String[] data){
this.id_fabrikant = Util.Int(data[0]);
this.naam = data[1];
}
public int getId_fabrikant() {
return this.id_fabrikant;
}
public String getNaam() {
return this.naam;
}
public void setId_fabrikant(int id_fabrikant){
 this.id_fabrikant=id_fabrikant;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
}