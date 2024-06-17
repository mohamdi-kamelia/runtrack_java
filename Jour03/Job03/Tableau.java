package Jour03.Job03;

public class Tableau {
    public static void main(String[] args) {
        String[] noms = {"kamelia", "maysa", "mounir", "jean"};

        System.out.println("Valeur à l'index 1: " + noms[1]);

        noms[2] = "zoé";

        System.out.print("Valeurs du tableau: ");
        for (int i = 0; i < noms.length; i++) {
            System.out.print(noms[i] + " ");
        }
        System.out.println();
    }
    
}
