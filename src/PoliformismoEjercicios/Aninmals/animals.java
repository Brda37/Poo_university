package PoliformismoEjercicios.Aninmals;

public class animals {
    protected String raza;
    protected String color;
    protected float size;
    protected String habitat;

    public animals(String raza, String color, float size, String habitat) {
        this.raza = raza;
        this.color = color;
        this.size = size;
        this.habitat = habitat;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public float getSize() {
        return size;
    }

    public String getHabitat() {
        return habitat;
    }

    public String showDates() {
        return "Raza: " + raza + "\nColor: " + color + "\nTamaño: " +
                size + "\nHabitat: " + habitat;
    }

}
