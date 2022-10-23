package Herencia.Transport;

public class main {
    public static void main(String[] args) {
        car showCar = new car("Mazda", "XS", 0, "Negro", "AVC123", 2);
        motorcycle showMotor = new motorcycle("\nYamaha", "Z200", 9200, "Azul", "FEW789", 3400000);
        showCar.showCar();
        showMotor.showMotorcycle();
    }
}
