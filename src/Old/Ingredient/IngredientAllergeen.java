package Old.Ingredient;
import Old.Old;
import Utils.Util;
import java.sql.Date;

public class IngredientAllergeen implements Old { 
private int id_ingredient;
private int id_allergeen;
private int code;
private Date inserted;
private Date updated;
private String cc;

public IngredientAllergeen(String[] data){
this.id_ingredient = Util.Int(data[0]);
this.id_allergeen = Util.Int(data[1]);
this.code = Util.Int(data[2]);
this.inserted = Util.Date(data[3]);
this.updated = Util.Date(data[4]);
this.cc = data[5];
}
public int getId_ingredient() {
return this.id_ingredient;
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
public Date getUpdated() {
return this.updated;
}
public String getCc() {
return this.cc;
}
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
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
public void setUpdated(Date updated){
 this.updated=updated;
 }
public void setCc(String cc){
 this.cc=cc;
 }
}