package API;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class text extends JFrame{
    public text(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(1300, 250, 600, 600);
    }
    public void showBoxes(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#79A9D1"));
        panel.setLayout(null);

        this.getContentPane().add(panel);

        JTextField caja = new JTextField();
        caja.setBounds(0,50,100, 30);
        panel.add(caja);

        JTextArea area = new JTextArea();
        area.setBounds(0,120,50,50);
        panel.add(area);

        String [] country = {"Colombia", "Brasil", "Paraguay", "Ecuador"};

        JComboBox lista = new JComboBox(country);
        lista.setBounds(0,200,200,20);
        panel.add(lista);



    }
    
}
