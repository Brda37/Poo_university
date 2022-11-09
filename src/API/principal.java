package API;

public class principal {
    public static void main(String[] args) {
        windo show = new windo();
        Componentes showComponentes = new Componentes();
        text showText = new text();

        show.setVisible(true);
        show.name();

        showComponentes.setVisible(true);
        showComponentes.compenents();

        showText.setVisible(true);
        showText.showBoxes();
    }
}
