package Old;

import Utils.Util;
import java.sql.Date;

import com.opencsv.bean.CsvBindByName;
import com.univocity.parsers.annotations.Parsed;

public class Werkstation implements Old{

    @CsvBindByName
    private String id_werkstation;
    @CsvBindByName
    private int id_gebruiker;
    @CsvBindByName
    private int id_bedrijf;
    @CsvBindByName
    private String folder_in;
    @CsvBindByName
    private String folder_out;
    @CsvBindByName
    private String folder_reports;
    @CsvBindByName
    private String folder_temp;
    @CsvBindByName
    private String folder_images;
    @CsvBindByName
    private boolean ingelogd;
    @CsvBindByName
    private Date laatstingelogd;
    @CsvBindByName
    private Date laatstuitgelogd;
    @CsvBindByName
    private boolean toetsenbord;
    @CsvBindByName
    private int default_etiketten_verpakking_id_printer;
    @CsvBindByName
    private String default_etiketten_verpakking_etikettenbestand;
    @CsvBindByName
    private String folder_labels;
    @CsvBindByName
    private String default_etiketten_verpakking_etikettenformaat;
    @CsvBindByName
    private String bestand_lotnummers;
    @CsvBindByName
    private String folder_backoffice;
    @CsvBindByName
    private String folder_bestelbonnen;
    @CsvBindByName
    private String folder_export_boekhouding;
    @CsvBindByName
    private String folder_afbeeldingen_aankoopproducten;
    @CsvBindByName
    private String folder_afbeeldingen_eigen_fabrikaten;
    @CsvBindByName
    private String folder_technische_fiches;
    @CsvBindByName
    private String folder_materieel;
    @CsvBindByName
    private String folder_ccp;
    @CsvBindByName
    private boolean batch_scanner;
    @CsvBindByName
    private String naam;
    @CsvBindByName
    private String scanner_gebruikt_op_werkstation;
    @CsvBindByName
    private int id_weegschaal1;
    @CsvBindByName
    private int id_weegschaal2;
    @CsvBindByName
    private int id_weegschaal3;
    @CsvBindByName
    private int id_weegschaal4;
    @CsvBindByName
    private String compoort_weegschaal1;
    @CsvBindByName
    private String compoort_weegschaal2;
    @CsvBindByName
    private String compoort_weegschaal3;
    @CsvBindByName
    private String compoort_weegschaal4;
    @CsvBindByName
    private boolean actief_weegschaal1;
    @CsvBindByName
    private boolean actief_weegschaal2;
    @CsvBindByName
    private boolean actief_weegschaal3;
    @CsvBindByName
    private boolean actief_weegschaal4;
    @CsvBindByName
    private boolean default_moet_gewogen_worden;
    @CsvBindByName
    private double default_relatieve_marge;
    @CsvBindByName
    private double default_absolute_marge;
    @CsvBindByName
    private double default_maximaal_meetgewicht;
    @CsvBindByName
    private String folder_technische_fiches_online;
    @CsvBindByName
    private String folder_bedrijfsdocumenten;
    @CsvBindByName
    private String folder_verzendbonnen;
    @CsvBindByName
    private int default_prijskaartjes_id_printer;

    public Werkstation(String id_werkstation, int id_gebruiker, int id_bedrijf, String folder_in, String folder_out,
            String folder_reports, String folder_temp, String folder_images, boolean ingelogd, Date laatstingelogd,
            Date laatstuitgelogd, boolean toetsenbord, int default_etiketten_verpakking_id_printer,
            String default_etiketten_verpakking_etikettenbestand, String folder_labels,
            String default_etiketten_verpakking_etikettenformaat, String bestand_lotnummers, String folder_backoffice,
            String folder_bestelbonnen, String folder_export_boekhouding, String folder_afbeeldingen_aankoopproducten,
            String folder_afbeeldingen_eigen_fabrikaten, String folder_technische_fiches, String folder_materieel,
            String folder_ccp, boolean batch_scanner, String naam, String scanner_gebruikt_op_werkstation,
            int id_weegschaal1, int id_weegschaal2, int id_weegschaal3, int id_weegschaal4, String compoort_weegschaal1,
            String compoort_weegschaal2, String compoort_weegschaal3, String compoort_weegschaal4,
            boolean actief_weegschaal1, boolean actief_weegschaal2, boolean actief_weegschaal3,
            boolean actief_weegschaal4, boolean default_moet_gewogen_worden, double default_relatieve_marge,
            double default_absolute_marge, double default_maximaal_meetgewicht, String folder_technische_fiches_online,
            String folder_bedrijfsdocumenten, String folder_verzendbonnen, int default_prijskaartjes_id_printer) {
        super();
        this.id_werkstation = id_werkstation;
        this.id_gebruiker = id_gebruiker;
        this.id_bedrijf = id_bedrijf;
        this.folder_in = folder_in;
        this.folder_out = folder_out;
        this.folder_reports = folder_reports;
        this.folder_temp = folder_temp;
        this.folder_images = folder_images;
        this.ingelogd = ingelogd;
        this.laatstingelogd = laatstingelogd;
        this.laatstuitgelogd = laatstuitgelogd;
        this.toetsenbord = toetsenbord;
        this.default_etiketten_verpakking_id_printer = default_etiketten_verpakking_id_printer;
        this.default_etiketten_verpakking_etikettenbestand = default_etiketten_verpakking_etikettenbestand;
        this.folder_labels = folder_labels;
        this.default_etiketten_verpakking_etikettenformaat = default_etiketten_verpakking_etikettenformaat;
        this.bestand_lotnummers = bestand_lotnummers;
        this.folder_backoffice = folder_backoffice;
        this.folder_bestelbonnen = folder_bestelbonnen;
        this.folder_export_boekhouding = folder_export_boekhouding;
        this.folder_afbeeldingen_aankoopproducten = folder_afbeeldingen_aankoopproducten;
        this.folder_afbeeldingen_eigen_fabrikaten = folder_afbeeldingen_eigen_fabrikaten;
        this.folder_technische_fiches = folder_technische_fiches;
        this.folder_materieel = folder_materieel;
        this.folder_ccp = folder_ccp;
        this.batch_scanner = batch_scanner;
        this.naam = naam;
        this.scanner_gebruikt_op_werkstation = scanner_gebruikt_op_werkstation;
        this.id_weegschaal1 = id_weegschaal1;
        this.id_weegschaal2 = id_weegschaal2;
        this.id_weegschaal3 = id_weegschaal3;
        this.id_weegschaal4 = id_weegschaal4;
        this.compoort_weegschaal1 = compoort_weegschaal1;
        this.compoort_weegschaal2 = compoort_weegschaal2;
        this.compoort_weegschaal3 = compoort_weegschaal3;
        this.compoort_weegschaal4 = compoort_weegschaal4;
        this.actief_weegschaal1 = actief_weegschaal1;
        this.actief_weegschaal2 = actief_weegschaal2;
        this.actief_weegschaal3 = actief_weegschaal3;
        this.actief_weegschaal4 = actief_weegschaal4;
        this.default_moet_gewogen_worden = default_moet_gewogen_worden;
        this.default_relatieve_marge = default_relatieve_marge;
        this.default_absolute_marge = default_absolute_marge;
        this.default_maximaal_meetgewicht = default_maximaal_meetgewicht;
        this.folder_technische_fiches_online = folder_technische_fiches_online;
        this.folder_bedrijfsdocumenten = folder_bedrijfsdocumenten;
        this.folder_verzendbonnen = folder_verzendbonnen;
        this.default_prijskaartjes_id_printer = default_prijskaartjes_id_printer;
    }
    
    public Werkstation(String[] data){
        this.id_werkstation = data[0];
        this.id_gebruiker = Util.Int(data[1]);
        this.id_bedrijf = Util.Int(data[2]);
        this.folder_in = data[3];
        this.folder_out = data[4];
        this.folder_reports = data[5];
        this.folder_temp = data[6];
        this.folder_images = data[7];
        this.ingelogd = Util.Boolean(data[8]);
        this.laatstingelogd = Util.Date(data[9]);
        this.laatstuitgelogd =Util.Date(data[10]);
        this.toetsenbord = Util.Boolean(data[11]);
        this.default_etiketten_verpakking_id_printer = Util.Int(data[12]);
        this.default_etiketten_verpakking_etikettenbestand = data[13];
        this.folder_labels = data[14];
        this.default_etiketten_verpakking_etikettenformaat = data[15];
        this.bestand_lotnummers = data[16];
        this.folder_backoffice = data[17];
        this.folder_bestelbonnen = data[18];
        this.folder_export_boekhouding = data[19];
        this.folder_afbeeldingen_aankoopproducten = data[20];
        this.folder_afbeeldingen_eigen_fabrikaten = data[21];
        this.folder_technische_fiches = data[22];
        this.folder_materieel = data[23];
        this.folder_ccp = data[24];
        this.batch_scanner = Util.Boolean(data[25]);
        this.naam = data[26];
        this.scanner_gebruikt_op_werkstation = data[27];
        this.id_weegschaal1 = Util.Int(data[28]);
        this.id_weegschaal2 = Util.Int(data[29]);
        this.id_weegschaal3 = Util.Int(data[30]);
        this.id_weegschaal4 = Util.Int(data[31]);
        this.compoort_weegschaal1 = data[32];
        this.compoort_weegschaal2 = data[33];
        this.compoort_weegschaal3 = data[34];
        this.compoort_weegschaal4 = data[35];
        this.actief_weegschaal1 = Util.Boolean(data[36]);
        this.actief_weegschaal2 = Util.Boolean(data[37]);
        this.actief_weegschaal3 = Util.Boolean(data[38]);
        this.actief_weegschaal4 =Util.Boolean(data[39]);
        this.default_moet_gewogen_worden = Util.Boolean(data[40]);
        this.default_relatieve_marge = Util.Double(data[41]);
        this.default_absolute_marge = Util.Double(data[42]);
        this.default_maximaal_meetgewicht = Util.Double(data[43]);
        this.folder_technische_fiches_online = data[44];
        this.folder_bedrijfsdocumenten = data[45];
        this.folder_verzendbonnen = data[46];
        this.default_prijskaartjes_id_printer = Util.Int(data[47]);
    }

    public String getId_werkstation() {
        return id_werkstation;
    }

    public void setId_werkstation(String id_werkstation) {
        this.id_werkstation = id_werkstation;
    }

    public int getId_gebruiker() {
        return id_gebruiker;
    }

    public void setId_gebruiker(int id_gebruiker) {
        this.id_gebruiker = id_gebruiker;
    }

    public int getId_bedrijf() {
        return id_bedrijf;
    }

    public void setId_bedrijf(int id_bedrijf) {
        this.id_bedrijf = id_bedrijf;
    }

    public String getFolder_in() {
        return folder_in;
    }

    public void setFolder_in(String folder_in) {
        this.folder_in = folder_in;
    }

    public String getFolder_out() {
        return folder_out;
    }

    public void setFolder_out(String folder_out) {
        this.folder_out = folder_out;
    }

    public String getFolder_reports() {
        return folder_reports;
    }

    public void setFolder_reports(String folder_reports) {
        this.folder_reports = folder_reports;
    }

    public String getFolder_temp() {
        return folder_temp;
    }

    public void setFolder_temp(String folder_temp) {
        this.folder_temp = folder_temp;
    }

    public String getFolder_images() {
        return folder_images;
    }

    public void setFolder_images(String folder_images) {
        this.folder_images = folder_images;
    }

    public boolean isIngelogd() {
        return ingelogd;
    }

    public void setIngelogd(boolean ingelogd) {
        this.ingelogd = ingelogd;
    }

    public Date getLaatstingelogd() {
        return laatstingelogd;
    }

    public void setLaatstingelogd(Date laatstingelogd) {
        this.laatstingelogd = laatstingelogd;
    }

    public Date getLaatstuitgelogd() {
        return laatstuitgelogd;
    }

    public void setLaatstuitgelogd(Date laatstuitgelogd) {
        this.laatstuitgelogd = laatstuitgelogd;
    }

    public boolean isToetsenbord() {
        return toetsenbord;
    }

    public void setToetsenbord(boolean toetsenbord) {
        this.toetsenbord = toetsenbord;
    }

    public int getDefault_etiketten_verpakking_id_printer() {
        return default_etiketten_verpakking_id_printer;
    }

    public void setDefault_etiketten_verpakking_id_printer(int default_etiketten_verpakking_id_printer) {
        this.default_etiketten_verpakking_id_printer = default_etiketten_verpakking_id_printer;
    }

    public String getDefault_etiketten_verpakking_etikettenbestand() {
        return default_etiketten_verpakking_etikettenbestand;
    }

    public void setDefault_etiketten_verpakking_etikettenbestand(String default_etiketten_verpakking_etikettenbestand) {
        this.default_etiketten_verpakking_etikettenbestand = default_etiketten_verpakking_etikettenbestand;
    }

    public String getFolder_labels() {
        return folder_labels;
    }

    public void setFolder_labels(String folder_labels) {
        this.folder_labels = folder_labels;
    }

    public String getDefault_etiketten_verpakking_etikettenformaat() {
        return default_etiketten_verpakking_etikettenformaat;
    }

    public void setDefault_etiketten_verpakking_etikettenformaat(String default_etiketten_verpakking_etikettenformaat) {
        this.default_etiketten_verpakking_etikettenformaat = default_etiketten_verpakking_etikettenformaat;
    }

    public String getBestand_lotnummers() {
        return bestand_lotnummers;
    }

    public void setBestand_lotnummers(String bestand_lotnummers) {
        this.bestand_lotnummers = bestand_lotnummers;
    }

    public String getFolder_backoffice() {
        return folder_backoffice;
    }

    public void setFolder_backoffice(String folder_backoffice) {
        this.folder_backoffice = folder_backoffice;
    }

    public String getFolder_bestelbonnen() {
        return folder_bestelbonnen;
    }

    public void setFolder_bestelbonnen(String folder_bestelbonnen) {
        this.folder_bestelbonnen = folder_bestelbonnen;
    }

    public String getFolder_export_boekhouding() {
        return folder_export_boekhouding;
    }

    public void setFolder_export_boekhouding(String folder_export_boekhouding) {
        this.folder_export_boekhouding = folder_export_boekhouding;
    }

    public String getFolder_afbeeldingen_aankoopproducten() {
        return folder_afbeeldingen_aankoopproducten;
    }

    public void setFolder_afbeeldingen_aankoopproducten(String folder_afbeeldingen_aankoopproducten) {
        this.folder_afbeeldingen_aankoopproducten = folder_afbeeldingen_aankoopproducten;
    }

    public String getFolder_afbeeldingen_eigen_fabrikaten() {
        return folder_afbeeldingen_eigen_fabrikaten;
    }

    public void setFolder_afbeeldingen_eigen_fabrikaten(String folder_afbeeldingen_eigen_fabrikaten) {
        this.folder_afbeeldingen_eigen_fabrikaten = folder_afbeeldingen_eigen_fabrikaten;
    }

    public String getFolder_technische_fiches() {
        return folder_technische_fiches;
    }

    public void setFolder_technische_fiches(String folder_technische_fiches) {
        this.folder_technische_fiches = folder_technische_fiches;
    }

    public String getFolder_materieel() {
        return folder_materieel;
    }

    public void setFolder_materieel(String folder_materieel) {
        this.folder_materieel = folder_materieel;
    }

    public String getFolder_ccp() {
        return folder_ccp;
    }

    public void setFolder_ccp(String folder_ccp) {
        this.folder_ccp = folder_ccp;
    }

    public boolean isBatch_scanner() {
        return batch_scanner;
    }

    public void setBatch_scanner(boolean batch_scanner) {
        this.batch_scanner = batch_scanner;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getScanner_gebruikt_op_werkstation() {
        return scanner_gebruikt_op_werkstation;
    }

    public void setScanner_gebruikt_op_werkstation(String scanner_gebruikt_op_werkstation) {
        this.scanner_gebruikt_op_werkstation = scanner_gebruikt_op_werkstation;
    }

    public int getId_weegschaal1() {
        return id_weegschaal1;
    }

    public void setId_weegschaal1(int id_weegschaal1) {
        this.id_weegschaal1 = id_weegschaal1;
    }

    public int getId_weegschaal2() {
        return id_weegschaal2;
    }

    public void setId_weegschaal2(int id_weegschaal2) {
        this.id_weegschaal2 = id_weegschaal2;
    }

    public int getId_weegschaal3() {
        return id_weegschaal3;
    }

    public void setId_weegschaal3(int id_weegschaal3) {
        this.id_weegschaal3 = id_weegschaal3;
    }

    public int getId_weegschaal4() {
        return id_weegschaal4;
    }

    public void setId_weegschaal4(int id_weegschaal4) {
        this.id_weegschaal4 = id_weegschaal4;
    }

    public String getCompoort_weegschaal1() {
        return compoort_weegschaal1;
    }

    public void setCompoort_weegschaal1(String compoort_weegschaal1) {
        this.compoort_weegschaal1 = compoort_weegschaal1;
    }

    public String getCompoort_weegschaal2() {
        return compoort_weegschaal2;
    }

    public void setCompoort_weegschaal2(String compoort_weegschaal2) {
        this.compoort_weegschaal2 = compoort_weegschaal2;
    }

    public String getCompoort_weegschaal3() {
        return compoort_weegschaal3;
    }

    public void setCompoort_weegschaal3(String compoort_weegschaal3) {
        this.compoort_weegschaal3 = compoort_weegschaal3;
    }

    public String getCompoort_weegschaal4() {
        return compoort_weegschaal4;
    }

    public void setCompoort_weegschaal4(String compoort_weegschaal4) {
        this.compoort_weegschaal4 = compoort_weegschaal4;
    }

    public boolean isActief_weegschaal1() {
        return actief_weegschaal1;
    }

    public void setActief_weegschaal1(boolean actief_weegschaal1) {
        this.actief_weegschaal1 = actief_weegschaal1;
    }

    public boolean isActief_weegschaal2() {
        return actief_weegschaal2;
    }

    public void setActief_weegschaal2(boolean actief_weegschaal2) {
        this.actief_weegschaal2 = actief_weegschaal2;
    }

    public boolean isActief_weegschaal3() {
        return actief_weegschaal3;
    }

    public void setActief_weegschaal3(boolean actief_weegschaal3) {
        this.actief_weegschaal3 = actief_weegschaal3;
    }

    public boolean isActief_weegschaal4() {
        return actief_weegschaal4;
    }

    public void setActief_weegschaal4(boolean actief_weegschaal4) {
        this.actief_weegschaal4 = actief_weegschaal4;
    }

    public boolean isDefault_moet_gewogen_worden() {
        return default_moet_gewogen_worden;
    }

    public void setDefault_moet_gewogen_worden(boolean default_moet_gewogen_worden) {
        this.default_moet_gewogen_worden = default_moet_gewogen_worden;
    }

    public double getDefault_relatieve_marge() {
        return default_relatieve_marge;
    }

    public void setDefault_relatieve_marge(double default_relatieve_marge) {
        this.default_relatieve_marge = default_relatieve_marge;
    }

    public double getDefault_absolute_marge() {
        return default_absolute_marge;
    }

    public void setDefault_absolute_marge(double default_absolute_marge) {
        this.default_absolute_marge = default_absolute_marge;
    }

    public double getDefault_maximaal_meetgewicht() {
        return default_maximaal_meetgewicht;
    }

    public void setDefault_maximaal_meetgewicht(double default_maximaal_meetgewicht) {
        this.default_maximaal_meetgewicht = default_maximaal_meetgewicht;
    }

    public String getFolder_technische_fiches_online() {
        return folder_technische_fiches_online;
    }

    public void setFolder_technische_fiches_online(String folder_technische_fiches_online) {
        this.folder_technische_fiches_online = folder_technische_fiches_online;
    }

    public String getFolder_bedrijfsdocumenten() {
        return folder_bedrijfsdocumenten;
    }

    public void setFolder_bedrijfsdocumenten(String folder_bedrijfsdocumenten) {
        this.folder_bedrijfsdocumenten = folder_bedrijfsdocumenten;
    }

    public String getFolder_verzendbonnen() {
        return folder_verzendbonnen;
    }

    public void setFolder_verzendbonnen(String folder_verzendbonnen) {
        this.folder_verzendbonnen = folder_verzendbonnen;
    }

    public int getDefault_prijskaartjes_id_printer() {
        return default_prijskaartjes_id_printer;
    }

    public void setDefault_prijskaartjes_id_printer(int default_prijskaartjes_id_printer) {
        this.default_prijskaartjes_id_printer = default_prijskaartjes_id_printer;
    }

}
