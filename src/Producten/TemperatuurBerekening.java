/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producten;

import New.New;

/**
 *
 * @author stefa
 */
public class TemperatuurBerekening implements New{
     public int TemperatuurBerekeningId;
        // temperatureCalculation.temperature
        public double Temperatuur;
        // temperatureCalculation.specificHeatCapacity
        public double SpecifiekeWarmteCapaciteit;

    public TemperatuurBerekening() {
    }

    public TemperatuurBerekening(int TemperatuurBerekeningId, double Temperatuur, double SpecifiekeWarmteCapaciteit) {
        this.TemperatuurBerekeningId = TemperatuurBerekeningId;
        this.Temperatuur = Temperatuur;
        this.SpecifiekeWarmteCapaciteit = SpecifiekeWarmteCapaciteit;
    }

    public int getTemperatuurBerekeningId() {
        return TemperatuurBerekeningId;
    }

    public void setTemperatuurBerekeningId(int TemperatuurBerekeningId) {
        this.TemperatuurBerekeningId = TemperatuurBerekeningId;
    }

    public double getTemperatuur() {
        return Temperatuur;
    }

    public void setTemperatuur(double Temperatuur) {
        this.Temperatuur = Temperatuur;
    }

    public double getSpecifiekeWarmteCapaciteit() {
        return SpecifiekeWarmteCapaciteit;
    }

    public void setSpecifiekeWarmteCapaciteit(double SpecifiekeWarmteCapaciteit) {
        this.SpecifiekeWarmteCapaciteit = SpecifiekeWarmteCapaciteit;
    }

    @Override
    public void setId(int id) {
        this.TemperatuurBerekeningId=id;
    }
        
         @Override
    public int getId() {
        return this.TemperatuurBerekeningId;
    }
}
