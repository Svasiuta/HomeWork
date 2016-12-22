package Lect4HV;

/**
 * Created by Sergii_Vasiuta on 21.12.2016.
 */
public class JavaExampleOOP {

    public static void main(String[] args) {

        Figure[] listFigures = new Figure[4];
        listFigures[0] = new Triangle(3, 4, 5);
        listFigures[1] = new Rectangle(2, 5);
        listFigures[2] = new Foursquare(7);
        listFigures[3] = new Circle(4);


        //вариант с использованием полиморфизма
        for (Figure figure : listFigures) {
            double square = figure.getSquare();
            System.out.println(String.format("Square of %s = %.2f", figure.getName(), square));
        }

        //вариант с преобразованием типов
        for (Figure figure : listFigures) {

            //проверяем, является ли фигура треугольником...
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                double square = figure.getSquare();
                System.out.println(String.format("Square of %s = %.2f", triangle.getName(), square));

                //или прямоугольником...
            } else if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                double square = figure.getSquare();
                System.out.println(String.format("Square of %s = %.2f", rectangle.getName(), square));


                //или квадратом...
            } else if (figure instanceof Foursquare) {
                Foursquare foursquare = (Foursquare) figure;
                double square = figure.getSquare();
                System.out.println(String.format("Square of %s = %.2f", foursquare.getName(), square));


                //или вообще это круг...
            } else if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                double square = figure.getSquare();
                System.out.println(String.format("Square of %s = %.2f", circle.getName(), square));
            }
        }
    }



}

