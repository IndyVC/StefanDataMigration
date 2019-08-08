package Old.Verkoopproducten;
import Old.Old;
import Utils.Util;

public class Verkoopproductgroep implements Old { 
private int id_bedrijf;
private int id_verkoopproductgroep;
private String id_convertie;
private String omschrijvingn;
private String omschrijvingf;
private String folder_afbeeldingen;
private int cc;
private int id_vaste_kost;
private int id_onrechtstreekse_produktiekost;
private int id_winstmarge;
private boolean online1;
private String id_extern1;
private int default_produktiegroep;

public Verkoopproductgroep(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopproductgroep = Util.Int(data[1]);
this.id_convertie = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.folder_afbeeldingen = data[5];
this.cc = Util.Int(data[6]);
this.id_vaste_kost = Util.Int(data[7]);
this.id_onrechtstreekse_produktiekost = Util.Int(data[8]);
this.id_winstmarge = Util.Int(data[9]);
this.online1 = Util.Boolean(data[10]);
this.id_extern1 = data[11];
this.default_produktiegroep = Util.Int(data[12]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopproductgroep() {
return this.id_verkoopproductgroep;
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
public String getFolder_afbeeldingen() {
return this.folder_afbeeldingen;
}
public int getCc() {
return this.cc;
}
public int getId_vaste_kost() {
return this.id_vaste_kost;
}
public int getId_onrechtstreekse_produktiekost() {
return this.id_onrechtstreekse_produktiekost;
}
public int getId_winstmarge() {
return this.id_winstmarge;
}
public boolean getOnline1() {
return this.online1;
}
public String getId_extern1() {
return this.id_extern1;
}
public int getDefault_produktiegroep() {
return this.default_produktiegroep;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verkoopproductgroep(int id_verkoopproductgroep){
 this.id_verkoopproductgroep=id_verkoopproductgroep;
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
public void setFolder_afbeeldingen(String folder_afbeeldingen){
 this.folder_afbeeldingen=folder_afbeeldingen;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_vaste_kost(int id_vaste_kost){
 this.id_vaste_kost=id_vaste_kost;
 }
public void setId_onrechtstreekse_produktiekost(int id_onrechtstreekse_produktiekost){
 this.id_onrechtstreekse_produktiekost=id_onrechtstreekse_produktiekost;
 }
public void setId_winstmarge(int id_winstmarge){
 this.id_winstmarge=id_winstmarge;
 }
public void setOnline1(boolean online1){
 this.online1=online1;
 }
public void setId_extern1(String id_extern1){
 this.id_extern1=id_extern1;
 }
public void setDefault_produktiegroep(int default_produktiegroep){
 this.default_produktiegroep=default_produktiegroep;
 }
}