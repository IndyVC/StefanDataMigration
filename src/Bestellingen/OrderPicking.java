/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import java.sql.Date;

import Bedrijven.Bedrijf;
import Gebruikers.Gebruiker;
import New.New;
import Producten.Optie;
import Producten.OptieGroep;
import Producten.Variant;
import Producten.VariantGroep;
import Producten.VerkoopProduct;

/**
 *
 * @author stefa
 */
public class OrderPicking implements New {

    public int OrderipickingId;
    public int SamenstellingOrderpickingsId;
    public double Lotnummer;
    public double Hoeveelheid;
    public int Volgnummer;
    public int VolgnummerVerkoopproduct;
    public VerkoopProduct VerkoopProduct;
    public double Verkoopprijs;
    public double Basisprijs;
    public int AantalPersonen;
    public VariantGroep VariantGroep;
    public Variant Variant;
    public OptieGroep OptieGroep;
    public Optie Optie;
    public boolean KortingManueelAangepast;
    public boolean MagKortingBerekendWorden;
    public double TotaalBedrag;
    public String Tekst;
    public double VerwerkteEenheid;
    public double HoeveelheidWinkelbestelling;
    public Bedrijf Bedrijf;
    public Klant Klant;
    public Date DateOrderpicking;
    public Date DateLeveringsbon;
    public Date DateTeLeveren;
    public String RerentieKlant;
    public Date DateBesteld;
    public int MyProperty;
    public String Uur;
    public boolean Betaald;
    public double KortingsPercentage;
    public double BedragBetaald;
    public double BedragBestelling;
    public double BedragKorting;
    public String RedenKorting;
    public boolean Levering;
    public boolean Express;
    public boolean FactuurGewenst;
    public String Referentie;
    public String Opmerking;
    public Gebruiker Gebruiker;
    public Kassabestelling KassaBestelling;

    public OrderPicking() {
    }

    public OrderPicking(int OrderipickingId, int SamenstellingOrderpickingsId, double Lotnummer, double Hoeveelheid, int Volgnummer, int VolgnummerVerkoopproduct, VerkoopProduct VerkoopProduct, double Verkoopprijs, double Basisprijs, int AantalPersonen, VariantGroep VariantGroep, Variant Variant, OptieGroep OptieGroep, Optie Optie, boolean KortingManueelAangepast, boolean MagKortingBerekendWorden, double TotaalBedrag, String Tekst, double VerwerkteEenheid, double HoeveelheidWinkelbestelling, Bedrijf Bedrijf, Klant Klant, Date DateOrderpicking, Date DateLeveringsbon, Date DateTeLeveren, String RerentieKlant, Date DateBesteld, int MyProperty, String Uur, boolean Betaald, double KortingsPercentage, double BedragBetaald, double BedragBestelling, double BedragKorting, String RedenKorting, boolean Levering, boolean Express, boolean FactuurGewenst, String Referentie, String Opmerking, Gebruiker Gebruiker, Kassabestelling KassaBestelling) {
        this.OrderipickingId = OrderipickingId;
        this.SamenstellingOrderpickingsId = SamenstellingOrderpickingsId;
        this.Lotnummer = Lotnummer;
        this.Hoeveelheid = Hoeveelheid;
        this.Volgnummer = Volgnummer;
        this.VolgnummerVerkoopproduct = VolgnummerVerkoopproduct;
        this.VerkoopProduct = VerkoopProduct;
        this.Verkoopprijs = Verkoopprijs;
        this.Basisprijs = Basisprijs;
        this.AantalPersonen = AantalPersonen;
        this.VariantGroep = VariantGroep;
        this.Variant = Variant;
        this.OptieGroep = OptieGroep;
        this.Optie = Optie;
        this.KortingManueelAangepast = KortingManueelAangepast;
        this.MagKortingBerekendWorden = MagKortingBerekendWorden;
        this.TotaalBedrag = TotaalBedrag;
        this.Tekst = Tekst;
        this.VerwerkteEenheid = VerwerkteEenheid;
        this.HoeveelheidWinkelbestelling = HoeveelheidWinkelbestelling;
        this.Bedrijf = Bedrijf;
        this.Klant = Klant;
        this.DateOrderpicking = DateOrderpicking;
        this.DateLeveringsbon = DateLeveringsbon;
        this.DateTeLeveren = DateTeLeveren;
        this.RerentieKlant = RerentieKlant;
        this.DateBesteld = DateBesteld;
        this.MyProperty = MyProperty;
        this.Uur = Uur;
        this.Betaald = Betaald;
        this.KortingsPercentage = KortingsPercentage;
        this.BedragBetaald = BedragBetaald;
        this.BedragBestelling = BedragBestelling;
        this.BedragKorting = BedragKorting;
        this.RedenKorting = RedenKorting;
        this.Levering = Levering;
        this.Express = Express;
        this.FactuurGewenst = FactuurGewenst;
        this.Referentie = Referentie;
        this.Opmerking = Opmerking;
        this.Gebruiker = Gebruiker;
        this.KassaBestelling = KassaBestelling;
    }

    public int getOrderipickingId() {
        return OrderipickingId;
    }

    public void setOrderipickingId(int OrderipickingId) {
        this.OrderipickingId = OrderipickingId;
    }

    public int getSamenstellingOrderpickingsId() {
        return SamenstellingOrderpickingsId;
    }

    public void setSamenstellingOrderpickingsId(int SamenstellingOrderpickingsId) {
        this.SamenstellingOrderpickingsId = SamenstellingOrderpickingsId;
    }

    public double getLotnummer() {
        return Lotnummer;
    }

    public void setLotnummer(double Lotnummer) {
        this.Lotnummer = Lotnummer;
    }

    public double getHoeveelheid() {
        return Hoeveelheid;
    }

    public void setHoeveelheid(double Hoeveelheid) {
        this.Hoeveelheid = Hoeveelheid;
    }

    public int getVolgnummer() {
        return Volgnummer;
    }

    public void setVolgnummer(int Volgnummer) {
        this.Volgnummer = Volgnummer;
    }

    public int getVolgnummerVerkoopproduct() {
        return VolgnummerVerkoopproduct;
    }

    public void setVolgnummerVerkoopproduct(int VolgnummerVerkoopproduct) {
        this.VolgnummerVerkoopproduct = VolgnummerVerkoopproduct;
    }

    public VerkoopProduct getVerkoopProduct() {
        return VerkoopProduct;
    }

    public void setVerkoopProduct(VerkoopProduct VerkoopProduct) {
        this.VerkoopProduct = VerkoopProduct;
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

    public boolean isKortingManueelAangepast() {
        return KortingManueelAangepast;
    }

    public void setKortingManueelAangepast(boolean KortingManueelAangepast) {
        this.KortingManueelAangepast = KortingManueelAangepast;
    }

    public boolean isMagKortingBerekendWorden() {
        return MagKortingBerekendWorden;
    }

    public void setMagKortingBerekendWorden(boolean MagKortingBerekendWorden) {
        this.MagKortingBerekendWorden = MagKortingBerekendWorden;
    }

    public double getTotaalBedrag() {
        return TotaalBedrag;
    }

    public void setTotaalBedrag(double TotaalBedrag) {
        this.TotaalBedrag = TotaalBedrag;
    }

    public String getTekst() {
        return Tekst;
    }

    public void setTekst(String Tekst) {
        this.Tekst = Tekst;
    }

    public double getVerwerkteEenheid() {
        return VerwerkteEenheid;
    }

    public void setVerwerkteEenheid(double VerwerkteEenheid) {
        this.VerwerkteEenheid = VerwerkteEenheid;
    }

    public double getHoeveelheidWinkelbestelling() {
        return HoeveelheidWinkelbestelling;
    }

    public void setHoeveelheidWinkelbestelling(double HoeveelheidWinkelbestelling) {
        this.HoeveelheidWinkelbestelling = HoeveelheidWinkelbestelling;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant Klant) {
        this.Klant = Klant;
    }

    public Date getDateOrderpicking() {
        return DateOrderpicking;
    }

    public void setDateOrderpicking(Date DateOrderpicking) {
        this.DateOrderpicking = DateOrderpicking;
    }

    public Date getDateLeveringsbon() {
        return DateLeveringsbon;
    }

    public void setDateLeveringsbon(Date DateLeveringsbon) {
        this.DateLeveringsbon = DateLeveringsbon;
    }

    public Date getDateTeLeveren() {
        return DateTeLeveren;
    }

    public void setDateTeLeveren(Date DateTeLeveren) {
        this.DateTeLeveren = DateTeLeveren;
    }

    public String getRerentieKlant() {
        return RerentieKlant;
    }

    public void setRerentieKlant(String RerentieKlant) {
        this.RerentieKlant = RerentieKlant;
    }

    public Date getDateBesteld() {
        return DateBesteld;
    }

    public void setDateBesteld(Date DateBesteld) {
        this.DateBesteld = DateBesteld;
    }

    public int getMyProperty() {
        return MyProperty;
    }

    public void setMyProperty(int MyProperty) {
        this.MyProperty = MyProperty;
    }

    public String getUur() {
        return Uur;
    }

    public void setUur(String Uur) {
        this.Uur = Uur;
    }

    public boolean isBetaald() {
        return Betaald;
    }

    public void setBetaald(boolean Betaald) {
        this.Betaald = Betaald;
    }

    public double getKortingsPercentage() {
        return KortingsPercentage;
    }

    public void setKortingsPercentage(double KortingsPercentage) {
        this.KortingsPercentage = KortingsPercentage;
    }

    public double getBedragBetaald() {
        return BedragBetaald;
    }

    public void setBedragBetaald(double BedragBetaald) {
        this.BedragBetaald = BedragBetaald;
    }

    public double getBedragBestelling() {
        return BedragBestelling;
    }

    public void setBedragBestelling(double BedragBestelling) {
        this.BedragBestelling = BedragBestelling;
    }

    public double getBedragKorting() {
        return BedragKorting;
    }

    public void setBedragKorting(double BedragKorting) {
        this.BedragKorting = BedragKorting;
    }

    public String getRedenKorting() {
        return RedenKorting;
    }

    public void setRedenKorting(String RedenKorting) {
        this.RedenKorting = RedenKorting;
    }

    public boolean isLevering() {
        return Levering;
    }

    public void setLevering(boolean Levering) {
        this.Levering = Levering;
    }

    public boolean isExpress() {
        return Express;
    }

    public void setExpress(boolean Express) {
        this.Express = Express;
    }

    public boolean isFactuurGewenst() {
        return FactuurGewenst;
    }

    public void setFactuurGewenst(boolean FactuurGewenst) {
        this.FactuurGewenst = FactuurGewenst;
    }

    public String getReferentie() {
        return Referentie;
    }

    public void setReferentie(String Referentie) {
        this.Referentie = Referentie;
    }

    public String getOpmerking() {
        return Opmerking;
    }

    public void setOpmerking(String Opmerking) {
        this.Opmerking = Opmerking;
    }

    public Gebruiker getGebruiker() {
        return Gebruiker;
    }

    public void setGebruiker(Gebruiker Gebruiker) {
        this.Gebruiker = Gebruiker;
    }

    public Kassabestelling getKassaBestelling() {
        return KassaBestelling;
    }

    public void setKassaBestelling(Kassabestelling KassaBestelling) {
        this.KassaBestelling = KassaBestelling;
    }
    
    

    @Override
    public void setId(int id) {
        this.OrderipickingId = id;
    }

    @Override
    public int getId() {
        return this.OrderipickingId;
    }

}
