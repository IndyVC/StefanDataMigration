/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import New.New;

/**
 *
 * @author stefa
 */
public class ContactPersoon implements New{
    
    public int ContactPersoonId;
    public String Naam;
    public String Afdeling;
    public String TelefoonNr;
    public String Email;
    public String Opmerking;

    public ContactPersoon() {
    }

    public ContactPersoon(int ContactPersoonId, String Naam, String Afdeling, String TelefoonNr, String Email, String Opmerking) {
        this.ContactPersoonId = ContactPersoonId;
        this.Naam = Naam;
        this.Afdeling = Afdeling;
        this.TelefoonNr = TelefoonNr;
        this.Email = Email;
        this.Opmerking = Opmerking;
    }

    public int getContactPersoonId() {
        return ContactPersoonId;
    }

    public void setContactPersoonId(int ContactPersoonId) {
        this.ContactPersoonId = ContactPersoonId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String getAfdeling() {
        return Afdeling;
    }

    public void setAfdeling(String Afdeling) {
        this.Afdeling = Afdeling;
    }

    public String getTelefoonNr() {
        return TelefoonNr;
    }

    public void setTelefoonNr(String TelefoonNr) {
        this.TelefoonNr = TelefoonNr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    @Override
    public void setId(int id) {
        this.ContactPersoonId=id;
    }
    
     @Override
    public int getId() {
        return this.ContactPersoonId;
    }
}
