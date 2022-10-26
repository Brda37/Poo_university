package PoliformismoEjercicios.Geometry;

public class triangle extends figure {
    protected String tipo;
    protected String color;
    public triangle(float perimetre, float area, float volumen, String tipo, String color) {
        super(perimetre, area, volumen);
        this.tipo = tipo;
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String showDates(){
        return "Perimetro: " + perimetre + "\nArea " + area + "\nVolumen: " + volumen +
        "\nTipo: " + tipo + "\nColor: " + color;
    }
}
