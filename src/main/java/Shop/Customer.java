package Shop;

public class Customer {

    private String name;
    private double wallet;

    public Customer(double wallet, String name){
        this.wallet = wallet;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void pay(double money) {
        this.wallet -= money;
    }

}
