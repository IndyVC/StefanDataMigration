package Old;
import Utils.Util;

public class VariantHoofding implements Old { 
private int id_bedrijf;
private int id_variant_header;
private String id_convertie;
private String omschrijvingn;
private String omschrijvingf;
private int cc;
private boolean blokkeren;

public VariantHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_variant_header = Util.Int(data[1]);
this.id_convertie = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.cc = Util.Int(data[5]);
this.blokkeren = Util.Boolean(data[6]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_variant_header() {
return this.id_variant_header;
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
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
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
}