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
public class FacturatiePeriode implements New{
    
    public int FacturatiePeriodeId;
    public String FacturatiePeriodeCode;
    public String Lengte;

    public FacturatiePeriode() {
    }

    public FacturatiePeriode(int FacturatiePeriodeId, String FacturatiePeriodeCode, String Lengte) {
        this.FacturatiePeriodeId = FacturatiePeriodeId;
        this.FacturatiePeriodeCode = FacturatiePeriodeCode;
        this.Lengte = Lengte;
    }

    public int getFacturatiePeriodeId() {
        return FacturatiePeriodeId;
    }

    public void setFacturatiePeriodeId(int FacturatiePeriodeId) {
        this.FacturatiePeriodeId = FacturatiePeriodeId;
    }

    public String getFacturatiePeriodeCode() {
        return FacturatiePeriodeCode;
    }

    public void setFacturatiePeriodeCode(String FacturatiePeriodeCode) {
        this.FacturatiePeriodeCode = FacturatiePeriodeCode;
    }

    public String getLengte() {
        return Lengte;
    }

    public void setLengte(String Lengte) {
        this.Lengte = Lengte;
    }

    @Override
    public void setId(int id) {
        this.FacturatiePeriodeId=id;
    }
     @Override
    public int getId() {
        return this.FacturatiePeriodeId;
    }
    
}
