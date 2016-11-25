package stanislavvyshnevskyy.app.homework.lesson15_16;

/**
 * Created by Коти on 25.11.2016.
 */
public abstract class Bicycle {
    public void ride(){
        System.out.println("Wroom!");
    }
     public abstract void setSpeed(int speed);
     public abstract void setGear(int gear);
}
