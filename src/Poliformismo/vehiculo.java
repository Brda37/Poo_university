package Poliformismo;

public class vehiculo {
    protected String matriculate;
    protected String bread;
    protected String model;

    public vehiculo(String matriculate, String bread, String model) {
        this.matriculate = matriculate;
        this.bread = bread;
        this.model = model;
    }

    public String getMatriculate() {
        return matriculate;
    }

    public String getBread() {
        return bread;
    }

    public String getModel() {
        return model;
    }

    public String showDates(){
        return "Matricula: " + matriculate + "\nMarca: " + bread + "\nModelo: " + model;
    }
    
}
