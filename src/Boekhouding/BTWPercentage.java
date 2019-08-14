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
    public AlgemeneRekening AlgemeneRekeningAftrekbaarAlgemeneRekening;
    public AlgemeneRekening AlgemeneRekeningVerschuldigdAlgemeneRekening;
    public boolean Blokkeren;

    public BTWPercentage() {
    }

    public BTWPercentage(int BTWpercentageId, String ExterneCode, double Percentage, AlgemeneRekening AlgemeneRekeningAftrekbaar, AlgemeneRekening AlgemeneRekeningVerschuldigd, boolean Blokkeren) {
        this.BTWpercentageId = BTWpercentageId;
        this.ExterneCode = ExterneCode;
        this.Percentage = Percentage;
        this.AlgemeneRekeningAftrekbaarAlgemeneRekening = AlgemeneRekeningAftrekbaar;
        this.AlgemeneRekeningVerschuldigdAlgemeneRekening = AlgemeneRekeningVerschuldigd;
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

    public AlgemeneRekening getAlgemeneRekeningAftrekbaarAlgemeneRekening() {
        return AlgemeneRekeningAftrekbaarAlgemeneRekening;
    }

    public void setAlgemeneRekeningAftrekbaarAlgemeneRekening(AlgemeneRekening AlgemeneRekeningAftrekbaarAlgemeneRekening) {
        this.AlgemeneRekeningAftrekbaarAlgemeneRekening = AlgemeneRekeningAftrekbaarAlgemeneRekening;
    }

    public AlgemeneRekening getAlgemeneRekeningVerschuldigdAlgemeneRekening() {
        return AlgemeneRekeningVerschuldigdAlgemeneRekening;
    }

    public void setAlgemeneRekeningVerschuldigdAlgemeneRekening(AlgemeneRekening AlgemeneRekeningVerschuldigdAlgemeneRekening) {
        this.AlgemeneRekeningVerschuldigdAlgemeneRekening = AlgemeneRekeningVerschuldigdAlgemeneRekening;
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
