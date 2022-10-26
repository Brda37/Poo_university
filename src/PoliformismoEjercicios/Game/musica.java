package PoliformismoEjercicios.Game;

public class musica extends game{
    protected String tipo;
    protected int time;
    public musica(String desarrollador, String name, int year, String tipo, int time) {
        super(desarrollador, name, year);
        this.tipo = tipo;
        this.time = time;
    }
    public String getTipo() {
        return tipo;
    }
    public int getTime() {
        return time;
    }

    @Override
    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year
        + "\nTipo: " + tipo + "\nTiempo: " + time;
    }
}
