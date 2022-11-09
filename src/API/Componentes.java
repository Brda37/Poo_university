package API;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Componentes extends JFrame {
    public Componentes(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700, 250, 600, 600);
    }
    public void compenents(){

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#79A9D1"));
        panel.setLayout(null);

        this.getContentPane().add(panel);
        
        JButton oneButton = new JButton();
        oneButton.setText("Click");
        oneButton.setBounds(230, 50, 100, 50);
        oneButton.setBackground(Color.black);
        oneButton.setForeground(Color.white);
        panel.add(oneButton);

        JRadioButton radioButtonOne = new JRadioButton("Opcion 1", false);
        radioButtonOne.setBackground(Color.decode("#4A8EC6"));
        radioButtonOne.setBounds(100, 150, 100, 50);
        panel.add(radioButtonOne);

        JRadioButton radioButtonTwo = new JRadioButton("Opcion 2", false);
        radioButtonTwo.setBackground(Color.decode("#4A8EC6"));
        radioButtonTwo.setBounds(100, 200, 100, 50);
        panel.add(radioButtonTwo);

        JRadioButton radioButtonThree = new JRadioButton("Opcion 3", false);
        radioButtonThree.setBackground(Color.decode("#4A8EC6"));
        radioButtonThree.setBounds(100, 250, 100, 50);
        panel.add(radioButtonThree);

        ButtonGroup groupRadioOptions = new ButtonGroup();
        groupRadioOptions.add(radioButtonOne);
        groupRadioOptions.add(radioButtonTwo);
        groupRadioOptions.add(radioButtonThree);

        JCheckBox checksOne = new JCheckBox("Ingles");
        checksOne.setBackground(Color.decode("#C64A4A"));
        checksOne.setBounds(350, 150, 100, 50);
        panel.add(checksOne);

        JCheckBox checksTwo = new JCheckBox("Frances");
        checksTwo.setBackground(Color.decode("#C64A4A"));
        checksTwo.setBounds(350, 200, 100, 50);
        panel.add(checksTwo);

        JCheckBox checksThree = new JCheckBox("Aleman");
        checksThree.setBackground(Color.decode("#C64A4A"));
        checksThree.setBounds(350, 250, 100, 50);
        panel.add(checksThree);
    }
}
