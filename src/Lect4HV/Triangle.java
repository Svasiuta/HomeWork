package Lect4HV;



public class Triangle extends Polygon {



    public Triangle(int firstSide, int secondSide, int thirdSide) {
        super("Triangle");
        super.sides = new int[3];
        sides[0] = firstSide;
        sides[1] = secondSide;
        sides[2] = thirdSide;
    }

    /**
     * Переопределяем метод, считаем площадь треугольника
     *
     * @return площадь треугольника
     */
    @Override
    public double getSquare() {

        //считаем полупериметр
        double p = (sides[0] + sides[1] + sides[2]) / 2;

        //считаем площать треугольника по формуле герона
        double square = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));

        //возвращаем значение
        return square;
    }
}
