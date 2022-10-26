package PoliformismoEjercicios.Game;

public class accion extends game{
    protected String objetivo;
    protected String mapa;
    public accion(String desarrollador, String name, int year, String objetivo, String mapa) {
        super(desarrollador, name, year);
        this.objetivo = objetivo;
        this.mapa = mapa;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public String getMapa() {
        return mapa;
    }
    
    @Override
    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year
        + "\nObjetivo: " + objetivo + "\nMapa: " + mapa;
    }
}
