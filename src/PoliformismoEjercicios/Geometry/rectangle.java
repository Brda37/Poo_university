package PoliformismoEjercicios.Geometry;

public class rectangle  extends figure{
    protected int vertices;
    protected String color;
    
    

    public rectangle(float perimetre, float area, float volumen, int vertices, String color) {
        super(perimetre, area, volumen);
        this.vertices = vertices;
        this.color = color;
    }
    public int getVertices() {
        return vertices;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String showDates(){
        return "Perimetro: " + perimetre + "\nArea " + area + "\nVolumen: " + volumen +
        "\nVertice: " + vertices + "\nColor: " + color;
    }
}

