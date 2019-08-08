package Old;
import Utils.Util;

public class EtiketDefault implements Old { 
private int id_bedrijf;
private int id_etiket_aankoopproduct;
private int id_etiket_halffabrikaat;
private int id_etiket_voorbereid_product;
private int id_etiket_afgewerkt_product;
private int id_etiket_verkoopproduct;
private int id_etiket_verbruik;
private int id_etiket_prijskaartje_voorkant;
private int id_etiket_prijskaartje_achterkant;

public EtiketDefault(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_etiket_aankoopproduct = Util.Int(data[1]);
this.id_etiket_halffabrikaat = Util.Int(data[2]);
this.id_etiket_voorbereid_product = Util.Int(data[3]);
this.id_etiket_afgewerkt_product = Util.Int(data[4]);
this.id_etiket_verkoopproduct = Util.Int(data[5]);
this.id_etiket_verbruik = Util.Int(data[6]);
this.id_etiket_prijskaartje_voorkant = Util.Int(data[7]);
this.id_etiket_prijskaartje_achterkant = Util.Int(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_etiket_aankoopproduct() {
return this.id_etiket_aankoopproduct;
}
public int getId_etiket_halffabrikaat() {
return this.id_etiket_halffabrikaat;
}
public int getId_etiket_voorbereid_product() {
return this.id_etiket_voorbereid_product;
}
public int getId_etiket_afgewerkt_product() {
return this.id_etiket_afgewerkt_product;
}
public int getId_etiket_verkoopproduct() {
return this.id_etiket_verkoopproduct;
}
public int getId_etiket_verbruik() {
return this.id_etiket_verbruik;
}
public int getId_etiket_prijskaartje_voorkant() {
return this.id_etiket_prijskaartje_voorkant;
}
public int getId_etiket_prijskaartje_achterkant() {
return this.id_etiket_prijskaartje_achterkant;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_etiket_aankoopproduct(int id_etiket_aankoopproduct){
 this.id_etiket_aankoopproduct=id_etiket_aankoopproduct;
 }
public void setId_etiket_halffabrikaat(int id_etiket_halffabrikaat){
 this.id_etiket_halffabrikaat=id_etiket_halffabrikaat;
 }
public void setId_etiket_voorbereid_product(int id_etiket_voorbereid_product){
 this.id_etiket_voorbereid_product=id_etiket_voorbereid_product;
 }
public void setId_etiket_afgewerkt_product(int id_etiket_afgewerkt_product){
 this.id_etiket_afgewerkt_product=id_etiket_afgewerkt_product;
 }
public void setId_etiket_verkoopproduct(int id_etiket_verkoopproduct){
 this.id_etiket_verkoopproduct=id_etiket_verkoopproduct;
 }
public void setId_etiket_verbruik(int id_etiket_verbruik){
 this.id_etiket_verbruik=id_etiket_verbruik;
 }
public void setId_etiket_prijskaartje_voorkant(int id_etiket_prijskaartje_voorkant){
 this.id_etiket_prijskaartje_voorkant=id_etiket_prijskaartje_voorkant;
 }
public void setId_etiket_prijskaartje_achterkant(int id_etiket_prijskaartje_achterkant){
 this.id_etiket_prijskaartje_achterkant=id_etiket_prijskaartje_achterkant;
 }
}