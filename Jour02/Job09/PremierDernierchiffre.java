package Jour02.Job09;

import java.util.Scanner;
public class PremierDernierchiffre {
    public static void main(String[] args) {
        int numero = 1234;
        int dernierChiffre = numero % 10;  // Le dernier chiffre est le reste de la division par 10
        
        int premierChiffre = numero;
        while (premierChiffre >= 10) {
            premierChiffre /= 10;  // Diviser par 10 jusqu'à obtenir le premier chiffre
        }
        
        System.out.println("Le premier chiffre est : " + premierChiffre);
        System.out.println("Le dernier chiffre est : " + dernierChiffre);
    }
}
