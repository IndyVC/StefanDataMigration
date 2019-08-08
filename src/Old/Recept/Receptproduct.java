package Old.Recept;

import Old.Old;
import Utils.Util;
import java.sql.Date;

public class Receptproduct implements Old {

    private int id_bedrijf;
    private int id_receptproduct;
    private String omschrijvingn;
    private String omschrijvingf;
    private String zoekomschrijving;
    private int id_recepteenheid;
    private Date inserted;
    private Date updated;
    private int cc;
    private boolean halffabrikaten;
    private boolean voorbereide_producten;
    private boolean afgewerkte_producten;
    private boolean verkoopproducten;
    private int id_bestelgroep;
    private boolean blokkeren;
    private String omschrijvinge;
    private boolean hulpstof;
    private boolean moet_gewogen_worden;
    private double maximaal_meetgewicht;
    private double relatieve_marge;
    private double absolute_marge;
    private boolean geblokkeerd;

    public Receptproduct(String[] data) {
        this.id_bedrijf = Util.Int(data[0]);
        this.id_receptproduct = Util.Int(data[1]);
        this.omschrijvingn = data[2];
        this.omschrijvingf = data[3];
        this.zoekomschrijving = data[4];
        this.id_recepteenheid = Util.Int(data[5]);
        this.inserted = Util.Date(data[6]);
        this.updated = Util.Date(data[7]);
        this.cc = Util.Int(data[8]);
        this.halffabrikaten = Util.Boolean(data[9]);
        this.voorbereide_producten = Util.Boolean(data[10]);
        this.afgewerkte_producten = Util.Boolean(data[11]);
        this.verkoopproducten = Util.Boolean(data[12]);
        this.id_bestelgroep = Util.Int(data[13]);
        this.blokkeren = Util.Boolean(data[14]);
        this.omschrijvinge = data[15];
        this.hulpstof = Util.Boolean(data[16]);
        this.moet_gewogen_worden = Util.Boolean(data[17]);
        this.maximaal_meetgewicht = Util.Double(data[18]);
        this.relatieve_marge = Util.Double(data[19]);
        this.absolute_marge = Util.Double(data[20]);
        this.geblokkeerd = Util.Boolean(data[21]);
    }

    public int getId_bedrijf() {
        return this.id_bedrijf;
    }

    public int getId_receptproduct() {
        return this.id_receptproduct;
    }

    public String getOmschrijvingn() {
        return this.omschrijvingn;
    }

    public String getOmschrijvingf() {
        return this.omschrijvingf;
    }

    public String getZoekomschrijving() {
        return this.zoekomschrijving;
    }

    public int getId_recepteenheid() {
        return this.id_recepteenheid;
    }

    public Date getInserted() {
        return this.inserted;
    }

    public Date getUpdated() {
        return this.updated;
    }

    public int getCc() {
        return this.cc;
    }

    public boolean getHalffabrikaten() {
        return this.halffabrikaten;
    }

    public boolean getVoorbereide_producten() {
        return this.voorbereide_producten;
    }

    public boolean getAfgewerkte_producten() {
        return this.afgewerkte_producten;
    }

    public boolean getVerkoopproducten() {
        return this.verkoopproducten;
    }

    public int getId_bestelgroep() {
        return this.id_bestelgroep;
    }

    public boolean getBlokkeren() {
        return this.blokkeren;
    }

    public String getOmschrijvinge() {
        return this.omschrijvinge;
    }

    public boolean getHulpstof() {
        return this.hulpstof;
    }

    public boolean getMoet_gewogen_worden() {
        return this.moet_gewogen_worden;
    }

    public double getMaximaal_meetgewicht() {
        return this.maximaal_meetgewicht;
    }

    public double getRelatieve_marge() {
        return this.relatieve_marge;
    }

    public double getAbsolute_marge() {
        return this.absolute_marge;
    }

    public boolean getGeblokkeerd() {
        return this.geblokkeerd;
    }

    public void setId_bedrijf(int id_bedrijf) {
        this.id_bedrijf = id_bedrijf;
    }

    public void setId_receptproduct(int id_receptproduct) {
        this.id_receptproduct = id_receptproduct;
    }

    public void setOmschrijvingn(String omschrijvingn) {
        this.omschrijvingn = omschrijvingn;
    }

    public void setOmschrijvingf(String omschrijvingf) {
        this.omschrijvingf = omschrijvingf;
    }

    public void setZoekomschrijving(String zoekomschrijving) {
        this.zoekomschrijving = zoekomschrijving;
    }

    public void setId_recepteenheid(int id_recepteenheid) {
        this.id_recepteenheid = id_recepteenheid;
    }

    public void setInserted(Date inserted) {
        this.inserted = inserted;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHalffabrikaten(boolean halffabrikaten) {
        this.halffabrikaten = halffabrikaten;
    }

    public void setVoorbereide_producten(boolean voorbereide_producten) {
        this.voorbereide_producten = voorbereide_producten;
    }

    public void setAfgewerkte_producten(boolean afgewerkte_producten) {
        this.afgewerkte_producten = afgewerkte_producten;
    }

    public void setVerkoopproducten(boolean verkoopproducten) {
        this.verkoopproducten = verkoopproducten;
    }

    public void setId_bestelgroep(int id_bestelgroep) {
        this.id_bestelgroep = id_bestelgroep;
    }

    public void setBlokkeren(boolean blokkeren) {
        this.blokkeren = blokkeren;
    }

    public void setOmschrijvinge(String omschrijvinge) {
        this.omschrijvinge = omschrijvinge;
    }

    public void setHulpstof(boolean hulpstof) {
        this.hulpstof = hulpstof;
    }

    public void setMoet_gewogen_worden(boolean moet_gewogen_worden) {
        this.moet_gewogen_worden = moet_gewogen_worden;
    }

    public void setMaximaal_meetgewicht(double maximaal_meetgewicht) {
        this.maximaal_meetgewicht = maximaal_meetgewicht;
    }

    public void setRelatieve_marge(double relatieve_marge) {
        this.relatieve_marge = relatieve_marge;
    }

    public void setAbsolute_marge(double absolute_marge) {
        this.absolute_marge = absolute_marge;
    }

    public void setGeblokkeerd(boolean geblokkeerd) {
        this.geblokkeerd = geblokkeerd;
    }
}
