package Jour02.Job08;

import java.util.Scanner;

public class Chiffres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
        String numero = scanner.nextLine();

        int nombreDeChiffres = compteChiffres(numero);

        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreDeChiffres);
    }

    public static int compteChiffres(String numero) {
        // Supprimer les caractères non-chiffres
        numero = numero.replaceAll("\\D", "");
        return numero.length();
    }
}
