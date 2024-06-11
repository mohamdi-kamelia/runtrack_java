package Jour1.Job13;
import java.util.Scanner;

public class AffichageNombres {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Veuillez saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        // Affichage des nombres de 1 à nombre
        System.out.print("Les nombres de 1 à " + nombre + " sont : ");
        for (int i = 1; i <= nombre; i++) {
            System.out.print(i);
            if (i < nombre) {
                System.out.print(", ");
            }
        }
        System.out.println(); 

        scanner.close();
    }
}
