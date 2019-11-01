abstract class Vehicle {
    int length;
    int position;
    int road;

    Vehicle(int length) {
        this.length = length;
        this.position = 0;
        this.road = 0;
    }

    int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    int getRoad() {
        return road;
    }

    void setRoad(int road) {
        this.road = road;
    }
}
