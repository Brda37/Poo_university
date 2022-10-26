package PoliformismoEjercicios.Geometry;

public class figure {
    protected float perimetre;
    protected float area;
    protected float volumen;

    public figure(float perimetre, float area, float volumen) {
        this.perimetre = perimetre;
        this.area = area;
        this.volumen = volumen;
    }

    public float getPerimetre() {
        return perimetre;
    }

    public float getArea() {
        return area;
    }

    public float getVolumen() {
        return volumen;
    }

    public String showDates() {
        return "Perimetro: " + perimetre + "\nArea " + area + "\nVolumen: " + volumen;
    }
}