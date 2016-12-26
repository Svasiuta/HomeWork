package Lecture5_hw;

/**
 * Created by Sergii_Vasiuta on 20.12.2016.
 */
public class Magazine extends Literature {
    String theme;

    public Magazine(String name, String theme, int year) {
        super.name = name;
        this.theme = theme;
        super.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine " + name + " "+ theme + " " + year );
    }

    }

