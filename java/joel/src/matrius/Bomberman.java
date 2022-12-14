package matrius;

import java.util.Scanner;

public class Bomberman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        int[][] taula = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                taula[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int punts = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i == x || j == y) {
                    punts += taula[i][j];
                }
            }
        }
        System.out.println(punts);
        sc.close();
    }
}