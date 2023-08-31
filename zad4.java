package pl.edu.uwm.wmii.KuleszaArkadiusz.kolokwiumPO;

import java.util.Scanner;

public class zad4 {
    static void fun(){
        double suma=0;
        System.out.println("podaj ciąg liczbowy");
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();
        String[] str=c.split("");
        for(int i =0;i<str.length-1;i++){
            Integer now=Integer.valueOf(str[i]);
            suma+=now;
        }
        System.out.println(suma/(str.length-1));
    }
    public static void main(String[] args) {
        fun();
    }
}
