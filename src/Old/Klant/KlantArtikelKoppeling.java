package Old.Klant;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class KlantArtikelKoppeling implements Old { 
private int id_bedrijf;
private int id_klant;
private int id_verkoopproduct_bestelling;
private int id_verkoopproduct_levering;
private Date inserted;
private Date updated;
private int cc;
private int veelvoud;

public KlantArtikelKoppeling(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_klant = Util.Int(data[1]);
this.id_verkoopproduct_bestelling = Util.Int(data[2]);
this.id_verkoopproduct_levering = Util.Int(data[3]);
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
this.cc = Util.Int(data[6]);
this.veelvoud = Util.Int(data[7]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_klant() {
return this.id_klant;
}
public int getId_verkoopproduct_bestelling() {
return this.id_verkoopproduct_bestelling;
}
public int getId_verkoopproduct_levering() {
return this.id_verkoopproduct_levering;
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
public int getVeelvoud() {
return this.veelvoud;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_klant(int id_klant){
 this.id_klant=id_klant;
 }
public void setId_verkoopproduct_bestelling(int id_verkoopproduct_bestelling){
 this.id_verkoopproduct_bestelling=id_verkoopproduct_bestelling;
 }
public void setId_verkoopproduct_levering(int id_verkoopproduct_levering){
 this.id_verkoopproduct_levering=id_verkoopproduct_levering;
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
public void setVeelvoud(int veelvoud){
 this.veelvoud=veelvoud;
 }
}