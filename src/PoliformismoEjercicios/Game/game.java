package PoliformismoEjercicios.Game;

public class game {
    protected String desarrollador;
    protected String name;
    protected int year;

    public game(String desarrollador, String name, int year) {
        this.desarrollador = desarrollador;
        this.name = name;
        this.year = year;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String showDates() {
        return "Desarrollador: " + desarrollador + "\nNombre: " + name + "\nAño: " + year;
    }
}
