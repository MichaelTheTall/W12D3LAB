package Shop;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Dealer dealer;
    private Till till;
    private String name;
    private ArrayList<Vehicle> stock;

    public Dealership(Dealer dealer,Till till, String name) {
        this.dealer = dealer;
        this.till = till;
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addStock(Vehicle vehicle) {
        stock.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        if(customer.getWallet() >= vehicle.getPrice()) {
            customer.pay(vehicle.getPrice());
            stock.remove(vehicle);
            till.addMoney(vehicle.getPrice());
        }
    }

    public void clearStock() {
        stock.clear();
    }

    public double getTill() {
        return till.getMoney();
    }

}
