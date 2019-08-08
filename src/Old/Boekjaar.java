package Old;
import Utils.Util;
import java.sql.Date;

public class Boekjaar implements Old { 
private int id_bedrijf;
private int id_boekjaar;
private String boekhouding_boekjaar;
private Date begin_boekjaar;
private Date einde_boekjaar;
private boolean open_boekjaar;
private int btwaangifte;
private int cc;
private int documentnummer;
private int id_dagboek;

public Boekjaar(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_boekjaar = Util.Int(data[1]);
this.boekhouding_boekjaar = data[2];
this.begin_boekjaar = Util.Date(data[3]);
this.einde_boekjaar = Util.Date(data[4]);
this.open_boekjaar = Util.Boolean(data[5]);
this.btwaangifte = Util.Int(data[6]);
this.cc = Util.Int(data[7]);
this.documentnummer = Util.Int(data[8]);
this.id_dagboek = Util.Int(data[9]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_boekjaar() {
return this.id_boekjaar;
}
public String getBoekhouding_boekjaar() {
return this.boekhouding_boekjaar;
}
public Date getBegin_boekjaar() {
return this.begin_boekjaar;
}
public Date getEinde_boekjaar() {
return this.einde_boekjaar;
}
public boolean getOpen_boekjaar() {
return this.open_boekjaar;
}
public int getBtwaangifte() {
return this.btwaangifte;
}
public int getCc() {
return this.cc;
}
public int getDocumentnummer() {
return this.documentnummer;
}
public int getId_dagboek() {
return this.id_dagboek;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_boekjaar(int id_boekjaar){
 this.id_boekjaar=id_boekjaar;
 }
public void setBoekhouding_boekjaar(String boekhouding_boekjaar){
 this.boekhouding_boekjaar=boekhouding_boekjaar;
 }
public void setBegin_boekjaar(Date begin_boekjaar){
 this.begin_boekjaar=begin_boekjaar;
 }
public void setEinde_boekjaar(Date einde_boekjaar){
 this.einde_boekjaar=einde_boekjaar;
 }
public void setOpen_boekjaar(boolean open_boekjaar){
 this.open_boekjaar=open_boekjaar;
 }
public void setBtwaangifte(int btwaangifte){
 this.btwaangifte=btwaangifte;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setDocumentnummer(int documentnummer){
 this.documentnummer=documentnummer;
 }
public void setId_dagboek(int id_dagboek){
 this.id_dagboek=id_dagboek;
 }
}