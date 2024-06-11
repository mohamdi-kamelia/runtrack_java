package Jour1.Job14;

public class Somme {
    // Méthode pour calculer la somme de deux nombres et afficher le résultat
    public static void calculerSomme(int nombre1, int nombre2) {
        // Calcul de la somme
        int somme = nombre1 + nombre2;
        
        // Affichage du résultat
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }

    // Méthode principale (main) pour tester la classe Somme
    public static void main(String[] args) {
        // Appel de la méthode calculerSomme avec deux nombres en paramètres
        calculerSomme(4, 12);
    }
}
