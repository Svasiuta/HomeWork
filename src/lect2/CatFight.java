package lect2;


/**
 * Created by Sergii_Vasiuta on 14.12.2016.
 */
public class CatFight {

    public static void main(String[] args) {

        //create cats
        Cat chiropractor = new Cat("Chip", 7, 50);
        Cat godzilla = new Cat("Godzilla", 9.8, 60);

        //start fighting
        System.out.printf("%s vs %s", chiropractor.name, godzilla.name).println();
        System.out.println(chiropractor.getPowerFactor());
        System.out.println(godzilla.getPowerFactor());

        //get winner
        String winnerName = getWinner(chiropractor, godzilla);

        //print winner name
        System.out.printf("%s wins", winnerName);
    }

    /**
     * This method compare to cats and return winner
     * @param catInRedCorner - first cat
     * @param catInBlackCorner - second cat
     * @return winner
     */
    static String getWinner(Cat catInRedCorner, Cat catInBlackCorner) {
        if (catInBlackCorner.getPowerFactor()  > catInRedCorner.getPowerFactor()) {
            return catInBlackCorner.name;
        } else {
            return catInRedCorner.name;
        }
    }


}
