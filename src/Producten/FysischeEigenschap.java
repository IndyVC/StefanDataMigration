/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;
import enums.Eenheid;
import enums.SoortFysischeEigenschap;

/**
 *
 * @author stefa
 */
public class FysischeEigenschap implements New{

    public int FysischeEigenschapId;
    public SoortFysischeEigenschap SoortFysischeEigenschap;
    public double FysischeEigenschapDoel;
    public Eenheid FysischeEigenschapEenheid;
    public double FysischeEigenschapVariatie;
    public BasisProduct BasisProduct;

    public FysischeEigenschap() {
    }

    public FysischeEigenschap(int FysischeEigenschapId, SoortFysischeEigenschap SoortFysischeEigenschap, double FysischeEigenschapDoel, Eenheid FysischeEigenschapEenheid, double FysischeEigenschapVariatie, BasisProduct BasisProduct) {
        this.FysischeEigenschapId = FysischeEigenschapId;
        this.SoortFysischeEigenschap = SoortFysischeEigenschap;
        this.FysischeEigenschapDoel = FysischeEigenschapDoel;
        this.FysischeEigenschapEenheid = FysischeEigenschapEenheid;
        this.FysischeEigenschapVariatie = FysischeEigenschapVariatie;
        this.BasisProduct = BasisProduct;
    }

    public int getFysischeEigenschapId() {
        return FysischeEigenschapId;
    }

    public void setFysischeEigenschapId(int FysischeEigenschapId) {
        this.FysischeEigenschapId = FysischeEigenschapId;
    }

    public SoortFysischeEigenschap getSoortFysischeEigenschap() {
        return SoortFysischeEigenschap;
    }

    public void setSoortFysischeEigenschap(SoortFysischeEigenschap SoortFysischeEigenschap) {
        this.SoortFysischeEigenschap = SoortFysischeEigenschap;
    }

    public double getFysischeEigenschapDoel() {
        return FysischeEigenschapDoel;
    }

    public void setFysischeEigenschapDoel(double FysischeEigenschapDoel) {
        this.FysischeEigenschapDoel = FysischeEigenschapDoel;
    }

    public Eenheid getFysischeEigenschapEenheid() {
        return FysischeEigenschapEenheid;
    }

    public void setFysischeEigenschapEenheid(Eenheid FysischeEigenschapEenheid) {
        this.FysischeEigenschapEenheid = FysischeEigenschapEenheid;
    }

    public double getFysischeEigenschapVariatie() {
        return FysischeEigenschapVariatie;
    }

    public void setFysischeEigenschapVariatie(double FysischeEigenschapVariatie) {
        this.FysischeEigenschapVariatie = FysischeEigenschapVariatie;
    }

    public BasisProduct getBasisProduct() {
        return BasisProduct;
    }

    public void setBasisProduct(BasisProduct BasisProduct) {
        this.BasisProduct = BasisProduct;
    }

    @Override
    public void setId(int id) {
        this.FysischeEigenschapId=id;
    }
     @Override
    public int getId() {
        return this.FysischeEigenschapId;
    }
    
    
}
