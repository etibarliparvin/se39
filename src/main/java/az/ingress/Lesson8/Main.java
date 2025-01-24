package az.ingress.Lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        for(int i = 1; i <= 15; i++) {
//            if(i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        OUTER:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j == 5 && i == 2) {
//                    break OUTER;
//                }
//                System.out.println(i + " : " + j);
//            }
//            System.out.println("-------------------------------");
//        }
//
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        switch (name) {
//            case "Monday":
//                System.out.println("Go to work");
//                break;
//            case "Tuesday":
//                System.out.println("Pat the dog");
//                break;
//            case "Wednesday":
//                System.out.println("Buy ticket for football match");
//                break;
//            case "Thursday":
//                System.out.println("Visit grandma");
//                break;
//            case "Friday":
//                System.out.println("Go to the police station");
//                break;
//            case "Saturday":
//                System.out.println("Play football");
//                break;
//            case "Sunday":
//                System.out.println("Pub time");
//                break;
//            default:
//                System.out.println("N/A");
//                break;
//        }
//
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        switch (name) {
//            case "Monday" -> System.out.println("Go to work");
//            case "Tuesday" -> System.out.println("Pat the dog");
//            case "Wednesday" -> System.out.println("Buy ticked for football match");
//            case "Thursday" -> System.out.println("Visit grandma");
//            case "Friday" -> System.out.println("Go to the police station");
//            case "Saturday" -> System.out.println("Play football");
//            case "Sunday" -> System.out.println("Pub time");
//            default -> System.out.println("N/A");
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter length of array: ");
//        int n = in.nextInt();
//        int[] array1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Please enter: " + i + " element of array:");
//            int value = in.nextInt();
//            array1[i] = value;
//        }
//
//        System.out.println("My array looks: ");
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
//
//        int[] array1 = new int[10];
//        Integer array2[] = new Integer[10];
//        int[] array3 = {1, 2, 3, 4};
//
//        double[] numbers = {1.2, 3.9, 4.1};
//
//        int[] abc = {1, 2, 3, 4, 5};
//        for (int i = 0; i < abc.length; i++) {
//            System.out.println(abc[i]);
//        }
//        for (int i: abc) {
//            System.out.println(i);
//        }
//
//        int[][] abc = new int[3][4];
//        abc[0][0] = 5;
//        abc[0][1] = 7;
//        abc[0][2] = 71;
//        abc[0][3] = 9;
//        abc[1][0] = 1;
//        abc[1][1] = 19;
//        abc[1][2] = 3;
//        abc[1][3] = 4;
//        abc[2][0] = 8;
//        abc[2][1] = 66;
//        abc[2][2] = 11;
//        abc[2][3] = 0;
//
//        for (int i = 0; i < abc.length; i++) { // 3
//            for(int j = 0; j < abc[i].length; j++) {
//                System.out.print(abc[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] abc = {
//                {1, 5, 7},
//                {8, 0, 2, 9},
//                {3},
//                {7, 19, 2, 4, 16}
//        };
//
//        int[][] abc = {
//                {5, 7, 71, 9},
//                {1, 19, 3, 4},
//                {8, 66, 11, 0},
//                {2, 13, 90, 14}
//        };
//
//        int sum = 0;
//        for (int i = 0; i < abc.length; i++) {
//            for (int j = 0; j < abc[i].length; j++) {
//                if (i == j) {
//                    sum += abc[i][j];
//                }
//            }
//        }
//        for (int i = 0; i < abc.length; i++) {
//            sum += abc[i][i];
//        }
//        System.out.println(sum);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter length of an array");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number:");
            int number = in.nextInt();
            arr[i] = number;
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

//        int x = 0;
//        for (int i = 100; i < 110; i++) {
//            arr[x] = 5;
//            x++;
//        }

    }
}

