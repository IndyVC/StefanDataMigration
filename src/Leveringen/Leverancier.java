/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leveringen;

import Adressen.Adres;
import Algemeen.Openingstijd;
import Bedrijven.Verlof;
import Boekhouding.AlgemeneRekening;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.Dagboek;
import Boekhouding.Link;
import New.New;
import TussenTabellen.AankoopProductLeverancier;
import enums.BtwCode;
import enums.LeveringsFrequenties;
import enums.MuntEenheid;
import enums.Taal;
import enums.Webshop_API;
import java.util.List;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author stefa
 */
public class Leverancier implements New {

    public int LeverancierId;

    public String Aanspreking;
    public String Naam;
    public Adres Adres;
    public Taal Taal;
    public LeveranciersGroep LeveranciersGroep;
    public boolean Blokkeren;
    public String ContactNaam;
    public String ContactTelefoonnummer;
    public String ContactGsmnummer;
    public String ContactFaxnummer;
    public String ContactEmail;
    public String UrlWebsite;
    public String VertegenwoordigerNaam;
    public String VertegenwoordigerTelefoonnummer;
    public String VertegenwoordigerGsmnummer;
    public String VertegenwoordigerFaxnummer;
    public String VertegenwoordigerEmail;
    public Date DatumAfspraak;
    public String Info;
    public String KlantCode;
    public String BestellingTelefoonnummer;
    public String BestellingFaxNummer;
    public String BestellingEmail;
    public String UrlWebshop;
    public Webshop_API WebshopApi;
    public String TekstBestelbon;
//    public Date Begindatum;
//    public Date Einddatum;
    public LeveringsFrequenties Leveringsfrequentie;
    public MuntEenheid Munteenheid;
    public BetalingsVoorwaarde BetalingsVoorwaarde;
    public double PercentageHandelskorting;
    public double PercentageFinanciëleKorting;
    public double KredietLimiet;
    public boolean PrijzenInclusiefBTW;
    public boolean NulPrijzenBijLevering;
    public String BoekhoudingCode;
    public Dagboek Dagboek;
    public AlgemeneRekening AlgemeneRekening;
    public BtwCode BtwCode;
    public String OndernemingsNummer;
    public String RechtspersonenRegister;
    public String BankNummer;
    public String AlgemeneInfo;
    public List<Link> Linken;
    public List<Verlof> Verloven;
    public List<Openingstijd> Openingstijden;
    public List<LeveringsDag> LeveringsDagen;
    public List<AankoopProductLeverancier> LeverancierAankoopProducten;

    public Leverancier() {
        LeverancierAankoopProducten = new ArrayList();
        LeveringsDagen = new ArrayList();
        Openingstijden = new ArrayList();
    }

    public Leverancier(int LeverancierId, String Aanspreking, String Naam, Adres Adres, Taal Taal, LeveranciersGroep LeveranciersGroep, boolean Blokkeren, String ContactNaam, String ContactTelefoonnummer, String ContactGsmnummer, String ContactFaxnummer, String ContactEmail, String UrlWebsite, String VertegenwoordigerNaam, String VertegenwoordigerTelefoonnummer, String VertegenwoordigerGsmnummer, String VertegenwoordigerFaxnummer, String VertegenwoordigerEmail, Date DatumAfspraak, String Info, String KlantCode, String BestellingTelefoonnummer, String BestellingFaxNummer, String BestellingEmail, String UrlWebshop, Webshop_API WebshopApi, String TekstBestelbon, Date Begindatum, Date Einddatum, LeveringsFrequenties Leveringsfrequentie, MuntEenheid Munteenheid, BetalingsVoorwaarde BetalingsVoorwaarde, double PercentageHandelskorting, double PercentageFinanciëleKorting, double KredietLimiet, boolean PrijzenInclusiefBTW, boolean NulPrijzenBijLevering, String BoekhoudingCode, Dagboek Dagboek, AlgemeneRekening AlgemeneRekening, BtwCode BtwCode, String OndernemingsNummer, String RechtspersonenRegister, String BankNummer, String AlgemeneInfo) {
        this();
        this.LeverancierId = LeverancierId;
        this.Aanspreking = Aanspreking;
        this.Naam = Naam;
        this.Adres = Adres;
        this.Taal = Taal;
        this.LeveranciersGroep = LeveranciersGroep;
        this.Blokkeren = Blokkeren;
        this.ContactNaam = ContactNaam;
        this.ContactTelefoonnummer = ContactTelefoonnummer;
        this.ContactGsmnummer = ContactGsmnummer;
        this.ContactFaxnummer = ContactFaxnummer;
        this.ContactEmail = ContactEmail;
        this.UrlWebsite = UrlWebsite;
        this.VertegenwoordigerNaam = VertegenwoordigerNaam;
        this.VertegenwoordigerTelefoonnummer = VertegenwoordigerTelefoonnummer;
        this.VertegenwoordigerGsmnummer = VertegenwoordigerGsmnummer;
        this.VertegenwoordigerFaxnummer = VertegenwoordigerFaxnummer;
        this.VertegenwoordigerEmail = VertegenwoordigerEmail;
        this.DatumAfspraak = DatumAfspraak;
        this.Info = Info;
        this.KlantCode = KlantCode;
        this.BestellingTelefoonnummer = BestellingTelefoonnummer;
        this.BestellingFaxNummer = BestellingFaxNummer;
        this.BestellingEmail = BestellingEmail;
        this.UrlWebshop = UrlWebshop;
        this.WebshopApi = WebshopApi;
        this.TekstBestelbon = TekstBestelbon;
//        this.Begindatum = Begindatum;
//        this.Einddatum = Einddatum;
        this.Leveringsfrequentie = Leveringsfrequentie;
        this.Munteenheid = Munteenheid;
        this.BetalingsVoorwaarde = BetalingsVoorwaarde;
        this.PercentageHandelskorting = PercentageHandelskorting;
        this.PercentageFinanciëleKorting = PercentageFinanciëleKorting;
        this.KredietLimiet = KredietLimiet;
        this.PrijzenInclusiefBTW = PrijzenInclusiefBTW;
        this.NulPrijzenBijLevering = NulPrijzenBijLevering;
        this.BoekhoudingCode = BoekhoudingCode;
        this.Dagboek = Dagboek;
        this.AlgemeneRekening = AlgemeneRekening;
        this.BtwCode = BtwCode;
        this.OndernemingsNummer = OndernemingsNummer;
        this.RechtspersonenRegister = RechtspersonenRegister;
        this.BankNummer = BankNummer;
        this.AlgemeneInfo = AlgemeneInfo;
    }

    public List<AankoopProductLeverancier> getLeverancierAankoopProducten() {
        return LeverancierAankoopProducten;
    }

    public void setLeverancierAankoopProducten(List<AankoopProductLeverancier> LeverancierAankoopProducten) {
        this.LeverancierAankoopProducten = LeverancierAankoopProducten;
    }

    
    public int getLeverancierId() {
        return LeverancierId;
    }

    public void setLeverancierId(int LeverancierId) {
        this.LeverancierId = LeverancierId;
    }

    public String getAanspreking() {
        return Aanspreking;
    }

    public void setAanspreking(String Aanspreking) {
        this.Aanspreking = Aanspreking;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public Adres getAdres() {
        return Adres;
    }

    public void setAdres(Adres Adres) {
        this.Adres = Adres;
    }

    public Taal getTaal() {
        return Taal;
    }

    public void setTaal(Taal Taal) {
        this.Taal = Taal;
    }

    public LeveranciersGroep getLeveranciersGroep() {
        return LeveranciersGroep;
    }

    public void setLeveranciersGroep(LeveranciersGroep LeveranciersGroep) {
        this.LeveranciersGroep = LeveranciersGroep;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public String getContactNaam() {
        return ContactNaam;
    }

    public void setContactNaam(String ContactNaam) {
        this.ContactNaam = ContactNaam;
    }

    public String getContactTelefoonnummer() {
        return ContactTelefoonnummer;
    }

    public void setContactTelefoonnummer(String ContactTelefoonnummer) {
        this.ContactTelefoonnummer = ContactTelefoonnummer;
    }

    public String getContactGsmnummer() {
        return ContactGsmnummer;
    }

    public void setContactGsmnummer(String ContactGsmnummer) {
        this.ContactGsmnummer = ContactGsmnummer;
    }

    public String getContactFaxnummer() {
        return ContactFaxnummer;
    }

    public void setContactFaxnummer(String ContactFaxnummer) {
        this.ContactFaxnummer = ContactFaxnummer;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    public String getUrlWebsite() {
        return UrlWebsite;
    }

    public void setUrlWebsite(String UrlWebsite) {
        this.UrlWebsite = UrlWebsite;
    }

    public String getVertegenwoordigerNaam() {
        return VertegenwoordigerNaam;
    }

    public void setVertegenwoordigerNaam(String VertegenwoordigerNaam) {
        this.VertegenwoordigerNaam = VertegenwoordigerNaam;
    }

    public String getVertegenwoordigerTelefoonnummer() {
        return VertegenwoordigerTelefoonnummer;
    }

    public void setVertegenwoordigerTelefoonnummer(String VertegenwoordigerTelefoonnummer) {
        this.VertegenwoordigerTelefoonnummer = VertegenwoordigerTelefoonnummer;
    }

    public String getVertegenwoordigerGsmnummer() {
        return VertegenwoordigerGsmnummer;
    }

    public void setVertegenwoordigerGsmnummer(String VertegenwoordigerGsmnummer) {
        this.VertegenwoordigerGsmnummer = VertegenwoordigerGsmnummer;
    }

    public String getVertegenwoordigerFaxnummer() {
        return VertegenwoordigerFaxnummer;
    }

    public void setVertegenwoordigerFaxnummer(String VertegenwoordigerFaxnummer) {
        this.VertegenwoordigerFaxnummer = VertegenwoordigerFaxnummer;
    }

    public String getVertegenwoordigerEmail() {
        return VertegenwoordigerEmail;
    }

    public void setVertegenwoordigerEmail(String VertegenwoordigerEmail) {
        this.VertegenwoordigerEmail = VertegenwoordigerEmail;
    }

    public Date getDatumAfspraak() {
        return DatumAfspraak;
    }

    public void setDatumAfspraak(Date DatumAfspraak) {
        this.DatumAfspraak = DatumAfspraak;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    public String getKlantCode() {
        return KlantCode;
    }

    public void setKlantCode(String KlantCode) {
        this.KlantCode = KlantCode;
    }

    public String getBestellingTelefoonnummer() {
        return BestellingTelefoonnummer;
    }

    public void setBestellingTelefoonnummer(String BestellingTelefoonnummer) {
        this.BestellingTelefoonnummer = BestellingTelefoonnummer;
    }

    public String getBestellingFaxNummer() {
        return BestellingFaxNummer;
    }

    public void setBestellingFaxNummer(String BestellingFaxNummer) {
        this.BestellingFaxNummer = BestellingFaxNummer;
    }

    public String getBestellingEmail() {
        return BestellingEmail;
    }

    public void setBestellingEmail(String BestellingEmail) {
        this.BestellingEmail = BestellingEmail;
    }

    public String getUrlWebshop() {
        return UrlWebshop;
    }

    public void setUrlWebshop(String UrlWebshop) {
        this.UrlWebshop = UrlWebshop;
    }

    public Webshop_API getWebshopApi() {
        return WebshopApi;
    }

    public void setWebshopApi(Webshop_API WebshopApi) {
        this.WebshopApi = WebshopApi;
    }

    public String getTekstBestelbon() {
        return TekstBestelbon;
    }

    public void setTekstBestelbon(String TekstBestelbon) {
        this.TekstBestelbon = TekstBestelbon;
    }

//    public Date getBegindatum() {
//        return Begindatum;
//    }
//
//    public void setBegindatum(Date Begindatum) {
//        this.Begindatum = Begindatum;
//    }
//
//    public Date getEinddatum() {
//        return Einddatum;
//    }
//
//    public void setEinddatum(Date Einddatum) {
//        this.Einddatum = Einddatum;
//    }

    public LeveringsFrequenties getLeveringsfrequentie() {
        return Leveringsfrequentie;
    }

    public void setLeveringsfrequentie(LeveringsFrequenties Leveringsfrequentie) {
        this.Leveringsfrequentie = Leveringsfrequentie;
    }

    public MuntEenheid getMunteenheid() {
        return Munteenheid;
    }

    public void setMunteenheid(MuntEenheid Munteenheid) {
        this.Munteenheid = Munteenheid;
    }

    public BetalingsVoorwaarde getBetalingsVoorwaarde() {
        return BetalingsVoorwaarde;
    }

    public void setBetalingsVoorwaarde(BetalingsVoorwaarde BetalingsVoorwaarde) {
        this.BetalingsVoorwaarde = BetalingsVoorwaarde;
    }

    public double getPercentageHandelskorting() {
        return PercentageHandelskorting;
    }

    public void setPercentageHandelskorting(double PercentageHandelskorting) {
        this.PercentageHandelskorting = PercentageHandelskorting;
    }

    public double getPercentageFinanciëleKorting() {
        return PercentageFinanciëleKorting;
    }

    public void setPercentageFinanciëleKorting(double PercentageFinanciëleKorting) {
        this.PercentageFinanciëleKorting = PercentageFinanciëleKorting;
    }

    public double getKredietLimiet() {
        return KredietLimiet;
    }

    public void setKredietLimiet(double KredietLimiet) {
        this.KredietLimiet = KredietLimiet;
    }

    public boolean isPrijzenInclusiefBTW() {
        return PrijzenInclusiefBTW;
    }

    public void setPrijzenInclusiefBTW(boolean PrijzenInclusiefBTW) {
        this.PrijzenInclusiefBTW = PrijzenInclusiefBTW;
    }

    public boolean isNulPrijzenBijLevering() {
        return NulPrijzenBijLevering;
    }

    public void setNulPrijzenBijLevering(boolean NulPrijzenBijLevering) {
        this.NulPrijzenBijLevering = NulPrijzenBijLevering;
    }

    public String getBoekhoudingCode() {
        return BoekhoudingCode;
    }

    public void setBoekhoudingCode(String BoekhoudingCode) {
        this.BoekhoudingCode = BoekhoudingCode;
    }

    public Dagboek getDagboek() {
        return Dagboek;
    }

    public void setDagboek(Dagboek Dagboek) {
        this.Dagboek = Dagboek;
    }

    public AlgemeneRekening getAlgemeneRekening() {
        return AlgemeneRekening;
    }

    public void setAlgemeneRekening(AlgemeneRekening AlgemeneRekening) {
        this.AlgemeneRekening = AlgemeneRekening;
    }

    public BtwCode getBtwCode() {
        return BtwCode;
    }

    public void setBtwCode(BtwCode BtwCode) {
        this.BtwCode = BtwCode;
    }

    public String getOndernemingsNummer() {
        return OndernemingsNummer;
    }

    public void setOndernemingsNummer(String OndernemingsNummer) {
        this.OndernemingsNummer = OndernemingsNummer;
    }

    public String getRechtspersonenRegister() {
        return RechtspersonenRegister;
    }

    public void setRechtspersonenRegister(String RechtspersonenRegister) {
        this.RechtspersonenRegister = RechtspersonenRegister;
    }

    public String getBankNummer() {
        return BankNummer;
    }

    public void setBankNummer(String BankNummer) {
        this.BankNummer = BankNummer;
    }

    public String getAlgemeneInfo() {
        return AlgemeneInfo;
    }

    public void setAlgemeneInfo(String AlgemeneInfo) {
        this.AlgemeneInfo = AlgemeneInfo;
    }

    public List<Link> getLinken() {
        return Linken;
    }

    public void setLinken(List<Link> Linken) {
        this.Linken = Linken;
    }

    public List<Verlof> getVerloven() {
        return Verloven;
    }

    public void setVerloven(List<Verlof> Verloven) {
        this.Verloven = Verloven;
    }

    public List<Openingstijd> getOpeningstijden() {
        return Openingstijden;
    }

    public void setOpeningstijden(List<Openingstijd> Openingstijden) {
        this.Openingstijden = Openingstijden;
    }

    public List<LeveringsDag> getLeveringsDagen() {
        return LeveringsDagen;
    }

    public void setLeveringsDagen(List<LeveringsDag> LeveringsDagen) {
        this.LeveringsDagen = LeveringsDagen;
    }

    @Override
    public void setId(int id) {
        this.LeverancierId = id;
    }

    @Override
    public int getId() {
        return this.LeverancierId;
    }
}
