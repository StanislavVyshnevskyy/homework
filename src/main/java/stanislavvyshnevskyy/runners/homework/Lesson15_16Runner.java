package stanislavvyshnevskyy.runners.homework;

import stanislavvyshnevskyy.app.homework.lesson15_16.*;

/**
 * Created by Коти on 25.11.2016.
 */
public class Lesson15_16Runner {
    public static void main(String[] args) {
        /*Вызвать метод ring() из обьекта класса BicycleWithRing через референс типа BicycleWithRingInterface.
Вызвать методы setGear() и ride() из обьекта класса CustomBicycle через референс класса Bicycle. В классе CustomBicycle
метод ride() должен выводить на экран строку “Wshhhh!”.
*/
        BicycleWithRingInterface myBicycleWithRing = new BicycleWithRing();
        myBicycleWithRing.ring();
        Bicycle myBicycle = new CustomBicycle();
        myBicycle.ride();
        myBicycle.setGear(15);
        myBicycle.setSpeed(20);
    }
}
