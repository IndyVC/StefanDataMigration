/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;
import java.math.BigDecimal;

/**
 *
 * @author stefa
 */
public class VerkoopsBarcode implements New{

    public int VerkoopsBarcodeId;
    public BigDecimal GTIN;
    public boolean Afdrukken;

    public VerkoopsBarcode() {
    }

    public VerkoopsBarcode(int VerkoopsBarcodeId, BigDecimal GTIN, boolean Afdrukken) {
        this.VerkoopsBarcodeId = VerkoopsBarcodeId;
        this.GTIN = GTIN;
        this.Afdrukken = Afdrukken;
    }

    public int getVerkoopsBarcodeId() {
        return VerkoopsBarcodeId;
    }

    public void setVerkoopsBarcodeId(int VerkoopsBarcodeId) {
        this.VerkoopsBarcodeId = VerkoopsBarcodeId;
    }

    public BigDecimal getGTIN() {
        return GTIN;
    }

    public void setGTIN(BigDecimal GTIN) {
        this.GTIN = GTIN;
    }

    public boolean isAfdrukken() {
        return Afdrukken;
    }

    public void setAfdrukken(boolean Afdrukken) {
        this.Afdrukken = Afdrukken;
    }

    @Override
    public void setId(int id) {
        this.VerkoopsBarcodeId=id;
    }
    
     @Override
    public int getId() {
        return this.VerkoopsBarcodeId;
    }
}
