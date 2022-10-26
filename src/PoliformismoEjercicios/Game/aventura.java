package PoliformismoEjercicios.Game;

public class aventura extends game{
    protected String tipo;
    protected String mapa;
    
    public aventura(String desarrollador, String name, int year, String tipo, String mapa) {
        super(desarrollador, name, year);
        this.tipo = tipo;
        this.mapa = mapa;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMapa() {
        return mapa;
    }

    @Override
    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year
        + "\nTipo " + tipo + "\nMapa: " + mapa;
    }
}
