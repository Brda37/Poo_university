package Poliformismo;

public class vehiculoFurgoneta extends vehiculo {
    private int carga;

    public vehiculoFurgoneta(String matriculate, String bread, String model, int carga) {
        super(matriculate, bread, model);
        this.carga = carga;
    }
    public int getCilindraje() {
        return carga;
    }
    
    @Override
    public String showDates(){
        return "Matricula: " + matriculate + "\nMarca: " + bread + "\nModelo: " + model + "\nCarga: " + carga; 
    }
}
