package az.ingress;

public class Main {
    public static void main(String[] args) {
//        foo(5);
//        int result = 1;
//        for (int i = 1; i <= 5; i++) {
//            result *= i; // 120
//        }
//        System.out.println(result);
        System.out.println(recursion(3));
    }

//    public static void foo(int i, int... args) {
//        System.out.println(i);
//        System.out.println(args);
//    }
//
//
////    public static double average(double... arr) {
////        double sum = 0;
////        for(int i = 0; i < arr.length; i++) {
////            sum += arr[i];
////        }
////        return sum / arr.length;
////    }
//
//    public static int foo1(int i) {
//        return foo2(i, 5);
//    }
//
//    public static int foo2(int i, int j) {
//        return foo3(i, j, 7);
//    }
//
//    public static int foo3(int i, int j, int k) {
//        return i + j + k;
//    }
//
//    public static void foo1(int n) { // 4
//        System.out.println(n);
//        foo2(n - 1);
//    }
//
//    public static void foo2(int n) { // 3
//        System.out.println(n);
//        foo3(n - 1);
//    }
//
//    public static void foo3(int n) { // 2
//        System.out.println(n);
//        foo4(n - 1);
//    }
//
//    public static void foo4(int n) { // 1
//        System.out.println(n);
//    }
//
//    public static void foo(int n) {
//        if(n == 0) {
//            return;
//        }
//        System.out.println(n);
//        foo(n - 1);
//    }

    public static int recursion(int n) {
        if (n == 0) {
            return 1;
        }
        int result = n;
        int next = recursion(n - 1);
        result *= next;
        return result;
    }

}