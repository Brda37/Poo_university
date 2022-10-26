package PoliformismoEjercicios.Game;

public class mainGame {
    public static void main(String[] args) {
        game showDates[] = new game[6];
        showDates[0] = new game("Java", "GTA", 2000);
        showDates[1] = new accion("Python", "Halo", 1998, "Ganar", "Cerrado");
        showDates[2] = new deport("C#", "Fifa", 2003, "Futbol", 90);
        showDates[3] = new simulacion("Java", "Lost", 2015, "Xbox", "Realidad virtual");
        showDates[4] = new aventura("HTML", "Crash Bandicoot", 1996, "Aventura", "Cerrado");
        showDates[5]=  new musica("Python", "Guitar Hero", 2008, "Guitarra", 10);

        for(game game: showDates){
            System.out.println(game.showDates());
            System.out.println(" ");
        }
    }
}
