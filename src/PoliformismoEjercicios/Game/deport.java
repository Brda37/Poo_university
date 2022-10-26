package PoliformismoEjercicios.Game;

public class deport extends game{
    protected String tipo;
    protected int tiempo;
    public deport(String desarrollador, String name, int year, String tipo, int tiempo) {
        super(desarrollador, name, year);
        this.tipo = tipo;
        this.tiempo = tiempo;
    }
    public String getTipo() {
        return tipo;
    }
    public int gettiempo() {
        return tiempo;
    }

    @Override
    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year
        + "\nTipo: " + tipo + "\nTiempo: " + tiempo;
    }
}
