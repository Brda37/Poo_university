package Poliformismo;

public class vehiculoTurismo extends vehiculo {
    private int nPuertas;

    public vehiculoTurismo(String matriculate, String bread, String model, int nPuertas) {
        super(matriculate, bread, model);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override 
    public String showDates(){
        return "Matricula: " + matriculate + "\nMarca: " + bread + "\nModelo: " + model + "\nNumero de pueras: " + nPuertas; 
    }
}
