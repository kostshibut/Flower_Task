package by.bsuir.flowerShop.entity;


public class CutFlower extends AbstractFlower {

    private int freshness;

    public CutFlower(String name, String color, int height, int freshness, double cost) {
        super(name, color, height, cost);
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness){
        this.freshness = freshness;
    }

    @Override
    public String toString(){
        return "Cut flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight() +
                ", Freshness: " + getFreshness();
    }
}
