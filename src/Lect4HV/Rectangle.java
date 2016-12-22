package Lect4HV;

public class Rectangle extends Polygon {

//    //храним только две стороны (ведь это прямоугольник, нам больше и не надо)
//    private int[] sides;

    public Rectangle(int length, int width) {
        super("Rectangle");
        super.sides = new int[2];
        sides[0] = length;
        sides[1] = width;
    }

    @Override
    public double getSquare() {
        return sides[0] * sides[1];
    }
}
