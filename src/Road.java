public class Road {
    public int roadLength;

    public Road(int roadLength) {
        this.roadLength = roadLength * 6; // to represent how a road is *6 length of bus
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }
}
