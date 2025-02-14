package az.ingress.lesson14;

public class Car {

    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;
    public Person owner;

    public void go(int newDistance) {
        distance += newDistance;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", speed=" + speed +
                ", distance=" + distance +
//                ", owner=" + owner +
                '}';
    }

}
