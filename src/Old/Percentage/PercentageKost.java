package Old.Percentage;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class PercentageKost implements Old { 
private int id_bedrijf;
private int jaar;
private int produktie_verkoop;
private int code_eigen_fabrikaat;
private int groep;
private double percentage_inrichting;
private double percentage_uitrusting;
private double percentage_onderhoud;
private double percentage_beheer;
private double percentage_andere;
private double percentage_verkoop;
private double percentage_verkoopverlies;
private Date inserted;
private Date updated;
private double percentage_onrechtstreekse_produktie;
private double percentage_winst;

public PercentageKost(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.jaar = Util.Int(data[1]);
this.produktie_verkoop = Util.Int(data[2]);
this.code_eigen_fabrikaat = Util.Int(data[3]);
this.groep = Util.Int(data[4]);
this.percentage_inrichting = Util.Double(data[5]);
this.percentage_uitrusting = Util.Double(data[6]);
this.percentage_onderhoud = Util.Double(data[7]);
this.percentage_beheer = Util.Double(data[8]);
this.percentage_andere = Util.Double(data[9]);
this.percentage_verkoop = Util.Double(data[10]);
this.percentage_verkoopverlies = Util.Double(data[11]);
this.inserted = Util.Date(data[12]);
this.updated = Util.Date(data[13]);
this.percentage_onrechtstreekse_produktie = Util.Double(data[14]);
this.percentage_winst = Util.Double(data[15]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getJaar() {
return this.jaar;
}
public int getProduktie_verkoop() {
return this.produktie_verkoop;
}
public int getCode_eigen_fabrikaat() {
return this.code_eigen_fabrikaat;
}
public int getGroep() {
return this.groep;
}
public double getPercentage_inrichting() {
return this.percentage_inrichting;
}
public double getPercentage_uitrusting() {
return this.percentage_uitrusting;
}
public double getPercentage_onderhoud() {
return this.percentage_onderhoud;
}
public double getPercentage_beheer() {
return this.percentage_beheer;
}
public double getPercentage_andere() {
return this.percentage_andere;
}
public double getPercentage_verkoop() {
return this.percentage_verkoop;
}
public double getPercentage_verkoopverlies() {
return this.percentage_verkoopverlies;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public double getPercentage_onrechtstreekse_produktie() {
return this.percentage_onrechtstreekse_produktie;
}
public double getPercentage_winst() {
return this.percentage_winst;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setJaar(int jaar){
 this.jaar=jaar;
 }
public void setProduktie_verkoop(int produktie_verkoop){
 this.produktie_verkoop=produktie_verkoop;
 }
public void setCode_eigen_fabrikaat(int code_eigen_fabrikaat){
 this.code_eigen_fabrikaat=code_eigen_fabrikaat;
 }
public void setGroep(int groep){
 this.groep=groep;
 }
public void setPercentage_inrichting(double percentage_inrichting){
 this.percentage_inrichting=percentage_inrichting;
 }
public void setPercentage_uitrusting(double percentage_uitrusting){
 this.percentage_uitrusting=percentage_uitrusting;
 }
public void setPercentage_onderhoud(double percentage_onderhoud){
 this.percentage_onderhoud=percentage_onderhoud;
 }
public void setPercentage_beheer(double percentage_beheer){
 this.percentage_beheer=percentage_beheer;
 }
public void setPercentage_andere(double percentage_andere){
 this.percentage_andere=percentage_andere;
 }
public void setPercentage_verkoop(double percentage_verkoop){
 this.percentage_verkoop=percentage_verkoop;
 }
public void setPercentage_verkoopverlies(double percentage_verkoopverlies){
 this.percentage_verkoopverlies=percentage_verkoopverlies;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setPercentage_onrechtstreekse_produktie(double percentage_onrechtstreekse_produktie){
 this.percentage_onrechtstreekse_produktie=percentage_onrechtstreekse_produktie;
 }
public void setPercentage_winst(double percentage_winst){
 this.percentage_winst=percentage_winst;
 }
}