
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int sum = 0;
        
        for (Suitcase luggage : suitcases) {
            sum += luggage.totalWeight();
        }
        
        if (suitcases.isEmpty()) {
            suitcases.add(suitcase);
        } else if (sum + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int sum = 0;
        
        for (Suitcase luggage : suitcases) {
            sum += luggage.totalWeight();
        }
        return suitcases.size() + " suitcases (" + sum + " kg)";
    }
    
    public void printItems() {
        for (Suitcase luggage : suitcases) {
            luggage.printItems();
        }
    }
    
}
