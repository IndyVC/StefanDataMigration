/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;
import TussenTabellen.KlantBereikbaarheidOpDag;
import enums.BereikbaarOpDag;
import enums.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class BereikbaarheidOpDag implements New {

    public int BereikbaarheidOpDagId;
    public String SluitUurNamiddag;
    public String StartUurNamiddag;
    public String SluitUurVoormiddag;
    public String StartUurVoormiddag;
    public boolean BestellingStandaardLevering;
    public boolean BestellingVerzendbonAfdrukken;
    public boolean BestellingBestelbonAfdrukken;
    public boolean BestellingMailBestelbon;
    public String Opmerking;
    public boolean BestellingMailVerzendbon;
    public BereikbaarOpDag DagVanDeWeek;
    public boolean BereikbaarOpDag;

    public BereikbaarheidOpDag() {
    }

    public BereikbaarheidOpDag(int BereikbaarheidOpDagId,  String StartUurVoormiddag, boolean BestellingStandaardLevering, boolean BestellingVerzendbonAfdrukken, boolean BestellingBestelbonAfdrukken, boolean BestellingMailBestelbon, String Opmerking, boolean BestellingMailVerzendbon, BereikbaarOpDag DagVanDeWeek, boolean BereikbaarOpDag) {
        this.BereikbaarheidOpDagId = BereikbaarheidOpDagId;
        this.SluitUurNamiddag = "";
        this.StartUurNamiddag = "";
        this.SluitUurVoormiddag = "";
        this.StartUurVoormiddag = StartUurVoormiddag;
        this.BestellingStandaardLevering = BestellingStandaardLevering;
        this.BestellingVerzendbonAfdrukken = BestellingVerzendbonAfdrukken;
        this.BestellingBestelbonAfdrukken = BestellingBestelbonAfdrukken;
        this.BestellingMailBestelbon = BestellingMailBestelbon;
        this.Opmerking = Opmerking;
        this.BestellingMailVerzendbon = BestellingMailVerzendbon;
        this.DagVanDeWeek = DagVanDeWeek;
        this.BereikbaarOpDag = BereikbaarOpDag;
    }

    public int getBereikbaarheidOpDagId() {
        return BereikbaarheidOpDagId;
    }

    public void setBereikbaarheidOpDagId(int BereikbaarheidOpDagId) {
        this.BereikbaarheidOpDagId = BereikbaarheidOpDagId;
    }

    public String getSluitUurNamiddag() {
        return SluitUurNamiddag;
    }

    public void setSluitUurNamiddag(String SluitUurNamiddag) {
        this.SluitUurNamiddag = SluitUurNamiddag;
    }

    public String getStartUurNamiddag() {
        return StartUurNamiddag;
    }

    public void setStartUurNamiddag(String StartUurNamiddag) {
        this.StartUurNamiddag = StartUurNamiddag;
    }

    public String getSluitUurVoormiddag() {
        return SluitUurVoormiddag;
    }

    public void setSluitUurVoormiddag(String SluitUurVoormiddag) {
        this.SluitUurVoormiddag = SluitUurVoormiddag;
    }

    public String getStartUurVoormiddag() {
        return StartUurVoormiddag;
    }

    public void setStartUurVoormiddag(String StartUurVoormiddag) {
        this.StartUurVoormiddag = StartUurVoormiddag;
    }

    public boolean isBestellingStandaardLevering() {
        return BestellingStandaardLevering;
    }

    public void setBestellingStandaardLevering(boolean BestellingStandaardLevering) {
        this.BestellingStandaardLevering = BestellingStandaardLevering;
    }

    public boolean isBestellingVerzendbonAfdrukken() {
        return BestellingVerzendbonAfdrukken;
    }

    public void setBestellingVerzendbonAfdrukken(boolean BestellingVerzendbonAfdrukken) {
        this.BestellingVerzendbonAfdrukken = BestellingVerzendbonAfdrukken;
    }

    public boolean isBestellingBestelbonAfdrukken() {
        return BestellingBestelbonAfdrukken;
    }

    public void setBestellingBestelbonAfdrukken(boolean BestellingBestelbonAfdrukken) {
        this.BestellingBestelbonAfdrukken = BestellingBestelbonAfdrukken;
    }

    public boolean isBestellingMailBestelbon() {
        return BestellingMailBestelbon;
    }

    public void setBestellingMailBestelbon(boolean BestellingMailBestelbon) {
        this.BestellingMailBestelbon = BestellingMailBestelbon;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    public boolean isBestellingMailVerzendbon() {
        return BestellingMailVerzendbon;
    }

    public void setBestellingMailVerzendbon(boolean BestellingMailVerzendbon) {
        this.BestellingMailVerzendbon = BestellingMailVerzendbon;
    }

    public BereikbaarOpDag getDagVanDeWeek() {
        return DagVanDeWeek;
    }

    public void setDagVanDeWeek(BereikbaarOpDag DagVanDeWeek) {
        this.DagVanDeWeek = DagVanDeWeek;
    }

    public boolean isBereikbaarOpDag() {
        return BereikbaarOpDag;
    }

    public void setBereikbaarOpDag(boolean BereikbaarOpDag) {
        this.BereikbaarOpDag = BereikbaarOpDag;
    }

    @Override
    public void setId(int id) {
        this.BereikbaarheidOpDagId = id;
    }

    @Override
    public int getId() {
        return this.BereikbaarheidOpDagId;
    }

}
