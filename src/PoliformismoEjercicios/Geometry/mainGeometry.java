package PoliformismoEjercicios.Geometry;

public class mainGeometry {
    public static void main(String[] args) {
        figure showDates[] = new figure[5];
        showDates[0] = new figure(1, 2, 35);
        showDates[1] = new circle(7, 10, 20, 5, "Rojo");
        showDates[2] = new square(20, 50, 80, 4, 4);
        showDates[3] = new rectangle(20, 50, 80, 4, "Azul");
        showDates[4] = new triangle(20, 50, 80, "Equilatero", "Amarillos");

        for (figure figure : showDates) {
            System.out.println(figure.showDates());
            System.out.println(" ");
        }
    }
}