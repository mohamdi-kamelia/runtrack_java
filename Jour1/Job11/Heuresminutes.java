package Jour1.Job11;

import java.util.Scanner;

public class Heuresminutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le nombre de minutes
        System.out.print("Veuillez entrer le nombre de minutes : ");
        int totalMinutes = scanner.nextInt();

        // Conversion des minutes en heures et minutes
        int heures = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Affichage du résultat au format HH:MM
        System.out.printf("L'heure est %02d:%02d\n", heures, minutes);

        scanner.close();
    }
}
