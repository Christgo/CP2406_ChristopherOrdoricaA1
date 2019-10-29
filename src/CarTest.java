import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void basicTest() {
        Car car = new Car(1);
        assertEquals(1, car.length);
        assertEquals(0, car.position);
        assertEquals(0, car.road);

        car.setLength(2);
        car.setPosition(3);
        car.setRoad(2);
        assertEquals(2, car.getLength());
        assertEquals(3, car.getPosition());
        assertEquals(2, car.getRoad());
    }

}