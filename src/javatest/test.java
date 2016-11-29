package javatest;

/**
 * Created by Sergii_Vasiuta on 09.09.2016.
 */
public class test {
  public static void main (String [] args) {

/*/TASK 1,2
        int a =4658530;
        int b = 37863;
        int c = 2888582;

        long f = 547030; //Ирландия км²
        long g = 504782; //Испания
        long h = 449964; //Монако
        double j = (f*0.3861);
        double k = (g*0.3861);
        double l = (h* 0.3861);


        System.out.println("Ирландия: "+ a + " человек, площадь " + f*1000000 +"кв. м или "+j+" миль" );
        System.out.println("Испания: "+ b + " человек, площадь "+ f*1000000 +"кв. м или "+g+" миль");
        System.out.println("Монако: "+ c + " человек, площадь "+ f*1000000 +"кв. м или "+h+" миль");

        //TASK 3
        double[] valute;

        valute = new double[3];
        valute[0] = 26.20;
        valute[1] = 27.60;
        valute[2] = 0.3865;


        System.out.println("5000грн это: " + 5000/valute[0]+ " долларов");
        System.out.println("5000грн это: " + 5000/valute[1]+" евро");
        System.out.println("5000грн это: " + 5000/valute[2]+" рублей");*/

//TASK 4
     /* String[][] arr = new String[3][2];

      arr[0][0] = "1988";
      arr[0][1] = "Вася";


      arr[1][0] = "2000";
      arr[1][1] = "Петя";


      arr[2][0] = "1995";
      arr[2][1] = "Юра";

      String str1 = "1451";
      int a = 2016;
      try {
          Integer i1 = Integer.valueOf(arr[0][0]);
          Integer i2 = Integer.valueOf(arr[1][0]);
          Integer i3 = Integer.valueOf(arr[2][0]);

          System.out.println(arr[0][1] + " - " + (a - i1));
          System.out.println(arr[1][1] + " - " + (a - i2));
          System.out.println(arr[2][1] + " - " + (a - i3));
      } catch (NumberFormatException e) {
          System.err.println("Неверный формат строки!");
      }*/

      String searchMe = "peter piper picked a " +
              "peck of pickled peppers";
      int max = searchMe.length();
      int numPs = 0;


      for (int i = 0; i < max; i++) {
          // interested only in p's
          if (searchMe.charAt(i) != 'p')
              continue;


          // process p's
          numPs++;
      }
      System.out.println(numPs);
  }}










