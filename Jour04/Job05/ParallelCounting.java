package Jour04.Job05;

import java.util.Scanner;

public class ParallelCounting {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        // Diviser le nombre maximum en deux plages égales
        int midPoint = maxNumber / 2;

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Créer les threads pour compter les plages de nombres
        CountingThread thread1 = new CountingThread(1, midPoint);
        CountingThread thread2 = new CountingThread(midPoint + 1, maxNumber);

        // Lancer les threads
        thread1.start();
        thread2.start();

        // Attendre que les threads finissent leur exécution
        thread1.join();
        thread2.join();

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher le compte de chaque thread et le temps d'exécution
        System.out.println("Thread 1 a compté de 1 à " + midPoint + ", total: " + thread1.getCount());
        System.out.println("Thread 2 a compté de " + (midPoint + 1) + " à " + maxNumber + ", total: " + thread2.getCount());
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }
}
