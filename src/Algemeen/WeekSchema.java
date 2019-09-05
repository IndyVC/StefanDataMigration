/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;
import java.sql.Date;

import java.util.List;

/**
 *
 * @author stefa
 */
public class WeekSchema implements New {

    public int WeekSchemaId;
    public Date StartWeekDatum;
    public List<DagSchema> DagSchemas;

    public WeekSchema() {
    }

    public WeekSchema(int WerknemerWeekSchemaId, Date StartWeekDatum) {
        this.WeekSchemaId = WerknemerWeekSchemaId;
        this.StartWeekDatum = StartWeekDatum;
    }

    public int getWeekSchemaId() {
        return WeekSchemaId;
    }

    public void setWeekSchemaId(int WeekSchemaId) {
        this.WeekSchemaId = WeekSchemaId;
    }

    public Date getStartWeekDatum() {
        return StartWeekDatum;
    }

    public void setStartWeekDatum(Date StartWeekDatum) {
        this.StartWeekDatum = StartWeekDatum;
    }

    public List<DagSchema> getDagSchemas() {
        return DagSchemas;
    }

    public void setDagSchemas(List<DagSchema> DagSchemas) {
        this.DagSchemas = DagSchemas;
    }

    @Override
    public void setId(int id) {
        this.WeekSchemaId = id;
    }

    @Override
    public int getId() {
        return this.WeekSchemaId;
    }

}
