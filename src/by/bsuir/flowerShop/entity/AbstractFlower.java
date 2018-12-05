package by.bsuir.flowerShop.entity;


public abstract class AbstractFlower {
    private String name;
    private String color;
    private int height;
    private double cost;

    public AbstractFlower(String name, String color, int height, double cost){
        this.name = name;
        this.color = color;
        this.height = height;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
