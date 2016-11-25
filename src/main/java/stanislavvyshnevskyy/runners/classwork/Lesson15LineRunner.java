package stanislavvyshnevskyy.runners.classwork;

import stanislavvyshnevskyy.app.classwork.lesson15.Line;
import stanislavvyshnevskyy.app.classwork.lesson15.Pixel;

/**
 * Created by Коти on 19.11.2016.
 */
public class Lesson15LineRunner {
    public static void main(String[] args) {
        Pixel a = new Pixel(1,0);
        Pixel b = new Pixel(1,3);
        Pixel c = new Pixel(2,3);
        Pixel d = new Pixel(2,4);
        Pixel e = new Pixel(3,5);

        Line line = new Line(a,b);

        line.add(c);

        line.add(d);

        line.add(e);

    }
}
