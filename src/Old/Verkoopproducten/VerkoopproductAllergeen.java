package Old.Verkoopproducten;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class VerkoopproductAllergeen implements Old { 
private int id_bedrijf;
private int id_verkoopproduct;
private int id_allergeen;
private int code;
private int cc;
private Date inserted;
private Date updated;

public VerkoopproductAllergeen(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_verkoopproduct = Util.Int(data[1]);
this.id_allergeen = Util.Int(data[2]);
this.code = Util.Int(data[3]);
this.cc = Util.Int(data[4]);
this.inserted = Util.Date(data[5]);
this.updated = Util.Date(data[6]);
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_verkoopproduct() {
return this.id_verkoopproduct;
}
public int getId_allergeen() {
return this.id_allergeen;
}
public int getCode() {
return this.code;
}
public int getCc() {
return this.cc;
}
public Date getInserted() {
return this.inserted;
}
public Date getUpdated() {
return this.updated;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_verkoopproduct(int id_verkoopproduct){
 this.id_verkoopproduct=id_verkoopproduct;
 }
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setCode(int code){
 this.code=code;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setInserted(Date inserted){
 this.inserted=inserted;
 }
public void setUpdated(Date updated){
 this.updated=updated;
 }
}