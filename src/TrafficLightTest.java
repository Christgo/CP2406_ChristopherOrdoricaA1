import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    @Test
    void basicTest()  {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setGreen(false);
        assertFalse(trafficLight.getIsGreen());
    }

}