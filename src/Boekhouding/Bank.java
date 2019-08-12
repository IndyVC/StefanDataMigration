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
public class Bank implements New{
    
    public int BankId;
    public String Naam;
    public String Code;

    public Bank() {
    }

    public Bank(int BankId, String Naam, String Code) {
        this.BankId = BankId;
        this.Naam = Naam;
        this.Code = Code;
    }

    public int getBankId() {
        return BankId;
    }

    public void setBankId(int BankId) {
        this.BankId = BankId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Override
    public void setId(int id) {
        this.BankId = id;
    }

    @Override
    public int getId() {
        return this.BankId;
    }
    
    
}
