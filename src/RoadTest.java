import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    @Test
    void basicTest() {
        Road road = new Road(2, 0); // default vehicleLength is 2
        assertEquals(12, road.roadLength);
        assertEquals(0, road.roadNumber);

        road.setRoadLength(11);
        assertEquals(12, road.getRoadLength());
        road.setRoadLength(12);
        assertEquals(12, road.getRoadLength());
        road.setRoadLength(13);
        assertEquals(13, road.getRoadLength());
        road.setRoadLength(31);
        assertEquals(30, road.getRoadLength());
        road.setRoadNumber(1);
        assertEquals(1, road.getRoadNumber());
    }

}