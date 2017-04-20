package domowe;

import java.util.Scanner;

public class PoleTrojkata {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz długość pierwszego boku: ");
        double a = s.nextDouble();

        System.out.println("Wpisz długość drugiego boku: ");
        double b = s.nextDouble();

        System.out.println("Wpisz długość trzeciego boku: ");
        double c = s.nextDouble();

        PoleTrojkata pt = new PoleTrojkata();
        if(pt.sprawdzenieTrojkata(a, b, c)) {
            double pole = pt.kalkulatorPola(a,b,c);
            pole = Math.round(pole*100)/100.0;
            System.out.println("Pole = " + pole);
        }else {
            System.out.println("Wpisane boki nie utworzą trójkąta!");
        }
    }

    private double kalkulatorPola(double a, double b, double c) {
    double p = (a+b+c)/2;      
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private boolean sprawdzenieTrojkata(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
	}
    }
}
