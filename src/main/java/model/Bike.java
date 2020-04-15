package model;

public abstract class Bike {
    private String type;
    private String brand;
    private int weight;
    private boolean lights;
    private String color;
    private int price;

    public abstract String getInfo();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String isLights() {
        if (!lights) {
            return " no ";
        }
        return " ";
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", lights=" + lights +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
