package stanislavvyshnevskyy.app.classwork.lesson15;

/**
 * Created by Коти on 19.11.2016.
 */
public class Student extends Person{ //class name

    private String university; //variable

    public Student(String name, String university){ // constructor

        super(name); // call parent (super) class constructor

        this.university = university; // extend with new properties

    }

    public String getResponse(String question){ // method

        return "Ehhh, what was the question?";

    }

}
