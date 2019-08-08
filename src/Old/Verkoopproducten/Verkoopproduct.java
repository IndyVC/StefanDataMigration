package Old.Verkoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Verkoopproduct implements Old { 
private int id_bedrijf;
private int id_verkoopproduct;
private String id_convertieproduct;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private int id_verkoopproductgroep;
private String bestandsnaam_foto;
private Date inserted;
private Date updated;
private int cc;
private int id_recepteenheid;
private int id_receptingave;
private boolean voorraad;
private double voorraad_minimum;
private double voorraad_maximum;
private int eenheden_etiket;
private int recept_aantal_stuks;
private int recept_aantal_personen;
private int id_etiket;
private int id_voorraadplaats;
private boolean etiket;
private int aantal_stuks_verpakking;
private int id_verpakkingseenheid;
private int aantal_verpakkingen_colli;
private int aantal_collis_pallet;
private double huidige_verkoopprijs1;
private int id_vaste_kost;
private int id_onrechtstreekse_produktiekost;
private int id_winstmarge;
private int id_btwcode;
private double eenheidsgewicht;
private String bestandsnaam_logo;
private int id_private_label;
private boolean blokkeren;
private Date blokkeren_einddatum;
private String aantal_personen;
private boolean aantal_personen_variabel;
private int id_verpakkingseenheid2;
private String productbeschrijvingn;
private String productbeschrijvingf;
private String gebruiksaanwijzingn;
private String gebruiksaanwijzingf;
private double fysische_eigenschappen_gewicht_doel;
private String fysische_eigenschappen_gewicht_eenheid;
private double fysische_eigenschappen_gewicht_variatie;
private double fysische_eigenschappen_hoogte_doel;
private String fysische_eigenschappen_hoogte_eenheid;
private double fysische_eigenschappen_hoogte_variatie;
private double fysische_eigenschappen_lengte_doel;
private String fysische_eigenschappen_lengte_eenheid;
private double fysische_eigenschappen_lengte_variatie;
private double fysische_eigenschappen_breedte_doel;
private String fysische_eigenschappen_breedte_eenheid;
private double fysische_eigenschappen_breedte_variatie;
private double fysische_eigenschappen_diameter_doel;
private String fysische_eigenschappen_diameter_eenheid;
private double fysische_eigenschappen_diameter_variatie;
private String fysische_eigenschappen_kleurn;
private String fysische_eigenschappen_kleurf;
private String fysische_eigenschappen_afwerkingn;
private String fysische_eigenschappen_afwerkingf;
private int id_distributiewijze;
private int id_bewaarconditie;
private int id_bewaartemperatuur;
private int minimum_aantal_dagen_houdbaar;
private int id_microbiologische_parameter;
private int id_lotnummer_type;
private int id_lotnummer_drager;
private int id_lotnummer_aanbrenger;
private boolean goedgekeurdeingave01;
private boolean goedgekeurdeingave02;
private boolean goedgekeurdeingave03;
private boolean goedgekeurdeingave04;
private boolean goedgekeurdeingave05;
private boolean goedgekeurdeingave06;
private boolean goedgekeurdeingave07;
private boolean goedgekeurdeingave08;
private boolean goedgekeurdeingave09;
private double recept_percentage_bakverlies;
private double recept_percentage_verkoopverlies;
private String id_extern1;
private int id_variant_header;
private int id_option_header;
private int id_produktiegroep;
private boolean recept_wijzigbaar;
private String ingredienten;
private int id_verkoopeenheid;
private int id_barcodeprefix;
private double vaste_kost_per_eenheid;
private int volgorde;
private String id_convertieproduct_gelinkt;
private boolean moet_gewogen_worden;
private double maximaal_meetgewicht;
private double relatieve_marge;
private double absolute_marge;
private boolean lijn_na_produktielijst;
private boolean arcering_op_produktielijst;
private boolean online_beschikbaar;
private Date online_laatst_aangemaakt;
private String omschrijving_voorraadplaats;
private boolean voorraad_maandag;
private boolean voorraad_dinsdag;
private boolean voorraad_woensdag;
private boolean voorraad_donderdag;
private boolean voorraad_vrijdag;
private boolean voorraad_zaterdag;
private boolean voorraad_zondag;
private boolean dagproduktie;
private int id_job;
private int job_volgnummer;
private String omschrijvinge;
private int broodparameter;
private String ingredientenn;
private String ingredientenf;
private String ingredientene;
private int excel_produktie_blad;
private String excel_produktie_kolom;
private int excel_produktie_rij;
private int id_verkoopsverpakking;
private String gtin_verpakking;
private String gtin_colli;
private String gtin_palet;
private boolean afdrukken_etiket_verpakking;
private boolean afdrukken_etiket_colli;
private boolean afdrukken_etiket_palet;
private int vermelding_leveringsbon;

public Verkoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopproduct = Util.Int(data[1]);
this.id_convertieproduct = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.zoekomschrijving = data[5];
this.id_verkoopproductgroep = Util.Int(data[6]);
this.bestandsnaam_foto = data[7];
this.inserted = Util.Date(data[8]);
this.updated = Util.Date(data[9]);
this.cc = Util.Int(data[10]);
this.id_recepteenheid = Util.Int(data[11]);
this.id_receptingave = Util.Int(data[12]);
this.voorraad = Util.Boolean(data[13]);
this.voorraad_minimum = Util.Double(data[14]);
this.voorraad_maximum = Util.Double(data[15]);
this.eenheden_etiket = Util.Int(data[16]);
this.recept_aantal_stuks = Util.Int(data[17]);
this.recept_aantal_personen = Util.Int(data[18]);
this.id_etiket = Util.Int(data[19]);
this.id_voorraadplaats = Util.Int(data[20]);
this.etiket = Util.Boolean(data[21]);
this.aantal_stuks_verpakking = Util.Int(data[22]);
this.id_verpakkingseenheid = Util.Int(data[23]);
this.aantal_verpakkingen_colli = Util.Int(data[24]);
this.aantal_collis_pallet = Util.Int(data[25]);
this.huidige_verkoopprijs1 = Util.Double(data[26]);
this.id_vaste_kost = Util.Int(data[27]);
this.id_onrechtstreekse_produktiekost = Util.Int(data[28]);
this.id_winstmarge = Util.Int(data[29]);
this.id_btwcode = Util.Int(data[30]);
this.eenheidsgewicht = Util.Double(data[31]);
this.bestandsnaam_logo = data[32];
this.id_private_label = Util.Int(data[33]);
this.blokkeren = Util.Boolean(data[34]);
this.blokkeren_einddatum = Util.Date(data[35]);
this.aantal_personen = data[36];
this.aantal_personen_variabel = Util.Boolean(data[37]);
this.id_verpakkingseenheid2 = Util.Int(data[38]);
this.productbeschrijvingn = data[39];
this.productbeschrijvingf = data[40];
this.gebruiksaanwijzingn = data[41];
this.gebruiksaanwijzingf = data[42];
this.fysische_eigenschappen_gewicht_doel = Util.Double(data[43]);
this.fysische_eigenschappen_gewicht_eenheid = data[44];
this.fysische_eigenschappen_gewicht_variatie = Util.Double(data[45]);
this.fysische_eigenschappen_hoogte_doel = Util.Double(data[46]);
this.fysische_eigenschappen_hoogte_eenheid = data[47];
this.fysische_eigenschappen_hoogte_variatie = Util.Double(data[48]);
this.fysische_eigenschappen_lengte_doel = Util.Double(data[49]);
this.fysische_eigenschappen_lengte_eenheid = data[50];
this.fysische_eigenschappen_lengte_variatie = Util.Double(data[51]);
this.fysische_eigenschappen_breedte_doel = Util.Double(data[52]);
this.fysische_eigenschappen_breedte_eenheid = data[53];
this.fysische_eigenschappen_breedte_variatie = Util.Double(data[54]);
this.fysische_eigenschappen_diameter_doel = Util.Double(data[55]);
this.fysische_eigenschappen_diameter_eenheid = data[56];
this.fysische_eigenschappen_diameter_variatie = Util.Double(data[57]);
this.fysische_eigenschappen_kleurn = data[58];
this.fysische_eigenschappen_kleurf = data[59];
this.fysische_eigenschappen_afwerkingn = data[60];
this.fysische_eigenschappen_afwerkingf = data[61];
this.id_distributiewijze = Util.Int(data[62]);
this.id_bewaarconditie = Util.Int(data[63]);
this.id_bewaartemperatuur = Util.Int(data[64]);
this.minimum_aantal_dagen_houdbaar = Util.Int(data[65]);
this.id_microbiologische_parameter = Util.Int(data[66]);
this.id_lotnummer_type = Util.Int(data[67]);
this.id_lotnummer_drager = Util.Int(data[68]);
this.id_lotnummer_aanbrenger = Util.Int(data[69]);
this.goedgekeurdeingave01 = Util.Boolean(data[70]);
this.goedgekeurdeingave02 = Util.Boolean(data[71]);
this.goedgekeurdeingave03 = Util.Boolean(data[72]);
this.goedgekeurdeingave04 = Util.Boolean(data[73]);
this.goedgekeurdeingave05 = Util.Boolean(data[74]);
this.goedgekeurdeingave06 = Util.Boolean(data[75]);
this.goedgekeurdeingave07 = Util.Boolean(data[76]);
this.goedgekeurdeingave08 = Util.Boolean(data[77]);
this.goedgekeurdeingave09 = Util.Boolean(data[78]);
this.recept_percentage_bakverlies = Util.Double(data[79]);
this.recept_percentage_verkoopverlies = Util.Double(data[80]);
this.id_extern1 = data[81];
this.id_variant_header = Util.Int(data[82]);
this.id_option_header = Util.Int(data[83]);
this.id_produktiegroep = Util.Int(data[84]);
this.recept_wijzigbaar = Util.Boolean(data[85]);
this.ingredienten = data[86];
this.id_verkoopeenheid = Util.Int(data[87]);
this.id_barcodeprefix = Util.Int(data[88]);
this.vaste_kost_per_eenheid = Util.Double(data[89]);
this.volgorde = Util.Int(data[90]);
this.id_convertieproduct_gelinkt = data[91];
this.moet_gewogen_worden = Util.Boolean(data[92]);
this.maximaal_meetgewicht = Util.Double(data[93]);
this.relatieve_marge = Util.Double(data[94]);
this.absolute_marge = Util.Double(data[95]);
this.lijn_na_produktielijst = Util.Boolean(data[96]);
this.arcering_op_produktielijst = Util.Boolean(data[97]);
this.online_beschikbaar = Util.Boolean(data[98]);
this.online_laatst_aangemaakt = Util.Date(data[99]);
this.omschrijving_voorraadplaats = data[100];
this.voorraad_maandag = Util.Boolean(data[101]);
this.voorraad_dinsdag = Util.Boolean(data[102]);
this.voorraad_woensdag = Util.Boolean(data[103]);
this.voorraad_donderdag = Util.Boolean(data[104]);
this.voorraad_vrijdag = Util.Boolean(data[105]);
this.voorraad_zaterdag = Util.Boolean(data[106]);
this.voorraad_zondag = Util.Boolean(data[107]);
this.dagproduktie = Util.Boolean(data[108]);
this.id_job = Util.Int(data[109]);
this.job_volgnummer = Util.Int(data[110]);
this.omschrijvinge = data[111];
this.broodparameter = Util.Int(data[112]);
this.ingredientenn = data[113];
this.ingredientenf = data[114];
this.ingredientene = data[115];
this.excel_produktie_blad = Util.Int(data[116]);
this.excel_produktie_kolom = data[117];
this.excel_produktie_rij = Util.Int(data[118]);
this.id_verkoopsverpakking = Util.Int(data[119]);
this.gtin_verpakking = data[120];
this.gtin_colli = data[121];
this.gtin_palet = data[122];
this.afdrukken_etiket_verpakking = Util.Boolean(data[123]);
this.afdrukken_etiket_colli = Util.Boolean(data[124]);
this.afdrukken_etiket_palet = Util.Boolean(data[125]);
this.vermelding_leveringsbon = Util.Int(data[126]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public String getId_convertieproduct() {
return this.id_convertieproduct;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getZoekomschrijving() {
return this.zoekomschrijving;
}
public int getId_verkoopproductgroep() {
return this.id_verkoopproductgroep;
}
public String getBestandsnaam_foto() {
return this.bestandsnaam_foto;
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
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public int getId_receptingave() {
return this.id_receptingave;
}
public boolean getVoorraad() {
return this.voorraad;
}
public double getVoorraad_minimum() {
return this.voorraad_minimum;
}
public double getVoorraad_maximum() {
return this.voorraad_maximum;
}
public int getEenheden_etiket() {
return this.eenheden_etiket;
}
public int getRecept_aantal_stuks() {
return this.recept_aantal_stuks;
}
public int getRecept_aantal_personen() {
return this.recept_aantal_personen;
}
public int getId_etiket() {
return this.id_etiket;
}
public int getId_voorraadplaats() {
return this.id_voorraadplaats;
}
public boolean getEtiket() {
return this.etiket;
}
public int getAantal_stuks_verpakking() {
return this.aantal_stuks_verpakking;
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public int getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public int getAantal_collis_pallet() {
return this.aantal_collis_pallet;
}
public double getHuidige_verkoopprijs1() {
return this.huidige_verkoopprijs1;
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
public int getId_btwcode() {
return this.id_btwcode;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public String getBestandsnaam_logo() {
return this.bestandsnaam_logo;
}
public int getId_private_label() {
return this.id_private_label;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getBlokkeren_einddatum() {
return this.blokkeren_einddatum;
}
public String getAantal_personen() {
return this.aantal_personen;
}
public boolean getAantal_personen_variabel() {
return this.aantal_personen_variabel;
}
public int getId_verpakkingseenheid2() {
return this.id_verpakkingseenheid2;
}
public String getProductbeschrijvingn() {
return this.productbeschrijvingn;
}
public String getProductbeschrijvingf() {
return this.productbeschrijvingf;
}
public String getGebruiksaanwijzingn() {
return this.gebruiksaanwijzingn;
}
public String getGebruiksaanwijzingf() {
return this.gebruiksaanwijzingf;
}
public double getFysische_eigenschappen_gewicht_doel() {
return this.fysische_eigenschappen_gewicht_doel;
}
public String getFysische_eigenschappen_gewicht_eenheid() {
return this.fysische_eigenschappen_gewicht_eenheid;
}
public double getFysische_eigenschappen_gewicht_variatie() {
return this.fysische_eigenschappen_gewicht_variatie;
}
public double getFysische_eigenschappen_hoogte_doel() {
return this.fysische_eigenschappen_hoogte_doel;
}
public String getFysische_eigenschappen_hoogte_eenheid() {
return this.fysische_eigenschappen_hoogte_eenheid;
}
public double getFysische_eigenschappen_hoogte_variatie() {
return this.fysische_eigenschappen_hoogte_variatie;
}
public double getFysische_eigenschappen_lengte_doel() {
return this.fysische_eigenschappen_lengte_doel;
}
public String getFysische_eigenschappen_lengte_eenheid() {
return this.fysische_eigenschappen_lengte_eenheid;
}
public double getFysische_eigenschappen_lengte_variatie() {
return this.fysische_eigenschappen_lengte_variatie;
}
public double getFysische_eigenschappen_breedte_doel() {
return this.fysische_eigenschappen_breedte_doel;
}
public String getFysische_eigenschappen_breedte_eenheid() {
return this.fysische_eigenschappen_breedte_eenheid;
}
public double getFysische_eigenschappen_breedte_variatie() {
return this.fysische_eigenschappen_breedte_variatie;
}
public double getFysische_eigenschappen_diameter_doel() {
return this.fysische_eigenschappen_diameter_doel;
}
public String getFysische_eigenschappen_diameter_eenheid() {
return this.fysische_eigenschappen_diameter_eenheid;
}
public double getFysische_eigenschappen_diameter_variatie() {
return this.fysische_eigenschappen_diameter_variatie;
}
public String getFysische_eigenschappen_kleurn() {
return this.fysische_eigenschappen_kleurn;
}
public String getFysische_eigenschappen_kleurf() {
return this.fysische_eigenschappen_kleurf;
}
public String getFysische_eigenschappen_afwerkingn() {
return this.fysische_eigenschappen_afwerkingn;
}
public String getFysische_eigenschappen_afwerkingf() {
return this.fysische_eigenschappen_afwerkingf;
}
public int getId_distributiewijze() {
return this.id_distributiewijze;
}
public int getId_bewaarconditie() {
return this.id_bewaarconditie;
}
public int getId_bewaartemperatuur() {
return this.id_bewaartemperatuur;
}
public int getMinimum_aantal_dagen_houdbaar() {
return this.minimum_aantal_dagen_houdbaar;
}
public int getId_microbiologische_parameter() {
return this.id_microbiologische_parameter;
}
public int getId_lotnummer_type() {
return this.id_lotnummer_type;
}
public int getId_lotnummer_drager() {
return this.id_lotnummer_drager;
}
public int getId_lotnummer_aanbrenger() {
return this.id_lotnummer_aanbrenger;
}
public boolean getGoedgekeurdeingave01() {
return this.goedgekeurdeingave01;
}
public boolean getGoedgekeurdeingave02() {
return this.goedgekeurdeingave02;
}
public boolean getGoedgekeurdeingave03() {
return this.goedgekeurdeingave03;
}
public boolean getGoedgekeurdeingave04() {
return this.goedgekeurdeingave04;
}
public boolean getGoedgekeurdeingave05() {
return this.goedgekeurdeingave05;
}
public boolean getGoedgekeurdeingave06() {
return this.goedgekeurdeingave06;
}
public boolean getGoedgekeurdeingave07() {
return this.goedgekeurdeingave07;
}
public boolean getGoedgekeurdeingave08() {
return this.goedgekeurdeingave08;
}
public boolean getGoedgekeurdeingave09() {
return this.goedgekeurdeingave09;
}
public double getRecept_percentage_bakverlies() {
return this.recept_percentage_bakverlies;
}
public double getRecept_percentage_verkoopverlies() {
return this.recept_percentage_verkoopverlies;
}
public String getId_extern1() {
return this.id_extern1;
}
public int getId_variant_header() {
return this.id_variant_header;
}
public int getId_option_header() {
return this.id_option_header;
}
public int getId_produktiegroep() {
return this.id_produktiegroep;
}
public boolean getRecept_wijzigbaar() {
return this.recept_wijzigbaar;
}
public String getIngredienten() {
return this.ingredienten;
}
public int getId_verkoopeenheid() {
return this.id_verkoopeenheid;
}
public int getId_barcodeprefix() {
return this.id_barcodeprefix;
}
public double getVaste_kost_per_eenheid() {
return this.vaste_kost_per_eenheid;
}
public int getVolgorde() {
return this.volgorde;
}
public String getId_convertieproduct_gelinkt() {
return this.id_convertieproduct_gelinkt;
}
public boolean getMoet_gewogen_worden() {
return this.moet_gewogen_worden;
}
public double getMaximaal_meetgewicht() {
return this.maximaal_meetgewicht;
}
public double getRelatieve_marge() {
return this.relatieve_marge;
}
public double getAbsolute_marge() {
return this.absolute_marge;
}
public boolean getLijn_na_produktielijst() {
return this.lijn_na_produktielijst;
}
public boolean getArcering_op_produktielijst() {
return this.arcering_op_produktielijst;
}
public boolean getOnline_beschikbaar() {
return this.online_beschikbaar;
}
public Date getOnline_laatst_aangemaakt() {
return this.online_laatst_aangemaakt;
}
public String getOmschrijving_voorraadplaats() {
return this.omschrijving_voorraadplaats;
}
public boolean getVoorraad_maandag() {
return this.voorraad_maandag;
}
public boolean getVoorraad_dinsdag() {
return this.voorraad_dinsdag;
}
public boolean getVoorraad_woensdag() {
return this.voorraad_woensdag;
}
public boolean getVoorraad_donderdag() {
return this.voorraad_donderdag;
}
public boolean getVoorraad_vrijdag() {
return this.voorraad_vrijdag;
}
public boolean getVoorraad_zaterdag() {
return this.voorraad_zaterdag;
}
public boolean getVoorraad_zondag() {
return this.voorraad_zondag;
}
public boolean getDagproduktie() {
return this.dagproduktie;
}
public int getId_job() {
return this.id_job;
}
public int getJob_volgnummer() {
return this.job_volgnummer;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public int getBroodparameter() {
return this.broodparameter;
}
public String getIngredientenn() {
return this.ingredientenn;
}
public String getIngredientenf() {
return this.ingredientenf;
}
public String getIngredientene() {
return this.ingredientene;
}
public int getExcel_produktie_blad() {
return this.excel_produktie_blad;
}
public String getExcel_produktie_kolom() {
return this.excel_produktie_kolom;
}
public int getExcel_produktie_rij() {
return this.excel_produktie_rij;
}
public int getId_verkoopsverpakking() {
return this.id_verkoopsverpakking;
}
public String getGtin_verpakking() {
return this.gtin_verpakking;
}
public String getGtin_colli() {
return this.gtin_colli;
}
public String getGtin_palet() {
return this.gtin_palet;
}
public boolean getAfdrukken_etiket_verpakking() {
return this.afdrukken_etiket_verpakking;
}
public boolean getAfdrukken_etiket_colli() {
return this.afdrukken_etiket_colli;
}
public boolean getAfdrukken_etiket_palet() {
return this.afdrukken_etiket_palet;
}
public int getVermelding_leveringsbon() {
return this.vermelding_leveringsbon;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setId_convertieproduct(String id_convertieproduct){
 this.id_convertieproduct=id_convertieproduct;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setZoekomschrijving(String zoekomschrijving){
 this.zoekomschrijving=zoekomschrijving;
 }
public void setId_verkoopproductgroep(int id_verkoopproductgroep){
 this.id_verkoopproductgroep=id_verkoopproductgroep;
 }
public void setBestandsnaam_foto(String bestandsnaam_foto){
 this.bestandsnaam_foto=bestandsnaam_foto;
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
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setId_receptingave(int id_receptingave){
 this.id_receptingave=id_receptingave;
 }
public void setVoorraad(boolean voorraad){
 this.voorraad=voorraad;
 }
public void setVoorraad_minimum(double voorraad_minimum){
 this.voorraad_minimum=voorraad_minimum;
 }
public void setVoorraad_maximum(double voorraad_maximum){
 this.voorraad_maximum=voorraad_maximum;
 }
public void setEenheden_etiket(int eenheden_etiket){
 this.eenheden_etiket=eenheden_etiket;
 }
public void setRecept_aantal_stuks(int recept_aantal_stuks){
 this.recept_aantal_stuks=recept_aantal_stuks;
 }
public void setRecept_aantal_personen(int recept_aantal_personen){
 this.recept_aantal_personen=recept_aantal_personen;
 }
public void setId_etiket(int id_etiket){
 this.id_etiket=id_etiket;
 }
public void setId_voorraadplaats(int id_voorraadplaats){
 this.id_voorraadplaats=id_voorraadplaats;
 }
public void setEtiket(boolean etiket){
 this.etiket=etiket;
 }
public void setAantal_stuks_verpakking(int aantal_stuks_verpakking){
 this.aantal_stuks_verpakking=aantal_stuks_verpakking;
 }
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setAantal_verpakkingen_colli(int aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
public void setAantal_collis_pallet(int aantal_collis_pallet){
 this.aantal_collis_pallet=aantal_collis_pallet;
 }
public void setHuidige_verkoopprijs1(double huidige_verkoopprijs1){
 this.huidige_verkoopprijs1=huidige_verkoopprijs1;
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
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setBestandsnaam_logo(String bestandsnaam_logo){
 this.bestandsnaam_logo=bestandsnaam_logo;
 }
public void setId_private_label(int id_private_label){
 this.id_private_label=id_private_label;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBlokkeren_einddatum(Date blokkeren_einddatum){
 this.blokkeren_einddatum=blokkeren_einddatum;
 }
public void setAantal_personen(String aantal_personen){
 this.aantal_personen=aantal_personen;
 }
public void setAantal_personen_variabel(boolean aantal_personen_variabel){
 this.aantal_personen_variabel=aantal_personen_variabel;
 }
public void setId_verpakkingseenheid2(int id_verpakkingseenheid2){
 this.id_verpakkingseenheid2=id_verpakkingseenheid2;
 }
public void setProductbeschrijvingn(String productbeschrijvingn){
 this.productbeschrijvingn=productbeschrijvingn;
 }
public void setProductbeschrijvingf(String productbeschrijvingf){
 this.productbeschrijvingf=productbeschrijvingf;
 }
public void setGebruiksaanwijzingn(String gebruiksaanwijzingn){
 this.gebruiksaanwijzingn=gebruiksaanwijzingn;
 }
public void setGebruiksaanwijzingf(String gebruiksaanwijzingf){
 this.gebruiksaanwijzingf=gebruiksaanwijzingf;
 }
public void setFysische_eigenschappen_gewicht_doel(double fysische_eigenschappen_gewicht_doel){
 this.fysische_eigenschappen_gewicht_doel=fysische_eigenschappen_gewicht_doel;
 }
public void setFysische_eigenschappen_gewicht_eenheid(String fysische_eigenschappen_gewicht_eenheid){
 this.fysische_eigenschappen_gewicht_eenheid=fysische_eigenschappen_gewicht_eenheid;
 }
public void setFysische_eigenschappen_gewicht_variatie(double fysische_eigenschappen_gewicht_variatie){
 this.fysische_eigenschappen_gewicht_variatie=fysische_eigenschappen_gewicht_variatie;
 }
public void setFysische_eigenschappen_hoogte_doel(double fysische_eigenschappen_hoogte_doel){
 this.fysische_eigenschappen_hoogte_doel=fysische_eigenschappen_hoogte_doel;
 }
public void setFysische_eigenschappen_hoogte_eenheid(String fysische_eigenschappen_hoogte_eenheid){
 this.fysische_eigenschappen_hoogte_eenheid=fysische_eigenschappen_hoogte_eenheid;
 }
public void setFysische_eigenschappen_hoogte_variatie(double fysische_eigenschappen_hoogte_variatie){
 this.fysische_eigenschappen_hoogte_variatie=fysische_eigenschappen_hoogte_variatie;
 }
public void setFysische_eigenschappen_lengte_doel(double fysische_eigenschappen_lengte_doel){
 this.fysische_eigenschappen_lengte_doel=fysische_eigenschappen_lengte_doel;
 }
public void setFysische_eigenschappen_lengte_eenheid(String fysische_eigenschappen_lengte_eenheid){
 this.fysische_eigenschappen_lengte_eenheid=fysische_eigenschappen_lengte_eenheid;
 }
public void setFysische_eigenschappen_lengte_variatie(double fysische_eigenschappen_lengte_variatie){
 this.fysische_eigenschappen_lengte_variatie=fysische_eigenschappen_lengte_variatie;
 }
public void setFysische_eigenschappen_breedte_doel(double fysische_eigenschappen_breedte_doel){
 this.fysische_eigenschappen_breedte_doel=fysische_eigenschappen_breedte_doel;
 }
public void setFysische_eigenschappen_breedte_eenheid(String fysische_eigenschappen_breedte_eenheid){
 this.fysische_eigenschappen_breedte_eenheid=fysische_eigenschappen_breedte_eenheid;
 }
public void setFysische_eigenschappen_breedte_variatie(double fysische_eigenschappen_breedte_variatie){
 this.fysische_eigenschappen_breedte_variatie=fysische_eigenschappen_breedte_variatie;
 }
public void setFysische_eigenschappen_diameter_doel(double fysische_eigenschappen_diameter_doel){
 this.fysische_eigenschappen_diameter_doel=fysische_eigenschappen_diameter_doel;
 }
public void setFysische_eigenschappen_diameter_eenheid(String fysische_eigenschappen_diameter_eenheid){
 this.fysische_eigenschappen_diameter_eenheid=fysische_eigenschappen_diameter_eenheid;
 }
public void setFysische_eigenschappen_diameter_variatie(double fysische_eigenschappen_diameter_variatie){
 this.fysische_eigenschappen_diameter_variatie=fysische_eigenschappen_diameter_variatie;
 }
public void setFysische_eigenschappen_kleurn(String fysische_eigenschappen_kleurn){
 this.fysische_eigenschappen_kleurn=fysische_eigenschappen_kleurn;
 }
public void setFysische_eigenschappen_kleurf(String fysische_eigenschappen_kleurf){
 this.fysische_eigenschappen_kleurf=fysische_eigenschappen_kleurf;
 }
public void setFysische_eigenschappen_afwerkingn(String fysische_eigenschappen_afwerkingn){
 this.fysische_eigenschappen_afwerkingn=fysische_eigenschappen_afwerkingn;
 }
public void setFysische_eigenschappen_afwerkingf(String fysische_eigenschappen_afwerkingf){
 this.fysische_eigenschappen_afwerkingf=fysische_eigenschappen_afwerkingf;
 }
public void setId_distributiewijze(int id_distributiewijze){
 this.id_distributiewijze=id_distributiewijze;
 }
public void setId_bewaarconditie(int id_bewaarconditie){
 this.id_bewaarconditie=id_bewaarconditie;
 }
public void setId_bewaartemperatuur(int id_bewaartemperatuur){
 this.id_bewaartemperatuur=id_bewaartemperatuur;
 }
public void setMinimum_aantal_dagen_houdbaar(int minimum_aantal_dagen_houdbaar){
 this.minimum_aantal_dagen_houdbaar=minimum_aantal_dagen_houdbaar;
 }
public void setId_microbiologische_parameter(int id_microbiologische_parameter){
 this.id_microbiologische_parameter=id_microbiologische_parameter;
 }
public void setId_lotnummer_type(int id_lotnummer_type){
 this.id_lotnummer_type=id_lotnummer_type;
 }
public void setId_lotnummer_drager(int id_lotnummer_drager){
 this.id_lotnummer_drager=id_lotnummer_drager;
 }
public void setId_lotnummer_aanbrenger(int id_lotnummer_aanbrenger){
 this.id_lotnummer_aanbrenger=id_lotnummer_aanbrenger;
 }
public void setGoedgekeurdeingave01(boolean goedgekeurdeingave01){
 this.goedgekeurdeingave01=goedgekeurdeingave01;
 }
public void setGoedgekeurdeingave02(boolean goedgekeurdeingave02){
 this.goedgekeurdeingave02=goedgekeurdeingave02;
 }
public void setGoedgekeurdeingave03(boolean goedgekeurdeingave03){
 this.goedgekeurdeingave03=goedgekeurdeingave03;
 }
public void setGoedgekeurdeingave04(boolean goedgekeurdeingave04){
 this.goedgekeurdeingave04=goedgekeurdeingave04;
 }
public void setGoedgekeurdeingave05(boolean goedgekeurdeingave05){
 this.goedgekeurdeingave05=goedgekeurdeingave05;
 }
public void setGoedgekeurdeingave06(boolean goedgekeurdeingave06){
 this.goedgekeurdeingave06=goedgekeurdeingave06;
 }
public void setGoedgekeurdeingave07(boolean goedgekeurdeingave07){
 this.goedgekeurdeingave07=goedgekeurdeingave07;
 }
public void setGoedgekeurdeingave08(boolean goedgekeurdeingave08){
 this.goedgekeurdeingave08=goedgekeurdeingave08;
 }
public void setGoedgekeurdeingave09(boolean goedgekeurdeingave09){
 this.goedgekeurdeingave09=goedgekeurdeingave09;
 }
public void setRecept_percentage_bakverlies(double recept_percentage_bakverlies){
 this.recept_percentage_bakverlies=recept_percentage_bakverlies;
 }
public void setRecept_percentage_verkoopverlies(double recept_percentage_verkoopverlies){
 this.recept_percentage_verkoopverlies=recept_percentage_verkoopverlies;
 }
public void setId_extern1(String id_extern1){
 this.id_extern1=id_extern1;
 }
public void setId_variant_header(int id_variant_header){
 this.id_variant_header=id_variant_header;
 }
public void setId_option_header(int id_option_header){
 this.id_option_header=id_option_header;
 }
public void setId_produktiegroep(int id_produktiegroep){
 this.id_produktiegroep=id_produktiegroep;
 }
public void setRecept_wijzigbaar(boolean recept_wijzigbaar){
 this.recept_wijzigbaar=recept_wijzigbaar;
 }
public void setIngredienten(String ingredienten){
 this.ingredienten=ingredienten;
 }
public void setId_verkoopeenheid(int id_verkoopeenheid){
 this.id_verkoopeenheid=id_verkoopeenheid;
 }
public void setId_barcodeprefix(int id_barcodeprefix){
 this.id_barcodeprefix=id_barcodeprefix;
 }
public void setVaste_kost_per_eenheid(double vaste_kost_per_eenheid){
 this.vaste_kost_per_eenheid=vaste_kost_per_eenheid;
 }
public void setVolgorde(int volgorde){
 this.volgorde=volgorde;
 }
public void setId_convertieproduct_gelinkt(String id_convertieproduct_gelinkt){
 this.id_convertieproduct_gelinkt=id_convertieproduct_gelinkt;
 }
public void setMoet_gewogen_worden(boolean moet_gewogen_worden){
 this.moet_gewogen_worden=moet_gewogen_worden;
 }
public void setMaximaal_meetgewicht(double maximaal_meetgewicht){
 this.maximaal_meetgewicht=maximaal_meetgewicht;
 }
public void setRelatieve_marge(double relatieve_marge){
 this.relatieve_marge=relatieve_marge;
 }
public void setAbsolute_marge(double absolute_marge){
 this.absolute_marge=absolute_marge;
 }
public void setLijn_na_produktielijst(boolean lijn_na_produktielijst){
 this.lijn_na_produktielijst=lijn_na_produktielijst;
 }
public void setArcering_op_produktielijst(boolean arcering_op_produktielijst){
 this.arcering_op_produktielijst=arcering_op_produktielijst;
 }
public void setOnline_beschikbaar(boolean online_beschikbaar){
 this.online_beschikbaar=online_beschikbaar;
 }
public void setOnline_laatst_aangemaakt(Date online_laatst_aangemaakt){
 this.online_laatst_aangemaakt=online_laatst_aangemaakt;
 }
public void setOmschrijving_voorraadplaats(String omschrijving_voorraadplaats){
 this.omschrijving_voorraadplaats=omschrijving_voorraadplaats;
 }
public void setVoorraad_maandag(boolean voorraad_maandag){
 this.voorraad_maandag=voorraad_maandag;
 }
public void setVoorraad_dinsdag(boolean voorraad_dinsdag){
 this.voorraad_dinsdag=voorraad_dinsdag;
 }
public void setVoorraad_woensdag(boolean voorraad_woensdag){
 this.voorraad_woensdag=voorraad_woensdag;
 }
public void setVoorraad_donderdag(boolean voorraad_donderdag){
 this.voorraad_donderdag=voorraad_donderdag;
 }
public void setVoorraad_vrijdag(boolean voorraad_vrijdag){
 this.voorraad_vrijdag=voorraad_vrijdag;
 }
public void setVoorraad_zaterdag(boolean voorraad_zaterdag){
 this.voorraad_zaterdag=voorraad_zaterdag;
 }
public void setVoorraad_zondag(boolean voorraad_zondag){
 this.voorraad_zondag=voorraad_zondag;
 }
public void setDagproduktie(boolean dagproduktie){
 this.dagproduktie=dagproduktie;
 }
public void setId_job(int id_job){
 this.id_job=id_job;
 }
public void setJob_volgnummer(int job_volgnummer){
 this.job_volgnummer=job_volgnummer;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
public void setBroodparameter(int broodparameter){
 this.broodparameter=broodparameter;
 }
public void setIngredientenn(String ingredientenn){
 this.ingredientenn=ingredientenn;
 }
public void setIngredientenf(String ingredientenf){
 this.ingredientenf=ingredientenf;
 }
public void setIngredientene(String ingredientene){
 this.ingredientene=ingredientene;
 }
public void setExcel_produktie_blad(int excel_produktie_blad){
 this.excel_produktie_blad=excel_produktie_blad;
 }
public void setExcel_produktie_kolom(String excel_produktie_kolom){
 this.excel_produktie_kolom=excel_produktie_kolom;
 }
public void setExcel_produktie_rij(int excel_produktie_rij){
 this.excel_produktie_rij=excel_produktie_rij;
 }
public void setId_verkoopsverpakking(int id_verkoopsverpakking){
 this.id_verkoopsverpakking=id_verkoopsverpakking;
 }
public void setGtin_verpakking(String gtin_verpakking){
 this.gtin_verpakking=gtin_verpakking;
 }
public void setGtin_colli(String gtin_colli){
 this.gtin_colli=gtin_colli;
 }
public void setGtin_palet(String gtin_palet){
 this.gtin_palet=gtin_palet;
 }
public void setAfdrukken_etiket_verpakking(boolean afdrukken_etiket_verpakking){
 this.afdrukken_etiket_verpakking=afdrukken_etiket_verpakking;
 }
public void setAfdrukken_etiket_colli(boolean afdrukken_etiket_colli){
 this.afdrukken_etiket_colli=afdrukken_etiket_colli;
 }
public void setAfdrukken_etiket_palet(boolean afdrukken_etiket_palet){
 this.afdrukken_etiket_palet=afdrukken_etiket_palet;
 }
public void setVermelding_leveringsbon(int vermelding_leveringsbon){
 this.vermelding_leveringsbon=vermelding_leveringsbon;
 }
}