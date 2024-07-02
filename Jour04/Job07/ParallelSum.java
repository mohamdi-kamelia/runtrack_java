package Jour04.Job07;

import java.util.Scanner;

public class ParallelSum {
    public static void main(String[] args) throws InterruptedException {
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

        // Diviser le tableau en deux moitiés
        int midPoint = size / 2;

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Créer les threads pour calculer les sommes des deux moitiés
        SumThread thread1 = new SumThread(numbers, 0, midPoint);
        SumThread thread2 = new SumThread(numbers, midPoint, size);

        // Lancer les threads
        thread1.start();
        thread2.start();

        // Attendre que les threads finissent leur exécution
        thread1.join();
        thread2.join();

        // Combiner les résultats des deux threads
        int totalSum = thread1.getSum() + thread2.getSum();

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + durationMs + " ms");

        scanner.close();
    }
}

class SumThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
