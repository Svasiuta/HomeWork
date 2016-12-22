package Lect4HV;

public class Circle extends Figure {

    //для круга нам нужен радиус
    int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}