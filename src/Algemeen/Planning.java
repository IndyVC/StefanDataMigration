/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algemeen;

import java.sql.Date;
import Leveringen.Werkplek;

/**
 *
 * @author stefa
 */
public class Planning {

    public int PlanningId;
    public Werkplek Werkplek;
    public Date BeginUur;
    public Date EindUur;

    public Planning() {

    }

    public Planning(Werkplek werkplek, Date beginUur, Date eindUur) {
        this.Werkplek = werkplek;
        this.BeginUur = beginUur;
        this.EindUur = eindUur;
    }
}
