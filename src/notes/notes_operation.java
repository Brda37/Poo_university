package notes;

import javax.swing.JOptionPane;

public class notes_operation {
    double noteone;
    double notetwo;
    double notethree;
    double sum;
    double average;
    public void integerNotes(){
        noteone = (double) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota: "));
        notetwo = (double) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
        notethree = (double) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercer nota: "));
    }
    public void operations(){
        sum = noteone + notetwo + notethree;
        average = sum / 3;
    }
    public void result(){
        if(noteone >5 || notetwo > 5 || notethree > 5){
            System.out.println("Las notas deben estar entre 1 a 5");
        }
        else if(noteone < 1 || notetwo < 1 || notethree < 1){
            System.out.println("Las notas deben estar entre 1 a 5");
        }
        else if(average >= 4.5 && average <=5){
            System.out.println("Felicitaciones");
        }
        else if(average >= 4 && average <4.5){
            System.out.println("Nota Excelente");
        }
        else if(average >=3 && average <4){
            System.out.println("Aceptable");
        }
        else{
            System.out.println("Perdio la asignatura");
        }
    }
}
