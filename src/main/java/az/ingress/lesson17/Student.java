package az.ingress.lesson17;

public class Student {

    public String name;
    public String surname;

    {
        System.out.println("Salam");
        System.out.println("Necesen?");
        System.out.println("Sagol");
    }
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
