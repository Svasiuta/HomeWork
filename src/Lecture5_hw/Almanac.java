package Lecture5_hw;

/**
 * Created by Sergii_Vasiuta on 20.12.2016.
 */
public class Almanac extends Literature {
    String publisher;
    String theme;


    public Almanac(String name, String publisher, String theme, int year) {
        super.name = name;
        this.publisher = publisher;
        this.theme = theme;
        super.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Almanac " + name + " "+ theme + " " + publisher + " " + year );
    }

    }
