package az.ingress.lesson12;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Cake chocolate = new Cake();
//        chocolate.name = "Chocolate Cake";
//        chocolate.ingredients = "flour, milk, sugar, egg, chocolate";
//        chocolate.cost = 5;
//        chocolate.size = 20;
//        Cake.count = 7;
//        System.out.println(chocolate.count);
//
//        Cake bounty = new Cake();
//        bounty.name = "Bounty Cake";
//        bounty.ingredients = "flour, milk, sugar, coconut, egg";
//        bounty.cost = 10;
//        bounty.size = 15;
//        System.out.println(bounty.count);
//
//        Student abc = null;
//        abc.name = "alibaba";
//
//        System.out.println(abc.name);
//
//        abc.gender = "male";
//        System.out.println(abc.gender);

//        Test abc = new Test();
//        abc.age = 1;
//        Test.year = 1;
//
//        Test klm = new Test();
//        klm.age = 2;
//        Test.year = 2;
//
//        System.out.println(abc.age);
//        System.out.println(abc.year);
//        System.out.println("-------------------");
//        System.out.println(klm.age);
//        System.out.println(klm.year);
//        System.out.println("-------------------");
//        System.out.println(Test.year);
//
//        klm = abc;
//
//        System.out.println(klm.age);
//        System.out.println(klm.age);
//        System.out.println("-----------------------------------------------");
//        System.out.println(klm.year);
//        System.out.println(klm.year);

//        Cake one = new Cake();
//        one.name = "Napoleon";
//
//        Cake two = one;
//        System.out.println(one.name);
//        System.out.println(two.name);
//        two.name = "Fruit";
//        System.out.println(one.name);

//        Student abc = new Student(); // 1234
//        abc.gender = "male";
//        System.out.println(abc.hashCode());
//        abc = new Student(); // 1235
//        System.out.println(abc.hashCode());

//        int i = 5;
//        System.out.println(i);
//        foo(i);
//        System.out.println(i);
//
//        Student one = new Student();
//        one.gender = "male";
//        System.out.println(one.gender);
//        foo2(one);
//        System.out.println(one.gender);
//
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[0]);
//        foo3(arr);
//        System.out.println(arr[0]);
        Student abc = new Student();
        abc.gender  = "male";
        abc.age = 20;
        System.out.println(abc);
        foo2(abc);
        System.out.println(abc);

    }

//    public static void foo(int a) {
//        a++;
//    }

    public static void foo2(Student xyz) {
        xyz.gender = "female";
        xyz.age = 30;
    }

//    public static void foo3(int[] arr) {
//        arr[0] = arr[0] + 15;
//    }
}
