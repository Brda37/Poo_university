package Herencia.Transport;
public class conveyance{
    private String brand;
    private String model;
    private int displacement;
    private String color;
    public conveyance(String brand, String model, int displacement, String color) {
        this.brand = brand;
        this.model = model;
        this.displacement = displacement;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}