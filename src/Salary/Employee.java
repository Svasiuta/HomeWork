package Salary;

/**
 * Created by Sergii_Vasiuta on 26.12.2016.
 */
public abstract class Employee {

    String name;
    String position;

    public Employee(String name, String position)
    {
        this.name = name;
        this.position = position;
    }

    public abstract void monthSalary();
    public abstract void yearSalary();

    public abstract void displayInfo( );
}

