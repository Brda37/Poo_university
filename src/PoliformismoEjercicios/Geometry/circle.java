package PoliformismoEjercicios.Geometry;

public class circle extends figure{
    protected float radio;
    protected String color;
    public circle(float perimetre, float area, float volumen, float radio, String color) {
        super(perimetre, area, volumen);
        this.radio = radio;
        this.color = color;
    }
    public float getRadio() {
        return radio;
    }
    public String getColor() {
        return color;
    }
    
    @Override
    public String showDates(){
        return "Perimetro: " + perimetre + "\nArea " + area + "\nVolumen: " + volumen +
        "\nRadio: " + radio + "\nColor: " + color;
    }
}
