package az.ingress.lesson16;

public class Main {

    public static void main(String[] args) {

//        Customer parvin = new Customer(1, "Parvin");
//        CreditCard leo = new CreditCard("876", 2000);
//        leo.setOwner(parvin);
//        parvin.setCc(leo);
//        System.out.println(parvin);

        // Alternative
//        Customer narmin = new Customer(2, "Narmin");
//        CreditCard ziraat = new CreditCard("2", 3000, narmin);
//        System.out.println(narmin);

//        Bey ramazan = new Bey(1, "Ramazan");
//        Gelin fatma = new Gelin(5, "Fatma", ramazan);

        Bey one = new Bey(1, "Ali");
        Bey two = one;
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(one == two);
    }
}
