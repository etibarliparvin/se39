package az.ingress.lesson16;

public class CreditCard {

    public String no;
    public double balance;

    public Customer owner;

    public CreditCard(String no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    public CreditCard(String no, double balance, Customer owner) {
        this.no = no;
        this.balance = balance;
        this.owner = owner;
        owner.setCc(this);
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "no='" + no + '\'' +
                ", balance=" + balance +
                '}';
    }

}
