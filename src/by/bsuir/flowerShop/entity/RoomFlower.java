package by.bsuir.flowerShop.entity;


public class RoomFlower extends AbstractFlower {

    private String potColor;
    private String potMaterial;
    private String soilType;

    public RoomFlower(String name, String color, String potColor, String potMaterial, String soilType,
                      int height, int freshness, double cost) {
        super(name, color, height, cost);
        this.potColor = potColor;
        this.potMaterial = potMaterial;
        this.soilType = soilType;

    }

    public String getPotColor() {
        return potColor;
    }

    public String getPotMaterial() {
        return potMaterial;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setPotColor(String potColor) {
        this.potColor = potColor;
    }

    public void setPotMaterial(String potMaterial) {
        this.potMaterial = potMaterial;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    @Override
    public String toString(){
        return "Room flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Pot's color:  " + potColor + ", Pot's material:  " + potMaterial + ", Soil type:  " + soilType;
    }
}
