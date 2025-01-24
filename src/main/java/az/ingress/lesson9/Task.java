package az.ingress.lesson9;

import java.util.Random;

public class Task {
    public static void main(String[] args) {
        int[] people = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < people.length; i++) {
            int age = random.nextInt(101);
            people[i] = age;
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
