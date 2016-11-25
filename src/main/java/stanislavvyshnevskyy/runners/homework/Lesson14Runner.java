package stanislavvyshnevskyy.runners.homework;

import stanislavvyshnevskyy.app.homework.lesson14.Human;
import stanislavvyshnevskyy.app.homework.lesson14.WhiteCollar;

/**
 * Created by Коти on 26.11.2016.
 */
public class Lesson14Runner {
    public static void main(String[] args) {
        Human human1 = new Human(19, "Andrey");
        Human human2 = new Human(21, "Inna");

        System.out.println(human2.getName());
        human1.setAge(130);
        human1.setAge(20);

        WhiteCollar employee = new WhiteCollar(25,"Andrey", "afdsfsdfgg");
        employee.setCompany("jhkjlk1");
        employee.setCompany("Company, AAA-aaa-a");
    }
}
