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
public class IPAdres implements New {

    public int IPAdresId;
    public String IP;

    public IPAdres() {
    }

    public IPAdres(int IPAdresId, String IP) {
        this.IPAdresId = IPAdresId;
        this.IP = IP;
    }

    public int getIPAdresId() {
        return IPAdresId;
    }

    public void setIPAdresId(int IPAdresId) {
        this.IPAdresId = IPAdresId;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public void setId(int id) {
        this.IPAdresId = id;
    }
     @Override
    public int getId() {
        return this.IPAdresId;
    }

}
