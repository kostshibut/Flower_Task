package by.bsuir.flowerShop.entity;

public class WildFlower extends AbstractFlower {

    private String soilType;
    private String growthPeriod;
    private String climateType;

    public WildFlower(String name, String color, String soilType, String floweringPeriod, String climateType,
                      int height, int freshness, double cost) {
        super(name, color, height, cost);
        this.soilType = soilType;
        this.growthPeriod = floweringPeriod;
        this.climateType = climateType;
    }

    public String getSoilType() {
        return soilType;
    }

    public String getFloweringPeriod() {
        return growthPeriod;
    }

    public String getClimateType() {
        return climateType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public void setFloweringPeriod(String floweringPeriod) {
        this.growthPeriod = floweringPeriod;
    }

    public void setClimateType(String climateType) {
        this.climateType = climateType;
    }

    @Override
    public String toString(){
        return "Garden flower. Name: " + getName() + ", Color: " + getColor() + ", Height: " + getHeight()
                + ", Soil type: " + soilType + ", Growth period: " + growthPeriod + ", Climate type: " + climateType;
    }
}
