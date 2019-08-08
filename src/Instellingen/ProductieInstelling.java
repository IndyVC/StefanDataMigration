/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instellingen;
import New.New;
import java.sql.Date;

/**
 *
 * @author stefa
 */
public class ProductieInstelling implements New{

    public int ProductieInstellingId;
    public boolean ReceptenVoorzienVanLotnummers;
    public boolean StoppenBijVoorraadproduct;
    public boolean VoorraadBerekenen;
    public boolean AlleLinkenOpzoeken;
    public boolean OnvolledigeProductenAanduiden;
    public Date UurWaaropVolgendeWerkdagBegint;
    public boolean KassabestellingenVanuitProtrac;
    public boolean ProductieVanuitProtrac;
    public boolean BestellingenDagplanningDoorrekenen;
    public boolean ProductieDagplanningDoorrekenen;
    public String ExcelbestandVoorProductie;

    public ProductieInstelling() {
    }

    public ProductieInstelling(int ProductieInstellingId, boolean ReceptenVoorzienVanLotnummers, boolean StoppenBijVoorraadproduct, boolean VoorraadBerekenen, boolean AlleLinkenOpzoeken, boolean OnvolledigeProductenAanduiden, Date UurWaaropVolgendeWerkdagBegint, boolean KassabestellingenVanuitProtrac, boolean ProductieVanuitProtrac, boolean BestellingenDagplanningDoorrekenen, boolean ProductieDagplanningDoorrekenen, String ExcelbestandVoorProductie) {
        this.ProductieInstellingId = ProductieInstellingId;
        this.ReceptenVoorzienVanLotnummers = ReceptenVoorzienVanLotnummers;
        this.StoppenBijVoorraadproduct = StoppenBijVoorraadproduct;
        this.VoorraadBerekenen = VoorraadBerekenen;
        this.AlleLinkenOpzoeken = AlleLinkenOpzoeken;
        this.OnvolledigeProductenAanduiden = OnvolledigeProductenAanduiden;
        this.UurWaaropVolgendeWerkdagBegint = UurWaaropVolgendeWerkdagBegint;
        this.KassabestellingenVanuitProtrac = KassabestellingenVanuitProtrac;
        this.ProductieVanuitProtrac = ProductieVanuitProtrac;
        this.BestellingenDagplanningDoorrekenen = BestellingenDagplanningDoorrekenen;
        this.ProductieDagplanningDoorrekenen = ProductieDagplanningDoorrekenen;
        this.ExcelbestandVoorProductie = ExcelbestandVoorProductie;
    }

    public int getProductieInstellingId() {
        return ProductieInstellingId;
    }

    public void setProductieInstellingId(int ProductieInstellingId) {
        this.ProductieInstellingId = ProductieInstellingId;
    }

    public boolean isReceptenVoorzienVanLotnummers() {
        return ReceptenVoorzienVanLotnummers;
    }

    public void setReceptenVoorzienVanLotnummers(boolean ReceptenVoorzienVanLotnummers) {
        this.ReceptenVoorzienVanLotnummers = ReceptenVoorzienVanLotnummers;
    }

    public boolean isStoppenBijVoorraadproduct() {
        return StoppenBijVoorraadproduct;
    }

    public void setStoppenBijVoorraadproduct(boolean StoppenBijVoorraadproduct) {
        this.StoppenBijVoorraadproduct = StoppenBijVoorraadproduct;
    }

    public boolean isVoorraadBerekenen() {
        return VoorraadBerekenen;
    }

    public void setVoorraadBerekenen(boolean VoorraadBerekenen) {
        this.VoorraadBerekenen = VoorraadBerekenen;
    }

    public boolean isAlleLinkenOpzoeken() {
        return AlleLinkenOpzoeken;
    }

    public void setAlleLinkenOpzoeken(boolean AlleLinkenOpzoeken) {
        this.AlleLinkenOpzoeken = AlleLinkenOpzoeken;
    }

    public boolean isOnvolledigeProductenAanduiden() {
        return OnvolledigeProductenAanduiden;
    }

    public void setOnvolledigeProductenAanduiden(boolean OnvolledigeProductenAanduiden) {
        this.OnvolledigeProductenAanduiden = OnvolledigeProductenAanduiden;
    }

    public Date getUurWaaropVolgendeWerkdagBegint() {
        return UurWaaropVolgendeWerkdagBegint;
    }

    public void setUurWaaropVolgendeWerkdagBegint(Date UurWaaropVolgendeWerkdagBegint) {
        this.UurWaaropVolgendeWerkdagBegint = UurWaaropVolgendeWerkdagBegint;
    }

    public boolean isKassabestellingenVanuitProtrac() {
        return KassabestellingenVanuitProtrac;
    }

    public void setKassabestellingenVanuitProtrac(boolean KassabestellingenVanuitProtrac) {
        this.KassabestellingenVanuitProtrac = KassabestellingenVanuitProtrac;
    }

    public boolean isProductieVanuitProtrac() {
        return ProductieVanuitProtrac;
    }

    public void setProductieVanuitProtrac(boolean ProductieVanuitProtrac) {
        this.ProductieVanuitProtrac = ProductieVanuitProtrac;
    }

    public boolean isBestellingenDagplanningDoorrekenen() {
        return BestellingenDagplanningDoorrekenen;
    }

    public void setBestellingenDagplanningDoorrekenen(boolean BestellingenDagplanningDoorrekenen) {
        this.BestellingenDagplanningDoorrekenen = BestellingenDagplanningDoorrekenen;
    }

    public boolean isProductieDagplanningDoorrekenen() {
        return ProductieDagplanningDoorrekenen;
    }

    public void setProductieDagplanningDoorrekenen(boolean ProductieDagplanningDoorrekenen) {
        this.ProductieDagplanningDoorrekenen = ProductieDagplanningDoorrekenen;
    }

    public String getExcelbestandVoorProductie() {
        return ExcelbestandVoorProductie;
    }

    public void setExcelbestandVoorProductie(String ExcelbestandVoorProductie) {
        this.ExcelbestandVoorProductie = ExcelbestandVoorProductie;
    }

    @Override
    public void setId(int id) {
        this.ProductieInstellingId=id;
    }
     @Override
    public int getId() {
        return this.ProductieInstellingId;
    }
    
    
}
