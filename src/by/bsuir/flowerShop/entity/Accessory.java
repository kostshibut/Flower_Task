package by.bsuir.flowerShop.entity;



public class Accessory {
    private String name;
    private double cost;

    public Accessory(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Accessory: " + name + ", Cost: " + cost;
    }
}
