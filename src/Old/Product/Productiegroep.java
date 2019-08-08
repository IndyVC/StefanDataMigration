package Old.Product;
import Old.Old;
import Utils.Util;

public class Productiegroep implements Old { 
private int id_produktiegroep;
private String omschrijvingn;
private String omschrijvingf;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private boolean afdrukkenreceptenlijst;
private int cc;
private String id_convertie;
private int id_bedrijf;
private int id_vaste_kost;
private int id_onrechtstreekse_produktiekost;
private boolean opmerking_meenemen;

public Productiegroep(String[] data){
this.id_produktiegroep = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.id_algemene_rekening_type = Util.Int(data[3]);
this.id_algemene_rekening = Util.Int(data[4]);
this.afdrukkenreceptenlijst = Util.Boolean(data[5]);
this.cc = Util.Int(data[6]);
this.id_convertie = data[7];
this.id_bedrijf = Util.Int(data[8]);
this.id_vaste_kost = Util.Int(data[9]);
this.id_onrechtstreekse_produktiekost = Util.Int(data[10]);
this.opmerking_meenemen = Util.Boolean(data[11]);
}
public int getId_produktiegroep() {
return this.id_produktiegroep;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public int getId_algemene_rekening_type() {
return this.id_algemene_rekening_type;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public boolean getAfdrukkenreceptenlijst() {
return this.afdrukkenreceptenlijst;
}
public int getCc() {
return this.cc;
}
public String getId_convertie() {
return this.id_convertie;
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_vaste_kost() {
return this.id_vaste_kost;
}
public int getId_onrechtstreekse_produktiekost() {
return this.id_onrechtstreekse_produktiekost;
}
public boolean getOpmerking_meenemen() {
return this.opmerking_meenemen;
}
public void setId_produktiegroep(int id_produktiegroep){
 this.id_produktiegroep=id_produktiegroep;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setId_algemene_rekening_type(int id_algemene_rekening_type){
 this.id_algemene_rekening_type=id_algemene_rekening_type;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setAfdrukkenreceptenlijst(boolean afdrukkenreceptenlijst){
 this.afdrukkenreceptenlijst=afdrukkenreceptenlijst;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_convertie(String id_convertie){
 this.id_convertie=id_convertie;
 }
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_vaste_kost(int id_vaste_kost){
 this.id_vaste_kost=id_vaste_kost;
 }
public void setId_onrechtstreekse_produktiekost(int id_onrechtstreekse_produktiekost){
 this.id_onrechtstreekse_produktiekost=id_onrechtstreekse_produktiekost;
 }
public void setOpmerking_meenemen(boolean opmerking_meenemen){
 this.opmerking_meenemen=opmerking_meenemen;
 }
}