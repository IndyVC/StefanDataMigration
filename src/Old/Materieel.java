package Old;
import Utils.Util;
import java.sql.Date;

public class Materieel implements Old { 
private int id_bedrijf;
private int id_materieel;
private String omschrijvingn;
private String omschrijvingf;
private boolean blokkeren;
private Date inserted;
private Date updated;
private boolean technische_keuring;
private String link_gebruiksaanwijzing;
private String link_veiligheidsfiche;
private String link_technische_keuring;
private String link_onderhoudschema;
private String link_ingebruikstelling;
private String link_foto;
private int id_materieelgroep;
private Date datum_laatste_keuring;
private Date datum_volgende_keuring;
private int id_leverancier;
private String gebruiksaanwijzing;
private String veiligheidsfiche;
private int id_recepteenheid;
private String omschrijvinge;

public Materieel(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_materieel = Util.Int(data[1]);
this.omschrijvingn = data[2];
this.omschrijvingf = data[3];
this.blokkeren = Util.Boolean(data[4]);
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
this.technische_keuring = Util.Boolean(data[7]);
this.link_gebruiksaanwijzing = data[8];
this.link_veiligheidsfiche = data[9];
this.link_technische_keuring = data[10];
this.link_onderhoudschema = data[11];
this.link_ingebruikstelling = data[12];
this.link_foto = data[13];
this.id_materieelgroep = Util.Int(data[14]);
this.datum_laatste_keuring = Util.Date(data[15]);
this.datum_volgende_keuring = Util.Date(data[16]);
this.id_leverancier = Util.Int(data[17]);
this.gebruiksaanwijzing = data[18];
this.veiligheidsfiche = data[19];
this.id_recepteenheid = Util.Int(data[20]);
this.omschrijvinge = data[21];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_materieel() {
return this.id_materieel;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public boolean getBlokkeren() {
return this.blokkeren;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public boolean getTechnische_keuring() {
return this.technische_keuring;
}
public String getLink_gebruiksaanwijzing() {
return this.link_gebruiksaanwijzing;
}
public String getLink_veiligheidsfiche() {
return this.link_veiligheidsfiche;
}
public String getLink_technische_keuring() {
return this.link_technische_keuring;
}
public String getLink_onderhoudschema() {
return this.link_onderhoudschema;
}
public String getLink_ingebruikstelling() {
return this.link_ingebruikstelling;
}
public String getLink_foto() {
return this.link_foto;
}
public int getId_materieelgroep() {
return this.id_materieelgroep;
}
public Date getDatum_laatste_keuring() {
return this.datum_laatste_keuring;
}
public Date getDatum_volgende_keuring() {
return this.datum_volgende_keuring;
}
public int getId_leverancier() {
return this.id_leverancier;
}
public String getGebruiksaanwijzing() {
return this.gebruiksaanwijzing;
}
public String getVeiligheidsfiche() {
return this.veiligheidsfiche;
}
public int getId_recepteenheid() {
return this.id_recepteenheid;
}
public String getOmschrijvinge() {
return this.omschrijvinge;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_materieel(int id_materieel){
 this.id_materieel=id_materieel;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setBlokkeren(boolean blokkeren){
 this.blokkeren=blokkeren;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setTechnische_keuring(boolean technische_keuring){
 this.technische_keuring=technische_keuring;
 }
public void setLink_gebruiksaanwijzing(String link_gebruiksaanwijzing){
 this.link_gebruiksaanwijzing=link_gebruiksaanwijzing;
 }
public void setLink_veiligheidsfiche(String link_veiligheidsfiche){
 this.link_veiligheidsfiche=link_veiligheidsfiche;
 }
public void setLink_technische_keuring(String link_technische_keuring){
 this.link_technische_keuring=link_technische_keuring;
 }
public void setLink_onderhoudschema(String link_onderhoudschema){
 this.link_onderhoudschema=link_onderhoudschema;
 }
public void setLink_ingebruikstelling(String link_ingebruikstelling){
 this.link_ingebruikstelling=link_ingebruikstelling;
 }
public void setLink_foto(String link_foto){
 this.link_foto=link_foto;
 }
public void setId_materieelgroep(int id_materieelgroep){
 this.id_materieelgroep=id_materieelgroep;
 }
public void setDatum_laatste_keuring(Date datum_laatste_keuring){
 this.datum_laatste_keuring=datum_laatste_keuring;
 }
public void setDatum_volgende_keuring(Date datum_volgende_keuring){
 this.datum_volgende_keuring=datum_volgende_keuring;
 }
public void setId_leverancier(int id_leverancier){
 this.id_leverancier=id_leverancier;
 }
public void setGebruiksaanwijzing(String gebruiksaanwijzing){
 this.gebruiksaanwijzing=gebruiksaanwijzing;
 }
public void setVeiligheidsfiche(String veiligheidsfiche){
 this.veiligheidsfiche=veiligheidsfiche;
 }
public void setId_recepteenheid(int id_recepteenheid){
 this.id_recepteenheid=id_recepteenheid;
 }
public void setOmschrijvinge(String omschrijvinge){
 this.omschrijvinge=omschrijvinge;
 }
}