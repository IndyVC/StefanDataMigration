/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bedrijven;

import Adressen.Adres;
import Algemeen.Omschrijving;
import New.New;
import TussenTabellen.BasisProductVestiging;
import TussenTabellen.VestigingAankoopProduct;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Vestiging implements New {

    public int VestigingId;
    public Bedrijf Bedrijf;
    public Omschrijving VestigingsOmschrijvingOmschrijving;
    public Adres Adres;
    public String TelefoonNummer;
    public String Email;
    public BankRekeningNummer BankRekeningNummer;
    public String OndernemingsNummer;
    public String VestigingsNummer;
    public List<VestigingAankoopProduct> VestigingAankoopProduct;
    public List<BasisProductVestiging> BasisProductVestiging;

    public Vestiging() {
        VestigingAankoopProduct = new ArrayList();
        BasisProductVestiging = new ArrayList();
    }

    public Vestiging(int VestgingId, Bedrijf Bedrijf, Omschrijving VestigingsOmschrijving, Adres Adres, String TelefoonNummer, String Email, BankRekeningNummer BankRekeningNummer, String OndernemingsNummer, String VestigingsNummer) {
        this.VestigingId = VestgingId;
        this.Bedrijf = Bedrijf;
        this.VestigingsOmschrijvingOmschrijving = VestigingsOmschrijving;
        this.Adres = Adres;
        this.TelefoonNummer = TelefoonNummer;
        this.Email = Email;
        this.BankRekeningNummer = BankRekeningNummer;
        this.OndernemingsNummer = OndernemingsNummer;
        this.VestigingsNummer = VestigingsNummer;
        this.BasisProductVestiging = new ArrayList();
        this.VestigingAankoopProduct = new ArrayList();
    }

    public int getVestgingId() {
        return VestigingId;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public Omschrijving getVestigingsOmschrijving() {
        return VestigingsOmschrijvingOmschrijving;
    }

    public Adres getAdres() {
        return Adres;
    }

    public String getTelefoonNummer() {
        return TelefoonNummer;
    }

    public String getEmail() {
        return Email;
    }

    public BankRekeningNummer getBankRekeningNummer() {
        return BankRekeningNummer;
    }

    public String getOndernemingsNummer() {
        return OndernemingsNummer;
    }

    public String getVestigingsNummer() {
        return VestigingsNummer;
    }

    public void setVestgingId(int VestgingId) {
        this.VestigingId = VestgingId;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public void setVestigingsOmschrijving(Omschrijving VestigingsOmschrijving) {
        this.VestigingsOmschrijvingOmschrijving = VestigingsOmschrijving;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }

    public void setTelefoonNummer(String TelefoonNummer) {
        this.TelefoonNummer = TelefoonNummer;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBankRekeningNummer(BankRekeningNummer BankRekeningNummer) {
        this.BankRekeningNummer = BankRekeningNummer;
    }

    public void setOndernemingsNummer(String OndernemingsNummer) {
        this.OndernemingsNummer = OndernemingsNummer;
    }

    public void setVestigingsNummer(String VestigingsNummer) {
        this.VestigingsNummer = VestigingsNummer;
    }

    public int getVestigingId() {
        return VestigingId;
    }

    public void setVestigingId(int VestigingId) {
        this.VestigingId = VestigingId;
    }

    public Omschrijving getVestigingsOmschrijvingOmschrijving() {
        return VestigingsOmschrijvingOmschrijving;
    }

    public void setVestigingsOmschrijvingOmschrijving(Omschrijving VestigingsOmschrijvingOmschrijving) {
        this.VestigingsOmschrijvingOmschrijving = VestigingsOmschrijvingOmschrijving;
    }

    public List<VestigingAankoopProduct> getVestigingAankoopProduct() {
        return VestigingAankoopProduct;
    }

    public void setVestigingAankoopProduct(List<VestigingAankoopProduct> VestigingAankoopProduct) {
        this.VestigingAankoopProduct = VestigingAankoopProduct;
    }

    public List<BasisProductVestiging> getBasisProductVestiging() {
        return BasisProductVestiging;
    }

    public void setBasisProductVestiging(List<BasisProductVestiging> BasisProductVestiging) {
        this.BasisProductVestiging = BasisProductVestiging;
    }

    @Override
    public void setId(int id) {
        this.VestigingId = id;
    }

    @Override
    public int getId() {
        return this.VestigingId;
    }

}
