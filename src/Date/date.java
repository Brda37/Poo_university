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

    public void result() {
        System.out.println("Dia/Mes/Año  " + day + "/" + month + "/" + year);
    }
}
