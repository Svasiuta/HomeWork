package javatest;

/**
 * Created by Sergii_Vasiuta on 12.12.2016.
 */
public class BooksApp {
    static Book[] books = new Book[10];

    public static void main(String[] args) {
        initBooks();
        findOldestBook();
        findByAuthor("newAuth5");
        findEarlier (1985);
    }

    static void initBooks(){
        for (int i = 0; i < books.length; i++) {
            Book book = new Book();
            book.author = "newAuth" + (i+1);
            book.name = "newName" + (i+1);
            book.year = 1990 - i;
            books[i] = book;
        }

    }
    static void findOldestBook (){
        Book oldestBook = books[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i].year < oldestBook.year) {
                oldestBook = books[i];
            }
        }
        System.out.println("Oldest book author: " + oldestBook.author);
    }

    static void findByAuthor (String author){
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equals(author)) {
                System.out.println("Book " + books[i].name +" by author " + books[i].author );
            }
        }
    }

    static void findEarlier (int year){
        System.out.println("Book earlier than " + year + ":");
        for (int i = 0; i < books.length; i++){
            if (books[i].year < year){
                System.out.println(books[i].author +" "+ books[i].name +" "+ books[i].year);
            }
        }
    }

}
