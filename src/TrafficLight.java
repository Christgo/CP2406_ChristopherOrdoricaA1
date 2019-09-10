import java.util.Random;

public class TrafficLight {
    public boolean isGreen = true;
    public Random random = new Random();

    void changeLight() {
        int num = random.nextInt(10);
        this.isGreen = num > 5;
    }
}

//randomly changed true/false value of particulat road segment?