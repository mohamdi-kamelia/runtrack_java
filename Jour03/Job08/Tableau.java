package Jour03.Job08;

import java.util.Arrays;

public class Tableau {
    public static void main(String[] args) {
        int[][] tableau = { {5, 9, 3}, {7, 2, 8}, {1, 6, 4} };

      
        System.out.println("Matrice avant le tri :");
        afficherMatrice(tableau);

        trierMatrice(tableau);

        System.out.println("\nMatrice après le tri :");
        afficherMatrice(tableau);
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void trierMatrice(int[][] matrice) {
      
        for (int i = 0; i < matrice.length; i++) {
            Arrays.sort(matrice[i]);
        }

        
        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length - 1; i++) {
                for (int k = i + 1; k < matrice.length; k++) {
                    if (matrice[i][j] > matrice[k][j]) {
                        
                        int temp = matrice[i][j];
                        matrice[i][j] = matrice[k][j];
                        matrice[k][j] = temp;
                    }
                }
            }
        }
    }
    
}
