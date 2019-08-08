package Old.Boekhouding;
import Old.Old;
import Utils.Util;

public class Btwcode implements Old { 
private int id_btwcode;
private double percentage;
private int id_algemene_rekening_type;
private int id_algemene_rekening;
private String codeboekhouding;
private int cc;
private int id_algemene_rekening_aftrekbaar;
private int id_algemene_rekening_verschuldigd;

public Btwcode(String[] data){
this.id_btwcode = Util.Int(data[0]);
this.percentage = Util.Double(data[1]);
this.id_algemene_rekening_type = Util.Int(data[2]);
this.id_algemene_rekening = Util.Int(data[3]);
this.codeboekhouding = data[4];
this.cc = Util.Int(data[5]);
this.id_algemene_rekening_aftrekbaar = Util.Int(data[6]);
this.id_algemene_rekening_verschuldigd = Util.Int(data[7]);
}
public int getId_btwcode() {
return this.id_btwcode;
}
public double getPercentage() {
return this.percentage;
}
public int getId_algemene_rekening_type() {
return this.id_algemene_rekening_type;
}
public int getId_algemene_rekening() {
return this.id_algemene_rekening;
}
public String getCodeboekhouding() {
return this.codeboekhouding;
}
public int getCc() {
return this.cc;
}
public int getId_algemene_rekening_aftrekbaar() {
return this.id_algemene_rekening_aftrekbaar;
}
public int getId_algemene_rekening_verschuldigd() {
return this.id_algemene_rekening_verschuldigd;
}
public void setId_btwcode(int id_btwcode){
 this.id_btwcode=id_btwcode;
 }
public void setPercentage(double percentage){
 this.percentage=percentage;
 }
public void setId_algemene_rekening_type(int id_algemene_rekening_type){
 this.id_algemene_rekening_type=id_algemene_rekening_type;
 }
public void setId_algemene_rekening(int id_algemene_rekening){
 this.id_algemene_rekening=id_algemene_rekening;
 }
public void setCodeboekhouding(String codeboekhouding){
 this.codeboekhouding=codeboekhouding;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setId_algemene_rekening_aftrekbaar(int id_algemene_rekening_aftrekbaar){
 this.id_algemene_rekening_aftrekbaar=id_algemene_rekening_aftrekbaar;
 }
public void setId_algemene_rekening_verschuldigd(int id_algemene_rekening_verschuldigd){
 this.id_algemene_rekening_verschuldigd=id_algemene_rekening_verschuldigd;
 }
}