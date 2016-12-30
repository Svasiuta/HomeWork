package Salary;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Sergii_Vasiuta on 26.12.2016.
 */
public class Accountant {
//    Иванова Елена Львовна, зам директора, оклад 4500грн
//    Вакуленко Дмитрий Владимирович, дизайнер, 7$ в час
//    Коренькова Анна Павловна, менеджер по продажам (получает 5% от продаж, первые полгода касса составляла 50000грн, вторые полгода - 65000грн в месяц)
//    Татьяна Сергеевна, менеджер по продажам
    static List < Employee> employees = new ArrayList<>();



    public static void main(String[] args) {


        Director e1 = new Director("Иванова_Елена_Львовна",4500);
        Designer e2 = new Designer("Вакуленко_Дмитрий_Владимирович", 7);
        ManagerWithRate e3 = new ManagerWithRate("Коренькова_Анна_Павловна", 5);
        ManagerWithoutRate e4 = new ManagerWithoutRate("Татьяна_Сергеевна", 3);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        for (Employee e: employees) {
            e.displayInfo();
            e.monthSalary();
        }
    }
}

