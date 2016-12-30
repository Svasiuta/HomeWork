package Salary;

/**
 * Created by Sergii_Vasiuta on 26.12.2016.
 */
public class ManagerWithoutRate extends Employee {

    int rate;

    public ManagerWithoutRate(String name, int rate ) {
        super(name, "Manager");
        this.rate =rate;

    }

    @Override
    public void monthSalary() {

    }

    @Override
    public void yearSalary() {

    }

    @Override
    public void displayInfo() {

    }
}
