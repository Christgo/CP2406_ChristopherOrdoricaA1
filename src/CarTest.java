import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void basicTest() {
        Car car = new Car(1);
        assertEquals(1, car.carLength);
        assertEquals(0, car.carPosition);
        assertEquals(0, car.carRoad);

        car.setCarLength(2);
        car.setCarPosition(3);
        car.setCarRoad(2);
        assertEquals(2, car.getCarLength());
        assertEquals(3, car.getCarPosition());
        assertEquals(2, car.getCarRoad());
    }

}