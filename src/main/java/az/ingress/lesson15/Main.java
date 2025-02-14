package az.ingress.lesson15;

public class Main {

    public static void main(String[] args) {
//        Tree apple = new Tree("Apple", 1.5F);
//        System.out.println(apple);
//
//        Tree peach = new Tree("Peach", 2F);
//        System.out.println(peach);
//
//        Tree oak = new Tree();
//        oak.type = "Amil";
//        oak.height = 1.85F;
//        System.out.println(oak);
//
//        Test a = new Test();
//        Test b = new Test();
//        new Test();
//        new Test();
//        new Test();
//        System.out.println(a.count);

//        ThisDemo xyz = new ThisDemo();
//        xyz.ali();

        Person one = new Person(5);
        System.out.println(one.height);
        System.out.println(one.hashCode());
        one = one.grow();
        System.out.println(one.height);
        System.out.println(one.hashCode());
//        System.out.println(two.height);
    }

}
