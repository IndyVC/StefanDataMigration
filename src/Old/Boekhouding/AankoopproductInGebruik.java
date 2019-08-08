package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopproductInGebruik implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private Date in_gebruik;
private int id_gebruik;
private String lotnummer;
private String lotnummer_extern;
private Date datum_houdbaarheid;
private Date inserted;
private Date updated;
private boolean tonen;
private int id_receptproduct;
private double hoeveelheid_in_gebruik;
private Date houdbaarheidsdatum_na_openen;
private String werkstation_insert;
private String werkstation_update;
private String reden_insert;
private String reden_update;
private boolean manuele_ingave;

public AankoopproductInGebruik(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.in_gebruik = Util.Date(data[2]);
this.id_gebruik = Util.Int(data[3]);
this.lotnummer = data[4];
this.lotnummer_extern = data[5];
this.datum_houdbaarheid = Util.Date(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.tonen = Util.Boolean(data[9]);
this.id_receptproduct = Util.Int(data[10]);
this.hoeveelheid_in_gebruik = Util.Double(data[11]);
this.houdbaarheidsdatum_na_openen = Util.Date(data[12]);
this.werkstation_insert = data[13];
this.werkstation_update = data[14];
this.reden_insert = data[15];
this.reden_update = data[16];
this.manuele_ingave = Util.Boolean(data[17]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
}
public Date getIn_gebruik() {
return this.in_gebruik;
}
public int getId_gebruik() {
return this.id_gebruik;
}
public String getLotnummer() {
return this.lotnummer;
}
public String getLotnummer_extern() {
return this.lotnummer_extern;
}
public Date getDatum_houdbaarheid() {
return this.datum_houdbaarheid;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public boolean getTonen() {
return this.tonen;
}
public int getId_receptproduct() {
return this.id_receptproduct;
}
public double getHoeveelheid_in_gebruik() {
return this.hoeveelheid_in_gebruik;
}
public Date getHoudbaarheidsdatum_na_openen() {
return this.houdbaarheidsdatum_na_openen;
}
public String getWerkstation_insert() {
return this.werkstation_insert;
}
public String getWerkstation_update() {
return this.werkstation_update;
}
public String getReden_insert() {
return this.reden_insert;
}
public String getReden_update() {
return this.reden_update;
}
public boolean getManuele_ingave() {
return this.manuele_ingave;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
 }
public void setIn_gebruik(Date in_gebruik){
 this.in_gebruik=in_gebruik;
 }
public void setId_gebruik(int id_gebruik){
 this.id_gebruik=id_gebruik;
 }
public void setLotnummer(String lotnummer){
 this.lotnummer=lotnummer;
 }
public void setLotnummer_extern(String lotnummer_extern){
 this.lotnummer_extern=lotnummer_extern;
 }
public void setDatum_houdbaarheid(Date datum_houdbaarheid){
 this.datum_houdbaarheid=datum_houdbaarheid;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setTonen(boolean tonen){
 this.tonen=tonen;
 }
public void setId_receptproduct(int id_receptproduct){
 this.id_receptproduct=id_receptproduct;
 }
public void setHoeveelheid_in_gebruik(double hoeveelheid_in_gebruik){
 this.hoeveelheid_in_gebruik=hoeveelheid_in_gebruik;
 }
public void setHoudbaarheidsdatum_na_openen(Date houdbaarheidsdatum_na_openen){
 this.houdbaarheidsdatum_na_openen=houdbaarheidsdatum_na_openen;
 }
public void setWerkstation_insert(String werkstation_insert){
 this.werkstation_insert=werkstation_insert;
 }
public void setWerkstation_update(String werkstation_update){
 this.werkstation_update=werkstation_update;
 }
public void setReden_insert(String reden_insert){
 this.reden_insert=reden_insert;
 }
public void setReden_update(String reden_update){
 this.reden_update=reden_update;
 }
public void setManuele_ingave(boolean manuele_ingave){
 this.manuele_ingave=manuele_ingave;
 }
}