/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instellingen;

import New.New;
import enums.OpzoekenAankoopproduct;
import enums.Orderpicking;

/**
 *
 * @author stefa
 */
public class AlgemeneInstelling implements New{
    public int AlgemeneInstellingId;
    public boolean ProbakAlsBackoffice;
    public boolean IngrediëntenDoorsturen;
    public OpzoekenAankoopproduct OpzoekenAankoopproduct;
    public boolean AnalutischeRekeningZichtbaar;
    public boolean AanpassenAankoopproductBijRegistratieFactuur;
    public int AantalDagenBijhouden;
    public boolean DoorsturenNaarProbak;
    public Orderpicking Orderpicking;

    public AlgemeneInstelling() {
    }

    public AlgemeneInstelling(int AlgemeneInstellingId, boolean ProbakAlsBackoffice, boolean IngrediëntenDoorsturen, OpzoekenAankoopproduct OpzoekenAankoopproduct, boolean AnalutischeRekeningZichtbaar, boolean AanpassenAankoopproductBijRegistratieFactuur, int AantalDagenBijhouden, boolean DoorsturenNaarProbak, Orderpicking Orderpicking) {
        this.AlgemeneInstellingId = AlgemeneInstellingId;
        this.ProbakAlsBackoffice = ProbakAlsBackoffice;
        this.IngrediëntenDoorsturen = IngrediëntenDoorsturen;
        this.OpzoekenAankoopproduct = OpzoekenAankoopproduct;
        this.AnalutischeRekeningZichtbaar = AnalutischeRekeningZichtbaar;
        this.AanpassenAankoopproductBijRegistratieFactuur = AanpassenAankoopproductBijRegistratieFactuur;
        this.AantalDagenBijhouden = AantalDagenBijhouden;
        this.DoorsturenNaarProbak = DoorsturenNaarProbak;
        this.Orderpicking = Orderpicking;
    }

    public int getAlgemeneInstellingId() {
        return AlgemeneInstellingId;
    }

    public void setAlgemeneInstellingId(int AlgemeneInstellingId) {
        this.AlgemeneInstellingId = AlgemeneInstellingId;
    }

    public boolean isProbakAlsBackoffice() {
        return ProbakAlsBackoffice;
    }

    public void setProbakAlsBackoffice(boolean ProbakAlsBackoffice) {
        this.ProbakAlsBackoffice = ProbakAlsBackoffice;
    }

    public boolean isIngrediëntenDoorsturen() {
        return IngrediëntenDoorsturen;
    }

    public void setIngrediëntenDoorsturen(boolean IngrediëntenDoorsturen) {
        this.IngrediëntenDoorsturen = IngrediëntenDoorsturen;
    }

    public OpzoekenAankoopproduct getOpzoekenAankoopproduct() {
        return OpzoekenAankoopproduct;
    }

    public void setOpzoekenAankoopproduct(OpzoekenAankoopproduct OpzoekenAankoopproduct) {
        this.OpzoekenAankoopproduct = OpzoekenAankoopproduct;
    }

    public boolean isAnalutischeRekeningZichtbaar() {
        return AnalutischeRekeningZichtbaar;
    }

    public void setAnalutischeRekeningZichtbaar(boolean AnalutischeRekeningZichtbaar) {
        this.AnalutischeRekeningZichtbaar = AnalutischeRekeningZichtbaar;
    }

    public boolean isAanpassenAankoopproductBijRegistratieFactuur() {
        return AanpassenAankoopproductBijRegistratieFactuur;
    }

    public void setAanpassenAankoopproductBijRegistratieFactuur(boolean AanpassenAankoopproductBijRegistratieFactuur) {
        this.AanpassenAankoopproductBijRegistratieFactuur = AanpassenAankoopproductBijRegistratieFactuur;
    }

    public int getAantalDagenBijhouden() {
        return AantalDagenBijhouden;
    }

    public void setAantalDagenBijhouden(int AantalDagenBijhouden) {
        this.AantalDagenBijhouden = AantalDagenBijhouden;
    }

    public boolean isDoorsturenNaarProbak() {
        return DoorsturenNaarProbak;
    }

    public void setDoorsturenNaarProbak(boolean DoorsturenNaarProbak) {
        this.DoorsturenNaarProbak = DoorsturenNaarProbak;
    }

    public Orderpicking getOrderpicking() {
        return Orderpicking;
    }

    public void setOrderpicking(Orderpicking Orderpicking) {
        this.Orderpicking = Orderpicking;
    }

    @Override
    public void setId(int id) {
        this.AlgemeneInstellingId=id;
    }
    
     @Override
    public int getId() {
        return this.AlgemeneInstellingId;
    }
}
