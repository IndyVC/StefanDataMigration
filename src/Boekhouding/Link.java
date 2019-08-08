/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boekhouding;

import Algemeen.Omschrijving;
import New.New;
import enums.SoortLink;

/**
 *
 * @author stefa
 */
public class Link implements New{
    
    public int LinkId;
    public Omschrijving Omschrijving;
    public SoortLink SoortLink;
    public boolean Tonen;

    public Link() {
    }

    public Link(int LinkId, Omschrijving Omschrijving, SoortLink SoortLink, boolean Tonen) {
        this.LinkId = LinkId;
        this.Omschrijving = Omschrijving;
        this.SoortLink = SoortLink;
        this.Tonen = Tonen;
    }

    public int getLinkId() {
        return LinkId;
    }

    public void setLinkId(int LinkId) {
        this.LinkId = LinkId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public SoortLink getSoortLink() {
        return SoortLink;
    }

    public void setSoortLink(SoortLink SoortLink) {
        this.SoortLink = SoortLink;
    }

    public boolean isTonen() {
        return Tonen;
    }

    public void setTonen(boolean Tonen) {
        this.Tonen = Tonen;
    }

    @Override
    public void setId(int id) {
        this.LinkId=id;
    }
    
     @Override
    public int getId() {
        return this.LinkId;
    }
}
