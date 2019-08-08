package Old;
import Utils.Util;
import java.sql.Date;

public class ProductieEigenFabrikaatHoofding implements Old { 
private int id_bedrijf;
private Date datum_levering;
private int code_eigen_fabrikaat;
private int id_eigen_fabrikaat;
private int aantal_personen;
private double hoeveelheid;
private int id_recepteenheid;
private Date inserted;
private Date updated;
private int cc;
private boolean nieuw;
private boolean vernieuwd;
private double vorige_hoeveelheid;
private String linked_0;
private String linked_1;
private String linked_2;
private String linked_3;
private boolean end_drilldown;
private double hoeveelheid_telbasis;
private String linked_4;
private boolean uit_voorraad;
private int default_tijd;
private double voorraad;
private boolean planning;
private int id_regelmaat;
private int id_variant_header;
private int id_variant_detail;
private int id_remark_header;
private int id_remark_detail;
private String opmerking;

public ProductieEigenFabrikaatHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.datum_levering = Util.Date(data[1]);
this.code_eigen_fabrikaat = Util.Int(data[2]);
this.id_eigen_fabrikaat = Util.Int(data[3]);
this.aantal_personen = Util.Int(data[4]);
this.hoeveelheid = Util.Double(data[5]);
this.id_recepteenheid = Util.Int(data[6]);
this.inserted = Util.Date(data[7]);
this.updated = Util.Date(data[8]);
this.cc = Util.Int(data[9]);
this.nieuw = Util.Boolean(data[10]);
this.vernieuwd = Util.Boolean(data[11]);
this.vorige_hoeveelheid = Util.Double(data[12]);
this.linked_0 = data[13];
this.linked_1 = data[14];
this.linked_2 = data[15];
this.linked_3 = data[16];
this.end_drilldown = Util.Boolean(data[17]);
this.hoeveelheid_telbasis = Util.Double(data[18]);
this.linked_4 = data[19];
this.uit_voorraad = Util.Boolean(data[20]);
this.default_tijd = Util.Int(data[21]);
this.voorraad = Util.Double(data[22]);
this.planning = Util.Boolean(data[23]);
this.id_regelmaat = Util.Int(data[24]);
this.id_variant_header = Util.Int(data[25]);
this.id_variant_detail = Util.Int(data[26]);
this.id_remark_header = Util.Int(data[27]);
this.id_remark_detail = Util.Int(data[28]);
this.opmerking = data[29];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public Date getDatum_levering() {
return this.datum_levering;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public int getId_eigen_fabrikaat() {
return this.id_eigen_fabrikaat;
}
public int getAantal_personen() {
return this.aantal_personen;
}
public double getHoeveelheid() {
return this.hoeveelheid;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
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
public boolean getNieuw() {
return this.nieuw;
}
public boolean getVernieuwd() {
return this.vernieuwd;
}
public double getVorige_hoeveelheid() {
return this.vorige_hoeveelheid;
}
public String getLinked_0() {
return this.linked_0;
}
public String getLinked_1() {
return this.linked_1;
}
public String getLinked_2() {
return this.linked_2;
}
public String getLinked_3() {
return this.linked_3;
}
public boolean getEnd_drilldown() {
return this.end_drilldown;
}
public double getHoeveelheid_telbasis() {
return this.hoeveelheid_telbasis;
}
public String getLinked_4() {
return this.linked_4;
}
public boolean getUit_voorraad() {
return this.uit_voorraad;
}
public int getDefault_tijd() {
return this.default_tijd;
}
public double getVoorraad() {
return this.voorraad;
}
public boolean getPlanning() {
return this.planning;
}
public int getId_regelmaat() {
return this.id_regelmaat;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_variant_detail() {
return this.id_variant_detail;
}
public int getId_remark_header() {
return this.id_remark_header;
}
public int getId_remark_detail() {
return this.id_remark_detail;
}
public String getOpmerking() {
return this.opmerking;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setDatum_levering(Date datum_levering){
 this.datum_levering=datum_levering;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setId_eigen_fabrikaat(int id_eigen_fabrikaat){
 this.id_eigen_fabrikaat=id_eigen_fabrikaat;
 }
public void setAantal_personen(int aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setHoeveelheid(double hoeveelheid){
 this.hoeveelheid=hoeveelheid;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
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
public void setNieuw(boolean nieuw){
 this.nieuw=nieuw;
 }
public void setVernieuwd(boolean vernieuwd){
 this.vernieuwd=vernieuwd;
 }
public void setVorige_hoeveelheid(double vorige_hoeveelheid){
 this.vorige_hoeveelheid=vorige_hoeveelheid;
 }
public void setLinked_0(String linked_0){
 this.linked_0=linked_0;
 }
public void setLinked_1(String linked_1){
 this.linked_1=linked_1;
 }
public void setLinked_2(String linked_2){
 this.linked_2=linked_2;
 }
public void setLinked_3(String linked_3){
 this.linked_3=linked_3;
 }
public void setEnd_drilldown(boolean end_drilldown){
 this.end_drilldown=end_drilldown;
 }
public void setHoeveelheid_telbasis(double hoeveelheid_telbasis){
 this.hoeveelheid_telbasis=hoeveelheid_telbasis;
 }
public void setLinked_4(String linked_4){
 this.linked_4=linked_4;
 }
public void setUit_voorraad(boolean uit_voorraad){
 this.uit_voorraad=uit_voorraad;
 }
public void setDefault_tijd(int default_tijd){
 this.default_tijd=default_tijd;
 }
public void setVoorraad(double voorraad){
 this.voorraad=voorraad;
 }
public void setPlanning(boolean planning){
 this.planning=planning;
 }
public void setId_regelmaat(int id_regelmaat){
 this.id_regelmaat=id_regelmaat;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_variant_detail(int id_variant_detail){
 this.id_variant_detail=id_variant_detail;
 }
public void setId_remark_header(int id_remark_header){
 this.id_remark_header=id_remark_header;
 }
public void setId_remark_detail(int id_remark_detail){
 this.id_remark_detail=id_remark_detail;
 }
public void setOpmerking(String opmerking){
 this.opmerking=opmerking;
 }
}