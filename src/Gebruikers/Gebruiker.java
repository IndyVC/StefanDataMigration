/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gebruikers;

import New.New;

/**
 *
 * @author stefa
 */
public class Gebruiker implements New {

    public int GebruikerId;
    public String Rol;
    public String Email;
    public String UserName;

    public Gebruiker() {
    }

    public Gebruiker(int GebruikerId, String Rol, String Email, String UserName) {
        this.GebruikerId = GebruikerId;
        this.Rol = Rol;
        this.Email = Email;
        this.UserName = UserName;
    }

  

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public int getGebruikerId() {
        return GebruikerId;
    }

    public void setGebruikerId(int GebruikerId) {
        this.GebruikerId = GebruikerId;
    }

    @Override
    public void setId(int id) {
        this.GebruikerId = id;
    }

    @Override
    public int getId() {
        return this.GebruikerId;
    }

}
