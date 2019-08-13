package Old.Aankoopproducten;
import Old.Old;
import Utils.Util;
import java.math.BigDecimal;
import java.sql.Date;

public class Aankoopproduct implements Old { 
private int id_bedrijf;
private int id_aankoopproduct;
private String id_convertieproduct;
private String omschrijvingn;
private String omschrijvingf;
private String zoekomschrijving;
private int id_productcategorie;
private int id_productgroep;
private int id_productsubgroep;
private int id_bestelgroep;
private int id_verpakkingseenheid;
private int id_aankoopeenheid;
private int id_voorraadeenheid;
private int id_etiketteneenheid;
private double aantal_eenheden_verpakking;
private double aantal_verpakkingen_colli;
private double aantal_colli_palet;
private double nettogewicht_verpakkingseenheid;
private double brutogewicht_verpakkingseenheid;
private double minimum_bestelhoeveelheid;
private double veelvoud_bestelling;
private int minimum_leveringstermijn;
private int minimum_aantal_dagen_houdbaar;
private boolean voorraad;
private double voorraad_minimum;
private double voorraad_maximum;
private int id_voorraadplaats;
private int id_btwcode;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private int id_analytische_rekening_type;
private int id_analytische_rekening;
private boolean doorverkoop;
private boolean statistieken;
private boolean blokkeren;
private Date blokkeren_einddatum;
private String info;
private String link01;
private String link02;
private String link03;
private String link04;
private String link05;
private String link06;
private String link07;
private String Link08;
private String link09;
private String inserted;
private String updated;
private int cc;
private double eenheidsgewicht;
private String ingredienten;
private int id_basiseenheid;
private int id_collieenheid;
private int id_prijseenheid;
private int id_receptproduct;
private boolean etiket_intern;
private int id_etiket;
private String info_inhoud;
private int id_leveringstemperatuur;
private BigDecimal gtin;
private int id_online;
private boolean etiket_verkoopproduct;
private double etiket_verkoopproduct_percentage_ondergrens;
private double etiket_verkoopproduct_percentage_bovengrens;
private boolean etiket_verkoopproduct_ingredienten;
private double etiket_verkoopproduct_ingredienten_percentage_ondergrens;
private double etiket_verkoopproduct_ingredienten_percentage_bovengrens;
private String etiket_verkoopproduct_omschrijvingn;
private String etiket_verkoopproduct_omschrijvingf;
private int id_etiket_tekst;
private int id_fabrikant;
private String fabrikant_referentie_product;
private String link_technische_fiche;
private Date technische_fiche_datum;
private String technische_fiche_versie;
private double verliespercentage;
private boolean goedgekeurdeingave01;
private boolean goedgekeurdeingave02;
private boolean goedgekeurdeingave03;
private boolean goedgekeurdeingave04;
private boolean goedgekeurdeingave05;
private boolean goedgekeurdeingave06;
private boolean goedgekeurdeingave07;
private boolean goedgekeurdeingave08;
private boolean goedgekeurdeingave09;
private String bestandsnaam_foto;
private String colli_barcode;
private String identificerende_barcode;
private int volgnummer_bestelgroep;
private int id_verkoopproduct;
private int id_etiket_omschrijving;
private boolean onmiddellijk_in_gebruik;
private boolean etiket_verbruik;
private int id_etiket_verbruik;
private boolean beperkte_houdbaarheid_na_openen;
private int aantal_dagen_houdbaar_na_openen;
private int ingebruikname_per_eenheid;
private int aantal_loten_in_gebruik;
private String omschrijving_voorraadplaats;
private int id_voorraadplaats_in_gebruik;
private String omschrijving_voorraadplaats_in_gebruik;

public Aankoopproduct(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_aankoopproduct = Util.Int(data[1]);
this.id_convertieproduct = data[2];
this.omschrijvingn = data[3];
this.omschrijvingf = data[4];
this.zoekomschrijving = data[5];
this.id_productcategorie = Util.Int(data[6]);
this.id_productgroep = Util.Int(data[7]);
this.id_productsubgroep = Util.Int(data[8]);
this.id_bestelgroep = Util.Int(data[9]);
this.id_verpakkingseenheid = Util.Int(data[10]);
this.id_aankoopeenheid = Util.Int(data[11]);
this.id_voorraadeenheid = Util.Int(data[12]);
this.id_etiketteneenheid = Util.Int(data[13]);
this.aantal_eenheden_verpakking = Util.Double(data[14]);
this.aantal_verpakkingen_colli = Util.Double(data[15]);
this.aantal_colli_palet = Util.Double(data[16]);
this.nettogewicht_verpakkingseenheid = Util.Double(data[17]);
this.brutogewicht_verpakkingseenheid = Util.Double(data[18]);
this.minimum_bestelhoeveelheid = Util.Double(data[19]);
this.veelvoud_bestelling = Util.Double(data[20]);
this.minimum_leveringstermijn = Util.Int(data[21]);
this.minimum_aantal_dagen_houdbaar = Util.Int(data[22]);
this.voorraad = Util.Boolean(data[23]);
this.voorraad_minimum = Util.Double(data[24]);
this.voorraad_maximum = Util.Double(data[25]);
this.id_voorraadplaats = Util.Int(data[26]);
this.id_btwcode = Util.Int(data[27]);
this.id_algemene_rekening_type = Util.Int(data[28]);
this.id_algemene_rekening = Util.Int(data[29]);
this.id_analytische_rekening_type = Util.Int(data[30]);
this.id_analytische_rekening = Util.Int(data[31]);
this.doorverkoop = Util.Boolean(data[32]);
this.statistieken = Util.Boolean(data[33]);
this.blokkeren = Util.Boolean(data[34]);
this.blokkeren_einddatum = Util.Date(data[35]);
this.info = data[36];
this.link01 = data[37];
this.link02 = data[38];
this.link03 = data[39];
this.link04 = data[40];
this.link05 = data[41];
this.link06 = data[42];
this.link07 = data[43];
this.Link08 = data[44];
this.link09 = data[45];
this.inserted = data[46];
this.updated = data[47];
this.cc = Util.Int(data[48]);
this.eenheidsgewicht = Util.Double(data[49]);
this.ingredienten = data[50];
this.id_basiseenheid = Util.Int(data[51]);
this.id_collieenheid = Util.Int(data[52]);
this.id_prijseenheid = Util.Int(data[53]);
this.id_receptproduct = Util.Int(data[54]);
this.etiket_intern = Util.Boolean(data[55]);
this.id_etiket = Util.Int(data[56]);
this.info_inhoud = data[57];
this.id_leveringstemperatuur = Util.Int(data[58]);
this.gtin = Util.BigDecimal(data[59]);
this.id_online = Util.Int(data[60]);
this.etiket_verkoopproduct = Util.Boolean(data[61]);
this.etiket_verkoopproduct_percentage_ondergrens = Util.Double(data[62]);
this.etiket_verkoopproduct_percentage_bovengrens = Util.Double(data[63]);
this.etiket_verkoopproduct_ingredienten = Util.Boolean(data[64]);
this.etiket_verkoopproduct_ingredienten_percentage_ondergrens = Util.Double(data[65]);
this.etiket_verkoopproduct_ingredienten_percentage_bovengrens = Util.Double(data[66]);
this.etiket_verkoopproduct_omschrijvingn = data[67];
this.etiket_verkoopproduct_omschrijvingf = data[68];
this.id_etiket_tekst = Util.Int(data[69]);
this.id_fabrikant = Util.Int(data[70]);
this.fabrikant_referentie_product = data[71];
this.link_technische_fiche = data[72];
this.technische_fiche_datum = Util.Date(data[73]);
this.technische_fiche_versie = data[74];
this.verliespercentage = Util.Double(data[75]);
this.goedgekeurdeingave01 = Util.Boolean(data[76]);
this.goedgekeurdeingave02 = Util.Boolean(data[77]);
this.goedgekeurdeingave03 = Util.Boolean(data[78]);
this.goedgekeurdeingave04 = Util.Boolean(data[79]);
this.goedgekeurdeingave05 = Util.Boolean(data[80]);
this.goedgekeurdeingave06 = Util.Boolean(data[81]);
this.goedgekeurdeingave07 = Util.Boolean(data[82]);
this.goedgekeurdeingave08 = Util.Boolean(data[83]);
this.goedgekeurdeingave09 = Util.Boolean(data[84]);
this.bestandsnaam_foto = data[85];
this.colli_barcode = data[86];
this.identificerende_barcode = data[87];
this.volgnummer_bestelgroep = Util.Int(data[88]);
this.id_verkoopproduct = Util.Int(data[89]);
this.id_etiket_omschrijving = Util.Int(data[90]);
this.onmiddellijk_in_gebruik = Util.Boolean(data[91]);
this.etiket_verbruik = Util.Boolean(data[92]);
this.id_etiket_verbruik = Util.Int(data[93]);
this.beperkte_houdbaarheid_na_openen = Util.Boolean(data[94]);
this.aantal_dagen_houdbaar_na_openen = Util.Int(data[95]);
this.ingebruikname_per_eenheid = Util.Int(data[96]);
this.aantal_loten_in_gebruik = Util.Int(data[97]);
this.omschrijving_voorraadplaats = data[98];
this.id_voorraadplaats_in_gebruik = Util.Int(data[99]);
this.omschrijving_voorraadplaats_in_gebruik = data[100];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_aankoopproduct() {
return this.id_aankoopproduct;
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
public int getId_productcategorie() {
return this.id_productcategorie;
}
public int getId_productgroep() {
return this.id_productgroep;
}
public int getId_productsubgroep() {
return this.id_productsubgroep;
}
public int getId_bestelgroep() {
return this.id_bestelgroep;
}
public int getId_verpakkingseenheid() {
return this.id_verpakkingseenheid;
}
public int getId_aankoopeenheid() {
return this.id_aankoopeenheid;
}
public int getId_voorraadeenheid() {
return this.id_voorraadeenheid;
}
public int getId_etiketteneenheid() {
return this.id_etiketteneenheid;
}
public double getAantal_eenheden_verpakking() {
return this.aantal_eenheden_verpakking;
}
public double getAantal_verpakkingen_colli() {
return this.aantal_verpakkingen_colli;
}
public double getAantal_colli_palet() {
return this.aantal_colli_palet;
}
public double getNettogewicht_verpakkingseenheid() {
return this.nettogewicht_verpakkingseenheid;
}
public double getBrutogewicht_verpakkingseenheid() {
return this.brutogewicht_verpakkingseenheid;
}
public double getMinimum_bestelhoeveelheid() {
return this.minimum_bestelhoeveelheid;
}
public double getVeelvoud_bestelling() {
return this.veelvoud_bestelling;
}
public int getMinimum_leveringstermijn() {
return this.minimum_leveringstermijn;
}
public int getMinimum_aantal_dagen_houdbaar() {
return this.minimum_aantal_dagen_houdbaar;
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
public int getId_voorraadplaats() {
return this.id_voorraadplaats;
}
public int getId_btwcode() {
return this.id_btwcode;
}
public int getId_algemene_rekening_type() {
return this.id_algemene_rekening_type;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public int getId_analytische_rekening_type() {
return this.id_analytische_rekening_type;
}
public int getId_analytische_rekening() {
return this.id_analytische_rekening;
}
public boolean getDoorverkoop() {
return this.doorverkoop;
}
public boolean getStatistieken() {
return this.statistieken;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getBlokkeren_einddatum() {
return this.blokkeren_einddatum;
}
public String getInfo() {
return this.info;
}
public String getLink01() {
return this.link01;
}
public String getLink02() {
return this.link02;
}
public String getLink03() {
return this.link03;
}
public String getLink04() {
return this.link04;
}
public String getLink05() {
return this.link05;
}
public String getLink06() {
return this.link06;
}
public String getLink07() {
return this.link07;
}
public String getLink08() {
return this.Link08;
}
public String getLink09() {
return this.link09;
}
public String getInserted() {
return this.inserted;
}
public String getUpdated() {
return this.updated;
}
public int getCc() {
return this.cc;
}
public double getEenheidsgewicht() {
return this.eenheidsgewicht;
}
public String getIngredienten() {
return this.ingredienten;
}
public int getId_basiseenheid() {
return this.id_basiseenheid;
}
public int getId_collieenheid() {
return this.id_collieenheid;
}
public int getId_prijseenheid() {
return this.id_prijseenheid;
}
public int getId_receptproduct() {
return this.id_receptproduct;
}
public boolean getEtiket_intern() {
return this.etiket_intern;
}
public int getId_etiket() {
return this.id_etiket;
}
public String getInfo_inhoud() {
return this.info_inhoud;
}
public int getId_leveringstemperatuur() {
return this.id_leveringstemperatuur;
}
public BigDecimal getGtin() {
return this.gtin;
}
public int getId_online() {
return this.id_online;
}
public boolean getEtiket_verkoopproduct() {
return this.etiket_verkoopproduct;
}
public double getEtiket_verkoopproduct_percentage_ondergrens() {
return this.etiket_verkoopproduct_percentage_ondergrens;
}
public double getEtiket_verkoopproduct_percentage_bovengrens() {
return this.etiket_verkoopproduct_percentage_bovengrens;
}
public boolean getEtiket_verkoopproduct_ingredienten() {
return this.etiket_verkoopproduct_ingredienten;
}
public double getEtiket_verkoopproduct_ingredienten_percentage_ondergrens() {
return this.etiket_verkoopproduct_ingredienten_percentage_ondergrens;
}
public double getEtiket_verkoopproduct_ingredienten_percentage_bovengrens() {
return this.etiket_verkoopproduct_ingredienten_percentage_bovengrens;
}
public String getEtiket_verkoopproduct_omschrijvingn() {
return this.etiket_verkoopproduct_omschrijvingn;
}
public String getEtiket_verkoopproduct_omschrijvingf() {
return this.etiket_verkoopproduct_omschrijvingf;
}
public int getId_etiket_tekst() {
return this.id_etiket_tekst;
}
public int getId_fabrikant() {
return this.id_fabrikant;
}
public String getFabrikant_referentie_product() {
return this.fabrikant_referentie_product;
}
public String getLink_technische_fiche() {
return this.link_technische_fiche;
}
public Date getTechnische_fiche_datum() {
return this.technische_fiche_datum;
}
public String getTechnische_fiche_versie() {
return this.technische_fiche_versie;
}
public double getVerliespercentage() {
return this.verliespercentage;
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
public String getBestandsnaam_foto() {
return this.bestandsnaam_foto;
}
public String getColli_barcode() {
return this.colli_barcode;
}
public String getIdentificerende_barcode() {
return this.identificerende_barcode;
}
public int getVolgnummer_bestelgroep() {
return this.volgnummer_bestelgroep;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public int getId_etiket_omschrijving() {
return this.id_etiket_omschrijving;
}
public boolean getOnmiddellijk_in_gebruik() {
return this.onmiddellijk_in_gebruik;
}
public boolean getEtiket_verbruik() {
return this.etiket_verbruik;
}
public int getId_etiket_verbruik() {
return this.id_etiket_verbruik;
}
public boolean getBeperkte_houdbaarheid_na_openen() {
return this.beperkte_houdbaarheid_na_openen;
}
public int getAantal_dagen_houdbaar_na_openen() {
return this.aantal_dagen_houdbaar_na_openen;
}
public int getIngebruikname_per_eenheid() {
return this.ingebruikname_per_eenheid;
}
public int getAantal_loten_in_gebruik() {
return this.aantal_loten_in_gebruik;
}
public String getOmschrijving_voorraadplaats() {
return this.omschrijving_voorraadplaats;
}
public int getId_voorraadplaats_in_gebruik() {
return this.id_voorraadplaats_in_gebruik;
}
public String getOmschrijving_voorraadplaats_in_gebruik() {
return this.omschrijving_voorraadplaats_in_gebruik;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_aankoopproduct(int id_aankoopproduct){
 this.id_aankoopproduct=id_aankoopproduct;
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
public void setId_productcategorie(int id_productcategorie){
 this.id_productcategorie=id_productcategorie;
 }
public void setId_productgroep(int id_productgroep){
 this.id_productgroep=id_productgroep;
 }
public void setId_productsubgroep(int id_productsubgroep){
 this.id_productsubgroep=id_productsubgroep;
 }
public void setId_bestelgroep(int id_bestelgroep){
 this.id_bestelgroep=id_bestelgroep;
 }
public void setId_verpakkingseenheid(int id_verpakkingseenheid){
 this.id_verpakkingseenheid=id_verpakkingseenheid;
 }
public void setId_aankoopeenheid(int id_aankoopeenheid){
 this.id_aankoopeenheid=id_aankoopeenheid;
 }
public void setId_voorraadeenheid(int id_voorraadeenheid){
 this.id_voorraadeenheid=id_voorraadeenheid;
 }
public void setId_etiketteneenheid(int id_etiketteneenheid){
 this.id_etiketteneenheid=id_etiketteneenheid;
 }
public void setAantal_eenheden_verpakking(double aantal_eenheden_verpakking){
 this.aantal_eenheden_verpakking=aantal_eenheden_verpakking;
 }
public void setAantal_verpakkingen_colli(double aantal_verpakkingen_colli){
 this.aantal_verpakkingen_colli=aantal_verpakkingen_colli;
 }
public void setAantal_colli_palet(double aantal_colli_palet){
 this.aantal_colli_palet=aantal_colli_palet;
 }
public void setNettogewicht_verpakkingseenheid(double nettogewicht_verpakkingseenheid){
 this.nettogewicht_verpakkingseenheid=nettogewicht_verpakkingseenheid;
 }
public void setBrutogewicht_verpakkingseenheid(double brutogewicht_verpakkingseenheid){
 this.brutogewicht_verpakkingseenheid=brutogewicht_verpakkingseenheid;
 }
public void setMinimum_bestelhoeveelheid(double minimum_bestelhoeveelheid){
 this.minimum_bestelhoeveelheid=minimum_bestelhoeveelheid;
 }
public void setVeelvoud_bestelling(double veelvoud_bestelling){
 this.veelvoud_bestelling=veelvoud_bestelling;
 }
public void setMinimum_leveringstermijn(int minimum_leveringstermijn){
 this.minimum_leveringstermijn=minimum_leveringstermijn;
 }
public void setMinimum_aantal_dagen_houdbaar(int minimum_aantal_dagen_houdbaar){
 this.minimum_aantal_dagen_houdbaar=minimum_aantal_dagen_houdbaar;
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
public void setId_voorraadplaats(int id_voorraadplaats){
 this.id_voorraadplaats=id_voorraadplaats;
 }
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
 }
public void setId_algemene_rekening_type(int id_algemene_rekening_type){
 this.id_algemene_rekening_type=id_algemene_rekening_type;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setId_analytische_rekening_type(int id_analytische_rekening_type){
 this.id_analytische_rekening_type=id_analytische_rekening_type;
 }
public void setId_analytische_rekening(int id_analytische_rekening){
 this.id_analytische_rekening=id_analytische_rekening;
 }
public void setDoorverkoop(boolean doorverkoop){
 this.doorverkoop=doorverkoop;
 }
public void setStatistieken(boolean statistieken){
 this.statistieken=statistieken;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setBlokkeren_einddatum(Date blokkeren_einddatum){
 this.blokkeren_einddatum=blokkeren_einddatum;
 }
public void setInfo(String info){
 this.info=info;
 }
public void setLink01(String link01){
 this.link01=link01;
 }
public void setLink02(String link02){
 this.link02=link02;
 }
public void setLink03(String link03){
 this.link03=link03;
 }
public void setLink04(String link04){
 this.link04=link04;
 }
public void setLink05(String link05){
 this.link05=link05;
 }
public void setLink06(String link06){
 this.link06=link06;
 }
public void setLink07(String link07){
 this.link07=link07;
 }
public void setLink08(String Link08){
 this.Link08=Link08;
 }
public void setLink09(String link09){
 this.link09=link09;
 }
public void setInserted(String inserted){
 this.inserted=inserted;
 }
public void setUpdated(String updated){
 this.updated=updated;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setEenheidsgewicht(double eenheidsgewicht){
 this.eenheidsgewicht=eenheidsgewicht;
 }
public void setIngredienten(String ingredienten){
 this.ingredienten=ingredienten;
 }
public void setId_basiseenheid(int id_basiseenheid){
 this.id_basiseenheid=id_basiseenheid;
 }
public void setId_collieenheid(int id_collieenheid){
 this.id_collieenheid=id_collieenheid;
 }
public void setId_prijseenheid(int id_prijseenheid){
 this.id_prijseenheid=id_prijseenheid;
 }
public void setId_receptproduct(int id_receptproduct){
 this.id_receptproduct=id_receptproduct;
 }
public void setEtiket_intern(boolean etiket_intern){
 this.etiket_intern=etiket_intern;
 }
public void setId_etiket(int id_etiket){
 this.id_etiket=id_etiket;
 }
public void setInfo_inhoud(String info_inhoud){
 this.info_inhoud=info_inhoud;
 }
public void setId_leveringstemperatuur(int id_leveringstemperatuur){
 this.id_leveringstemperatuur=id_leveringstemperatuur;
 }
public void setGtin(BigDecimal gtin){
 this.gtin=gtin;
 }
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setEtiket_verkoopproduct(boolean etiket_verkoopproduct){
 this.etiket_verkoopproduct=etiket_verkoopproduct;
 }
public void setEtiket_verkoopproduct_percentage_ondergrens(double etiket_verkoopproduct_percentage_ondergrens){
 this.etiket_verkoopproduct_percentage_ondergrens=etiket_verkoopproduct_percentage_ondergrens;
 }
public void setEtiket_verkoopproduct_percentage_bovengrens(double etiket_verkoopproduct_percentage_bovengrens){
 this.etiket_verkoopproduct_percentage_bovengrens=etiket_verkoopproduct_percentage_bovengrens;
 }
public void setEtiket_verkoopproduct_ingredienten(boolean etiket_verkoopproduct_ingredienten){
 this.etiket_verkoopproduct_ingredienten=etiket_verkoopproduct_ingredienten;
 }
public void setEtiket_verkoopproduct_ingredienten_percentage_ondergrens(double etiket_verkoopproduct_ingredienten_percentage_ondergrens){
 this.etiket_verkoopproduct_ingredienten_percentage_ondergrens=etiket_verkoopproduct_ingredienten_percentage_ondergrens;
 }
public void setEtiket_verkoopproduct_ingredienten_percentage_bovengrens(double etiket_verkoopproduct_ingredienten_percentage_bovengrens){
 this.etiket_verkoopproduct_ingredienten_percentage_bovengrens=etiket_verkoopproduct_ingredienten_percentage_bovengrens;
 }
public void setEtiket_verkoopproduct_omschrijvingn(String etiket_verkoopproduct_omschrijvingn){
 this.etiket_verkoopproduct_omschrijvingn=etiket_verkoopproduct_omschrijvingn;
 }
public void setEtiket_verkoopproduct_omschrijvingf(String etiket_verkoopproduct_omschrijvingf){
 this.etiket_verkoopproduct_omschrijvingf=etiket_verkoopproduct_omschrijvingf;
 }
public void setId_etiket_tekst(int id_etiket_tekst){
 this.id_etiket_tekst=id_etiket_tekst;
 }
public void setId_fabrikant(int id_fabrikant){
 this.id_fabrikant=id_fabrikant;
 }
public void setFabrikant_referentie_product(String fabrikant_referentie_product){
 this.fabrikant_referentie_product=fabrikant_referentie_product;
 }
public void setLink_technische_fiche(String link_technische_fiche){
 this.link_technische_fiche=link_technische_fiche;
 }
public void setTechnische_fiche_datum(Date technische_fiche_datum){
 this.technische_fiche_datum=technische_fiche_datum;
 }
public void setTechnische_fiche_versie(String technische_fiche_versie){
 this.technische_fiche_versie=technische_fiche_versie;
 }
public void setVerliespercentage(double verliespercentage){
 this.verliespercentage=verliespercentage;
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
public void setBestandsnaam_foto(String bestandsnaam_foto){
 this.bestandsnaam_foto=bestandsnaam_foto;
 }
public void setColli_barcode(String colli_barcode){
 this.colli_barcode=colli_barcode;
 }
public void setIdentificerende_barcode(String identificerende_barcode){
 this.identificerende_barcode=identificerende_barcode;
 }
public void setVolgnummer_bestelgroep(int volgnummer_bestelgroep){
 this.volgnummer_bestelgroep=volgnummer_bestelgroep;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setId_etiket_omschrijving(int id_etiket_omschrijving){
 this.id_etiket_omschrijving=id_etiket_omschrijving;
 }
public void setOnmiddellijk_in_gebruik(boolean onmiddellijk_in_gebruik){
 this.onmiddellijk_in_gebruik=onmiddellijk_in_gebruik;
 }
public void setEtiket_verbruik(boolean etiket_verbruik){
 this.etiket_verbruik=etiket_verbruik;
 }
public void setId_etiket_verbruik(int id_etiket_verbruik){
 this.id_etiket_verbruik=id_etiket_verbruik;
 }
public void setBeperkte_houdbaarheid_na_openen(boolean beperkte_houdbaarheid_na_openen){
 this.beperkte_houdbaarheid_na_openen=beperkte_houdbaarheid_na_openen;
 }
public void setAantal_dagen_houdbaar_na_openen(int aantal_dagen_houdbaar_na_openen){
 this.aantal_dagen_houdbaar_na_openen=aantal_dagen_houdbaar_na_openen;
 }
public void setIngebruikname_per_eenheid(int ingebruikname_per_eenheid){
 this.ingebruikname_per_eenheid=ingebruikname_per_eenheid;
 }
public void setAantal_loten_in_gebruik(int aantal_loten_in_gebruik){
 this.aantal_loten_in_gebruik=aantal_loten_in_gebruik;
 }
public void setOmschrijving_voorraadplaats(String omschrijving_voorraadplaats){
 this.omschrijving_voorraadplaats=omschrijving_voorraadplaats;
 }
public void setId_voorraadplaats_in_gebruik(int id_voorraadplaats_in_gebruik){
 this.id_voorraadplaats_in_gebruik=id_voorraadplaats_in_gebruik;
 }
public void setOmschrijving_voorraadplaats_in_gebruik(String omschrijving_voorraadplaats_in_gebruik){
 this.omschrijving_voorraadplaats_in_gebruik=omschrijving_voorraadplaats_in_gebruik;
 }
}