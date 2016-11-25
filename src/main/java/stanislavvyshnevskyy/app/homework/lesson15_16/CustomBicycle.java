package stanislavvyshnevskyy.app.homework.lesson15_16;

/**
 * Created by Коти on 25.11.2016.
 */
public class CustomBicycle extends Bicycle {
    private int speed;
    private int gear;

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("bicycle speed is -> "+speed);
    }

    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("bicycle gear is -> "+gear);
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
