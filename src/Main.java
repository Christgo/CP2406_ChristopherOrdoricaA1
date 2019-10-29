import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JInterface());
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How long is a car");
//        int carLength = scanner.nextInt();
        int carLength = 1;
        TrafficLight trafficLight = new TrafficLight();
        Car car = new Car(carLength);
        Road road1 = new Road(5, 0);
        Road road2 = new Road(5, 1);
        Road[] roadArray = new Road[2]; //TODO link roads to carPosition
        roadArray[0] = road1;
        roadArray[1] = road2;

        for (int i = -1; i < 5; i++) {
            car.carPosition = i; //TODO fix car starting at -1
            System.out.println("Road: " + car.carRoad + "| Road Position:" + car.carPosition);
            trafficLight.changeLight();
            if (car.carPosition == 4 && trafficLight.isGreen) {
                car.carRoad++; //could be used to track array?
                i = -1;
            }
            else
                if (car.carPosition == 4)
                    i = 3;
            if (car.carRoad > 1)
                break;
        }
    }
}
