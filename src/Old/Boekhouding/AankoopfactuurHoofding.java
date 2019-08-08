package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class AankoopfactuurHoofding implements Old { 
private int id_bedrijf;
private int id_boekjaar;
private int id_dagboek;
private int id_factuur;
private boolean factuur_creditnota;
private Date boekingsdatum;
private int id_leverancier;
private int id_btwcode_leverancier;
private String extern_factuurnummer;
private Date factuurdatum;
private Date vervaldatum;
private double totaal_bedrag;
private double bedrag_btw;
private int id_muntcode;
private double wisselkoers;
private double totaal_bedrag_eigen_munt;
private double bedrag_btw_eigen_munt;
private String gestructureerde_mededeling;
private boolean ingelezen_zonder_fouten;
private boolean verzonden_naar_boekhouding;
private String inserted;
private String updated;
private String mededeling;
private int boekhoudperiode;
private String export_file;

public AankoopfactuurHoofding(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_boekjaar = Util.Int(data[1]);
this.id_dagboek = Util.Int(data[2]);
this.id_factuur = Util.Int(data[3]);
this.factuur_creditnota = Util.Boolean(data[4]);
this.boekingsdatum = Util.Date(data[5]);
this.id_leverancier = Util.Int(data[6]);
this.id_btwcode_leverancier = Util.Int(data[7]);
this.extern_factuurnummer = data[8];
this.factuurdatum = Util.Date(data[9]);
this.vervaldatum = Util.Date(data[10]);
this.totaal_bedrag = Util.Double(data[11]);
this.bedrag_btw = Util.Double(data[12]);
this.id_muntcode = Util.Int(data[13]);
this.wisselkoers = Util.Double(data[14]);
this.totaal_bedrag_eigen_munt = Util.Double(data[15]);
this.bedrag_btw_eigen_munt = Util.Double(data[16]);
this.gestructureerde_mededeling = data[17];
this.ingelezen_zonder_fouten = Util.Boolean(data[18]);
this.verzonden_naar_boekhouding = Util.Boolean(data[19]);
this.inserted = data[20];
this.updated = data[21];
this.mededeling = data[22];
this.boekhoudperiode = Util.Int(data[23]);
this.export_file = data[24];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_boekjaar() {
return this.id_boekjaar;
}
public int getId_dagboek() {
return this.id_dagboek;
}
public int getId_factuur() {
return this.id_factuur;
}
public boolean getFactuur_creditnota() {
return this.factuur_creditnota;
}
public Date getBoekingsdatum() {
return this.boekingsdatum;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public int getId_btwcode_leverancier() {
return this.id_btwcode_leverancier;
}
public String getExtern_factuurnummer() {
return this.extern_factuurnummer;
}
public Date getFactuurdatum() {
return this.factuurdatum;
}
public Date getVervaldatum() {
return this.vervaldatum;
}
public double getTotaal_bedrag() {
return this.totaal_bedrag;
}
public double getBedrag_btw() {
return this.bedrag_btw;
}
public int getId_muntcode() {
return this.id_muntcode;
}
public double getWisselkoers() {
return this.wisselkoers;
}
public double getTotaal_bedrag_eigen_munt() {
return this.totaal_bedrag_eigen_munt;
}
public double getBedrag_btw_eigen_munt() {
return this.bedrag_btw_eigen_munt;
}
public String getGestructureerde_mededeling() {
return this.gestructureerde_mededeling;
}
public boolean getIngelezen_zonder_fouten() {
return this.ingelezen_zonder_fouten;
}
public boolean getVerzonden_naar_boekhouding() {
return this.verzonden_naar_boekhouding;
}
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public String getMededeling() {
return this.mededeling;
}
public int getBoekhoudperiode() {
return this.boekhoudperiode;
}
public String getExport_file() {
return this.export_file;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_boekjaar(int id_boekjaar){
 this.id_boekjaar=id_boekjaar;
 }
public void setId_dagboek(int id_dagboek){
 this.id_dagboek=id_dagboek;
 }
public void setId_factuur(int id_factuur){
 this.id_factuur=id_factuur;
 }
public void setFactuur_creditnota(boolean factuur_creditnota){
 this.factuur_creditnota=factuur_creditnota;
 }
public void setBoekingsdatum(Date boekingsdatum){
 this.boekingsdatum=boekingsdatum;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setId_btwcode_leverancier(int id_btwcode_leverancier){
 this.id_btwcode_leverancier=id_btwcode_leverancier;
 }
public void setExtern_factuurnummer(String extern_factuurnummer){
 this.extern_factuurnummer=extern_factuurnummer;
 }
public void setFactuurdatum(Date factuurdatum){
 this.factuurdatum=factuurdatum;
 }
public void setVervaldatum(Date vervaldatum){
 this.vervaldatum=vervaldatum;
 }
public void setTotaal_bedrag(double totaal_bedrag){
 this.totaal_bedrag=totaal_bedrag;
 }
public void setBedrag_btw(double bedrag_btw){
 this.bedrag_btw=bedrag_btw;
 }
public void setId_muntcode(int id_muntcode){
 this.id_muntcode=id_muntcode;
 }
public void setWisselkoers(double wisselkoers){
 this.wisselkoers=wisselkoers;
 }
public void setTotaal_bedrag_eigen_munt(double totaal_bedrag_eigen_munt){
 this.totaal_bedrag_eigen_munt=totaal_bedrag_eigen_munt;
 }
public void setBedrag_btw_eigen_munt(double bedrag_btw_eigen_munt){
 this.bedrag_btw_eigen_munt=bedrag_btw_eigen_munt;
 }
public void setGestructureerde_mededeling(String gestructureerde_mededeling){
 this.gestructureerde_mededeling=gestructureerde_mededeling;
 }
public void setIngelezen_zonder_fouten(boolean ingelezen_zonder_fouten){
 this.ingelezen_zonder_fouten=ingelezen_zonder_fouten;
 }
public void setVerzonden_naar_boekhouding(boolean verzonden_naar_boekhouding){
 this.verzonden_naar_boekhouding=verzonden_naar_boekhouding;
 }
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setMededeling(String mededeling){
 this.mededeling=mededeling;
 }
public void setBoekhoudperiode(int boekhoudperiode){
 this.boekhoudperiode=boekhoudperiode;
 }
public void setExport_file(String export_file){
 this.export_file=export_file;
 }
}