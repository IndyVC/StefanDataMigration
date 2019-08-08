package Old;
import Utils.Util;
import java.sql.Date;

public class BedrijvenAllergeen implements Old { 
private int id_bedrijf;
private int id_allergeen;
private int code;
private Date inserted;
private int cc;

public BedrijvenAllergeen(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_allergeen = Util.Int(data[1]);
this.code = Util.Int(data[2]);
this.inserted = Util.Date(data[3]);
this.cc = Util.Int(data[4]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_allergeen() {
return this.id_allergeen;
}
public int getCode() {
return this.code;
}
public Date getInserted() {
return this.inserted;
}
public int getCc() {
return this.cc;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setCode(int code){
 this.code=code;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}