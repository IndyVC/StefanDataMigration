package Old.Boekhouding;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class BedrijfLink implements Old { 
private int id_bedrijf;
private int id_link;
private String value;
private Date inserted;
private Date updated;
private int cc;

public BedrijfLink(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_link = Util.Int(data[1]);
this.value = data[2];
this.inserted = Util.Date(data[3]);
this.updated = Util.Date(data[4]);
this.cc = Util.Int(data[5]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_link() {
return this.id_link;
}
public String getValue() {
return this.value;
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
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_link(int id_link){
 this.id_link=id_link;
 }
public void setValue(String value){
 this.value=value;
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
}