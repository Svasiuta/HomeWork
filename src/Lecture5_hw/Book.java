package Lecture5_hw;

/**
 * Created by Sergii_Vasiuta on 20.12.2016.
 */
public class Book extends Literature {

    public String author;




   public Book (String name, String author, int year) {

        super.name = name;
        this.author=author;
        super.year = year;
    }

    public void displayInfo(){

                System.out.println("Book " + name + " "+ author + " " + year );
    }

}
