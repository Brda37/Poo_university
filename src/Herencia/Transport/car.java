package Herencia.Transport;

public class car extends conveyance{
    
    private String placa;
    private int doors;
    public car(String brand, String model, int displacement, String color, String placa, int doors) {
        super(brand, model, displacement, color);
        this.placa = placa;
        this.doors = doors;
    }
    public void showCar(){
        System.out.println("Marca: " + getBrand() + "\nModelo: " + getModel() + "\nCilindraje: " + getDisplacement() 
        + "\nColor: " + getColor() + "\nPlaca" + placa + "\nPuertas: " + doors);
    }
}
