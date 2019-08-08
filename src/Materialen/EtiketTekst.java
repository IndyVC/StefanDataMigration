/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import New.New;

/**
 *
 * @author stefa
 */
public class EtiketTekst implements New {

    public int EtiketTekstId;

    public EtiketTekst() {

    }

    @Override
    public void setId(int id) {
        this.EtiketTekstId = id;
    }
     @Override
    public int getId() {
        return this.EtiketTekstId;
    }
}
