package Triangle;


import javax.swing.JOptionPane;

public class operation_triangle {
    int sideone;
    int sidetwo;
    int sidethree;

    public void integer(){
        sideone = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del primer lado: "));
        sidetwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del segundo lado: "));
        sidethree = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tercer lado: "));
    }
    public void result(){
        if(sideone == sidetwo && sideone == sidethree){
            System.out.println("El triangulo es de tipo equilatero");
        }
        else if(sideone != sidetwo && sideone != sidethree && sidetwo != sidethree){
            System.out.println("El triangulo es de tipo escaleno");
        }
        else if(sideone == sidetwo || sideone == sidethree || sidetwo == sidethree){
            System.out.println("El triangulo es de tipo isoceles");
        }
    }
}
