package Salary;

/**
 * Created by Sergii_Vasiuta on 26.12.2016.
 */
public class Director extends Employee {

     int sal;

    public Director(String name, int sal) {
        super (name, "director");
        this.sal = sal;
    }

       @Override
    public void monthSalary() {
System.out.println(sal);
    }

    @Override
    public void yearSalary() {
        System.out.println(sal * 12);

    }

    @Override
    public void displayInfo() {
        System.out.println( name + " " + position);
    }


}
