package Poliformismo;

public class vehiculoDeportivo extends vehiculo{
    private int cilindraje;

    public vehiculoDeportivo(String matriculate, String bread, String model, int cilindraje) {
        super(matriculate, bread, model);
        this.cilindraje = cilindraje;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    
    @Override 
    public String showDates(){
        return "Matricula: " + matriculate + "\nMarca: " + bread + "\nModelo: " + model + "\nCilindraje: " + cilindraje; 
    }
}
