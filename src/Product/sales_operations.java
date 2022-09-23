package Product;

import javax.swing.JOptionPane;

public class sales_operations {
    int article;
    int amount;
    double iva;
    int option;
    int value_product;
    double producWhitIva;
    double result_product;
    double discount;
    double total;

    public void article() {
        article = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del producto: "));
        amount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos comprados:"));
        iva = (double) Integer.parseInt(JOptionPane.showInputDialog("Porcentaje del IVA: "));
    }
    public void option(){
        option = Integer.parseInt(JOptionPane.showInputDialog("Opción de pago: \n 1. Efectivo. \n 2. Debito \n 3. Credito"));
    }
    public void result(){
        if(option == 1){
            value_product = article * amount;
            producWhitIva = (double) value_product * (iva *0.01);
            result_product = (double) value_product + producWhitIva;
            discount = (double) result_product * 0.85;
            System.out.println("Valor neto de la cantidad de productos: " + value_product);
            System.out.println("IVA "+ iva + ": " + producWhitIva);
            System.out.println("Valor sin descuento: "+ result_product);
            System.out.println("Valor con 15% descuento: " +  discount);
        }
        else if(option == 2){
            value_product = article * amount;
            producWhitIva = (double) value_product * (iva *0.01);
            result_product = (double) value_product + producWhitIva;
            discount = (double) result_product * 0.90;
            System.out.println("Valor neto de la cantidad de productos: " + value_product);
            System.out.println("IVA "+ iva + ": " + producWhitIva);
            System.out.println("Valor sin descuento: "+ result_product);
            System.out.println("Valor con 10% descuento: " +  discount);
        }
        else if(option == 3){
            value_product = article * amount;
            producWhitIva = (double) value_product * (iva *0.01);
            result_product = (double) value_product + producWhitIva;
            discount = (double) result_product * 0.95;
            System.out.println("Valor neto de la cantidad de productos: " + value_product);
            System.out.println("IVA "+ iva + ": " + producWhitIva);
            System.out.println("Valor sin descuento: "+ result_product);
            System.out.println("Valor con 5% descuento: " +  discount);
        }
        else{
            System.out.println("Metodo de pago erroneo");
        }
    }
}
