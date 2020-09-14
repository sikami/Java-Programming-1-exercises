/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double price = 2.60;
        if ((this.balance - price) < 0) {
            this.balance = this.balance;
        } else {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if ((this.balance - price) < 0) {
            this.balance = this.balance;
        } else {
            this.balance -= price;
        }

    }

    public void addMoney(double amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (this.balance < 150 && this.balance + amount < 150) {
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }
}
