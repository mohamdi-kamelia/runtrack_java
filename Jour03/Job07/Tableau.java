package Jour03.Job07;

public class Tableau {
    public static void main(String[] args) {
       
        int[][] matrice1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrice2 = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };

        System.out.println("Matrice 1 :");
        afficherMatrice(matrice1);

        int[][] resultat = additionnerMatrices(matrice1, matrice2);

       
        System.out.println("\nRésultat de l'addition de matrice1 et matrice2 :");
        afficherMatrice(resultat);
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] additionnerMatrices(int[][] matrice1, int[][] matrice2) {
        int rows = matrice1.length;
        int cols = matrice1[0].length;
        int[][] resultat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return resultat;
    }
    
}
