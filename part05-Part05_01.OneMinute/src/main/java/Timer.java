/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Timer {
    private ClockHand second;
    private ClockHand hundredsOfSecond;

    public Timer() {
        this.hundredsOfSecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public String toString() {
        return this.second + ":" + this.hundredsOfSecond;
    }
    
    public void advance() {
       this.hundredsOfSecond.advance();
       
       if (this.hundredsOfSecond.value() == 0) {
           this.second.advance();
       }
       
    }
  
}
