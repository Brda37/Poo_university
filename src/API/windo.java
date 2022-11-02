package API;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class windo extends JFrame {
    public windo(){
        //setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocation(100, 500);
        //setLocationRelativeTo(null);
        setBounds(100, 250, 600, 600);
    }
    public void iniciator(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel("",SwingConstants.CENTER);
        etiqueta.setText("Uniagustiniana");
        etiqueta.setBounds(250,0,100,50);
        etiqueta.setForeground(Color.white);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.GRAY);
        panel.add(etiqueta);
        
        JLabel name = new JLabel("", SwingConstants.LEFT);
        name.setText("Nombre: Diego");
        name.setBounds(0,100,120,50);
        name.setForeground(Color.white);
        name.setOpaque(true);
        name.setBackground(Color.GRAY);
        panel.add(name);

        JLabel carrera = new JLabel("", SwingConstants.LEFT);
        carrera.setText("Carrera: Software");
        carrera.setBounds(0,150,120,50);
        carrera.setForeground(Color.white);
        carrera.setOpaque(true);
        carrera.setBackground(Color.GRAY);
        panel.add(carrera);

        JLabel telefono = new JLabel("", SwingConstants.LEFT);
        telefono.setText("Telefono: 32094");
        telefono.setBounds(0,200,120,50);
        telefono.setForeground(Color.white);
        telefono.setOpaque(true);
        telefono.setBackground(Color.GRAY);
        panel.add(telefono);
    }
}
