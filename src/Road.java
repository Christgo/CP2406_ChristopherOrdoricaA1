public class Road {
    public int roadLength;
    public int roadNumber;


    public Road(int roadLength, int roadNumber) {
        this.roadLength = roadLength * 3 * 2; // cannot be larger that vehicleLength * 5 or less than vehicleLength * 2
        this.roadNumber = roadNumber;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(int roadLength) {
        if (roadLength > this.roadLength/2*5) { //TODO: streamline so that it can use a different variable
            this.roadLength = this.roadLength/2*5;
            System.out.println("road length cannot exceed bus length * 5");
        } else if (roadLength < this.roadLength) {
            System.out.println("road length must be minimum of bus length * 2");
        } else
            this.roadLength = roadLength;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }
}
