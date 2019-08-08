/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestellingen;

import Adressen.Adres;
import Algemeen.BereikbaarheidOpDag;
import Algemeen.Openingstijd;
import Bedrijven.BankRekeningNummer;
import Bedrijven.Verlof;
import Boekhouding.BetalingsVoorwaarde;
import Boekhouding.BoekhoudRekening;
import Boekhouding.FacturatiePeriode;
import Boekhouding.Korting;
import Leveringen.LeveringsToer;
import New.New;
import Old.Dagboek;
import TussenTabellen.KlantAdres;
import TussenTabellen.KlantBereikbaarheidOpDag;
import TussenTabellen.KlantKorting;
import TussenTabellen.KlantOpeningstijd;
import TussenTabellen.KlantVerlof;
import enums.InhoudLeveringsbonnen;
import enums.MuntEenheid;
import enums.Solvabiliteit;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author stefa
 */
public class Klant implements New{

    public int KlantId;
    public String Naam;
    public String Roepnaam;
    public String NaamVerantwoordelijke;
    public boolean SeizoensKlant;
    public String BeginSeizoensPeriode;
    public String EindeSeizoensPeriode;
    public String TitelverdeellijstenRaster;
    public String TelefoonNr1;
    public String TelefoonNr2;
    public String GsmNr;
    public String Email;
    public String Website;
    public BoekhoudRekening BoekhoudRekening;
    public String WebShop;
    public String OndernemingsNr;
    public MuntEenheid MuntEenheid;
    public boolean Domiciliëring;
    public boolean BedragInTekst;
    public Solvabiliteit Solvabiliteit;
    public boolean PrijzenGroeperenOpFactuur;
    public boolean NettoPrijzenOpFactuur;
    public boolean PrijzenExclusiefBtwOpFactuur;
    public boolean KlantGeblokkeerd;
    public Dagboek Dagboek;
    public boolean FactuurElektronischVerzenden;
    public String BewaarMapElektronischeFacturenEnCreditNotas;
    public FacturatiePeriode FacturatiePeiode;
    public BetalingsVoorwaarde BetalingsVoorwaarde;
    public InhoudLeveringsbonnen InhoudLeveringsbonnen;
    public boolean GratisAantallenOpLeveringsbonnen;
    public boolean KortingsPercentagesOpLeveringsbonnen;
    public boolean NettoTeBetalenOpLeveringsbonnen;
    public boolean VerkoopprijzenExlusiefBtwOpLeveringsbonnen;
    public int AantalExemplarenLeveringsbonnen;
    public int AantalExemplarenFacturen;
    public boolean OpvolgenLeeggoed;
    public boolean AfdrukkenEtikettenVerpakkingen;
    public boolean AfdrukkenKlantOpVerdeellijst;
    public boolean KlantAfdrukkenOpverdeelEtiketten;
    public String TitelVerdeellijst;
    public KlantVerdeelGroep Verdeelgroep;
    public List<ContactPersoon> ContactPersonen;
    public List<BankRekeningNummer> BankRekeningNummers;
    public List<LeveringsToer> LeveringsToeren;
    public List<String> EmailAdressenOntvangersFacturen;
    public String EmailAdressenOntvangersFacturenAsString;
    public List<String> Opmerkingen;
    public String OpmerkingenAsString;
    public List<KlantOpeningstijd> KlantOpeningstijden;
    public List<Openingstijd> OpeningsTijden;
    public List<KlantVerlof> KlantVerlof;
    public List<Verlof> Verlofs;
    public List<KlantKorting> KlantKortingen;
    public List<Korting> Kortingen;
    public List<KlantBereikbaarheidOpDag> KlantBereikbaarOpDagen;
    public List<BereikbaarheidOpDag> BereikbaarOpDagen;
    public List<KlantAdres> KlantAdressen;
    public List<Adres> Adressen;

    public Klant() {
    }

    public Klant(String naam, String roepnaam, String naamVerantwoordelijke, boolean seizoensKlant, String beginSeizoensPeriode, String eindeSeizoensPeriode, String titelverdeellijstenRaster, String telefoonNr1, String gsmNr, String email, String website, BoekhoudRekening boekhoudRekening, String webshopId, String ondernemingsNr, MuntEenheid muntEenheid, boolean domiciliëring, boolean bedragInTekst, Solvabiliteit solvabiliteit, boolean prijzenGroeperenOpFactuur, boolean nettoPrijzenOpFactuur, boolean prijzenExlusiefBtwOpFactuur, boolean klantGeblokkeerd, Dagboek dagboek, boolean factuurElektronischVerzenden, String bewaarMapElektronischeFacturenEnCreditNotas, FacturatiePeriode facturatiePeriode, BetalingsVoorwaarde betalingsVoorwaarde, InhoudLeveringsbonnen inhoudLeveringsbonnen, boolean gratisAantallenOpLeveringsbonnen, boolean kortingsPercentagesOpLeveringsbonnen, boolean nettoTeBetalenOpLeveringsbonnen, boolean verkoopprijzenExlusiefBtwOpLeveringsbonnen, int aantalExemplarenLeveringsbonnen, int aantalExemplarenFacturen, boolean opvolgenLeeggoed, boolean afdrukkenEtikettenVerpakkingen, boolean afdrukkenKlantOpVerdeellijst, boolean klantAfdrukkenOpverdeelEtiketten, String titelVerdeellijst, KlantVerdeelGroep verdeelGroep, String telefoonNr2) {
        Naam = naam;
        Roepnaam = roepnaam;
        NaamVerantwoordelijke = naamVerantwoordelijke;
        SeizoensKlant = seizoensKlant;
        BeginSeizoensPeriode = beginSeizoensPeriode;
        EindeSeizoensPeriode = eindeSeizoensPeriode;
        TitelverdeellijstenRaster = titelverdeellijstenRaster;
        TelefoonNr1 = telefoonNr1;
        TelefoonNr2 = telefoonNr2;
        GsmNr = gsmNr;
        Email = email;
        Website = website;
        BoekhoudRekening = boekhoudRekening;
        WebShop = webshopId;
        OndernemingsNr = ondernemingsNr;
        MuntEenheid = muntEenheid;
        Domiciliëring = domiciliëring;
        BedragInTekst = bedragInTekst;
        Solvabiliteit = solvabiliteit;
        PrijzenGroeperenOpFactuur = prijzenGroeperenOpFactuur;
        NettoPrijzenOpFactuur = nettoPrijzenOpFactuur;
        PrijzenExclusiefBtwOpFactuur = prijzenExlusiefBtwOpFactuur;
        KlantGeblokkeerd = klantGeblokkeerd;
        Dagboek = dagboek;
        FactuurElektronischVerzenden = factuurElektronischVerzenden;
        BewaarMapElektronischeFacturenEnCreditNotas = bewaarMapElektronischeFacturenEnCreditNotas;
        FacturatiePeiode = facturatiePeriode;
        BetalingsVoorwaarde = betalingsVoorwaarde;
        InhoudLeveringsbonnen = inhoudLeveringsbonnen;
        GratisAantallenOpLeveringsbonnen = gratisAantallenOpLeveringsbonnen;
        KortingsPercentagesOpLeveringsbonnen = kortingsPercentagesOpLeveringsbonnen;
        NettoTeBetalenOpLeveringsbonnen = nettoTeBetalenOpLeveringsbonnen;
        VerkoopprijzenExlusiefBtwOpLeveringsbonnen = verkoopprijzenExlusiefBtwOpLeveringsbonnen;
        AantalExemplarenLeveringsbonnen = aantalExemplarenLeveringsbonnen;
        AantalExemplarenFacturen = aantalExemplarenFacturen;
        OpvolgenLeeggoed = opvolgenLeeggoed;
        AfdrukkenEtikettenVerpakkingen = afdrukkenEtikettenVerpakkingen;
        AfdrukkenKlantOpVerdeellijst = afdrukkenKlantOpVerdeellijst;
        KlantAfdrukkenOpverdeelEtiketten = klantAfdrukkenOpverdeelEtiketten;
        TitelVerdeellijst = titelVerdeellijst;
        Verdeelgroep = verdeelGroep;
        EmailAdressenOntvangersFacturenAsString = EmailAdressenOntvangersFacturen.stream().collect(Collectors.joining(","));
        OpmerkingenAsString = Opmerkingen.stream().collect(Collectors.joining(","));
        OpeningsTijden = KlantOpeningstijden.stream().map(e -> e.Openingstijd).collect(Collectors.toList());
        Verlofs = KlantVerlof.stream().map(e -> e.Verlof).collect(Collectors.toList());
        Kortingen = KlantKortingen.stream().map(e -> e.Korting).collect(Collectors.toList());
        BereikbaarOpDagen = KlantBereikbaarOpDagen.stream().map(e->e.BereikbaarheidOpDag).collect(Collectors.toList());
        Adressen = KlantAdressen.stream().map(e->e.Adres).collect(Collectors.toList());
    }

    public int getKlantId() {
        return KlantId;
    }

    public void setKlantId(int KlantId) {
        this.KlantId = KlantId;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    public String getRoepnaam() {
        return Roepnaam;
    }

    public void setRoepnaam(String Roepnaam) {
        this.Roepnaam = Roepnaam;
    }

    public String getNaamVerantwoordelijke() {
        return NaamVerantwoordelijke;
    }

    public void setNaamVerantwoordelijke(String NaamVerantwoordelijke) {
        this.NaamVerantwoordelijke = NaamVerantwoordelijke;
    }

    public boolean isSeizoensKlant() {
        return SeizoensKlant;
    }

    public void setSeizoensKlant(boolean SeizoensKlant) {
        this.SeizoensKlant = SeizoensKlant;
    }

    public String getBeginSeizoensPeriode() {
        return BeginSeizoensPeriode;
    }

    public void setBeginSeizoensPeriode(String BeginSeizoensPeriode) {
        this.BeginSeizoensPeriode = BeginSeizoensPeriode;
    }

    public String getEindeSiezoensPeriode() {
        return EindeSeizoensPeriode;
    }

    public void setEindeSiezoensPeriode(String EindeSiezoensPeriode) {
        this.EindeSeizoensPeriode = EindeSiezoensPeriode;
    }

    public String getTitelverdeellijstenRaster() {
        return TitelverdeellijstenRaster;
    }

    public void setTitelverdeellijstenRaster(String TitelverdeellijstenRaster) {
        this.TitelverdeellijstenRaster = TitelverdeellijstenRaster;
    }

    public String getTelefoonNr1() {
        return TelefoonNr1;
    }

    public void setTelefoonNr1(String TelefoonNr1) {
        this.TelefoonNr1 = TelefoonNr1;
    }

    public String getTelefoonNr2() {
        return TelefoonNr2;
    }

    public void setTelefoonNr2(String TelefoonNr2) {
        this.TelefoonNr2 = TelefoonNr2;
    }

    public String getGsmNr() {
        return GsmNr;
    }

    public void setGsmNr(String GsmNr) {
        this.GsmNr = GsmNr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public BoekhoudRekening getBoekhoudRekening() {
        return BoekhoudRekening;
    }

    public void setBoekhoudRekening(BoekhoudRekening BoekhoudRekening) {
        this.BoekhoudRekening = BoekhoudRekening;
    }

    public String getWebShop() {
        return WebShop;
    }

    public void setWebShop(String WebShop) {
        this.WebShop = WebShop;
    }

    public String getOndernemingsNr() {
        return OndernemingsNr;
    }

    public void setOndernemingsNr(String OndernemingsNr) {
        this.OndernemingsNr = OndernemingsNr;
    }

    public MuntEenheid getMuntEenheid() {
        return MuntEenheid;
    }

    public void setMuntEenheid(MuntEenheid MuntEenheid) {
        this.MuntEenheid = MuntEenheid;
    }

    public boolean isDomiciliëring() {
        return Domiciliëring;
    }

    public void setDomiciliëring(boolean Domiciliëring) {
        this.Domiciliëring = Domiciliëring;
    }

    public boolean isBedragInTekst() {
        return BedragInTekst;
    }

    public void setBedragInTekst(boolean BedragInTekst) {
        this.BedragInTekst = BedragInTekst;
    }

    public Solvabiliteit getSolvabiliteit() {
        return Solvabiliteit;
    }

    public void setSolvabiliteit(Solvabiliteit Solvabiliteit) {
        this.Solvabiliteit = Solvabiliteit;
    }

    public boolean isPrijzenGroeperenOpFactuur() {
        return PrijzenGroeperenOpFactuur;
    }

    public void setPrijzenGroeperenOpFactuur(boolean PrijzenGroeperenOpFactuur) {
        this.PrijzenGroeperenOpFactuur = PrijzenGroeperenOpFactuur;
    }

    public boolean isNettoPrijzenOpFactuur() {
        return NettoPrijzenOpFactuur;
    }

    public void setNettoPrijzenOpFactuur(boolean NettoPrijzenOpFactuur) {
        this.NettoPrijzenOpFactuur = NettoPrijzenOpFactuur;
    }

    public boolean isPrijzenExclusiefBtwOpFactuur() {
        return PrijzenExclusiefBtwOpFactuur;
    }

    public void setPrijzenExclusiefBtwOpFactuur(boolean PrijzenExclusiefBtwOpFactuur) {
        this.PrijzenExclusiefBtwOpFactuur = PrijzenExclusiefBtwOpFactuur;
    }

    public boolean isKlantGeblokkeerd() {
        return KlantGeblokkeerd;
    }

    public void setKlantGeblokkeerd(boolean KlantGeblokkeerd) {
        this.KlantGeblokkeerd = KlantGeblokkeerd;
    }

    public Dagboek getDagboek() {
        return Dagboek;
    }

    public void setDagboek(Dagboek Dagboek) {
        this.Dagboek = Dagboek;
    }

    public boolean isFactuurElektronischVerzenden() {
        return FactuurElektronischVerzenden;
    }

    public void setFactuurElektronischVerzenden(boolean FactuurElektronischVerzenden) {
        this.FactuurElektronischVerzenden = FactuurElektronischVerzenden;
    }

    public String getBewaarMapElektronischeFacturenEnCreditNotas() {
        return BewaarMapElektronischeFacturenEnCreditNotas;
    }

    public void setBewaarMapElektronischeFacturenEnCreditNotas(String BewaarMapElektronischeFacturenEnCreditNotas) {
        this.BewaarMapElektronischeFacturenEnCreditNotas = BewaarMapElektronischeFacturenEnCreditNotas;
    }

    public FacturatiePeriode getFacturatiePeiode() {
        return FacturatiePeiode;
    }

    public void setFacturatiePeiode(FacturatiePeriode FacturatiePeiode) {
        this.FacturatiePeiode = FacturatiePeiode;
    }

    public BetalingsVoorwaarde getBetalingsVoorwaarde() {
        return BetalingsVoorwaarde;
    }

    public void setBetalingsVoorwaarde(BetalingsVoorwaarde BetalingsVoorwaarde) {
        this.BetalingsVoorwaarde = BetalingsVoorwaarde;
    }

    public InhoudLeveringsbonnen getInhoudLeveringsbonnen() {
        return InhoudLeveringsbonnen;
    }

    public void setInhoudLeveringsbonnen(InhoudLeveringsbonnen InhoudLeveringsbonnen) {
        this.InhoudLeveringsbonnen = InhoudLeveringsbonnen;
    }

    public boolean isGratisAantallenOpLeveringsbonnen() {
        return GratisAantallenOpLeveringsbonnen;
    }

    public void setGratisAantallenOpLeveringsbonnen(boolean GratisAantallenOpLeveringsbonnen) {
        this.GratisAantallenOpLeveringsbonnen = GratisAantallenOpLeveringsbonnen;
    }

    public boolean isKortingsPercentagesOpLeveringsbonnen() {
        return KortingsPercentagesOpLeveringsbonnen;
    }

    public void setKortingsPercentagesOpLeveringsbonnen(boolean KortingsPercentagesOpLeveringsbonnen) {
        this.KortingsPercentagesOpLeveringsbonnen = KortingsPercentagesOpLeveringsbonnen;
    }

    public boolean isNettoTeBetalenOpLeveringsbonnen() {
        return NettoTeBetalenOpLeveringsbonnen;
    }

    public void setNettoTeBetalenOpLeveringsbonnen(boolean NettoTeBetalenOpLeveringsbonnen) {
        this.NettoTeBetalenOpLeveringsbonnen = NettoTeBetalenOpLeveringsbonnen;
    }

    public boolean isVerkoopprijzenExlusiefBtwOpLeveringsbonnen() {
        return VerkoopprijzenExlusiefBtwOpLeveringsbonnen;
    }

    public void setVerkoopprijzenExlusiefBtwOpLeveringsbonnen(boolean VerkoopprijzenExlusiefBtwOpLeveringsbonnen) {
        this.VerkoopprijzenExlusiefBtwOpLeveringsbonnen = VerkoopprijzenExlusiefBtwOpLeveringsbonnen;
    }

    public int getAantalExemplarenLeveringsbonnen() {
        return AantalExemplarenLeveringsbonnen;
    }

    public void setAantalExemplarenLeveringsbonnen(int AantalExemplarenLeveringsbonnen) {
        this.AantalExemplarenLeveringsbonnen = AantalExemplarenLeveringsbonnen;
    }

    public int getAantalExemplarenFacturen() {
        return AantalExemplarenFacturen;
    }

    public void setAantalExemplarenFacturen(int AantalExemplarenFacturen) {
        this.AantalExemplarenFacturen = AantalExemplarenFacturen;
    }

    public boolean isOpvolgenLeeggoed() {
        return OpvolgenLeeggoed;
    }

    public void setOpvolgenLeeggoed(boolean OpvolgenLeeggoed) {
        this.OpvolgenLeeggoed = OpvolgenLeeggoed;
    }

    public boolean isAfdrukkenEtikettenVerpakkingen() {
        return AfdrukkenEtikettenVerpakkingen;
    }

    public void setAfdrukkenEtikettenVerpakkingen(boolean AfdrukkenEtikettenVerpakkingen) {
        this.AfdrukkenEtikettenVerpakkingen = AfdrukkenEtikettenVerpakkingen;
    }

    public boolean isAfdrukkenKlantOpVerdeellijst() {
        return AfdrukkenKlantOpVerdeellijst;
    }

    public void setAfdrukkenKlantOpVerdeellijst(boolean AfdrukkenKlantOpVerdeellijst) {
        this.AfdrukkenKlantOpVerdeellijst = AfdrukkenKlantOpVerdeellijst;
    }

    public boolean isKlantAfdrukkenOpverdeelEtiketten() {
        return KlantAfdrukkenOpverdeelEtiketten;
    }

    public void setKlantAfdrukkenOpverdeelEtiketten(boolean KlantAfdrukkenOpverdeelEtiketten) {
        this.KlantAfdrukkenOpverdeelEtiketten = KlantAfdrukkenOpverdeelEtiketten;
    }

    public String getTitelVerdeellijst() {
        return TitelVerdeellijst;
    }

    public void setTitelVerdeellijst(String TitelVerdeellijst) {
        this.TitelVerdeellijst = TitelVerdeellijst;
    }

    public KlantVerdeelGroep getVerdeelgroep() {
        return Verdeelgroep;
    }

    public void setVerdeelgroep(KlantVerdeelGroep Verdeelgroep) {
        this.Verdeelgroep = Verdeelgroep;
    }

    public List<ContactPersoon> getContactPersonen() {
        return ContactPersonen;
    }

    public void setContactPersonen(List<ContactPersoon> ContactPersonen) {
        this.ContactPersonen = ContactPersonen;
    }

    public List<BankRekeningNummer> getBankRekeningNummers() {
        return BankRekeningNummers;
    }

    public void setBankRekeningNummers(List<BankRekeningNummer> BankRekeningNummers) {
        this.BankRekeningNummers = BankRekeningNummers;
    }

    public List<LeveringsToer> getLeveringsToeren() {
        return LeveringsToeren;
    }

    public void setLeveringsToeren(List<LeveringsToer> LeveringsToeren) {
        this.LeveringsToeren = LeveringsToeren;
    }

    public String getEmailAdressenOntvangersFacturenAsString() {
        return EmailAdressenOntvangersFacturenAsString;
    }

    public void setEmailAdressenOntvangersFacturenAsString(String EmailAdressenOntvangersFacturenAsString) {
        this.EmailAdressenOntvangersFacturenAsString = EmailAdressenOntvangersFacturenAsString;
    }

    public String getOpmerkingenAsString() {
        return OpmerkingenAsString;
    }

    public void setOpmerkingenAsString(String OpmerkingenAsString) {
        this.OpmerkingenAsString = OpmerkingenAsString;
    }

    public List<KlantOpeningstijd> getKlantOpeningstijden() {
        return KlantOpeningstijden;
    }

    public void setKlantOpeningstijden(List<KlantOpeningstijd> KlantOpeningstijden) {
        this.KlantOpeningstijden = KlantOpeningstijden;
    }

    public List<Openingstijd> getOpeningsTijden() {
        return OpeningsTijden;
    }

    public void setOpeningsTijden(List<Openingstijd> OpeningsTijden) {
        this.OpeningsTijden = OpeningsTijden;
    }

    public List<KlantVerlof> getKlantVerlof() {
        return KlantVerlof;
    }

    public void setKlantVerlof(List<KlantVerlof> KlantVerlof) {
        this.KlantVerlof = KlantVerlof;
    }

    public List<Verlof> getVerlofs() {
        return Verlofs;
    }

    public void setVerlofs(List<Verlof> Verlofs) {
        this.Verlofs = Verlofs;
    }

    public List<KlantKorting> getKlantKortingen() {
        return KlantKortingen;
    }

    public void setKlantKortingen(List<KlantKorting> KlantKortingen) {
        this.KlantKortingen = KlantKortingen;
    }

    public List<Korting> getKortingen() {
        return Kortingen;
    }

    public void setKortingen(List<Korting> Kortingen) {
        this.Kortingen = Kortingen;
    }

    public List<KlantBereikbaarheidOpDag> getKlantBereikbaarOpDagen() {
        return KlantBereikbaarOpDagen;
    }

    public void setKlantBereikbaarOpDagen(List<KlantBereikbaarheidOpDag> KlantBereikbaarOpDagen) {
        this.KlantBereikbaarOpDagen = KlantBereikbaarOpDagen;
    }

    public List<KlantAdres> getKlantAdressen() {
        return KlantAdressen;
    }

    public void setKlantAdressen(List<KlantAdres> KlantAdressen) {
        this.KlantAdressen = KlantAdressen;
    }

    public List<Adres> getAdressen() {
        return Adressen;
    }

    public void setAdressen(List<Adres> Adressen) {
        this.Adressen = Adressen;
    }

    @Override
    public void setId(int id) {
        this.KlantId=id;
    }
    
     @Override
    public int getId() {
        return this.KlantId;
    }

}
