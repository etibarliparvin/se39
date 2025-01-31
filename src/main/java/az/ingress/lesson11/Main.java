package az.ingress.lesson11;

public class Main {
    public static void main(String[] args) {

//        Student abc = new Student();
//        abc.name = "Murad";
//        abc.surname = "Muradov";
//        abc.age = 20;
//        abc.readBook();
//        System.out.println(abc);
//
//        Student klm = new Student();
//        klm.name = "Amil";
//        klm.surname = "Amilov";
//        klm.age = 22;
//        klm.readBook();
//        System.out.println(klm);
        // Student -> type(reference type)
        // abc -> variable, reference
        // new Student(); -> object
//
//        Cake napoleon = new Cake();
//        napoleon.name = "Napoleon";
//        napoleon.size = 30;
//        napoleon.ingredients = new String[]{"milk", "egg", "banana"};
//
//        Cake cheese = new Cake();
//        cheese.name = "Cheese cake";
//        cheese.size = 5;
//        cheese.ingredients = new String[]{"milk", "sugar", "peach"};

        Car kia = new Car();
        kia.make = "KIA";
        kia.model = "Sportage";
        kia.distance = 0;
        kia.year = 2025;
        System.out.println(kia);
//        System.out.println(kia.foo());
//        kia.printInfo();
//        System.out.println(kia.getInfo());
    }
}