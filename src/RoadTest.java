import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    @Test
    void basicTest() {
        Road road = new Road(5, 0);
        assertEquals(5, road.roadLength);
        assertEquals(0, road.roadNumber);

        road.setRoadLength(4);
        road.setRoadNumber(1);
        assertEquals(4, road.getRoadLength());
        assertEquals(1, road.getRoadNumber());
    }

}