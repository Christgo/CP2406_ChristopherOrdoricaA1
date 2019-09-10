public class Car {
    public int carLength;
    public int carPosition;
    public int carRoad;

    public Car(int carLength) {
        this.carLength = carLength;
        int carPosition = 0;
        int carRoad = 0;
    }

    public void setCarPosition(int carPosition) {
        this.carPosition = carPosition;
    }
    public void setCarLength(int carLength) {
        this.carLength = carLength;
    }

    public int getCarLength() {
        return carLength;
    }
    public int getCarPosition() {
        return carPosition;
    }
}
