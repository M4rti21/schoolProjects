package matriusBasiques;

import java.util.Scanner;

public class MatriuITransposada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] marcat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i - j == 0) {
                    marcat[i][j] = 1;
                } else {
                    marcat[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(marcat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}