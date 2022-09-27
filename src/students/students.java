package students;

public class students {

    int nit;
    String name;
    String lastname;
    String adrress;
    int age;

    public students(int nit, String name, String lastname, String adrress, int age) {
        this.nit = nit;
        this.name = name;
        this.lastname = lastname;
        this.adrress = adrress;
        this.age = age;
    }

    public void result() {
        System.out.println("Documento: " + nit);
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastname);
        System.out.println("Dirección: " + adrress);
        System.out.println("Edad: " + age);
    }
}
