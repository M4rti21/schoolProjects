package matriusBasiques;

import java.util.Scanner;

public class GatoRaya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, c;
        for (int t = 0; t < sc.nextInt(); t++) {
            f = sc.nextInt();
            c = sc.nextInt();
            int[][] tauler = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    tauler[i][j] = sc.nextInt();
                }
            }
        }
        sc.close();
    }
}