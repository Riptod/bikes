package model;

public class SpeedelecBike extends Bike {

    private int maxSpeed;
    private int batteryCapacity;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getInfo() {
        return getType() + " " + getBrand() + " with " + getBatteryCapacity()
                + " mAh battery and" + isLights() + "head/tail light."
                + "\n Price: " + getPrice();
    }

    @Override
    public String toString() {
        return "Speedelec{Brand= " + super.getBrand()
                + ", maxSpeed= " + maxSpeed
                + ", weight= " + super.getWeight()
                + ", availability of lights at front and bac:" + super.isLights()
                + ", battery capacity = " + batteryCapacity
                + ", color= " + super.getColor()
                + ", price= " + super.getPrice() + '}';
    }
}
