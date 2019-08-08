package Old.Online;
import Old.Old;
import Utils.Util;

public class OnlineAankoopproductAllergeen implements Old { 
private int id_online;
private int id_allergeen;
private int code;

public OnlineAankoopproductAllergeen(String[] data){
this.id_online = Util.Int(data[0]);
this.id_allergeen = Util.Int(data[1]);
this.code = Util.Int(data[2]);
}
public int getId_online() {
return this.id_online;
}
public int getId_allergeen() {
return this.id_allergeen;
}
public int getCode() {
return this.code;
}
public void setId_online(int id_online){
 this.id_online=id_online;
 }
public void setId_allergeen(int id_allergeen){
 this.id_allergeen=id_allergeen;
 }
public void setCode(int code){
 this.code=code;
 }
}