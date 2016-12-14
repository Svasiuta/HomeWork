package lect2;


import java.util.Random;

/**
 * Created by Sergii_Vasiuta on 14.12.2016.
 */
public class Cat {
    String name;
    double weight;
    int height;
    Random luck = new Random();

//    public int getLuck() {
//        Random r = new Random();
//
//        int q = r.nextInt(30) - 15;
//        luck =q ;
//        return luck;
//    }

    public Cat(String name, double weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }


    public double getPowerFactor() {
        return weight * height * (luck.nextInt(30) - 15);
    }
}
