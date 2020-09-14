
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int totalPrice = this.squares * this.pricePerSquare;
        int comparedTotalPrice = compared.squares * compared.pricePerSquare;
        if(totalPrice > comparedTotalPrice) {
            return totalPrice - comparedTotalPrice;
        } else {
            return comparedTotalPrice - totalPrice;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int totalPrice = this.squares * this.pricePerSquare;
        int comparedTotalPrice = compared.squares * compared.pricePerSquare;
        if(totalPrice > comparedTotalPrice) {
            return true;
        } 
        return false;
    }
}
