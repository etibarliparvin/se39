package az.ingress.lesson12;

public class Cake {

    public static int count;

    public String name;
    public String ingredients;
    public int size;
    public double cost;

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }

}
