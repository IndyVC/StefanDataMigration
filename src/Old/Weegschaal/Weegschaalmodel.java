package Old.Weegschaal;
import Old.Old;
import Utils.Util;

public class Weegschaalmodel implements Old { 
private int id_weegschaalmodel;
private String omschrijving;
private int scale_baudrate;
private int scale_parity;
private int scale_databit;
private int scale_stopbit;
private int scale_protocol;
private int handshake;
private int scale_level;

public Weegschaalmodel(String[] data){
this.id_weegschaalmodel = Util.Int(data[0]);
this.omschrijving = data[1];
this.scale_baudrate = Util.Int(data[2]);
this.scale_parity = Util.Int(data[3]);
this.scale_databit = Util.Int(data[4]);
this.scale_stopbit = Util.Int(data[5]);
this.scale_protocol = Util.Int(data[6]);
this.handshake = Util.Int(data[7]);
this.scale_level = Util.Int(data[8]);
}
public int getId_weegschaalmodel() {
return this.id_weegschaalmodel;
}
public String getOmschrijving() {
return this.omschrijving;
}
public int getScale_baudrate() {
return this.scale_baudrate;
}
public int getScale_parity() {
return this.scale_parity;
}
public int getScale_databit() {
return this.scale_databit;
}
public int getScale_stopbit() {
return this.scale_stopbit;
}
public int getScale_protocol() {
return this.scale_protocol;
}
public int getHandshake() {
return this.handshake;
}
public int getScale_level() {
return this.scale_level;
}
public void setId_weegschaalmodel(int id_weegschaalmodel){
 this.id_weegschaalmodel=id_weegschaalmodel;
 }
public void setOmschrijving(String omschrijving){
 this.omschrijving=omschrijving;
 }
public void setScale_baudrate(int scale_baudrate){
 this.scale_baudrate=scale_baudrate;
 }
public void setScale_parity(int scale_parity){
 this.scale_parity=scale_parity;
 }
public void setScale_databit(int scale_databit){
 this.scale_databit=scale_databit;
 }
public void setScale_stopbit(int scale_stopbit){
 this.scale_stopbit=scale_stopbit;
 }
public void setScale_protocol(int scale_protocol){
 this.scale_protocol=scale_protocol;
 }
public void setHandshake(int handshake){
 this.handshake=handshake;
 }
public void setScale_level(int scale_level){
 this.scale_level=scale_level;
 }
}