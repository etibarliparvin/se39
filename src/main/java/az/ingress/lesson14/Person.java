package az.ingress.lesson14;

public class Person {

    public String pin;
    public String name;
    public String surname;
    public Car vehicle;

    @Override
    public String toString() {
        return "Person{" +
                "pin='" + pin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }

}
