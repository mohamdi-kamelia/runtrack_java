package Jour02.Job06;

public class Main {
    public static void main(String[] args) {
        int sommePairs = 0;
        for (int i = 1; i <= 100; i++) {
        
            if (i % 2 == 0) {
                
                sommePairs += i;
            }
        }
        System.out.println("La somme des nombres pairs de 1 à 100 est : " + sommePairs);
    }
}
