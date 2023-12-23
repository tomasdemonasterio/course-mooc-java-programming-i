public class Apartment {
 
    private int rooms;
    private int squares;
    private int princePerSquare;
 
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int value = this.squares * this.princePerSquare - compared.squares * compared.princePerSquare;
        if (value < 0) {
            value *= -1;
        }
        return value;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
    }
 
}