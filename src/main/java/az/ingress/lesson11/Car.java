package az.ingress.lesson11;

public class Car {

    public String make;
    public String model;
    public int year;
    public int distance;

    public void printInfo() {
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
        System.out.println("distance: " + distance);
    }

    public String getInfo() {
        return  "make: " + make + ". model: " + model + ". year: " + year + ". distance: " + distance;
    }

    public String foo() {
        return getClass().getSimpleName() + "@: " + hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", distance=" + distance +
                '}';
    }

}
