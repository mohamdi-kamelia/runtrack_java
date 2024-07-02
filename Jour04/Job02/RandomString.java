package Jour04.Job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = scanner.nextInt();

       
        long startTime = System.nanoTime();


        String randomString = generateRandomString(length);

     
        writeStringToFile(randomString);


        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; 

        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }


    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            sb.append(randomChar);
        }

        return sb.toString();
    }
    private static void writeStringToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Jour04/job02/Output.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
    
}
