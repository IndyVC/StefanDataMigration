package Old;
import Utils.Util;

public class VariantDetail implements Old { 
private int id_bedrijf;
private int id_variant_header;
private int id_variant_detail;
private String id_convertie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private boolean blokkeren;
private double bedrag_supplement;
private boolean supplement_per_eenheid;
private String vanaf;
private String tem;

public VariantDetail(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_variant_header = Util.Int(data[1]);
this.id_variant_detail = Util.Int(data[2]);
this.id_convertie = data[3];
this.omschrijvingn = data[4];
this.omschrijvingf = data[5];
this.cc = Util.Int(data[6]);
this.blokkeren = Util.Boolean(data[7]);
this.bedrag_supplement = Util.Double(data[8]);
this.supplement_per_eenheid = Util.Boolean(data[9]);
this.vanaf = data[10];
this.tem = data[11];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_variant_detail() {
return this.id_variant_detail;
}
public String getId_convertie() {
return this.id_convertie;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getCc() {
return this.cc;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public double getBedrag_supplement() {
return this.bedrag_supplement;
}
public boolean getSupplement_per_eenheid() {
return this.supplement_per_eenheid;
}
public String getVanaf() {
return this.vanaf;
}
public String getTem() {
return this.tem;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_variant_detail(int id_variant_detail){
 this.id_variant_detail=id_variant_detail;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBedrag_supplement(double bedrag_supplement){
 this.bedrag_supplement=bedrag_supplement;
 }
public void setSupplement_per_eenheid(boolean supplement_per_eenheid){
 this.supplement_per_eenheid=supplement_per_eenheid;
 }
public void setVanaf(String vanaf){
 this.vanaf=vanaf;
 }
public void setTem(String tem){
 this.tem=tem;
 }
}