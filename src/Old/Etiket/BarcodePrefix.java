package Old.Etiket;
import Old.Old;
import Utils.Util;

public class BarcodePrefix implements Old { 
private int id_bedrijf;
private int id_barcodeprefix;
private String omschrijvingn;
private String omschrijvingf;
private String positie_van_tot_artikelcode;
private String positie_van_tot_verkoopprijs;
private String invoeggetal;
private int etikettype;
private int cc;

public BarcodePrefix(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_barcodeprefix = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.positie_van_tot_artikelcode = data[4];
this.positie_van_tot_verkoopprijs = data[5];
this.invoeggetal = data[6];
this.etikettype = Util.Int(data[7]);
this.cc = Util.Int(data[8]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_barcodeprefix() {
return this.id_barcodeprefix;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getPositie_van_tot_artikelcode() {
return this.positie_van_tot_artikelcode;
}
public String getPositie_van_tot_verkoopprijs() {
return this.positie_van_tot_verkoopprijs;
}
public String getInvoeggetal() {
return this.invoeggetal;
}
public int getEtikettype() {
return this.etikettype;
}
public int getCc() {
return this.cc;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_barcodeprefix(int id_barcodeprefix){
 this.id_barcodeprefix=id_barcodeprefix;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setPositie_van_tot_artikelcode(String positie_van_tot_artikelcode){
 this.positie_van_tot_artikelcode=positie_van_tot_artikelcode;
 }
public void setPositie_van_tot_verkoopprijs(String positie_van_tot_verkoopprijs){
 this.positie_van_tot_verkoopprijs=positie_van_tot_verkoopprijs;
 }
public void setInvoeggetal(String invoeggetal){
 this.invoeggetal=invoeggetal;
 }
public void setEtikettype(int etikettype){
 this.etikettype=etikettype;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}