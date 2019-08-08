/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leveringen;

import New.New;

/**
 *
 * @author stefa
 */
public class LeveringsToer implements New {

    public int LeveringsToerId;
    public String VolgNummer;
    public String Opmerking;
    public String Info;

    public LeveringsToer() {
    }

    public LeveringsToer(int LeveringsToerId, String VolgNummer, String Opmerking, String Info) {
        this.LeveringsToerId = LeveringsToerId;
        this.VolgNummer = VolgNummer;
        this.Opmerking = Opmerking;
        this.Info = Info;
    }

    public int getLeveringsToerId() {
        return LeveringsToerId;
    }

    public void setLeveringsToerId(int LeveringsToerId) {
        this.LeveringsToerId = LeveringsToerId;
    }

    public String getVolgNummer() {
        return VolgNummer;
    }

    public void setVolgNummer(String VolgNummer) {
        this.VolgNummer = VolgNummer;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    @Override
    public int getId() {
        return this.LeveringsToerId;
    }

    @Override
    public void setId(int id) {
        this.LeveringsToerId = id;
    }
}
