package stanislavvyshnevskyy.app.classwork.lesson15;

/**
 * Created by Коти on 19.11.2016.
 */
public class Pixel {
    private int x;

    private int y;

    public Pixel(int x, int y){

        this.x = x;

        this.y = y;

    }

    public int[] getCoordinates(){

        int[] res = {x,y};

        return res;

    }

}
