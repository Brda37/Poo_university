package Area;

import javax.swing.JOptionPane;

public class operation {

    int num1;
    int area;
    int perimetro;

    public void num1() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de cada lado del cuadrado"));
    }

    public void area() {
        area = num1 * num1;
    }

    public void perimetro() {
        perimetro = num1 * 4;
    }

    public void result() {
        System.out.println("El tamaño de cada lado es: " + num1);
        System.out.println("Su area es: " + area);
        System.out.println("Su perimetro es: " + perimetro);
    }
}
