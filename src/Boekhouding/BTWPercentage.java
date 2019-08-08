/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import New.New;

/**
 *
 * @author stefa
 */
public class BTWPercentage implements New{
    
    public int BTWpercentageId;
    public String ExterneCode;
    public double Percentage;
    public AlgemeneRekening AlgemeneRekeningAftrekbaar;
    public AlgemeneRekening AlgemeneRekeningVerschuldigd;
    public boolean Blokkeren;

    public BTWPercentage() {
    }

    public BTWPercentage(int BTWpercentageId, String ExterneCode, double Percentage, AlgemeneRekening AlgemeneRekeningAftrekbaar, AlgemeneRekening AlgemeneRekeningVerschuldigd, boolean Blokkeren) {
        this.BTWpercentageId = BTWpercentageId;
        this.ExterneCode = ExterneCode;
        this.Percentage = Percentage;
        this.AlgemeneRekeningAftrekbaar = AlgemeneRekeningAftrekbaar;
        this.AlgemeneRekeningVerschuldigd = AlgemeneRekeningVerschuldigd;
        this.Blokkeren = Blokkeren;
    }

    public int getBTWpercentageId() {
        return BTWpercentageId;
    }

    public void setBTWpercentageId(int BTWpercentageId) {
        this.BTWpercentageId = BTWpercentageId;
    }

    public String getExterneCode() {
        return ExterneCode;
    }

    public void setExterneCode(String ExterneCode) {
        this.ExterneCode = ExterneCode;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double Percentage) {
        this.Percentage = Percentage;
    }

    public AlgemeneRekening getAlgemeneRekeningAftrekbaar() {
        return AlgemeneRekeningAftrekbaar;
    }

    public void setAlgemeneRekeningAftrekbaar(AlgemeneRekening AlgemeneRekeningAftrekbaar) {
        this.AlgemeneRekeningAftrekbaar = AlgemeneRekeningAftrekbaar;
    }

    public AlgemeneRekening getAlgemeneRekeningVerschuldigd() {
        return AlgemeneRekeningVerschuldigd;
    }

    public void setAlgemeneRekeningVerschuldigd(AlgemeneRekening AlgemeneRekeningVerschuldigd) {
        this.AlgemeneRekeningVerschuldigd = AlgemeneRekeningVerschuldigd;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    @Override
    public void setId(int id) {
        this.BTWpercentageId=id;
    }
     @Override
    public int getId() {
        return this.BTWpercentageId;
    }
    
}
