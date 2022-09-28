package TwentySeven.person;

public class person {

    String name;
    int edad;
    int dni;

    public person(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public person(int dni) {
        this.dni = dni;
    }

    public void run() {
        System.out.println("Soy " + name + " tengo " + edad + " y estoy corriendo una maraton");
    }

    public void dni(int dni) {
        System.out.println("Mi documento es: " + dni);
    }

    public void run(int km) {
        System.out.println("He corriedo " + km + "Km");
    }
}
