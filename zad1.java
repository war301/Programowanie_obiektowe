package pl.edu.uwm.wmii.KuleszaArkadiusz.kolokwiumPO;

import java.util.Scanner;

public class zad1 {
    static void delta(double c, double b){
        double delta= b*b - 4*c*4;
        double x1=0;
        double x2=0;
        double x=0;
        if(delta>0){
            x1+=(-b-Math.sqrt(delta))/(2*c);
            x2+=(-b+Math.sqrt(delta))/(2*c);
            System.out.println(delta);
            System.out.println("Pierwiastki x1:"+ x1+ "i x2:"+ x2);
        }
        else if (delta==0){
            x+=-b/2*c;
            System.out.println("Piewiastek to:"+x);
        }
        else if (delta<0){
            System.out.println("Nie ma rozwiazania");
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double c = input.nextInt();
        Scanner input1= new Scanner(System.in);
        double b = input1.nextInt();
        delta(c,b);
    }
}