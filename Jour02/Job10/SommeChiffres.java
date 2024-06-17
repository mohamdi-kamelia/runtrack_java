package Jour02.Job10;

public class SommeChiffres {
    public static void main(String[] args) {
        int numero = 1234;
        int somme = 0;
        
        // Boucle pour additionner chaque chiffre
        while (numero > 0) {
            somme += numero % 10;  
            numero /= 10;          
        }
        
        System.out.println("La somme des chiffres est : " + somme);
    }
    
}
