/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Algemeen.Omschrijving;
import New.New;
import enums.WeegschaalModel;

/**
 *
 * @author stefa
 */
public class Weegschaal implements New{

    public int WeegschaalId;
    public Omschrijving Omschrijving;
    public WeegschaalModel WeegschaalModel;
    public boolean IsTCPWeegschaal;
    public IPAdres IpAdres;
    public int Poort;
    public double MaximaalMeetgewicht;

    public Weegschaal() {
    }

    public Weegschaal(int WeegschaalId, Omschrijving Omschrijving, WeegschaalModel WeegschaalModel, boolean IsTCPWeegschaal, IPAdres IpAdres, int Poort, double MaximaalMeetgewicht) {
        this.WeegschaalId = WeegschaalId;
        this.Omschrijving = Omschrijving;
        this.WeegschaalModel = WeegschaalModel;
        this.IsTCPWeegschaal = IsTCPWeegschaal;
        this.IpAdres = IpAdres;
        this.Poort = Poort;
        this.MaximaalMeetgewicht = MaximaalMeetgewicht;
    }

    public int getWeegschaalId() {
        return WeegschaalId;
    }

    public void setWeegschaalId(int WeegschaalId) {
        this.WeegschaalId = WeegschaalId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public WeegschaalModel getWeegschaalModel() {
        return WeegschaalModel;
    }

    public void setWeegschaalModel(WeegschaalModel WeegschaalModel) {
        this.WeegschaalModel = WeegschaalModel;
    }

    public boolean isIsTCPWeegschaal() {
        return IsTCPWeegschaal;
    }

    public void setIsTCPWeegschaal(boolean IsTCPWeegschaal) {
        this.IsTCPWeegschaal = IsTCPWeegschaal;
    }

    public IPAdres getIpAdres() {
        return IpAdres;
    }

    public void setIpAdres(IPAdres IpAdres) {
        this.IpAdres = IpAdres;
    }

    public int getPoort() {
        return Poort;
    }

    public void setPoort(int Poort) {
        this.Poort = Poort;
    }

    public double getMaximaalMeetgewicht() {
        return MaximaalMeetgewicht;
    }

    public void setMaximaalMeetgewicht(double MaximaalMeetgewicht) {
        this.MaximaalMeetgewicht = MaximaalMeetgewicht;
    }

    @Override
    public void setId(int id) {
        this.WeegschaalId=id;
    }
     @Override
    public int getId() {
        return this.WeegschaalId;
    }
    
}
