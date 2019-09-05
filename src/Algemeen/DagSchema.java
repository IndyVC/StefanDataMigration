/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;
import Producten.Recepten.Taak;
import enums.BereikbaarOpDag;
import enums.DayOfWeek;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author stefa
 */
public class DagSchema implements New {

    public int DagSchemaId;

    public Date BeginUur;

    public Date EindUur;

    public BereikbaarOpDag DagVanDeWeek;

    public WeekSchema WeekSchema;
    public List<Taak> TakenWerknemer;

    public DagSchema() {
    }

    public DagSchema(int WerknemerDagSchemaId, Date BeginUur, Date EindUur, BereikbaarOpDag DagVanDeWeek) {
        this.DagSchemaId = WerknemerDagSchemaId;
        this.BeginUur = BeginUur;
        this.EindUur = EindUur;
        this.DagVanDeWeek = DagVanDeWeek;
    }

    public int getDagSchemaId() {
        return DagSchemaId;
    }

    public void setDagSchemaId(int DagSchemaId) {
        this.DagSchemaId = DagSchemaId;
    }

    public Date getBeginUur() {
        return BeginUur;
    }

    public void setBeginUur(Date BeginUur) {
        this.BeginUur = BeginUur;
    }

    public Date getEindUur() {
        return EindUur;
    }

    public void setEindUur(Date EindUur) {
        this.EindUur = EindUur;
    }

    public BereikbaarOpDag getDagVanDeWeek() {
        return DagVanDeWeek;
    }

    public void setDagVanDeWeek(BereikbaarOpDag DagVanDeWeek) {
        this.DagVanDeWeek = DagVanDeWeek;
    }

    public List<Taak> getTakenWerknemer() {
        return TakenWerknemer;
    }

    public void setTakenWerknemer(List<Taak> TakenWerknemer) {
        this.TakenWerknemer = TakenWerknemer;
    }

    public WeekSchema getWeekSchema() {
        return WeekSchema;
    }

    public void setWeekSchema(WeekSchema WeekSchema) {
        this.WeekSchema = WeekSchema;
    }

    @Override
    public void setId(int id) {
        this.DagSchemaId = id;
    }

    @Override
    public int getId() {
        return this.DagSchemaId;
    }

}
