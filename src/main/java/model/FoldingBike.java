package model;

public class FoldingBike extends Bike{

    private int sizeOfWheels;
    private int gears;

    public int getSizeOfWheels() {
        return sizeOfWheels;
    }

    public void setSizeOfWheels(int sizeOfWheels) {
        this.sizeOfWheels = sizeOfWheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String getInfo() {
        return getType() + " " + getBrand() + " with " + getGears()
                + " gear(s) and" + isLights() + "head/tail light."
                + "\n Price: " + getPrice();
    }

    @Override
    public String toString() {
        return "FoldingBike{Brand= " + super.getBrand()
                + ", sizeOfWheels= " + sizeOfWheels
                + ", gears= " + gears
                + ", weight= " + super.getWeight()
                + ", availability of lights at front and bac:" + super.isLights()
                + ", color= " + super.getColor()
                + ", price= " + super.getPrice() + '}';
    }
}
