/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate;
        double result;
        
        maximumHeartRate = 206.3 - (0.711 * this.age);
        result = (maximumHeartRate - (double) this.restingHeartRate) *
                (percentageOfMaximum) +this.restingHeartRate;
        
        return result;
    }
    
}
