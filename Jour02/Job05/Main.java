package Jour02.Job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();
        
        // Vérification de l'âge et affichage du message approprié
        if (age < 16) {
            System.out.println("Désolé, vous êtes trop jeune pour travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Vous pourriez avoir du mal à trouver un emploi.");
        } else if (age == 67) {
            System.out.println("Vous êtes à l'âge de la retraite.");
        } else {
            System.out.println("Vous pouvez travailler.");
        }
        
        // Fermeture du scanner pour libérer les ressources
        scanner.close();
    }
    
}
