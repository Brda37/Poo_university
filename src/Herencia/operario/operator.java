package Herencia.operario;

public class operator extends empleoyee{
    private String position;
    private float salario;
    public operator(String name, String lastname, int identification, String position, float salario) {
        super(name, lastname, identification);
        this.position = position;
        this.salario = salario;
    }
    public void showResult(){
        System.out.println("Nombre: " + getName() + "\nApellido: " + getLastname() + "\nCedula: " + getIdentification() + "\nCargo: " + position + "\nSalario: "+ salario);
    }
}