package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductEenheidsprijs implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private int id_leverancier;
private Date geldigheidsdatum;
private double eenheidsprijs;
private Date inserted;
private Date updated;
private int cc;
private double basiseenheidsprijs;
private int id_basiseenheid;
private double kiloprijs;
private int id_receptproduct;

public AankoopproductEenheidsprijs(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.id_leverancier = Util.Int(data[2]);
this.geldigheidsdatum = Util.Date(data[3]);
this.eenheidsprijs = Util.Double(data[4]);
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.cc = Util.Int(data[7]);
this.basiseenheidsprijs = Util.Double(data[8]);
this.id_basiseenheid = Util.Int(data[9]);
this.kiloprijs = Util.Double(data[10]);
this.id_receptproduct = Util.Int(data[11]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public Date getGeldigheidsdatum() {
return this.geldigheidsdatum;
}
public double getEenheidsprijs() {
return this.eenheidsprijs;
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
public double getBasiseenheidsprijs() {
return this.basiseenheidsprijs;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public double getKiloprijs() {
return this.kiloprijs;
}
public int getId_receptproduct() {
return this.id_receptproduct;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setGeldigheidsdatum(Date geldigheidsdatum){
 this.geldigheidsdatum=geldigheidsdatum;
 }
public void setEenheidsprijs(double eenheidsprijs){
 this.eenheidsprijs=eenheidsprijs;
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
public void setBasiseenheidsprijs(double basiseenheidsprijs){
 this.basiseenheidsprijs=basiseenheidsprijs;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setKiloprijs(double kiloprijs){
 this.kiloprijs=kiloprijs;
 }
public void setId_receptproduct(int id_receptproduct){
 this.id_receptproduct=id_receptproduct;
 }
}