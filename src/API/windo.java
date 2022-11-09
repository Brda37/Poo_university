package API;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class windo extends JFrame {
    public windo(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 250, 600, 600);
    }
    public void name(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#A22A36"));
        panel.setLayout(null);

        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel("",SwingConstants.CENTER);
        etiqueta.setText("Uniagustiniana");
        etiqueta.setBounds(0,0,600,50);
        etiqueta.setForeground(Color.white);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.GRAY);
        panel.add(etiqueta);
        
        JLabel name = new JLabel("", SwingConstants.LEFT);
        name.setText("Nombre: Diego Bernal");
        name.setBounds(0,100,200,50);
        name.setForeground(Color.white);
        name.setOpaque(true);
        name.setBackground(Color.GRAY);
        panel.add(name);

        JLabel carrera = new JLabel("", SwingConstants.LEFT);
        carrera.setText("Carrera: Desarrollo Software");
        carrera.setBounds(0,150,200,50);
        carrera.setForeground(Color.white);
        carrera.setOpaque(true);
        carrera.setBackground(Color.GRAY);
        panel.add(carrera);

        JLabel telefono = new JLabel("", SwingConstants.LEFT);
        telefono.setText("Telefono: 313131313");
        telefono.setBounds(0,200,200,50);
        telefono.setForeground(Color.white);
        telefono.setOpaque(true);
        telefono.setBackground(Color.GRAY);
        panel.add(telefono);
    }

}
