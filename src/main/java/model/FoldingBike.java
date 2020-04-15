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
    public String toString() {
        return "FoldingBike{" +
                super.toString() +
                "sizeOfWheels=" + sizeOfWheels +
                ", gears=" + gears +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getType() + " " + super.getBrand() + " with " + getGears()
                + " gear(s) and" + super.isLights() + "head/tail light."
                + "\n Price: " + super.getPrice();
    }
}
