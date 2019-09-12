public class Car {
    public int carLength;
    public int carPosition;
    public int carRoad;

    public Car(int carLength) {
        this.carLength = carLength;
        int carPosition = 0;
        int carRoad = 0;
    }

    public int getCarLength() {
        return carLength;
    }

    public void setCarLength(int carLength) {
        this.carLength = carLength;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public void setCarPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    public int getCarRoad() {
        return carRoad;
    }

    public void setCarRoad(int carRoad) {
        this.carRoad = carRoad;
    }
}
