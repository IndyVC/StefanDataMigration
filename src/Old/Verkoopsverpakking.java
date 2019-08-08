package Old;
import Utils.Util;
import java.sql.Date;

public class Verkoopsverpakking implements Old { 
private int id_bedrijf;
private int id_verkoopsverpakking;
private String omschrijvingn;
private String omschrijvingf;
private String omschrijvinge;
private int id_verdeelgroep;
private int hoeveelheid_verpakking;
private int hoeveelheid_grootverpakking;
private boolean verdelen_grootverpakking;
private boolean combineren_meerdere_producten;
private Date inserted;
private Date updated;

public Verkoopsverpakking(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopsverpakking = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.omschrijvinge = data[4];
this.id_verdeelgroep = Util.Int(data[5]);
this.hoeveelheid_verpakking = Util.Int(data[6]);
this.hoeveelheid_grootverpakking = Util.Int(data[7]);
this.verdelen_grootverpakking = Util.Boolean(data[8]);
this.combineren_meerdere_producten = Util.Boolean(data[9]);
this.inserted = Util.Date(data[10]);
this.updated = Util.Date(data[11]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopsverpakking() {
return this.id_verkoopsverpakking;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public int getId_verdeelgroep() {
return this.id_verdeelgroep;
}
public int getHoeveelheid_verpakking() {
return this.hoeveelheid_verpakking;
}
public int getHoeveelheid_grootverpakking() {
return this.hoeveelheid_grootverpakking;
}
public boolean getVerdelen_grootverpakking() {
return this.verdelen_grootverpakking;
}
public boolean getCombineren_meerdere_producten() {
return this.combineren_meerdere_producten;
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
public void setId_verkoopsverpakking(int id_verkoopsverpakking){
 this.id_verkoopsverpakking=id_verkoopsverpakking;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setId_verdeelgroep(int id_verdeelgroep){
 this.id_verdeelgroep=id_verdeelgroep;
 }
public void setHoeveelheid_verpakking(int hoeveelheid_verpakking){
 this.hoeveelheid_verpakking=hoeveelheid_verpakking;
 }
public void setHoeveelheid_grootverpakking(int hoeveelheid_grootverpakking){
 this.hoeveelheid_grootverpakking=hoeveelheid_grootverpakking;
 }
public void setVerdelen_grootverpakking(boolean verdelen_grootverpakking){
 this.verdelen_grootverpakking=verdelen_grootverpakking;
 }
public void setCombineren_meerdere_producten(boolean combineren_meerdere_producten){
 this.combineren_meerdere_producten=combineren_meerdere_producten;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}