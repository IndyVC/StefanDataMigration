/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materialen;

import Bedrijven.Bedrijf;
import Gebruikers.Gebruiker;
import java.sql.Date;

import New.New;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Werkstation implements New {

    public int WerkStationId;

    public Gebruiker Gebruiker;

    public Bedrijf Bedrijf;

    public String FolderIn;

    public String FolderOut;

    public String FolderReports;

    public String FolderTemp;

    public String FolderImages;

    public boolean Ingelogd;

    public Date LaatstIngelogd;

    public Date LaatstUitgelogd;

    public boolean UseToetsenbord;

    public Printer DefaultPrinterEtikettenVerpakkingPrinter;

    public String DefaultEtikettenVerpakkingEtikettenbestand;

    public String FolderLabels;

    public String DefaultEtikettenVerpakkingEikettenformaat;

    public String BestandLotnummers;

    public String FolderBackoffice;

    public String FolderBestelbonnen;

    public String FolderExportBoekhouding;

    public String FolderAfbeeldingenAankoopProducten;

    public String FolderAfbeeldingenEigenFabrikaten;

    public String FolderTechnischeFisches;

    public String FolderMaterieel;

    public String FolderCcp;

    public boolean BatchScanner;

    public String Naam;

    public String ScannerWordtGebruiktOpWerkstation;

    public boolean DefaultMoetGewogenWorden;

    public double DefaultMaximaalMeetgewicht;

    public double DefaultRelatieveMarge;

    public double DefaultAbsoluteMarge;

    public String FolderTechnischeeOnline;

    public String FolderBedrijfsdocumenten;

    public String FolderVerzendbonnen;

    public Printer DefaulPrinterVoorPrijskaartjesPrinter;

    public List<Weegschaal> Weegschalen;

    public Werkstation() {
        this.Weegschalen = new ArrayList();
    }

    public Werkstation(int WerkStationId, Gebruiker Gebruiker, Bedrijf Bedrijf, String FolderIn, String FolderOut, String FolderReports, String FolderTemp, String FolderImages, boolean Ingelogd, Date LaatstIngelogd, Date LaatstUitgelogd, boolean UseToetsenbord, Printer DefaultPrinterEtikettenVerpakking, String DefaultEtikettenVerpakkingEtikettenbestand, String FolderLabels, String DefaultEtikettenVerpakkingEikettenformaat, String BestandLotnummers, String FolderBackoffice, String FolderBestelbonnen, String FolderExportBoekhouding, String FolderAfbeeldingenAankoopProducten, String FolderAfbeeldingenEigenFabrikaten, String FolderTechnischeFisches, String FolderMaterieel, String FolderCcp, boolean BatchScanner, String Naam, String ScannerWordtGebruiktOpWerkstation, boolean DefaultMoetGewogenWorden, double DefaultMaximaalMeetgewicht, double DefaultRelatieveMarge, double DefaultAbsoluteMarge, String FolderTechnischeeOnline, String FolderBedrijfsdocumenten, String FolderVerzendbonnen, Printer DefaulPrinterVoorPrijskaartjes, List<Weegschaal> Weegschalen) {
        this.WerkStationId = WerkStationId;
        this.Gebruiker = Gebruiker;
        this.Bedrijf = Bedrijf;
        this.FolderIn = FolderIn;
        this.FolderOut = FolderOut;
        this.FolderReports = FolderReports;
        this.FolderTemp = FolderTemp;
        this.FolderImages = FolderImages;
        this.Ingelogd = Ingelogd;
        this.LaatstIngelogd = LaatstIngelogd;
        this.LaatstUitgelogd = LaatstUitgelogd;
        this.UseToetsenbord = UseToetsenbord;
        this.DefaultPrinterEtikettenVerpakkingPrinter = DefaultPrinterEtikettenVerpakking;
        this.DefaultEtikettenVerpakkingEtikettenbestand = DefaultEtikettenVerpakkingEtikettenbestand;
        this.FolderLabels = FolderLabels;
        this.DefaultEtikettenVerpakkingEikettenformaat = DefaultEtikettenVerpakkingEikettenformaat;
        this.BestandLotnummers = BestandLotnummers;
        this.FolderBackoffice = FolderBackoffice;
        this.FolderBestelbonnen = FolderBestelbonnen;
        this.FolderExportBoekhouding = FolderExportBoekhouding;
        this.FolderAfbeeldingenAankoopProducten = FolderAfbeeldingenAankoopProducten;
        this.FolderAfbeeldingenEigenFabrikaten = FolderAfbeeldingenEigenFabrikaten;
        this.FolderTechnischeFisches = FolderTechnischeFisches;
        this.FolderMaterieel = FolderMaterieel;
        this.FolderCcp = FolderCcp;
        this.BatchScanner = BatchScanner;
        this.Naam = Naam;
        this.ScannerWordtGebruiktOpWerkstation = ScannerWordtGebruiktOpWerkstation;
        this.DefaultMoetGewogenWorden = DefaultMoetGewogenWorden;
        this.DefaultMaximaalMeetgewicht = DefaultMaximaalMeetgewicht;
        this.DefaultRelatieveMarge = DefaultRelatieveMarge;
        this.DefaultAbsoluteMarge = DefaultAbsoluteMarge;
        this.FolderTechnischeeOnline = FolderTechnischeeOnline;
        this.FolderBedrijfsdocumenten = FolderBedrijfsdocumenten;
        this.FolderVerzendbonnen = FolderVerzendbonnen;
        this.DefaulPrinterVoorPrijskaartjesPrinter = DefaulPrinterVoorPrijskaartjes;
        this.Weegschalen = Weegschalen;
    }

    public int getWerkStationId() {
        return WerkStationId;
    }

    public void setWerkStationId(int WerkStationId) {
        this.WerkStationId = WerkStationId;
    }

    public Gebruiker getGebruiker() {
        return Gebruiker;
    }

    public void setGebruiker(Gebruiker Gebruiker) {
        this.Gebruiker = Gebruiker;
    }

    public Bedrijf getBedrijf() {
        return Bedrijf;
    }

    public void setBedrijf(Bedrijf Bedrijf) {
        this.Bedrijf = Bedrijf;
    }

    public String getFolderIn() {
        return FolderIn;
    }

    public void setFolderIn(String FolderIn) {
        this.FolderIn = FolderIn;
    }

    public String getFolderOut() {
        return FolderOut;
    }

    public void setFolderOut(String FolderOut) {
        this.FolderOut = FolderOut;
    }

    public String getFolderReports() {
        return FolderReports;
    }

    public void setFolderReports(String FolderReports) {
        this.FolderReports = FolderReports;
    }

    public String getFolderTemp() {
        return FolderTemp;
    }

    public void setFolderTemp(String FolderTemp) {
        this.FolderTemp = FolderTemp;
    }

    public String getFolderImages() {
        return FolderImages;
    }

    public void setFolderImages(String FolderImages) {
        this.FolderImages = FolderImages;
    }

    public boolean isIngelogd() {
        return Ingelogd;
    }

    public void setIngelogd(boolean Ingelogd) {
        this.Ingelogd = Ingelogd;
    }

    public Date getLaatstIngelogd() {
        return LaatstIngelogd;
    }

    public void setLaatstIngelogd(Date LaatstIngelogd) {
        this.LaatstIngelogd = LaatstIngelogd;
    }

    public Date getLaatstUitgelogd() {
        return LaatstUitgelogd;
    }

    public void setLaatstUitgelogd(Date LaatstUitgelogd) {
        this.LaatstUitgelogd = LaatstUitgelogd;
    }

    public boolean isUseToetsenbord() {
        return UseToetsenbord;
    }

    public void setUseToetsenbord(boolean UseToetsenbord) {
        this.UseToetsenbord = UseToetsenbord;
    }

    public Printer getDefaultPrinterEtikettenVerpakkingPrinter() {
        return DefaultPrinterEtikettenVerpakkingPrinter;
    }

    public void setDefaultPrinterEtikettenVerpakkingPrinter(Printer DefaultPrinterEtikettenVerpakkingPrinter) {
        this.DefaultPrinterEtikettenVerpakkingPrinter = DefaultPrinterEtikettenVerpakkingPrinter;
    }

    public String getDefaultEtikettenVerpakkingEtikettenbestand() {
        return DefaultEtikettenVerpakkingEtikettenbestand;
    }

    public void setDefaultEtikettenVerpakkingEtikettenbestand(String DefaultEtikettenVerpakkingEtikettenbestand) {
        this.DefaultEtikettenVerpakkingEtikettenbestand = DefaultEtikettenVerpakkingEtikettenbestand;
    }

    public String getFolderLabels() {
        return FolderLabels;
    }

    public void setFolderLabels(String FolderLabels) {
        this.FolderLabels = FolderLabels;
    }

    public String getDefaultEtikettenVerpakkingEikettenformaat() {
        return DefaultEtikettenVerpakkingEikettenformaat;
    }

    public void setDefaultEtikettenVerpakkingEikettenformaat(String DefaultEtikettenVerpakkingEikettenformaat) {
        this.DefaultEtikettenVerpakkingEikettenformaat = DefaultEtikettenVerpakkingEikettenformaat;
    }

    public String getBestandLotnummers() {
        return BestandLotnummers;
    }

    public void setBestandLotnummers(String BestandLotnummers) {
        this.BestandLotnummers = BestandLotnummers;
    }

    public String getFolderBackoffice() {
        return FolderBackoffice;
    }

    public void setFolderBackoffice(String FolderBackoffice) {
        this.FolderBackoffice = FolderBackoffice;
    }

    public String getFolderBestelbonnen() {
        return FolderBestelbonnen;
    }

    public void setFolderBestelbonnen(String FolderBestelbonnen) {
        this.FolderBestelbonnen = FolderBestelbonnen;
    }

    public String getFolderExportBoekhouding() {
        return FolderExportBoekhouding;
    }

    public void setFolderExportBoekhouding(String FolderExportBoekhouding) {
        this.FolderExportBoekhouding = FolderExportBoekhouding;
    }

    public String getFolderAfbeeldingenAankoopProducten() {
        return FolderAfbeeldingenAankoopProducten;
    }

    public void setFolderAfbeeldingenAankoopProducten(String FolderAfbeeldingenAankoopProducten) {
        this.FolderAfbeeldingenAankoopProducten = FolderAfbeeldingenAankoopProducten;
    }

    public String getFolderAfbeeldingenEigenFabrikaten() {
        return FolderAfbeeldingenEigenFabrikaten;
    }

    public void setFolderAfbeeldingenEigenFabrikaten(String FolderAfbeeldingenEigenFabrikaten) {
        this.FolderAfbeeldingenEigenFabrikaten = FolderAfbeeldingenEigenFabrikaten;
    }

    public String getFolderTechnischeFisches() {
        return FolderTechnischeFisches;
    }

    public void setFolderTechnischeFisches(String FolderTechnischeFisches) {
        this.FolderTechnischeFisches = FolderTechnischeFisches;
    }

    public String getFolderMaterieel() {
        return FolderMaterieel;
    }

    public void setFolderMaterieel(String FolderMaterieel) {
        this.FolderMaterieel = FolderMaterieel;
    }

    public String getFolderCcp() {
        return FolderCcp;
    }

    public void setFolderCcp(String FolderCcp) {
        this.FolderCcp = FolderCcp;
    }

    public boolean getBatchScanner() {
        return BatchScanner;
    }

    public void setBatchScanner(boolean BatchScanner) {
        this.BatchScanner = BatchScanner;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String isScannerWordtGebruiktOpWerkstation() {
        return ScannerWordtGebruiktOpWerkstation;
    }

    public void setScannerWordtGebruiktOpWerkstation(String ScannerWordtGebruiktOpWerkstation) {
        this.ScannerWordtGebruiktOpWerkstation = ScannerWordtGebruiktOpWerkstation;
    }

    public boolean isDefaultMoetGewogenWorden() {
        return DefaultMoetGewogenWorden;
    }

    public void setDefaultMoetGewogenWorden(boolean DefaultMoetGewogenWorden) {
        this.DefaultMoetGewogenWorden = DefaultMoetGewogenWorden;
    }

    public double getDefaultMaximaalMeetgewicht() {
        return DefaultMaximaalMeetgewicht;
    }

    public void setDefaultMaximaalMeetgewicht(double DefaultMaximaalMeetgewicht) {
        this.DefaultMaximaalMeetgewicht = DefaultMaximaalMeetgewicht;
    }

    public double getDefaultRelatieveMarge() {
        return DefaultRelatieveMarge;
    }

    public void setDefaultRelatieveMarge(double DefaultRelatieveMarge) {
        this.DefaultRelatieveMarge = DefaultRelatieveMarge;
    }

    public double getDefaultAbsoluteMarge() {
        return DefaultAbsoluteMarge;
    }

    public void setDefaultAbsoluteMarge(double DefaultAbsoluteMarge) {
        this.DefaultAbsoluteMarge = DefaultAbsoluteMarge;
    }

    public String getFolderTechnischeeOnline() {
        return FolderTechnischeeOnline;
    }

    public void setFolderTechnischeeOnline(String FolderTechnischeeOnline) {
        this.FolderTechnischeeOnline = FolderTechnischeeOnline;
    }

    public String getFolderBedrijfsdocumenten() {
        return FolderBedrijfsdocumenten;
    }

    public void setFolderBedrijfsdocumenten(String FolderBedrijfsdocumenten) {
        this.FolderBedrijfsdocumenten = FolderBedrijfsdocumenten;
    }

    public String getFolderVerzendbonnen() {
        return FolderVerzendbonnen;
    }

    public void setFolderVerzendbonnen(String FolderVerzendbonnen) {
        this.FolderVerzendbonnen = FolderVerzendbonnen;
    }

    public Printer getDefaulPrinterVoorPrijskaartjesPrinter() {
        return DefaulPrinterVoorPrijskaartjesPrinter;
    }

    public void setDefaulPrinterVoorPrijskaartjesPrinter(Printer DefaulPrinterVoorPrijskaartjesPrinter) {
        this.DefaulPrinterVoorPrijskaartjesPrinter = DefaulPrinterVoorPrijskaartjesPrinter;
    }

    public List<Weegschaal> getWeegschalen() {
        return Weegschalen;
    }

    public void setWeegschalen(List<Weegschaal> Weegschalen) {
        this.Weegschalen = Weegschalen;
    }
    
    
    @Override
    public void setId(int id) {
        this.WerkStationId=id;
    }

    @Override
    public int getId() {
        return this.WerkStationId;
    }

}
