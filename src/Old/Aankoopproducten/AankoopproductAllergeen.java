package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductAllergeen implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private int id_allergeen;
private int code;
private Date inserted;
private int cc;
private String technische_fiche_versie;
private Date technische_fiche_datum;

public AankoopproductAllergeen(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.id_allergeen = Util.Int(data[2]);
this.code = Util.Int(data[3]);
this.inserted = Util.Date(data[4]);
this.cc = Util.Int(data[5]);
this.technische_fiche_versie = data[6];
this.technische_fiche_datum = Util.Date(data[7]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public int getId_allergeen() {
return this.id_allergeen;
}
public int getCode() {
return this.code;
}
public Date getInserted() {
return this.inserted;
}
public int getCc() {
return this.cc;
}
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setCode(int code){
 this.code=code;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
}