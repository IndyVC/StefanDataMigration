/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import New.New;
import enums.DayOfWeek;

/**
 *
 * @author stefa
 */
public class BereikbaarheidOpDag implements New{
    
    public int BereikbaarheidOpDagId;
    public DayOfWeek DagVanDeWeek;
    public boolean BereikbaarOpDag;

    public BereikbaarheidOpDag() {
    }

    public BereikbaarheidOpDag(int BereikbaarheidOpDagId, DayOfWeek DagVanDeWeek, boolean BereikbaarOpDag) {
        this.BereikbaarheidOpDagId = BereikbaarheidOpDagId;
        this.DagVanDeWeek = DagVanDeWeek;
        this.BereikbaarOpDag = BereikbaarOpDag;
    }

    public int getBereikbaarheidOpDagId() {
        return BereikbaarheidOpDagId;
    }

    public void setBereikbaarheidOpDagId(int BereikbaarheidOpDagId) {
        this.BereikbaarheidOpDagId = BereikbaarheidOpDagId;
    }

    public DayOfWeek getDagVanDeWeek() {
        return DagVanDeWeek;
    }

    public void setDagVanDeWeek(DayOfWeek DagVanDeWeek) {
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
        this.BereikbaarheidOpDagId=id;
    }

    @Override
    public int getId() {
        return this.BereikbaarheidOpDagId;
    }
    
    
}
