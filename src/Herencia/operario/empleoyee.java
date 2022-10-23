package Herencia.operario;

public class empleoyee{
    private String name;
    private String lastname;
    private int identification;
    public empleoyee(String name, String lastname, int identification) {
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getIdentification() {
        return identification;
    }
    public void setIdentification(int identification) {
        this.identification = identification;
    }
    
}