package az.ingress;

public class Main {
    public static void main(String[] args) throws Exception {
//        int a = 10;
//        ++a; // preincrement
//        a++; // postincrement
//        System.out.println(a);
//        int a = 10;
//        System.out.println(a++);
//        System.out.println(++a);
//
//        System.out.println("Normal behaviour");
//        int i = 0;
//        i = ++i;
////        i = i + 1;
//        System.out.println(i);
//        i = ++i + 2;
//        System.out.println(i);

//        System.out.println("Weird behaviour");
//        int i = 0;
//        i = i++;
//        System.out.println(i);
//        i = i++ + 2;
//        System.out.println(i);
//
//        System.out.println("Normal behaviour too");
//        int i = 0;
//        int j = ++i;
//        System.out.println(i);
//        System.out.println(j);
//
//        if((abc() == 1) | xyz() == 2) {
//            System.out.println("done");
//        }
//
//        int a = 10;
//        System.out.println(a << 1);
//        int a = 5;
//        int b = 3;
//        a = a + b; // a = 8;
//        b = a - b; // 5
//        a = a - b; // 3
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("Process started...");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if(number > 0) {
//            System.out.println("This is positive number");
//        } else {
//            System.out.println("This is negative number");
//        }
//        System.out.println("Process ended...");
//
//        System.out.println("Started...");
//        Scanner in = new Scanner(System.in);
//        int money = 40;
//        if(money > 30) {
//            System.out.println("buy meat");
//        }
//        if(money > 40) {
//            System.out.println("buy ...");
//        }
//        System.out.println("Ended...");
//
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        if(name.equals("java")) {
//            System.out.println("one");
//        } else if(name.equals("python")) {
//            System.out.println("two");
//        } else {
//            System.out.println("three");
//        }
//
//        Scanner in = new Scanner(System.in);
//        int grade = in.nextInt();
//        if(grade > 100 || grade < 0) {
//            System.out.println("n/a");
//        } else if(grade > 90) {
//            System.out.println("A");
//        } else if (grade > 80) {
//            System.out.println("B");
//        } else {
//            System.out.println("Fail");
//        }
//
//        System.out.println("Continue...");
//
//        Random random = new Random();
//        int grade = random.nextInt(100);
//        System.out.println(grade);
//        if (grade > 90) {
//            System.out.println(grade + " A");
//        } else if (grade > 80) {
//            System.out.println(grade + " B");
//        } else if (grade > 70) {
//            System.out.println(grade + " C");
//        } else if (grade > 60) {
//            System.out.println(grade + " D");
//        } else if (grade > 50) {
//            System.out.println(grade + " F");
//        } else {
//            System.out.println(grade + " Failed");
//        }
//
//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();
//        if (i < 3) {
//            int ii = 10;
//        } else {
//            int ii = 10;
//        }
//        System.out.println(ii);
//        int i = 2;
//        if (i < 3)
//            int ii = 10;
//
//
//        int i = 10;
//        while (i > 0) {
//            System.out.println("i: " + i);
//            i--;
//        }
//
//        double d = Math.random();
//        System.out.println(d);
//
//        while (d < 0.98) {
//            Thread.sleep(3000);
//            d = Math.random();
//            System.out.println("inside while: " + d);
//        }
//
//        System.out.println("Outside while: " + d);
//
//        String randomWord = RandomStringUtils.randomAlphabetic(10);
//        System.out.println(randomWord);
//        while (randomWord.length() > 6) {
//            randomWord = RandomStringUtils.randomAlphabetic(3, 10);
//            System.out.println(randomWord);
//        int i = 10;
//        do {
//            System.out.println("salam: " + i);
//            i--;
//        } while (i < 0);
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < 15; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("salam");
            System.out.println(i);
            System.out.println("salam");
        }
    }

//    public static int abc() {
//        System.out.println("abc is called");
//        return 1;
//    }
//
//    public static int xyz() {
//        System.out.println("xyz is called");
//        return 2;
//    }

}