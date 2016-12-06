package javatest;

import java.util.Locale;
import java.util.Scanner;

class JavaExampleI {

    /**
     * This program convert UAN to USD or EUR
     */
    public static void main(String[] args) {

        //init variables
        String USD_P = "PRIVAT";
        String USD_PB = "PUMB";
        String USD_U = "UKRSIB";

        float COURSE_USD_PRIVAT = 25.5f;
        float COURSE_USD_PUMB = 26f;
        float COURSE_USD_UKRSIB = 26.5f;

        //init scanner
        Scanner scan = new Scanner(System.in);

        //enter amount of money
        System.out.println("Enter the amount of money that you want to change: ");
        int amount = scan.nextInt();

        //enter currency
        System.out.println("Enter the currency to convert (PRIVAT or PUMB or UKRSIB): ");
        String currency = scan.next();

        //convert uan to user currency
        if (USD_P.equalsIgnoreCase(currency)) {
            System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD_P, amount / COURSE_USD_PRIVAT));
        } else if (USD_PB.equalsIgnoreCase(currency)) {
            System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD_PB, amount / COURSE_USD_PUMB));
        }
        else if (USD_U.equalsIgnoreCase(currency)) {
            System.out.println(String.format(Locale.US, "You money in %s: %.2f", USD_U, amount / COURSE_USD_UKRSIB));
        }else {
            System.err.println("Can't convert to " + currency);
        }

    }

}
