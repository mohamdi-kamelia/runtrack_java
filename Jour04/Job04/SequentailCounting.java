package Jour04.Job04;

import java.util.Scanner;

public class SequentailCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Compter de 1 jusqu'au nombre maximum
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(i);
        }

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher le compte total et le temps d'exécution
        System.out.println("Le compte total est de 1 à " + maxNumber);
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }
    
}
