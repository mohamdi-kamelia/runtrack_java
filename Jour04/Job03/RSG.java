package Jour04.Job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RSG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la longueur de la chaîne
        System.out.print("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = scanner.nextInt();

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length, 80); // 80 caractères par ligne

        // Créer deux threads pour écrire la chaîne dans un fichier
        Thread firstHalfWriter = new Thread(new StringWriter(randomString.substring(0, randomString.length() / 2), "Jour04/job03/output.txt", false));
        Thread secondHalfWriter = new Thread(new StringWriter(randomString.substring(randomString.length() / 2), "Jour04/job03/output.txt", true));

        // Démarrer les threads
        firstHalfWriter.start();
        secondHalfWriter.start();

        try {
            // Attendre la fin des deux threads
            firstHalfWriter.join();
            secondHalfWriter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher le temps d'exécution
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }

    // Méthode pour générer une chaîne de caractères aléatoire de la longueur spécifiée
    private static String generateRandomString(int length, int lineLength) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            sb.append(randomChar);
            if ((i + 1) % lineLength == 0) {
                sb.append('\n'); // Ajouter un retour à la ligne tous les lineLength caractères
            }
        }

        return sb.toString();
    }

    // Classe interne pour écrire une chaîne de caractères dans un fichier
    static class StringWriter implements Runnable {
        private String content;
        private String fileName;
        private boolean append;

        public StringWriter(String content, String fileName, boolean append) {
            this.content = content;
            this.fileName = fileName;
            this.append = append;
        }

        @Override
        public void run() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
