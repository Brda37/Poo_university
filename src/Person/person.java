package Person;

public class person {

    String nombre;
    int edad;

    public person(String name, int year) {
        this.nombre = name;
        this.edad = year;
    }

    public void result() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
