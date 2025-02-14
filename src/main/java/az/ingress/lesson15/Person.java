package az.ingress.lesson15;

public class Person {

    public int height;

    public Person(int height) {
        this.height = height;
    }

    public Person grow() {
        height++;
        return new Person(height);
    }

}
