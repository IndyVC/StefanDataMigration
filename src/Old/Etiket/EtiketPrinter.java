package Old.Etiket;
import Old.Old;
import Utils.Util;

public class EtiketPrinter implements Old { 
private int id_etiket;
private String id_werkstation;
private int id_printer;
private int cc;

public EtiketPrinter(String[] data){
this.id_etiket = Util.Int(data[0]);
this.id_werkstation = data[1];
this.id_printer = Util.Int(data[2]);
this.cc = Util.Int(data[3]);
}
public int getId_etiket() {
return this.id_etiket;
}
public String getId_werkstation() {
return this.id_werkstation;
}
public int getId_printer() {
return this.id_printer;
}
public int getCc() {
return this.cc;
}
public void setId_etiket(int id_etiket){
 this.id_etiket=id_etiket;
 }
public void setId_werkstation(String id_werkstation){
 this.id_werkstation=id_werkstation;
 }
public void setId_printer(int id_printer){
 this.id_printer=id_printer;
 }
public void setCc(int cc){
 this.cc=cc;
 }
}