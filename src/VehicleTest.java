import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VehicleTest {
    private final int LENGTH = 2;
    @Test
    void carClass() {
        Car car = new Car(LENGTH);
        Assertions.assertEquals(2, car.getLength());
        Assertions.assertEquals(0, car.getRoad());
        Assertions.assertEquals(0, car.getPosition());

        car.setRoad(2);
        car.setPosition(3);
        Assertions.assertEquals(2, car.road);
        Assertions.assertEquals(3, car.position);
    }

    @Test
    void busClass() {
        Bus bus = new Bus(LENGTH);
        Assertions.assertEquals(6, bus.getLength());
        Assertions.assertEquals(0, bus.getRoad());
        Assertions.assertEquals(0, bus.getPosition());

        bus.setRoad(2);
        bus.setPosition(3);
        Assertions.assertEquals(2, bus.road);
        Assertions.assertEquals(3, bus.position);
    }

    @Test
    void motorbikeClass() {
        Motorbike mBike = new Motorbike(LENGTH);
        Assertions.assertEquals(1, mBike.getLength());
        Assertions.assertEquals(0, mBike.getRoad());
        Assertions.assertEquals(0, mBike.getPosition());

        mBike.setRoad(2);
        mBike.setPosition(3);
        Assertions.assertEquals(2, mBike.road);
        Assertions.assertEquals(3, mBike.position);
    }
}