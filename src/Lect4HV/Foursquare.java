package Lect4HV;

public class Foursquare extends Polygon {

    //храним одну сторону, квадрат же
    int side;

    public Foursquare(int side) {
        super("Foursquare");
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
