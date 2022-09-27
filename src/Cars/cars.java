
package Cars;

public class cars {
    String placa;
    String color;
    String marca;
    int cilindraje;
    int year;
    public cars(String placa, String color, String marca, int cilindraje, int year){
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.year = year;
    }
    public void result(){
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Año: " + year);
    }
}

