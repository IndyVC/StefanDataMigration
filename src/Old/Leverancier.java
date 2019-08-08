package Old;
import Utils.Util;
import java.sql.Date;

public class Leverancier implements Old { 
private int id_bedrijf;
private int id_leverancier;
private String id_leverancier_boekhouding;
private String id_klant;
private int id_aanspreking;
private String naam;
private String naam_contactpersoon;
private String zoeknaam;
private String straat;
private String huisnummer;
private int id_land;
private String postcode;
private String woonplaats;
private int id_taalcode;
private String telefoonnummer;
private String gsmnummer;
private String faxnummer;
private String emailadres;
private String url;
private int id_leveranciersgroep;
private int id_btwcode;
private String ondernemingsnummer;
private String rechtspersonenregister;
private boolean gesloten1;
private boolean gesloten2;
private boolean gesloten3;
private boolean gesloten4;
private boolean gesloten5;
private boolean gesloten6;
private boolean gesloten7;
private String openingsuur_vm1;
private String openingsuur_vm2;
private String openingsuur_vm3;
private String openingsuur_vm4;
private String openingsuur_vm5;
private String openingsuur_vm6;
private String openingsuur_vm7;
private String openingsuur_nm1;
private String openingsuur_nm2;
private String openingsuur_nm3;
private String openingsuur_nm4;
private String openingsuur_nm5;
private String openingsuur_nm6;
private String openingsuur_nm7;
private String sluitingsuur_vm1;
private String sluitingsuur_vm2;
private String sluitingsuur_vm3;
private String sluitingsuur_vm4;
private String sluitingsuur_vm5;
private String sluitingsuur_vm6;
private String sluitingsuur_vm7;
private String sluitingsuur_nm1;
private String sluitingsuur_nm2;
private String sluitingsuur_nm3;
private String sluitingsuur_nm4;
private String sluitingsuur_nm5;
private String sluitingsuur_nm6;
private String sluitingsuur_nm7;
private boolean levering1;
private boolean levering2;
private boolean levering3;
private boolean levering4;
private boolean levering5;
private boolean levering6;
private boolean levering7;
private int id_leveringsfrequentie;
private Date begindatum_verlofperiode1;
private Date begindatum_verlofperiode2;
private Date begindatum_verlofperiode3;
private Date einddatum_verlofperiode1;
private Date einddatum_verlofperiode2;
private Date einddatum_verlofperiode3;
private String tekst_bestelbon;
private Date tekst_bestelbon_begindatum;
private Date tekst_bestelbon_einddatum;
private int id_contactname;
private int id_dagboek;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private int id_bank;
private String banknummer;
private int id_munt;
private int id_betalingsvoorwaarde;
private double percentage_handelskorting;
private double percentage_financiele_korting;
private double bedrag_kredietlimiet;
private boolean aankoopprijzen_inclusief_btw;
private String vertegenwoordiger_naam;
private String vertegenwoordiger_telefoonnummer;
private String vertegenwoordiger_faxnummer;
private String vertegenwoordiger_gsmnummer;
private String vertegenwoordiger_emailadres;
private Date vertegenwoordiger_afspraak_datum;
private String vertegenwoordiger_afspraak_uur;
private String vertegenwoordiger_info;
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
private String link08;
private String link09;
private Date inserted;
private Date updated;
private int cc;
private String bestellingen_telefoonnummer;
private String bestellingen_faxnummer;
private String bestellingen_emailadres;
private String bestellingen_url;
private int id_webshop_api;
private String iban;
private String bic;
private boolean nul_prijzen_bij_levering;

public Leverancier(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_leverancier = Util.Int(data[1]);
this.id_leverancier_boekhouding = data[2];
this.id_klant = data[3];
this.id_aanspreking = Util.Int(data[4]);
this.naam = data[5];
this.naam_contactpersoon = data[6];
this.zoeknaam = data[7];
this.straat = data[8];
this.huisnummer = data[9];
this.id_land = Util.Int(data[10]);
this.postcode = data[11];
this.woonplaats = data[12];
this.id_taalcode = Util.Int(data[13]);
this.telefoonnummer = data[14];
this.gsmnummer = data[15];
this.faxnummer = data[16];
this.emailadres = data[17];
this.url = data[18];
this.id_leveranciersgroep = Util.Int(data[19]);
this.id_btwcode = Util.Int(data[20]);
this.ondernemingsnummer = data[21];
this.rechtspersonenregister = data[22];
this.gesloten1 = Util.Boolean(data[23]);
this.gesloten2 = Util.Boolean(data[24]);
this.gesloten3 = Util.Boolean(data[25]);
this.gesloten4 = Util.Boolean(data[26]);
this.gesloten5 = Util.Boolean(data[27]);
this.gesloten6 = Util.Boolean(data[28]);
this.gesloten7 = Util.Boolean(data[29]);
this.openingsuur_vm1 = data[30];
this.openingsuur_vm2 = data[31];
this.openingsuur_vm3 = data[32];
this.openingsuur_vm4 = data[33];
this.openingsuur_vm5 = data[34];
this.openingsuur_vm6 = data[35];
this.openingsuur_vm7 = data[36];
this.openingsuur_nm1 = data[37];
this.openingsuur_nm2 = data[38];
this.openingsuur_nm3 = data[39];
this.openingsuur_nm4 = data[40];
this.openingsuur_nm5 = data[41];
this.openingsuur_nm6 = data[42];
this.openingsuur_nm7 = data[43];
this.sluitingsuur_vm1 = data[44];
this.sluitingsuur_vm2 = data[45];
this.sluitingsuur_vm3 = data[46];
this.sluitingsuur_vm4 = data[47];
this.sluitingsuur_vm5 = data[48];
this.sluitingsuur_vm6 = data[49];
this.sluitingsuur_vm7 = data[50];
this.sluitingsuur_nm1 = data[51];
this.sluitingsuur_nm2 = data[52];
this.sluitingsuur_nm3 = data[53];
this.sluitingsuur_nm4 = data[54];
this.sluitingsuur_nm5 = data[55];
this.sluitingsuur_nm6 = data[56];
this.sluitingsuur_nm7 = data[57];
this.levering1 = Util.Boolean(data[58]);
this.levering2 = Util.Boolean(data[59]);
this.levering3 = Util.Boolean(data[60]);
this.levering4 = Util.Boolean(data[61]);
this.levering5 = Util.Boolean(data[62]);
this.levering6 = Util.Boolean(data[63]);
this.levering7 = Util.Boolean(data[64]);
this.id_leveringsfrequentie = Util.Int(data[65]);
this.begindatum_verlofperiode1 = Util.Date(data[66]);
this.begindatum_verlofperiode2 = Util.Date(data[67]);
this.begindatum_verlofperiode3 = Util.Date(data[68]);
this.einddatum_verlofperiode1 = Util.Date(data[69]);
this.einddatum_verlofperiode2 = Util.Date(data[70]);
this.einddatum_verlofperiode3 = Util.Date(data[71]);
this.tekst_bestelbon = data[72];
this.tekst_bestelbon_begindatum = Util.Date(data[73]);
this.tekst_bestelbon_einddatum = Util.Date(data[74]);
this.id_contactname = Util.Int(data[75]);
this.id_dagboek = Util.Int(data[76]);
this.id_algemene_rekening_type = Util.Int(data[77]);
this.id_algemene_rekening = Util.Int(data[78]);
this.id_bank = Util.Int(data[79]);
this.banknummer = data[80];
this.id_munt = Util.Int(data[81]);
this.id_betalingsvoorwaarde = Util.Int(data[82]);
this.percentage_handelskorting = Util.Double(data[83]);
this.percentage_financiele_korting = Util.Double(data[84]);
this.bedrag_kredietlimiet = Util.Double(data[85]);
this.aankoopprijzen_inclusief_btw = Util.Boolean(data[86]);
this.vertegenwoordiger_naam = data[87];
this.vertegenwoordiger_telefoonnummer = data[88];
this.vertegenwoordiger_faxnummer = data[89];
this.vertegenwoordiger_gsmnummer = data[90];
this.vertegenwoordiger_emailadres = data[91];
this.vertegenwoordiger_afspraak_datum = Util.Date(data[92]);
this.vertegenwoordiger_afspraak_uur = data[93];
this.vertegenwoordiger_info = data[94];
this.statistieken = Util.Boolean(data[95]);
this.blokkeren = Util.Boolean(data[96]);
this.blokkeren_einddatum = Util.Date(data[97]);
this.info = data[98];
this.link01 = data[99];
this.link02 = data[100];
this.link03 = data[101];
this.link04 = data[102];
this.link05 = data[103];
this.link06 = data[104];
this.link07 = data[105];
this.link08 = data[106];
this.link09 = data[107];
this.inserted = Util.Date(data[108]);
this.updated = Util.Date(data[109]);
this.cc = Util.Int(data[110]);
this.bestellingen_telefoonnummer = data[111];
this.bestellingen_faxnummer = data[112];
this.bestellingen_emailadres = data[113];
this.bestellingen_url = data[114];
this.id_webshop_api = Util.Int(data[115]);
this.iban = data[116];
this.bic = data[117];
this.nul_prijzen_bij_levering = Util.Boolean(data[118]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public String getId_leverancier_boekhouding() {
return this.id_leverancier_boekhouding;
}
public String getId_klant() {
return this.id_klant;
}
public int getId_aanspreking() {
return this.id_aanspreking;
}
public String getNaam() {
return this.naam;
}
public String getNaam_contactpersoon() {
return this.naam_contactpersoon;
}
public String getZoeknaam() {
return this.zoeknaam;
}
public String getStraat() {
return this.straat;
}
public String getHuisnummer() {
return this.huisnummer;
}
public int getId_land() {
return this.id_land;
}
public String getPostcode() {
return this.postcode;
}
public String getWoonplaats() {
return this.woonplaats;
}
public int getId_taalcode() {
return this.id_taalcode;
}
public String getTelefoonnummer() {
return this.telefoonnummer;
}
public String getGsmnummer() {
return this.gsmnummer;
}
public String getFaxnummer() {
return this.faxnummer;
}
public String getEmailadres() {
return this.emailadres;
}
public String getUrl() {
return this.url;
}
public int getId_leveranciersgroep() {
return this.id_leveranciersgroep;
}
public int getId_btwcode() {
return this.id_btwcode;
}
public String getOndernemingsnummer() {
return this.ondernemingsnummer;
}
public String getRechtspersonenregister() {
return this.rechtspersonenregister;
}
public boolean getGesloten1() {
return this.gesloten1;
}
public boolean getGesloten2() {
return this.gesloten2;
}
public boolean getGesloten3() {
return this.gesloten3;
}
public boolean getGesloten4() {
return this.gesloten4;
}
public boolean getGesloten5() {
return this.gesloten5;
}
public boolean getGesloten6() {
return this.gesloten6;
}
public boolean getGesloten7() {
return this.gesloten7;
}
public String getOpeningsuur_vm1() {
return this.openingsuur_vm1;
}
public String getOpeningsuur_vm2() {
return this.openingsuur_vm2;
}
public String getOpeningsuur_vm3() {
return this.openingsuur_vm3;
}
public String getOpeningsuur_vm4() {
return this.openingsuur_vm4;
}
public String getOpeningsuur_vm5() {
return this.openingsuur_vm5;
}
public String getOpeningsuur_vm6() {
return this.openingsuur_vm6;
}
public String getOpeningsuur_vm7() {
return this.openingsuur_vm7;
}
public String getOpeningsuur_nm1() {
return this.openingsuur_nm1;
}
public String getOpeningsuur_nm2() {
return this.openingsuur_nm2;
}
public String getOpeningsuur_nm3() {
return this.openingsuur_nm3;
}
public String getOpeningsuur_nm4() {
return this.openingsuur_nm4;
}
public String getOpeningsuur_nm5() {
return this.openingsuur_nm5;
}
public String getOpeningsuur_nm6() {
return this.openingsuur_nm6;
}
public String getOpeningsuur_nm7() {
return this.openingsuur_nm7;
}
public String getSluitingsuur_vm1() {
return this.sluitingsuur_vm1;
}
public String getSluitingsuur_vm2() {
return this.sluitingsuur_vm2;
}
public String getSluitingsuur_vm3() {
return this.sluitingsuur_vm3;
}
public String getSluitingsuur_vm4() {
return this.sluitingsuur_vm4;
}
public String getSluitingsuur_vm5() {
return this.sluitingsuur_vm5;
}
public String getSluitingsuur_vm6() {
return this.sluitingsuur_vm6;
}
public String getSluitingsuur_vm7() {
return this.sluitingsuur_vm7;
}
public String getSluitingsuur_nm1() {
return this.sluitingsuur_nm1;
}
public String getSluitingsuur_nm2() {
return this.sluitingsuur_nm2;
}
public String getSluitingsuur_nm3() {
return this.sluitingsuur_nm3;
}
public String getSluitingsuur_nm4() {
return this.sluitingsuur_nm4;
}
public String getSluitingsuur_nm5() {
return this.sluitingsuur_nm5;
}
public String getSluitingsuur_nm6() {
return this.sluitingsuur_nm6;
}
public String getSluitingsuur_nm7() {
return this.sluitingsuur_nm7;
}
public boolean getLevering1() {
return this.levering1;
}
public boolean getLevering2() {
return this.levering2;
}
public boolean getLevering3() {
return this.levering3;
}
public boolean getLevering4() {
return this.levering4;
}
public boolean getLevering5() {
return this.levering5;
}
public boolean getLevering6() {
return this.levering6;
}
public boolean getLevering7() {
return this.levering7;
}
public int getId_leveringsfrequentie() {
return this.id_leveringsfrequentie;
}
public Date getBegindatum_verlofperiode1() {
return this.begindatum_verlofperiode1;
}
public Date getBegindatum_verlofperiode2() {
return this.begindatum_verlofperiode2;
}
public Date getBegindatum_verlofperiode3() {
return this.begindatum_verlofperiode3;
}
public Date getEinddatum_verlofperiode1() {
return this.einddatum_verlofperiode1;
}
public Date getEinddatum_verlofperiode2() {
return this.einddatum_verlofperiode2;
}
public Date getEinddatum_verlofperiode3() {
return this.einddatum_verlofperiode3;
}
public String getTekst_bestelbon() {
return this.tekst_bestelbon;
}
public Date getTekst_bestelbon_begindatum() {
return this.tekst_bestelbon_begindatum;
}
public Date getTekst_bestelbon_einddatum() {
return this.tekst_bestelbon_einddatum;
}
public int getId_contactname() {
return this.id_contactname;
}
public int getId_dagboek() {
return this.id_dagboek;
}
public int getId_algemene_rekening_type() {
return this.id_algemene_rekening_type;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public int getId_bank() {
return this.id_bank;
}
public String getBanknummer() {
return this.banknummer;
}
public int getId_munt() {
return this.id_munt;
}
public int getId_betalingsvoorwaarde() {
return this.id_betalingsvoorwaarde;
}
public double getPercentage_handelskorting() {
return this.percentage_handelskorting;
}
public double getPercentage_financiele_korting() {
return this.percentage_financiele_korting;
}
public double getBedrag_kredietlimiet() {
return this.bedrag_kredietlimiet;
}
public boolean getAankoopprijzen_inclusief_btw() {
return this.aankoopprijzen_inclusief_btw;
}
public String getVertegenwoordiger_naam() {
return this.vertegenwoordiger_naam;
}
public String getVertegenwoordiger_telefoonnummer() {
return this.vertegenwoordiger_telefoonnummer;
}
public String getVertegenwoordiger_faxnummer() {
return this.vertegenwoordiger_faxnummer;
}
public String getVertegenwoordiger_gsmnummer() {
return this.vertegenwoordiger_gsmnummer;
}
public String getVertegenwoordiger_emailadres() {
return this.vertegenwoordiger_emailadres;
}
public Date getVertegenwoordiger_afspraak_datum() {
return this.vertegenwoordiger_afspraak_datum;
}
public String getVertegenwoordiger_afspraak_uur() {
return this.vertegenwoordiger_afspraak_uur;
}
public String getVertegenwoordiger_info() {
return this.vertegenwoordiger_info;
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
return this.link08;
}
public String getLink09() {
return this.link09;
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
public String getBestellingen_telefoonnummer() {
return this.bestellingen_telefoonnummer;
}
public String getBestellingen_faxnummer() {
return this.bestellingen_faxnummer;
}
public String getBestellingen_emailadres() {
return this.bestellingen_emailadres;
}
public String getBestellingen_url() {
return this.bestellingen_url;
}
public int getId_webshop_api() {
return this.id_webshop_api;
}
public String getIban() {
return this.iban;
}
public String getBic() {
return this.bic;
}
public boolean getNul_prijzen_bij_levering() {
return this.nul_prijzen_bij_levering;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setId_leverancier_boekhouding(String id_leverancier_boekhouding){
 this.id_leverancier_boekhouding=id_leverancier_boekhouding;
 }
public void setId_klant(String id_klant){
 this.id_klant=id_klant;
 }
public void setId_aanspreking(int id_aanspreking){
 this.id_aanspreking=id_aanspreking;
 }
public void setNaam(String naam){
 this.naam=naam;
 }
public void setNaam_contactpersoon(String naam_contactpersoon){
 this.naam_contactpersoon=naam_contactpersoon;
 }
public void setZoeknaam(String zoeknaam){
 this.zoeknaam=zoeknaam;
 }
public void setStraat(String straat){
 this.straat=straat;
 }
public void setHuisnummer(String huisnummer){
 this.huisnummer=huisnummer;
 }
public void setId_land(int id_land){
 this.id_land=id_land;
 }
public void setPostcode(String postcode){
 this.postcode=postcode;
 }
public void setWoonplaats(String woonplaats){
 this.woonplaats=woonplaats;
 }
public void setId_taalcode(int id_taalcode){
 this.id_taalcode=id_taalcode;
 }
public void setTelefoonnummer(String telefoonnummer){
 this.telefoonnummer=telefoonnummer;
 }
public void setGsmnummer(String gsmnummer){
 this.gsmnummer=gsmnummer;
 }
public void setFaxnummer(String faxnummer){
 this.faxnummer=faxnummer;
 }
public void setEmailadres(String emailadres){
 this.emailadres=emailadres;
 }
public void setUrl(String url){
 this.url=url;
 }
public void setId_leveranciersgroep(int id_leveranciersgroep){
 this.id_leveranciersgroep=id_leveranciersgroep;
 }
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
 }
public void setOndernemingsnummer(String ondernemingsnummer){
 this.ondernemingsnummer=ondernemingsnummer;
 }
public void setRechtspersonenregister(String rechtspersonenregister){
 this.rechtspersonenregister=rechtspersonenregister;
 }
public void setGesloten1(boolean gesloten1){
 this.gesloten1=gesloten1;
 }
public void setGesloten2(boolean gesloten2){
 this.gesloten2=gesloten2;
 }
public void setGesloten3(boolean gesloten3){
 this.gesloten3=gesloten3;
 }
public void setGesloten4(boolean gesloten4){
 this.gesloten4=gesloten4;
 }
public void setGesloten5(boolean gesloten5){
 this.gesloten5=gesloten5;
 }
public void setGesloten6(boolean gesloten6){
 this.gesloten6=gesloten6;
 }
public void setGesloten7(boolean gesloten7){
 this.gesloten7=gesloten7;
 }
public void setOpeningsuur_vm1(String openingsuur_vm1){
 this.openingsuur_vm1=openingsuur_vm1;
 }
public void setOpeningsuur_vm2(String openingsuur_vm2){
 this.openingsuur_vm2=openingsuur_vm2;
 }
public void setOpeningsuur_vm3(String openingsuur_vm3){
 this.openingsuur_vm3=openingsuur_vm3;
 }
public void setOpeningsuur_vm4(String openingsuur_vm4){
 this.openingsuur_vm4=openingsuur_vm4;
 }
public void setOpeningsuur_vm5(String openingsuur_vm5){
 this.openingsuur_vm5=openingsuur_vm5;
 }
public void setOpeningsuur_vm6(String openingsuur_vm6){
 this.openingsuur_vm6=openingsuur_vm6;
 }
public void setOpeningsuur_vm7(String openingsuur_vm7){
 this.openingsuur_vm7=openingsuur_vm7;
 }
public void setOpeningsuur_nm1(String openingsuur_nm1){
 this.openingsuur_nm1=openingsuur_nm1;
 }
public void setOpeningsuur_nm2(String openingsuur_nm2){
 this.openingsuur_nm2=openingsuur_nm2;
 }
public void setOpeningsuur_nm3(String openingsuur_nm3){
 this.openingsuur_nm3=openingsuur_nm3;
 }
public void setOpeningsuur_nm4(String openingsuur_nm4){
 this.openingsuur_nm4=openingsuur_nm4;
 }
public void setOpeningsuur_nm5(String openingsuur_nm5){
 this.openingsuur_nm5=openingsuur_nm5;
 }
public void setOpeningsuur_nm6(String openingsuur_nm6){
 this.openingsuur_nm6=openingsuur_nm6;
 }
public void setOpeningsuur_nm7(String openingsuur_nm7){
 this.openingsuur_nm7=openingsuur_nm7;
 }
public void setSluitingsuur_vm1(String sluitingsuur_vm1){
 this.sluitingsuur_vm1=sluitingsuur_vm1;
 }
public void setSluitingsuur_vm2(String sluitingsuur_vm2){
 this.sluitingsuur_vm2=sluitingsuur_vm2;
 }
public void setSluitingsuur_vm3(String sluitingsuur_vm3){
 this.sluitingsuur_vm3=sluitingsuur_vm3;
 }
public void setSluitingsuur_vm4(String sluitingsuur_vm4){
 this.sluitingsuur_vm4=sluitingsuur_vm4;
 }
public void setSluitingsuur_vm5(String sluitingsuur_vm5){
 this.sluitingsuur_vm5=sluitingsuur_vm5;
 }
public void setSluitingsuur_vm6(String sluitingsuur_vm6){
 this.sluitingsuur_vm6=sluitingsuur_vm6;
 }
public void setSluitingsuur_vm7(String sluitingsuur_vm7){
 this.sluitingsuur_vm7=sluitingsuur_vm7;
 }
public void setSluitingsuur_nm1(String sluitingsuur_nm1){
 this.sluitingsuur_nm1=sluitingsuur_nm1;
 }
public void setSluitingsuur_nm2(String sluitingsuur_nm2){
 this.sluitingsuur_nm2=sluitingsuur_nm2;
 }
public void setSluitingsuur_nm3(String sluitingsuur_nm3){
 this.sluitingsuur_nm3=sluitingsuur_nm3;
 }
public void setSluitingsuur_nm4(String sluitingsuur_nm4){
 this.sluitingsuur_nm4=sluitingsuur_nm4;
 }
public void setSluitingsuur_nm5(String sluitingsuur_nm5){
 this.sluitingsuur_nm5=sluitingsuur_nm5;
 }
public void setSluitingsuur_nm6(String sluitingsuur_nm6){
 this.sluitingsuur_nm6=sluitingsuur_nm6;
 }
public void setSluitingsuur_nm7(String sluitingsuur_nm7){
 this.sluitingsuur_nm7=sluitingsuur_nm7;
 }
public void setLevering1(boolean levering1){
 this.levering1=levering1;
 }
public void setLevering2(boolean levering2){
 this.levering2=levering2;
 }
public void setLevering3(boolean levering3){
 this.levering3=levering3;
 }
public void setLevering4(boolean levering4){
 this.levering4=levering4;
 }
public void setLevering5(boolean levering5){
 this.levering5=levering5;
 }
public void setLevering6(boolean levering6){
 this.levering6=levering6;
 }
public void setLevering7(boolean levering7){
 this.levering7=levering7;
 }
public void setId_leveringsfrequentie(int id_leveringsfrequentie){
 this.id_leveringsfrequentie=id_leveringsfrequentie;
 }
public void setBegindatum_verlofperiode1(Date begindatum_verlofperiode1){
 this.begindatum_verlofperiode1=begindatum_verlofperiode1;
 }
public void setBegindatum_verlofperiode2(Date begindatum_verlofperiode2){
 this.begindatum_verlofperiode2=begindatum_verlofperiode2;
 }
public void setBegindatum_verlofperiode3(Date begindatum_verlofperiode3){
 this.begindatum_verlofperiode3=begindatum_verlofperiode3;
 }
public void setEinddatum_verlofperiode1(Date einddatum_verlofperiode1){
 this.einddatum_verlofperiode1=einddatum_verlofperiode1;
 }
public void setEinddatum_verlofperiode2(Date einddatum_verlofperiode2){
 this.einddatum_verlofperiode2=einddatum_verlofperiode2;
 }
public void setEinddatum_verlofperiode3(Date einddatum_verlofperiode3){
 this.einddatum_verlofperiode3=einddatum_verlofperiode3;
 }
public void setTekst_bestelbon(String tekst_bestelbon){
 this.tekst_bestelbon=tekst_bestelbon;
 }
public void setTekst_bestelbon_begindatum(Date tekst_bestelbon_begindatum){
 this.tekst_bestelbon_begindatum=tekst_bestelbon_begindatum;
 }
public void setTekst_bestelbon_einddatum(Date tekst_bestelbon_einddatum){
 this.tekst_bestelbon_einddatum=tekst_bestelbon_einddatum;
 }
public void setId_contactname(int id_contactname){
 this.id_contactname=id_contactname;
 }
public void setId_dagboek(int id_dagboek){
 this.id_dagboek=id_dagboek;
 }
public void setId_algemene_rekening_type(int id_algemene_rekening_type){
 this.id_algemene_rekening_type=id_algemene_rekening_type;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setId_bank(int id_bank){
 this.id_bank=id_bank;
 }
public void setBanknummer(String banknummer){
 this.banknummer=banknummer;
 }
public void setId_munt(int id_munt){
 this.id_munt=id_munt;
 }
public void setId_betalingsvoorwaarde(int id_betalingsvoorwaarde){
 this.id_betalingsvoorwaarde=id_betalingsvoorwaarde;
 }
public void setPercentage_handelskorting(double percentage_handelskorting){
 this.percentage_handelskorting=percentage_handelskorting;
 }
public void setPercentage_financiele_korting(double percentage_financiele_korting){
 this.percentage_financiele_korting=percentage_financiele_korting;
 }
public void setBedrag_kredietlimiet(double bedrag_kredietlimiet){
 this.bedrag_kredietlimiet=bedrag_kredietlimiet;
 }
public void setAankoopprijzen_inclusief_btw(boolean aankoopprijzen_inclusief_btw){
 this.aankoopprijzen_inclusief_btw=aankoopprijzen_inclusief_btw;
 }
public void setVertegenwoordiger_naam(String vertegenwoordiger_naam){
 this.vertegenwoordiger_naam=vertegenwoordiger_naam;
 }
public void setVertegenwoordiger_telefoonnummer(String vertegenwoordiger_telefoonnummer){
 this.vertegenwoordiger_telefoonnummer=vertegenwoordiger_telefoonnummer;
 }
public void setVertegenwoordiger_faxnummer(String vertegenwoordiger_faxnummer){
 this.vertegenwoordiger_faxnummer=vertegenwoordiger_faxnummer;
 }
public void setVertegenwoordiger_gsmnummer(String vertegenwoordiger_gsmnummer){
 this.vertegenwoordiger_gsmnummer=vertegenwoordiger_gsmnummer;
 }
public void setVertegenwoordiger_emailadres(String vertegenwoordiger_emailadres){
 this.vertegenwoordiger_emailadres=vertegenwoordiger_emailadres;
 }
public void setVertegenwoordiger_afspraak_datum(Date vertegenwoordiger_afspraak_datum){
 this.vertegenwoordiger_afspraak_datum=vertegenwoordiger_afspraak_datum;
 }
public void setVertegenwoordiger_afspraak_uur(String vertegenwoordiger_afspraak_uur){
 this.vertegenwoordiger_afspraak_uur=vertegenwoordiger_afspraak_uur;
 }
public void setVertegenwoordiger_info(String vertegenwoordiger_info){
 this.vertegenwoordiger_info=vertegenwoordiger_info;
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
public void setLink08(String link08){
 this.link08=link08;
 }
public void setLink09(String link09){
 this.link09=link09;
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
public void setBestellingen_telefoonnummer(String bestellingen_telefoonnummer){
 this.bestellingen_telefoonnummer=bestellingen_telefoonnummer;
 }
public void setBestellingen_faxnummer(String bestellingen_faxnummer){
 this.bestellingen_faxnummer=bestellingen_faxnummer;
 }
public void setBestellingen_emailadres(String bestellingen_emailadres){
 this.bestellingen_emailadres=bestellingen_emailadres;
 }
public void setBestellingen_url(String bestellingen_url){
 this.bestellingen_url=bestellingen_url;
 }
public void setId_webshop_api(int id_webshop_api){
 this.id_webshop_api=id_webshop_api;
 }
public void setIban(String iban){
 this.iban=iban;
 }
public void setBic(String bic){
 this.bic=bic;
 }
public void setNul_prijzen_bij_levering(boolean nul_prijzen_bij_levering){
 this.nul_prijzen_bij_levering=nul_prijzen_bij_levering;
 }
}