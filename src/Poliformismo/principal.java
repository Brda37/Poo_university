package Poliformismo;

public class principal {
    public static void main(String[] args) {
        vehiculo show[] = new vehiculo[4];

        show[0] = new vehiculo("ASV518", "Ferrari", "A89");
        show[1] = new vehiculoDeportivo("HDW842", "Toyota", "KJ8", 1000);
        show[2] = new vehiculoFurgoneta("GWQ813", "Toyota", "J9", 2000);
        show[3] = new vehiculoTurismo("LIU151", "Audi", "P14", 6);

        for(vehiculo vehiculo: show){
            System.out.println(vehiculo.showDates());
            System.out.println(" ");
        }
    }
}
