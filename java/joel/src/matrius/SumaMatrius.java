package matrius;

import java.util.Scanner;

public class SumaMatrius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] taula = new int[k][k];
        int[][] taula2 = new int[k][k];
        fillMatrix(taula, sc);
        fillMatrix(taula2, sc);
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                taula[i][j] += taula2[i][j];
            }
        }
        printMatrix(taula);
        sc.close();
    }

    public static void fillMatrix(int[][] mtx, Scanner sc) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                mtx[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] mtx) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}