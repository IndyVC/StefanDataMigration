/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import Algemeen.Omschrijving;
import New.New;
import Old.Materieel;
import Producten.Recepten.BasisRecept;
import Producten.Recepten.Taak;
import TussenTabellen.ReceptProductBasisRecept;
import TussenTabellen.ReceptProductMaterieel;
import TussenTabellen.ReceptProductTaak;
import enums.Eenheid;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ReceptProduct implements New{
     public int ReceptProductId;
        public Omschrijving Omschrijving;
        public Eenheid ReceptEenheid;
        public boolean ZichtbaarBijReceptBasisProduct;
        public boolean ZichtbaarBijReceptVoorbereidProduct;
        public boolean ZichtbaarBijReceptAfgewerktProduct;
        public boolean ZichtbaarBijReceptVerkoopProduct;
        public boolean DefaultHulpstof;
        public boolean MoetGewogenWorden;
        public double MaximaalWeeggewicht;
        public double RelatieveWeegmarge;
        public double AbsoluteWeegmarge;
        public boolean Blokkeren;
        public List<AankoopProduct> AankoopProducten;
        public List<ReceptProductBasisRecept> ReceptProductBasisRecepten;
        public List<BasisRecept> BasisRecepten;
        public List<ReceptProductTaak> ReceptProductTaken;
        public List<Taak> ReceptTaken;
        public List<ReceptProductMaterieel> ReceptProductMaterielen;
        public List<Materieel> ReceptMaterieel;

    public ReceptProduct() {
        setId(-1);
    }

    public ReceptProduct(int ReceptProductId, Omschrijving Omschrijving, Eenheid ReceptEenheid, boolean ZichtbaarBijReceptBasisProduct, boolean ZichtbaarBijReceptVoorbereidProduct, boolean ZichtbaarBijReceptAfgewerktProduct, boolean ZichtbaarBijReceptVerkoopProduct, boolean DefaultHulpstof, boolean MoetGewogenWorden, double MaximaalWeeggewicht, double RelatieveWeegmarge, double AbsoluteWeegmarge, boolean Blokkeren) {
        this.ReceptProductId = ReceptProductId;
        this.Omschrijving = Omschrijving;
        this.ReceptEenheid = ReceptEenheid;
        this.ZichtbaarBijReceptBasisProduct = ZichtbaarBijReceptBasisProduct;
        this.ZichtbaarBijReceptVoorbereidProduct = ZichtbaarBijReceptVoorbereidProduct;
        this.ZichtbaarBijReceptAfgewerktProduct = ZichtbaarBijReceptAfgewerktProduct;
        this.ZichtbaarBijReceptVerkoopProduct = ZichtbaarBijReceptVerkoopProduct;
        this.DefaultHulpstof = DefaultHulpstof;
        this.MoetGewogenWorden = MoetGewogenWorden;
        this.MaximaalWeeggewicht = MaximaalWeeggewicht;
        this.RelatieveWeegmarge = RelatieveWeegmarge;
        this.AbsoluteWeegmarge = AbsoluteWeegmarge;
        this.Blokkeren = Blokkeren;
        this.AankoopProducten = AankoopProducten;
        this.ReceptProductBasisRecepten = ReceptProductBasisRecepten;
        this.BasisRecepten = BasisRecepten;
        this.ReceptProductTaken = ReceptProductTaken;
        this.ReceptTaken = ReceptTaken;
        this.ReceptProductMaterielen = ReceptProductMaterielen;
        this.ReceptMaterieel = ReceptMaterieel;
    }

   
    public int getReceptProductId() {
        return ReceptProductId;
    }

    public void setReceptProductId(int ReceptProductId) {
        this.ReceptProductId = ReceptProductId;
    }

    public Omschrijving getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(Omschrijving Omschrijving) {
        this.Omschrijving = Omschrijving;
    }

    public Eenheid getReceptEenheid() {
        return ReceptEenheid;
    }

    public void setReceptEenheid(Eenheid ReceptEenheid) {
        this.ReceptEenheid = ReceptEenheid;
    }

    public boolean isZichtbaarBijReceptBasisProduct() {
        return ZichtbaarBijReceptBasisProduct;
    }

    public void setZichtbaarBijReceptBasisProduct(boolean ZichtbaarBijReceptBasisProduct) {
        this.ZichtbaarBijReceptBasisProduct = ZichtbaarBijReceptBasisProduct;
    }

    public boolean isZichtbaarBijReceptVoorbereidProduct() {
        return ZichtbaarBijReceptVoorbereidProduct;
    }

    public void setZichtbaarBijReceptVoorbereidProduct(boolean ZichtbaarBijReceptVoorbereidProduct) {
        this.ZichtbaarBijReceptVoorbereidProduct = ZichtbaarBijReceptVoorbereidProduct;
    }

    public boolean isZichtbaarBijReceptAfgewerktProduct() {
        return ZichtbaarBijReceptAfgewerktProduct;
    }

    public void setZichtbaarBijReceptAfgewerktProduct(boolean ZichtbaarBijReceptAfgewerktProduct) {
        this.ZichtbaarBijReceptAfgewerktProduct = ZichtbaarBijReceptAfgewerktProduct;
    }

    public boolean isZichtbaarBijReceptVerkoopProduct() {
        return ZichtbaarBijReceptVerkoopProduct;
    }

    public void setZichtbaarBijReceptVerkoopProduct(boolean ZichtbaarBijReceptVerkoopProduct) {
        this.ZichtbaarBijReceptVerkoopProduct = ZichtbaarBijReceptVerkoopProduct;
    }

    public boolean isDefaultHulpstof() {
        return DefaultHulpstof;
    }

    public void setDefaultHulpstof(boolean DefaultHulpstof) {
        this.DefaultHulpstof = DefaultHulpstof;
    }

    public boolean isMoetGewogenWorden() {
        return MoetGewogenWorden;
    }

    public void setMoetGewogenWorden(boolean MoetGewogenWorden) {
        this.MoetGewogenWorden = MoetGewogenWorden;
    }

    public double getMaximaalWeeggewicht() {
        return MaximaalWeeggewicht;
    }

    public void setMaximaalWeeggewicht(double MaximaalWeeggewicht) {
        this.MaximaalWeeggewicht = MaximaalWeeggewicht;
    }

    public double getRelatieveWeegmarge() {
        return RelatieveWeegmarge;
    }

    public void setRelatieveWeegmarge(double RelatieveWeegmarge) {
        this.RelatieveWeegmarge = RelatieveWeegmarge;
    }

    public double getAbsoluteWeegmarge() {
        return AbsoluteWeegmarge;
    }

    public void setAbsoluteWeegmarge(double AbsoluteWeegmarge) {
        this.AbsoluteWeegmarge = AbsoluteWeegmarge;
    }

    public boolean isBlokkeren() {
        return Blokkeren;
    }

    public void setBlokkeren(boolean Blokkeren) {
        this.Blokkeren = Blokkeren;
    }

    public List<AankoopProduct> getAankoopProducten() {
        return AankoopProducten;
    }

    public void setAankoopProducten(List<AankoopProduct> AankoopProducten) {
        this.AankoopProducten = AankoopProducten;
    }

    public List<ReceptProductBasisRecept> getReceptProductBasisRecepten() {
        return ReceptProductBasisRecepten;
    }

    public void setReceptProductBasisRecepten(List<ReceptProductBasisRecept> ReceptProductBasisRecepten) {
        this.ReceptProductBasisRecepten = ReceptProductBasisRecepten;
    }

    public List<BasisRecept> getBasisRecepten() {
        return BasisRecepten;
    }

    public void setBasisRecepten(List<BasisRecept> BasisRecepten) {
        this.BasisRecepten = BasisRecepten;
    }

    public List<ReceptProductTaak> getReceptProductTaken() {
        return ReceptProductTaken;
    }

    public void setReceptProductTaken(List<ReceptProductTaak> ReceptProductTaken) {
        this.ReceptProductTaken = ReceptProductTaken;
    }

    public List<Taak> getReceptTaken() {
        return ReceptTaken;
    }

    public void setReceptTaken(List<Taak> ReceptTaken) {
        this.ReceptTaken = ReceptTaken;
    }

    public List<ReceptProductMaterieel> getReceptProductMaterielen() {
        return ReceptProductMaterielen;
    }

    public void setReceptProductMaterielen(List<ReceptProductMaterieel> ReceptProductMaterielen) {
        this.ReceptProductMaterielen = ReceptProductMaterielen;
    }

    public List<Materieel> getReceptMaterieel() {
        return ReceptMaterieel;
    }

    public void setReceptMaterieel(List<Materieel> ReceptMaterieel) {
        this.ReceptMaterieel = ReceptMaterieel;
    }

    @Override
    public void setId(int id) {
        this.ReceptProductId=id;
    }
 @Override
    public int getId() {
        return this.ReceptProductId;
    }
   
        
        
}
