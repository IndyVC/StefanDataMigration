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
public class BankRekeningNummer implements New{
    
    public int BankRekeningNummerId;
    public String RekeningNr;
    public String AfkortingBankInstelling;

    public BankRekeningNummer() {
    }

    public BankRekeningNummer(int BankRekeningNummerId, String RekeningNr, String AfkortingBankInstelling) {
        this.BankRekeningNummerId = BankRekeningNummerId;
        this.RekeningNr = RekeningNr;
        this.AfkortingBankInstelling = AfkortingBankInstelling;
    }

    public int getBankRekeningNummerId() {
        return BankRekeningNummerId;
    }

    public void setBankRekeningNummerId(int BankRekeningNummerId) {
        this.BankRekeningNummerId = BankRekeningNummerId;
    }

    public String getRekeningNr() {
        return RekeningNr;
    }

    public void setRekeningNr(String RekeningNr) {
        this.RekeningNr = RekeningNr;
    }

    public String getAfkortingBankInstelling() {
        return AfkortingBankInstelling;
    }

    public void setAfkortingBankInstelling(String AfkortingBankInstelling) {
        this.AfkortingBankInstelling = AfkortingBankInstelling;
    }

    @Override
    public void setId(int id) {
        this.BankRekeningNummerId=id;
    }
     @Override
    public int getId() {
        return this.BankRekeningNummerId;
    }
    
}
