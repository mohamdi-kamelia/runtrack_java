package Jour03.Job06;

import java.util.Random;

public class Tableau {
     public static void main(String[] args) {
        int[] tableau = new int[10];

        Random random = new Random();
    
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); 
        }
       
        System.out.print("Les valeurs du tableau sont : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }
    
}
