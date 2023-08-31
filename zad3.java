package pl.edu.uwm.wmii.KuleszaArkadiusz.kolokwiumPO;

import java.util.Random;
import java.util.Scanner;

public class zad3 {
    static void fun(int n){
        int pomoc=-1109;
        int ilerazy=0;
        int[] tab=new int[n];
        for (int i = 0; i < tab.length;i++) {
            Random r = new Random();
            int losowa = r.nextInt(2218) - 1109;
            tab[i]=losowa;
        }
        for(int j=0;j<tab.length;j++){
            if(pomoc<tab[j]){
                pomoc=tab[j];
            }
        }
        for(int ij=0;ij<tab.length;ij++){
            if(pomoc==tab[ij]){
                ilerazy++;
            }
        }
        System.out.println("ele.największy= "+pomoc+"ile razy występuje "+ilerazy);
    }
    public static void main(String[] args) {
        int n=0;
        while(1>n || n>150) {
            System.out.println("podaj n");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
        }
        fun(n);
    }
}
