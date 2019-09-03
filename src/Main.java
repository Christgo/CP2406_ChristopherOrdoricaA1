import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        user input - how long is a car
//        int carLength = scanner.nextInt();
        int carLength = 1;
        int carPosition = 1;
        Car car = new Car(carLength);
        Road road = new Road(carLength);
        TrafficLight trafficLight = new TrafficLight();
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