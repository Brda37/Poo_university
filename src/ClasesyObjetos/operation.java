package ClasesyObjetos;

import javax.swing.JOptionPane;

public class operation {

    int num1;
    int num2;
    int sum;
    int rest;
    int product;
    int div;
    float exponent;

    public void integernumber() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
    }

    public void sum() {
        sum = num1 + num2;
    }

    public void rest() {
        rest = num1 - num2;
    }

    public void product() {
        product = num1 * num2;
    }

    public void div() {
        div = num1 / num2;
    }
    
    public void exponet(){
        exponent = (float) Math.pow(num1, num2);
    }

    public void result() {
        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicación es: " + product);
        System.out.println("La division es: " + div);
        System.out.println("La Potencia es: " + exponent);
    }
}
