package Old.Parameters;
import Old.Old;
import Utils.Util;

public class MicrobiologischeParameter implements Old { 
private int id_microbiologische_parameter;
private String omschrijvingn;
private String omschrijvingf;
private String omschrijving1;
private String omschrijving2;
private String omschrijving3;
private String omschrijving4;
private String omschrijving5;
private String omschrijving6;
private String omschrijving7;
private String omschrijving8;
private String omschrijving9;
private String parameter1_1;
private String parameter1_2;
private String parameter1_3;
private String parameter2_1;
private String parameter2_2;
private String parameter2_3;
private String parameter3_1;
private String parameter3_2;
private String parameter3_3;
private String parameter4_1;
private String parameter4_2;
private String parameter4_3;
private String parameter5_1;
private String parameter5_2;
private String parameter5_3;
private String parameter6_1;
private String parameter6_2;
private String parameter6_3;
private String parameter7_1;
private String parameter7_2;
private String parameter7_3;
private String parameter8_1;
private String parameter8_2;
private String parameter8_3;
private String parameter9_1;
private String parameter9_2;
private String parameter9_3;
private String tekst_nederlands;
private int cc;
private String tekst_frans;

public MicrobiologischeParameter(String[] data){
this.id_microbiologische_parameter = Util.Int(data[0]);
this.omschrijvingn = data[1];
this.omschrijvingf = data[2];
this.omschrijving1 = data[3];
this.omschrijving2 = data[4];
this.omschrijving3 = data[5];
this.omschrijving4 = data[6];
this.omschrijving5 = data[7];
this.omschrijving6 = data[8];
this.omschrijving7 = data[9];
this.omschrijving8 = data[10];
this.omschrijving9 = data[11];
this.parameter1_1 = data[12];
this.parameter1_2 = data[13];
this.parameter1_3 = data[14];
this.parameter2_1 = data[15];
this.parameter2_2 = data[16];
this.parameter2_3 = data[17];
this.parameter3_1 = data[18];
this.parameter3_2 = data[19];
this.parameter3_3 = data[20];
this.parameter4_1 = data[21];
this.parameter4_2 = data[22];
this.parameter4_3 = data[23];
this.parameter5_1 = data[24];
this.parameter5_2 = data[25];
this.parameter5_3 = data[26];
this.parameter6_1 = data[27];
this.parameter6_2 = data[28];
this.parameter6_3 = data[29];
this.parameter7_1 = data[30];
this.parameter7_2 = data[31];
this.parameter7_3 = data[32];
this.parameter8_1 = data[33];
this.parameter8_2 = data[34];
this.parameter8_3 = data[35];
this.parameter9_1 = data[36];
this.parameter9_2 = data[37];
this.parameter9_3 = data[38];
this.tekst_nederlands = data[39];
this.cc = Util.Int(data[40]);
this.tekst_frans = data[41];
}
public int getId_microbiologische_parameter() {
return this.id_microbiologische_parameter;
}
public String getOmschrijvingn() {
return this.omschrijvingn;
}
public String getOmschrijvingf() {
return this.omschrijvingf;
}
public String getOmschrijving1() {
return this.omschrijving1;
}
public String getOmschrijving2() {
return this.omschrijving2;
}
public String getOmschrijving3() {
return this.omschrijving3;
}
public String getOmschrijving4() {
return this.omschrijving4;
}
public String getOmschrijving5() {
return this.omschrijving5;
}
public String getOmschrijving6() {
return this.omschrijving6;
}
public String getOmschrijving7() {
return this.omschrijving7;
}
public String getOmschrijving8() {
return this.omschrijving8;
}
public String getOmschrijving9() {
return this.omschrijving9;
}
public String getParameter1_1() {
return this.parameter1_1;
}
public String getParameter1_2() {
return this.parameter1_2;
}
public String getParameter1_3() {
return this.parameter1_3;
}
public String getParameter2_1() {
return this.parameter2_1;
}
public String getParameter2_2() {
return this.parameter2_2;
}
public String getParameter2_3() {
return this.parameter2_3;
}
public String getParameter3_1() {
return this.parameter3_1;
}
public String getParameter3_2() {
return this.parameter3_2;
}
public String getParameter3_3() {
return this.parameter3_3;
}
public String getParameter4_1() {
return this.parameter4_1;
}
public String getParameter4_2() {
return this.parameter4_2;
}
public String getParameter4_3() {
return this.parameter4_3;
}
public String getParameter5_1() {
return this.parameter5_1;
}
public String getParameter5_2() {
return this.parameter5_2;
}
public String getParameter5_3() {
return this.parameter5_3;
}
public String getParameter6_1() {
return this.parameter6_1;
}
public String getParameter6_2() {
return this.parameter6_2;
}
public String getParameter6_3() {
return this.parameter6_3;
}
public String getParameter7_1() {
return this.parameter7_1;
}
public String getParameter7_2() {
return this.parameter7_2;
}
public String getParameter7_3() {
return this.parameter7_3;
}
public String getParameter8_1() {
return this.parameter8_1;
}
public String getParameter8_2() {
return this.parameter8_2;
}
public String getParameter8_3() {
return this.parameter8_3;
}
public String getParameter9_1() {
return this.parameter9_1;
}
public String getParameter9_2() {
return this.parameter9_2;
}
public String getParameter9_3() {
return this.parameter9_3;
}
public String getTekst_nederlands() {
return this.tekst_nederlands;
}
public int getCc() {
return this.cc;
}
public String getTekst_frans() {
return this.tekst_frans;
}
public void setId_microbiologische_parameter(int id_microbiologische_parameter){
 this.id_microbiologische_parameter=id_microbiologische_parameter;
 }
public void setOmschrijvingn(String omschrijvingn){
 this.omschrijvingn=omschrijvingn;
 }
public void setOmschrijvingf(String omschrijvingf){
 this.omschrijvingf=omschrijvingf;
 }
public void setOmschrijving1(String omschrijving1){
 this.omschrijving1=omschrijving1;
 }
public void setOmschrijving2(String omschrijving2){
 this.omschrijving2=omschrijving2;
 }
public void setOmschrijving3(String omschrijving3){
 this.omschrijving3=omschrijving3;
 }
public void setOmschrijving4(String omschrijving4){
 this.omschrijving4=omschrijving4;
 }
public void setOmschrijving5(String omschrijving5){
 this.omschrijving5=omschrijving5;
 }
public void setOmschrijving6(String omschrijving6){
 this.omschrijving6=omschrijving6;
 }
public void setOmschrijving7(String omschrijving7){
 this.omschrijving7=omschrijving7;
 }
public void setOmschrijving8(String omschrijving8){
 this.omschrijving8=omschrijving8;
 }
public void setOmschrijving9(String omschrijving9){
 this.omschrijving9=omschrijving9;
 }
public void setParameter1_1(String parameter1_1){
 this.parameter1_1=parameter1_1;
 }
public void setParameter1_2(String parameter1_2){
 this.parameter1_2=parameter1_2;
 }
public void setParameter1_3(String parameter1_3){
 this.parameter1_3=parameter1_3;
 }
public void setParameter2_1(String parameter2_1){
 this.parameter2_1=parameter2_1;
 }
public void setParameter2_2(String parameter2_2){
 this.parameter2_2=parameter2_2;
 }
public void setParameter2_3(String parameter2_3){
 this.parameter2_3=parameter2_3;
 }
public void setParameter3_1(String parameter3_1){
 this.parameter3_1=parameter3_1;
 }
public void setParameter3_2(String parameter3_2){
 this.parameter3_2=parameter3_2;
 }
public void setParameter3_3(String parameter3_3){
 this.parameter3_3=parameter3_3;
 }
public void setParameter4_1(String parameter4_1){
 this.parameter4_1=parameter4_1;
 }
public void setParameter4_2(String parameter4_2){
 this.parameter4_2=parameter4_2;
 }
public void setParameter4_3(String parameter4_3){
 this.parameter4_3=parameter4_3;
 }
public void setParameter5_1(String parameter5_1){
 this.parameter5_1=parameter5_1;
 }
public void setParameter5_2(String parameter5_2){
 this.parameter5_2=parameter5_2;
 }
public void setParameter5_3(String parameter5_3){
 this.parameter5_3=parameter5_3;
 }
public void setParameter6_1(String parameter6_1){
 this.parameter6_1=parameter6_1;
 }
public void setParameter6_2(String parameter6_2){
 this.parameter6_2=parameter6_2;
 }
public void setParameter6_3(String parameter6_3){
 this.parameter6_3=parameter6_3;
 }
public void setParameter7_1(String parameter7_1){
 this.parameter7_1=parameter7_1;
 }
public void setParameter7_2(String parameter7_2){
 this.parameter7_2=parameter7_2;
 }
public void setParameter7_3(String parameter7_3){
 this.parameter7_3=parameter7_3;
 }
public void setParameter8_1(String parameter8_1){
 this.parameter8_1=parameter8_1;
 }
public void setParameter8_2(String parameter8_2){
 this.parameter8_2=parameter8_2;
 }
public void setParameter8_3(String parameter8_3){
 this.parameter8_3=parameter8_3;
 }
public void setParameter9_1(String parameter9_1){
 this.parameter9_1=parameter9_1;
 }
public void setParameter9_2(String parameter9_2){
 this.parameter9_2=parameter9_2;
 }
public void setParameter9_3(String parameter9_3){
 this.parameter9_3=parameter9_3;
 }
public void setTekst_nederlands(String tekst_nederlands){
 this.tekst_nederlands=tekst_nederlands;
 }
public void setCc(int cc){
 this.cc=cc;
 }
public void setTekst_frans(String tekst_frans){
 this.tekst_frans=tekst_frans;
 }
}