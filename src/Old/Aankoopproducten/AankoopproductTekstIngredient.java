package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductTekstIngredient implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private String technische_fiche_versie;
private Date technische_fiche_datum;
private String ingredienten;
private String link_technische_fiche;
private Date inserted;
private Date updated;

public AankoopproductTekstIngredient(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.technische_fiche_versie = data[2];
this.technische_fiche_datum = Util.Date(data[3]);
this.ingredienten = data[4];
this.link_technische_fiche = data[5];
this.inserted = Util.Date(data[6]);
this.updated = Util.Date(data[7]);
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
public String getIngredienten() {
return this.ingredienten;
}
public String getLink_technische_fiche() {
return this.link_technische_fiche;
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
public void setIngredienten(String ingredienten){
 this.ingredienten=ingredienten;
 }
public void setLink_technische_fiche(String link_technische_fiche){
 this.link_technische_fiche=link_technische_fiche;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}