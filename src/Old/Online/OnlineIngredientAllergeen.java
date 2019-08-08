package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineIngredientAllergeen implements Old { 
private int id_ingredient;
private int id_allergeen;
private int code;

public OnlineIngredientAllergeen(String[] data){
this.id_ingredient = Util.Int(data[0]);
this.id_allergeen = Util.Int(data[1]);
this.code = Util.Int(data[2]);
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
public void setId_ingredient(int id_ingredient){
 this.id_ingredient=id_ingredient;
 }
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setCode(int code){
 this.code=code;
 }
}