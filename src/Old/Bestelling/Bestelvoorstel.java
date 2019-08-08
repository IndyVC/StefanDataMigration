package Old.Bestelling;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Bestelvoorstel implements Old { 
private int id_bedrijf;
private int id_leveradres;
private int id_receptproduct;
private Date inserted;

public Bestelvoorstel(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leveradres = Util.Int(data[1]);
this.id_receptproduct = Util.Int(data[2]);
this.inserted = Util.Date(data[3]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leveradres() {
return this.id_leveradres;
}
public int getId_receptproduct() {
return this.id_receptproduct;
}
public Date getInserted() {
return this.inserted;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leveradres(int id_leveradres){
 this.id_leveradres=id_leveradres;
 }
public void setId_receptproduct(int id_receptproduct){
 this.id_receptproduct=id_receptproduct;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
}