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
public class Verpakking implements New{

    public int VerpakkingId;
    
    public Verpakking(){
        
    }

    public Verpakking(int VerpakkingId) {
        this.VerpakkingId = VerpakkingId;
    }

    public int getVerpakkingId() {
        return VerpakkingId;
    }

    public void setVerpakkingId(int VerpakkingId) {
        this.VerpakkingId = VerpakkingId;
    }

    @Override
    public void setId(int id) {
        this.VerpakkingId=id;
    }

     @Override
    public int getId() {
        return this.VerpakkingId;
    }
}
