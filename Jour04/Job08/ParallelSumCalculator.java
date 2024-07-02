package Jour04.Job08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelSumCalculator {
    private static final int NUM_THREADS = 10;
    private static final long RANGE = 10_000_000;

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<SumTask>> futures = new ArrayList<>();

        long chunkSize = RANGE / NUM_THREADS;

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_THREADS; i++) {
            long start = i * chunkSize + 1;
            long end = (i + 1) * chunkSize;
            SumTask task = new SumTask(start, end);
            futures.add(executor.submit(task, task));
        }

        long totalSum = 0;
        for (Future<SumTask> future : futures) {
            totalSum += future.get().getSum();
        }

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + durationMs + " ms");

        executor.shutdown();
    }
}
