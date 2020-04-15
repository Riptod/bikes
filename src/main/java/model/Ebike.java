package model;

public class Ebike extends Bike {
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
    public String toString() {
        return "Ebike{" +
                super.toString() +
                "maxSpeed=" + maxSpeed +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getType() + " " + super.getBrand() + " with " + getBatteryCapacity()
                + " mAh battery and" + super.isLights() + "head/tail light."
                + "\n Price: " + super.getPrice();
    }
}
