/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Container {
  
    private int containerLiquid;

    public Container() {
        this.containerLiquid = 0;
    }

    public int contains() {
        return this.containerLiquid;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        } else if (this.containerLiquid + amount <= 100) {
            this.containerLiquid += amount;
        } else {
            this.containerLiquid = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        } else if (amount > this.containerLiquid) {
            this.containerLiquid = 0;
        } else {
            this.containerLiquid -= amount;
        }
    }

    public String toString() {
        return this.containerLiquid + "/100";
    }
    
}
