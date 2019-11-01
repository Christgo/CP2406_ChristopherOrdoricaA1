import java.util.Random;

public class TrafficLight {
    boolean isGreen = true;
    private Random random = new Random();

    void changeLight() {
        int num = random.nextInt(10);
        this.isGreen = num > 5;
    }

    boolean getIsGreen() {
        return isGreen;
    }

    void setGreen(boolean green) { //method assists in testing
        isGreen = green;
    }
}
