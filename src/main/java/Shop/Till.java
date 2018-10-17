package Shop;

public class Till {

    private double money;

    public Till(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
    }
}
