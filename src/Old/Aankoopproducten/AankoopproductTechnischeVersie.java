package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductTechnischeVersie implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private String technische_fiche_versie;
private Date technische_fiche_datum;
private Date inserted;
private Date updated;

public AankoopproductTechnischeVersie(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.technische_fiche_versie = data[2];
this.technische_fiche_datum = Util.Date(data[3]);
this.inserted = Util.Date(data[4]);
this.updated = Util.Date(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}