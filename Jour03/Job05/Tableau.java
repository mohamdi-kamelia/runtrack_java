package Jour03.Job05;

import java.util.HashSet;
import java.util.Set;

public class Tableau {
     public static void main(String[] args) {
        int[] tableau = {6, 2, 3, 4, 8, 7, 0};

        Set<Integer> valeursUniques = new HashSet<>();

        for (int valeur : tableau) {
            valeursUniques.add(valeur);
        }

        System.out.println("Les valeurs uniques du tableau sont : " + valeursUniques);
    }
    
}
