import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How long is a car");
//        int carLength = scanner.nextInt();
        int carLength = 1;
        TrafficLight trafficLight = new TrafficLight();
        Car car = new Car(carLength);
        Road road1 = new Road(5);
        Road road2 = new Road(5);
        Road[] roadArray = new Road[2];
        roadArray[0] = road1;
        roadArray[1] = road2;

        for (int i = -1; i < 5; i++) {
            car.carPosition = i;
            System.out.println(car.carPosition);
            if (car.carPosition == 4 && trafficLight.isGreen)
                //make car go to other road
                i = -1;
        }


    }
}

 /*
 car uses positions
 car pos = 0;
 road segment = 4 (5 segments - 0 -> 4)
 trafficLight @ road segment 5 (or 1)
 loop to move car (time not an issue, execute as fast as possible)
 need a way to track what road a car is on
 road may or may not have traffic light
 road may or may not have a car
  */

 /* have array of road objects
 boolean for whether or not car could move through
 last in gets an alternating true/false
  */