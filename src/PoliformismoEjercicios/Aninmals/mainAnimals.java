package PoliformismoEjercicios.Aninmals;

public class mainAnimals {
    public static void main(String[] args) {
        animals showDates[] = new animals[4];
        showDates[0] = new animals("Condor", "Variado", 3, "Paramos");
        showDates[1] = new cat("Mestizo", "Blanco y negro", 1, "Domesticos", "Felino", 4);
        showDates[2] = new delphin("Rosado", "Rosado", 2, "Rio", "Mamifero", "Redondeado");
        showDates[3] = new worm("Seda", "Blanco", 1, "Selva", "Mori", "Crianza");

        for(animals animals: showDates){
            System.out.println(animals.showDates());
            System.out.println(" ");
        }
    }
}
