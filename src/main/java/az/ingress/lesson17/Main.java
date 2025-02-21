package az.ingress.lesson17;

public class Main {

    public static void main(String[] args) throws Exception {

//        int i = 5; // Primitive datatype
//        Integer ii = new Integer(i); // Boxing - Wrapping
//        int j = ii.intValue(); // Unboxing - Unwrapping
//        Integer value = i; // Autoboxing - Autowrapping
//        int k = value; // Autounboxing - Autounwrapping

//        Integer i1 = 5;
//        Integer i2 = 5;
//        Integer i3 = new Integer(5);
//        Integer i4 = new Integer(5);
//
//        System.out.println(5 == i1); // true
//        System.out.println(i1 == i2); // true
//        System.out.println(i1 == i3); // false
//        System.out.println(i3 == i4);
//        System.out.println(i3 == 5);

        Integer i1 = 5;
        Integer i2 = 5;
        Integer i3 = 400;
        Integer i4 = 400;
        Integer i5 = new Integer(5);
        Integer i6 = new Integer(5);
        Integer i7 = new Integer(400);

        System.out.println(i1 == i2); // true
        System.out.println(i3 == i4); // false
        System.out.println(i3 == i7); // false
        System.out.println(i1 == i5); //
        System.out.println(i5 == i6);
        System.out.println(i1 == 5);
        System.out.println(i3 == 400);
        System.out.println(i5 == 5);
        System.out.println(i7 == 400);

    }

}
