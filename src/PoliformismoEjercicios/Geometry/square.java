package PoliformismoEjercicios.Geometry;

public class square extends figure {
    protected int lados;
    protected int puntos;

    public square(float perimetre, float area, float volumen, int lados, int puntos) {
        super(perimetre, area, volumen);
        this.lados = lados;
        this.puntos = puntos;
    }

    public int getLados() {
        return lados;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String showDates(){
        return "Perimetro: " + perimetre + "\nArea " + area + "\nVolumen: " + volumen +
        "\nLados: " + lados + "\nPuntos: " + puntos;
    }
}

