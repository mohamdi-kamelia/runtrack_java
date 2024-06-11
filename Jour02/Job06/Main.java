package Jour02.Job06;

public class Main {
    
    public static void main(String[] args) {
        // Variable pour stocker la somme des nombres pairs
        int sommePairs = 0;

        // Utilisation d'une boucle for pour parcourir les nombres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            // Vérifier si le nombre est pair
            if (i % 2 == 0) {
                // Si c'est le cas, ajouter le nombre à la somme
                sommePairs += i;
            }
        }

        // Affichage de la somme des nombres pairs
        System.out.println("La somme des nombres pairs de 1 à 100 est : " + sommePairs);
    }
}
