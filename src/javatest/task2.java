package javatest;

import java.util.Scanner;

import static java.lang.Math.*;

public class task2 {
    public static void main(String[] args) {

//TASK 2.1
//init scanner
        Scanner in = new Scanner(System.in);

//starts input variables
        System.out.print("input a: ");
        int a = in.nextInt();
        System.out.print("input b: ");
        int b = in.nextInt();
        System.out.print("input c: ");
        int c = in.nextInt();

        if ((a > b)&&(b>c)) {
            System.out.println ((b*b)+ (a*a));
        } else if((a>b)&&(c>b)){
            System.out.println((a*a)+ (c*c));
        }
        else {
            System.out.println((c*c)+ (b*b));
        }


    //TASK 2.2
        in = new Scanner(System.in);
    double a1, b1, c1, d1;
    double x1, x2;
System.out.println("Введите а: ");
    a1 = in.nextDouble();
System.out.println("Введите b: ");
      b1 = in.nextDouble();
        System.out.println("Введите c: ");
        c1 = in.nextDouble();
        d1 = pow(b1, 2) - (4 * a1 * c1);
        if (d1>=0){
            x1 = ((-1) * b1 + sqrt(d1)) / 2 * a1;
            x2 = ((-1) * b1 - sqrt(d1)) / 2 * a1;
        System.out.printf("x1 = " + x1 + " x2 = " + x2);
    }
else if (d1 == 0){
        x1 = (-1) * b1;
        System.out.printf("x1, x2 = " + x1);
    }
else
        System.out.print("Ошибка. D меньше нуля");

//TASK 2.3
   //init scanner
        Scanner scan = new Scanner(System.in);

        //enter number of rows
        System.out.println("Enter the number of rows: ");
        int numRows = scan.nextInt();

        //init arrays for saving rows and they length
        String[] arrayOfRows = new String[numRows];
        int[] arrayOfRowsLength = new int[numRows];

        //enter and save rows
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.next();
            arrayOfRows[i] = row; //переменная
            arrayOfRowsLength[i] = row.length();//длина переменной
        }

        //init variables for saving row with max length
        int minLength = arrayOfRowsLength[0];
        String minLengthRow = arrayOfRows[0];

        //cycle for finding row with max length
        for (int i = 0; i < numRows; i++) {
            if (minLength > arrayOfRowsLength[i]) {
                minLength = arrayOfRowsLength[i];
                minLengthRow = arrayOfRows[i];

            }
        }

        //print row with max length
        System.out.println("The smallest row is: " + minLengthRow );
        System.out.println("The rows length is: " + minLength);


    //TASK 2.4
        scan = new Scanner(System.in);

        //enter number of rows
        System.out.println("размер массива: ");
        numRows = scan.nextInt();

        //init arrays for saving rows and they length
        arrayOfRows = new String[numRows];
        arrayOfRowsLength = new int[numRows];

        //enter and save rows
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.next();
            arrayOfRows[i] = row; //переменная
            arrayOfRowsLength[i] = row.length();//длина переменной
        }
        int sum =0;
        double mid =sum/numRows; //находим среднее
        for (int i=0;i<numRows; i++)
        {sum += arrayOfRowsLength[i];
        }
            }}

