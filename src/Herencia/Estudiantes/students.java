package Herencia.Estudiantes;
public class students extends person{
    private int codeStudent;
    private float noteAll;
    public students(String name, String lastname, int year, int codeStudent, float noteAll) {
        super(name, lastname, year);
        this.codeStudent = codeStudent;
        this.noteAll = noteAll;
    }
    public void showResult(){
        System.out.println("Nombre " + getName() + "\nApellido: " + getLastname() + "\nEdad: " + getYear() + "\nCodigo estudiante: " + codeStudent + "\nNota final: " + noteAll);
    }
}