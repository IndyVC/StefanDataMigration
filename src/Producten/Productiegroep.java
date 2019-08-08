/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import Boekhouding.AlgemeneRekening;
import New.New;

/**
 *
 * @author stefa
 */
public class Productiegroep implements New{

    public int ProductiegroepId;
    public Omschrijving Omschrijving;
    public AlgemeneRekening AlgemeneRekening;
    public boolean Receptenlijst;
    public boolean OpmerkingenMeenemen;

    public Productiegroep() {
    }

    public Productiegroep(int ProductiegroepId, Omschrijving Omschrijving, AlgemeneRekening AlgemeneRekening, boolean Receptenlijst, boolean OpmerkingenMeenemen) {
        this.ProductiegroepId = ProductiegroepId;
        this.Omschrijving = Omschrijving;
        this.AlgemeneRekening = AlgemeneRekening;
        this.Receptenlijst = Receptenlijst;
        this.OpmerkingenMeenemen = OpmerkingenMeenemen;
    }

    public int getProductiegroepId() {
        return ProductiegroepId;
    }

    public void setProductiegroepId(int ProductiegroepId) {
        this.ProductiegroepId = ProductiegroepId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public AlgemeneRekening getAlgemeneRekening() {
        return AlgemeneRekening;
    }

    public void setAlgemeneRekening(AlgemeneRekening AlgemeneRekening) {
        this.AlgemeneRekening = AlgemeneRekening;
    }

    public boolean isReceptenlijst() {
        return Receptenlijst;
    }

    public void setReceptenlijst(boolean Receptenlijst) {
        this.Receptenlijst = Receptenlijst;
    }

    public boolean isOpmerkingenMeenemen() {
        return OpmerkingenMeenemen;
    }

    public void setOpmerkingenMeenemen(boolean OpmerkingenMeenemen) {
        this.OpmerkingenMeenemen = OpmerkingenMeenemen;
    }

    @Override
    public void setId(int id) {
        this.ProductiegroepId=id;
    }
 @Override
    public int getId() {
        return this.ProductiegroepId;
    }
}
