/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Birds {
    private String name;
    private String latin;
    private int observation;
    private boolean observed;

    public Birds(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
        this.observed = false;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservation() {
        return observation;
    }

    public void addObservation() {
        if (this.observed == false) {
            this.observation++;
            this.observed = true;
        } else {
            this.observation++;
        }
    }


    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observation + " observations";
    }
}
