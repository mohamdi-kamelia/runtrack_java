package Jour02.Job11;

import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        // Construire le triangle ligne par ligne
        for (int i = 1; i <= hauteur; i++) {
            // Affiche des étoiles pour former le triangle
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Passe à la ligne suivante
            System.out.println();
        }

        scanner.close();
    }
    
}
