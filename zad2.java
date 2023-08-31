package pl.edu.uwm.wmii.KuleszaArkadiusz.kolokwiumPO;

import java.util.Scanner;

public class zad2 {
    static void wyświetl(int tab[]){
        for(int i =0;i<tab.length;i++){
            if(i%2==0){
                System.out.println(tab[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] tab=new int[10];
        for(int i =0;i<10;i++) {
            Scanner input = new Scanner(System.in);
            int c = input.nextInt();
            tab[i]=c;
        }
        wyświetl(tab);
    }
}
