package Jour03.Job02;

public class Tableaux {
    public static void main(String[] args) {
        int[] monTableau = {12, 6, 76, 89};

        System.out.print("Valeurs initiales du tableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println();

       
        monTableau[0] = 4;
        monTableau[1] = 96;
        monTableau[2] = 43;
        monTableau[3] = 98;


        System.out.print("Nouvelles valeurs du tableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println();
    }
    
}
