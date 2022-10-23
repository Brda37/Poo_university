package Herencia.Transport;

public class motorcycle extends conveyance{
    private String placa;
    private float value;
    public motorcycle(String brand, String model, int displacement, String color, String placa, float value) {
        super(brand, model, displacement, color);
        this.placa = placa;
        this.value = value;
    }
    public void showMotorcycle(){
        System.out.println("Marca: " + getBrand() + "\nModelo: " + getModel() + "\nCilindraje: " + getDisplacement() 
        + "\nColor: " + getColor() + "\nPlaca" + placa + "\nValor: " + value);
    }
}
