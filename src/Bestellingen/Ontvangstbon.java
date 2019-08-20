/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Bedrijven.Bedrijf;
import Gebruikers.Gebruiker;
import Leveringen.Leverancier;
import Materialen.Werkstation;
import Producten.AankoopProduct;
import enums.Eenheid;
import enums.MuntEenheid;
import enums.VerpakkingsEenheid;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author stefa
 */
public class Ontvangstbon {

    public Bedrijf Bedrijf;
    public int OntvangstbonId;
    public int OntvangstbonSamenstellingId;
    public int Volgnummer;
    public AankoopProduct AankoopProduct;
    public double Hoeveelheid;
    public double Eenheidsprijd;
    public Date HoudbaarheidsDatum;
    public BigDecimal Lotnummer;
    public Eenheid Aankoopeenheid;
    public VerpakkingsEenheid VerpakkingsEenheid;
    public Eenheid BasisEenheid;
    public MuntEenheid PrijsEenheid;
    public double AantalEenhedenVerpakking;
    public double AantalVerpakkingenColli;
    public double AantalColliPallet;
    public double Totaal;
    public int AantalEtiketten;
    public double LeveringsTemperatuur;
    public double Eenheidsgewicht;
    public boolean IsGefactureerd;
    public String LotnummerExtern;
    public double NettoGewicht;
    public Eenheid GekozenAankoopeenheid;
    public Gebruiker Gebruiker;
    public Date DatumGebruik;
    public double HoeveelheidReden;
    public double HoeveelheidVuilbak;
    public double HoeveelheidGeweigerd;
    public double HoeveelheidTerug;
    public double HoeveelheidInGebruik;
    public boolean Tonen;
    public boolean Gescand;
    public Leverancier Leverancier;
    public Date LeveringDatum;
    public String Referentie;
    public Werkstation Werkstation;
    public Date FactuurDatum;
    public String Factuurnummer;

    public Ontvangstbon() {
    }

    public Ontvangstbon(Bedrijf Bedrijf, int OntvangstbonId, int OntvangstbonSamenstellingId, int Volgnummer, AankoopProduct AankoopProduct, double Hoeveelheid, double Eenheidsprijd, Date HoudbaarheidsDatum, BigDecimal Lotnummer, Eenheid Aankoopeenheid, VerpakkingsEenheid VerpakkingsEenheid, Eenheid BasisEenheid, MuntEenheid PrijsEenheid, double AantalEenhedenVerpakking, double AantalVerpakkingenColli, double AantalColliPallet, double Totaal, int AantalEtiketten, double LeveringsTemperatuur, double Eenheidsgewicht, boolean IsGefactureerd, String LotnummerExtern, double NettoGewicht, Eenheid GekozenAankoopeenheid, Gebruiker Gebruiker, Date DatumGebruik, double HoeveelheidReden, double HoeveelheidVuilbak, double HoeveelheidGeweigerd, double HoeveelheidTerug, double HoeveelheidInGebruik, boolean Tonen, boolean Gescand, Leverancier Leverancier, Date LeveringDatum, String Referentie, Werkstation Werkstation, Date FactuurDatum, String Factuurnummer) {
        this.Bedrijf = Bedrijf;
        this.OntvangstbonId = OntvangstbonId;
        this.OntvangstbonSamenstellingId = OntvangstbonSamenstellingId;
        this.Volgnummer = Volgnummer;
        this.AankoopProduct = AankoopProduct;
        this.Hoeveelheid = Hoeveelheid;
        this.Eenheidsprijd = Eenheidsprijd;
        this.HoudbaarheidsDatum = HoudbaarheidsDatum;
        this.Lotnummer = Lotnummer;
        this.Aankoopeenheid = Aankoopeenheid;
        this.VerpakkingsEenheid = VerpakkingsEenheid;
        this.BasisEenheid = BasisEenheid;
        this.PrijsEenheid = PrijsEenheid;
        this.AantalEenhedenVerpakking = AantalEenhedenVerpakking;
        this.AantalVerpakkingenColli = AantalVerpakkingenColli;
        this.AantalColliPallet = AantalColliPallet;
        this.Totaal = Totaal;
        this.AantalEtiketten = AantalEtiketten;
        this.LeveringsTemperatuur = LeveringsTemperatuur;
        this.Eenheidsgewicht = Eenheidsgewicht;
        this.IsGefactureerd = IsGefactureerd;
        this.LotnummerExtern = LotnummerExtern;
        this.NettoGewicht = NettoGewicht;
        this.GekozenAankoopeenheid = GekozenAankoopeenheid;
        this.Gebruiker = Gebruiker;
        this.DatumGebruik = DatumGebruik;
        this.HoeveelheidReden = HoeveelheidReden;
        this.HoeveelheidVuilbak = HoeveelheidVuilbak;
        this.HoeveelheidGeweigerd = HoeveelheidGeweigerd;
        this.HoeveelheidTerug = HoeveelheidTerug;
        this.HoeveelheidInGebruik = HoeveelheidInGebruik;
        this.Tonen = Tonen;
        this.Gescand = Gescand;
        this.Leverancier = Leverancier;
        this.LeveringDatum = LeveringDatum;
        this.Referentie = Referentie;
        this.Werkstation = Werkstation;
        this.FactuurDatum = FactuurDatum;
        this.Factuurnummer = Factuurnummer;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public int getOntvangstbonId() {
        return OntvangstbonId;
    }

    public void setOntvangstbonId(int OntvangstbonId) {
        this.OntvangstbonId = OntvangstbonId;
    }

    public int getOntvangstbonSamenstellingId() {
        return OntvangstbonSamenstellingId;
    }

    public void setOntvangstbonSamenstellingId(int OntvangstbonSamenstellingId) {
        this.OntvangstbonSamenstellingId = OntvangstbonSamenstellingId;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public AankoopProduct getAankoopProduct() {
        return AankoopProduct;
    }

    public void setAankoopProduct(AankoopProduct AankoopProduct) {
        this.AankoopProduct = AankoopProduct;
    }

    public double getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(double Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public double getEenheidsprijd() {
        return Eenheidsprijd;
    }

    public void setEenheidsprijd(double Eenheidsprijd) {
        this.Eenheidsprijd = Eenheidsprijd;
    }

    public Date getHoudbaarheidsDatum() {
        return HoudbaarheidsDatum;
    }

    public void setHoudbaarheidsDatum(Date HoudbaarheidsDatum) {
        this.HoudbaarheidsDatum = HoudbaarheidsDatum;
    }

    public BigDecimal getLotnummer() {
        return Lotnummer;
    }

    public void setLotnummer(BigDecimal Lotnummer) {
        this.Lotnummer = Lotnummer;
    }

    public Eenheid getAankoopeenheid() {
        return Aankoopeenheid;
    }

    public void setAankoopeenheid(Eenheid Aankoopeenheid) {
        this.Aankoopeenheid = Aankoopeenheid;
    }

    public VerpakkingsEenheid getVerpakkingsEenheid() {
        return VerpakkingsEenheid;
    }

    public void setVerpakkingsEenheid(VerpakkingsEenheid VerpakkingsEenheid) {
        this.VerpakkingsEenheid = VerpakkingsEenheid;
    }

    public Eenheid getBasisEenheid() {
        return BasisEenheid;
    }

    public void setBasisEenheid(Eenheid BasisEenheid) {
        this.BasisEenheid = BasisEenheid;
    }

    public MuntEenheid getPrijsEenheid() {
        return PrijsEenheid;
    }

    public void setPrijsEenheid(MuntEenheid PrijsEenheid) {
        this.PrijsEenheid = PrijsEenheid;
    }

    public double getAantalEenhedenVerpakking() {
        return AantalEenhedenVerpakking;
    }

    public void setAantalEenhedenVerpakking(double AantalEenhedenVerpakking) {
        this.AantalEenhedenVerpakking = AantalEenhedenVerpakking;
    }

    public double getAantalVerpakkingenColli() {
        return AantalVerpakkingenColli;
    }

    public void setAantalVerpakkingenColli(double AantalVerpakkingenColli) {
        this.AantalVerpakkingenColli = AantalVerpakkingenColli;
    }

    public double getAantalColliPallet() {
        return AantalColliPallet;
    }

    public void setAantalColliPallet(double AantalColliPallet) {
        this.AantalColliPallet = AantalColliPallet;
    }

    public double getTotaal() {
        return Totaal;
    }

    public void setTotaal(double Totaal) {
        this.Totaal = Totaal;
    }

    public int getAantalEtiketten() {
        return AantalEtiketten;
    }

    public void setAantalEtiketten(int AantalEtiketten) {
        this.AantalEtiketten = AantalEtiketten;
    }

    public double getLeveringsTemperatuur() {
        return LeveringsTemperatuur;
    }

    public void setLeveringsTemperatuur(double LeveringsTemperatuur) {
        this.LeveringsTemperatuur = LeveringsTemperatuur;
    }

    public double getEenheidsgewicht() {
        return Eenheidsgewicht;
    }

    public void setEenheidsgewicht(double Eenheidsgewicht) {
        this.Eenheidsgewicht = Eenheidsgewicht;
    }

    public boolean isIsGefactureerd() {
        return IsGefactureerd;
    }

    public void setIsGefactureerd(boolean IsGefactureerd) {
        this.IsGefactureerd = IsGefactureerd;
    }

    public String getLotnummerExtern() {
        return LotnummerExtern;
    }

    public void setLotnummerExtern(String LotnummerExtern) {
        this.LotnummerExtern = LotnummerExtern;
    }

    public double getNettoGewicht() {
        return NettoGewicht;
    }

    public void setNettoGewicht(double NettoGewicht) {
        this.NettoGewicht = NettoGewicht;
    }

    public Eenheid getGekozenAankoopeenheid() {
        return GekozenAankoopeenheid;
    }

    public void setGekozenAankoopeenheid(Eenheid GekozenAankoopeenheid) {
        this.GekozenAankoopeenheid = GekozenAankoopeenheid;
    }

    public Gebruiker getGebruiker() {
        return Gebruiker;
    }

    public void setGebruiker(Gebruiker Gebruiker) {
        this.Gebruiker = Gebruiker;
    }

    public Date getDatumGebruik() {
        return DatumGebruik;
    }

    public void setDatumGebruik(Date DatumGebruik) {
        this.DatumGebruik = DatumGebruik;
    }

    public double getHoeveelheidReden() {
        return HoeveelheidReden;
    }

    public void setHoeveelheidReden(double HoeveelheidReden) {
        this.HoeveelheidReden = HoeveelheidReden;
    }

    public double getHoeveelheidVuilbak() {
        return HoeveelheidVuilbak;
    }

    public void setHoeveelheidVuilbak(double HoeveelheidVuilbak) {
        this.HoeveelheidVuilbak = HoeveelheidVuilbak;
    }

    public double getHoeveelheidGeweigerd() {
        return HoeveelheidGeweigerd;
    }

    public void setHoeveelheidGeweigerd(double HoeveelheidGeweigerd) {
        this.HoeveelheidGeweigerd = HoeveelheidGeweigerd;
    }

    public double getHoeveelheidTerug() {
        return HoeveelheidTerug;
    }

    public void setHoeveelheidTerug(double HoeveelheidTerug) {
        this.HoeveelheidTerug = HoeveelheidTerug;
    }

    public double getHoeveelheidInGebruik() {
        return HoeveelheidInGebruik;
    }

    public void setHoeveelheidInGebruik(double HoeveelheidInGebruik) {
        this.HoeveelheidInGebruik = HoeveelheidInGebruik;
    }

    public boolean isTonen() {
        return Tonen;
    }

    public void setTonen(boolean Tonen) {
        this.Tonen = Tonen;
    }

    public boolean isGescand() {
        return Gescand;
    }

    public void setGescand(boolean Gescand) {
        this.Gescand = Gescand;
    }

    public Leverancier getLeverancier() {
        return Leverancier;
    }

    public void setLeverancier(Leverancier Leverancier) {
        this.Leverancier = Leverancier;
    }

    public Date getLeveringDatum() {
        return LeveringDatum;
    }

    public void setLeveringDatum(Date LeveringDatum) {
        this.LeveringDatum = LeveringDatum;
    }

    public String getReferentie() {
        return Referentie;
    }

    public void setReferentie(String Referentie) {
        this.Referentie = Referentie;
    }

    public Werkstation getWerkstation() {
        return Werkstation;
    }

    public void setWerkstation(Werkstation Werkstation) {
        this.Werkstation = Werkstation;
    }

    public Date getFactuurDatum() {
        return FactuurDatum;
    }

    public void setFactuurDatum(Date FactuurDatum) {
        this.FactuurDatum = FactuurDatum;
    }

    public String getFactuurnummer() {
        return Factuurnummer;
    }

    public void setFactuurnummer(String Factuurnummer) {
        this.Factuurnummer = Factuurnummer;
    }
    
    
    
    
}
