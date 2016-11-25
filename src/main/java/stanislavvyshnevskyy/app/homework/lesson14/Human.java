package stanislavvyshnevskyy.app.homework.lesson14;

/**
 * Created by Коти on 25.11.2016.
 */
public class Human {
    private int age;
    private String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if ((age>0)&&(age<121)){
            this.age = age;
            System.out.println("New age setted");
        } else {
            System.out.println("Age is invalid");
        }
    }
}
