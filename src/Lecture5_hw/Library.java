package Lecture5_hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergii_Vasiuta on 25.12.2016.
 */
public class Library {

    public static List <Literature> getFiltered (int diap) {
        List<Literature> literatures = new ArrayList<>();
        List<Literature> filtered = new ArrayList<>();

        Book b1 = new Book("Война и мир", "Л. Н. Толстой", 1869);
        Almanac b2 = new Almanac("Периодизация в европейской и Всемирной истории", "Kyiv", "History", 1950);
        Magazine b3 = new Magazine ("Путешествия", "geography", 1998);

        literatures.add (b1);
        literatures.add (b2);
        literatures.add (b3);

        for (Literature l : literatures)
        {
            if (2016 - l.year <= diap)
            {
                filtered.add(l);
            }
        }
        return filtered;
    }

    public static void main(String[] args) {

        for (Literature l : getFiltered(100))
        {
            l.displayInfo();    }

    }

}
