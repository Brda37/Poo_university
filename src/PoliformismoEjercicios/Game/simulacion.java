package PoliformismoEjercicios.Game;

public class simulacion extends game {
    protected String consola;
    protected String tipo;

    public simulacion(String desarrollador, String name, int year, String consola, String tipo) {
        super(desarrollador, name, year);
        this.consola = consola;
        this.tipo = tipo;
    }

    public String getConsola() {
        return consola;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year
        + "\nConsola: " + consola + "\nTipo: " + tipo;
    }
}
