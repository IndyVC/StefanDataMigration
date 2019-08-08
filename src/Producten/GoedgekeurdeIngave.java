/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;

/**
 *
 * @author stefa
 */
public class GoedgekeurdeIngave implements New{

    public int GoedgekeurdeIngaveId;
    public Omschrijving Omschrijving;
    public boolean BestemdVoorAankoopproduct;

    public GoedgekeurdeIngave() {
    }

    public GoedgekeurdeIngave(int GoedgekeurdeIngaveId, Omschrijving Omschrijving, boolean BestemdVoorAankoopproduct) {
        this.GoedgekeurdeIngaveId = GoedgekeurdeIngaveId;
        this.Omschrijving = Omschrijving;
        this.BestemdVoorAankoopproduct = BestemdVoorAankoopproduct;
    }

    public int getGoedgekeurdeIngaveId() {
        return GoedgekeurdeIngaveId;
    }

    public void setGoedgekeurdeIngaveId(int GoedgekeurdeIngaveId) {
        this.GoedgekeurdeIngaveId = GoedgekeurdeIngaveId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public boolean isBestemdVoorAankoopproduct() {
        return BestemdVoorAankoopproduct;
    }

    public void setBestemdVoorAankoopproduct(boolean BestemdVoorAankoopproduct) {
        this.BestemdVoorAankoopproduct = BestemdVoorAankoopproduct;
    }

    @Override
    public void setId(int id) {
        this.GoedgekeurdeIngaveId=id;
    }
    
     @Override
    public int getId() {
        return this.GoedgekeurdeIngaveId;
    }
}
