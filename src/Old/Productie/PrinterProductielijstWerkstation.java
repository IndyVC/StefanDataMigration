package Old.Productie;
import Old.Old;
import Utils.Util;

public class PrinterProductielijstWerkstation implements Old { 
private int id_bedrijf;
private int id_produktielijst;
private int id_printer;
private String id_werkstation;

public PrinterProductielijstWerkstation(String[] data){
this.id_bedrijf = Util.Int(data[0]);
this.id_produktielijst = Util.Int(data[1]);
this.id_printer = Util.Int(data[2]);
this.id_werkstation = data[3];
}
public int getId_bedrijf() {
return this.id_bedrijf;
}
public int getId_produktielijst() {
return this.id_produktielijst;
}
public int getId_printer() {
return this.id_printer;
}
public String getId_werkstation() {
return this.id_werkstation;
}
public void setId_bedrijf(int id_bedrijf){
 this.id_bedrijf=id_bedrijf;
 }
public void setId_produktielijst(int id_produktielijst){
 this.id_produktielijst=id_produktielijst;
 }
public void setId_printer(int id_printer){
 this.id_printer=id_printer;
 }
public void setId_werkstation(String id_werkstation){
 this.id_werkstation=id_werkstation;
 }
}