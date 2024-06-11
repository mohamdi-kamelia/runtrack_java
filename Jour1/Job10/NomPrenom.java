package Jour1.Job10;

import java.util.Scanner;

public class NomPrenom {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();

        
        System.out.print("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine();

        System.out.println("Bonjour, " + prenom + " " + nom + "!");
        
    
        scanner.close();
    }
}
