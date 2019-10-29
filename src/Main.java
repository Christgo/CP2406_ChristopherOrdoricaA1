import javax.swing.*;
import java.awt.*;

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
//        int vehicleLength = scanner.nextInt();
        int vehicleLength = 1;
        TrafficLight trafficLight = new TrafficLight();
        Car car = new Car(vehicleLength);
        Road road1 = new Road(5, 0);
        Road road2 = new Road(5, 1);
        Road[] roadArray = new Road[2]; //TODO link roads to carPosition
        roadArray[0] = road1;
        roadArray[1] = road2;

        for (int i = 0; i < 6; i++) {
            car.position = i; //TODO fix car starting at -1
            System.out.println("Road: " + car.road + "| Road Position:" + car.position);
            trafficLight.changeLight();
            if (car.position == 4 && trafficLight.isGreen) {
                car.road++; //could be used to track array?
                i = -1;
            }
            else
                if (car.position == 4)
                    i = 3;
            if (car.road > 1)
                break;
        }
    }
}
