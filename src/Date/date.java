package Date;

public class date {

    int day;
    String month;
    int year;

    public date(int integerDay, String integerMonth, int integerYear) {
        day = integerDay;
        month = integerMonth;
        year = integerYear;
    }

    public void today() {
        System.out.println("¿Es hoy?");
    }

    public void today(boolean sent) {
        if (sent == true) {
            System.out.println("Si es hoy");
        } else {
            System.out.println("No es hoy");
        }
    }

    public void result() {
        System.out.println("Dia/Mes/Año  " + day + "/" + month + "/" + year);
    }
}
