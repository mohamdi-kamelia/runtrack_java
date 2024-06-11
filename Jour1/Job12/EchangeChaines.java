package Jour1.Job12;
import java.util.Scanner;

public class EchangeChaines {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la première chaîne de caractères
        System.out.print("Veuillez entrer la première chaîne de caractères : ");
        String chaine1 = scanner.nextLine();

        // Demande à l'utilisateur de saisir la deuxième chaîne de caractères
        System.out.print("Veuillez entrer la deuxième chaîne de caractères : ");
        String chaine2 = scanner.nextLine();

        // Affichage des chaînes avant l'échange
        System.out.println("Avant l'échange :");
        System.out.println("chaine1 = " + chaine1);
        System.out.println("chaine2 = " + chaine2);

        // Échange des valeurs sans utiliser de variable supplémentaire
        chaine1 = chaine1 + chaine2; // Concaténation des deux chaînes
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // Extraction de la première chaîne
        chaine1 = chaine1.substring(chaine2.length()); // Extraction de la deuxième chaîne

        // Affichage des chaînes après l'échange
        System.out.println("Après l'échange :");
        System.out.println("chaine1 = " + chaine1);
        System.out.println("chaine2 = " + chaine2);

        // Fermeture du scanner
        scanner.close();
    }
}
