package Jour02.Job03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir un chiffre
        System.out.print("Entrez un chiffre : ");
        int chiffre = scanner.nextInt();
        
        // Affichage de la table de multiplication du nombre donné
        System.out.println("Table de multiplication de " + chiffre + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(chiffre + " x " + i + " = " + (chiffre * i));
        }
        
        // Fermeture du scanner pour libérer les ressources
        scanner.close();
    }
    
}
