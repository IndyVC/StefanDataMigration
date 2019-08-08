package Old.Parameters;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class ParameterProductielijst implements Old { 
private int id_bedrijf;
private int id_produktielijst;
private String omschrijvingn;
private String omschrijvingf;
private String list_produktiegroepen;
private boolean nieuw_blad_per_produktiegroep;
private int code_eigen_fabrikaat;
private boolean afdrukken_voorraad_producten;
private boolean afdrukken_voorraad_hoeveelheid;
private boolean afdrukken_maandag;
private boolean afdrukken_dinsdag;
private boolean afdrukken_woensdag;
private boolean afdrukken_donderdag;
private boolean afdrukken_vrijdag;
private boolean afdrukken_zaterdag;
private boolean afdrukken_zondag;
private boolean afdrukken_opmerkingen;
private int id_printer;
private Date inserted;
private Date updated;
private boolean dagproduktie;
private boolean uit_voorraad;
private boolean in_voorraad;
private boolean afdrukken_hoeveelheid1;
private boolean afdrukken_hoeveelheid2;
private boolean afdrukken_hoeveelheid3;
private boolean afdrukken_hoeveelheid4;
private boolean afdrukken_hoeveelheid5;
private boolean afdrukken_hoeveelheid6;
private boolean afdrukken_hoeveelheid7;
private boolean afdrukken_hoeveelheid8;
private boolean afdrukken_hoeveelheid9;
private int id_afdrukkenop;
private int id_soortafdruk;
private boolean enkel_gesneden_brood;
private boolean prijzen_vermelden;

public ParameterProductielijst(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktielijst = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.list_produktiegroepen = data[4];
this.nieuw_blad_per_produktiegroep = Util.Boolean(data[5]);
this.code_eigen_fabrikaat = Util.Int(data[6]);
this.afdrukken_voorraad_producten = Util.Boolean(data[7]);
this.afdrukken_voorraad_hoeveelheid = Util.Boolean(data[8]);
this.afdrukken_maandag = Util.Boolean(data[9]);
this.afdrukken_dinsdag = Util.Boolean(data[10]);
this.afdrukken_woensdag = Util.Boolean(data[11]);
this.afdrukken_donderdag = Util.Boolean(data[12]);
this.afdrukken_vrijdag = Util.Boolean(data[13]);
this.afdrukken_zaterdag = Util.Boolean(data[14]);
this.afdrukken_zondag = Util.Boolean(data[15]);
this.afdrukken_opmerkingen = Util.Boolean(data[16]);
this.id_printer = Util.Int(data[17]);
this.inserted = Util.Date(data[18]);
this.updated = Util.Date(data[19]);
this.dagproduktie = Util.Boolean(data[20]);
this.uit_voorraad = Util.Boolean(data[21]);
this.in_voorraad = Util.Boolean(data[22]);
this.afdrukken_hoeveelheid1 = Util.Boolean(data[23]);
this.afdrukken_hoeveelheid2 = Util.Boolean(data[24]);
this.afdrukken_hoeveelheid3 = Util.Boolean(data[25]);
this.afdrukken_hoeveelheid4 = Util.Boolean(data[26]);
this.afdrukken_hoeveelheid5 = Util.Boolean(data[27]);
this.afdrukken_hoeveelheid6 = Util.Boolean(data[28]);
this.afdrukken_hoeveelheid7 = Util.Boolean(data[29]);
this.afdrukken_hoeveelheid8 = Util.Boolean(data[30]);
this.afdrukken_hoeveelheid9 = Util.Boolean(data[31]);
this.id_afdrukkenop = Util.Int(data[32]);
this.id_soortafdruk = Util.Int(data[33]);
this.enkel_gesneden_brood = Util.Boolean(data[34]);
this.prijzen_vermelden = Util.Boolean(data[35]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktielijst() {
return this.id_produktielijst;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getList_produktiegroepen() {
return this.list_produktiegroepen;
}
public boolean getNieuw_blad_per_produktiegroep() {
return this.nieuw_blad_per_produktiegroep;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public boolean getAfdrukken_voorraad_producten() {
return this.afdrukken_voorraad_producten;
}
public boolean getAfdrukken_voorraad_hoeveelheid() {
return this.afdrukken_voorraad_hoeveelheid;
}
public boolean getAfdrukken_maandag() {
return this.afdrukken_maandag;
}
public boolean getAfdrukken_dinsdag() {
return this.afdrukken_dinsdag;
}
public boolean getAfdrukken_woensdag() {
return this.afdrukken_woensdag;
}
public boolean getAfdrukken_donderdag() {
return this.afdrukken_donderdag;
}
public boolean getAfdrukken_vrijdag() {
return this.afdrukken_vrijdag;
}
public boolean getAfdrukken_zaterdag() {
return this.afdrukken_zaterdag;
}
public boolean getAfdrukken_zondag() {
return this.afdrukken_zondag;
}
public boolean getAfdrukken_opmerkingen() {
return this.afdrukken_opmerkingen;
}
public int getId_printer() {
return this.id_printer;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public boolean getDagproduktie() {
return this.dagproduktie;
}
public boolean getUit_voorraad() {
return this.uit_voorraad;
}
public boolean getIn_voorraad() {
return this.in_voorraad;
}
public boolean getAfdrukken_hoeveelheid1() {
return this.afdrukken_hoeveelheid1;
}
public boolean getAfdrukken_hoeveelheid2() {
return this.afdrukken_hoeveelheid2;
}
public boolean getAfdrukken_hoeveelheid3() {
return this.afdrukken_hoeveelheid3;
}
public boolean getAfdrukken_hoeveelheid4() {
return this.afdrukken_hoeveelheid4;
}
public boolean getAfdrukken_hoeveelheid5() {
return this.afdrukken_hoeveelheid5;
}
public boolean getAfdrukken_hoeveelheid6() {
return this.afdrukken_hoeveelheid6;
}
public boolean getAfdrukken_hoeveelheid7() {
return this.afdrukken_hoeveelheid7;
}
public boolean getAfdrukken_hoeveelheid8() {
return this.afdrukken_hoeveelheid8;
}
public boolean getAfdrukken_hoeveelheid9() {
return this.afdrukken_hoeveelheid9;
}
public int getId_afdrukkenop() {
return this.id_afdrukkenop;
}
public int getId_soortafdruk() {
return this.id_soortafdruk;
}
public boolean getEnkel_gesneden_brood() {
return this.enkel_gesneden_brood;
}
public boolean getPrijzen_vermelden() {
return this.prijzen_vermelden;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktielijst(int id_produktielijst){
 this.id_produktielijst=id_produktielijst;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setList_produktiegroepen(String list_produktiegroepen){
 this.list_produktiegroepen=list_produktiegroepen;
 }
public void setNieuw_blad_per_produktiegroep(boolean nieuw_blad_per_produktiegroep){
 this.nieuw_blad_per_produktiegroep=nieuw_blad_per_produktiegroep;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setAfdrukken_voorraad_producten(boolean afdrukken_voorraad_producten){
 this.afdrukken_voorraad_producten=afdrukken_voorraad_producten;
 }
public void setAfdrukken_voorraad_hoeveelheid(boolean afdrukken_voorraad_hoeveelheid){
 this.afdrukken_voorraad_hoeveelheid=afdrukken_voorraad_hoeveelheid;
 }
public void setAfdrukken_maandag(boolean afdrukken_maandag){
 this.afdrukken_maandag=afdrukken_maandag;
 }
public void setAfdrukken_dinsdag(boolean afdrukken_dinsdag){
 this.afdrukken_dinsdag=afdrukken_dinsdag;
 }
public void setAfdrukken_woensdag(boolean afdrukken_woensdag){
 this.afdrukken_woensdag=afdrukken_woensdag;
 }
public void setAfdrukken_donderdag(boolean afdrukken_donderdag){
 this.afdrukken_donderdag=afdrukken_donderdag;
 }
public void setAfdrukken_vrijdag(boolean afdrukken_vrijdag){
 this.afdrukken_vrijdag=afdrukken_vrijdag;
 }
public void setAfdrukken_zaterdag(boolean afdrukken_zaterdag){
 this.afdrukken_zaterdag=afdrukken_zaterdag;
 }
public void setAfdrukken_zondag(boolean afdrukken_zondag){
 this.afdrukken_zondag=afdrukken_zondag;
 }
public void setAfdrukken_opmerkingen(boolean afdrukken_opmerkingen){
 this.afdrukken_opmerkingen=afdrukken_opmerkingen;
 }
public void setId_printer(int id_printer){
 this.id_printer=id_printer;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setDagproduktie(boolean dagproduktie){
 this.dagproduktie=dagproduktie;
 }
public void setUit_voorraad(boolean uit_voorraad){
 this.uit_voorraad=uit_voorraad;
 }
public void setIn_voorraad(boolean in_voorraad){
 this.in_voorraad=in_voorraad;
 }
public void setAfdrukken_hoeveelheid1(boolean afdrukken_hoeveelheid1){
 this.afdrukken_hoeveelheid1=afdrukken_hoeveelheid1;
 }
public void setAfdrukken_hoeveelheid2(boolean afdrukken_hoeveelheid2){
 this.afdrukken_hoeveelheid2=afdrukken_hoeveelheid2;
 }
public void setAfdrukken_hoeveelheid3(boolean afdrukken_hoeveelheid3){
 this.afdrukken_hoeveelheid3=afdrukken_hoeveelheid3;
 }
public void setAfdrukken_hoeveelheid4(boolean afdrukken_hoeveelheid4){
 this.afdrukken_hoeveelheid4=afdrukken_hoeveelheid4;
 }
public void setAfdrukken_hoeveelheid5(boolean afdrukken_hoeveelheid5){
 this.afdrukken_hoeveelheid5=afdrukken_hoeveelheid5;
 }
public void setAfdrukken_hoeveelheid6(boolean afdrukken_hoeveelheid6){
 this.afdrukken_hoeveelheid6=afdrukken_hoeveelheid6;
 }
public void setAfdrukken_hoeveelheid7(boolean afdrukken_hoeveelheid7){
 this.afdrukken_hoeveelheid7=afdrukken_hoeveelheid7;
 }
public void setAfdrukken_hoeveelheid8(boolean afdrukken_hoeveelheid8){
 this.afdrukken_hoeveelheid8=afdrukken_hoeveelheid8;
 }
public void setAfdrukken_hoeveelheid9(boolean afdrukken_hoeveelheid9){
 this.afdrukken_hoeveelheid9=afdrukken_hoeveelheid9;
 }
public void setId_afdrukkenop(int id_afdrukkenop){
 this.id_afdrukkenop=id_afdrukkenop;
 }
public void setId_soortafdruk(int id_soortafdruk){
 this.id_soortafdruk=id_soortafdruk;
 }
public void setEnkel_gesneden_brood(boolean enkel_gesneden_brood){
 this.enkel_gesneden_brood=enkel_gesneden_brood;
 }
public void setPrijzen_vermelden(boolean prijzen_vermelden){
 this.prijzen_vermelden=prijzen_vermelden;
 }
}