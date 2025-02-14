package az.ingress.lesson14;

public class Main {

    public static void main(String[] args) {
//        int a = 5;
//        Animal abc = new Animal();
//        abc.clas = "Cat";
//        abc.weight = 5;
//        System.out.println(abc.hashCode());
//        System.out.println(abc.clas.hashCode());

//        Person ali = new Person();
//        ali.pin = "abc123";
//        ali.name = "Ali";
//        ali.surname = "Aliyev";
//
//        Car cadillac = new Car();
//        cadillac.make = "Cadillac";
//        cadillac.model = "escalade";
//        cadillac.year = "2023";
//        cadillac.speed = 100;
//        cadillac.distance = 20000;
//
//        cadillac.owner = ali;
//        ali.vehicle = cadillac;
//
//        System.out.println(ali);

        Bey ali = new Bey();
        ali.ad = "Ali";
        ali.yash = 25;

        Gelin sekine = new Gelin();
        sekine.ad = "Sekine";
        sekine.yash = 23;
        sekine.er = ali;
        ali.arvad = sekine;

        System.out.println(ali.hashCode()); // 123
        System.out.println(sekine.hashCode());
        System.out.println(ali.arvad.hashCode());
        System.out.println(sekine.er.hashCode()); // 123
    }
}
