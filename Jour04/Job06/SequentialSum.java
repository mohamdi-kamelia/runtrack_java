package Jour04.Job06;
import java.util.Scanner;

public class SequentialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau de nombres : ");
        int size = scanner.nextInt();

        // Initialiser le tableau
        int[] numbers = new int[size];

        // Demander à l'utilisateur de saisir les nombres
        System.out.println("Entrez les nombres : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Calculer la somme des nombres
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est : " + sum);
        System.out.println("Temps d'exécution : " + durationMs + " ms");

        scanner.close();
    }
}

