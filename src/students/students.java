package students;

public class students {

    int nit;
    String name;
    String lastname;
    String adrress;
    int age;
    int grade;

    public students(int nit, String name, String lastname, String adrress, int age) {
        this.nit = nit;
        this.name = name;
        this.lastname = lastname;
        this.adrress = adrress;
        this.age = age;
    }

    public students(int grade) {
        this.grade = grade;
    }

    public void result() {
        System.out.println("Documento: " + nit);
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastname);
        System.out.println("Dirección: " + adrress);
        System.out.println("Edad: " + age);
    }
    public void result(int grade){
        System.out.println("El grado del estudiante es: " + grade + "°");
    }
}
