/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Bedrijven.Bedrijf;
import Gebruikers.Werknemer;
import New.New;
import Producten.Optie;
import Producten.OptieGroep;
import Producten.Variant;
import Producten.VariantGroep;
import Producten.VerkoopProduct;
import enums.Eenheid;
import java.math.BigDecimal;

/**
 *
 * @author stefa
 */
public class Verzendbon implements New {
    public int VerzendbonId;
    public Bedrijf Bedrijf;
    public int VerzendbonSamenstellingId;
    public int Volgnummer;
    public Bestelbon Bestelbon;
    public VerkoopProduct VerkoopProduct;
    public double Hoeveelheid;
    public BigDecimal Lotnummer;
    public Werknemer Werknemer;
    public double Verkoopprijs;
    public double Basisprijs;
    public Eenheid Eenheid;
    public int AantalPersonen;
    public VariantGroep VariantGroep;
    public Variant Variant;
    public double BedragVariant;
    public boolean BedragVariantPerEenheid;
    public OptieGroep OptieGroep;
    public Optie Optie;
    public double BedragOptie;
    public boolean BedragOptiePerEenheid;
    public double KortingBedrag;
    public boolean KortingManueel;
    public boolean KortingMagBerekendWorden;
    public double Leveringskost;
    public boolean LeveringskostBerekend;
    public double TotaalBedrag;
    public String Opmerking;

    public Verzendbon() {
    }

    public Verzendbon(Bedrijf Bedrijf, int VerzendbonId, int VerzendbonSamenstellingId, int Volgnummer, Bestelbon Bestelbon, VerkoopProduct VerkoopProduct, double Hoeveelheid, BigDecimal Lotnummer, Werknemer Werknemer, double Verkoopprijs, double Basisprijs, Eenheid Eenheid, int AantalPersonen, VariantGroep VariantGroep, Variant Variant, double BedragVariant, boolean BedragVariantPerEenheid, OptieGroep OptieGroep, Optie Optie, double BedragOptie, boolean BedragOptiePerEenheid, double KortingBedrag, boolean KortingManueel, boolean KortingMagBerekendWorden, double Leveringskost, boolean LeveringskostBerekend, double TotaalBedrag, String Opmerking) {
        this.Bedrijf = Bedrijf;
        this.VerzendbonId = VerzendbonId;
        this.VerzendbonSamenstellingId = VerzendbonSamenstellingId;
        this.Volgnummer = Volgnummer;
        this.Bestelbon = Bestelbon;
        this.VerkoopProduct = VerkoopProduct;
        this.Hoeveelheid = Hoeveelheid;
        this.Lotnummer = Lotnummer;
        this.Werknemer = Werknemer;
        this.Verkoopprijs = Verkoopprijs;
        this.Basisprijs = Basisprijs;
        this.Eenheid = Eenheid;
        this.AantalPersonen = AantalPersonen;
        this.VariantGroep = VariantGroep;
        this.Variant = Variant;
        this.BedragVariant = BedragVariant;
        this.BedragVariantPerEenheid = BedragVariantPerEenheid;
        this.OptieGroep = OptieGroep;
        this.Optie = Optie;
        this.BedragOptie = BedragOptie;
        this.BedragOptiePerEenheid = BedragOptiePerEenheid;
        this.KortingBedrag = KortingBedrag;
        this.KortingManueel = KortingManueel;
        this.KortingMagBerekendWorden = KortingMagBerekendWorden;
        this.Leveringskost = Leveringskost;
        this.LeveringskostBerekend = LeveringskostBerekend;
        this.TotaalBedrag = TotaalBedrag;
        this.Opmerking = Opmerking;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public int getVerzendbonId() {
        return VerzendbonId;
    }

    public void setVerzendbonId(int VerzendbonId) {
        this.VerzendbonId = VerzendbonId;
    }

    public int getVerzendbonSamenstellingId() {
        return VerzendbonSamenstellingId;
    }

    public void setVerzendbonSamenstellingId(int VerzendbonSamenstellingId) {
        this.VerzendbonSamenstellingId = VerzendbonSamenstellingId;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public Bestelbon getBestelbon() {
        return Bestelbon;
    }

    public void setBestelbon(Bestelbon Bestelbon) {
        this.Bestelbon = Bestelbon;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
    }

    public double getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(double Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public BigDecimal getLotnummer() {
        return Lotnummer;
    }

    public void setLotnummer(BigDecimal Lotnummer) {
        this.Lotnummer = Lotnummer;
    }

    public Werknemer getWerknemer() {
        return Werknemer;
    }

    public void setWerknemer(Werknemer Werknemer) {
        this.Werknemer = Werknemer;
    }

    public double getVerkoopprijs() {
        return Verkoopprijs;
    }

    public void setVerkoopprijs(double Verkoopprijs) {
        this.Verkoopprijs = Verkoopprijs;
    }

    public double getBasisprijs() {
        return Basisprijs;
    }

    public void setBasisprijs(double Basisprijs) {
        this.Basisprijs = Basisprijs;
    }

    public Eenheid getEenheid() {
        return Eenheid;
    }

    public void setEenheid(Eenheid Eenheid) {
        this.Eenheid = Eenheid;
    }

    public int getAantalPersonen() {
        return AantalPersonen;
    }

    public void setAantalPersonen(int AantalPersonen) {
        this.AantalPersonen = AantalPersonen;
    }

    public VariantGroep getVariantGroep() {
        return VariantGroep;
    }

    public void setVariantGroep(VariantGroep VariantGroep) {
        this.VariantGroep = VariantGroep;
    }

    public Variant getVariant() {
        return Variant;
    }

    public void setVariant(Variant Variant) {
        this.Variant = Variant;
    }

    public double getBedragVariant() {
        return BedragVariant;
    }

    public void setBedragVariant(double BedragVariant) {
        this.BedragVariant = BedragVariant;
    }

    public boolean isBedragVariantPerEenheid() {
        return BedragVariantPerEenheid;
    }

    public void setBedragVariantPerEenheid(boolean BedragVariantPerEenheid) {
        this.BedragVariantPerEenheid = BedragVariantPerEenheid;
    }

    public OptieGroep getOptieGroep() {
        return OptieGroep;
    }

    public void setOptieGroep(OptieGroep OptieGroep) {
        this.OptieGroep = OptieGroep;
    }

    public Optie getOptie() {
        return Optie;
    }

    public void setOptie(Optie Optie) {
        this.Optie = Optie;
    }

    public double getBedragOptie() {
        return BedragOptie;
    }

    public void setBedragOptie(double BedragOptie) {
        this.BedragOptie = BedragOptie;
    }

    public boolean isBedragOptiePerEenheid() {
        return BedragOptiePerEenheid;
    }

    public void setBedragOptiePerEenheid(boolean BedragOptiePerEenheid) {
        this.BedragOptiePerEenheid = BedragOptiePerEenheid;
    }

    public double getKortingBedrag() {
        return KortingBedrag;
    }

    public void setKortingBedrag(double KortingBedrag) {
        this.KortingBedrag = KortingBedrag;
    }

    public boolean isKortingManueel() {
        return KortingManueel;
    }

    public void setKortingManueel(boolean KortingManueel) {
        this.KortingManueel = KortingManueel;
    }

    public boolean isKortingMagBerekendWorden() {
        return KortingMagBerekendWorden;
    }

    public void setKortingMagBerekendWorden(boolean KortingMagBerekendWorden) {
        this.KortingMagBerekendWorden = KortingMagBerekendWorden;
    }

    public double getLeveringskost() {
        return Leveringskost;
    }

    public void setLeveringskost(double Leveringskost) {
        this.Leveringskost = Leveringskost;
    }

    public boolean isLeveringskostBerekend() {
        return LeveringskostBerekend;
    }

    public void setLeveringskostBerekend(boolean LeveringskostBerekend) {
        this.LeveringskostBerekend = LeveringskostBerekend;
    }

    public double getTotaalBedrag() {
        return TotaalBedrag;
    }

    public void setTotaalBedrag(double TotaalBedrag) {
        this.TotaalBedrag = TotaalBedrag;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    @Override
    public void setId(int id) {
        this.VerzendbonId = id;
    }

    @Override
    public int getId() {
        return this.VerzendbonId;
    }

}
