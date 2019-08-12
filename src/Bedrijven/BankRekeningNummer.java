/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Boekhouding.Bank;
import New.New;

/**
 *
 * @author stefa
 */
public class BankRekeningNummer implements New{

    public int BankRekeningNummerId;
    public String RekeningNr;
    public Bank bank;
    public BankRekeningNummer() {
    }

    public BankRekeningNummer(int BankRekeningNummerId, String RekeningNr, Bank bank) {
        this.BankRekeningNummerId = BankRekeningNummerId;
        this.RekeningNr = RekeningNr;
        this.bank = bank;
    }

    public int getBankRekeningNummerId() {
        return BankRekeningNummerId;
    }

    public String getRekeningNr() {
        return RekeningNr;
    }

 

    public void setBankRekeningNummerId(int BankRekeningNummerId) {
        this.BankRekeningNummerId = BankRekeningNummerId;
    }

    public void setRekeningNr(String RekeningNr) {
        this.RekeningNr = RekeningNr;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }



    @Override
    public void setId(int id) {
        this.BankRekeningNummerId = id;
    }

    @Override
    public int getId() {
        return this.BankRekeningNummerId;
    }
    
    
}
