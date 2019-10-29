public abstract class Vehicle {
    public int length;
    public int position;
    public int road;

    public Vehicle(int length) {
        this.length = length;
        this.position = 0;
        this.road = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }
}
