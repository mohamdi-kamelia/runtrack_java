package Jour02.Job12;

public class Combinaison {
    public static void main(String[] args) {
        int count = 0;

        for (int de1 = 1; de1 <= 6; de1++) {
            for (int de2 = 1; de2 <= 6; de2++) {
                for (int de3 = 1; de3 <= 6; de3++) {
                 
                    System.out.println(de1 + ", " + de2 + ", " + de3);
                    count++;
                }
            }
        }

        System.out.println("Nombre total de combinaisons possibles : " + count);
    }
    
}
