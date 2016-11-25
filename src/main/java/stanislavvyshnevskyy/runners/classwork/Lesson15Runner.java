package stanislavvyshnevskyy.runners.classwork;

import stanislavvyshnevskyy.app.classwork.lesson15.Student;
import stanislavvyshnevskyy.app.classwork.lesson15.Teacher;

/**
 * Created by Коти on 19.11.2016.
 */
public class Lesson15Runner {
    public static void main(String[] args){

        Student student = new Student("Egor", "Kit Center");

                //student.setResponse("this is correct response");

        String response = student.getResponse("What is class?");

        System.out.println(response);

        Teacher teacher = new Teacher("Ivan", "Kit Center");

                teacher.getResponse("What is polymorphism?");

    }
}
