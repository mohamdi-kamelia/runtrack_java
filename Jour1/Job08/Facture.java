package Jour1.Job08;

public class Facture {
    public static void main(String[] args) {
        // Déclaration et initialisation des variables
        double prix = 49.99;
        int quantite = 3;
        double tarifHT = prix * quantite; // Calcul du montant hors taxe
        
        // Déclaration de la TVA et calcul du montant TTC
        double tva = 0.20; // 20%
        double tarifTTC = tarifHT * (1 + tva); // Calcul du montant TTC
        
        // Affichage des différentes valeurs de la facture
        System.out.println("Montant du produit: " + prix);
        System.out.println("Quantité: " + quantite);
        System.out.println("Montant HT: " + tarifHT);
        System.out.println("TVA (20%): " + (tva * 100) + "%");
        System.out.println("Montant TTC: " + tarifTTC);
    }
    
}
