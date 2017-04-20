package domowe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PoleTrojkata2 {
    public static void main(String[] args) {
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("Wpisz długość pierwszego boku: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Wpisz długość drugiego boku: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Wpisz długość trzeciego boku: "));

        PoleTrojkata2 pt = new PoleTrojkata2();
        if(pt.sprawdzenieTrojkata(a, b, c)) {
            double pole = pt.kalkulatorPola(a,b,c);
            pole = Math.round(pole*100)/100.0;
            JOptionPane.showMessageDialog(null, "Pole = " + pole);
        }else {
            JOptionPane.showMessageDialog(null, "Wpisane boki nie utworzą trójkąta!");
        }
    }

    private double kalkulatorPola(double a, double b, double c) {
    double p = (a+b+c)/2;      
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private boolean sprawdzenieTrojkata(double a, double b, double c) {
        return ((a+b)>c && (a+c)>b && (b+c)>a);
    }
}
