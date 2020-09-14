
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + 
                addition.cents));
        
        return newMoney;        
    }
    
    public boolean lessThan(Money compared) {
        Money newMoney = new Money(this.euros, this.cents);
        if (newMoney.euros < compared.euros()) {
            return true;
        } else if (newMoney.euros < compared.euros() && newMoney.cents < compared.cents()) {
            return true;
        } else if (newMoney.euros == compared.euros() && newMoney.cents < compared.cents()) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        int euro = 0;
        int cent = 0;

        if (newMoney.cents < 0 ) {
            cent = 100 + newMoney.cents;
            euro = newMoney.euros - 1;
            Money another = new Money(euro, cent);
            return another;
        } else if (newMoney.euros < 0) {
            cent = 0;
            euro = 0;
            Money another = new Money(euro, cent);
            return another;
        }
        return newMoney;
        
    }

}
